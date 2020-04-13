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

@Entity(name="pkg_benefit_attribute")
public class PkgBenefitAttribute implements Serializable {

    /** Primary key. */
    protected static final String PK = "pkgBenAttrId";

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
    @Column(name="pkg_ben_attr_id", unique=true, nullable=false, precision=9)
    private BigDecimal pkgBenAttrId;
    @Column(name="ben_pkg_id", nullable=false, precision=9)
    private BigDecimal benPkgId;
    @Column(name="pkg_ben_attr_value", length=200)
    private String pkgBenAttrValue;
    @Column(name="add_date", nullable=false)
    private Timestamp addDate;
    @Column(name="add_username", nullable=false, length=50)
    private String addUsername;
    @Column(name="update_date")
    private Timestamp updateDate;
    @Column(name="update_username", length=50)
    private String updateUsername;
    @ManyToOne(optional=false)
    @JoinColumn(name="ben_attr_id", nullable=false)
    private BenefitAttribute benefitAttribute;

    /** Default constructor. */
    public PkgBenefitAttribute() {
        super();
    }

    /**
     * Access method for pkgBenAttrId.
     *
     * @return the current value of pkgBenAttrId
     */
    public BigDecimal getPkgBenAttrId() {
        return pkgBenAttrId;
    }

    /**
     * Setter method for pkgBenAttrId.
     *
     * @param aPkgBenAttrId the new value for pkgBenAttrId
     */
    public void setPkgBenAttrId(BigDecimal aPkgBenAttrId) {
        pkgBenAttrId = aPkgBenAttrId;
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
     * Access method for pkgBenAttrValue.
     *
     * @return the current value of pkgBenAttrValue
     */
    public String getPkgBenAttrValue() {
        return pkgBenAttrValue;
    }

    /**
     * Setter method for pkgBenAttrValue.
     *
     * @param aPkgBenAttrValue the new value for pkgBenAttrValue
     */
    public void setPkgBenAttrValue(String aPkgBenAttrValue) {
        pkgBenAttrValue = aPkgBenAttrValue;
    }

    /**
     * Access method for addDate.
     *
     * @return the current value of addDate
     */
    public Timestamp getAddDate() {
        return addDate;
    }

    /**
     * Setter method for addDate.
     *
     * @param aAddDate the new value for addDate
     */
    public void setAddDate(Timestamp aAddDate) {
        addDate = aAddDate;
    }

    /**
     * Access method for addUsername.
     *
     * @return the current value of addUsername
     */
    public String getAddUsername() {
        return addUsername;
    }

    /**
     * Setter method for addUsername.
     *
     * @param aAddUsername the new value for addUsername
     */
    public void setAddUsername(String aAddUsername) {
        addUsername = aAddUsername;
    }

    /**
     * Access method for updateDate.
     *
     * @return the current value of updateDate
     */
    public Timestamp getUpdateDate() {
        return updateDate;
    }

    /**
     * Setter method for updateDate.
     *
     * @param aUpdateDate the new value for updateDate
     */
    public void setUpdateDate(Timestamp aUpdateDate) {
        updateDate = aUpdateDate;
    }

    /**
     * Access method for updateUsername.
     *
     * @return the current value of updateUsername
     */
    public String getUpdateUsername() {
        return updateUsername;
    }

    /**
     * Setter method for updateUsername.
     *
     * @param aUpdateUsername the new value for updateUsername
     */
    public void setUpdateUsername(String aUpdateUsername) {
        updateUsername = aUpdateUsername;
    }

    /**
     * Access method for benefitAttribute.
     *
     * @return the current value of benefitAttribute
     */
    public BenefitAttribute getBenefitAttribute() {
        return benefitAttribute;
    }

    /**
     * Setter method for benefitAttribute.
     *
     * @param aBenefitAttribute the new value for benefitAttribute
     */
    public void setBenefitAttribute(BenefitAttribute aBenefitAttribute) {
        benefitAttribute = aBenefitAttribute;
    }

    /**
     * Compares the key for this instance with another PkgBenefitAttribute.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class PkgBenefitAttribute and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof PkgBenefitAttribute)) {
            return false;
        }
        PkgBenefitAttribute that = (PkgBenefitAttribute) other;
        Object myPkgBenAttrId = this.getPkgBenAttrId();
        Object yourPkgBenAttrId = that.getPkgBenAttrId();
        if (myPkgBenAttrId==null ? yourPkgBenAttrId!=null : !myPkgBenAttrId.equals(yourPkgBenAttrId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another PkgBenefitAttribute.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof PkgBenefitAttribute)) return false;
        return this.equalKeys(other) && ((PkgBenefitAttribute)other).equalKeys(this);
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
        if (getPkgBenAttrId() == null) {
            i = 0;
        } else {
            i = getPkgBenAttrId().hashCode();
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
        StringBuffer sb = new StringBuffer("[PkgBenefitAttribute |");
        sb.append(" pkgBenAttrId=").append(getPkgBenAttrId());
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
        ret.put("pkgBenAttrId", getPkgBenAttrId());
        return ret;
    }

}
