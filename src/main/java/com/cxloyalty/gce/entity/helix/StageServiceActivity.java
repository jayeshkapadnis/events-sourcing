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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="stage_service_activity")
public class StageServiceActivity implements Serializable {

    /** Primary key. */
    protected static final String PK = "activitySysid";

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
    @Column(name="activity_sysid", unique=true, nullable=false, precision=19)
    private long activitySysid;
    @Column(name="activity_type", nullable=false, precision=9)
    private BigDecimal activityType;
    @Column(name="activity_subtype", length=500)
    private String activitySubtype;
    @Column(name="protected_card_sysid", precision=9)
    private BigDecimal protectedCardSysid;
    @Column(name="bank_account_sysid", precision=9)
    private BigDecimal bankAccountSysid;
    @Column(name="generic_asset_sysid", precision=9)
    private BigDecimal genericAssetSysid;
    @Column(name="bank_branch_sysid", precision=9)
    private BigDecimal bankBranchSysid;
    @Column(name="planned_start_date")
    private Timestamp plannedStartDate;
    @Column(name="actual_start_date")
    private Timestamp actualStartDate;
    @Column(name="req_completion_date")
    private Timestamp reqCompletionDate;
    @Column(name="actual_completion_date")
    private Timestamp actualCompletionDate;
    @Column(length=1500)
    private String comments;
    @Column(name="contact_method", length=500)
    private String contactMethod;
    @Column(nullable=false, length=150)
    private String name;
    @Column(name="comm_channel", length=500)
    private String commChannel;
    @Column(name="duplicate_touchpoint_flag", length=1)
    private String duplicateTouchpointFlag;
    @Column(name="email_address", length=100)
    private String emailAddress;
    @Column(name="fax_numeric", length=40)
    private String faxNumeric;
    @Column(name="new_protected_card_sysid", precision=9)
    private BigDecimal newProtectedCardSysid;
    @Column(name="new_bank_account_sysid", precision=9)
    private BigDecimal newBankAccountSysid;
    @Column(name="new_generic_asset_sysid", precision=9)
    private BigDecimal newGenericAssetSysid;
    @Column(name="phone_numeric", length=40)
    private String phoneNumeric;
    @Column(nullable=false, length=500)
    private String priority;
    @Column(name="sla_target1")
    private Timestamp slaTarget1;
    @Column(name="sla_target2")
    private Timestamp slaTarget2;
    @Column(nullable=false, length=500)
    private String status;
    @Column(name="status_date", nullable=false)
    private Timestamp statusDate;
    @Column(name="touchpoint_flag", length=1)
    private String touchpointFlag;
    @Column(name="ext_activity_id", length=60)
    private String extActivityId;
    @Column(name="add_date", nullable=false)
    private Timestamp addDate;
    @Column(name="add_username", nullable=false, length=50)
    private String addUsername;
    @Column(name="update_date", nullable=false)
    private Timestamp updateDate;
    @Column(name="update_username", nullable=false, length=50)
    private String updateUsername;
    @Column(name="activity_lstcrd_sysid", precision=19)
    private long activityLstcrdSysid;
    @Column(name="issuer_contact_sysid", precision=9)
    private BigDecimal issuerContactSysid;
    @Column(name="lost_stolen_card_sysid", precision=9)
    private BigDecimal lostStolenCardSysid;
    @Column(name="loss_center_comments", length=500)
    private String lossCenterComments;
    @Column(name="activity_lost_card_add_date")
    private Timestamp activityLostCardAddDate;
    @Column(name="activity_lost_card_add_username", length=50)
    private String activityLostCardAddUsername;
    @Column(name="activity_lost_card_update_date")
    private Timestamp activityLostCardUpdateDate;
    @Column(name="activity_lost_card_update_username", length=50)
    private String activityLostCardUpdateUsername;
    @Column(name="activity_pmt_sysid", precision=19)
    private long activityPmtSysid;
    @Column(name="payment_sysid", precision=12)
    private BigDecimal paymentSysid;
    @Column(name="payment_vehicle_sysid", precision=9)
    private BigDecimal paymentVehicleSysid;
    @Column(name="flow_type", length=500)
    private String flowType;
    @Column(precision=22, scale=7)
    private BigDecimal amount;
    @Column(length=500)
    private String currency;
    @Column(name="payment_status_sysid", precision=12)
    private BigDecimal paymentStatusSysid;
    @Column(name="activity_payment_add_date")
    private Timestamp activityPaymentAddDate;
    @Column(name="activity_payment_add_username", length=50)
    private String activityPaymentAddUsername;
    @Column(name="activity_payment_update_date")
    private Timestamp activityPaymentUpdateDate;
    @Column(name="activity_payment_update_username", length=50)
    private String activityPaymentUpdateUsername;
    @Column(name="eft_description", length=500)
    private String eftDescription;
    @Column(name="payment_comments", length=1500)
    private String paymentComments;
    @Column(name="activity_corr_sysid", precision=19)
    private long activityCorrSysid;
    @Column(name="legacy_template", length=200)
    private String legacyTemplate;
    @Column(name="comm_transaction_id", precision=10)
    private BigDecimal commTransactionId;
    @Column(name="corr_free_text", length=4000)
    private String corrFreeText;
    @Column(name="activity_corr_add_date")
    private Timestamp activityCorrAddDate;
    @Column(name="activity_corr_add_username", length=50)
    private String activityCorrAddUsername;
    @Column(name="activity_corr_update_date")
    private Timestamp activityCorrUpdateDate;
    @Column(name="activity_corr_update_username", length=50)
    private String activityCorrUpdateUsername;
    @Column(name="comm_type_id", precision=10)
    private BigDecimal commTypeId;
    @Column(name="kit_id", precision=10)
    private BigDecimal kitId;
    @Column(name="stage_created_date")
    private Timestamp stageCreatedDate;
    @Column(name="stage_updated_date")
    private Timestamp stageUpdatedDate;
    @ManyToOne(optional=false)
    @JoinColumn(name="request_sysid", nullable=false)
    private StageServiceRequest stageServiceRequest;

