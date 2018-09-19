
package Entities.Purchases;

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

@Entity
@Table(name = "receiving_report")
public class ReceivingReport {
    
    private int id;
    private String rrNo;
    BigDecimal totalAmount;
    private Date deliverDate;
    private String receivingWarehouse;
    private String preparedBy;
    private String checkedBy;
    private String approvedBy;
    
    private PurchaseOrder purchaseOrder;
    private Set<ItemDelivery> itemDeliveries = new HashSet<>();

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="RR_id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="RR_no")
    public String getRrNo() {
        return rrNo;
    }

    public void setRrNo(String rrNo) {
        this.rrNo = rrNo;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="deliver_date")
    public Date getDeliverDate() {
        return deliverDate;
    }

    public void setDeliverDate(Date deliverDate) {
        this.deliverDate = deliverDate;
    }

    @Column(name="receiving_warehouse")
    public String getReceivingWarehouse() {
        return receivingWarehouse;
    }

    public void setReceivingWarehouse(String receivingWarehouse) {
        this.receivingWarehouse = receivingWarehouse;
    }

    @Column(name="prepared_by")
    public String getPreparedBy() {
        return preparedBy;
    }

    public void setPreparedBy(String preparedBy) {
        this.preparedBy = preparedBy;
    }

    @Column(name="checked_by")
    public String getCheckedBy() {
        return checkedBy;
    }

    public void setCheckedBy(String checkedBy) {
        this.checkedBy = checkedBy;
    }

    @Column(name="approved_by")
    public String getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "po_no")
    public PurchaseOrder getPurchaseOrder() {
        return purchaseOrder;
    }

    public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }

    @OneToMany(mappedBy = "receivingReport", cascade = CascadeType.ALL)
    public Set<ItemDelivery> getItemDeliveries() {
        return itemDeliveries;
    }

    public void setItemDeliveries(Set<ItemDelivery> itemDeliveries) {
        this.itemDeliveries = itemDeliveries;
    }
    
    public void addItemDelivery(ItemDelivery itemDelivery) {
        this.itemDeliveries.add(itemDelivery);
    }
}
