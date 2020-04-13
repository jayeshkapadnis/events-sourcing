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

@Entity(name="currency_type")
public class CurrencyType implements Serializable {

    /** Primary key. */
    protected static final String PK = "currencyTypeId";

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
    @Column(name="currency_type_id", unique=true, nullable=false, precision=10)
    private BigDecimal currencyTypeId;
    @Column(name="currency_type_desc", nullable=false, length=100)
    private String currencyTypeDesc;
    @Column(name="user_created", nullable=false, length=30)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=30)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @Column(name="currency_type_symbol", length=10)
    private String currencyTypeSymbol;
    @Column(name="currency_type_display_symbol", length=1)
    private String currencyTypeDisplaySymbol;
    @Column(name="iso_4217_code", length=3)
    private String iso4217Code;
    @Column(name="iso_4217_num_code", length=3)
    private String iso4217NumCode;
    @OneToMany(mappedBy="currencyType")
    private Set<CurrencyConversion> currencyConversion;
    @OneToMany(mappedBy="currencyType2")
    private Set<CurrencyConversion> currencyConversion2;
    @OneToMany(mappedBy="currencyType")
    private Set<SolicitationTemplate> solicitationTemplate;

    /** Default constructor. */
    public CurrencyType() {
        super();
    }

    /**
     * Access method for currencyTypeId.
     *
     * @return the current value of currencyTypeId
     */
    public BigDecimal getCurrencyTypeId() {
        return currencyTypeId;
    }

    /**
     * Setter method for currencyTypeId.
     *
     * @param aCurrencyTypeId the new value for currencyTypeId
     */
    public void setCurrencyTypeId(BigDecimal aCurrencyTypeId) {
        currencyTypeId = aCurrencyTypeId;
    }

    /**
     * Access method for currencyTypeDesc.
     *
     * @return the current value of currencyTypeDesc
     */
    public String getCurrencyTypeDesc() {
        return currencyTypeDesc;
    }

    /**
     * Setter method for currencyTypeDesc.
     *
     * @param aCurrencyTypeDesc the new value for currencyTypeDesc
     */
    public void setCurrencyTypeDesc(String aCurrencyTypeDesc) {
        currencyTypeDesc = aCurrencyTypeDesc;
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
     * Access method for currencyTypeSymbol.
     *
     * @return the current value of currencyTypeSymbol
     */
    public String getCurrencyTypeSymbol() {
        return currencyTypeSymbol;
    }

    /**
     * Setter method for currencyTypeSymbol.
     *
     * @param aCurrencyTypeSymbol the new value for currencyTypeSymbol
     */
    public void setCurrencyTypeSymbol(String aCurrencyTypeSymbol) {
        currencyTypeSymbol = aCurrencyTypeSymbol;
    }

    /**
     * Access method for currencyTypeDisplaySymbol.
     *
     * @return the current value of currencyTypeDisplaySymbol
     */
    public String getCurrencyTypeDisplaySymbol() {
        return currencyTypeDisplaySymbol;
    }

    /**
     * Setter method for currencyTypeDisplaySymbol.
     *
     * @param aCurrencyTypeDisplaySymbol the new value for currencyTypeDisplaySymbol
     */
    public void setCurrencyTypeDisplaySymbol(String aCurrencyTypeDisplaySymbol) {
        currencyTypeDisplaySymbol = aCurrencyTypeDisplaySymbol;
    }

    /**
     * Access method for iso4217Code.
     *
     * @return the current value of iso4217Code
     */
    public String getIso4217Code() {
        return iso4217Code;
    }

    /**
     * Setter method for iso4217Code.
     *
     * @param aIso4217Code the new value for iso4217Code
     */
    public void setIso4217Code(String aIso4217Code) {
        iso4217Code = aIso4217Code;
    }

    /**
     * Access method for iso4217NumCode.
     *
     * @return the current value of iso4217NumCode
     */
    public String getIso4217NumCode() {
        return iso4217NumCode;
    }

    /**
     * Setter method for iso4217NumCode.
     *
     * @param aIso4217NumCode the new value for iso4217NumCode
     */
    public void setIso4217NumCode(String aIso4217NumCode) {
        iso4217NumCode = aIso4217NumCode;
    }

    /**
     * Access method for currencyConversion.
     *
     * @return the current value of currencyConversion
     */
    public Set<CurrencyConversion> getCurrencyConversion() {
        return currencyConversion;
    }

    /**
     * Setter method for currencyConversion.
     *
     * @param aCurrencyConversion the new value for currencyConversion
     */
    public void setCurrencyConversion(Set<CurrencyConversion> aCurrencyConversion) {
        currencyConversion = aCurrencyConversion;
    }

    /**
     * Access method for currencyConversion2.
     *
     * @return the current value of currencyConversion2
     */
    public Set<CurrencyConversion> getCurrencyConversion2() {
        return currencyConversion2;
    }

    /**
     * Setter method for currencyConversion2.
     *
     * @param aCurrencyConversion2 the new value for currencyConversion2
     */
    public void setCurrencyConversion2(Set<CurrencyConversion> aCurrencyConversion2) {
        currencyConversion2 = aCurrencyConversion2;
    }

    /**
     * Access method for solicitationTemplate.
     *
     * @return the current value of solicitationTemplate
     */
    public Set<SolicitationTemplate> getSolicitationTemplate() {
        return solicitationTemplate;
    }

    /**
     * Setter method for solicitationTemplate.
     *
     * @param aSolicitationTemplate the new value for solicitationTemplate
     */
    public void setSolicitationTemplate(Set<SolicitationTemplate> aSolicitationTemplate) {
        solicitationTemplate = aSolicitationTemplate;
    }

    /**
     * Compares the key for this instance with another CurrencyType.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class CurrencyType and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof CurrencyType)) {
            return false;
        }
        CurrencyType that = (CurrencyType) other;
        Object myCurrencyTypeId = this.getCurrencyTypeId();
        Object yourCurrencyTypeId = that.getCurrencyTypeId();
        if (myCurrencyTypeId==null ? yourCurrencyTypeId!=null : !myCurrencyTypeId.equals(yourCurrencyTypeId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another CurrencyType.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof CurrencyType)) return false;
        return this.equalKeys(other) && ((CurrencyType)other).equalKeys(this);
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
        if (getCurrencyTypeId() == null) {
            i = 0;
        } else {
            i = getCurrencyTypeId().hashCode();
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
        StringBuffer sb = new StringBuffer("[CurrencyType |");
        sb.append(" currencyTypeId=").append(getCurrencyTypeId());
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
        ret.put("currencyTypeId", getCurrencyTypeId());
        return ret;
    }

}
