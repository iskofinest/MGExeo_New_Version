
package Entities.Purchases;

import Entities.Material;
import java.math.BigDecimal;
import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "material_purchase")
@AssociationOverrides({
    @AssociationOverride(name = "materialPurchaseId.material",
        joinColumns = @JoinColumn(name = "material_id")),
    @AssociationOverride(name = "materialPurchaseId.purchaseOrder",
        joinColumns = @JoinColumn(name = "po_id")) })
public class MaterialPurchase {
    
    MaterialPurchaseId materialPurchaseId = new MaterialPurchaseId();
    
    private int quantity;
    private BigDecimal unitPrice;
    private String currency;
    private BigDecimal totalCost;

    @EmbeddedId
    public MaterialPurchaseId getMaterialPurchaseId() {
        return materialPurchaseId;
    }

    public void setMaterialPurchaseId(MaterialPurchaseId materialPurchaseId) {
        this.materialPurchaseId = materialPurchaseId;
    }
    
    @Transient
    public Material getMaterial() {
        return getMaterialPurchaseId().getMaterial();
    }

    public void setMaterial(Material material) {
        getMaterialPurchaseId().setMaterial(material);
    }
    
    @Transient
    public PurchaseOrder getPurchaseOrder() {
        return getMaterialPurchaseId().getPurchaseOrder();
    }
    
    public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
        getMaterialPurchaseId().setPurchaseOrder(purchaseOrder);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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
    
    
    
}
