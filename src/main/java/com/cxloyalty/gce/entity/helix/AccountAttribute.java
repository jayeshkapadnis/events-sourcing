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

@Entity(name="account_attribute")
public class AccountAttribute implements Serializable {

    /** Primary key. */
    protected static final String PK = "accountAttributeId";

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
    @Column(name="account_attribute_id", unique=true, nullable=false, precision=10)
    private BigDecimal accountAttributeId;
    @Column(name="account_attribute_value", nullable=false, length=2000)
    private String accountAttributeValue;
    @Column(name="user_created", nullable=false, length=50)
    private String userCreated;
    @Column(name="date_created")
    private Timestamp dateCreated;
    @Column(name="user_modified", length=50)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @ManyToOne(optional=false)
    @JoinColumn(name="act_id", nullable=false)
    private Account account;

    /** Default constructor. */
    public AccountAttribute() {
        super();
    }

    /**
     * Access method for accountAttributeId.
     *
     * @return the current value of accountAttributeId
     */
    public BigDecimal getAccountAttributeId() {
        return accountAttributeId;
    }

    /**
     * Setter method for accountAttributeId.
     *
     * @param aAccountAttributeId the new value for accountAttributeId
     */
    public void setAccountAttributeId(BigDecimal aAccountAttributeId) {
        accountAttributeId = aAccountAttributeId;
    }

    /**
     * Access method for accountAttributeValue.
     *
     * @return the current value of accountAttributeValue
     */
    public String getAccountAttributeValue() {
        return accountAttributeValue;
    }

    /**
     * Setter method for accountAttributeValue.
     *
     * @param aAccountAttributeValue the new value for accountAttributeValue
     */
    public void setAccountAttributeValue(String aAccountAttributeValue) {
        accountAttributeValue = aAccountAttributeValue;
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
     * Compares the key for this instance with another AccountAttribute.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class AccountAttribute and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof AccountAttribute)) {
            return false;
        }
        AccountAttribute that = (AccountAttribute) other;
        Object myAccountAttributeId = this.getAccountAttributeId();
        Object yourAccountAttributeId = that.getAccountAttributeId();
        if (myAccountAttributeId==null ? yourAccountAttributeId!=null : !myAccountAttributeId.equals(yourAccountAttributeId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another AccountAttribute.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof AccountAttribute)) return false;
        return this.equalKeys(other) && ((AccountAttribute)other).equalKeys(this);
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
        if (getAccountAttributeId() == null) {
            i = 0;
        } else {
            i = getAccountAttributeId().hashCode();
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
        StringBuffer sb = new StringBuffer("[AccountAttribute |");
        sb.append(" accountAttributeId=").append(getAccountAttributeId());
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
        ret.put("accountAttributeId", getAccountAttributeId());
        return ret;
    }

}