    /** Default constructor. */
    public StageServiceActivity() {
        super();
    }

    /**
     * Access method for activitySysid.
     *
     * @return the current value of activitySysid
     */
    public long getActivitySysid() {
        return activitySysid;
    }

    /**
     * Setter method for activitySysid.
     *
     * @param aActivitySysid the new value for activitySysid
     */
    public void setActivitySysid(long aActivitySysid) {
        activitySysid = aActivitySysid;
    }

    /**
     * Access method for activityType.
     *
     * @return the current value of activityType
     */
    public BigDecimal getActivityType() {
        return activityType;
    }

    /**
     * Setter method for activityType.
     *
     * @param aActivityType the new value for activityType
     */
    public void setActivityType(BigDecimal aActivityType) {
        activityType = aActivityType;
    }

    /**
     * Access method for activitySubtype.
     *
     * @return the current value of activitySubtype
     */
    public String getActivitySubtype() {
        return activitySubtype;
    }

    /**
     * Setter method for activitySubtype.
     *
     * @param aActivitySubtype the new value for activitySubtype
     */
    public void setActivitySubtype(String aActivitySubtype) {
        activitySubtype = aActivitySubtype;
    }

    /**
     * Access method for protectedCardSysid.
     *
     * @return the current value of protectedCardSysid
     */
    public BigDecimal getProtectedCardSysid() {
        return protectedCardSysid;
    }

    /**
     * Setter method for protectedCardSysid.
     *
     * @param aProtectedCardSysid the new value for protectedCardSysid
     */
    public void setProtectedCardSysid(BigDecimal aProtectedCardSysid) {
        protectedCardSysid = aProtectedCardSysid;
    }

    /**
     * Access method for bankAccountSysid.
     *
     * @return the current value of bankAccountSysid
     */
    public BigDecimal getBankAccountSysid() {
        return bankAccountSysid;
    }

    /**
     * Setter method for bankAccountSysid.
     *
     * @param aBankAccountSysid the new value for bankAccountSysid
     */
    public void setBankAccountSysid(BigDecimal aBankAccountSysid) {
        bankAccountSysid = aBankAccountSysid;
    }

    /**
     * Access method for genericAssetSysid.
     *
     * @return the current value of genericAssetSysid
     */
    public BigDecimal getGenericAssetSysid() {
        return genericAssetSysid;
    }

