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
@Table(name="lov_value", indexes={@Index(name="lovValueUnLovValue", columnList="lov_sysid,value,parent_value_sysid", unique=true)})
public class LovValue implements Serializable {

    /** Primary key. */
    protected static final String PK = "lovValueSysid";

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
    @Column(name="lov_value_sysid", unique=true, nullable=false, precision=9)
    private BigDecimal lovValueSysid;
    @Column(nullable=false, length=500)
    private String value;
    @Column(name="display_sequence", nullable=false, precision=4)
    private BigDecimal displaySequence;
    @Column(name="add_date", nullable=false)
    private Timestamp addDate;
    @Column(name="add_username", nullable=false, length=50)
    private String addUsername;
    @Column(name="update_date", nullable=false)
    private Timestamp updateDate;
    @Column(name="update_username", nullable=false, length=50)
    private String updateUsername;
    @OneToMany(mappedBy="lovValue2")
    private Set<BenefitCountRule> benefitCountRule2;
    @OneToMany(mappedBy="lovValue")
    private Set<BenefitCountRule> benefitCountRule;
    @OneToMany(mappedBy="lovValue5")
    private Set<BenefitVendorXref> benefitVendorXref5;
    @OneToMany(mappedBy="lovValue4")
    private Set<BenefitVendorXref> benefitVendorXref4;
    @OneToMany(mappedBy="lovValue3")
    private Set<BenefitVendorXref> benefitVendorXref3;
    @OneToMany(mappedBy="lovValue2")
    private Set<BenefitVendorXref> benefitVendorXref2;
    @OneToMany(mappedBy="lovValue")
    private Set<BenefitVendorXref> benefitVendorXref;
    @OneToMany(mappedBy="lovValue2")
    private Set<CashBackRule> cashBackRule2;
    @ManyToOne(optional=false)
    @JoinColumn(name="lov_sysid", nullable=false)
    private Lov lov;
    @OneToMany(mappedBy="lovValue")
    private Set<LovValueOrg> lovValueOrg;
    @OneToMany(mappedBy="lovValue")
    private Set<CashBackRule> cashBackRule;
    @OneToMany(mappedBy="lovValue2")
    private Set<LovValue> lovValue3;
    @ManyToOne
    @JoinColumn(name="parent_value_sysid")
    private LovValue lovValue2;

    /** Default constructor. */
    public LovValue() {
        super();
    }

    /**
     * Access method for lovValueSysid.
     *
     * @return the current value of lovValueSysid
     */
    public BigDecimal getLovValueSysid() {
        return lovValueSysid;
    }

    /**
     * Setter method for lovValueSysid.
     *
     * @param aLovValueSysid the new value for lovValueSysid
     */
    public void setLovValueSysid(BigDecimal aLovValueSysid) {
        lovValueSysid = aLovValueSysid;
    }

    /**
     * Access method for value.
     *
     * @return the current value of value
     */
    public String getValue() {
        return value;
    }

    /**
     * Setter method for value.
     *
     * @param aValue the new value for value
     */
    public void setValue(String aValue) {
        value = aValue;
    }

    /**
     * Access method for displaySequence.
     *
     * @return the current value of displaySequence
     */
    public BigDecimal getDisplaySequence() {
        return displaySequence;
    }

