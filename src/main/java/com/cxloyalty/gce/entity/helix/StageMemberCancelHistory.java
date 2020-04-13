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

@Entity(name="stage_member_cancel_history")
public class StageMemberCancelHistory implements Serializable {

    /** Primary key. */
    protected static final String PK = "stageMemCnclHistId";

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
    @Column(name="stage_mem_cncl_hist_id", unique=true, nullable=false, precision=19)
    private long stageMemCnclHistId;
    @Column(name="cancel_request_date", nullable=false)
    private Timestamp cancelRequestDate;
    @Column(name="cancel_source", nullable=false, length=30)
    private String cancelSource;
    @Column(name="cancel_auth_user", nullable=false, length=30)
    private String cancelAuthUser;
    @Column(name="cancel_reason", length=100)
    private String cancelReason;
    @Column(name="user_created", nullable=false, length=30)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=30)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @Column(name="member_cancel_type_desc", nullable=false, length=30)
    private String memberCancelTypeDesc;
    @Column(name="member_cancel_type_id", nullable=false, length=100)
    private String memberCancelTypeId;
    @Column(name="member_cancel_channel_desc", nullable=false, length=100)
    private String memberCancelChannelDesc;
    @Column(name="member_cancel_channel_id", nullable=false, precision=10)
    private BigDecimal memberCancelChannelId;
    @Column(name="member_cancel_reason_desc", nullable=false, length=100)
    private String memberCancelReasonDesc;
    @Column(name="member_cancel_reason_id", nullable=false, precision=19)
    private long memberCancelReasonId;
    @ManyToOne(optional=false)
    @JoinColumn(name="member_id", nullable=false)
    private StageMember stageMember;

    /** Default constructor. */
    public StageMemberCancelHistory() {
        super();
    }

    /**
     * Access method for stageMemCnclHistId.
     *
     * @return the current value of stageMemCnclHistId
     */
    public long getStageMemCnclHistId() {
        return stageMemCnclHistId;
    }

    /**
     * Setter method for stageMemCnclHistId.
     *
     * @param aStageMemCnclHistId the new value for stageMemCnclHistId
     */
    public void setStageMemCnclHistId(long aStageMemCnclHistId) {
        stageMemCnclHistId = aStageMemCnclHistId;
    }

    /**
     * Access method for cancelRequestDate.
     *
     * @return the current value of cancelRequestDate
     */
    public Timestamp getCancelRequestDate() {
        return cancelRequestDate;
    }

    /**
     * Setter method for cancelRequestDate.
     *
     * @param aCancelRequestDate the new value for cancelRequestDate
     */
    public void setCancelRequestDate(Timestamp aCancelRequestDate) {
        cancelRequestDate = aCancelRequestDate;
    }

    /**
     * Access method for cancelSource.
     *
     * @return the current value of cancelSource
     */
    public String getCancelSource() {
        return cancelSource;
    }

    /**
     * Setter method for cancelSource.
     *
     * @param aCancelSource the new value for cancelSource
     */
    public void setCancelSource(String aCancelSource) {
        cancelSource = aCancelSource;
    }

    /**
     * Access method for cancelAuthUser.
     *
     * @return the current value of cancelAuthUser
     */
    public String getCancelAuthUser() {
        return cancelAuthUser;
    }

    /**
     * Setter method for cancelAuthUser.
     *
     * @param aCancelAuthUser the new value for cancelAuthUser
     */
    public void setCancelAuthUser(String aCancelAuthUser) {
        cancelAuthUser = aCancelAuthUser;
    }

    /**
     * Access method for cancelReason.
     *
     * @return the current value of cancelReason
     */
    public String getCancelReason() {
        return cancelReason;
    }

    /**
     * Setter method for cancelReason.
     *
     * @param aCancelReason the new value for cancelReason
     */
    public void setCancelReason(String aCancelReason) {
        cancelReason = aCancelReason;
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
     * Access method for memberCancelTypeDesc.
     *
     * @return the current value of memberCancelTypeDesc
     */
    public String getMemberCancelTypeDesc() {
        return memberCancelTypeDesc;
    }

    /**
     * Setter method for memberCancelTypeDesc.
     *
     * @param aMemberCancelTypeDesc the new value for memberCancelTypeDesc
     */
    public void setMemberCancelTypeDesc(String aMemberCancelTypeDesc) {
        memberCancelTypeDesc = aMemberCancelTypeDesc;
    }

    /**
     * Access method for memberCancelTypeId.
     *
     * @return the current value of memberCancelTypeId
     */
    public String getMemberCancelTypeId() {
        return memberCancelTypeId;
    }

    /**
     * Setter method for memberCancelTypeId.
     *
     * @param aMemberCancelTypeId the new value for memberCancelTypeId
     */
    public void setMemberCancelTypeId(String aMemberCancelTypeId) {
        memberCancelTypeId = aMemberCancelTypeId;
    }

    /**
     * Access method for memberCancelChannelDesc.
     *
     * @return the current value of memberCancelChannelDesc
     */
    public String getMemberCancelChannelDesc() {
        return memberCancelChannelDesc;
    }

    /**
     * Setter method for memberCancelChannelDesc.
     *
     * @param aMemberCancelChannelDesc the new value for memberCancelChannelDesc
     */
    public void setMemberCancelChannelDesc(String aMemberCancelChannelDesc) {
        memberCancelChannelDesc = aMemberCancelChannelDesc;
    }

    /**
     * Access method for memberCancelChannelId.
     *
     * @return the current value of memberCancelChannelId
     */
    public BigDecimal getMemberCancelChannelId() {
        return memberCancelChannelId;
    }

    /**
     * Setter method for memberCancelChannelId.
     *
     * @param aMemberCancelChannelId the new value for memberCancelChannelId
     */
    public void setMemberCancelChannelId(BigDecimal aMemberCancelChannelId) {
        memberCancelChannelId = aMemberCancelChannelId;
    }

    /**
     * Access method for memberCancelReasonDesc.
     *
     * @return the current value of memberCancelReasonDesc
     */
    public String getMemberCancelReasonDesc() {
        return memberCancelReasonDesc;
    }

    /**
     * Setter method for memberCancelReasonDesc.
     *
     * @param aMemberCancelReasonDesc the new value for memberCancelReasonDesc
     */
    public void setMemberCancelReasonDesc(String aMemberCancelReasonDesc) {
        memberCancelReasonDesc = aMemberCancelReasonDesc;
    }

    /**
     * Access method for memberCancelReasonId.
     *
     * @return the current value of memberCancelReasonId
     */
    public long getMemberCancelReasonId() {
        return memberCancelReasonId;
    }

    /**
     * Setter method for memberCancelReasonId.
     *
     * @param aMemberCancelReasonId the new value for memberCancelReasonId
     */
    public void setMemberCancelReasonId(long aMemberCancelReasonId) {
        memberCancelReasonId = aMemberCancelReasonId;
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
     * Compares the key for this instance with another StageMemberCancelHistory.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class StageMemberCancelHistory and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof StageMemberCancelHistory)) {
            return false;
        }
        StageMemberCancelHistory that = (StageMemberCancelHistory) other;
        if (this.getStageMemCnclHistId() != that.getStageMemCnclHistId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another StageMemberCancelHistory.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof StageMemberCancelHistory)) return false;
        return this.equalKeys(other) && ((StageMemberCancelHistory)other).equalKeys(this);
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
        i = (int)(getStageMemCnclHistId() ^ (getStageMemCnclHistId()>>>32));
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
        StringBuffer sb = new StringBuffer("[StageMemberCancelHistory |");
        sb.append(" stageMemCnclHistId=").append(getStageMemCnclHistId());
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
        ret.put("stageMemCnclHistId", Long.valueOf(getStageMemCnclHistId()));
        return ret;
    }

}
