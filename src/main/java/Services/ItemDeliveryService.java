
package Services;

import Entities.Purchases.ItemDelivery;
import Entities.Purchases.ItemOrder;
import Entities.Purchases.PurchaseOrder;
import Entities.Purchases.ReceivingReport;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ItemDeliveryService {

    public static boolean save(ItemDelivery itemDelivery) {
        Session session = Utilities.HibernateUtil.getSessionFactory().openSession();
        try{
            Transaction tx = session.beginTransaction();
            System.out.print(session.save(itemDelivery) + " ItemDelivery saved inside method");
            tx.commit();
        } catch(Exception e) {
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, e.toString(), "ERROR OCCURED", 0);
            return false;
        } finally {
            session.close();
        }
        return true;
    }

    static List<ItemDelivery> findByItemOrder(ItemOrder itemOrder) {
        List<ItemDelivery> itemDeliveries;
        Session session = Utilities.HibernateUtil.getSessionFactory().openSession();
        String hql = "SELECT itemDelivery FROM ItemDelivery itemDelivery WHERE itemDelivery.itemOrder=:itemOrder";
        Query query = session.createQuery(hql);
        query.setParameter("itemOrder", itemOrder);
        itemDeliveries = query.list();
        session.close();
        return itemDeliveries;
    }

    public static List<ItemDelivery> findByRR(ReceivingReport receivingReport) {
        List<ItemDelivery> itemDeliveries;
        Session session = Utilities.HibernateUtil.getSessionFactory().openSession();
        String hql = "SELECT itemDelivery FROM ItemDelivery itemDelivery WHERE itemDelivery.receivingReport=:receivingReport";
        Query query = session.createQuery(hql);
        query.setParameter("receivingReport", receivingReport);
        itemDeliveries = query.list();
        session.close();
        return itemDeliveries;
    }
    
}
