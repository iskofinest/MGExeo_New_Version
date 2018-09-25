
package Entities.Purchases;

import java.math.BigDecimal;
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
@Table(name = "item_request")
public class ItemRequest {
    
    private int id;
    private String itemCode;
    private String description;
    private int quantity;
    private String unit;
    private BigDecimal unitPrice;
    private String currency;
    private WithdrawalReport withdrawalReport;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="request_id")
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

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "WR_id")
    public WithdrawalReport getWithdrawalReport() {
        return withdrawalReport;
    }

    public void setWithdrawalReport(WithdrawalReport withdrawalReport) {
        this.withdrawalReport = withdrawalReport;
    }
    
    
    
}
