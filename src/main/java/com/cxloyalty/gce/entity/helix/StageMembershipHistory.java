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
import javax.persistence.Version;

@Entity(name="stage_membership_history")
public class StageMembershipHistory implements Serializable {

    /** Primary key. */
    protected static final String PK = "stageMembershipHistoryId";

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
    @Column(name="stage_membership_history_id", unique=true, nullable=false, precision=19)
    private long stageMembershipHistoryId;
    @Column(name="membership_id", nullable=false, precision=19)
    private long membershipId;
    @Column(name="membership_type_id", nullable=false, precision=10)
    private BigDecimal membershipTypeId;
    @Column(name="membership_type_desc", nullable=false, length=100)
    private String membershipTypeDesc;
    @Column(name="user_created", nullable=false, length=120)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=120)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @Column(name="membership_num", length=100)
    private String membershipNum;
    @Column(name="partner_mem_count", precision=10)
    private BigDecimal partnerMemCount;
    @Column(name="membership_start_date")
    private Timestamp membershipStartDate;
    @Column(name="external_membership_number", length=100)
    private String externalMembershipNumber;
    @Column(name="inactive_date")
    private Timestamp inactiveDate;
    @Column(name="prm_mem_id", precision=19)
    private long prmMemId;
    @Column(name="membership_status_id", precision=19)
    private long membershipStatusId;
    @Column(name="member_status_desc", length=4000)
    private String memberStatusDesc;
    @Column(name="membership_guid", nullable=false, length=36)
    private String membershipGuid;
    @Column(name="sub_start_dt")
    private Timestamp subStartDt;
    @Column(name="curr_mem_subscrip_dtl_id", precision=10)
    private BigDecimal currMemSubscripDtlId;
    @Column(name="sub_status_id", precision=19)
    private long subStatusId;
    @Column(name="sub_status_desc", length=4000)
    private String subStatusDesc;
    @Column(name="mem_sub_user_created", length=120)
    private String memSubUserCreated;
    @Column(name="mem_sub_date_created")
    private Timestamp memSubDateCreated;
    @Column(name="mem_sub_user_modified", length=120)
    private String memSubUserModified;
    @Column(name="mem_sub_date_modified")
    private Timestamp memSubDateModified;
    @Column(name="mem_subscription_detail_id", nullable=false, precision=10)
    private BigDecimal memSubscriptionDetailId;
    @Column(name="mem_subscription_id", nullable=false, precision=10)
    private BigDecimal memSubscriptionId;
    @Column(name="sol_id", precision=10)
    private BigDecimal solId;
    @Column(name="source_id", precision=10)
    private BigDecimal sourceId;
    @Column(name="mem_sub_detail_active_date")
    private Timestamp memSubDetailActiveDate;
    @Column(name="mem_sub_detail_inactive_date")
    private Timestamp memSubDetailInactiveDate;
    @Column(name="active_fl", precision=1)
    private BigDecimal activeFl;
    @Column(name="mem_sub_detail_user_created", nullable=false, length=200)
    private String memSubDetailUserCreated;
    @Column(name="mem_sub_detail_date_created", nullable=false)
    private Timestamp memSubDetailDateCreated;
    @Column(name="mem_sub_detail_user_modified", length=200)
    private String memSubDetailUserModified;
    @Column(name="mem_sub_detail_date_modified")
    private Timestamp memSubDetailDateModified;
    @Column(name="enrollment_source", length=250)
    private String enrollmentSource;
    @Column(name="sub_dtl_type_id", precision=10)
    private BigDecimal subDtlTypeId;
    @Column(name="member_type_desc", length=100)
    private String memberTypeDesc;
    @Column(name="sub_create_rsn_id", precision=8)
    private BigDecimal subCreateRsnId;
    @Column(name="sub_create_rsn_desc", length=50)
    private String subCreateRsnDesc;
    @Column(name="reinstate_rsn_id", precision=19)
    private long reinstateRsnId;
    @Column(name="member_reinstate_rsn_desc", length=4000)
    private String memberReinstateRsnDesc;
    @Column(name="tier_chng_rsn_id", precision=8)
    private BigDecimal tierChngRsnId;
    @Column(name="cancel_rsn_id", precision=19)
    private long cancelRsnId;
    @Column(name="subscrbtn_cancel_reason_desc", length=4000)
    private String subscrbtnCancelReasonDesc;
    @Column(name="prnt_mem_subscription_dtl_id", precision=10)
    private BigDecimal prntMemSubscriptionDtlId;
    @Column(length=1000)
    private String comments;
    @Column(name="cancel_source", length=30)
    private String cancelSource;
    @Column(name="cancel_auth_user", length=30)
    private String cancelAuthUser;
    @Column(name="cancel_type_id", precision=19)
    private long cancelTypeId;
    @Column(name="member_cancel_type_desc", length=30)
    private String memberCancelTypeDesc;
    @Column(name="cancel_channel_id", precision=10)
    private BigDecimal cancelChannelId;
    @Column(name="member_cancel_channel_desc", length=255)
    private String memberCancelChannelDesc;
    @Column(name="cancel_letter_requested_fl", precision=1)
    private BigDecimal cancelLetterRequestedFl;
    @Column(name="cancel_request_date")
    private Timestamp cancelRequestDate;
    @Column(name="limited_disclosure_read_flag", length=1)
    private String limitedDisclosureReadFlag;

    /** Default constructor. */
    public StageMembershipHistory() {
        super();
    }

    /**
     * Access method for stageMembershipHistoryId.
     *
     * @return the current value of stageMembershipHistoryId
     */
    public long getStageMembershipHistoryId() {
        return stageMembershipHistoryId;
    }

    /**
     * Setter method for stageMembershipHistoryId.
     *
     * @param aStageMembershipHistoryId the new value for stageMembershipHistoryId
     */
    public void setStageMembershipHistoryId(long aStageMembershipHistoryId) {
        stageMembershipHistoryId = aStageMembershipHistoryId;
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
     * Access method for membershipTypeId.
     *
     * @return the current value of membershipTypeId
     */
    public BigDecimal getMembershipTypeId() {
        return membershipTypeId;
    }

    /**
     * Setter method for membershipTypeId.
     *
     * @param aMembershipTypeId the new value for membershipTypeId
     */
    public void setMembershipTypeId(BigDecimal aMembershipTypeId) {
        membershipTypeId = aMembershipTypeId;
    }

    /**
     * Access method for membershipTypeDesc.
     *
     * @return the current value of membershipTypeDesc
     */
    public String getMembershipTypeDesc() {
        return membershipTypeDesc;
    }

    /**
     * Setter method for membershipTypeDesc.
     *
     * @param aMembershipTypeDesc the new value for membershipTypeDesc
     */
    public void setMembershipTypeDesc(String aMembershipTypeDesc) {
        membershipTypeDesc = aMembershipTypeDesc;
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
     * Access method for membershipNum.
     *
     * @return the current value of membershipNum
     */
    public String getMembershipNum() {
        return membershipNum;
    }

    /**
     * Setter method for membershipNum.
     *
     * @param aMembershipNum the new value for membershipNum
     */
    public void setMembershipNum(String aMembershipNum) {
        membershipNum = aMembershipNum;
    }

    /**
     * Access method for partnerMemCount.
     *
     * @return the current value of partnerMemCount
     */
    public BigDecimal getPartnerMemCount() {
        return partnerMemCount;
    }

    /**
     * Setter method for partnerMemCount.
     *
     * @param aPartnerMemCount the new value for partnerMemCount
     */
    public void setPartnerMemCount(BigDecimal aPartnerMemCount) {
        partnerMemCount = aPartnerMemCount;
    }

    /**
     * Access method for membershipStartDate.
     *
     * @return the current value of membershipStartDate
     */
    public Timestamp getMembershipStartDate() {
        return membershipStartDate;
    }

    /**
     * Setter method for membershipStartDate.
     *
     * @param aMembershipStartDate the new value for membershipStartDate
     */
    public void setMembershipStartDate(Timestamp aMembershipStartDate) {
        membershipStartDate = aMembershipStartDate;
    }

    /**
     * Access method for externalMembershipNumber.
     *
     * @return the current value of externalMembershipNumber
     */
    public String getExternalMembershipNumber() {
        return externalMembershipNumber;
    }

    /**
     * Setter method for externalMembershipNumber.
     *
     * @param aExternalMembershipNumber the new value for externalMembershipNumber
     */
    public void setExternalMembershipNumber(String aExternalMembershipNumber) {
        externalMembershipNumber = aExternalMembershipNumber;
    }

    /**
     * Access method for inactiveDate.
     *
     * @return the current value of inactiveDate
     */
    public Timestamp getInactiveDate() {
        return inactiveDate;
    }

    /**
     * Setter method for inactiveDate.
     *
     * @param aInactiveDate the new value for inactiveDate
     */
    public void setInactiveDate(Timestamp aInactiveDate) {
        inactiveDate = aInactiveDate;
    }

    /**
     * Access method for prmMemId.
     *
     * @return the current value of prmMemId
     */
    public long getPrmMemId() {
        return prmMemId;
    }

    /**
     * Setter method for prmMemId.
     *
     * @param aPrmMemId the new value for prmMemId
     */
    public void setPrmMemId(long aPrmMemId) {
        prmMemId = aPrmMemId;
    }

    /**
     * Access method for membershipStatusId.
     *
     * @return the current value of membershipStatusId
     */
    public long getMembershipStatusId() {
        return membershipStatusId;
    }

    /**
     * Setter method for membershipStatusId.
     *
     * @param aMembershipStatusId the new value for membershipStatusId
     */
    public void setMembershipStatusId(long aMembershipStatusId) {
        membershipStatusId = aMembershipStatusId;
    }

    /**
     * Access method for memberStatusDesc.
     *
     * @return the current value of memberStatusDesc
     */
    public String getMemberStatusDesc() {
        return memberStatusDesc;
    }

    /**
     * Setter method for memberStatusDesc.
     *
     * @param aMemberStatusDesc the new value for memberStatusDesc
     */
    public void setMemberStatusDesc(String aMemberStatusDesc) {
        memberStatusDesc = aMemberStatusDesc;
    }

    /**
     * Access method for membershipGuid.
     *
     * @return the current value of membershipGuid
     */
    public String getMembershipGuid() {
        return membershipGuid;
    }

    /**
     * Setter method for membershipGuid.
     *
     * @param aMembershipGuid the new value for membershipGuid
     */
    public void setMembershipGuid(String aMembershipGuid) {
        membershipGuid = aMembershipGuid;
    }

    /**
     * Access method for subStartDt.
     *
     * @return the current value of subStartDt
     */
    public Timestamp getSubStartDt() {
        return subStartDt;
    }

    /**
     * Setter method for subStartDt.
     *
     * @param aSubStartDt the new value for subStartDt
     */
    public void setSubStartDt(Timestamp aSubStartDt) {
        subStartDt = aSubStartDt;
    }

    /**
     * Access method for currMemSubscripDtlId.
     *
     * @return the current value of currMemSubscripDtlId
     */
    public BigDecimal getCurrMemSubscripDtlId() {
        return currMemSubscripDtlId;
    }

    /**
     * Setter method for currMemSubscripDtlId.
     *
     * @param aCurrMemSubscripDtlId the new value for currMemSubscripDtlId
     */
    public void setCurrMemSubscripDtlId(BigDecimal aCurrMemSubscripDtlId) {
        currMemSubscripDtlId = aCurrMemSubscripDtlId;
    }

    /**
     * Access method for subStatusId.
     *
     * @return the current value of subStatusId
     */
    public long getSubStatusId() {
        return subStatusId;
    }

    /**
     * Setter method for subStatusId.
     *
     * @param aSubStatusId the new value for subStatusId
     */
    public void setSubStatusId(long aSubStatusId) {
        subStatusId = aSubStatusId;
    }

    /**
     * Access method for subStatusDesc.
     *
     * @return the current value of subStatusDesc
     */
    public String getSubStatusDesc() {
        return subStatusDesc;
    }

    /**
     * Setter method for subStatusDesc.
     *
     * @param aSubStatusDesc the new value for subStatusDesc
     */
    public void setSubStatusDesc(String aSubStatusDesc) {
        subStatusDesc = aSubStatusDesc;
    }

    /**
     * Access method for memSubUserCreated.
     *
     * @return the current value of memSubUserCreated
     */
    public String getMemSubUserCreated() {
        return memSubUserCreated;
    }

    /**
     * Setter method for memSubUserCreated.
     *
     * @param aMemSubUserCreated the new value for memSubUserCreated
     */
    public void setMemSubUserCreated(String aMemSubUserCreated) {
        memSubUserCreated = aMemSubUserCreated;
    }

    /**
     * Access method for memSubDateCreated.
     *
     * @return the current value of memSubDateCreated
     */
    public Timestamp getMemSubDateCreated() {
        return memSubDateCreated;
    }

    /**
     * Setter method for memSubDateCreated.
     *
     * @param aMemSubDateCreated the new value for memSubDateCreated
     */
    public void setMemSubDateCreated(Timestamp aMemSubDateCreated) {
        memSubDateCreated = aMemSubDateCreated;
    }

    /**
     * Access method for memSubUserModified.
     *
     * @return the current value of memSubUserModified
     */
    public String getMemSubUserModified() {
        return memSubUserModified;
    }

    /**
     * Setter method for memSubUserModified.
     *
     * @param aMemSubUserModified the new value for memSubUserModified
     */
    public void setMemSubUserModified(String aMemSubUserModified) {
        memSubUserModified = aMemSubUserModified;
    }

    /**
     * Access method for memSubDateModified.
     *
     * @return the current value of memSubDateModified
     */
    public Timestamp getMemSubDateModified() {
        return memSubDateModified;
    }

    /**
     * Setter method for memSubDateModified.
     *
     * @param aMemSubDateModified the new value for memSubDateModified
     */
    public void setMemSubDateModified(Timestamp aMemSubDateModified) {
        memSubDateModified = aMemSubDateModified;
    }

    /**
     * Access method for memSubscriptionDetailId.
     *
     * @return the current value of memSubscriptionDetailId
     */
    public BigDecimal getMemSubscriptionDetailId() {
        return memSubscriptionDetailId;
    }

    /**
     * Setter method for memSubscriptionDetailId.
     *
     * @param aMemSubscriptionDetailId the new value for memSubscriptionDetailId
     */
    public void setMemSubscriptionDetailId(BigDecimal aMemSubscriptionDetailId) {
        memSubscriptionDetailId = aMemSubscriptionDetailId;
    }

    /**
     * Access method for memSubscriptionId.
     *
     * @return the current value of memSubscriptionId
     */
    public BigDecimal getMemSubscriptionId() {
        return memSubscriptionId;
    }

    /**
     * Setter method for memSubscriptionId.
     *
     * @param aMemSubscriptionId the new value for memSubscriptionId
     */
    public void setMemSubscriptionId(BigDecimal aMemSubscriptionId) {
        memSubscriptionId = aMemSubscriptionId;
    }

    /**
     * Access method for solId.
     *
     * @return the current value of solId
     */
    public BigDecimal getSolId() {
        return solId;
    }

    /**
     * Setter method for solId.
     *
     * @param aSolId the new value for solId
     */
    public void setSolId(BigDecimal aSolId) {
        solId = aSolId;
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
     * Access method for memSubDetailActiveDate.
     *
     * @return the current value of memSubDetailActiveDate
     */
    public Timestamp getMemSubDetailActiveDate() {
        return memSubDetailActiveDate;
    }

    /**
     * Setter method for memSubDetailActiveDate.
     *
     * @param aMemSubDetailActiveDate the new value for memSubDetailActiveDate
     */
    public void setMemSubDetailActiveDate(Timestamp aMemSubDetailActiveDate) {
        memSubDetailActiveDate = aMemSubDetailActiveDate;
    }

    /**
     * Access method for memSubDetailInactiveDate.
     *
     * @return the current value of memSubDetailInactiveDate
     */
    public Timestamp getMemSubDetailInactiveDate() {
        return memSubDetailInactiveDate;
    }

    /**
     * Setter method for memSubDetailInactiveDate.
     *
     * @param aMemSubDetailInactiveDate the new value for memSubDetailInactiveDate
     */
    public void setMemSubDetailInactiveDate(Timestamp aMemSubDetailInactiveDate) {
        memSubDetailInactiveDate = aMemSubDetailInactiveDate;
    }

    /**
     * Access method for activeFl.
     *
     * @return the current value of activeFl
     */
    public BigDecimal getActiveFl() {
        return activeFl;
    }

    /**
     * Setter method for activeFl.
     *
     * @param aActiveFl the new value for activeFl
     */
    public void setActiveFl(BigDecimal aActiveFl) {
        activeFl = aActiveFl;
    }

    /**
     * Access method for memSubDetailUserCreated.
     *
     * @return the current value of memSubDetailUserCreated
     */
    public String getMemSubDetailUserCreated() {
        return memSubDetailUserCreated;
    }

    /**
     * Setter method for memSubDetailUserCreated.
     *
     * @param aMemSubDetailUserCreated the new value for memSubDetailUserCreated
     */
    public void setMemSubDetailUserCreated(String aMemSubDetailUserCreated) {
        memSubDetailUserCreated = aMemSubDetailUserCreated;
    }

    /**
     * Access method for memSubDetailDateCreated.
     *
     * @return the current value of memSubDetailDateCreated
     */
    public Timestamp getMemSubDetailDateCreated() {
        return memSubDetailDateCreated;
    }

    /**
     * Setter method for memSubDetailDateCreated.
     *
     * @param aMemSubDetailDateCreated the new value for memSubDetailDateCreated
     */
    public void setMemSubDetailDateCreated(Timestamp aMemSubDetailDateCreated) {
        memSubDetailDateCreated = aMemSubDetailDateCreated;
    }

    /**
     * Access method for memSubDetailUserModified.
     *
     * @return the current value of memSubDetailUserModified
     */
    public String getMemSubDetailUserModified() {
        return memSubDetailUserModified;
    }

    /**
     * Setter method for memSubDetailUserModified.
     *
     * @param aMemSubDetailUserModified the new value for memSubDetailUserModified
     */
    public void setMemSubDetailUserModified(String aMemSubDetailUserModified) {
        memSubDetailUserModified = aMemSubDetailUserModified;
    }

    /**
     * Access method for memSubDetailDateModified.
     *
     * @return the current value of memSubDetailDateModified
     */
    public Timestamp getMemSubDetailDateModified() {
        return memSubDetailDateModified;
    }

    /**
     * Setter method for memSubDetailDateModified.
     *
     * @param aMemSubDetailDateModified the new value for memSubDetailDateModified
     */
    public void setMemSubDetailDateModified(Timestamp aMemSubDetailDateModified) {
        memSubDetailDateModified = aMemSubDetailDateModified;
    }

    /**
     * Access method for enrollmentSource.
     *
     * @return the current value of enrollmentSource
     */
    public String getEnrollmentSource() {
        return enrollmentSource;
    }

    /**
     * Setter method for enrollmentSource.
     *
     * @param aEnrollmentSource the new value for enrollmentSource
     */
    public void setEnrollmentSource(String aEnrollmentSource) {
        enrollmentSource = aEnrollmentSource;
    }

    /**
     * Access method for subDtlTypeId.
     *
     * @return the current value of subDtlTypeId
     */
    public BigDecimal getSubDtlTypeId() {
        return subDtlTypeId;
    }

    /**
     * Setter method for subDtlTypeId.
     *
     * @param aSubDtlTypeId the new value for subDtlTypeId
     */
    public void setSubDtlTypeId(BigDecimal aSubDtlTypeId) {
        subDtlTypeId = aSubDtlTypeId;
    }

    /**
     * Access method for memberTypeDesc.
     *
     * @return the current value of memberTypeDesc
     */
    public String getMemberTypeDesc() {
        return memberTypeDesc;
    }

    /**
     * Setter method for memberTypeDesc.
     *
     * @param aMemberTypeDesc the new value for memberTypeDesc
     */
    public void setMemberTypeDesc(String aMemberTypeDesc) {
        memberTypeDesc = aMemberTypeDesc;
    }

    /**
     * Access method for subCreateRsnId.
     *
     * @return the current value of subCreateRsnId
     */
    public BigDecimal getSubCreateRsnId() {
        return subCreateRsnId;
    }

    /**
     * Setter method for subCreateRsnId.
     *
     * @param aSubCreateRsnId the new value for subCreateRsnId
     */
    public void setSubCreateRsnId(BigDecimal aSubCreateRsnId) {
        subCreateRsnId = aSubCreateRsnId;
    }

    /**
     * Access method for subCreateRsnDesc.
     *
     * @return the current value of subCreateRsnDesc
     */
    public String getSubCreateRsnDesc() {
        return subCreateRsnDesc;
    }

    /**
     * Setter method for subCreateRsnDesc.
     *
     * @param aSubCreateRsnDesc the new value for subCreateRsnDesc
     */
    public void setSubCreateRsnDesc(String aSubCreateRsnDesc) {
        subCreateRsnDesc = aSubCreateRsnDesc;
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
     * Access method for memberReinstateRsnDesc.
     *
     * @return the current value of memberReinstateRsnDesc
     */
    public String getMemberReinstateRsnDesc() {
        return memberReinstateRsnDesc;
    }

    /**
     * Setter method for memberReinstateRsnDesc.
     *
     * @param aMemberReinstateRsnDesc the new value for memberReinstateRsnDesc
     */
    public void setMemberReinstateRsnDesc(String aMemberReinstateRsnDesc) {
        memberReinstateRsnDesc = aMemberReinstateRsnDesc;
    }

    /**
     * Access method for tierChngRsnId.
     *
     * @return the current value of tierChngRsnId
     */
    public BigDecimal getTierChngRsnId() {
        return tierChngRsnId;
    }

    /**
     * Setter method for tierChngRsnId.
     *
     * @param aTierChngRsnId the new value for tierChngRsnId
     */
    public void setTierChngRsnId(BigDecimal aTierChngRsnId) {
        tierChngRsnId = aTierChngRsnId;
    }

    /**
     * Access method for cancelRsnId.
     *
     * @return the current value of cancelRsnId
     */
    public long getCancelRsnId() {
        return cancelRsnId;
    }

    /**
     * Setter method for cancelRsnId.
     *
     * @param aCancelRsnId the new value for cancelRsnId
     */
    public void setCancelRsnId(long aCancelRsnId) {
        cancelRsnId = aCancelRsnId;
    }

    /**
     * Access method for subscrbtnCancelReasonDesc.
     *
     * @return the current value of subscrbtnCancelReasonDesc
     */
    public String getSubscrbtnCancelReasonDesc() {
        return subscrbtnCancelReasonDesc;
    }

    /**
     * Setter method for subscrbtnCancelReasonDesc.
     *
     * @param aSubscrbtnCancelReasonDesc the new value for subscrbtnCancelReasonDesc
     */
    public void setSubscrbtnCancelReasonDesc(String aSubscrbtnCancelReasonDesc) {
        subscrbtnCancelReasonDesc = aSubscrbtnCancelReasonDesc;
    }

    /**
     * Access method for prntMemSubscriptionDtlId.
     *
     * @return the current value of prntMemSubscriptionDtlId
     */
    public BigDecimal getPrntMemSubscriptionDtlId() {
        return prntMemSubscriptionDtlId;
    }

    /**
     * Setter method for prntMemSubscriptionDtlId.
     *
     * @param aPrntMemSubscriptionDtlId the new value for prntMemSubscriptionDtlId
     */
    public void setPrntMemSubscriptionDtlId(BigDecimal aPrntMemSubscriptionDtlId) {
        prntMemSubscriptionDtlId = aPrntMemSubscriptionDtlId;
    }

    /**
     * Access method for comments.
     *
     * @return the current value of comments
     */
    public String getComments() {
        return comments;
    }

    /**
     * Setter method for comments.
     *
     * @param aComments the new value for comments
     */
    public void setComments(String aComments) {
        comments = aComments;
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
     * Access method for cancelTypeId.
     *
     * @return the current value of cancelTypeId
     */
    public long getCancelTypeId() {
        return cancelTypeId;
    }

    /**
     * Setter method for cancelTypeId.
     *
     * @param aCancelTypeId the new value for cancelTypeId
     */
    public void setCancelTypeId(long aCancelTypeId) {
        cancelTypeId = aCancelTypeId;
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
     * Access method for cancelChannelId.
     *
     * @return the current value of cancelChannelId
     */
    public BigDecimal getCancelChannelId() {
        return cancelChannelId;
    }

    /**
     * Setter method for cancelChannelId.
     *
     * @param aCancelChannelId the new value for cancelChannelId
     */
    public void setCancelChannelId(BigDecimal aCancelChannelId) {
        cancelChannelId = aCancelChannelId;
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
     * Access method for cancelLetterRequestedFl.
     *
     * @return the current value of cancelLetterRequestedFl
     */
    public BigDecimal getCancelLetterRequestedFl() {
        return cancelLetterRequestedFl;
    }

    /**
     * Setter method for cancelLetterRequestedFl.
     *
     * @param aCancelLetterRequestedFl the new value for cancelLetterRequestedFl
     */
    public void setCancelLetterRequestedFl(BigDecimal aCancelLetterRequestedFl) {
        cancelLetterRequestedFl = aCancelLetterRequestedFl;
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
     * Access method for limitedDisclosureReadFlag.
     *
     * @return the current value of limitedDisclosureReadFlag
     */
    public String getLimitedDisclosureReadFlag() {
        return limitedDisclosureReadFlag;
    }

    /**
     * Setter method for limitedDisclosureReadFlag.
     *
     * @param aLimitedDisclosureReadFlag the new value for limitedDisclosureReadFlag
     */
    public void setLimitedDisclosureReadFlag(String aLimitedDisclosureReadFlag) {
        limitedDisclosureReadFlag = aLimitedDisclosureReadFlag;
    }

    /**
     * Compares the key for this instance with another StageMembershipHistory.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class StageMembershipHistory and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof StageMembershipHistory)) {
            return false;
        }
        StageMembershipHistory that = (StageMembershipHistory) other;
        if (this.getStageMembershipHistoryId() != that.getStageMembershipHistoryId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another StageMembershipHistory.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof StageMembershipHistory)) return false;
        return this.equalKeys(other) && ((StageMembershipHistory)other).equalKeys(this);
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
        i = (int)(getStageMembershipHistoryId() ^ (getStageMembershipHistoryId()>>>32));
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
        StringBuffer sb = new StringBuffer("[StageMembershipHistory |");
        sb.append(" stageMembershipHistoryId=").append(getStageMembershipHistoryId());
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
        ret.put("stageMembershipHistoryId", Long.valueOf(getStageMembershipHistoryId()));
        return ret;
    }

}
