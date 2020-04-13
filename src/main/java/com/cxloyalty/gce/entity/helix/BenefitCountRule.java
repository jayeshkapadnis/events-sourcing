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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="benefit_count_rule")
public class BenefitCountRule implements Serializable {

    /** Primary key. */
    protected static final String PK = "benefitCountRuleId";

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
    @Column(name="benefit_count_rule_id", unique=true, nullable=false, precision=16)
    private BigDecimal benefitCountRuleId;
    @Column(name="benefit_count_rule_type_id", nullable=false, precision=16)
    private BigDecimal benefitCountRuleTypeId;
    @Column(name="user_created", nullable=false, length=50)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=50)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @OneToMany(mappedBy="benefitCountRule")
    private Set<BenefitRule> benefitRule;
    @ManyToOne
    @JoinColumn(name="sr_subtype_id")
    private LovValue lovValue2;
    @ManyToOne
    @JoinColumn(name="sr_type_id")
    private LovValue lovValue;

    /** Default constructor. */
    public BenefitCountRule() {
        super();
    }

    /**
     * Access method for benefitCountRuleId.
     *
     * @return the current value of benefitCountRuleId
     */
    public BigDecimal getBenefitCountRuleId() {
        return benefitCountRuleId;
    }

    /**
     * Setter method for benefitCountRuleId.
     *
     * @param aBenefitCountRuleId the new value for benefitCountRuleId
     */
    public void setBenefitCountRuleId(BigDecimal aBenefitCountRuleId) {
        benefitCountRuleId = aBenefitCountRuleId;
    }

    /**
     * Access method for benefitCountRuleTypeId.
     *
     * @return the current value of benefitCountRuleTypeId
     */
    public BigDecimal getBenefitCountRuleTypeId() {
        return benefitCountRuleTypeId;
    }

    /**
     * Setter method for benefitCountRuleTypeId.
     *
     * @param aBenefitCountRuleTypeId the new value for benefitCountRuleTypeId
     */
    public void setBenefitCountRuleTypeId(BigDecimal aBenefitCountRuleTypeId) {
        benefitCountRuleTypeId = aBenefitCountRuleTypeId;
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
     * Access method for benefitRule.
     *
     * @return the current value of benefitRule
     */
    public Set<BenefitRule> getBenefitRule() {
        return benefitRule;
    }

    /**
     * Setter method for benefitRule.
     *
     * @param aBenefitRule the new value for benefitRule
     */
    public void setBenefitRule(Set<BenefitRule> aBenefitRule) {
        benefitRule = aBenefitRule;
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
     * Compares the key for this instance with another BenefitCountRule.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class BenefitCountRule and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof BenefitCountRule)) {
            return false;
        }
        BenefitCountRule that = (BenefitCountRule) other;
        Object myBenefitCountRuleId = this.getBenefitCountRuleId();
        Object yourBenefitCountRuleId = that.getBenefitCountRuleId();
        if (myBenefitCountRuleId==null ? yourBenefitCountRuleId!=null : !myBenefitCountRuleId.equals(yourBenefitCountRuleId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another BenefitCountRule.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof BenefitCountRule)) return false;
        return this.equalKeys(other) && ((BenefitCountRule)other).equalKeys(this);
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
        if (getBenefitCountRuleId() == null) {
            i = 0;
        } else {
            i = getBenefitCountRuleId().hashCode();
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
        StringBuffer sb = new StringBuffer("[BenefitCountRule |");
        sb.append(" benefitCountRuleId=").append(getBenefitCountRuleId());
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
        ret.put("benefitCountRuleId", getBenefitCountRuleId());
        return ret;
    }

}
