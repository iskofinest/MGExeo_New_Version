
package Services;

import Entities.Purchases.PurchaseOrder;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class PurchaseOrderService {
    
    public static String generatePONo() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MMddyyyy");
        String poNo = sdf.format(date) + "-";
        
        String hql = "SELECT po FROM PurchaseOrder po WHERE po.createdAt=:dateNow";
        Session session = Utilities.HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery(hql);
        query.setDate("dateNow", new Date());
        List<PurchaseOrder> purchaseOrders = query.list();
        if(purchaseOrders.size() > 0) {
            Collections.sort(purchaseOrders, Comparator.comparingInt(PurchaseOrder::getDailyNumber).reversed());
            int number = purchaseOrders.get(0).getDailyNumber() + 1;
            poNo += (number > 10) ?number : "0" + number;
        } else { 
            poNo += "01";
        }
        session.close();
        return poNo;
    }
    
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MMddyyyy");
        System.out.println(sdf.format(date));
        
    }

    public static boolean save(PurchaseOrder purchaseOrder) {
        Session session = Utilities.HibernateUtil.getSessionFactory().openSession();
        try{
            Transaction tx = session.beginTransaction();
            System.out.print(session.save(purchaseOrder) + " PurchaseOrder saved inside method");
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

    public static List<PurchaseOrder> findAll() {
        String hql = "SELECT DISTINCT po FROM PurchaseOrder po LEFT JOIN FETCH po.itemOrders";
        Session session = Utilities.HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery(hql);
        query.setCacheable(true);
        List<PurchaseOrder> purchaseOrders = query.list();      // no ClassCastException here
        session.close();
        return purchaseOrders;
    }
    
}