    /**
     * Setter method for displaySequence.
     *
     * @param aDisplaySequence the new value for displaySequence
     */
    public void setDisplaySequence(BigDecimal aDisplaySequence) {
        displaySequence = aDisplaySequence;
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
     * Access method for benefitCountRule2.
     *
     * @return the current value of benefitCountRule2
     */
    public Set<BenefitCountRule> getBenefitCountRule2() {
        return benefitCountRule2;
    }

    /**
     * Setter method for benefitCountRule2.
     *
     * @param aBenefitCountRule2 the new value for benefitCountRule2
     */
    public void setBenefitCountRule2(Set<BenefitCountRule> aBenefitCountRule2) {
        benefitCountRule2 = aBenefitCountRule2;
    }

    /**
     * Access method for benefitCountRule.
     *
     * @return the current value of benefitCountRule
     */
    public Set<BenefitCountRule> getBenefitCountRule() {
        return benefitCountRule;
    }

    /**
     * Setter method for benefitCountRule.
     *
     * @param aBenefitCountRule the new value for benefitCountRule
     */
    public void setBenefitCountRule(Set<BenefitCountRule> aBenefitCountRule) {
        benefitCountRule = aBenefitCountRule;
    }

    /**
     * Access method for benefitVendorXref5.
     *
     * @return the current value of benefitVendorXref5
     */
    public Set<BenefitVendorXref> getBenefitVendorXref5() {
        return benefitVendorXref5;
    }

    /**
     * Setter method for benefitVendorXref5.
     *
     * @param aBenefitVendorXref5 the new value for benefitVendorXref5
     */
    public void setBenefitVendorXref5(Set<BenefitVendorXref> aBenefitVendorXref5) {
        benefitVendorXref5 = aBenefitVendorXref5;
    }

    /**
     * Access method for benefitVendorXref4.
     *
     * @return the current value of benefitVendorXref4
     */
    public Set<BenefitVendorXref> getBenefitVendorXref4() {
        return benefitVendorXref4;
    }

    /**
     * Setter method for benefitVendorXref4.
     *
     * @param aBenefitVendorXref4 the new value for benefitVendorXref4
     */
    public void setBenefitVendorXref4(Set<BenefitVendorXref> aBenefitVendorXref4) {
        benefitVendorXref4 = aBenefitVendorXref4;
    }

    /**
     * Access method for benefitVendorXref3.
     *
     * @return the current value of benefitVendorXref3
     */
    public Set<BenefitVendorXref> getBenefitVendorXref3() {
        return benefitVendorXref3;
    }

    /**
     * Setter method for benefitVendorXref3.
     *
     * @param aBenefitVendorXref3 the new value for benefitVendorXref3
     */
    public void setBenefitVendorXref3(Set<BenefitVendorXref> aBenefitVendorXref3) {
        benefitVendorXref3 = aBenefitVendorXref3;
    }

    /**
     * Access method for benefitVendorXref2.
     *
     * @return the current value of benefitVendorXref2
     */
    public Set<BenefitVendorXref> getBenefitVendorXref2() {
        return benefitVendorXref2;
    }

    /**
     * Setter method for benefitVendorXref2.
     *
     * @param aBenefitVendorXref2 the new value for benefitVendorXref2
     */
    public void setBenefitVendorXref2(Set<BenefitVendorXref> aBenefitVendorXref2) {
        benefitVendorXref2 = aBenefitVendorXref2;
    }

    /**
     * Access method for benefitVendorXref.
     *
     * @return the current value of benefitVendorXref
     */
    public Set<BenefitVendorXref> getBenefitVendorXref() {
        return benefitVendorXref;
    }

    /**
     * Setter method for benefitVendorXref.
     *
     * @param aBenefitVendorXref the new value for benefitVendorXref
     */
    public void setBenefitVendorXref(Set<BenefitVendorXref> aBenefitVendorXref) {
        benefitVendorXref = aBenefitVendorXref;
    }

    /**
     * Access method for cashBackRule2.
     *
     * @return the current value of cashBackRule2
     */
    public Set<CashBackRule> getCashBackRule2() {
        return cashBackRule2;
    }

    /**
     * Setter method for cashBackRule2.
     *
     * @param aCashBackRule2 the new value for cashBackRule2
     */
    public void setCashBackRule2(Set<CashBackRule> aCashBackRule2) {
        cashBackRule2 = aCashBackRule2;
    }

    /**
     * Access method for lov.
     *
     * @return the current value of lov
     */
    public Lov getLov() {
        return lov;
    }

    /**
     * Setter method for lov.
     *
     * @param aLov the new value for lov
     */
    public void setLov(Lov aLov) {
        lov = aLov;
    }

    /**
     * Access method for lovValueOrg.
     *
     * @return the current value of lovValueOrg
     */
    public Set<LovValueOrg> getLovValueOrg() {
        return lovValueOrg;
    }

    /**
     * Setter method for lovValueOrg.
     *
     * @param aLovValueOrg the new value for lovValueOrg
     */
    public void setLovValueOrg(Set<LovValueOrg> aLovValueOrg) {
        lovValueOrg = aLovValueOrg;
    }

    /**
     * Access method for cashBackRule.
     *
     * @return the current value of cashBackRule
     */
    public Set<CashBackRule> getCashBackRule() {
        return cashBackRule;
    }

    /**
     * Setter method for cashBackRule.
     *
     * @param aCashBackRule the new value for cashBackRule
     */
    public void setCashBackRule(Set<CashBackRule> aCashBackRule) {
        cashBackRule = aCashBackRule;
    }

    /**
     * Access method for lovValue3.
     *
     * @return the current value of lovValue3
     */
    public Set<LovValue> getLovValue3() {
        return lovValue3;
    }

    /**
     * Setter method for lovValue3.
     *
     * @param aLovValue3 the new value for lovValue3
     */
    public void setLovValue3(Set<LovValue> aLovValue3) {
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
     * Gets the group fragment lovSysid for member lov.
     *
     * @return Current value of the group fragment
     * @see Lov
     */
    public BigDecimal getLovLovSysid() {
        return (getLov() == null ? null : getLov().getLovSysid());
    }

    /**
     * Sets the group fragment lovSysid from member lov.
     *
     * @param aLovSysid New value for the group fragment
     * @see Lov
     */
    public void setLovLovSysid(BigDecimal aLovSysid) {
        if (getLov() != null) {
            getLov().setLovSysid(aLovSysid);
        }
    }

    /**
     * Gets the group fragment lovValueSysid for member lovValue2.
     *
     * @return Current value of the group fragment
     * @see LovValue
     */
    public BigDecimal getLovValue2LovValueSysid() {
        return (getLovValue2() == null ? null : getLovValue2().getLovValueSysid());
    }

    /**
     * Sets the group fragment lovValueSysid from member lovValue2.
     *
     * @param aLovValueSysid New value for the group fragment
     * @see LovValue
     */
    public void setLovValue2LovValueSysid(BigDecimal aLovValueSysid) {
        if (getLovValue2() != null) {
            getLovValue2().setLovValueSysid(aLovValueSysid);
        }
    }

    /**
     * Compares the key for this instance with another LovValue.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class LovValue and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof LovValue)) {
            return false;
        }
        LovValue that = (LovValue) other;
        Object myLovValueSysid = this.getLovValueSysid();
        Object yourLovValueSysid = that.getLovValueSysid();
        if (myLovValueSysid==null ? yourLovValueSysid!=null : !myLovValueSysid.equals(yourLovValueSysid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another LovValue.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof LovValue)) return false;
        return this.equalKeys(other) && ((LovValue)other).equalKeys(this);
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
        if (getLovValueSysid() == null) {
            i = 0;
        } else {
            i = getLovValueSysid().hashCode();
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
        StringBuffer sb = new StringBuffer("[LovValue |");
        sb.append(" lovValueSysid=").append(getLovValueSysid());
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
        ret.put("lovValueSysid", getLovValueSysid());
        return ret;
    }

}
