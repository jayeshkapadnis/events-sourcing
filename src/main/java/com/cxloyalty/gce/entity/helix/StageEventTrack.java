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

@Entity(name="stage_event_track")
public class StageEventTrack implements Serializable {

    /** Primary key. */
    protected static final String PK = "eventTrackId";

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
    @Column(name="event_track_id", unique=true, nullable=false, precision=19)
    private long eventTrackId;
    @Column(name="event_track_action_type_id", nullable=false, precision=9)
    private BigDecimal eventTrackActionTypeId;
    @Column(name="event_track_action_type", length=200)
    private String eventTrackActionType;
    @Column(name="action_description", length=2000)
    private String actionDescription;
    @Column(name="action_username", nullable=false, length=200)
    private String actionUsername;
    @Column(name="source_system_id", precision=4)
    private BigDecimal sourceSystemId;
    @Column(name="source_system_desc", length=40)
    private String sourceSystemDesc;
    @Column(name="source_system_batch_sla_flag", nullable=false, precision=1)
    private BigDecimal sourceSystemBatchSlaFlag;
    @Column(name="action_date", nullable=false)
    private Timestamp actionDate;
    @Column(name="user_created", nullable=false, length=200)
    private String userCreated;
    @Column(name="date_created")
    private Timestamp dateCreated;
    @Column(name="user_modified", length=200)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @Column(name="membership_id", nullable=false, precision=19)
    private long membershipId;
    @OneToMany(mappedBy="stageEventTrack")
    private Set<StageEventTrackAttribute> stageEventTrackAttribute;
    @ManyToOne(optional=false)
    @JoinColumn(name="member_id", nullable=false)
    private StageMember stageMember;

    /** Default constructor. */
    public StageEventTrack() {
        super();
    }

    /**
     * Access method for eventTrackId.
     *
     * @return the current value of eventTrackId
     */
    public long getEventTrackId() {
        return eventTrackId;
    }

    /**
     * Setter method for eventTrackId.
     *
     * @param aEventTrackId the new value for eventTrackId
     */
    public void setEventTrackId(long aEventTrackId) {
        eventTrackId = aEventTrackId;
    }

    /**
     * Access method for eventTrackActionTypeId.
     *
     * @return the current value of eventTrackActionTypeId
     */
    public BigDecimal getEventTrackActionTypeId() {
        return eventTrackActionTypeId;
    }

    /**
     * Setter method for eventTrackActionTypeId.
     *
     * @param aEventTrackActionTypeId the new value for eventTrackActionTypeId
     */
    public void setEventTrackActionTypeId(BigDecimal aEventTrackActionTypeId) {
        eventTrackActionTypeId = aEventTrackActionTypeId;
    }

    /**
     * Access method for eventTrackActionType.
     *
     * @return the current value of eventTrackActionType
     */
    public String getEventTrackActionType() {
        return eventTrackActionType;
    }

    /**
     * Setter method for eventTrackActionType.
     *
     * @param aEventTrackActionType the new value for eventTrackActionType
     */
    public void setEventTrackActionType(String aEventTrackActionType) {
        eventTrackActionType = aEventTrackActionType;
    }

    /**
     * Access method for actionDescription.
     *
     * @return the current value of actionDescription
     */
    public String getActionDescription() {
        return actionDescription;
    }

    /**
     * Setter method for actionDescription.
     *
     * @param aActionDescription the new value for actionDescription
     */
    public void setActionDescription(String aActionDescription) {
        actionDescription = aActionDescription;
    }

    /**
     * Access method for actionUsername.
     *
     * @return the current value of actionUsername
     */
    public String getActionUsername() {
        return actionUsername;
    }

    /**
     * Setter method for actionUsername.
     *
     * @param aActionUsername the new value for actionUsername
     */
    public void setActionUsername(String aActionUsername) {
        actionUsername = aActionUsername;
    }

    /**
     * Access method for sourceSystemId.
     *
     * @return the current value of sourceSystemId
     */
    public BigDecimal getSourceSystemId() {
        return sourceSystemId;
    }

    /**
     * Setter method for sourceSystemId.
     *
     * @param aSourceSystemId the new value for sourceSystemId
     */
    public void setSourceSystemId(BigDecimal aSourceSystemId) {
        sourceSystemId = aSourceSystemId;
    }

    /**
     * Access method for sourceSystemDesc.
     *
     * @return the current value of sourceSystemDesc
     */
    public String getSourceSystemDesc() {
        return sourceSystemDesc;
    }

    /**
     * Setter method for sourceSystemDesc.
     *
     * @param aSourceSystemDesc the new value for sourceSystemDesc
     */
    public void setSourceSystemDesc(String aSourceSystemDesc) {
        sourceSystemDesc = aSourceSystemDesc;
    }

    /**
     * Access method for sourceSystemBatchSlaFlag.
     *
     * @return the current value of sourceSystemBatchSlaFlag
     */
    public BigDecimal getSourceSystemBatchSlaFlag() {
        return sourceSystemBatchSlaFlag;
    }

    /**
     * Setter method for sourceSystemBatchSlaFlag.
     *
     * @param aSourceSystemBatchSlaFlag the new value for sourceSystemBatchSlaFlag
     */
    public void setSourceSystemBatchSlaFlag(BigDecimal aSourceSystemBatchSlaFlag) {
        sourceSystemBatchSlaFlag = aSourceSystemBatchSlaFlag;
    }

    /**
     * Access method for actionDate.
     *
     * @return the current value of actionDate
     */
    public Timestamp getActionDate() {
        return actionDate;
    }

    /**
     * Setter method for actionDate.
     *
     * @param aActionDate the new value for actionDate
     */
    public void setActionDate(Timestamp aActionDate) {
        actionDate = aActionDate;
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
     * Access method for stageEventTrackAttribute.
     *
     * @return the current value of stageEventTrackAttribute
     */
    public Set<StageEventTrackAttribute> getStageEventTrackAttribute() {
        return stageEventTrackAttribute;
    }

    /**
     * Setter method for stageEventTrackAttribute.
     *
     * @param aStageEventTrackAttribute the new value for stageEventTrackAttribute
     */
    public void setStageEventTrackAttribute(Set<StageEventTrackAttribute> aStageEventTrackAttribute) {
        stageEventTrackAttribute = aStageEventTrackAttribute;
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
     * Compares the key for this instance with another StageEventTrack.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class StageEventTrack and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof StageEventTrack)) {
            return false;
        }
        StageEventTrack that = (StageEventTrack) other;
        if (this.getEventTrackId() != that.getEventTrackId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another StageEventTrack.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof StageEventTrack)) return false;
        return this.equalKeys(other) && ((StageEventTrack)other).equalKeys(this);
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
        i = (int)(getEventTrackId() ^ (getEventTrackId()>>>32));
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
        StringBuffer sb = new StringBuffer("[StageEventTrack |");
        sb.append(" eventTrackId=").append(getEventTrackId());
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
        ret.put("eventTrackId", Long.valueOf(getEventTrackId()));
        return ret;
    }

}
