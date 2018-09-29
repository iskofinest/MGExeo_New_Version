
package Services;

import Entities.Project;
import Entities.Purchases.WithdrawalReport;
import Entities.User;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class WithdrawalReportService {
    
    public static boolean save(WithdrawalReport withdrawalReport) {
        Session session = Utilities.HibernateUtil.getSessionFactory().openSession();
        try{
            Transaction tx = session.beginTransaction();
            System.out.print(session.save(withdrawalReport) + " withdrawalReport saved inside method");
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

    public static List<WithdrawalReport> findAll() {
        Session session = Utilities.HibernateUtil.getSessionFactory().openSession();
        List list = session.createQuery("from WithdrawalReport order by withdrawalDate").list();
        session.close();
        return list; 
    }

    public static List<WithdrawalReport> findBy(Project project, User requisitioner, Date dateFrom, Date dateTo) {
        List<WithdrawalReport> withdrawalReports;
        String hql = "SELECT wr FROM WithdrawalReport wr WHERE "
                + "wr.withdrawalDate>=:dateFrom AND wr.withdrawalDate<=:dateTo ";
        if(project != null) hql += "AND wr.project=:project ";
        if(requisitioner != null) hql += "AND wr.requestedBy=:requisitioner";
        Session session = Utilities.HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery(hql);
        query.setDate("dateFrom", dateFrom);
        query.setDate("dateTo", dateTo);
        if(project != null) query.setParameter("project", project);
        if(requisitioner != null) query.setParameter("requisitioner", requisitioner);
        withdrawalReports = query.list();
        session.close();
        return withdrawalReports;
    }

    public static WithdrawalReport findById(int wrId) {
        WithdrawalReport withdrawalReport;
        String hql = "SELECT wr FROM WithdrawalReport wr LEFT JOIN FETCH wr.itemRequests WHERE wr.id=" + wrId;
        Session session = Utilities.HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery(hql);
        withdrawalReport = (WithdrawalReport)query.list().get(0);
//        System.out.println(withdrawalReport.toString());
        session.close();
        return withdrawalReport;
    }
    
}
