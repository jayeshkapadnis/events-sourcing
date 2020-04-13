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

@Entity(name="stage_comm_event")
public class StageCommEvent implements Serializable {

    /** Primary key. */
    protected static final String PK = "commTransactionId";

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
    @Column(name="comm_transaction_id", unique=true, nullable=false, precision=10)
    private BigDecimal commTransactionId;
    @Column(name="comm_type_desc", nullable=false, length=100)
    private String commTypeDesc;
    @Column(name="comm_event_delivery_status", nullable=false, length=30)
    private String commEventDeliveryStatus;
    @Column(name="fulfillment_type_id", nullable=false, length=250)
    private String fulfillmentTypeId;
    @Column(name="fulfillment_processor", nullable=false, length=250)
    private String fulfillmentProcessor;
    @Column(name="comm_event_date", nullable=false)
    private Timestamp commEventDate;
    @Column(name="comm_template_id", precision=10)
    private BigDecimal commTemplateId;
    @Column(name="to_address", nullable=false, length=500)
    private String toAddress;
    @Column(name="user_created", nullable=false, length=50)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=30)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @Column(name="comm_source_data")
    private String commSourceData;
    @Column(name="kit_code", length=200)
    private String kitCode;
    @Column(name="user_requested", length=50)
    private String userRequested;
    @Column(name="comm_association_id", precision=19)
    private long commAssociationId;
    @Column(name="mem_subscription_detail_id", precision=10)
    private BigDecimal memSubscriptionDetailId;
    @Column(name="fulfillment_file_history_sysid", precision=10)
    private BigDecimal fulfillmentFileHistorySysid;
    @Column(name="file_name", nullable=false, length=100)
    private String fileName;
    @Column(name="file_sequence", precision=10)
    private BigDecimal fileSequence;
    @Column(name="actual_record_count", nullable=false, precision=10)
    private BigDecimal actualRecordCount;
    @Column(name="membership_id", nullable=false, precision=19)
    private long membershipId;
    @Column(name="stage_created_date")
    private Timestamp stageCreatedDate;
    @Column(name="stage_updated_date")
    private Timestamp stageUpdatedDate;
    @OneToMany(mappedBy="stageCommEvent")
    private Set<StageCommEventHistDelivery> stageCommEventHistDelivery;
    @ManyToOne(optional=false)
    @JoinColumn(name="member_id", nullable=false)
    private StageMember stageMember;
    @ManyToOne
    @JoinColumn(name="request_sysid")
    private StageServiceRequest stageServiceRequest;

    /** Default constructor. */
    public StageCommEvent() {
        super();
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
     * Access method for commTypeDesc.
     *
     * @return the current value of commTypeDesc
     */
    public String getCommTypeDesc() {
        return commTypeDesc;
    }

    /**
     * Setter method for commTypeDesc.
     *
     * @param aCommTypeDesc the new value for commTypeDesc
     */
    public void setCommTypeDesc(String aCommTypeDesc) {
        commTypeDesc = aCommTypeDesc;
    }

    /**
     * Access method for commEventDeliveryStatus.
     *
     * @return the current value of commEventDeliveryStatus
     */
    public String getCommEventDeliveryStatus() {
        return commEventDeliveryStatus;
    }

    /**
     * Setter method for commEventDeliveryStatus.
     *
     * @param aCommEventDeliveryStatus the new value for commEventDeliveryStatus
     */
    public void setCommEventDeliveryStatus(String aCommEventDeliveryStatus) {
        commEventDeliveryStatus = aCommEventDeliveryStatus;
    }

    /**
     * Access method for fulfillmentTypeId.
     *
     * @return the current value of fulfillmentTypeId
     */
    public String getFulfillmentTypeId() {
        return fulfillmentTypeId;
    }

    /**
     * Setter method for fulfillmentTypeId.
     *
     * @param aFulfillmentTypeId the new value for fulfillmentTypeId
     */
    public void setFulfillmentTypeId(String aFulfillmentTypeId) {
        fulfillmentTypeId = aFulfillmentTypeId;
    }

    /**
     * Access method for fulfillmentProcessor.
     *
     * @return the current value of fulfillmentProcessor
     */
    public String getFulfillmentProcessor() {
        return fulfillmentProcessor;
    }

    /**
     * Setter method for fulfillmentProcessor.
     *
     * @param aFulfillmentProcessor the new value for fulfillmentProcessor
     */
    public void setFulfillmentProcessor(String aFulfillmentProcessor) {
        fulfillmentProcessor = aFulfillmentProcessor;
    }

    /**
     * Access method for commEventDate.
     *
     * @return the current value of commEventDate
     */
    public Timestamp getCommEventDate() {
        return commEventDate;
    }

    /**
     * Setter method for commEventDate.
     *
     * @param aCommEventDate the new value for commEventDate
     */
    public void setCommEventDate(Timestamp aCommEventDate) {
        commEventDate = aCommEventDate;
    }

    /**
     * Access method for commTemplateId.
     *
     * @return the current value of commTemplateId
     */
    public BigDecimal getCommTemplateId() {
        return commTemplateId;
    }

    /**
     * Setter method for commTemplateId.
     *
     * @param aCommTemplateId the new value for commTemplateId
     */
    public void setCommTemplateId(BigDecimal aCommTemplateId) {
        commTemplateId = aCommTemplateId;
    }

    /**
     * Access method for toAddress.
     *
     * @return the current value of toAddress
     */
    public String getToAddress() {
        return toAddress;
    }

    /**
     * Setter method for toAddress.
     *
     * @param aToAddress the new value for toAddress
     */
    public void setToAddress(String aToAddress) {
        toAddress = aToAddress;
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
     * Access method for commSourceData.
     *
     * @return the current value of commSourceData
     */
    public String getCommSourceData() {
        return commSourceData;
    }

    /**
     * Setter method for commSourceData.
     *
     * @param aCommSourceData the new value for commSourceData
     */
    public void setCommSourceData(String aCommSourceData) {
        commSourceData = aCommSourceData;
    }

    /**
     * Access method for kitCode.
     *
     * @return the current value of kitCode
     */
    public String getKitCode() {
        return kitCode;
    }

    /**
     * Setter method for kitCode.
     *
     * @param aKitCode the new value for kitCode
     */
    public void setKitCode(String aKitCode) {
        kitCode = aKitCode;
    }

    /**
     * Access method for userRequested.
     *
     * @return the current value of userRequested
     */
    public String getUserRequested() {
        return userRequested;
    }

    /**
     * Setter method for userRequested.
     *
     * @param aUserRequested the new value for userRequested
     */
    public void setUserRequested(String aUserRequested) {
        userRequested = aUserRequested;
    }

    /**
     * Access method for commAssociationId.
     *
     * @return the current value of commAssociationId
     */
    public long getCommAssociationId() {
        return commAssociationId;
    }

    /**
     * Setter method for commAssociationId.
     *
     * @param aCommAssociationId the new value for commAssociationId
     */
    public void setCommAssociationId(long aCommAssociationId) {
        commAssociationId = aCommAssociationId;
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
     * Access method for fulfillmentFileHistorySysid.
     *
     * @return the current value of fulfillmentFileHistorySysid
     */
    public BigDecimal getFulfillmentFileHistorySysid() {
        return fulfillmentFileHistorySysid;
    }

    /**
     * Setter method for fulfillmentFileHistorySysid.
     *
     * @param aFulfillmentFileHistorySysid the new value for fulfillmentFileHistorySysid
     */
    public void setFulfillmentFileHistorySysid(BigDecimal aFulfillmentFileHistorySysid) {
        fulfillmentFileHistorySysid = aFulfillmentFileHistorySysid;
    }

    /**
     * Access method for fileName.
     *
     * @return the current value of fileName
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Setter method for fileName.
     *
     * @param aFileName the new value for fileName
     */
    public void setFileName(String aFileName) {
        fileName = aFileName;
    }

    /**
     * Access method for fileSequence.
     *
     * @return the current value of fileSequence
     */
    public BigDecimal getFileSequence() {
        return fileSequence;
    }

    /**
     * Setter method for fileSequence.
     *
     * @param aFileSequence the new value for fileSequence
     */
    public void setFileSequence(BigDecimal aFileSequence) {
        fileSequence = aFileSequence;
    }

    /**
     * Access method for actualRecordCount.
     *
     * @return the current value of actualRecordCount
     */
    public BigDecimal getActualRecordCount() {
        return actualRecordCount;
    }

    /**
     * Setter method for actualRecordCount.
     *
     * @param aActualRecordCount the new value for actualRecordCount
     */
    public void setActualRecordCount(BigDecimal aActualRecordCount) {
        actualRecordCount = aActualRecordCount;
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
     * Access method for stageCommEventHistDelivery.
     *
     * @return the current value of stageCommEventHistDelivery
     */
    public Set<StageCommEventHistDelivery> getStageCommEventHistDelivery() {
        return stageCommEventHistDelivery;
    }

    /**
     * Setter method for stageCommEventHistDelivery.
     *
     * @param aStageCommEventHistDelivery the new value for stageCommEventHistDelivery
     */
    public void setStageCommEventHistDelivery(Set<StageCommEventHistDelivery> aStageCommEventHistDelivery) {
        stageCommEventHistDelivery = aStageCommEventHistDelivery;
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
     * Compares the key for this instance with another StageCommEvent.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class StageCommEvent and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof StageCommEvent)) {
            return false;
        }
        StageCommEvent that = (StageCommEvent) other;
        Object myCommTransactionId = this.getCommTransactionId();
        Object yourCommTransactionId = that.getCommTransactionId();
        if (myCommTransactionId==null ? yourCommTransactionId!=null : !myCommTransactionId.equals(yourCommTransactionId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another StageCommEvent.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof StageCommEvent)) return false;
        return this.equalKeys(other) && ((StageCommEvent)other).equalKeys(this);
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
        if (getCommTransactionId() == null) {
            i = 0;
        } else {
            i = getCommTransactionId().hashCode();
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
        StringBuffer sb = new StringBuffer("[StageCommEvent |");
        sb.append(" commTransactionId=").append(getCommTransactionId());
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
        ret.put("commTransactionId", getCommTransactionId());
        return ret;
    }

}
