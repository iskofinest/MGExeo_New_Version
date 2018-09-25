
package Entities;

import Entities.Purchases.PurchaseOrder;
import Entities.Purchases.WithdrawalReport;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User implements Serializable {
    
    public static final String EMPLOYEE_ID = "employee_id";
    public static final String USERNAME = "username";
    public static final String PASSWORD = "password";
    public static final String FIRST_NAME = "firstName";
    public static final String MIDDLE_NAME = "middleName";
    public static final String LAST_NAME = "lastName";
    public static final String AUTHORITY = "authority";
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id", nullable=false)
    private int id;
    
    @Column(name="employee_ID", nullable=false)
    private String employee_id;
    
    @Column(name="username", nullable=false)
    private String username;
    
    @Column(name="password", nullable=false)
    private String password;
    
    @Column(name="firstName", length=50, nullable=false)
    private String firstName;
    
    @Column(name="middleName", nullable=false)
    private String middleName;
    
    @Column(name="lastname", length=20, nullable=false)
    private String lastName;
    
    @Column(name="authority", length=20, nullable=false)
    private String authority;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "department_id")
    private Department department;
    
    @OneToMany(mappedBy = "createdBy", cascade = CascadeType.ALL)
    private Set<PurchaseOrder> createdPO = new HashSet<>();
    
    @OneToMany(mappedBy = "updatedBy", cascade = CascadeType.ALL)
    private Set<PurchaseOrder> updatedPO = new HashSet<>();
    
    @OneToMany(mappedBy = "requestedBy", cascade = CascadeType.ALL)
    private Set<WithdrawalReport> withdrawalReports = new HashSet<>();
    
    public User() {}
    
    public User(String employee_id, String username, String password, String firstName, String middleName, String lastName, String authority) {
        this.employee_id = employee_id;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.authority = authority;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
    
    @Override
    public String toString() {
        return "User{" + "id=" + id + ", employee_id=" + employee_id + ", username=" + username + ", password=" + password + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", authority=" + authority + '}';
    }

    public Set<PurchaseOrder> getCreatedPO() {
        return createdPO;
    }

    public void setCreatedPO(Set<PurchaseOrder> createdPO) {
        this.createdPO = createdPO;
    }

    public void addCreatedPO(PurchaseOrder purchaseOrder) {
        this.createdPO.add(purchaseOrder);
    }

    public Set<PurchaseOrder> getUpdatedPO() {
        return updatedPO;
    }

    public void setUpdatedPO(Set<PurchaseOrder> updatedPO) {
        this.updatedPO = updatedPO;
    }
    
    public void addUpdatedPO(PurchaseOrder purchaseOrder) {
        this.updatedPO.add(purchaseOrder);
    }

    public Set<WithdrawalReport> getWithdrawalReports() {
        return withdrawalReports;
    }

    public void setWithdrawalReports(Set<WithdrawalReport> withdrawalReports) {
        this.withdrawalReports = withdrawalReports;
    }
    
    public void addWithdrawalReport(WithdrawalReport withdrawalReport) {
        this.withdrawalReports.add(withdrawalReport);
    }
}
