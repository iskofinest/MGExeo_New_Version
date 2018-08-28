
package Entities;

import Entities.Purchases.PurchaseOrder;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "suppliers")
public class Supplier {

    private int id;
    private String code;
    private String name;
    private String address;
    private String telephone;
    private String email;
    private String contactPerson;
    private String tinNo;
    private String faxNo;
    
    private Set<PurchaseOrder> purchaseOrders = new HashSet<>();
    
    public Supplier() {
    }

    public Supplier(String code, String name, String address, String telephone, String email, String contactPerson, String tinNo, String faxNo) {
        this.code = code;
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.email = email;
        this.contactPerson = contactPerson;
        this.tinNo = tinNo;
        this.faxNo = faxNo;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="supplier_id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getTinNo() {
        return tinNo;
    }

    public void setTinNo(String tinNo) {
        this.tinNo = tinNo;
    }

    public String getFaxNo() {
        return faxNo;
    }

    public void setFaxNo(String faxNo) {
        this.faxNo = faxNo;
    }
    
    @Override
    public String toString() {
        return "Supplier{" + "id=" + id + ", code=" + code + ", name=" + name + ", address=" + address + ", telephone=" + telephone + ", email=" + email + ", contactPerson=" + contactPerson + ", tinNo=" + tinNo + ", faxNo=" + faxNo + '}';
    }

    @OneToMany(mappedBy = "supplier", cascade = CascadeType.ALL)
    public Set<PurchaseOrder> getPurchaseOrders() {
        return purchaseOrders;
    }

    public void setPurchaseOrders(Set<PurchaseOrder> purchaseOrders) {
        this.purchaseOrders = purchaseOrders;
    }
    
    public void addPurchseOrder(PurchaseOrder purchaseOrder) {
        this.purchaseOrders.add(purchaseOrder);
    }
    
}
