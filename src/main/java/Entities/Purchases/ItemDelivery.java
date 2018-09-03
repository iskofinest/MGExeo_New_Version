
package Entities.Purchases;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "item_delivery")
public class ItemDelivery {
    
    private int id;
    private int quantity;
    private ItemOrder itemOrder;
    private ReceivingReport receivingReport;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="item_delivery_id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "itemOrder_id")
    public ItemOrder getItemOrder() {
        return itemOrder;
    }

    public void setItemOrder(ItemOrder itemOrder) {
        this.itemOrder = itemOrder;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "rr_id")
    public ReceivingReport getReceivingReport() {
        return receivingReport;
    }

    public void setReceivingReport(ReceivingReport receivingReport) {
        this.receivingReport = receivingReport;
    }
    
}
