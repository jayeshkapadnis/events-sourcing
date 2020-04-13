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
@Table(name="bundle_key_value", indexes={@Index(name="bundleKeyValueUnBundleKeyValue", columnList="bundle_id,bundle_key_id", unique=true)})
public class BundleKeyValue implements Serializable {

    /** Primary key. */
    protected static final String PK = "bundleKvId";

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
    @Column(name="bundle_kv_id", unique=true, nullable=false, precision=9)
    private BigDecimal bundleKvId;
    @Column(name="key_value", length=1000)
    private String keyValue;
    @Column(name="add_date", nullable=false)
    private Timestamp addDate;
    @Column(name="add_username", nullable=false, length=50)
    private String addUsername;
    @Column(name="update_date", nullable=false)
    private Timestamp updateDate;
    @Column(name="update_username", nullable=false, length=50)
    private String updateUsername;
    @ManyToOne(optional=false)
    @JoinColumn(name="bundle_key_id", nullable=false)
    private BundleKey bundleKey;
    @ManyToOne(optional=false)
    @JoinColumn(name="bundle_id", nullable=false)
    private Bundle bundle;

    /** Default constructor. */
    public BundleKeyValue() {
        super();
    }

    /**
     * Access method for bundleKvId.
     *
     * @return the current value of bundleKvId
     */
    public BigDecimal getBundleKvId() {
        return bundleKvId;
    }

    /**
     * Setter method for bundleKvId.
     *
     * @param aBundleKvId the new value for bundleKvId
     */
    public void setBundleKvId(BigDecimal aBundleKvId) {
        bundleKvId = aBundleKvId;
    }

    /**
     * Access method for keyValue.
     *
     * @return the current value of keyValue
     */
    public String getKeyValue() {
        return keyValue;
    }

    /**
     * Setter method for keyValue.
     *
     * @param aKeyValue the new value for keyValue
     */
    public void setKeyValue(String aKeyValue) {
        keyValue = aKeyValue;
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
     * Access method for bundleKey.
     *
     * @return the current value of bundleKey
     */
    public BundleKey getBundleKey() {
        return bundleKey;
    }

    /**
     * Setter method for bundleKey.
     *
     * @param aBundleKey the new value for bundleKey
     */
    public void setBundleKey(BundleKey aBundleKey) {
        bundleKey = aBundleKey;
    }

    /**
     * Access method for bundle.
     *
     * @return the current value of bundle
     */
    public Bundle getBundle() {
        return bundle;
    }

    /**
     * Setter method for bundle.
     *
     * @param aBundle the new value for bundle
     */
    public void setBundle(Bundle aBundle) {
        bundle = aBundle;
    }

    /**
     * Gets the group fragment bundleId for member bundle.
     *
     * @return Current value of the group fragment
     * @see Bundle
     */
    public BigDecimal getBundleBundleId() {
        return (getBundle() == null ? null : getBundle().getBundleId());
    }

    /**
     * Sets the group fragment bundleId from member bundle.
     *
     * @param aBundleId New value for the group fragment
     * @see Bundle
     */
    public void setBundleBundleId(BigDecimal aBundleId) {
        if (getBundle() != null) {
            getBundle().setBundleId(aBundleId);
        }
    }

    /**
     * Gets the group fragment bundleKeyId for member bundleKey.
     *
     * @return Current value of the group fragment
     * @see BundleKey
     */
    public BigDecimal getBundleKeyBundleKeyId() {
        return (getBundleKey() == null ? null : getBundleKey().getBundleKeyId());
    }

    /**
     * Sets the group fragment bundleKeyId from member bundleKey.
     *
     * @param aBundleKeyId New value for the group fragment
     * @see BundleKey
     */
    public void setBundleKeyBundleKeyId(BigDecimal aBundleKeyId) {
        if (getBundleKey() != null) {
            getBundleKey().setBundleKeyId(aBundleKeyId);
        }
    }

    /**
     * Compares the key for this instance with another BundleKeyValue.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class BundleKeyValue and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof BundleKeyValue)) {
            return false;
        }
        BundleKeyValue that = (BundleKeyValue) other;
        Object myBundleKvId = this.getBundleKvId();
        Object yourBundleKvId = that.getBundleKvId();
        if (myBundleKvId==null ? yourBundleKvId!=null : !myBundleKvId.equals(yourBundleKvId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another BundleKeyValue.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof BundleKeyValue)) return false;
        return this.equalKeys(other) && ((BundleKeyValue)other).equalKeys(this);
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
        if (getBundleKvId() == null) {
            i = 0;
        } else {
            i = getBundleKvId().hashCode();
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
        StringBuffer sb = new StringBuffer("[BundleKeyValue |");
        sb.append(" bundleKvId=").append(getBundleKvId());
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
        ret.put("bundleKvId", getBundleKvId());
        return ret;
    }

}
