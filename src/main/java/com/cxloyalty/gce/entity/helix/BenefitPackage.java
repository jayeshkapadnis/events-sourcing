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
@Table(name="benefit_package", indexes={@Index(name="benefitPackageUidxBenefitPackage", columnList="pkg_id,ben_id,flexible_flag,userpays_flag", unique=true)})
public class BenefitPackage implements Serializable {

    /** Primary key. */
    protected static final String PK = "benPkgId";

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

    @Column(name="display_seq", precision=3)
    private BigDecimal displaySeq;
    @Column(name="user_created", nullable=false, length=30)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=30)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @Id
    @Column(name="ben_pkg_id", unique=true, nullable=false, precision=9)
    private BigDecimal benPkgId;
    @Column(name="flexible_flag", length=1)
    private String flexibleFlag;
    @Column(name="active_flag", nullable=false, length=1)
    private String activeFlag;
    @Column(name="is_default_flexible_benefit", nullable=false, precision=1)
    private BigDecimal isDefaultFlexibleBenefit;
    @Column(name="supplier_reference_name", length=100)
    private String supplierReferenceName;
    @Column(name="primary_only", precision=1)
    private BigDecimal primaryOnly;
    @Column(name="userpays_flag", length=1)
    private String userpaysFlag;
    @ManyToOne(optional=false)
    @JoinColumn(name="pkg_id", nullable=false)
    private Package package_;
    @ManyToOne(optional=false)
    @JoinColumn(name="ben_id", nullable=false)
    private Benefit benefit;
    @OneToMany(mappedBy="benefitPackage")
    private Set<BenefitPackageBundle> benefitPackageBundle;
    @OneToMany(mappedBy="benefitPackage")
    private Set<UserpaysDetail> userpaysDetail;

    /** Default constructor. */
    public BenefitPackage() {
        super();
    }

    /**
     * Access method for displaySeq.
     *
     * @return the current value of displaySeq
     */
    public BigDecimal getDisplaySeq() {
        return displaySeq;
    }

    /**
     * Setter method for displaySeq.
     *
     * @param aDisplaySeq the new value for displaySeq
     */
    public void setDisplaySeq(BigDecimal aDisplaySeq) {
        displaySeq = aDisplaySeq;
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
     * Access method for benPkgId.
     *
     * @return the current value of benPkgId
     */
    public BigDecimal getBenPkgId() {
        return benPkgId;
    }

    /**
     * Setter method for benPkgId.
     *
     * @param aBenPkgId the new value for benPkgId
     */
    public void setBenPkgId(BigDecimal aBenPkgId) {
        benPkgId = aBenPkgId;
    }

    /**
     * Access method for flexibleFlag.
     *
     * @return the current value of flexibleFlag
     */
    public String getFlexibleFlag() {
        return flexibleFlag;
    }

    /**
     * Setter method for flexibleFlag.
     *
     * @param aFlexibleFlag the new value for flexibleFlag
     */
    public void setFlexibleFlag(String aFlexibleFlag) {
        flexibleFlag = aFlexibleFlag;
    }

    /**
     * Access method for activeFlag.
     *
     * @return the current value of activeFlag
     */
    public String getActiveFlag() {
        return activeFlag;
    }

    /**
     * Setter method for activeFlag.
     *
     * @param aActiveFlag the new value for activeFlag
     */
    public void setActiveFlag(String aActiveFlag) {
        activeFlag = aActiveFlag;
    }

    /**
     * Access method for isDefaultFlexibleBenefit.
     *
     * @return the current value of isDefaultFlexibleBenefit
     */
    public BigDecimal getIsDefaultFlexibleBenefit() {
        return isDefaultFlexibleBenefit;
    }

    /**
     * Setter method for isDefaultFlexibleBenefit.
     *
     * @param aIsDefaultFlexibleBenefit the new value for isDefaultFlexibleBenefit
     */
    public void setIsDefaultFlexibleBenefit(BigDecimal aIsDefaultFlexibleBenefit) {
        isDefaultFlexibleBenefit = aIsDefaultFlexibleBenefit;
    }

    /**
     * Access method for supplierReferenceName.
     *
     * @return the current value of supplierReferenceName
     */
    public String getSupplierReferenceName() {
        return supplierReferenceName;
    }

    /**
     * Setter method for supplierReferenceName.
     *
     * @param aSupplierReferenceName the new value for supplierReferenceName
     */
    public void setSupplierReferenceName(String aSupplierReferenceName) {
        supplierReferenceName = aSupplierReferenceName;
    }

    /**
     * Access method for primaryOnly.
     *
     * @return the current value of primaryOnly
     */
    public BigDecimal getPrimaryOnly() {
        return primaryOnly;
    }

    /**
     * Setter method for primaryOnly.
     *
     * @param aPrimaryOnly the new value for primaryOnly
     */
    public void setPrimaryOnly(BigDecimal aPrimaryOnly) {
        primaryOnly = aPrimaryOnly;
    }

    /**
     * Access method for userpaysFlag.
     *
     * @return the current value of userpaysFlag
     */
    public String getUserpaysFlag() {
        return userpaysFlag;
    }

    /**
     * Setter method for userpaysFlag.
     *
     * @param aUserpaysFlag the new value for userpaysFlag
     */
    public void setUserpaysFlag(String aUserpaysFlag) {
        userpaysFlag = aUserpaysFlag;
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
     * Access method for benefit.
     *
     * @return the current value of benefit
     */
    public Benefit getBenefit() {
        return benefit;
    }

    /**
     * Setter method for benefit.
     *
     * @param aBenefit the new value for benefit
     */
    public void setBenefit(Benefit aBenefit) {
        benefit = aBenefit;
    }

    /**
     * Access method for benefitPackageBundle.
     *
     * @return the current value of benefitPackageBundle
     */
    public Set<BenefitPackageBundle> getBenefitPackageBundle() {
        return benefitPackageBundle;
    }

    /**
     * Setter method for benefitPackageBundle.
     *
     * @param aBenefitPackageBundle the new value for benefitPackageBundle
     */
    public void setBenefitPackageBundle(Set<BenefitPackageBundle> aBenefitPackageBundle) {
        benefitPackageBundle = aBenefitPackageBundle;
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
     * Gets the group fragment benId for member benefit.
     *
     * @return Current value of the group fragment
     * @see Benefit
     */
    public BigDecimal getBenefitBenId() {
        return (getBenefit() == null ? null : getBenefit().getBenId());
    }

    /**
     * Sets the group fragment benId from member benefit.
     *
     * @param aBenId New value for the group fragment
     * @see Benefit
     */
    public void setBenefitBenId(BigDecimal aBenId) {
        if (getBenefit() != null) {
            getBenefit().setBenId(aBenId);
        }
    }

    /**
     * Compares the key for this instance with another BenefitPackage.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class BenefitPackage and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof BenefitPackage)) {
            return false;
        }
        BenefitPackage that = (BenefitPackage) other;
        Object myBenPkgId = this.getBenPkgId();
        Object yourBenPkgId = that.getBenPkgId();
        if (myBenPkgId==null ? yourBenPkgId!=null : !myBenPkgId.equals(yourBenPkgId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another BenefitPackage.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof BenefitPackage)) return false;
        return this.equalKeys(other) && ((BenefitPackage)other).equalKeys(this);
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
        if (getBenPkgId() == null) {
            i = 0;
        } else {
            i = getBenPkgId().hashCode();
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
        StringBuffer sb = new StringBuffer("[BenefitPackage |");
        sb.append(" benPkgId=").append(getBenPkgId());
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
        ret.put("benPkgId", getBenPkgId());
        return ret;
    }

}
