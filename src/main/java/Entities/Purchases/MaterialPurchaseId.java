
package Entities.Purchases;

import Entities.Material;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class MaterialPurchaseId implements Serializable {
    
    private PurchaseOrder purchaseOrder;
    private Material material;

    @ManyToOne(cascade = CascadeType.ALL)
    public PurchaseOrder getPurchaseOrder() {
        return purchaseOrder;
    }

    public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
    
}