    /**
     * Setter method for genericAssetSysid.
     *
     * @param aGenericAssetSysid the new value for genericAssetSysid
     */
    public void setGenericAssetSysid(BigDecimal aGenericAssetSysid) {
        genericAssetSysid = aGenericAssetSysid;
    }

    /**
     * Access method for bankBranchSysid.
     *
     * @return the current value of bankBranchSysid
     */
    public BigDecimal getBankBranchSysid() {
        return bankBranchSysid;
    }

    /**
     * Setter method for bankBranchSysid.
     *
     * @param aBankBranchSysid the new value for bankBranchSysid
     */
    public void setBankBranchSysid(BigDecimal aBankBranchSysid) {
        bankBranchSysid = aBankBranchSysid;
    }

    /**
     * Access method for plannedStartDate.
     *
     * @return the current value of plannedStartDate
     */
    public Timestamp getPlannedStartDate() {
        return plannedStartDate;
    }

    /**
     * Setter method for plannedStartDate.
     *
     * @param aPlannedStartDate the new value for plannedStartDate
     */
    public void setPlannedStartDate(Timestamp aPlannedStartDate) {
        plannedStartDate = aPlannedStartDate;
    }

    /**
     * Access method for actualStartDate.
     *
     * @return the current value of actualStartDate
     */
    public Timestamp getActualStartDate() {
        return actualStartDate;
    }

    /**
     * Setter method for actualStartDate.
     *
     * @param aActualStartDate the new value for actualStartDate
     */
    public void setActualStartDate(Timestamp aActualStartDate) {
        actualStartDate = aActualStartDate;
    }

    /**
     * Access method for reqCompletionDate.
     *
     * @return the current value of reqCompletionDate
     */
    public Timestamp getReqCompletionDate() {
        return reqCompletionDate;
    }

    /**
     * Setter method for reqCompletionDate.
     *
     * @param aReqCompletionDate the new value for reqCompletionDate
     */
    public void setReqCompletionDate(Timestamp aReqCompletionDate) {
        reqCompletionDate = aReqCompletionDate;
    }

    /**
     * Access method for actualCompletionDate.
     *
     * @return the current value of actualCompletionDate
     */
    public Timestamp getActualCompletionDate() {
        return actualCompletionDate;
    }

