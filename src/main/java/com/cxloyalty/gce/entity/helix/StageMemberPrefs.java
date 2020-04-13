// Generated with g9.

package com.cxloyalty.gce.entity.helix;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="stage_member_prefs")
public class StageMemberPrefs implements Serializable {

    /** Primary key. */
    protected static final String PK = "stageMemberPrefsId";

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
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="stage_member_prefs_id", unique=true, nullable=false, precision=19)
    private long stageMemberPrefsId;
    @Column(name="mem_fulflmnt_pref_id", nullable=false, precision=19)
    private long memFulflmntPrefId;
    @Column(name="comm_category_id", precision=10)
    private BigDecimal commCategoryId;
    @Column(name="comm_category_desc", length=100)
    private String commCategoryDesc;
    @Column(name="default_fulfillment_type_id", precision=10)
    private BigDecimal defaultFulfillmentTypeId;
    @Column(name="fulfillment_type", length=250)
    private String fulfillmentType;
    @Column(name="created_by", nullable=false, length=200)
    private String createdBy;
    @Column(name="created_date", nullable=false)
    private Timestamp createdDate;
    @Column(name="updated_by", length=200)
    private String updatedBy;
    @Column(name="updated_date")
    private Timestamp updatedDate;
    @Column(name="opt_out_fl", precision=1)
    private BigDecimal optOutFl;
    @Column(name="membership_id", precision=19)
    private long membershipId;
    @Column(name="comm_preference_source_id", precision=10)
    private BigDecimal commPreferenceSourceId;
    @Column(name="comm_preference_source", length=100)
    private String commPreferenceSource;
    @Column(name="optout_start")
    private Timestamp optoutStart;
    @Column(name="optout_end")
    private Timestamp optoutEnd;
    @ManyToOne(optional=false)
    @JoinColumn(name="member_id", nullable=false)
    private StageMember stageMember;

    /** Default constructor. */
    public StageMemberPrefs() {
        super();
    }

    /**
     * Access method for stageMemberPrefsId.
     *
     * @return the current value of stageMemberPrefsId
     */
    public long getStageMemberPrefsId() {
        return stageMemberPrefsId;
    }

    /**
     * Setter method for stageMemberPrefsId.
     *
     * @param aStageMemberPrefsId the new value for stageMemberPrefsId
     */
    public void setStageMemberPrefsId(long aStageMemberPrefsId) {
        stageMemberPrefsId = aStageMemberPrefsId;
    }

    /**
     * Access method for memFulflmntPrefId.
     *
     * @return the current value of memFulflmntPrefId
     */
    public long getMemFulflmntPrefId() {
        return memFulflmntPrefId;
    }

    /**
     * Setter method for memFulflmntPrefId.
     *
     * @param aMemFulflmntPrefId the new value for memFulflmntPrefId
     */
    public void setMemFulflmntPrefId(long aMemFulflmntPrefId) {
        memFulflmntPrefId = aMemFulflmntPrefId;
    }

    /**
     * Access method for commCategoryId.
     *
     * @return the current value of commCategoryId
     */
    public BigDecimal getCommCategoryId() {
        return commCategoryId;
    }

    /**
     * Setter method for commCategoryId.
     *
     * @param aCommCategoryId the new value for commCategoryId
     */
    public void setCommCategoryId(BigDecimal aCommCategoryId) {
        commCategoryId = aCommCategoryId;
    }

    /**
     * Access method for commCategoryDesc.
     *
     * @return the current value of commCategoryDesc
     */
    public String getCommCategoryDesc() {
        return commCategoryDesc;
    }

    /**
     * Setter method for commCategoryDesc.
     *
     * @param aCommCategoryDesc the new value for commCategoryDesc
     */
    public void setCommCategoryDesc(String aCommCategoryDesc) {
        commCategoryDesc = aCommCategoryDesc;
    }

    /**
     * Access method for defaultFulfillmentTypeId.
     *
     * @return the current value of defaultFulfillmentTypeId
     */
    public BigDecimal getDefaultFulfillmentTypeId() {
        return defaultFulfillmentTypeId;
    }

    /**
     * Setter method for defaultFulfillmentTypeId.
     *
     * @param aDefaultFulfillmentTypeId the new value for defaultFulfillmentTypeId
     */
    public void setDefaultFulfillmentTypeId(BigDecimal aDefaultFulfillmentTypeId) {
        defaultFulfillmentTypeId = aDefaultFulfillmentTypeId;
    }

    /**
     * Access method for fulfillmentType.
     *
     * @return the current value of fulfillmentType
     */
    public String getFulfillmentType() {
        return fulfillmentType;
    }

    /**
     * Setter method for fulfillmentType.
     *
     * @param aFulfillmentType the new value for fulfillmentType
     */
    public void setFulfillmentType(String aFulfillmentType) {
        fulfillmentType = aFulfillmentType;
    }

    /**
     * Access method for createdBy.
     *
     * @return the current value of createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Setter method for createdBy.
     *
     * @param aCreatedBy the new value for createdBy
     */
    public void setCreatedBy(String aCreatedBy) {
        createdBy = aCreatedBy;
    }

    /**
     * Access method for createdDate.
     *
     * @return the current value of createdDate
     */
    public Timestamp getCreatedDate() {
        return createdDate;
    }

    /**
     * Setter method for createdDate.
     *
     * @param aCreatedDate the new value for createdDate
     */
    public void setCreatedDate(Timestamp aCreatedDate) {
        createdDate = aCreatedDate;
    }

    /**
     * Access method for updatedBy.
     *
     * @return the current value of updatedBy
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * Setter method for updatedBy.
     *
     * @param aUpdatedBy the new value for updatedBy
     */
    public void setUpdatedBy(String aUpdatedBy) {
        updatedBy = aUpdatedBy;
    }

    /**
     * Access method for updatedDate.
     *
     * @return the current value of updatedDate
     */
    public Timestamp getUpdatedDate() {
        return updatedDate;
    }

    /**
     * Setter method for updatedDate.
     *
     * @param aUpdatedDate the new value for updatedDate
     */
    public void setUpdatedDate(Timestamp aUpdatedDate) {
        updatedDate = aUpdatedDate;
    }

    /**
     * Access method for optOutFl.
     *
     * @return the current value of optOutFl
     */
    public BigDecimal getOptOutFl() {
        return optOutFl;
    }

    /**
     * Setter method for optOutFl.
     *
     * @param aOptOutFl the new value for optOutFl
     */
    public void setOptOutFl(BigDecimal aOptOutFl) {
        optOutFl = aOptOutFl;
    }

    /**
     * Access method for membershipId.
     *
     * @return the current value of membershipId
     */
    public long getMembershipId() {
        return membershipId;
    }

    /**
     * Setter method for membershipId.
     *
     * @param aMembershipId the new value for membershipId
     */
    public void setMembershipId(long aMembershipId) {
        membershipId = aMembershipId;
    }

    /**
     * Access method for commPreferenceSourceId.
     *
     * @return the current value of commPreferenceSourceId
     */
    public BigDecimal getCommPreferenceSourceId() {
        return commPreferenceSourceId;
    }

    /**
     * Setter method for commPreferenceSourceId.
     *
     * @param aCommPreferenceSourceId the new value for commPreferenceSourceId
     */
    public void setCommPreferenceSourceId(BigDecimal aCommPreferenceSourceId) {
        commPreferenceSourceId = aCommPreferenceSourceId;
    }

    /**
     * Access method for commPreferenceSource.
     *
     * @return the current value of commPreferenceSource
     */
    public String getCommPreferenceSource() {
        return commPreferenceSource;
    }

    /**
     * Setter method for commPreferenceSource.
     *
     * @param aCommPreferenceSource the new value for commPreferenceSource
     */
    public void setCommPreferenceSource(String aCommPreferenceSource) {
        commPreferenceSource = aCommPreferenceSource;
    }

    /**
     * Access method for optoutStart.
     *
     * @return the current value of optoutStart
     */
    public Timestamp getOptoutStart() {
        return optoutStart;
    }

    /**
     * Setter method for optoutStart.
     *
     * @param aOptoutStart the new value for optoutStart
     */
    public void setOptoutStart(Timestamp aOptoutStart) {
        optoutStart = aOptoutStart;
    }

    /**
     * Access method for optoutEnd.
     *
     * @return the current value of optoutEnd
     */
    public Timestamp getOptoutEnd() {
        return optoutEnd;
    }

    /**
     * Setter method for optoutEnd.
     *
     * @param aOptoutEnd the new value for optoutEnd
     */
    public void setOptoutEnd(Timestamp aOptoutEnd) {
        optoutEnd = aOptoutEnd;
    }

    /**
     * Access method for stageMember.
     *
     * @return the current value of stageMember
     */
    public StageMember getStageMember() {
        return stageMember;
    }

    /**
     * Setter method for stageMember.
     *
     * @param aStageMember the new value for stageMember
     */
    public void setStageMember(StageMember aStageMember) {
        stageMember = aStageMember;
    }

    /**
     * Compares the key for this instance with another StageMemberPrefs.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class StageMemberPrefs and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof StageMemberPrefs)) {
            return false;
        }
        StageMemberPrefs that = (StageMemberPrefs) other;
        if (this.getStageMemberPrefsId() != that.getStageMemberPrefsId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another StageMemberPrefs.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof StageMemberPrefs)) return false;
        return this.equalKeys(other) && ((StageMemberPrefs)other).equalKeys(this);
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
        i = (int)(getStageMemberPrefsId() ^ (getStageMemberPrefsId()>>>32));
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
        StringBuffer sb = new StringBuffer("[StageMemberPrefs |");
        sb.append(" stageMemberPrefsId=").append(getStageMemberPrefsId());
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
        ret.put("stageMemberPrefsId", Long.valueOf(getStageMemberPrefsId()));
        return ret;
    }

}
