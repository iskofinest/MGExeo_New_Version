
package Entities;

import Entities.Purchases.MaterialPurchase;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "materials")
public class Material {

    private int id;
    private String code;
    private String description;
    private String unit;

    public Material() {
    }

    public Material(String code, String description, String unit) {
        this.code = code;
        this.description = description;
        this.unit = unit;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="material_id")
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name="unit")
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Material{" + "id=" + id + ", code=" + code + ", description=" + description + ", unit=" + unit + '}';
    }

    
}
