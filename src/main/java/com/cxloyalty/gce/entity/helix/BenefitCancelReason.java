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
import javax.persistence.Version;

@Entity(name="benefit_cancel_reason")
public class BenefitCancelReason implements Serializable {

    /** Primary key. */
    protected static final String PK = "benefitCancelReasonId";

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
    @Column(name="benefit_cancel_reason_id", unique=true, nullable=false, precision=9)
    private BigDecimal benefitCancelReasonId;
    @Column(name="benefit_cancel_reason_desc", length=200)
    private String benefitCancelReasonDesc;
    @Column(name="user_created", nullable=false, length=200)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=200)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;

    /** Default constructor. */
    public BenefitCancelReason() {
        super();
    }

    /**
     * Access method for benefitCancelReasonId.
     *
     * @return the current value of benefitCancelReasonId
     */
    public BigDecimal getBenefitCancelReasonId() {
        return benefitCancelReasonId;
    }

    /**
     * Setter method for benefitCancelReasonId.
     *
     * @param aBenefitCancelReasonId the new value for benefitCancelReasonId
     */
    public void setBenefitCancelReasonId(BigDecimal aBenefitCancelReasonId) {
        benefitCancelReasonId = aBenefitCancelReasonId;
    }

    /**
     * Access method for benefitCancelReasonDesc.
     *
     * @return the current value of benefitCancelReasonDesc
     */
    public String getBenefitCancelReasonDesc() {
        return benefitCancelReasonDesc;
    }

    /**
     * Setter method for benefitCancelReasonDesc.
     *
     * @param aBenefitCancelReasonDesc the new value for benefitCancelReasonDesc
     */
    public void setBenefitCancelReasonDesc(String aBenefitCancelReasonDesc) {
        benefitCancelReasonDesc = aBenefitCancelReasonDesc;
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
     * Compares the key for this instance with another BenefitCancelReason.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class BenefitCancelReason and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof BenefitCancelReason)) {
            return false;
        }
        BenefitCancelReason that = (BenefitCancelReason) other;
        Object myBenefitCancelReasonId = this.getBenefitCancelReasonId();
        Object yourBenefitCancelReasonId = that.getBenefitCancelReasonId();
        if (myBenefitCancelReasonId==null ? yourBenefitCancelReasonId!=null : !myBenefitCancelReasonId.equals(yourBenefitCancelReasonId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another BenefitCancelReason.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof BenefitCancelReason)) return false;
        return this.equalKeys(other) && ((BenefitCancelReason)other).equalKeys(this);
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
        if (getBenefitCancelReasonId() == null) {
            i = 0;
        } else {
            i = getBenefitCancelReasonId().hashCode();
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
        StringBuffer sb = new StringBuffer("[BenefitCancelReason |");
        sb.append(" benefitCancelReasonId=").append(getBenefitCancelReasonId());
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
        ret.put("benefitCancelReasonId", getBenefitCancelReasonId());
        return ret;
    }

}
