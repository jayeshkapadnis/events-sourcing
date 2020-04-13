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

@Entity(name="stage_protected_card")
public class StageProtectedCard implements Serializable {

    /** Primary key. */
    protected static final String PK = "protectedCardSysid";

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
    @Column(name="protected_card_sysid", unique=true, nullable=false, precision=9)
    private BigDecimal protectedCardSysid;
    @Column(name="card_status_code_desc", nullable=false, length=32)
    private String cardStatusCodeDesc;
    @Column(name="card_status_code", nullable=false, length=1)
    private String cardStatusCode;
    @Column(name="corporate_card_flag", length=1)
    private String corporateCardFlag;
    @Column(name="major_card_flag", length=1)
    private String majorCardFlag;
    @Column(name="replace_card_flag", length=1)
    private String replaceCardFlag;
    @Column(name="issuer_name", length=100)
    private String issuerName;
    @Column(name="call_date")
    private Timestamp callDate;
    @Column(name="call_username", length=16)
    private String callUsername;
    @Column(name="last_status_chg_date")
    private Timestamp lastStatusChgDate;
    @Column(length=255)
    private String comments;
    @Column(name="lost_stolen_report_ref_num", precision=3)
    private BigDecimal lostStolenReportRefNum;
    @Column(name="issuer_sysid", precision=9)
    private BigDecimal issuerSysid;
    @Column(name="name_on_card", length=100)
    private String nameOnCard;
    @Column(name="bank_account_number", length=32)
    private String bankAccountNumber;
    @Column(name="invalid_card_indicator", length=1)
    private String invalidCardIndicator;
    @Column(length=40)
    private String source;
    @Column(name="valid_for_payment", length=1)
    private String validForPayment;
    @Column(name="bank_branch_sysid", precision=9)
    private BigDecimal bankBranchSysid;
    @Column(name="siebel_asset_id", length=100)
    private String siebelAssetId;
    @Column(name="add_date", nullable=false)
    private Timestamp addDate;
    @Column(name="add_username", nullable=false, length=50)
    private String addUsername;
    @Column(name="update_date", nullable=false)
    private Timestamp updateDate;
    @Column(name="update_username", nullable=false, length=50)
    private String updateUsername;
    @Column(name="reminder_sysid", precision=9)
    private BigDecimal reminderSysid;
    @Column(name="ext_vendor_asset_id", length=20)
    private String extVendorAssetId;
    @Column(name="card_suffix", length=4)
    private String cardSuffix;
    @Column(name="expiration_date")
    private Timestamp expirationDate;
    @Column(name="start_date")
    private Timestamp startDate;
    @Column(name="add_client_username", length=50)
    private String addClientUsername;
    @Column(name="update_client_username", length=50)
    private String updateClientUsername;
    @Column(name="do_not_display_flag", length=1)
    private String doNotDisplayFlag;
    @Column(name="channel_description", length=30)
    private String channelDescription;
    @Column(name="channel_sysid", precision=2)
    private BigDecimal channelSysid;
    @Column(length=255)
    private String description;
    @Column(name="region_id", nullable=false, precision=2)
    private BigDecimal regionId;
    @Column(name="issue_number", length=30)
    private String issueNumber;
    @Column(name="issue_date")
    private Timestamp issueDate;
    @Column(name="received_date")
    private Timestamp receivedDate;
    @Column(name="card_prefix_nbr", length=6)
    private String cardPrefixNbr;
    @Column(name="card_length_nbr", precision=6)
    private BigDecimal cardLengthNbr;
    @Column(name="card_number_unknown_fl", nullable=false, precision=1)
    private BigDecimal cardNumberUnknownFl;
    @Column(name="replaced_card_sysid", precision=9)
    private BigDecimal replacedCardSysid;
    @Column(name="friendly_name", length=100)
    private String friendlyName;
    @Column(name="encryption_key_name", nullable=false, length=100)
    private String encryptionKeyName;
    @Column(name="hashed_card_number", length=600)
    private String hashedCardNumber;
    @Column(name="encrypted_card_number", nullable=false, length=600)
    private String encryptedCardNumber;
    @Column(name="lost_stolen_card_sysid", nullable=false, precision=9)
    private BigDecimal lostStolenCardSysid;
    @Column(name="lost_stolen_report_sysid", nullable=false, precision=9)
    private BigDecimal lostStolenReportSysid;
    @Column(name="lost_stolen_status_code_desc", nullable=false, length=30)
    private String lostStolenStatusCodeDesc;
    @Column(name="lost_stolen_status_code", nullable=false, length=2)
    private String lostStolenStatusCode;
    @Column(name="reason_code_desc", length=255)
    private String reasonCodeDesc;
    @Column(name="reason_code", precision=2)
    private BigDecimal reasonCode;
    @Column(name="lost_stl_crd_call_date")
    private Timestamp lostStlCrdCallDate;
    @Column(name="lost_stl_crd_call_username", length=8)
    private String lostStlCrdCallUsername;
    @Column(name="lost_stl_crd_last_status_chg_date")
    private Timestamp lostStlCrdLastStatusChgDate;
    @Column(name="last_status_chg_username", length=16)
    private String lastStatusChgUsername;
    @Column(name="lost_stl_crd_comments", length=4000)
    private String lostStlCrdComments;
    @Column(name="auto_fax_request_date")
    private Timestamp autoFaxRequestDate;
    @Column(name="auto_fax_request_status", length=18)
    private String autoFaxRequestStatus;
    @Column(name="auto_fax_completion_date")
    private Timestamp autoFaxCompletionDate;
    @Column(name="auto_fax_reason", length=15)
    private String autoFaxReason;
    @Column(name="notification_phone_numeric", length=30)
    private String notificationPhoneNumeric;
    @Column(name="lost_stolen_card_add_date", nullable=false)
    private Timestamp lostStolenCardAddDate;
    @Column(name="lost_stolen_card_add_username", nullable=false, length=50)
    private String lostStolenCardAddUsername;
    @Column(name="lost_stolen_card_update_date", nullable=false)
    private Timestamp lostStolenCardUpdateDate;
    @Column(name="lost_stolen_card_update_username", nullable=false, length=50)
    private String lostStolenCardUpdateUsername;
    @Column(name="auto_fax_requested", length=1)
    private String autoFaxRequested;
    @Column(name="auto_fax_sent", length=1)
    private String autoFaxSent;
    @Column(name="missing_checks_flag", length=1)
    private String missingChecksFlag;
    @Column(name="card_signed_flag", length=1)
    private String cardSignedFlag;
    @Column(name="pin_number_loss_flag", length=1)
    private String pinNumberLossFlag;
    @Column(name="replacement_card_req_flag", length=1)
    private String replacementCardReqFlag;
    @Column(name="check_signed_flag", length=1)
    private String checkSignedFlag;
    @Column(name="notification_attempts", precision=2)
    private BigDecimal notificationAttempts;
    @Column(name="last_used_date")
    private Timestamp lastUsedDate;
    @Column(name="checks_value_amount", precision=7, scale=2)
    private BigDecimal checksValueAmount;
    @Column(name="registered_on_loss", length=1)
    private String registeredOnLoss;
    @Column(name="checks_currency", length=20)
    private String checksCurrency;
    @Column(name="siebel_id", length=50)
    private String siebelId;
    @Column(name="stage_created_date")
    private Timestamp stageCreatedDate;
    @Column(name="stage_updated_date")
    private Timestamp stageUpdatedDate;
    @Column(name="data_vault_id", precision=19)
    private long dataVaultId;
    @ManyToOne(optional=false)
    @JoinColumn(name="member_id", nullable=false)
    private StageMember stageMember;
    @ManyToOne(optional=false)
    @JoinColumn(name="membership_id", nullable=false)
    private StageMembership stageMembership;
    @OneToMany(mappedBy="stageProtectedCard")
    private Set<StagePaymentVehicle> stagePaymentVehicle;

