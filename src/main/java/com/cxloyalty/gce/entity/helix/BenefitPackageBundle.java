// Generated with g9.

package com.cxloyalty.gce.entity.helix;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="benefit_package_bundle")
public class BenefitPackageBundle implements Serializable {

    /** Primary key. */
    protected static final String PK = "benefitPackageBundleId";

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
    @Column(name="benefit_package_bundle_id", unique=true, nullable=false, precision=16)
    private BigDecimal benefitPackageBundleId;
    @Column(name="bundle_reference_name", nullable=false, length=30)
    private String bundleReferenceName;
    @Column(name="effective_date")
    private Timestamp effectiveDate;
    @Column(name="expiration_date")
    private Timestamp expirationDate;
    @Column(name="user_created", nullable=false, length=200)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=200)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @ManyToOne
    @JoinColumn(name="benefit_package_id")
    private BenefitPackage benefitPackage;
    @ManyToOne
    @JoinColumn(name="pkg_id")
    private Package package_;

    /** Default constructor. */
    public BenefitPackageBundle() {
        super();
    }

    /**
     * Access method for benefitPackageBundleId.
     *
     * @return the current value of benefitPackageBundleId
     */
    public BigDecimal getBenefitPackageBundleId() {
        return benefitPackageBundleId;
    }

    /**
     * Setter method for benefitPackageBundleId.
     *
     * @param aBenefitPackageBundleId the new value for benefitPackageBundleId
     */
    public void setBenefitPackageBundleId(BigDecimal aBenefitPackageBundleId) {
        benefitPackageBundleId = aBenefitPackageBundleId;
    }

    /**
     * Access method for bundleReferenceName.
     *
     * @return the current value of bundleReferenceName
     */
    public String getBundleReferenceName() {
        return bundleReferenceName;
    }

    /**
     * Setter method for bundleReferenceName.
     *
     * @param aBundleReferenceName the new value for bundleReferenceName
     */
    public void setBundleReferenceName(String aBundleReferenceName) {
        bundleReferenceName = aBundleReferenceName;
    }

    /**
     * Access method for effectiveDate.
     *
     * @return the current value of effectiveDate
     */
    public Timestamp getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Setter method for effectiveDate.
     *
     * @param aEffectiveDate the new value for effectiveDate
     */
    public void setEffectiveDate(Timestamp aEffectiveDate) {
        effectiveDate = aEffectiveDate;
    }

    /**
     * Access method for expirationDate.
     *
     * @return the current value of expirationDate
     */
    public Timestamp getExpirationDate() {
        return expirationDate;
    }

    /**
     * Setter method for expirationDate.
     *
     * @param aExpirationDate the new value for expirationDate
     */
    public void setExpirationDate(Timestamp aExpirationDate) {
        expirationDate = aExpirationDate;
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
     * Access method for benefitPackage.
     *
     * @return the current value of benefitPackage
     */
    public BenefitPackage getBenefitPackage() {
        return benefitPackage;
    }

    /**
     * Setter method for benefitPackage.
     *
     * @param aBenefitPackage the new value for benefitPackage
     */
    public void setBenefitPackage(BenefitPackage aBenefitPackage) {
        benefitPackage = aBenefitPackage;
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
     * Compares the key for this instance with another BenefitPackageBundle.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class BenefitPackageBundle and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof BenefitPackageBundle)) {
            return false;
        }
        BenefitPackageBundle that = (BenefitPackageBundle) other;
        Object myBenefitPackageBundleId = this.getBenefitPackageBundleId();
        Object yourBenefitPackageBundleId = that.getBenefitPackageBundleId();
        if (myBenefitPackageBundleId==null ? yourBenefitPackageBundleId!=null : !myBenefitPackageBundleId.equals(yourBenefitPackageBundleId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another BenefitPackageBundle.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof BenefitPackageBundle)) return false;
        return this.equalKeys(other) && ((BenefitPackageBundle)other).equalKeys(this);
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
        if (getBenefitPackageBundleId() == null) {
            i = 0;
        } else {
            i = getBenefitPackageBundleId().hashCode();
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
        StringBuffer sb = new StringBuffer("[BenefitPackageBundle |");
        sb.append(" benefitPackageBundleId=").append(getBenefitPackageBundleId());
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
        ret.put("benefitPackageBundleId", getBenefitPackageBundleId());
        return ret;
    }

}
