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
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="benefit_vendor_xref", indexes={@Index(name="benefitVendorXrefUnBnftVndrXrfBenpkgId", columnList="ben_id,pkg_id", unique=true)})
public class BenefitVendorXref implements Serializable {

    /** Primary key. */
    protected static final String PK = "benefitVendorXrefId";

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
    @Column(name="benefit_vendor_xref_id", unique=true, nullable=false, precision=16)
    private BigDecimal benefitVendorXrefId;
    @Column(name="pkg_id", nullable=false, precision=16)
    private BigDecimal pkgId;
    @Column(name="asset_type_id", precision=3)
    private BigDecimal assetTypeId;
    @Column(name="user_created", nullable=false, length=200)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=200)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @ManyToOne
    @JoinColumn(name="assign_sr_type_id")
    private LovValue lovValue5;
    @ManyToOne(optional=false)
    @JoinColumn(name="ben_id", nullable=false)
    private Benefit benefit;
    @ManyToOne
    @JoinColumn(name="renew_sr_subtype_id")
    private LovValue lovValue4;
    @ManyToOne
    @JoinColumn(name="renew_sr_type_id")
    private LovValue lovValue3;
    @ManyToOne
    @JoinColumn(name="resend_sr_subtype_id")
    private LovValue lovValue2;
    @ManyToOne
    @JoinColumn(name="resend_sr_type_id")
    private LovValue lovValue;
    @ManyToOne(optional=false)
    @JoinColumn(name="vendor_id", nullable=false)
    private Vendor vendor;

    /** Default constructor. */
    public BenefitVendorXref() {
        super();
    }

    /**
     * Access method for benefitVendorXrefId.
     *
     * @return the current value of benefitVendorXrefId
     */
    public BigDecimal getBenefitVendorXrefId() {
        return benefitVendorXrefId;
    }

    /**
     * Setter method for benefitVendorXrefId.
     *
     * @param aBenefitVendorXrefId the new value for benefitVendorXrefId
     */
    public void setBenefitVendorXrefId(BigDecimal aBenefitVendorXrefId) {
        benefitVendorXrefId = aBenefitVendorXrefId;
    }

    /**
     * Access method for pkgId.
     *
     * @return the current value of pkgId
     */
    public BigDecimal getPkgId() {
        return pkgId;
    }

    /**
     * Setter method for pkgId.
     *
     * @param aPkgId the new value for pkgId
     */
    public void setPkgId(BigDecimal aPkgId) {
        pkgId = aPkgId;
    }

    /**
     * Access method for assetTypeId.
     *
     * @return the current value of assetTypeId
     */
    public BigDecimal getAssetTypeId() {
        return assetTypeId;
    }

    /**
     * Setter method for assetTypeId.
     *
     * @param aAssetTypeId the new value for assetTypeId
     */
    public void setAssetTypeId(BigDecimal aAssetTypeId) {
        assetTypeId = aAssetTypeId;
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
     * Access method for lovValue5.
     *
     * @return the current value of lovValue5
     */
    public LovValue getLovValue5() {
        return lovValue5;
    }

    /**
     * Setter method for lovValue5.
     *
     * @param aLovValue5 the new value for lovValue5
     */
    public void setLovValue5(LovValue aLovValue5) {
        lovValue5 = aLovValue5;
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
     * Access method for lovValue4.
     *
     * @return the current value of lovValue4
     */
    public LovValue getLovValue4() {
        return lovValue4;
    }

    /**
     * Setter method for lovValue4.
     *
     * @param aLovValue4 the new value for lovValue4
     */
    public void setLovValue4(LovValue aLovValue4) {
        lovValue4 = aLovValue4;
    }

    /**
     * Access method for lovValue3.
     *
     * @return the current value of lovValue3
     */
    public LovValue getLovValue3() {
        return lovValue3;
    }

    /**
     * Setter method for lovValue3.
     *
     * @param aLovValue3 the new value for lovValue3
     */
    public void setLovValue3(LovValue aLovValue3) {
        lovValue3 = aLovValue3;
    }

    /**
     * Access method for lovValue2.
     *
     * @return the current value of lovValue2
     */
    public LovValue getLovValue2() {
        return lovValue2;
    }

    /**
     * Setter method for lovValue2.
     *
     * @param aLovValue2 the new value for lovValue2
     */
    public void setLovValue2(LovValue aLovValue2) {
        lovValue2 = aLovValue2;
    }

    /**
     * Access method for lovValue.
     *
     * @return the current value of lovValue
     */
    public LovValue getLovValue() {
        return lovValue;
    }

    /**
     * Setter method for lovValue.
     *
     * @param aLovValue the new value for lovValue
     */
    public void setLovValue(LovValue aLovValue) {
        lovValue = aLovValue;
    }

    /**
     * Access method for vendor.
     *
     * @return the current value of vendor
     */
    public Vendor getVendor() {
        return vendor;
    }

    /**
     * Setter method for vendor.
     *
     * @param aVendor the new value for vendor
     */
    public void setVendor(Vendor aVendor) {
        vendor = aVendor;
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
     * Compares the key for this instance with another BenefitVendorXref.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class BenefitVendorXref and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof BenefitVendorXref)) {
            return false;
        }
        BenefitVendorXref that = (BenefitVendorXref) other;
        Object myBenefitVendorXrefId = this.getBenefitVendorXrefId();
        Object yourBenefitVendorXrefId = that.getBenefitVendorXrefId();
        if (myBenefitVendorXrefId==null ? yourBenefitVendorXrefId!=null : !myBenefitVendorXrefId.equals(yourBenefitVendorXrefId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another BenefitVendorXref.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof BenefitVendorXref)) return false;
        return this.equalKeys(other) && ((BenefitVendorXref)other).equalKeys(this);
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
        if (getBenefitVendorXrefId() == null) {
            i = 0;
        } else {
            i = getBenefitVendorXrefId().hashCode();
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
        StringBuffer sb = new StringBuffer("[BenefitVendorXref |");
        sb.append(" benefitVendorXrefId=").append(getBenefitVendorXrefId());
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
        ret.put("benefitVendorXrefId", getBenefitVendorXrefId());
        return ret;
    }

}