    /** Default constructor. */
    public StageProtectedCard() {
        super();
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
     * Access method for cardStatusCodeDesc.
     *
     * @return the current value of cardStatusCodeDesc
     */
    public String getCardStatusCodeDesc() {
        return cardStatusCodeDesc;
    }

    /**
     * Setter method for cardStatusCodeDesc.
     *
     * @param aCardStatusCodeDesc the new value for cardStatusCodeDesc
     */
    public void setCardStatusCodeDesc(String aCardStatusCodeDesc) {
        cardStatusCodeDesc = aCardStatusCodeDesc;
    }

    /**
     * Access method for cardStatusCode.
     *
     * @return the current value of cardStatusCode
     */
    public String getCardStatusCode() {
        return cardStatusCode;
    }

    /**
     * Setter method for cardStatusCode.
     *
     * @param aCardStatusCode the new value for cardStatusCode
     */
    public void setCardStatusCode(String aCardStatusCode) {
        cardStatusCode = aCardStatusCode;
    }

    /**
     * Access method for corporateCardFlag.
     *
     * @return the current value of corporateCardFlag
     */
    public String getCorporateCardFlag() {
        return corporateCardFlag;
    }

    /**
     * Setter method for corporateCardFlag.
     *
     * @param aCorporateCardFlag the new value for corporateCardFlag
     */
    public void setCorporateCardFlag(String aCorporateCardFlag) {
        corporateCardFlag = aCorporateCardFlag;
    }

    /**
     * Access method for majorCardFlag.
     *
     * @return the current value of majorCardFlag
     */
    public String getMajorCardFlag() {
        return majorCardFlag;
    }

    /**
     * Setter method for majorCardFlag.
     *
     * @param aMajorCardFlag the new value for majorCardFlag
     */
    public void setMajorCardFlag(String aMajorCardFlag) {
        majorCardFlag = aMajorCardFlag;
    }

    /**
     * Access method for replaceCardFlag.
     *
     * @return the current value of replaceCardFlag
     */
    public String getReplaceCardFlag() {
        return replaceCardFlag;
    }

    /**
     * Setter method for replaceCardFlag.
     *
     * @param aReplaceCardFlag the new value for replaceCardFlag
     */
    public void setReplaceCardFlag(String aReplaceCardFlag) {
        replaceCardFlag = aReplaceCardFlag;
    }

    /**
     * Access method for issuerName.
     *
     * @return the current value of issuerName
     */
    public String getIssuerName() {
        return issuerName;
    }

    /**
     * Setter method for issuerName.
     *
     * @param aIssuerName the new value for issuerName
     */
    public void setIssuerName(String aIssuerName) {
        issuerName = aIssuerName;
    }

    /**
     * Access method for callDate.
     *
     * @return the current value of callDate
     */
    public Timestamp getCallDate() {
        return callDate;
    }

    /**
     * Setter method for callDate.
     *
     * @param aCallDate the new value for callDate
     */
    public void setCallDate(Timestamp aCallDate) {
        callDate = aCallDate;
    }

    /**
     * Access method for callUsername.
     *
     * @return the current value of callUsername
     */
    public String getCallUsername() {
        return callUsername;
    }

    /**
     * Setter method for callUsername.
     *
     * @param aCallUsername the new value for callUsername
     */
    public void setCallUsername(String aCallUsername) {
        callUsername = aCallUsername;
    }

    /**
     * Access method for lastStatusChgDate.
     *
     * @return the current value of lastStatusChgDate
     */
    public Timestamp getLastStatusChgDate() {
        return lastStatusChgDate;
    }

    /**
     * Setter method for lastStatusChgDate.
     *
     * @param aLastStatusChgDate the new value for lastStatusChgDate
     */
    public void setLastStatusChgDate(Timestamp aLastStatusChgDate) {
        lastStatusChgDate = aLastStatusChgDate;
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
     * Access method for lostStolenReportRefNum.
     *
     * @return the current value of lostStolenReportRefNum
     */
    public BigDecimal getLostStolenReportRefNum() {
        return lostStolenReportRefNum;
    }

    /**
     * Setter method for lostStolenReportRefNum.
     *
     * @param aLostStolenReportRefNum the new value for lostStolenReportRefNum
     */
    public void setLostStolenReportRefNum(BigDecimal aLostStolenReportRefNum) {
        lostStolenReportRefNum = aLostStolenReportRefNum;
    }

    /**
     * Access method for issuerSysid.
     *
     * @return the current value of issuerSysid
     */
    public BigDecimal getIssuerSysid() {
        return issuerSysid;
    }

    /**
     * Setter method for issuerSysid.
     *
     * @param aIssuerSysid the new value for issuerSysid
     */
    public void setIssuerSysid(BigDecimal aIssuerSysid) {
        issuerSysid = aIssuerSysid;
    }

    /**
     * Access method for nameOnCard.
     *
     * @return the current value of nameOnCard
     */
    public String getNameOnCard() {
        return nameOnCard;
    }

    /**
     * Setter method for nameOnCard.
     *
     * @param aNameOnCard the new value for nameOnCard
     */
    public void setNameOnCard(String aNameOnCard) {
        nameOnCard = aNameOnCard;
    }

    /**
     * Access method for bankAccountNumber.
     *
     * @return the current value of bankAccountNumber
     */
    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    /**
     * Setter method for bankAccountNumber.
     *
     * @param aBankAccountNumber the new value for bankAccountNumber
     */
    public void setBankAccountNumber(String aBankAccountNumber) {
        bankAccountNumber = aBankAccountNumber;
    }

    /**
     * Access method for invalidCardIndicator.
     *
     * @return the current value of invalidCardIndicator
     */
    public String getInvalidCardIndicator() {
        return invalidCardIndicator;
    }

    /**
     * Setter method for invalidCardIndicator.
     *
     * @param aInvalidCardIndicator the new value for invalidCardIndicator
     */
    public void setInvalidCardIndicator(String aInvalidCardIndicator) {
        invalidCardIndicator = aInvalidCardIndicator;
    }

    /**
     * Access method for source.
     *
     * @return the current value of source
     */
    public String getSource() {
        return source;
    }

    /**
     * Setter method for source.
     *
     * @param aSource the new value for source
     */
    public void setSource(String aSource) {
        source = aSource;
    }

    /**
     * Access method for validForPayment.
     *
     * @return the current value of validForPayment
     */
    public String getValidForPayment() {
        return validForPayment;
    }

    /**
     * Setter method for validForPayment.
     *
     * @param aValidForPayment the new value for validForPayment
     */
    public void setValidForPayment(String aValidForPayment) {
        validForPayment = aValidForPayment;
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
     * Access method for siebelAssetId.
     *
     * @return the current value of siebelAssetId
     */
    public String getSiebelAssetId() {
        return siebelAssetId;
    }

    /**
     * Setter method for siebelAssetId.
     *
     * @param aSiebelAssetId the new value for siebelAssetId
     */
    public void setSiebelAssetId(String aSiebelAssetId) {
        siebelAssetId = aSiebelAssetId;
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
     * Access method for reminderSysid.
     *
     * @return the current value of reminderSysid
     */
    public BigDecimal getReminderSysid() {
        return reminderSysid;
    }

    /**
     * Setter method for reminderSysid.
     *
     * @param aReminderSysid the new value for reminderSysid
     */
    public void setReminderSysid(BigDecimal aReminderSysid) {
        reminderSysid = aReminderSysid;
    }

    /**
     * Access method for extVendorAssetId.
     *
     * @return the current value of extVendorAssetId
     */
    public String getExtVendorAssetId() {
        return extVendorAssetId;
    }

    /**
     * Setter method for extVendorAssetId.
     *
     * @param aExtVendorAssetId the new value for extVendorAssetId
     */
    public void setExtVendorAssetId(String aExtVendorAssetId) {
        extVendorAssetId = aExtVendorAssetId;
    }

    /**
     * Access method for cardSuffix.
     *
     * @return the current value of cardSuffix
     */
    public String getCardSuffix() {
        return cardSuffix;
    }

    /**
     * Setter method for cardSuffix.
     *
     * @param aCardSuffix the new value for cardSuffix
     */
    public void setCardSuffix(String aCardSuffix) {
        cardSuffix = aCardSuffix;
    }

    /**
     * Access method for expirationDate.
     *
     * @return the current value of expirationDate
     */
    public Timestamp getExpirationDate() {
        return expirationDate;
    }

    /**
     * Setter method for expirationDate.
     *
     * @param aExpirationDate the new value for expirationDate
     */
    public void setExpirationDate(Timestamp aExpirationDate) {
        expirationDate = aExpirationDate;
    }

    /**
     * Access method for startDate.
     *
     * @return the current value of startDate
     */
    public Timestamp getStartDate() {
        return startDate;
    }

    /**
     * Setter method for startDate.
     *
     * @param aStartDate the new value for startDate
     */
    public void setStartDate(Timestamp aStartDate) {
        startDate = aStartDate;
    }

    /**
     * Access method for addClientUsername.
     *
     * @return the current value of addClientUsername
     */
    public String getAddClientUsername() {
        return addClientUsername;
    }

    /**
     * Setter method for addClientUsername.
     *
     * @param aAddClientUsername the new value for addClientUsername
     */
    public void setAddClientUsername(String aAddClientUsername) {
        addClientUsername = aAddClientUsername;
    }

    /**
     * Access method for updateClientUsername.
     *
     * @return the current value of updateClientUsername
     */
    public String getUpdateClientUsername() {
        return updateClientUsername;
    }

    /**
     * Setter method for updateClientUsername.
     *
     * @param aUpdateClientUsername the new value for updateClientUsername
     */
    public void setUpdateClientUsername(String aUpdateClientUsername) {
        updateClientUsername = aUpdateClientUsername;
    }

    /**
     * Access method for doNotDisplayFlag.
     *
     * @return the current value of doNotDisplayFlag
     */
    public String getDoNotDisplayFlag() {
        return doNotDisplayFlag;
    }

    /**
     * Setter method for doNotDisplayFlag.
     *
     * @param aDoNotDisplayFlag the new value for doNotDisplayFlag
     */
    public void setDoNotDisplayFlag(String aDoNotDisplayFlag) {
        doNotDisplayFlag = aDoNotDisplayFlag;
    }

    /**
     * Access method for channelDescription.
     *
     * @return the current value of channelDescription
     */
    public String getChannelDescription() {
        return channelDescription;
    }

    /**
     * Setter method for channelDescription.
     *
     * @param aChannelDescription the new value for channelDescription
     */
    public void setChannelDescription(String aChannelDescription) {
        channelDescription = aChannelDescription;
    }

    /**
     * Access method for channelSysid.
     *
     * @return the current value of channelSysid
     */
    public BigDecimal getChannelSysid() {
        return channelSysid;
    }

    /**
     * Setter method for channelSysid.
     *
     * @param aChannelSysid the new value for channelSysid
     */
    public void setChannelSysid(BigDecimal aChannelSysid) {
        channelSysid = aChannelSysid;
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
     * Access method for regionId.
     *
     * @return the current value of regionId
     */
    public BigDecimal getRegionId() {
        return regionId;
    }

    /**
     * Setter method for regionId.
     *
     * @param aRegionId the new value for regionId
     */
    public void setRegionId(BigDecimal aRegionId) {
        regionId = aRegionId;
    }

    /**
     * Access method for issueNumber.
     *
     * @return the current value of issueNumber
     */
    public String getIssueNumber() {
        return issueNumber;
    }

    /**
     * Setter method for issueNumber.
     *
     * @param aIssueNumber the new value for issueNumber
     */
    public void setIssueNumber(String aIssueNumber) {
        issueNumber = aIssueNumber;
    }

    /**
     * Access method for issueDate.
     *
     * @return the current value of issueDate
     */
    public Timestamp getIssueDate() {
        return issueDate;
    }

    /**
     * Setter method for issueDate.
     *
     * @param aIssueDate the new value for issueDate
     */
    public void setIssueDate(Timestamp aIssueDate) {
        issueDate = aIssueDate;
    }

    /**
     * Access method for receivedDate.
     *
     * @return the current value of receivedDate
     */
    public Timestamp getReceivedDate() {
        return receivedDate;
    }

    /**
     * Setter method for receivedDate.
     *
     * @param aReceivedDate the new value for receivedDate
     */
    public void setReceivedDate(Timestamp aReceivedDate) {
        receivedDate = aReceivedDate;
    }

    /**
     * Access method for cardPrefixNbr.
     *
     * @return the current value of cardPrefixNbr
     */
    public String getCardPrefixNbr() {
        return cardPrefixNbr;
    }

    /**
     * Setter method for cardPrefixNbr.
     *
     * @param aCardPrefixNbr the new value for cardPrefixNbr
     */
    public void setCardPrefixNbr(String aCardPrefixNbr) {
        cardPrefixNbr = aCardPrefixNbr;
    }

    /**
     * Access method for cardLengthNbr.
     *
     * @return the current value of cardLengthNbr
     */
    public BigDecimal getCardLengthNbr() {
        return cardLengthNbr;
    }

    /**
     * Setter method for cardLengthNbr.
     *
     * @param aCardLengthNbr the new value for cardLengthNbr
     */
    public void setCardLengthNbr(BigDecimal aCardLengthNbr) {
        cardLengthNbr = aCardLengthNbr;
    }

    /**
     * Access method for cardNumberUnknownFl.
     *
     * @return the current value of cardNumberUnknownFl
     */
    public BigDecimal getCardNumberUnknownFl() {
        return cardNumberUnknownFl;
    }

    /**
     * Setter method for cardNumberUnknownFl.
     *
     * @param aCardNumberUnknownFl the new value for cardNumberUnknownFl
     */
    public void setCardNumberUnknownFl(BigDecimal aCardNumberUnknownFl) {
        cardNumberUnknownFl = aCardNumberUnknownFl;
    }

    /**
     * Access method for replacedCardSysid.
     *
     * @return the current value of replacedCardSysid
     */
    public BigDecimal getReplacedCardSysid() {
        return replacedCardSysid;
    }

    /**
     * Setter method for replacedCardSysid.
     *
     * @param aReplacedCardSysid the new value for replacedCardSysid
     */
    public void setReplacedCardSysid(BigDecimal aReplacedCardSysid) {
        replacedCardSysid = aReplacedCardSysid;
    }

    /**
     * Access method for friendlyName.
     *
     * @return the current value of friendlyName
     */
    public String getFriendlyName() {
        return friendlyName;
    }

    /**
     * Setter method for friendlyName.
     *
     * @param aFriendlyName the new value for friendlyName
     */
    public void setFriendlyName(String aFriendlyName) {
        friendlyName = aFriendlyName;
    }

    /**
     * Access method for encryptionKeyName.
     *
     * @return the current value of encryptionKeyName
     */
    public String getEncryptionKeyName() {
        return encryptionKeyName;
    }

    /**
     * Setter method for encryptionKeyName.
     *
     * @param aEncryptionKeyName the new value for encryptionKeyName
     */
    public void setEncryptionKeyName(String aEncryptionKeyName) {
        encryptionKeyName = aEncryptionKeyName;
    }

    /**
     * Access method for hashedCardNumber.
     *
     * @return the current value of hashedCardNumber
     */
    public String getHashedCardNumber() {
        return hashedCardNumber;
    }

    /**
     * Setter method for hashedCardNumber.
     *
     * @param aHashedCardNumber the new value for hashedCardNumber
     */
    public void setHashedCardNumber(String aHashedCardNumber) {
        hashedCardNumber = aHashedCardNumber;
    }

    /**
     * Access method for encryptedCardNumber.
     *
     * @return the current value of encryptedCardNumber
     */
    public String getEncryptedCardNumber() {
        return encryptedCardNumber;
    }

    /**
     * Setter method for encryptedCardNumber.
     *
     * @param aEncryptedCardNumber the new value for encryptedCardNumber
     */
    public void setEncryptedCardNumber(String aEncryptedCardNumber) {
        encryptedCardNumber = aEncryptedCardNumber;
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
     * Access method for lostStolenReportSysid.
     *
     * @return the current value of lostStolenReportSysid
     */
    public BigDecimal getLostStolenReportSysid() {
        return lostStolenReportSysid;
    }

    /**
     * Setter method for lostStolenReportSysid.
     *
     * @param aLostStolenReportSysid the new value for lostStolenReportSysid
     */
    public void setLostStolenReportSysid(BigDecimal aLostStolenReportSysid) {
        lostStolenReportSysid = aLostStolenReportSysid;
    }

    /**
     * Access method for lostStolenStatusCodeDesc.
     *
     * @return the current value of lostStolenStatusCodeDesc
     */
    public String getLostStolenStatusCodeDesc() {
        return lostStolenStatusCodeDesc;
    }

    /**
     * Setter method for lostStolenStatusCodeDesc.
     *
     * @param aLostStolenStatusCodeDesc the new value for lostStolenStatusCodeDesc
     */
    public void setLostStolenStatusCodeDesc(String aLostStolenStatusCodeDesc) {
        lostStolenStatusCodeDesc = aLostStolenStatusCodeDesc;
    }

    /**
     * Access method for lostStolenStatusCode.
     *
     * @return the current value of lostStolenStatusCode
     */
    public String getLostStolenStatusCode() {
        return lostStolenStatusCode;
    }

    /**
     * Setter method for lostStolenStatusCode.
     *
     * @param aLostStolenStatusCode the new value for lostStolenStatusCode
     */
    public void setLostStolenStatusCode(String aLostStolenStatusCode) {
        lostStolenStatusCode = aLostStolenStatusCode;
    }

    /**
     * Access method for reasonCodeDesc.
     *
     * @return the current value of reasonCodeDesc
     */
    public String getReasonCodeDesc() {
        return reasonCodeDesc;
    }

    /**
     * Setter method for reasonCodeDesc.
     *
     * @param aReasonCodeDesc the new value for reasonCodeDesc
     */
    public void setReasonCodeDesc(String aReasonCodeDesc) {
        reasonCodeDesc = aReasonCodeDesc;
    }

    /**
     * Access method for reasonCode.
     *
     * @return the current value of reasonCode
     */
    public BigDecimal getReasonCode() {
        return reasonCode;
    }

    /**
     * Setter method for reasonCode.
     *
     * @param aReasonCode the new value for reasonCode
     */
    public void setReasonCode(BigDecimal aReasonCode) {
        reasonCode = aReasonCode;
    }

    /**
     * Access method for lostStlCrdCallDate.
     *
     * @return the current value of lostStlCrdCallDate
     */
    public Timestamp getLostStlCrdCallDate() {
        return lostStlCrdCallDate;
    }

    /**
     * Setter method for lostStlCrdCallDate.
     *
     * @param aLostStlCrdCallDate the new value for lostStlCrdCallDate
     */
    public void setLostStlCrdCallDate(Timestamp aLostStlCrdCallDate) {
        lostStlCrdCallDate = aLostStlCrdCallDate;
    }

    /**
     * Access method for lostStlCrdCallUsername.
     *
     * @return the current value of lostStlCrdCallUsername
     */
    public String getLostStlCrdCallUsername() {
        return lostStlCrdCallUsername;
    }

    /**
     * Setter method for lostStlCrdCallUsername.
     *
     * @param aLostStlCrdCallUsername the new value for lostStlCrdCallUsername
     */
    public void setLostStlCrdCallUsername(String aLostStlCrdCallUsername) {
        lostStlCrdCallUsername = aLostStlCrdCallUsername;
    }

    /**
     * Access method for lostStlCrdLastStatusChgDate.
     *
     * @return the current value of lostStlCrdLastStatusChgDate
     */
    public Timestamp getLostStlCrdLastStatusChgDate() {
        return lostStlCrdLastStatusChgDate;
    }

    /**
     * Setter method for lostStlCrdLastStatusChgDate.
     *
     * @param aLostStlCrdLastStatusChgDate the new value for lostStlCrdLastStatusChgDate
     */
    public void setLostStlCrdLastStatusChgDate(Timestamp aLostStlCrdLastStatusChgDate) {
        lostStlCrdLastStatusChgDate = aLostStlCrdLastStatusChgDate;
    }

    /**
     * Access method for lastStatusChgUsername.
     *
     * @return the current value of lastStatusChgUsername
     */
    public String getLastStatusChgUsername() {
        return lastStatusChgUsername;
    }

    /**
     * Setter method for lastStatusChgUsername.
     *
     * @param aLastStatusChgUsername the new value for lastStatusChgUsername
     */
    public void setLastStatusChgUsername(String aLastStatusChgUsername) {
        lastStatusChgUsername = aLastStatusChgUsername;
    }

    /**
     * Access method for lostStlCrdComments.
     *
     * @return the current value of lostStlCrdComments
     */
    public String getLostStlCrdComments() {
        return lostStlCrdComments;
    }

    /**
     * Setter method for lostStlCrdComments.
     *
     * @param aLostStlCrdComments the new value for lostStlCrdComments
     */
    public void setLostStlCrdComments(String aLostStlCrdComments) {
        lostStlCrdComments = aLostStlCrdComments;
    }

    /**
     * Access method for autoFaxRequestDate.
     *
     * @return the current value of autoFaxRequestDate
     */
    public Timestamp getAutoFaxRequestDate() {
        return autoFaxRequestDate;
    }

    /**
     * Setter method for autoFaxRequestDate.
     *
     * @param aAutoFaxRequestDate the new value for autoFaxRequestDate
     */
    public void setAutoFaxRequestDate(Timestamp aAutoFaxRequestDate) {
        autoFaxRequestDate = aAutoFaxRequestDate;
    }

    /**
     * Access method for autoFaxRequestStatus.
     *
     * @return the current value of autoFaxRequestStatus
     */
    public String getAutoFaxRequestStatus() {
        return autoFaxRequestStatus;
    }

    /**
     * Setter method for autoFaxRequestStatus.
     *
     * @param aAutoFaxRequestStatus the new value for autoFaxRequestStatus
     */
    public void setAutoFaxRequestStatus(String aAutoFaxRequestStatus) {
        autoFaxRequestStatus = aAutoFaxRequestStatus;
    }

    /**
     * Access method for autoFaxCompletionDate.
     *
     * @return the current value of autoFaxCompletionDate
     */
    public Timestamp getAutoFaxCompletionDate() {
        return autoFaxCompletionDate;
    }

    /**
     * Setter method for autoFaxCompletionDate.
     *
     * @param aAutoFaxCompletionDate the new value for autoFaxCompletionDate
     */
    public void setAutoFaxCompletionDate(Timestamp aAutoFaxCompletionDate) {
        autoFaxCompletionDate = aAutoFaxCompletionDate;
    }

    /**
     * Access method for autoFaxReason.
     *
     * @return the current value of autoFaxReason
     */
    public String getAutoFaxReason() {
        return autoFaxReason;
    }

    /**
     * Setter method for autoFaxReason.
     *
     * @param aAutoFaxReason the new value for autoFaxReason
     */
    public void setAutoFaxReason(String aAutoFaxReason) {
        autoFaxReason = aAutoFaxReason;
    }

    /**
     * Access method for notificationPhoneNumeric.
     *
     * @return the current value of notificationPhoneNumeric
     */
    public String getNotificationPhoneNumeric() {
        return notificationPhoneNumeric;
    }

    /**
     * Setter method for notificationPhoneNumeric.
     *
     * @param aNotificationPhoneNumeric the new value for notificationPhoneNumeric
     */
    public void setNotificationPhoneNumeric(String aNotificationPhoneNumeric) {
        notificationPhoneNumeric = aNotificationPhoneNumeric;
    }

    /**
     * Access method for lostStolenCardAddDate.
     *
     * @return the current value of lostStolenCardAddDate
     */
    public Timestamp getLostStolenCardAddDate() {
        return lostStolenCardAddDate;
    }

    /**
     * Setter method for lostStolenCardAddDate.
     *
     * @param aLostStolenCardAddDate the new value for lostStolenCardAddDate
     */
    public void setLostStolenCardAddDate(Timestamp aLostStolenCardAddDate) {
        lostStolenCardAddDate = aLostStolenCardAddDate;
    }

    /**
     * Access method for lostStolenCardAddUsername.
     *
     * @return the current value of lostStolenCardAddUsername
     */
    public String getLostStolenCardAddUsername() {
        return lostStolenCardAddUsername;
    }

    /**
     * Setter method for lostStolenCardAddUsername.
     *
     * @param aLostStolenCardAddUsername the new value for lostStolenCardAddUsername
     */
    public void setLostStolenCardAddUsername(String aLostStolenCardAddUsername) {
        lostStolenCardAddUsername = aLostStolenCardAddUsername;
    }

    /**
     * Access method for lostStolenCardUpdateDate.
     *
     * @return the current value of lostStolenCardUpdateDate
     */
    public Timestamp getLostStolenCardUpdateDate() {
        return lostStolenCardUpdateDate;
    }

    /**
     * Setter method for lostStolenCardUpdateDate.
     *
     * @param aLostStolenCardUpdateDate the new value for lostStolenCardUpdateDate
     */
    public void setLostStolenCardUpdateDate(Timestamp aLostStolenCardUpdateDate) {
        lostStolenCardUpdateDate = aLostStolenCardUpdateDate;
    }

    /**
     * Access method for lostStolenCardUpdateUsername.
     *
     * @return the current value of lostStolenCardUpdateUsername
     */
    public String getLostStolenCardUpdateUsername() {
        return lostStolenCardUpdateUsername;
    }

    /**
     * Setter method for lostStolenCardUpdateUsername.
     *
     * @param aLostStolenCardUpdateUsername the new value for lostStolenCardUpdateUsername
     */
    public void setLostStolenCardUpdateUsername(String aLostStolenCardUpdateUsername) {
        lostStolenCardUpdateUsername = aLostStolenCardUpdateUsername;
    }

    /**
     * Access method for autoFaxRequested.
     *
     * @return the current value of autoFaxRequested
     */
    public String getAutoFaxRequested() {
        return autoFaxRequested;
    }

    /**
     * Setter method for autoFaxRequested.
     *
     * @param aAutoFaxRequested the new value for autoFaxRequested
     */
    public void setAutoFaxRequested(String aAutoFaxRequested) {
        autoFaxRequested = aAutoFaxRequested;
    }

    /**
     * Access method for autoFaxSent.
     *
     * @return the current value of autoFaxSent
     */
    public String getAutoFaxSent() {
        return autoFaxSent;
    }

    /**
     * Setter method for autoFaxSent.
     *
     * @param aAutoFaxSent the new value for autoFaxSent
     */
    public void setAutoFaxSent(String aAutoFaxSent) {
        autoFaxSent = aAutoFaxSent;
    }

    /**
     * Access method for missingChecksFlag.
     *
     * @return the current value of missingChecksFlag
     */
    public String getMissingChecksFlag() {
        return missingChecksFlag;
    }

    /**
     * Setter method for missingChecksFlag.
     *
     * @param aMissingChecksFlag the new value for missingChecksFlag
     */
    public void setMissingChecksFlag(String aMissingChecksFlag) {
        missingChecksFlag = aMissingChecksFlag;
    }

    /**
     * Access method for cardSignedFlag.
     *
     * @return the current value of cardSignedFlag
     */
    public String getCardSignedFlag() {
        return cardSignedFlag;
    }

    /**
     * Setter method for cardSignedFlag.
     *
     * @param aCardSignedFlag the new value for cardSignedFlag
     */
    public void setCardSignedFlag(String aCardSignedFlag) {
        cardSignedFlag = aCardSignedFlag;
    }

    /**
     * Access method for pinNumberLossFlag.
     *
     * @return the current value of pinNumberLossFlag
     */
    public String getPinNumberLossFlag() {
        return pinNumberLossFlag;
    }

    /**
     * Setter method for pinNumberLossFlag.
     *
     * @param aPinNumberLossFlag the new value for pinNumberLossFlag
     */
    public void setPinNumberLossFlag(String aPinNumberLossFlag) {
        pinNumberLossFlag = aPinNumberLossFlag;
    }

    /**
     * Access method for replacementCardReqFlag.
     *
     * @return the current value of replacementCardReqFlag
     */
    public String getReplacementCardReqFlag() {
        return replacementCardReqFlag;
    }

    /**
     * Setter method for replacementCardReqFlag.
     *
     * @param aReplacementCardReqFlag the new value for replacementCardReqFlag
     */
    public void setReplacementCardReqFlag(String aReplacementCardReqFlag) {
        replacementCardReqFlag = aReplacementCardReqFlag;
    }

    /**
     * Access method for checkSignedFlag.
     *
     * @return the current value of checkSignedFlag
     */
    public String getCheckSignedFlag() {
        return checkSignedFlag;
    }

    /**
     * Setter method for checkSignedFlag.
     *
     * @param aCheckSignedFlag the new value for checkSignedFlag
     */
    public void setCheckSignedFlag(String aCheckSignedFlag) {
        checkSignedFlag = aCheckSignedFlag;
    }

    /**
     * Access method for notificationAttempts.
     *
     * @return the current value of notificationAttempts
     */
    public BigDecimal getNotificationAttempts() {
        return notificationAttempts;
    }

    /**
     * Setter method for notificationAttempts.
     *
     * @param aNotificationAttempts the new value for notificationAttempts
     */
    public void setNotificationAttempts(BigDecimal aNotificationAttempts) {
        notificationAttempts = aNotificationAttempts;
    }

    /**
     * Access method for lastUsedDate.
     *
     * @return the current value of lastUsedDate
     */
    public Timestamp getLastUsedDate() {
        return lastUsedDate;
    }

    /**
     * Setter method for lastUsedDate.
     *
     * @param aLastUsedDate the new value for lastUsedDate
     */
    public void setLastUsedDate(Timestamp aLastUsedDate) {
        lastUsedDate = aLastUsedDate;
    }

    /**
     * Access method for checksValueAmount.
     *
     * @return the current value of checksValueAmount
     */
    public BigDecimal getChecksValueAmount() {
        return checksValueAmount;
    }

    /**
     * Setter method for checksValueAmount.
     *
     * @param aChecksValueAmount the new value for checksValueAmount
     */
    public void setChecksValueAmount(BigDecimal aChecksValueAmount) {
        checksValueAmount = aChecksValueAmount;
    }

    /**
     * Access method for registeredOnLoss.
     *
     * @return the current value of registeredOnLoss
     */
    public String getRegisteredOnLoss() {
        return registeredOnLoss;
    }

    /**
     * Setter method for registeredOnLoss.
     *
     * @param aRegisteredOnLoss the new value for registeredOnLoss
     */
    public void setRegisteredOnLoss(String aRegisteredOnLoss) {
        registeredOnLoss = aRegisteredOnLoss;
    }

    /**
     * Access method for checksCurrency.
     *
     * @return the current value of checksCurrency
     */
    public String getChecksCurrency() {
        return checksCurrency;
    }

    /**
     * Setter method for checksCurrency.
     *
     * @param aChecksCurrency the new value for checksCurrency
     */
    public void setChecksCurrency(String aChecksCurrency) {
        checksCurrency = aChecksCurrency;
    }

    /**
     * Access method for siebelId.
     *
     * @return the current value of siebelId
     */
    public String getSiebelId() {
        return siebelId;
    }

    /**
     * Setter method for siebelId.
     *
     * @param aSiebelId the new value for siebelId
     */
    public void setSiebelId(String aSiebelId) {
        siebelId = aSiebelId;
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
     * Access method for dataVaultId.
     *
     * @return the current value of dataVaultId
     */
    public long getDataVaultId() {
        return dataVaultId;
    }

    /**
     * Setter method for dataVaultId.
     *
     * @param aDataVaultId the new value for dataVaultId
     */
    public void setDataVaultId(long aDataVaultId) {
        dataVaultId = aDataVaultId;
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
     * Access method for stageMembership.
     *
     * @return the current value of stageMembership
     */
    public StageMembership getStageMembership() {
        return stageMembership;
    }

    /**
     * Setter method for stageMembership.
     *
     * @param aStageMembership the new value for stageMembership
     */
    public void setStageMembership(StageMembership aStageMembership) {
        stageMembership = aStageMembership;
    }

    /**
     * Access method for stagePaymentVehicle.
     *
     * @return the current value of stagePaymentVehicle
     */
    public Set<StagePaymentVehicle> getStagePaymentVehicle() {
        return stagePaymentVehicle;
    }

    /**
     * Setter method for stagePaymentVehicle.
     *
     * @param aStagePaymentVehicle the new value for stagePaymentVehicle
     */
    public void setStagePaymentVehicle(Set<StagePaymentVehicle> aStagePaymentVehicle) {
        stagePaymentVehicle = aStagePaymentVehicle;
    }

    /**
     * Compares the key for this instance with another StageProtectedCard.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class StageProtectedCard and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof StageProtectedCard)) {
            return false;
        }
        StageProtectedCard that = (StageProtectedCard) other;
        Object myProtectedCardSysid = this.getProtectedCardSysid();
        Object yourProtectedCardSysid = that.getProtectedCardSysid();
        if (myProtectedCardSysid==null ? yourProtectedCardSysid!=null : !myProtectedCardSysid.equals(yourProtectedCardSysid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another StageProtectedCard.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof StageProtectedCard)) return false;
        return this.equalKeys(other) && ((StageProtectedCard)other).equalKeys(this);
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
        if (getProtectedCardSysid() == null) {
            i = 0;
        } else {
            i = getProtectedCardSysid().hashCode();
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
        StringBuffer sb = new StringBuffer("[StageProtectedCard |");
        sb.append(" protectedCardSysid=").append(getProtectedCardSysid());
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
        ret.put("protectedCardSysid", getProtectedCardSysid());
        return ret;
    }

}
