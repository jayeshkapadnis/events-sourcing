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
@Table(name="cash_back_rule", indexes={@Index(name="cashBackRuleUnCashBackRule", columnList="sol_template_id,cash_back_incentive_sysid", unique=true)})
public class CashBackRule implements Serializable {

    /** Primary key. */
    protected static final String PK = "cashBackRuleId";

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
    @Column(name="cash_back_rule_id", unique=true, nullable=false, precision=10)
    private BigDecimal cashBackRuleId;
    @Column(name="sol_template_id", nullable=false, precision=10)
    private BigDecimal solTemplateId;
    @Column(name="cash_back_pct", nullable=false, precision=10)
    private BigDecimal cashBackPct;
    @Column(name="cash_back_limit_amt", nullable=false, precision=10)
    private BigDecimal cashBackLimitAmt;
    @Column(name="active_flag", nullable=false, length=1)
    private String activeFlag;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_created", nullable=false, length=200)
    private String userCreated;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @Column(name="user_modified", length=200)
    private String userModified;
    @Column(name="process_days", precision=10)
    private BigDecimal processDays;
    @Column(name="precalculate_payment_flag", nullable=false, precision=1)
    private BigDecimal precalculatePaymentFlag;
    @ManyToOne
    @JoinColumn(name="cash_back_frequency")
    private LovValue lovValue2;
    @ManyToOne(optional=false)
    @JoinColumn(name="cash_back_incentive_sysid", nullable=false)
    private LovValue lovValue;

    /** Default constructor. */
    public CashBackRule() {
        super();
    }

    /**
     * Access method for cashBackRuleId.
     *
     * @return the current value of cashBackRuleId
     */
    public BigDecimal getCashBackRuleId() {
        return cashBackRuleId;
    }

    /**
     * Setter method for cashBackRuleId.
     *
     * @param aCashBackRuleId the new value for cashBackRuleId
     */
    public void setCashBackRuleId(BigDecimal aCashBackRuleId) {
        cashBackRuleId = aCashBackRuleId;
    }

    /**
     * Access method for solTemplateId.
     *
     * @return the current value of solTemplateId
     */
    public BigDecimal getSolTemplateId() {
        return solTemplateId;
    }

    /**
     * Setter method for solTemplateId.
     *
     * @param aSolTemplateId the new value for solTemplateId
     */
    public void setSolTemplateId(BigDecimal aSolTemplateId) {
        solTemplateId = aSolTemplateId;
    }

    /**
     * Access method for cashBackPct.
     *
     * @return the current value of cashBackPct
     */
    public BigDecimal getCashBackPct() {
        return cashBackPct;
    }

    /**
     * Setter method for cashBackPct.
     *
     * @param aCashBackPct the new value for cashBackPct
     */
    public void setCashBackPct(BigDecimal aCashBackPct) {
        cashBackPct = aCashBackPct;
    }

    /**
     * Access method for cashBackLimitAmt.
     *
     * @return the current value of cashBackLimitAmt
     */
    public BigDecimal getCashBackLimitAmt() {
        return cashBackLimitAmt;
    }

    /**
     * Setter method for cashBackLimitAmt.
     *
     * @param aCashBackLimitAmt the new value for cashBackLimitAmt
     */
    public void setCashBackLimitAmt(BigDecimal aCashBackLimitAmt) {
        cashBackLimitAmt = aCashBackLimitAmt;
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
     * Access method for processDays.
     *
     * @return the current value of processDays
     */
    public BigDecimal getProcessDays() {
        return processDays;
    }

    /**
     * Setter method for processDays.
     *
     * @param aProcessDays the new value for processDays
     */
    public void setProcessDays(BigDecimal aProcessDays) {
        processDays = aProcessDays;
    }

    /**
     * Access method for precalculatePaymentFlag.
     *
     * @return the current value of precalculatePaymentFlag
     */
    public BigDecimal getPrecalculatePaymentFlag() {
        return precalculatePaymentFlag;
    }

    /**
     * Setter method for precalculatePaymentFlag.
     *
     * @param aPrecalculatePaymentFlag the new value for precalculatePaymentFlag
     */
    public void setPrecalculatePaymentFlag(BigDecimal aPrecalculatePaymentFlag) {
        precalculatePaymentFlag = aPrecalculatePaymentFlag;
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
     * Gets the group fragment lovValueSysid for member lovValue.
     *
     * @return Current value of the group fragment
     * @see LovValue
     */
    public BigDecimal getLovValueLovValueSysid() {
        return (getLovValue() == null ? null : getLovValue().getLovValueSysid());
    }

    /**
     * Sets the group fragment lovValueSysid from member lovValue.
     *
     * @param aLovValueSysid New value for the group fragment
     * @see LovValue
     */
    public void setLovValueLovValueSysid(BigDecimal aLovValueSysid) {
        if (getLovValue() != null) {
            getLovValue().setLovValueSysid(aLovValueSysid);
        }
    }

    /**
     * Compares the key for this instance with another CashBackRule.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class CashBackRule and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof CashBackRule)) {
            return false;
        }
        CashBackRule that = (CashBackRule) other;
        Object myCashBackRuleId = this.getCashBackRuleId();
        Object yourCashBackRuleId = that.getCashBackRuleId();
        if (myCashBackRuleId==null ? yourCashBackRuleId!=null : !myCashBackRuleId.equals(yourCashBackRuleId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another CashBackRule.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof CashBackRule)) return false;
        return this.equalKeys(other) && ((CashBackRule)other).equalKeys(this);
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
        if (getCashBackRuleId() == null) {
            i = 0;
        } else {
            i = getCashBackRuleId().hashCode();
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
        StringBuffer sb = new StringBuffer("[CashBackRule |");
        sb.append(" cashBackRuleId=").append(getCashBackRuleId());
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
        ret.put("cashBackRuleId", getCashBackRuleId());
        return ret;
    }

}
