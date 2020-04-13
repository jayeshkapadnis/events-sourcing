// Generated with g9.

package com.cxloyalty.gce.entity.helix;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="flexible_child_package", indexes={@Index(name="flexibleChildPackageUnFlxblChldPkgActprntpkgid", columnList="act_id,parent_pkg_id,child_pkg_id", unique=true)})
public class FlexibleChildPackage implements Serializable {

    /** Primary key. */
    protected static final String PK = "flexibleChildPackageId";

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

    /**
     * Access method for the lockFlag property.
     *
     * @return the current value of the lockFlag property
     */
    public Integer getLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     *
     * @param aLockFlag the new value of the lockFlag property
     */
    public void setLockFlag(Integer aLockFlag) {
        lockFlag = aLockFlag;
    }

    @Id
    @Column(name="flexible_child_package_id", unique=true, nullable=false, precision=16)
    private BigDecimal flexibleChildPackageId;
    @Column(name="is_default", precision=1)
    private BigDecimal isDefault;
    @Column(precision=10, scale=2)
    private BigDecimal cost;
    @Column(name="user_created", nullable=false, length=200)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=200)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @Column(name="display_order_number", precision=4)
    private BigDecimal displayOrderNumber;
    @Column(name="price_description", length=200)
    private String priceDescription;
    @Column(name="insurance_description", length=500)
    private String insuranceDescription;
    @ManyToOne(optional=false)
    @JoinColumn(name="act_id", nullable=false)
    private Account account;
    @ManyToOne(optional=false)
    @JoinColumn(name="child_pkg_id", nullable=false)
    private Package package_2;
    @ManyToOne(optional=false)
    @JoinColumn(name="parent_pkg_id", nullable=false)
    private Package package_;
    @OneToMany(mappedBy="flexibleChildPackage")
    private Set<UserpaysDetail> userpaysDetail;

    /** Default constructor. */
    public FlexibleChildPackage() {
        super();
    }

    /**
     * Access method for flexibleChildPackageId.
     *
     * @return the current value of flexibleChildPackageId
     */
    public BigDecimal getFlexibleChildPackageId() {
        return flexibleChildPackageId;
    }

    /**
     * Setter method for flexibleChildPackageId.
     *
     * @param aFlexibleChildPackageId the new value for flexibleChildPackageId
     */
    public void setFlexibleChildPackageId(BigDecimal aFlexibleChildPackageId) {
        flexibleChildPackageId = aFlexibleChildPackageId;
    }

    /**
     * Access method for isDefault.
     *
     * @return the current value of isDefault
     */
    public BigDecimal getIsDefault() {
        return isDefault;
    }

    /**
     * Setter method for isDefault.
     *
     * @param aIsDefault the new value for isDefault
     */
    public void setIsDefault(BigDecimal aIsDefault) {
        isDefault = aIsDefault;
    }

    /**
     * Access method for cost.
     *
     * @return the current value of cost
     */
    public BigDecimal getCost() {
        return cost;
    }

    /**
     * Setter method for cost.
     *
     * @param aCost the new value for cost
     */
    public void setCost(BigDecimal aCost) {
        cost = aCost;
    }

    /**
     * Access method for userCreated.
     *
     * @return the current value of userCreated
     */
    public String getUserCreated() {
        return userCreated;
    }

    /**
     * Setter method for userCreated.
     *
     * @param aUserCreated the new value for userCreated
     */
    public void setUserCreated(String aUserCreated) {
        userCreated = aUserCreated;
    }

    /**
     * Access method for dateCreated.
     *
     * @return the current value of dateCreated
     */
    public Timestamp getDateCreated() {
        return dateCreated;
    }

    /**
     * Setter method for dateCreated.
     *
     * @param aDateCreated the new value for dateCreated
     */
    public void setDateCreated(Timestamp aDateCreated) {
        dateCreated = aDateCreated;
    }

    /**
     * Access method for userModified.
     *
     * @return the current value of userModified
     */
    public String getUserModified() {
        return userModified;
    }

    /**
     * Setter method for userModified.
     *
     * @param aUserModified the new value for userModified
     */
    public void setUserModified(String aUserModified) {
        userModified = aUserModified;
    }

    /**
     * Access method for dateModified.
     *
     * @return the current value of dateModified
     */
    public Timestamp getDateModified() {
        return dateModified;
    }

    /**
     * Setter method for dateModified.
     *
     * @param aDateModified the new value for dateModified
     */
    public void setDateModified(Timestamp aDateModified) {
        dateModified = aDateModified;
    }

    /**
     * Access method for displayOrderNumber.
     *
     * @return the current value of displayOrderNumber
     */
    public BigDecimal getDisplayOrderNumber() {
        return displayOrderNumber;
    }

    /**
     * Setter method for displayOrderNumber.
     *
     * @param aDisplayOrderNumber the new value for displayOrderNumber
     */
    public void setDisplayOrderNumber(BigDecimal aDisplayOrderNumber) {
        displayOrderNumber = aDisplayOrderNumber;
    }

    /**
     * Access method for priceDescription.
     *
     * @return the current value of priceDescription
     */
    public String getPriceDescription() {
        return priceDescription;
    }

    /**
     * Setter method for priceDescription.
     *
     * @param aPriceDescription the new value for priceDescription
     */
    public void setPriceDescription(String aPriceDescription) {
        priceDescription = aPriceDescription;
    }

    /**
     * Access method for insuranceDescription.
     *
     * @return the current value of insuranceDescription
     */
    public String getInsuranceDescription() {
        return insuranceDescription;
    }

    /**
     * Setter method for insuranceDescription.
     *
     * @param aInsuranceDescription the new value for insuranceDescription
     */
    public void setInsuranceDescription(String aInsuranceDescription) {
        insuranceDescription = aInsuranceDescription;
    }

    /**
     * Access method for account.
     *
     * @return the current value of account
     */
    public Account getAccount() {
        return account;
    }

    /**
     * Setter method for account.
     *
     * @param aAccount the new value for account
     */
    public void setAccount(Account aAccount) {
        account = aAccount;
    }

    /**
     * Access method for package_2.
     *
     * @return the current value of package_2
     */
    public Package getPackage_2() {
        return package_2;
    }

    /**
     * Setter method for package_2.
     *
     * @param aPackage_2 the new value for package_2
     */
    public void setPackage_2(Package aPackage_2) {
        package_2 = aPackage_2;
    }

    /**
     * Access method for package_.
     *
     * @return the current value of package_
     */
    public Package getPackage_() {
        return package_;
    }

    /**
     * Setter method for package_.
     *
     * @param aPackage_ the new value for package_
     */
    public void setPackage_(Package aPackage_) {
        package_ = aPackage_;
    }

    /**
     * Access method for userpaysDetail.
     *
     * @return the current value of userpaysDetail
     */
    public Set<UserpaysDetail> getUserpaysDetail() {
        return userpaysDetail;
    }

    /**
     * Setter method for userpaysDetail.
     *
     * @param aUserpaysDetail the new value for userpaysDetail
     */
    public void setUserpaysDetail(Set<UserpaysDetail> aUserpaysDetail) {
        userpaysDetail = aUserpaysDetail;
    }

    /**
     * Gets the group fragment actId for member account.
     *
     * @return Current value of the group fragment
     * @see Account
     */
    public BigDecimal getAccountActId() {
        return (getAccount() == null ? null : getAccount().getActId());
    }

    /**
     * Sets the group fragment actId from member account.
     *
     * @param aActId New value for the group fragment
     * @see Account
     */
    public void setAccountActId(BigDecimal aActId) {
        if (getAccount() != null) {
            getAccount().setActId(aActId);
        }
    }

    /**
     * Gets the group fragment pkgId for member package_.
     *
     * @return Current value of the group fragment
     * @see Package
     */
    public BigDecimal getPackage_PkgId() {
        return (getPackage_() == null ? null : getPackage_().getPkgId());
    }

    /**
     * Sets the group fragment pkgId from member package_.
     *
     * @param aPkgId New value for the group fragment
     * @see Package
     */
    public void setPackage_PkgId(BigDecimal aPkgId) {
        if (getPackage_() != null) {
            getPackage_().setPkgId(aPkgId);
        }
    }

    /**
     * Gets the group fragment pkgId for member package_2.
     *
     * @return Current value of the group fragment
     * @see Package
     */
    public BigDecimal getPackage_2PkgId() {
        return (getPackage_2() == null ? null : getPackage_2().getPkgId());
    }

    /**
     * Sets the group fragment pkgId from member package_2.
     *
     * @param aPkgId New value for the group fragment
     * @see Package
     */
    public void setPackage_2PkgId(BigDecimal aPkgId) {
        if (getPackage_2() != null) {
            getPackage_2().setPkgId(aPkgId);
        }
    }

    /**
     * Compares the key for this instance with another FlexibleChildPackage.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class FlexibleChildPackage and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof FlexibleChildPackage)) {
            return false;
        }
        FlexibleChildPackage that = (FlexibleChildPackage) other;
        Object myFlexibleChildPackageId = this.getFlexibleChildPackageId();
        Object yourFlexibleChildPackageId = that.getFlexibleChildPackageId();
        if (myFlexibleChildPackageId==null ? yourFlexibleChildPackageId!=null : !myFlexibleChildPackageId.equals(yourFlexibleChildPackageId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another FlexibleChildPackage.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof FlexibleChildPackage)) return false;
        return this.equalKeys(other) && ((FlexibleChildPackage)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        if (getFlexibleChildPackageId() == null) {
            i = 0;
        } else {
            i = getFlexibleChildPackageId().hashCode();
        }
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[FlexibleChildPackage |");
        sb.append(" flexibleChildPackageId=").append(getFlexibleChildPackageId());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("flexibleChildPackageId", getFlexibleChildPackageId());
        return ret;
    }

}
