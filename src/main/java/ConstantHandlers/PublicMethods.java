
package ConstantHandlers;

import Entities.Department;
import Entities.Project;
import Entities.Supplier;
import Forms.MMD.AddPurchaseOrder;
import Panels.CreateAccountPanel;
import Panels.CreateDepartmentPanel;
import Panels.CreateProjectPanel;
import Panels.CreateSupplierPanel;
import java.awt.Frame;
import javax.swing.JDialog;

public class PublicMethods {
    
    public static Project addProject(Frame frame) {
        Project project;
        CreateProjectPanel createProjectPanel = new CreateProjectPanel(frame);
        final JDialog dialog = new JDialog(frame, "Create Project", true);
        dialog.getContentPane().add(createProjectPanel);
        dialog.setSize(475, 300);
        dialog.setLocationRelativeTo(frame);
        dialog.setVisible(true);
        project = createProjectPanel.getProject();
        return project;
    }
    
    public static Department addDepartment(Frame frame) {
        Department department = null;
        System.out.println("TITLE: " + frame.getTitle());
        CreateDepartmentPanel createDepartment = new CreateDepartmentPanel();
//        final JDialog dialog = new JDialog(frame, "Add Department", true);
        final JDialog dialog = new JDialog(frame, "Add Department", true);
        dialog.getContentPane().add(createDepartment);
        dialog.setSize(475, 300);
        dialog.setLocationRelativeTo(frame);
        dialog.setVisible(true);
        department = createDepartment.getDepartment();
        return department;
    }
    
    public static void addAccount(Frame frame) {
        final JDialog dialog = new JDialog(frame, "Add Account", true);
        CreateAccountPanel createAccountPanel = new CreateAccountPanel(frame);
        dialog.getContentPane().add(createAccountPanel);
        dialog.setSize(1000, 315);
        dialog.setLocationRelativeTo(frame);
        dialog.setVisible(true);
    }

    public static Supplier addSupplier(Frame frame) {
        Supplier supplier = null;
        CreateSupplierPanel createSupplierPanel = new CreateSupplierPanel();
        final JDialog dialog = new JDialog(frame, "Create Supplier", true);
        dialog.getContentPane().add(createSupplierPanel);
        dialog.setSize(540, 476);
        dialog.setLocationRelativeTo(frame);
        dialog.setVisible(true);
        supplier = createSupplierPanel.getSupplier();
        return supplier;
    }
    
}
