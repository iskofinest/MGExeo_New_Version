
package Services;

import Entities.Department;
import Entities.Purchases.ReceivingReport;
import Entities.Supplier;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ReceivingReportService {
    
    public static boolean save(ReceivingReport receivingReport) {
        Session session = Utilities.HibernateUtil.getSessionFactory().openSession();
        try{
            Transaction tx = session.beginTransaction();
            System.out.print(session.save(receivingReport) + " ReceivingReport saved inside method");
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

    public static List<ReceivingReport> findAll() {
        Session session = Utilities.HibernateUtil.getSessionFactory().openSession();
        List list = session.createQuery("from ReceivingReport order by withdrawalDate").list();
        session.close();
        return list; 
    }

    public static List<ReceivingReport> findWithSupplier() {
        Session session = Utilities.HibernateUtil.getSessionFactory().openSession();
        String hql = "SELECT rr from ReceivingReport rr LEFT JOIN FETCH rr.purchaseOrder po "
                + "LEFT JOIN FETCH po.supplier";
        
        List<ReceivingReport> receivingReports = session.createQuery(hql).setCacheable(true).list();
        session.close();
        return receivingReports;
        
    }

    public static List<ReceivingReport> findBy(Department department, Supplier supplier, Date dateFrom, Date dateTo) {
        List<ReceivingReport> receivingReports;
        String hql = "SELECT rr FROM ReceivingReport rr WHERE "
                + "rr.deliverDate>=:dateFrom AND rr.deliverDate<=:dateTo ";
        if(department != null) hql +=  "AND rr.purchaseOrder.project.department=:department ";
        if(supplier != null) hql +=  "AND rr.purchaseOrder.supplier=:supplier ";
        Session session = Utilities.HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery(hql);
        if(department != null) query.setParameter("department", department);
        if(supplier != null) query.setParameter("supplier", supplier);
        query.setDate("dateFrom", dateFrom);
        query.setDate("dateTo", dateTo);
        receivingReports = query.list();
        session.close();
        return receivingReports;
    }
    
}
