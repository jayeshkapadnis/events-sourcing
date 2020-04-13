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

@Entity(name="bank_code")
public class BankCode implements Serializable {

    /** Primary key. */
    protected static final String PK = "bankCodeId";

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
    @Column(name="bank_code_id", unique=true, nullable=false, precision=16)
    private BigDecimal bankCodeId;
    @Column(name="bank_code", nullable=false, length=10)
    private String bankCode;
    @Column(name="bank_name", nullable=false, length=100)
    private String bankName;
    @Column(name="user_created", nullable=false, length=50)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=50)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @ManyToOne(optional=false)
    @JoinColumn(name="country_id", nullable=false)
    private Country country;

    /** Default constructor. */
    public BankCode() {
        super();
    }

    /**
     * Access method for bankCodeId.
     *
     * @return the current value of bankCodeId
     */
    public BigDecimal getBankCodeId() {
        return bankCodeId;
    }

    /**
     * Setter method for bankCodeId.
     *
     * @param aBankCodeId the new value for bankCodeId
     */
    public void setBankCodeId(BigDecimal aBankCodeId) {
        bankCodeId = aBankCodeId;
    }

    /**
     * Access method for bankCode.
     *
     * @return the current value of bankCode
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * Setter method for bankCode.
     *
     * @param aBankCode the new value for bankCode
     */
    public void setBankCode(String aBankCode) {
        bankCode = aBankCode;
    }

    /**
     * Access method for bankName.
     *
     * @return the current value of bankName
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Setter method for bankName.
     *
     * @param aBankName the new value for bankName
     */
    public void setBankName(String aBankName) {
        bankName = aBankName;
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
     * Access method for country.
     *
     * @return the current value of country
     */
    public Country getCountry() {
        return country;
    }

    /**
     * Setter method for country.
     *
     * @param aCountry the new value for country
     */
    public void setCountry(Country aCountry) {
        country = aCountry;
    }

    /**
     * Compares the key for this instance with another BankCode.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class BankCode and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof BankCode)) {
            return false;
        }
        BankCode that = (BankCode) other;
        Object myBankCodeId = this.getBankCodeId();
        Object yourBankCodeId = that.getBankCodeId();
        if (myBankCodeId==null ? yourBankCodeId!=null : !myBankCodeId.equals(yourBankCodeId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another BankCode.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof BankCode)) return false;
        return this.equalKeys(other) && ((BankCode)other).equalKeys(this);
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
        if (getBankCodeId() == null) {
            i = 0;
        } else {
            i = getBankCodeId().hashCode();
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
        StringBuffer sb = new StringBuffer("[BankCode |");
        sb.append(" bankCodeId=").append(getBankCodeId());
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
        ret.put("bankCodeId", getBankCodeId());
        return ret;
    }

}
