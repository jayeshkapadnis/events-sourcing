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

@Entity(name="benefit_rule")
public class BenefitRule implements Serializable {

    /** Primary key. */
    protected static final String PK = "benefitRuleId";

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
    @Column(name="benefit_rule_id", unique=true, nullable=false, precision=16)
    private BigDecimal benefitRuleId;
    @Column(name="max_times_allowed", nullable=false, precision=9)
    private BigDecimal maxTimesAllowed;
    @Column(name="min_waiting_period_days", nullable=false, precision=9)
    private BigDecimal minWaitingPeriodDays;
    @Column(name="user_created", nullable=false, length=50)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=50)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @Column(name="recur_days", precision=10)
    private BigDecimal recurDays;
    @Column(name="apply_rule_at_membership", nullable=false, precision=1)
    private BigDecimal applyRuleAtMembership;
    @ManyToOne(optional=false)
    @JoinColumn(name="ben_id", nullable=false)
    private Benefit benefit;
    @ManyToOne(optional=false)
    @JoinColumn(name="benefit_count_rule_id", nullable=false)
    private BenefitCountRule benefitCountRule;
    @ManyToOne(optional=false)
    @JoinColumn(name="pkg_id", nullable=false)
    private Package package_;

    /** Default constructor. */
    public BenefitRule() {
        super();
    }

    /**
     * Access method for benefitRuleId.
     *
     * @return the current value of benefitRuleId
     */
    public BigDecimal getBenefitRuleId() {
        return benefitRuleId;
    }

    /**
     * Setter method for benefitRuleId.
     *
     * @param aBenefitRuleId the new value for benefitRuleId
     */
    public void setBenefitRuleId(BigDecimal aBenefitRuleId) {
        benefitRuleId = aBenefitRuleId;
    }

    /**
     * Access method for maxTimesAllowed.
     *
     * @return the current value of maxTimesAllowed
     */
    public BigDecimal getMaxTimesAllowed() {
        return maxTimesAllowed;
    }

    /**
     * Setter method for maxTimesAllowed.
     *
     * @param aMaxTimesAllowed the new value for maxTimesAllowed
     */
    public void setMaxTimesAllowed(BigDecimal aMaxTimesAllowed) {
        maxTimesAllowed = aMaxTimesAllowed;
    }

    /**
     * Access method for minWaitingPeriodDays.
     *
     * @return the current value of minWaitingPeriodDays
     */
    public BigDecimal getMinWaitingPeriodDays() {
        return minWaitingPeriodDays;
    }

    /**
     * Setter method for minWaitingPeriodDays.
     *
     * @param aMinWaitingPeriodDays the new value for minWaitingPeriodDays
     */
    public void setMinWaitingPeriodDays(BigDecimal aMinWaitingPeriodDays) {
        minWaitingPeriodDays = aMinWaitingPeriodDays;
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
     * Access method for recurDays.
     *
     * @return the current value of recurDays
     */
    public BigDecimal getRecurDays() {
        return recurDays;
    }

    /**
     * Setter method for recurDays.
     *
     * @param aRecurDays the new value for recurDays
     */
    public void setRecurDays(BigDecimal aRecurDays) {
        recurDays = aRecurDays;
    }

    /**
     * Access method for applyRuleAtMembership.
     *
     * @return the current value of applyRuleAtMembership
     */
    public BigDecimal getApplyRuleAtMembership() {
        return applyRuleAtMembership;
    }

    /**
     * Setter method for applyRuleAtMembership.
     *
     * @param aApplyRuleAtMembership the new value for applyRuleAtMembership
     */
    public void setApplyRuleAtMembership(BigDecimal aApplyRuleAtMembership) {
        applyRuleAtMembership = aApplyRuleAtMembership;
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
     * Access method for benefitCountRule.
     *
     * @return the current value of benefitCountRule
     */
    public BenefitCountRule getBenefitCountRule() {
        return benefitCountRule;
    }

    /**
     * Setter method for benefitCountRule.
     *
     * @param aBenefitCountRule the new value for benefitCountRule
     */
    public void setBenefitCountRule(BenefitCountRule aBenefitCountRule) {
        benefitCountRule = aBenefitCountRule;
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
     * Compares the key for this instance with another BenefitRule.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class BenefitRule and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof BenefitRule)) {
            return false;
        }
        BenefitRule that = (BenefitRule) other;
        Object myBenefitRuleId = this.getBenefitRuleId();
        Object yourBenefitRuleId = that.getBenefitRuleId();
        if (myBenefitRuleId==null ? yourBenefitRuleId!=null : !myBenefitRuleId.equals(yourBenefitRuleId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another BenefitRule.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof BenefitRule)) return false;
        return this.equalKeys(other) && ((BenefitRule)other).equalKeys(this);
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
        if (getBenefitRuleId() == null) {
            i = 0;
        } else {
            i = getBenefitRuleId().hashCode();
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
        StringBuffer sb = new StringBuffer("[BenefitRule |");
        sb.append(" benefitRuleId=").append(getBenefitRuleId());
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
        ret.put("benefitRuleId", getBenefitRuleId());
        return ret;
    }

}
