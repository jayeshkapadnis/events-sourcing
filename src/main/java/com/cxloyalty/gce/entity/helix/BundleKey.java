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
@Table(name="bundle_key", indexes={@Index(name="bundleKeyUnBundleKey", columnList="bundle_template_id,key_name", unique=true)})
public class BundleKey implements Serializable {

    /** Primary key. */
    protected static final String PK = "bundleKeyId";

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
    @Column(name="bundle_key_id", unique=true, nullable=false, precision=9)
    private BigDecimal bundleKeyId;
    @Column(name="key_name", nullable=false, length=500)
    private String keyName;
    @Column(name="bi_table_name", length=30)
    private String biTableName;
    @Column(name="bi_column_name", length=30)
    private String biColumnName;
    @Column(name="bi_column_key", length=30)
    private String biColumnKey;
    @Column(name="key_description", length=200)
    private String keyDescription;
    @Column(name="key_active", length=1)
    private String keyActive;
    @Column(name="add_date", nullable=false)
    private Timestamp addDate;
    @Column(name="add_username", nullable=false, length=50)
    private String addUsername;
    @Column(name="update_date", nullable=false)
    private Timestamp updateDate;
    @Column(name="update_username", nullable=false, length=50)
    private String updateUsername;
    @Column(nullable=false, length=1)
    private String legacy;
    @ManyToOne(optional=false)
    @JoinColumn(name="bundle_template_id", nullable=false)
    private BundleTemplate bundleTemplate;
    @OneToMany(mappedBy="bundleKey")
    private Set<BundleKeyValue> bundleKeyValue;

    /** Default constructor. */
    public BundleKey() {
        super();
    }

    /**
     * Access method for bundleKeyId.
     *
     * @return the current value of bundleKeyId
     */
    public BigDecimal getBundleKeyId() {
        return bundleKeyId;
    }

    /**
     * Setter method for bundleKeyId.
     *
     * @param aBundleKeyId the new value for bundleKeyId
     */
    public void setBundleKeyId(BigDecimal aBundleKeyId) {
        bundleKeyId = aBundleKeyId;
    }

    /**
     * Access method for keyName.
     *
     * @return the current value of keyName
     */
    public String getKeyName() {
        return keyName;
    }

    /**
     * Setter method for keyName.
     *
     * @param aKeyName the new value for keyName
     */
    public void setKeyName(String aKeyName) {
        keyName = aKeyName;
    }

    /**
     * Access method for biTableName.
     *
     * @return the current value of biTableName
     */
    public String getBiTableName() {
        return biTableName;
    }

    /**
     * Setter method for biTableName.
     *
     * @param aBiTableName the new value for biTableName
     */
    public void setBiTableName(String aBiTableName) {
        biTableName = aBiTableName;
    }

    /**
     * Access method for biColumnName.
     *
     * @return the current value of biColumnName
     */
    public String getBiColumnName() {
        return biColumnName;
    }

    /**
     * Setter method for biColumnName.
     *
     * @param aBiColumnName the new value for biColumnName
     */
    public void setBiColumnName(String aBiColumnName) {
        biColumnName = aBiColumnName;
    }

    /**
     * Access method for biColumnKey.
     *
     * @return the current value of biColumnKey
     */
    public String getBiColumnKey() {
        return biColumnKey;
    }

    /**
     * Setter method for biColumnKey.
     *
     * @param aBiColumnKey the new value for biColumnKey
     */
    public void setBiColumnKey(String aBiColumnKey) {
        biColumnKey = aBiColumnKey;
    }

    /**
     * Access method for keyDescription.
     *
     * @return the current value of keyDescription
     */
    public String getKeyDescription() {
        return keyDescription;
    }

    /**
     * Setter method for keyDescription.
     *
     * @param aKeyDescription the new value for keyDescription
     */
    public void setKeyDescription(String aKeyDescription) {
        keyDescription = aKeyDescription;
    }

    /**
     * Access method for keyActive.
     *
     * @return the current value of keyActive
     */
    public String getKeyActive() {
        return keyActive;
    }

    /**
     * Setter method for keyActive.
     *
     * @param aKeyActive the new value for keyActive
     */
    public void setKeyActive(String aKeyActive) {
        keyActive = aKeyActive;
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
     * Access method for legacy.
     *
     * @return the current value of legacy
     */
    public String getLegacy() {
        return legacy;
    }

    /**
     * Setter method for legacy.
     *
     * @param aLegacy the new value for legacy
     */
    public void setLegacy(String aLegacy) {
        legacy = aLegacy;
    }

    /**
     * Access method for bundleTemplate.
     *
     * @return the current value of bundleTemplate
     */
    public BundleTemplate getBundleTemplate() {
        return bundleTemplate;
    }

    /**
     * Setter method for bundleTemplate.
     *
     * @param aBundleTemplate the new value for bundleTemplate
     */
    public void setBundleTemplate(BundleTemplate aBundleTemplate) {
        bundleTemplate = aBundleTemplate;
    }

    /**
     * Access method for bundleKeyValue.
     *
     * @return the current value of bundleKeyValue
     */
    public Set<BundleKeyValue> getBundleKeyValue() {
        return bundleKeyValue;
    }

    /**
     * Setter method for bundleKeyValue.
     *
     * @param aBundleKeyValue the new value for bundleKeyValue
     */
    public void setBundleKeyValue(Set<BundleKeyValue> aBundleKeyValue) {
        bundleKeyValue = aBundleKeyValue;
    }

    /**
     * Gets the group fragment bundleTemplateId for member bundleTemplate.
     *
     * @return Current value of the group fragment
     * @see BundleTemplate
     */
    public BigDecimal getBundleTemplateBundleTemplateId() {
        return (getBundleTemplate() == null ? null : getBundleTemplate().getBundleTemplateId());
    }

    /**
     * Sets the group fragment bundleTemplateId from member bundleTemplate.
     *
     * @param aBundleTemplateId New value for the group fragment
     * @see BundleTemplate
     */
    public void setBundleTemplateBundleTemplateId(BigDecimal aBundleTemplateId) {
        if (getBundleTemplate() != null) {
            getBundleTemplate().setBundleTemplateId(aBundleTemplateId);
        }
    }

    /**
     * Compares the key for this instance with another BundleKey.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class BundleKey and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof BundleKey)) {
            return false;
        }
        BundleKey that = (BundleKey) other;
        Object myBundleKeyId = this.getBundleKeyId();
        Object yourBundleKeyId = that.getBundleKeyId();
        if (myBundleKeyId==null ? yourBundleKeyId!=null : !myBundleKeyId.equals(yourBundleKeyId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another BundleKey.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof BundleKey)) return false;
        return this.equalKeys(other) && ((BundleKey)other).equalKeys(this);
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
        if (getBundleKeyId() == null) {
            i = 0;
        } else {
            i = getBundleKeyId().hashCode();
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
        StringBuffer sb = new StringBuffer("[BundleKey |");
        sb.append(" bundleKeyId=").append(getBundleKeyId());
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
        ret.put("bundleKeyId", getBundleKeyId());
        return ret;
    }

}
