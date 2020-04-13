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
@Table(name="bundle", indexes={@Index(name="bundleUnBundle", columnList="bundle_template_id,language_id,variant", unique=true)})
public class Bundle implements Serializable {

    /** Primary key. */
    protected static final String PK = "bundleId";

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
    @Column(name="bundle_id", unique=true, nullable=false, precision=9)
    private BigDecimal bundleId;
    @Column(length=100)
    private String variant;
    @Column(length=200)
    private String description;
    @Column(name="update_guid", length=40)
    private String updateGuid;
    @Column(name="add_date", nullable=false)
    private Timestamp addDate;
    @Column(name="add_username", nullable=false, length=50)
    private String addUsername;
    @Column(name="update_date", nullable=false)
    private Timestamp updateDate;
    @Column(name="update_username", nullable=false, length=50)
    private String updateUsername;
    @OneToMany(mappedBy="bundle")
    private Set<BundleKeyValue> bundleKeyValue;
    @ManyToOne(optional=false)
    @JoinColumn(name="bundle_template_id", nullable=false)
    private BundleTemplate bundleTemplate;
    @ManyToOne(optional=false)
    @JoinColumn(name="language_id", nullable=false)
    private Language language;

    /** Default constructor. */
    public Bundle() {
        super();
    }

    /**
     * Access method for bundleId.
     *
     * @return the current value of bundleId
     */
    public BigDecimal getBundleId() {
        return bundleId;
    }

    /**
     * Setter method for bundleId.
     *
     * @param aBundleId the new value for bundleId
     */
    public void setBundleId(BigDecimal aBundleId) {
        bundleId = aBundleId;
    }

    /**
     * Access method for variant.
     *
     * @return the current value of variant
     */
    public String getVariant() {
        return variant;
    }

    /**
     * Setter method for variant.
     *
     * @param aVariant the new value for variant
     */
    public void setVariant(String aVariant) {
        variant = aVariant;
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
     * Access method for updateGuid.
     *
     * @return the current value of updateGuid
     */
    public String getUpdateGuid() {
        return updateGuid;
    }

    /**
     * Setter method for updateGuid.
     *
     * @param aUpdateGuid the new value for updateGuid
     */
    public void setUpdateGuid(String aUpdateGuid) {
        updateGuid = aUpdateGuid;
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
     * Access method for language.
     *
     * @return the current value of language
     */
    public Language getLanguage() {
        return language;
    }

    /**
     * Setter method for language.
     *
     * @param aLanguage the new value for language
     */
    public void setLanguage(Language aLanguage) {
        language = aLanguage;
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
     * Gets the group fragment languageId for member language.
     *
     * @return Current value of the group fragment
     * @see Language
     */
    public BigDecimal getLanguageLanguageId() {
        return (getLanguage() == null ? null : getLanguage().getLanguageId());
    }

    /**
     * Sets the group fragment languageId from member language.
     *
     * @param aLanguageId New value for the group fragment
     * @see Language
     */
    public void setLanguageLanguageId(BigDecimal aLanguageId) {
        if (getLanguage() != null) {
            getLanguage().setLanguageId(aLanguageId);
        }
    }

    /**
     * Compares the key for this instance with another Bundle.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Bundle and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Bundle)) {
            return false;
        }
        Bundle that = (Bundle) other;
        Object myBundleId = this.getBundleId();
        Object yourBundleId = that.getBundleId();
        if (myBundleId==null ? yourBundleId!=null : !myBundleId.equals(yourBundleId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Bundle.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Bundle)) return false;
        return this.equalKeys(other) && ((Bundle)other).equalKeys(this);
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
        if (getBundleId() == null) {
            i = 0;
        } else {
            i = getBundleId().hashCode();
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
        StringBuffer sb = new StringBuffer("[Bundle |");
        sb.append(" bundleId=").append(getBundleId());
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
        ret.put("bundleId", getBundleId());
        return ret;
    }

}
