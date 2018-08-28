
package com.mycompany.mgexeo;

import Entities.Department;
import Entities.Material;
import Entities.Project;
import Entities.Supplier;
import Entities.User;
import Services.DepartmentService;
import Services.MaterialService;
import Services.ProjectService;
import Services.SupplierService;
import Services.UserService;
import Utilities.HibernateUtil;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import org.hibernate.Session;

public class Tests {
    
    static Material material;
    
    
    public static void testUser() {
        User user = new User("admin", 
        "admin",
        "admin",
        "admin",
        "admin",
        "admin",
        "admin");
        System.out.println("USER SAVED: " + UserService.saveUser(user));
        System.out.println("FINISHED");
    }
    
    static Project project;
    
    public static void testProject() {
        project = new Project();
        project.setProjectCode("project code");
        project.setProjectName("project name");
        project.setDateStarted(new Date());
        project.setDateFinished(new Date());
        project.setDateCreated(new Date());
        project.setSpentAmount(BigDecimal.valueOf(Double.parseDouble("12345")));
        project.setTotalBudget(BigDecimal.valueOf(Double.parseDouble("2468")));
        System.out.println("PROJECT SAVED: " + ProjectService.saveProject(project));
    }
    
    public static void testUserDepartment() {
        String code = "001";
        String name = "IT Department";
        Department department = new Department(code, name);
        User user = UserService.findUserById(1);
        user.setDepartment(department);
        if(UserService.updateUser(user)) System.out.println("Department - User updated");
    }
    
    public static void testProjectDepartment() {
        Project project = ProjectService.findProjectById(1);
        Department department = DepartmentService.findDepartmentById(1);
        project.setDepartment(department);
        if(ProjectService.updateProject(project)) System.out.println("Project - Department updated");
    }
    
    public static void test() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.close();
    }
    
}
