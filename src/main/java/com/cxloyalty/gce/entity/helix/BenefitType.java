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
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="benefit_type")
public class BenefitType implements Serializable {

    /** Primary key. */
    protected static final String PK = "benefitTypeId";

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
    @Column(name="benefit_type_id", unique=true, nullable=false, precision=10)
    private BigDecimal benefitTypeId;
    @Column(name="benefit_type_desc", nullable=false, length=100)
    private String benefitTypeDesc;
    @Column(name="user_created", nullable=false, length=30)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=30)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @OneToMany(mappedBy="benefitType")
    private Set<Benefit> benefit;

    /** Default constructor. */
    public BenefitType() {
        super();
    }

    /**
     * Access method for benefitTypeId.
     *
     * @return the current value of benefitTypeId
     */
    public BigDecimal getBenefitTypeId() {
        return benefitTypeId;
    }

    /**
     * Setter method for benefitTypeId.
     *
     * @param aBenefitTypeId the new value for benefitTypeId
     */
    public void setBenefitTypeId(BigDecimal aBenefitTypeId) {
        benefitTypeId = aBenefitTypeId;
    }

    /**
     * Access method for benefitTypeDesc.
     *
     * @return the current value of benefitTypeDesc
     */
    public String getBenefitTypeDesc() {
        return benefitTypeDesc;
    }

    /**
     * Setter method for benefitTypeDesc.
     *
     * @param aBenefitTypeDesc the new value for benefitTypeDesc
     */
    public void setBenefitTypeDesc(String aBenefitTypeDesc) {
        benefitTypeDesc = aBenefitTypeDesc;
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
     * Access method for benefit.
     *
     * @return the current value of benefit
     */
    public Set<Benefit> getBenefit() {
        return benefit;
    }

    /**
     * Setter method for benefit.
     *
     * @param aBenefit the new value for benefit
     */
    public void setBenefit(Set<Benefit> aBenefit) {
        benefit = aBenefit;
    }

    /**
     * Compares the key for this instance with another BenefitType.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class BenefitType and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof BenefitType)) {
            return false;
        }
        BenefitType that = (BenefitType) other;
        Object myBenefitTypeId = this.getBenefitTypeId();
        Object yourBenefitTypeId = that.getBenefitTypeId();
        if (myBenefitTypeId==null ? yourBenefitTypeId!=null : !myBenefitTypeId.equals(yourBenefitTypeId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another BenefitType.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof BenefitType)) return false;
        return this.equalKeys(other) && ((BenefitType)other).equalKeys(this);
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
        if (getBenefitTypeId() == null) {
            i = 0;
        } else {
            i = getBenefitTypeId().hashCode();
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
        StringBuffer sb = new StringBuffer("[BenefitType |");
        sb.append(" benefitTypeId=").append(getBenefitTypeId());
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
        ret.put("benefitTypeId", getBenefitTypeId());
        return ret;
    }

}
