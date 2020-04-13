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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="bundle_template", indexes={@Index(name="bundle_template_name_IX", columnList="name", unique=true)})
public class BundleTemplate implements Serializable {

    /** Primary key. */
    protected static final String PK = "bundleTemplateId";

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
    @Column(name="bundle_template_id", unique=true, nullable=false, precision=9)
    private BigDecimal bundleTemplateId;
    @Column(unique=true, nullable=false, length=100)
    private String name;
    @Column(length=1000)
    private String description;
    @Column(name="key_source_url", length=300)
    private String keySourceUrl;
    @Column(name="add_date", nullable=false)
    private Timestamp addDate;
    @Column(name="add_username", nullable=false, length=50)
    private String addUsername;
    @Column(name="update_date", nullable=false)
    private Timestamp updateDate;
    @Column(name="update_username", nullable=false, length=50)
    private String updateUsername;
    @OneToMany(mappedBy="bundleTemplate")
    private Set<BundleKey> bundleKey;
    @OneToMany(mappedBy="bundleTemplate")
    private Set<Bundle> bundle;

    /** Default constructor. */
    public BundleTemplate() {
        super();
    }

    /**
     * Access method for bundleTemplateId.
     *
     * @return the current value of bundleTemplateId
     */
    public BigDecimal getBundleTemplateId() {
        return bundleTemplateId;
    }

    /**
     * Setter method for bundleTemplateId.
     *
     * @param aBundleTemplateId the new value for bundleTemplateId
     */
    public void setBundleTemplateId(BigDecimal aBundleTemplateId) {
        bundleTemplateId = aBundleTemplateId;
    }

    /**
     * Access method for name.
     *
     * @return the current value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for name.
     *
     * @param aName the new value for name
     */
    public void setName(String aName) {
        name = aName;
    }

    /**
     * Access method for description.
     *
     * @return the current value of description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter method for description.
     *
     * @param aDescription the new value for description
     */
    public void setDescription(String aDescription) {
        description = aDescription;
    }

    /**
     * Access method for keySourceUrl.
     *
     * @return the current value of keySourceUrl
     */
    public String getKeySourceUrl() {
        return keySourceUrl;
    }

    /**
     * Setter method for keySourceUrl.
     *
     * @param aKeySourceUrl the new value for keySourceUrl
     */
    public void setKeySourceUrl(String aKeySourceUrl) {
        keySourceUrl = aKeySourceUrl;
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
    public Set<BundleKey> getBundleKey() {
        return bundleKey;
    }

    /**
     * Setter method for bundleKey.
     *
     * @param aBundleKey the new value for bundleKey
     */
    public void setBundleKey(Set<BundleKey> aBundleKey) {
        bundleKey = aBundleKey;
    }

    /**
     * Access method for bundle.
     *
     * @return the current value of bundle
     */
    public Set<Bundle> getBundle() {
        return bundle;
    }

    /**
     * Setter method for bundle.
     *
     * @param aBundle the new value for bundle
     */
    public void setBundle(Set<Bundle> aBundle) {
        bundle = aBundle;
    }

    /**
     * Compares the key for this instance with another BundleTemplate.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class BundleTemplate and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof BundleTemplate)) {
            return false;
        }
        BundleTemplate that = (BundleTemplate) other;
        Object myBundleTemplateId = this.getBundleTemplateId();
        Object yourBundleTemplateId = that.getBundleTemplateId();
        if (myBundleTemplateId==null ? yourBundleTemplateId!=null : !myBundleTemplateId.equals(yourBundleTemplateId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another BundleTemplate.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof BundleTemplate)) return false;
        return this.equalKeys(other) && ((BundleTemplate)other).equalKeys(this);
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
        if (getBundleTemplateId() == null) {
            i = 0;
        } else {
            i = getBundleTemplateId().hashCode();
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
        StringBuffer sb = new StringBuffer("[BundleTemplate |");
        sb.append(" bundleTemplateId=").append(getBundleTemplateId());
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
        ret.put("bundleTemplateId", getBundleTemplateId());
        return ret;
    }

}
