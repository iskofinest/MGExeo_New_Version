
package Entities.Purchases;

import Entities.Project;
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

@Entity
@Table(name = "withdrawal")
public class WithdrawalReport {
    
    private int id;
    private String withdrawalNo;
    private Date withdrawalDate;
    private String issuingWarehouse;
    private String truckNo;
    private String containerNo;
    private String location;
    private BigDecimal totalAmount;
    private String preparedBy;
    
    private Set<ItemRequest> itemRequests = new HashSet<>();
    private User requestedBy;
    private Project project;
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="WR_id")
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public String getWithdrawalNo() {
        return withdrawalNo;
    }

    public void setWithdrawalNo(String withdrawalNo) {
        this.withdrawalNo = withdrawalNo;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="withdrawal_date")
    public Date getWithdrawalDate() {
        return withdrawalDate;
    }

    public void setWithdrawalDate(Date withdrawalDate) {
        this.withdrawalDate = withdrawalDate;
    }

    public String getIssuingWarehouse() {
        return issuingWarehouse;
    }

    public void setIssuingWarehouse(String issuingWarehouse) {
        this.issuingWarehouse = issuingWarehouse;
    }

    public String getTruckNo() {
        return truckNo;
    }

    public void setTruckNo(String truckNo) {
        this.truckNo = truckNo;
    }

    public String getContainerNo() {
        return containerNo;
    }

    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getPreparedBy() {
        return preparedBy;
    }

    public void setPreparedBy(String preparedBy) {
        this.preparedBy = preparedBy;
    }

    @OneToMany(mappedBy = "withdrawalReport", cascade = CascadeType.ALL)
    public Set<ItemRequest> getItemRequests() {
        return itemRequests;
    }

    public void setItemRequests(Set<ItemRequest> itemRequests) {
        this.itemRequests = itemRequests;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "requisitioner_id")
    public User getRequestedBy() {
        return requestedBy;
    }

    public void setRequestedBy(User requestedBy) {
        this.requestedBy = requestedBy;
    }
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "project_id")
    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
    
    
    
}
