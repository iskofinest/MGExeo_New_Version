
package Entities.Purchases;

import java.math.BigDecimal;
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
@Table(name = "item_order")
public class ItemOrder {
    
    private int id;
    private String itemCode;
    private String description;
    private int quantity;
    private String unit;
    private BigDecimal unitPrice;
    private String currency;
    private BigDecimal totalCost;
    
    private PurchaseOrder purchaseOrder;
    private Set<ItemDelivery> itemDeliveries = new HashSet<>();

    public ItemOrder() {}

    public ItemOrder(String itemCode, String description, int quantity, String unit, BigDecimal unitPrice, String currency, BigDecimal totalCost) {
        this.itemCode = itemCode;
        this.description = description;
        this.quantity = quantity;
        this.unit = unit;
        this.unitPrice = unitPrice;
        this.currency = currency;
        this.totalCost = totalCost;
    }
    
    

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="order_id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(BigDecimal totalCost) {
        this.totalCost = totalCost;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "po_id")
    public PurchaseOrder getPurchaseOrder() {
        return purchaseOrder;
    }

    public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }

    @OneToMany(mappedBy = "itemOrder", cascade = CascadeType.ALL)
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