    /**
     * Setter method for actualCompletionDate.
     *
     * @param aActualCompletionDate the new value for actualCompletionDate
     */
    public void setActualCompletionDate(Timestamp aActualCompletionDate) {
        actualCompletionDate = aActualCompletionDate;
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
     * Access method for contactMethod.
     *
     * @return the current value of contactMethod
     */
    public String getContactMethod() {
        return contactMethod;
    }

    /**
     * Setter method for contactMethod.
     *
     * @param aContactMethod the new value for contactMethod
     */
    public void setContactMethod(String aContactMethod) {
        contactMethod = aContactMethod;
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
     * Access method for commChannel.
     *
     * @return the current value of commChannel
     */
    public String getCommChannel() {
        return commChannel;
    }

    /**
     * Setter method for commChannel.
     *
     * @param aCommChannel the new value for commChannel
     */
    public void setCommChannel(String aCommChannel) {
        commChannel = aCommChannel;
    }

    /**
     * Access method for duplicateTouchpointFlag.
     *
     * @return the current value of duplicateTouchpointFlag
     */
    public String getDuplicateTouchpointFlag() {
        return duplicateTouchpointFlag;
    }

    /**
     * Setter method for duplicateTouchpointFlag.
     *
     * @param aDuplicateTouchpointFlag the new value for duplicateTouchpointFlag
     */
    public void setDuplicateTouchpointFlag(String aDuplicateTouchpointFlag) {
        duplicateTouchpointFlag = aDuplicateTouchpointFlag;
    }

    /**
     * Access method for emailAddress.
     *
     * @return the current value of emailAddress
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Setter method for emailAddress.
     *
     * @param aEmailAddress the new value for emailAddress
     */
    public void setEmailAddress(String aEmailAddress) {
        emailAddress = aEmailAddress;
    }

    /**
     * Access method for faxNumeric.
     *
     * @return the current value of faxNumeric
     */
    public String getFaxNumeric() {
        return faxNumeric;
    }

    /**
     * Setter method for faxNumeric.
     *
     * @param aFaxNumeric the new value for faxNumeric
     */
    public void setFaxNumeric(String aFaxNumeric) {
        faxNumeric = aFaxNumeric;
    }

    /**
     * Access method for newProtectedCardSysid.
     *
     * @return the current value of newProtectedCardSysid
     */
    public BigDecimal getNewProtectedCardSysid() {
        return newProtectedCardSysid;
    }

    /**
     * Setter method for newProtectedCardSysid.
     *
     * @param aNewProtectedCardSysid the new value for newProtectedCardSysid
     */
    public void setNewProtectedCardSysid(BigDecimal aNewProtectedCardSysid) {
        newProtectedCardSysid = aNewProtectedCardSysid;
    }

    /**
     * Access method for newBankAccountSysid.
     *
     * @return the current value of newBankAccountSysid
     */
    public BigDecimal getNewBankAccountSysid() {
        return newBankAccountSysid;
    }

    /**
     * Setter method for newBankAccountSysid.
     *
     * @param aNewBankAccountSysid the new value for newBankAccountSysid
     */
    public void setNewBankAccountSysid(BigDecimal aNewBankAccountSysid) {
        newBankAccountSysid = aNewBankAccountSysid;
    }

    /**
     * Access method for newGenericAssetSysid.
     *
     * @return the current value of newGenericAssetSysid
     */
    public BigDecimal getNewGenericAssetSysid() {
        return newGenericAssetSysid;
    }

    /**
     * Setter method for newGenericAssetSysid.
     *
     * @param aNewGenericAssetSysid the new value for newGenericAssetSysid
     */
    public void setNewGenericAssetSysid(BigDecimal aNewGenericAssetSysid) {
        newGenericAssetSysid = aNewGenericAssetSysid;
    }

    /**
     * Access method for phoneNumeric.
     *
     * @return the current value of phoneNumeric
     */
    public String getPhoneNumeric() {
        return phoneNumeric;
    }

    /**
     * Setter method for phoneNumeric.
     *
     * @param aPhoneNumeric the new value for phoneNumeric
     */
    public void setPhoneNumeric(String aPhoneNumeric) {
        phoneNumeric = aPhoneNumeric;
    }

    /**
     * Access method for priority.
     *
     * @return the current value of priority
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Setter method for priority.
     *
     * @param aPriority the new value for priority
     */
    public void setPriority(String aPriority) {
        priority = aPriority;
    }

    /**
     * Access method for slaTarget1.
     *
     * @return the current value of slaTarget1
     */
    public Timestamp getSlaTarget1() {
        return slaTarget1;
    }

    /**
     * Setter method for slaTarget1.
     *
     * @param aSlaTarget1 the new value for slaTarget1
     */
    public void setSlaTarget1(Timestamp aSlaTarget1) {
        slaTarget1 = aSlaTarget1;
    }

    /**
     * Access method for slaTarget2.
     *
     * @return the current value of slaTarget2
     */
    public Timestamp getSlaTarget2() {
        return slaTarget2;
    }

    /**
     * Setter method for slaTarget2.
     *
     * @param aSlaTarget2 the new value for slaTarget2
     */
    public void setSlaTarget2(Timestamp aSlaTarget2) {
        slaTarget2 = aSlaTarget2;
    }

    /**
     * Access method for status.
     *
     * @return the current value of status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Setter method for status.
     *
     * @param aStatus the new value for status
     */
    public void setStatus(String aStatus) {
        status = aStatus;
    }

    /**
     * Access method for statusDate.
     *
     * @return the current value of statusDate
     */
    public Timestamp getStatusDate() {
        return statusDate;
    }

    /**
     * Setter method for statusDate.
     *
     * @param aStatusDate the new value for statusDate
     */
    public void setStatusDate(Timestamp aStatusDate) {
        statusDate = aStatusDate;
    }

    /**
     * Access method for touchpointFlag.
     *
     * @return the current value of touchpointFlag
     */
    public String getTouchpointFlag() {
        return touchpointFlag;
    }

    /**
     * Setter method for touchpointFlag.
     *
     * @param aTouchpointFlag the new value for touchpointFlag
     */
    public void setTouchpointFlag(String aTouchpointFlag) {
        touchpointFlag = aTouchpointFlag;
    }

    /**
     * Access method for extActivityId.
     *
     * @return the current value of extActivityId
     */
    public String getExtActivityId() {
        return extActivityId;
    }

    /**
     * Setter method for extActivityId.
     *
     * @param aExtActivityId the new value for extActivityId
     */
    public void setExtActivityId(String aExtActivityId) {
        extActivityId = aExtActivityId;
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
     * Access method for activityLstcrdSysid.
     *
     * @return the current value of activityLstcrdSysid
     */
    public long getActivityLstcrdSysid() {
        return activityLstcrdSysid;
    }

    /**
     * Setter method for activityLstcrdSysid.
     *
     * @param aActivityLstcrdSysid the new value for activityLstcrdSysid
     */
    public void setActivityLstcrdSysid(long aActivityLstcrdSysid) {
        activityLstcrdSysid = aActivityLstcrdSysid;
    }

    /**
     * Access method for issuerContactSysid.
     *
     * @return the current value of issuerContactSysid
     */
    public BigDecimal getIssuerContactSysid() {
        return issuerContactSysid;
    }

    /**
     * Setter method for issuerContactSysid.
     *
     * @param aIssuerContactSysid the new value for issuerContactSysid
     */
    public void setIssuerContactSysid(BigDecimal aIssuerContactSysid) {
        issuerContactSysid = aIssuerContactSysid;
    }

    /**
     * Access method for lostStolenCardSysid.
     *
     * @return the current value of lostStolenCardSysid
     */
    public BigDecimal getLostStolenCardSysid() {
        return lostStolenCardSysid;
    }

    /**
     * Setter method for lostStolenCardSysid.
     *
     * @param aLostStolenCardSysid the new value for lostStolenCardSysid
     */
    public void setLostStolenCardSysid(BigDecimal aLostStolenCardSysid) {
        lostStolenCardSysid = aLostStolenCardSysid;
    }

    /**
     * Access method for lossCenterComments.
     *
     * @return the current value of lossCenterComments
     */
    public String getLossCenterComments() {
        return lossCenterComments;
    }

    /**
     * Setter method for lossCenterComments.
     *
     * @param aLossCenterComments the new value for lossCenterComments
     */
    public void setLossCenterComments(String aLossCenterComments) {
        lossCenterComments = aLossCenterComments;
    }

    /**
     * Access method for activityLostCardAddDate.
     *
     * @return the current value of activityLostCardAddDate
     */
    public Timestamp getActivityLostCardAddDate() {
        return activityLostCardAddDate;
    }

    /**
     * Setter method for activityLostCardAddDate.
     *
     * @param aActivityLostCardAddDate the new value for activityLostCardAddDate
     */
    public void setActivityLostCardAddDate(Timestamp aActivityLostCardAddDate) {
        activityLostCardAddDate = aActivityLostCardAddDate;
    }

    /**
     * Access method for activityLostCardAddUsername.
     *
     * @return the current value of activityLostCardAddUsername
     */
    public String getActivityLostCardAddUsername() {
        return activityLostCardAddUsername;
    }

    /**
     * Setter method for activityLostCardAddUsername.
     *
     * @param aActivityLostCardAddUsername the new value for activityLostCardAddUsername
     */
    public void setActivityLostCardAddUsername(String aActivityLostCardAddUsername) {
        activityLostCardAddUsername = aActivityLostCardAddUsername;
    }

    /**
     * Access method for activityLostCardUpdateDate.
     *
     * @return the current value of activityLostCardUpdateDate
     */
    public Timestamp getActivityLostCardUpdateDate() {
        return activityLostCardUpdateDate;
    }

    /**
     * Setter method for activityLostCardUpdateDate.
     *
     * @param aActivityLostCardUpdateDate the new value for activityLostCardUpdateDate
     */
    public void setActivityLostCardUpdateDate(Timestamp aActivityLostCardUpdateDate) {
        activityLostCardUpdateDate = aActivityLostCardUpdateDate;
    }

    /**
     * Access method for activityLostCardUpdateUsername.
     *
     * @return the current value of activityLostCardUpdateUsername
     */
    public String getActivityLostCardUpdateUsername() {
        return activityLostCardUpdateUsername;
    }

    /**
     * Setter method for activityLostCardUpdateUsername.
     *
     * @param aActivityLostCardUpdateUsername the new value for activityLostCardUpdateUsername
     */
    public void setActivityLostCardUpdateUsername(String aActivityLostCardUpdateUsername) {
        activityLostCardUpdateUsername = aActivityLostCardUpdateUsername;
    }

    /**
     * Access method for activityPmtSysid.
     *
     * @return the current value of activityPmtSysid
     */
    public long getActivityPmtSysid() {
        return activityPmtSysid;
    }

    /**
     * Setter method for activityPmtSysid.
     *
     * @param aActivityPmtSysid the new value for activityPmtSysid
     */
    public void setActivityPmtSysid(long aActivityPmtSysid) {
        activityPmtSysid = aActivityPmtSysid;
    }

    /**
     * Access method for paymentSysid.
     *
     * @return the current value of paymentSysid
     */
    public BigDecimal getPaymentSysid() {
        return paymentSysid;
    }

    /**
     * Setter method for paymentSysid.
     *
     * @param aPaymentSysid the new value for paymentSysid
     */
    public void setPaymentSysid(BigDecimal aPaymentSysid) {
        paymentSysid = aPaymentSysid;
    }

    /**
     * Access method for paymentVehicleSysid.
     *
     * @return the current value of paymentVehicleSysid
     */
    public BigDecimal getPaymentVehicleSysid() {
        return paymentVehicleSysid;
    }

    /**
     * Setter method for paymentVehicleSysid.
     *
     * @param aPaymentVehicleSysid the new value for paymentVehicleSysid
     */
    public void setPaymentVehicleSysid(BigDecimal aPaymentVehicleSysid) {
        paymentVehicleSysid = aPaymentVehicleSysid;
    }

    /**
     * Access method for flowType.
     *
     * @return the current value of flowType
     */
    public String getFlowType() {
        return flowType;
    }

    /**
     * Setter method for flowType.
     *
     * @param aFlowType the new value for flowType
     */
    public void setFlowType(String aFlowType) {
        flowType = aFlowType;
    }

    /**
     * Access method for amount.
     *
     * @return the current value of amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Setter method for amount.
     *
     * @param aAmount the new value for amount
     */
    public void setAmount(BigDecimal aAmount) {
        amount = aAmount;
    }

    /**
     * Access method for currency.
     *
     * @return the current value of currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Setter method for currency.
     *
     * @param aCurrency the new value for currency
     */
    public void setCurrency(String aCurrency) {
        currency = aCurrency;
    }

    /**
     * Access method for paymentStatusSysid.
     *
     * @return the current value of paymentStatusSysid
     */
    public BigDecimal getPaymentStatusSysid() {
        return paymentStatusSysid;
    }

    /**
     * Setter method for paymentStatusSysid.
     *
     * @param aPaymentStatusSysid the new value for paymentStatusSysid
     */
    public void setPaymentStatusSysid(BigDecimal aPaymentStatusSysid) {
        paymentStatusSysid = aPaymentStatusSysid;
    }

    /**
     * Access method for activityPaymentAddDate.
     *
     * @return the current value of activityPaymentAddDate
     */
    public Timestamp getActivityPaymentAddDate() {
        return activityPaymentAddDate;
    }

    /**
     * Setter method for activityPaymentAddDate.
     *
     * @param aActivityPaymentAddDate the new value for activityPaymentAddDate
     */
    public void setActivityPaymentAddDate(Timestamp aActivityPaymentAddDate) {
        activityPaymentAddDate = aActivityPaymentAddDate;
    }

    /**
     * Access method for activityPaymentAddUsername.
     *
     * @return the current value of activityPaymentAddUsername
     */
    public String getActivityPaymentAddUsername() {
        return activityPaymentAddUsername;
    }

    /**
     * Setter method for activityPaymentAddUsername.
     *
     * @param aActivityPaymentAddUsername the new value for activityPaymentAddUsername
     */
    public void setActivityPaymentAddUsername(String aActivityPaymentAddUsername) {
        activityPaymentAddUsername = aActivityPaymentAddUsername;
    }

    /**
     * Access method for activityPaymentUpdateDate.
     *
     * @return the current value of activityPaymentUpdateDate
     */
    public Timestamp getActivityPaymentUpdateDate() {
        return activityPaymentUpdateDate;
    }

    /**
     * Setter method for activityPaymentUpdateDate.
     *
     * @param aActivityPaymentUpdateDate the new value for activityPaymentUpdateDate
     */
    public void setActivityPaymentUpdateDate(Timestamp aActivityPaymentUpdateDate) {
        activityPaymentUpdateDate = aActivityPaymentUpdateDate;
    }

    /**
     * Access method for activityPaymentUpdateUsername.
     *
     * @return the current value of activityPaymentUpdateUsername
     */
    public String getActivityPaymentUpdateUsername() {
        return activityPaymentUpdateUsername;
    }

    /**
     * Setter method for activityPaymentUpdateUsername.
     *
     * @param aActivityPaymentUpdateUsername the new value for activityPaymentUpdateUsername
     */
    public void setActivityPaymentUpdateUsername(String aActivityPaymentUpdateUsername) {
        activityPaymentUpdateUsername = aActivityPaymentUpdateUsername;
    }

    /**
     * Access method for eftDescription.
     *
     * @return the current value of eftDescription
     */
    public String getEftDescription() {
        return eftDescription;
    }

    /**
     * Setter method for eftDescription.
     *
     * @param aEftDescription the new value for eftDescription
     */
    public void setEftDescription(String aEftDescription) {
        eftDescription = aEftDescription;
    }

    /**
     * Access method for paymentComments.
     *
     * @return the current value of paymentComments
     */
    public String getPaymentComments() {
        return paymentComments;
    }

    /**
     * Setter method for paymentComments.
     *
     * @param aPaymentComments the new value for paymentComments
     */
    public void setPaymentComments(String aPaymentComments) {
        paymentComments = aPaymentComments;
    }

    /**
     * Access method for activityCorrSysid.
     *
     * @return the current value of activityCorrSysid
     */
    public long getActivityCorrSysid() {
        return activityCorrSysid;
    }

    /**
     * Setter method for activityCorrSysid.
     *
     * @param aActivityCorrSysid the new value for activityCorrSysid
     */
    public void setActivityCorrSysid(long aActivityCorrSysid) {
        activityCorrSysid = aActivityCorrSysid;
    }

    /**
     * Access method for legacyTemplate.
     *
     * @return the current value of legacyTemplate
     */
    public String getLegacyTemplate() {
        return legacyTemplate;
    }

    /**
     * Setter method for legacyTemplate.
     *
     * @param aLegacyTemplate the new value for legacyTemplate
     */
    public void setLegacyTemplate(String aLegacyTemplate) {
        legacyTemplate = aLegacyTemplate;
    }

    /**
     * Access method for commTransactionId.
     *
     * @return the current value of commTransactionId
     */
    public BigDecimal getCommTransactionId() {
        return commTransactionId;
    }

    /**
     * Setter method for commTransactionId.
     *
     * @param aCommTransactionId the new value for commTransactionId
     */
    public void setCommTransactionId(BigDecimal aCommTransactionId) {
        commTransactionId = aCommTransactionId;
    }

    /**
     * Access method for corrFreeText.
     *
     * @return the current value of corrFreeText
     */
    public String getCorrFreeText() {
        return corrFreeText;
    }

    /**
     * Setter method for corrFreeText.
     *
     * @param aCorrFreeText the new value for corrFreeText
     */
    public void setCorrFreeText(String aCorrFreeText) {
        corrFreeText = aCorrFreeText;
    }

    /**
     * Access method for activityCorrAddDate.
     *
     * @return the current value of activityCorrAddDate
     */
    public Timestamp getActivityCorrAddDate() {
        return activityCorrAddDate;
    }

    /**
     * Setter method for activityCorrAddDate.
     *
     * @param aActivityCorrAddDate the new value for activityCorrAddDate
     */
    public void setActivityCorrAddDate(Timestamp aActivityCorrAddDate) {
        activityCorrAddDate = aActivityCorrAddDate;
    }

    /**
     * Access method for activityCorrAddUsername.
     *
     * @return the current value of activityCorrAddUsername
     */
    public String getActivityCorrAddUsername() {
        return activityCorrAddUsername;
    }

    /**
     * Setter method for activityCorrAddUsername.
     *
     * @param aActivityCorrAddUsername the new value for activityCorrAddUsername
     */
    public void setActivityCorrAddUsername(String aActivityCorrAddUsername) {
        activityCorrAddUsername = aActivityCorrAddUsername;
    }

    /**
     * Access method for activityCorrUpdateDate.
     *
     * @return the current value of activityCorrUpdateDate
     */
    public Timestamp getActivityCorrUpdateDate() {
        return activityCorrUpdateDate;
    }

    /**
     * Setter method for activityCorrUpdateDate.
     *
     * @param aActivityCorrUpdateDate the new value for activityCorrUpdateDate
     */
    public void setActivityCorrUpdateDate(Timestamp aActivityCorrUpdateDate) {
        activityCorrUpdateDate = aActivityCorrUpdateDate;
    }

    /**
     * Access method for activityCorrUpdateUsername.
     *
     * @return the current value of activityCorrUpdateUsername
     */
    public String getActivityCorrUpdateUsername() {
        return activityCorrUpdateUsername;
    }

    /**
     * Setter method for activityCorrUpdateUsername.
     *
     * @param aActivityCorrUpdateUsername the new value for activityCorrUpdateUsername
     */
    public void setActivityCorrUpdateUsername(String aActivityCorrUpdateUsername) {
        activityCorrUpdateUsername = aActivityCorrUpdateUsername;
    }

    /**
     * Access method for commTypeId.
     *
     * @return the current value of commTypeId
     */
    public BigDecimal getCommTypeId() {
        return commTypeId;
    }

    /**
     * Setter method for commTypeId.
     *
     * @param aCommTypeId the new value for commTypeId
     */
    public void setCommTypeId(BigDecimal aCommTypeId) {
        commTypeId = aCommTypeId;
    }

    /**
     * Access method for kitId.
     *
     * @return the current value of kitId
     */
    public BigDecimal getKitId() {
        return kitId;
    }

    /**
     * Setter method for kitId.
     *
     * @param aKitId the new value for kitId
     */
    public void setKitId(BigDecimal aKitId) {
        kitId = aKitId;
    }

    /**
     * Access method for stageCreatedDate.
     *
     * @return the current value of stageCreatedDate
     */
    public Timestamp getStageCreatedDate() {
        return stageCreatedDate;
    }

    /**
     * Setter method for stageCreatedDate.
     *
     * @param aStageCreatedDate the new value for stageCreatedDate
     */
    public void setStageCreatedDate(Timestamp aStageCreatedDate) {
        stageCreatedDate = aStageCreatedDate;
    }

    /**
     * Access method for stageUpdatedDate.
     *
     * @return the current value of stageUpdatedDate
     */
    public Timestamp getStageUpdatedDate() {
        return stageUpdatedDate;
    }

    /**
     * Setter method for stageUpdatedDate.
     *
     * @param aStageUpdatedDate the new value for stageUpdatedDate
     */
    public void setStageUpdatedDate(Timestamp aStageUpdatedDate) {
        stageUpdatedDate = aStageUpdatedDate;
    }

    /**
     * Access method for stageServiceRequest.
     *
     * @return the current value of stageServiceRequest
     */
    public StageServiceRequest getStageServiceRequest() {
        return stageServiceRequest;
    }

    /**
     * Setter method for stageServiceRequest.
     *
     * @param aStageServiceRequest the new value for stageServiceRequest
     */
    public void setStageServiceRequest(StageServiceRequest aStageServiceRequest) {
        stageServiceRequest = aStageServiceRequest;
    }

    /**
     * Compares the key for this instance with another StageServiceActivity.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class StageServiceActivity and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof StageServiceActivity)) {
            return false;
        }
        StageServiceActivity that = (StageServiceActivity) other;
        if (this.getActivitySysid() != that.getActivitySysid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another StageServiceActivity.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof StageServiceActivity)) return false;
        return this.equalKeys(other) && ((StageServiceActivity)other).equalKeys(this);
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
        i = (int)(getActivitySysid() ^ (getActivitySysid()>>>32));
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
        StringBuffer sb = new StringBuffer("[StageServiceActivity |");
        sb.append(" activitySysid=").append(getActivitySysid());
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
        ret.put("activitySysid", Long.valueOf(getActivitySysid()));
        return ret;
    }

}
