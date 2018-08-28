
package Services;

import Entities.Department;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DepartmentService {

    public static Department findDepartmentById(int departmentId) {
        Department department;
        Session session = Utilities.HibernateUtil.getSessionFactory().openSession();
        department = (Department) session.get(Department.class, departmentId);
        session.close();
        return department;    
    }
    
    public static List<Department> findAll() {
        Session session = Utilities.HibernateUtil.getSessionFactory().openSession();
        List list = session.createQuery("from Department order by name").list();
        session.close();
        return list; 
    }

    public static List<Department> findAllDepartmentWithProjects() {
        String hql = "from Department";
        Session session = Utilities.HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery(hql);
        List<Department> departments = query.list();
        session.close();
        return departments;
    }

    public static String findDepartmentByProjectName(String projectName) {
        String hql = "Select d.name from Department d left join d.projects p where p.projectName='" + projectName + "'";
        Session session = Utilities.HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery(hql);
        String departmentName = (String) query.list().get(0);
        session.close();
        return departmentName;
    }

    public static boolean saveDepartment(Department department) {
        try{
            Session session = Utilities.HibernateUtil.getSessionFactory().openSession();
            Transaction tx = session.beginTransaction();
            System.out.print(session.save(department) + " Department saved inside method");
            tx.commit();
            session.close();
        } catch(Exception e) {
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, e.toString(), "ERROR OCCURED", 0);
            return false;
        }
        return true;
    }
    
    public static boolean isExisting(String column, String value) {
        boolean existing = false;
        String hql = "SELECT COUNT(d." + column + ") FROM Department d "
                + "WHERE d." + column + "=:value";
        System.out.println("QUERY: " + hql);
//        String hql = "SELECT COUNT(t) FROM ToolStock ts "
//                + "LEFT JOIN ts.tool t WHERE t." + column + "=:value";
        Session session = Utilities.HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery(hql);
        query.setString("value", value);
        existing = Integer.parseInt(query.list().get(0).toString()) > 0;
        System.out.println("COUNT: " + query.list().get(0));
        return existing;
    }
    
}
