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
@Table(name="currency_conversion", indexes={@Index(name="currencyConversionUnCurrencyConversion", columnList="from_currency_cd,to_currency_cd,effective_start_dt,effective_end_dt", unique=true)})
public class CurrencyConversion implements Serializable {

    /** Primary key. */
    protected static final String PK = "currencyConversionId";

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
    @Column(name="currency_conversion_id", unique=true, nullable=false, precision=10)
    private BigDecimal currencyConversionId;
    @Column(name="effective_start_dt")
    private Timestamp effectiveStartDt;
    @Column(name="effective_end_dt")
    private Timestamp effectiveEndDt;
    @Column(name="conversion_rate", precision=22, scale=7)
    private BigDecimal conversionRate;
    @Column(name="add_date", nullable=false)
    private Timestamp addDate;
    @Column(name="add_username", length=200)
    private String addUsername;
    @Column(name="update_date")
    private Timestamp updateDate;
    @Column(name="update_username", length=200)
    private String updateUsername;
    @ManyToOne
    @JoinColumn(name="from_currency_cd")
    private CurrencyType currencyType;
    @ManyToOne
    @JoinColumn(name="to_currency_cd")
    private CurrencyType currencyType2;

    /** Default constructor. */
    public CurrencyConversion() {
        super();
    }

    /**
     * Access method for currencyConversionId.
     *
     * @return the current value of currencyConversionId
     */
    public BigDecimal getCurrencyConversionId() {
        return currencyConversionId;
    }

    /**
     * Setter method for currencyConversionId.
     *
     * @param aCurrencyConversionId the new value for currencyConversionId
     */
    public void setCurrencyConversionId(BigDecimal aCurrencyConversionId) {
        currencyConversionId = aCurrencyConversionId;
    }

    /**
     * Access method for effectiveStartDt.
     *
     * @return the current value of effectiveStartDt
     */
    public Timestamp getEffectiveStartDt() {
        return effectiveStartDt;
    }

    /**
     * Setter method for effectiveStartDt.
     *
     * @param aEffectiveStartDt the new value for effectiveStartDt
     */
    public void setEffectiveStartDt(Timestamp aEffectiveStartDt) {
        effectiveStartDt = aEffectiveStartDt;
    }

    /**
     * Access method for effectiveEndDt.
     *
     * @return the current value of effectiveEndDt
     */
    public Timestamp getEffectiveEndDt() {
        return effectiveEndDt;
    }

    /**
     * Setter method for effectiveEndDt.
     *
     * @param aEffectiveEndDt the new value for effectiveEndDt
     */
    public void setEffectiveEndDt(Timestamp aEffectiveEndDt) {
        effectiveEndDt = aEffectiveEndDt;
    }

    /**
     * Access method for conversionRate.
     *
     * @return the current value of conversionRate
     */
    public BigDecimal getConversionRate() {
        return conversionRate;
    }

    /**
     * Setter method for conversionRate.
     *
     * @param aConversionRate the new value for conversionRate
     */
    public void setConversionRate(BigDecimal aConversionRate) {
        conversionRate = aConversionRate;
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
     * Access method for currencyType.
     *
     * @return the current value of currencyType
     */
    public CurrencyType getCurrencyType() {
        return currencyType;
    }

    /**
     * Setter method for currencyType.
     *
     * @param aCurrencyType the new value for currencyType
     */
    public void setCurrencyType(CurrencyType aCurrencyType) {
        currencyType = aCurrencyType;
    }

    /**
     * Access method for currencyType2.
     *
     * @return the current value of currencyType2
     */
    public CurrencyType getCurrencyType2() {
        return currencyType2;
    }

    /**
     * Setter method for currencyType2.
     *
     * @param aCurrencyType2 the new value for currencyType2
     */
    public void setCurrencyType2(CurrencyType aCurrencyType2) {
        currencyType2 = aCurrencyType2;
    }

    /**
     * Gets the group fragment currencyTypeId for member currencyType.
     *
     * @return Current value of the group fragment
     * @see CurrencyType
     */
    public BigDecimal getCurrencyTypeCurrencyTypeId() {
        return (getCurrencyType() == null ? null : getCurrencyType().getCurrencyTypeId());
    }

    /**
     * Sets the group fragment currencyTypeId from member currencyType.
     *
     * @param aCurrencyTypeId New value for the group fragment
     * @see CurrencyType
     */
    public void setCurrencyTypeCurrencyTypeId(BigDecimal aCurrencyTypeId) {
        if (getCurrencyType() != null) {
            getCurrencyType().setCurrencyTypeId(aCurrencyTypeId);
        }
    }

    /**
     * Gets the group fragment currencyTypeId for member currencyType2.
     *
     * @return Current value of the group fragment
     * @see CurrencyType
     */
    public BigDecimal getCurrencyType2CurrencyTypeId() {
        return (getCurrencyType2() == null ? null : getCurrencyType2().getCurrencyTypeId());
    }

    /**
     * Sets the group fragment currencyTypeId from member currencyType2.
     *
     * @param aCurrencyTypeId New value for the group fragment
     * @see CurrencyType
     */
    public void setCurrencyType2CurrencyTypeId(BigDecimal aCurrencyTypeId) {
        if (getCurrencyType2() != null) {
            getCurrencyType2().setCurrencyTypeId(aCurrencyTypeId);
        }
    }

    /**
     * Compares the key for this instance with another CurrencyConversion.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class CurrencyConversion and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof CurrencyConversion)) {
            return false;
        }
        CurrencyConversion that = (CurrencyConversion) other;
        Object myCurrencyConversionId = this.getCurrencyConversionId();
        Object yourCurrencyConversionId = that.getCurrencyConversionId();
        if (myCurrencyConversionId==null ? yourCurrencyConversionId!=null : !myCurrencyConversionId.equals(yourCurrencyConversionId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another CurrencyConversion.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof CurrencyConversion)) return false;
        return this.equalKeys(other) && ((CurrencyConversion)other).equalKeys(this);
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
        if (getCurrencyConversionId() == null) {
            i = 0;
        } else {
            i = getCurrencyConversionId().hashCode();
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
        StringBuffer sb = new StringBuffer("[CurrencyConversion |");
        sb.append(" currencyConversionId=").append(getCurrencyConversionId());
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
        ret.put("currencyConversionId", getCurrencyConversionId());
        return ret;
    }

}
