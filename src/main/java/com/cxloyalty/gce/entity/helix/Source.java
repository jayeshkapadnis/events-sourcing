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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="source")
public class Source implements Serializable {

    /** Primary key. */
    protected static final String PK = "sourceId";

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
    @Column(name="source_id", unique=true, nullable=false, precision=10)
    private BigDecimal sourceId;
    @Column(name="source_desc", nullable=false, length=50)
    private String sourceDesc;
    @Column(name="user_created", length=30)
    private String userCreated;
    @Column(name="date_created")
    private Timestamp dateCreated;
    @Column(name="user_modified", length=30)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @Column(name="minimum_premium_value", precision=10, scale=2)
    private BigDecimal minimumPremiumValue;
    @Column(name="creative_identifier", length=100)
    private String creativeIdentifier;
    @Column(name="parent_legacy_ref_cd", length=20)
    private String parentLegacyRefCd;
    @OneToMany(mappedBy="source")
    private Set<PoolSource> poolSource;
    @OneToMany(mappedBy="source")
    private Set<Site> site;
    @ManyToOne(optional=false)
    @JoinColumn(name="act_id", nullable=false)
    private Account account;
    @ManyToOne(optional=false)
    @JoinColumn(name="lob_id", nullable=false)
    private LineOfBusiness lineOfBusiness;

    /** Default constructor. */
    public Source() {
        super();
    }

    /**
     * Access method for sourceId.
     *
     * @return the current value of sourceId
     */
    public BigDecimal getSourceId() {
        return sourceId;
    }

    /**
     * Setter method for sourceId.
     *
     * @param aSourceId the new value for sourceId
     */
    public void setSourceId(BigDecimal aSourceId) {
        sourceId = aSourceId;
    }

    /**
     * Access method for sourceDesc.
     *
     * @return the current value of sourceDesc
     */
    public String getSourceDesc() {
        return sourceDesc;
    }

    /**
     * Setter method for sourceDesc.
     *
     * @param aSourceDesc the new value for sourceDesc
     */
    public void setSourceDesc(String aSourceDesc) {
        sourceDesc = aSourceDesc;
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
     * Access method for minimumPremiumValue.
     *
     * @return the current value of minimumPremiumValue
     */
    public BigDecimal getMinimumPremiumValue() {
        return minimumPremiumValue;
    }

    /**
     * Setter method for minimumPremiumValue.
     *
     * @param aMinimumPremiumValue the new value for minimumPremiumValue
     */
    public void setMinimumPremiumValue(BigDecimal aMinimumPremiumValue) {
        minimumPremiumValue = aMinimumPremiumValue;
    }

    /**
     * Access method for creativeIdentifier.
     *
     * @return the current value of creativeIdentifier
     */
    public String getCreativeIdentifier() {
        return creativeIdentifier;
    }

    /**
     * Setter method for creativeIdentifier.
     *
     * @param aCreativeIdentifier the new value for creativeIdentifier
     */
    public void setCreativeIdentifier(String aCreativeIdentifier) {
        creativeIdentifier = aCreativeIdentifier;
    }

    /**
     * Access method for parentLegacyRefCd.
     *
     * @return the current value of parentLegacyRefCd
     */
    public String getParentLegacyRefCd() {
        return parentLegacyRefCd;
    }

    /**
     * Setter method for parentLegacyRefCd.
     *
     * @param aParentLegacyRefCd the new value for parentLegacyRefCd
     */
    public void setParentLegacyRefCd(String aParentLegacyRefCd) {
        parentLegacyRefCd = aParentLegacyRefCd;
    }

    /**
     * Access method for poolSource.
     *
     * @return the current value of poolSource
     */
    public Set<PoolSource> getPoolSource() {
        return poolSource;
    }

    /**
     * Setter method for poolSource.
     *
     * @param aPoolSource the new value for poolSource
     */
    public void setPoolSource(Set<PoolSource> aPoolSource) {
        poolSource = aPoolSource;
    }

    /**
     * Access method for site.
     *
     * @return the current value of site
     */
    public Set<Site> getSite() {
        return site;
    }

    /**
     * Setter method for site.
     *
     * @param aSite the new value for site
     */
    public void setSite(Set<Site> aSite) {
        site = aSite;
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
     * Access method for lineOfBusiness.
     *
     * @return the current value of lineOfBusiness
     */
    public LineOfBusiness getLineOfBusiness() {
        return lineOfBusiness;
    }

    /**
     * Setter method for lineOfBusiness.
     *
     * @param aLineOfBusiness the new value for lineOfBusiness
     */
    public void setLineOfBusiness(LineOfBusiness aLineOfBusiness) {
        lineOfBusiness = aLineOfBusiness;
    }

    /**
     * Compares the key for this instance with another Source.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Source and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Source)) {
            return false;
        }
        Source that = (Source) other;
        Object mySourceId = this.getSourceId();
        Object yourSourceId = that.getSourceId();
        if (mySourceId==null ? yourSourceId!=null : !mySourceId.equals(yourSourceId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Source.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Source)) return false;
        return this.equalKeys(other) && ((Source)other).equalKeys(this);
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
        if (getSourceId() == null) {
            i = 0;
        } else {
            i = getSourceId().hashCode();
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
        StringBuffer sb = new StringBuffer("[Source |");
        sb.append(" sourceId=").append(getSourceId());
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
        ret.put("sourceId", getSourceId());
        return ret;
    }

}
