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

@Entity(name="stage_membership_member")
public class StageMembershipMember implements Serializable {

    /** Primary key. */
    protected static final String PK = "stageMembershipMemberId";

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
    @Column(name="stage_membership_member_id", unique=true, nullable=false, precision=19)
    private long stageMembershipMemberId;
    @Column(name="membership_id", nullable=false, precision=19)
    private long membershipId;
    @Column(name="is_active", length=1)
    private boolean isActive;
    @Column(name="member_status", length=10)
    private String memberStatus;
    @Column(name="created_by", nullable=false, length=120)
    private String createdBy;
    @Column(name="created_date", nullable=false)
    private Timestamp createdDate;
    @Column(name="updated_by", length=120)
    private String updatedBy;
    @Column(name="updated_date")
    private Timestamp updatedDate;
    @Column(name="is_primary", length=1)
    private boolean isPrimary;
    @Column(name="member_join_date")
    private Timestamp memberJoinDate;
    @Column(name="cancelled_date")
    private Timestamp cancelledDate;
    @Column(name="cancelled_reason_id", precision=19)
    private long cancelledReasonId;
    @Column(name="cancelled_reason", length=30)
    private String cancelledReason;
    @Column(name="reinstate_rsn_id", precision=19)
    private long reinstateRsnId;
    @Column(name="reinstate_reason", length=4000)
    private String reinstateReason;
    @Column(name="declassified_fl", precision=1)
    private BigDecimal declassifiedFl;
    @Column(name="end_date")
    private Timestamp endDate;
    @Column(name="member_number", length=100)
    private String memberNumber;
    @Column(name="ext_member_ref", length=100)
    private String extMemberRef;
    @ManyToOne(optional=false)
    @JoinColumn(name="member_id", nullable=false)
    private StageMember stageMember;

    /** Default constructor. */
    public StageMembershipMember() {
        super();
    }

    /**
     * Access method for stageMembershipMemberId.
     *
     * @return the current value of stageMembershipMemberId
     */
    public long getStageMembershipMemberId() {
        return stageMembershipMemberId;
    }

