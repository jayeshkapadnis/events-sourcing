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

@Entity(name="lock_scheme")
public class LockScheme implements Serializable {

    /** Primary key. */
    protected static final String PK = "lockSchemeId";

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
    @Column(name="lock_scheme_id", unique=true, nullable=false, precision=16)
    private BigDecimal lockSchemeId;
    @Column(name="retry_count", precision=10)
    private BigDecimal retryCount;
    @Column(name="minutes_to_lock", precision=10)
    private BigDecimal minutesToLock;
    @Column(name="passphrase_retry_count", precision=16)
    private BigDecimal passphraseRetryCount;
    @Column(name="passphrase_minutes_to_lock", precision=16)
    private BigDecimal passphraseMinutesToLock;
    @Column(name="user_created", nullable=false, length=4000)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=4000)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @ManyToOne(optional=false)
    @JoinColumn(name="product_group_id", nullable=false)
    private ProductGroup productGroup;

    /** Default constructor. */
    public LockScheme() {
        super();
    }

    /**
     * Access method for lockSchemeId.
     *
     * @return the current value of lockSchemeId
     */
    public BigDecimal getLockSchemeId() {
        return lockSchemeId;
    }

    /**
     * Setter method for lockSchemeId.
     *
     * @param aLockSchemeId the new value for lockSchemeId
     */
    public void setLockSchemeId(BigDecimal aLockSchemeId) {
        lockSchemeId = aLockSchemeId;
    }

    /**
     * Access method for retryCount.
     *
     * @return the current value of retryCount
     */
    public BigDecimal getRetryCount() {
        return retryCount;
    }

    /**
     * Setter method for retryCount.
     *
     * @param aRetryCount the new value for retryCount
     */
    public void setRetryCount(BigDecimal aRetryCount) {
        retryCount = aRetryCount;
    }

    /**
     * Access method for minutesToLock.
     *
     * @return the current value of minutesToLock
     */
    public BigDecimal getMinutesToLock() {
        return minutesToLock;
    }

    /**
     * Setter method for minutesToLock.
     *
     * @param aMinutesToLock the new value for minutesToLock
     */
    public void setMinutesToLock(BigDecimal aMinutesToLock) {
        minutesToLock = aMinutesToLock;
    }

    /**
     * Access method for passphraseRetryCount.
     *
     * @return the current value of passphraseRetryCount
     */
    public BigDecimal getPassphraseRetryCount() {
        return passphraseRetryCount;
    }

    /**
     * Setter method for passphraseRetryCount.
     *
     * @param aPassphraseRetryCount the new value for passphraseRetryCount
     */
    public void setPassphraseRetryCount(BigDecimal aPassphraseRetryCount) {
        passphraseRetryCount = aPassphraseRetryCount;
    }

    /**
     * Access method for passphraseMinutesToLock.
     *
     * @return the current value of passphraseMinutesToLock
     */
    public BigDecimal getPassphraseMinutesToLock() {
        return passphraseMinutesToLock;
    }

    /**
     * Setter method for passphraseMinutesToLock.
     *
     * @param aPassphraseMinutesToLock the new value for passphraseMinutesToLock
     */
    public void setPassphraseMinutesToLock(BigDecimal aPassphraseMinutesToLock) {
        passphraseMinutesToLock = aPassphraseMinutesToLock;
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
     * Access method for productGroup.
     *
     * @return the current value of productGroup
     */
    public ProductGroup getProductGroup() {
        return productGroup;
    }

    /**
     * Setter method for productGroup.
     *
     * @param aProductGroup the new value for productGroup
     */
    public void setProductGroup(ProductGroup aProductGroup) {
        productGroup = aProductGroup;
    }

    /**
     * Compares the key for this instance with another LockScheme.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class LockScheme and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof LockScheme)) {
            return false;
        }
        LockScheme that = (LockScheme) other;
        Object myLockSchemeId = this.getLockSchemeId();
        Object yourLockSchemeId = that.getLockSchemeId();
        if (myLockSchemeId==null ? yourLockSchemeId!=null : !myLockSchemeId.equals(yourLockSchemeId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another LockScheme.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof LockScheme)) return false;
        return this.equalKeys(other) && ((LockScheme)other).equalKeys(this);
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
        if (getLockSchemeId() == null) {
            i = 0;
        } else {
            i = getLockSchemeId().hashCode();
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
        StringBuffer sb = new StringBuffer("[LockScheme |");
        sb.append(" lockSchemeId=").append(getLockSchemeId());
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
        ret.put("lockSchemeId", getLockSchemeId());
        return ret;
    }

}
