
package Entities.Purchases;

import Entities.Project;
import Entities.Supplier;
import Entities.User;
import java.math.BigDecimal;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "purchase_order")
public class PurchaseOrder {
    
    private int id;
    private String poNo;
    private Date poDate;
    private Date deliveryDate;
    private String deliveryPlace;
    private String termOfPayment;
    private BigDecimal totalAmount;
    
    private Supplier supplier;
    private Project project;
    
    private User createdBy;
    private Date createdAt;
    private User updatedBy;
    private Date updatedAt;
    
    private Set<ItemOrder> itemOrders = new HashSet<>();
    private Set<MaterialPurchase> materialPurchases = new HashSet<>();

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="po_id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPoNo() {
        return poNo;
    }

    public void setPoNo(String poNo) {
        this.poNo = poNo;
    }

    @Temporal(TemporalType.DATE)
    public Date getPoDate() {
        return poDate;
    }

    public void setPoDate(Date poDate) {
        this.poDate = poDate;
    }

    @Temporal(TemporalType.DATE)
    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getDeliveryPlace() {
        return deliveryPlace;
    }

    public void setDeliveryPlace(String deliveryPlace) {
        this.deliveryPlace = deliveryPlace;
    }

    public String getTermOfPayment() {
        return termOfPayment;
    }

    public void setTermOfPayment(String termOfPayment) {
        this.termOfPayment = termOfPayment;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "supplier_id")
    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "project_id")
    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "createdBy_id")
    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    @Temporal(TemporalType.DATE)
    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "updatedBy_id")
    public User getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(User updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Temporal(TemporalType.DATE)
    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @OneToMany(mappedBy = "materialPurchaseId.purchaseOrder",
            cascade = CascadeType.ALL)
    public Set<MaterialPurchase> getMaterialPurchases() {
        return materialPurchases;
    }

    public void setMaterialPurchases(Set<MaterialPurchase> materialPurchases) {
        this.materialPurchases = materialPurchases;
    }
    
    public void addMaterialPurchase(MaterialPurchase materialPurchase) {
        this.materialPurchases.add(materialPurchase);
    }

    @OneToMany(mappedBy = "purchaseOrder", cascade = CascadeType.ALL)
    public Set<ItemOrder> getItemOrders() {
        return itemOrders;
    }

    public void setItemOrders(Set<ItemOrder> itemOrders) {
        this.itemOrders = itemOrders;
    }
    
    public void addItemOrder(ItemOrder itemOrder) {
        this.itemOrders.add(itemOrder);
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }
    
    @Transient
    public int getDailyNumber() {
        String po = getPoNo();
        int number = Integer.parseInt(po.substring(po.indexOf("-") + 1));
        return number;
    }
    
}
