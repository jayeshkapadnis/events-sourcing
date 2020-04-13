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

@Entity(name="refund_rule")
public class RefundRule implements Serializable {

    /** Primary key. */
    protected static final String PK = "refundRuleId";

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
    @Column(name="refund_rule_id", unique=true, nullable=false, precision=8)
    private BigDecimal refundRuleId;
    @Column(name="refund_rule_desc", length=50)
    private String refundRuleDesc;
    @Column(name="user_created", nullable=false, length=50)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=50)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @OneToMany(mappedBy="refundRule")
    private Set<UpOfferDetail> upOfferDetail;

    /** Default constructor. */
    public RefundRule() {
        super();
    }

    /**
     * Access method for refundRuleId.
     *
     * @return the current value of refundRuleId
     */
    public BigDecimal getRefundRuleId() {
        return refundRuleId;
    }

    /**
     * Setter method for refundRuleId.
     *
     * @param aRefundRuleId the new value for refundRuleId
     */
    public void setRefundRuleId(BigDecimal aRefundRuleId) {
        refundRuleId = aRefundRuleId;
    }

    /**
     * Access method for refundRuleDesc.
     *
     * @return the current value of refundRuleDesc
     */
    public String getRefundRuleDesc() {
        return refundRuleDesc;
    }

    /**
     * Setter method for refundRuleDesc.
     *
     * @param aRefundRuleDesc the new value for refundRuleDesc
     */
    public void setRefundRuleDesc(String aRefundRuleDesc) {
        refundRuleDesc = aRefundRuleDesc;
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
     * Access method for upOfferDetail.
     *
     * @return the current value of upOfferDetail
     */
    public Set<UpOfferDetail> getUpOfferDetail() {
        return upOfferDetail;
    }

    /**
     * Setter method for upOfferDetail.
     *
     * @param aUpOfferDetail the new value for upOfferDetail
     */
    public void setUpOfferDetail(Set<UpOfferDetail> aUpOfferDetail) {
        upOfferDetail = aUpOfferDetail;
    }

    /**
     * Compares the key for this instance with another RefundRule.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class RefundRule and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof RefundRule)) {
            return false;
        }
        RefundRule that = (RefundRule) other;
        Object myRefundRuleId = this.getRefundRuleId();
        Object yourRefundRuleId = that.getRefundRuleId();
        if (myRefundRuleId==null ? yourRefundRuleId!=null : !myRefundRuleId.equals(yourRefundRuleId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another RefundRule.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof RefundRule)) return false;
        return this.equalKeys(other) && ((RefundRule)other).equalKeys(this);
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
        if (getRefundRuleId() == null) {
            i = 0;
        } else {
            i = getRefundRuleId().hashCode();
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
        StringBuffer sb = new StringBuffer("[RefundRule |");
        sb.append(" refundRuleId=").append(getRefundRuleId());
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
        ret.put("refundRuleId", getRefundRuleId());
        return ret;
    }

}
