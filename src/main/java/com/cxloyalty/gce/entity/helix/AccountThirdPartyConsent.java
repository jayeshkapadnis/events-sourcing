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

@Entity(name="account_third_party_consent")
public class AccountThirdPartyConsent implements Serializable {

    /** Primary key. */
    protected static final String PK = "accountThirdPartyConsentId";

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
    @Column(name="account_third_party_consent_id", unique=true, nullable=false, precision=10)
    private BigDecimal accountThirdPartyConsentId;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_created", nullable=false, length=30)
    private String userCreated;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @Column(name="user_modified", length=30)
    private String userModified;
    @Column(name="consent_flag", nullable=false, length=1)
    private String consentFlag;
    @ManyToOne(optional=false)
    @JoinColumn(name="act_id", nullable=false)
    private Account account;
    @ManyToOne(optional=false)
    @JoinColumn(name="third_party_sysid", nullable=false)
    private ThirdParty thirdParty;

    /** Default constructor. */
    public AccountThirdPartyConsent() {
        super();
    }

    /**
     * Access method for accountThirdPartyConsentId.
     *
     * @return the current value of accountThirdPartyConsentId
     */
    public BigDecimal getAccountThirdPartyConsentId() {
        return accountThirdPartyConsentId;
    }

    /**
     * Setter method for accountThirdPartyConsentId.
     *
     * @param aAccountThirdPartyConsentId the new value for accountThirdPartyConsentId
     */
    public void setAccountThirdPartyConsentId(BigDecimal aAccountThirdPartyConsentId) {
        accountThirdPartyConsentId = aAccountThirdPartyConsentId;
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
     * Access method for consentFlag.
     *
     * @return the current value of consentFlag
     */
    public String getConsentFlag() {
        return consentFlag;
    }

    /**
     * Setter method for consentFlag.
     *
     * @param aConsentFlag the new value for consentFlag
     */
    public void setConsentFlag(String aConsentFlag) {
        consentFlag = aConsentFlag;
    }

    /**
     * Access method for account.
     *
     * @return the current value of account
     */
    public Account getAccount() {
        return account;
    }

    /**
     * Setter method for account.
     *
     * @param aAccount the new value for account
     */
    public void setAccount(Account aAccount) {
        account = aAccount;
    }

    /**
     * Access method for thirdParty.
     *
     * @return the current value of thirdParty
     */
    public ThirdParty getThirdParty() {
        return thirdParty;
    }

    /**
     * Setter method for thirdParty.
     *
     * @param aThirdParty the new value for thirdParty
     */
    public void setThirdParty(ThirdParty aThirdParty) {
        thirdParty = aThirdParty;
    }

    /**
     * Compares the key for this instance with another AccountThirdPartyConsent.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class AccountThirdPartyConsent and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof AccountThirdPartyConsent)) {
            return false;
        }
        AccountThirdPartyConsent that = (AccountThirdPartyConsent) other;
        Object myAccountThirdPartyConsentId = this.getAccountThirdPartyConsentId();
        Object yourAccountThirdPartyConsentId = that.getAccountThirdPartyConsentId();
        if (myAccountThirdPartyConsentId==null ? yourAccountThirdPartyConsentId!=null : !myAccountThirdPartyConsentId.equals(yourAccountThirdPartyConsentId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another AccountThirdPartyConsent.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof AccountThirdPartyConsent)) return false;
        return this.equalKeys(other) && ((AccountThirdPartyConsent)other).equalKeys(this);
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
        if (getAccountThirdPartyConsentId() == null) {
            i = 0;
        } else {
            i = getAccountThirdPartyConsentId().hashCode();
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
        StringBuffer sb = new StringBuffer("[AccountThirdPartyConsent |");
        sb.append(" accountThirdPartyConsentId=").append(getAccountThirdPartyConsentId());
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
        ret.put("accountThirdPartyConsentId", getAccountThirdPartyConsentId());
        return ret;
    }

}