    /**
     * Setter method for stageMembershipMemberId.
     *
     * @param aStageMembershipMemberId the new value for stageMembershipMemberId
     */
    public void setStageMembershipMemberId(long aStageMembershipMemberId) {
        stageMembershipMemberId = aStageMembershipMemberId;
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
     * Access method for isActive.
     *
     * @return true if and only if isActive is currently true
     */
    public boolean getIsActive() {
        return isActive;
    }

    /**
     * Setter method for isActive.
     *
     * @param aIsActive the new value for isActive
     */
    public void setIsActive(boolean aIsActive) {
        isActive = aIsActive;
    }

    /**
     * Access method for memberStatus.
     *
     * @return the current value of memberStatus
     */
    public String getMemberStatus() {
        return memberStatus;
    }

    /**
     * Setter method for memberStatus.
     *
     * @param aMemberStatus the new value for memberStatus
     */
    public void setMemberStatus(String aMemberStatus) {
        memberStatus = aMemberStatus;
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
     * Access method for isPrimary.
     *
     * @return true if and only if isPrimary is currently true
     */
    public boolean getIsPrimary() {
        return isPrimary;
    }

    /**
     * Setter method for isPrimary.
     *
     * @param aIsPrimary the new value for isPrimary
     */
    public void setIsPrimary(boolean aIsPrimary) {
        isPrimary = aIsPrimary;
    }

    /**
     * Access method for memberJoinDate.
     *
     * @return the current value of memberJoinDate
     */
    public Timestamp getMemberJoinDate() {
        return memberJoinDate;
    }

    /**
     * Setter method for memberJoinDate.
     *
     * @param aMemberJoinDate the new value for memberJoinDate
     */
    public void setMemberJoinDate(Timestamp aMemberJoinDate) {
        memberJoinDate = aMemberJoinDate;
    }

    /**
     * Access method for cancelledDate.
     *
     * @return the current value of cancelledDate
     */
    public Timestamp getCancelledDate() {
        return cancelledDate;
    }

    /**
     * Setter method for cancelledDate.
     *
     * @param aCancelledDate the new value for cancelledDate
     */
    public void setCancelledDate(Timestamp aCancelledDate) {
        cancelledDate = aCancelledDate;
    }

    /**
     * Access method for cancelledReasonId.
     *
     * @return the current value of cancelledReasonId
     */
    public long getCancelledReasonId() {
        return cancelledReasonId;
    }

    /**
     * Setter method for cancelledReasonId.
     *
     * @param aCancelledReasonId the new value for cancelledReasonId
     */
    public void setCancelledReasonId(long aCancelledReasonId) {
        cancelledReasonId = aCancelledReasonId;
    }

    /**
     * Access method for cancelledReason.
     *
     * @return the current value of cancelledReason
     */
    public String getCancelledReason() {
        return cancelledReason;
    }

    /**
     * Setter method for cancelledReason.
     *
     * @param aCancelledReason the new value for cancelledReason
     */
    public void setCancelledReason(String aCancelledReason) {
        cancelledReason = aCancelledReason;
    }

    /**
     * Access method for reinstateRsnId.
     *
     * @return the current value of reinstateRsnId
     */
    public long getReinstateRsnId() {
        return reinstateRsnId;
    }

    /**
     * Setter method for reinstateRsnId.
     *
     * @param aReinstateRsnId the new value for reinstateRsnId
     */
    public void setReinstateRsnId(long aReinstateRsnId) {
        reinstateRsnId = aReinstateRsnId;
    }

    /**
     * Access method for reinstateReason.
     *
     * @return the current value of reinstateReason
     */
    public String getReinstateReason() {
        return reinstateReason;
    }

    /**
     * Setter method for reinstateReason.
     *
     * @param aReinstateReason the new value for reinstateReason
     */
    public void setReinstateReason(String aReinstateReason) {
        reinstateReason = aReinstateReason;
    }

    /**
     * Access method for declassifiedFl.
     *
     * @return the current value of declassifiedFl
     */
    public BigDecimal getDeclassifiedFl() {
        return declassifiedFl;
    }

    /**
     * Setter method for declassifiedFl.
     *
     * @param aDeclassifiedFl the new value for declassifiedFl
     */
    public void setDeclassifiedFl(BigDecimal aDeclassifiedFl) {
        declassifiedFl = aDeclassifiedFl;
    }

    /**
     * Access method for endDate.
     *
     * @return the current value of endDate
     */
    public Timestamp getEndDate() {
        return endDate;
    }

    /**
     * Setter method for endDate.
     *
     * @param aEndDate the new value for endDate
     */
    public void setEndDate(Timestamp aEndDate) {
        endDate = aEndDate;
    }

    /**
     * Access method for memberNumber.
     *
     * @return the current value of memberNumber
     */
    public String getMemberNumber() {
        return memberNumber;
    }

    /**
     * Setter method for memberNumber.
     *
     * @param aMemberNumber the new value for memberNumber
     */
    public void setMemberNumber(String aMemberNumber) {
        memberNumber = aMemberNumber;
    }

    /**
     * Access method for extMemberRef.
     *
     * @return the current value of extMemberRef
     */
    public String getExtMemberRef() {
        return extMemberRef;
    }

    /**
     * Setter method for extMemberRef.
     *
     * @param aExtMemberRef the new value for extMemberRef
     */
    public void setExtMemberRef(String aExtMemberRef) {
        extMemberRef = aExtMemberRef;
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
     * Compares the key for this instance with another StageMembershipMember.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class StageMembershipMember and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof StageMembershipMember)) {
            return false;
        }
        StageMembershipMember that = (StageMembershipMember) other;
        if (this.getStageMembershipMemberId() != that.getStageMembershipMemberId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another StageMembershipMember.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof StageMembershipMember)) return false;
        return this.equalKeys(other) && ((StageMembershipMember)other).equalKeys(this);
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
        i = (int)(getStageMembershipMemberId() ^ (getStageMembershipMemberId()>>>32));
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
        StringBuffer sb = new StringBuffer("[StageMembershipMember |");
        sb.append(" stageMembershipMemberId=").append(getStageMembershipMemberId());
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
        ret.put("stageMembershipMemberId", Long.valueOf(getStageMembershipMemberId()));
        return ret;
    }

}
