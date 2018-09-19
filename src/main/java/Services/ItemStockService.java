
package Services;

import Entities.ItemStock;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ItemStockService {

    public static boolean save(ItemStock itemStock) {
        if(!isExisting(itemStock)) {
            Session session = Utilities.HibernateUtil.getSessionFactory().openSession();
            try{
                Transaction tx = session.beginTransaction();
                System.out.print(session.save(itemStock) + " ITEM STOCK saved inside method");
                tx.commit();
            } catch(Exception e) {
                System.out.println(e.toString());
                JOptionPane.showMessageDialog(null, e.toString(), "ERROR OCCURED", 0);
                return false;
            } finally {
                session.close();
            }
        } else {
            return addQuantity(itemStock);
        }
        return true;
    }

    private static boolean isExisting(ItemStock itemStock) {
        boolean existing = false;
        String hql = "SELECT COUNT(stock) FROM ItemStock stock WHERE stock=:stock";
        System.out.println("QUERY: " + hql);
        Session session = Utilities.HibernateUtil.getSessionFactory().openSession();
        try {
            Query query = session.createQuery(hql);
            query.setParameter("stock", itemStock);
            existing = Integer.parseInt(query.list().get(0).toString()) > 0;
            System.out.println("COUNT: " + query.list().get(0));
        } catch (Exception ex) {
            ex.printStackTrace();
            
        } finally {
            session.close();
        }
        return existing;
    }

    private static boolean addQuantity(ItemStock is) {
        Session session = Utilities.HibernateUtil.getSessionFactory().openSession();
        ItemStock itemStock = findByItemCode(is.getItemCode());
        itemStock.addQuantity(is.getQuantity());
        Transaction tx = session.beginTransaction();
        session.update(itemStock);
        tx.commit();
        session.close();
        return true;
    }

    private static ItemStock findByItemCode(String itemCode) {
        String hql = "SELECT itemStock FROM ItemStock itemStock WHERE itemStock.itemCode=:itemCode";
        Session session = Utilities.HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery(hql);
        query.setString("itemCode", itemCode);
        ItemStock itemStock = (ItemStock) query.list().get(0);
        session.close();
        return itemStock;
    }

    public static List<ItemStock> findAll() {
        List<ItemStock> itemStocks;
        Session session = Utilities.HibernateUtil.getSessionFactory().openSession();
        String hql = "FROM ItemStock";
        try {
            Query query = session.createQuery(hql);
            itemStocks = query.list();
            return itemStocks;
        } catch(Exception ex) {
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return new ArrayList<>();
        
    }
    
}
