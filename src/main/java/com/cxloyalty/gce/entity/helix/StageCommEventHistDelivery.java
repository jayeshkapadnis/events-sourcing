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

@Entity(name="stage_comm_event_hist_delivery")
public class StageCommEventHistDelivery implements Serializable {

    /** Primary key. */
    protected static final String PK = "stageCommEventHistDeliveryId";

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

    @Column(name="comm_event_delivery_status_id", nullable=false, length=30)
    private String commEventDeliveryStatusId;
    @Column(name="comm_event_delivery_stat_desc", nullable=false, length=30)
    private String commEventDeliveryStatDesc;
    @Column(name="comm_event_delivery_date", nullable=false)
    private Timestamp commEventDeliveryDate;
    @Column(name="comm_event_delivery_info", length=100)
    private String commEventDeliveryInfo;
    @Column(name="user_created", nullable=false, length=30)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=30)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @Column(name="fulfillment_file_history_sysid", precision=10)
    private BigDecimal fulfillmentFileHistorySysid;
    @Id
    @Column(name="stage_comm_event_hist_delivery_id", unique=true, nullable=false, precision=19)
    private long stageCommEventHistDeliveryId;
    @Column(name="stage_created_date")
    private Timestamp stageCreatedDate;
    @Column(name="stage_updated_date")
    private Timestamp stageUpdatedDate;
    @ManyToOne(optional=false)
    @JoinColumn(name="comm_transaction_id", nullable=false)
    private StageCommEvent stageCommEvent;

    /** Default constructor. */
    public StageCommEventHistDelivery() {
        super();
    }

    /**
     * Access method for commEventDeliveryStatusId.
     *
     * @return the current value of commEventDeliveryStatusId
     */
    public String getCommEventDeliveryStatusId() {
        return commEventDeliveryStatusId;
    }

    /**
     * Setter method for commEventDeliveryStatusId.
     *
     * @param aCommEventDeliveryStatusId the new value for commEventDeliveryStatusId
     */
    public void setCommEventDeliveryStatusId(String aCommEventDeliveryStatusId) {
        commEventDeliveryStatusId = aCommEventDeliveryStatusId;
    }

    /**
     * Access method for commEventDeliveryStatDesc.
     *
     * @return the current value of commEventDeliveryStatDesc
     */
    public String getCommEventDeliveryStatDesc() {
        return commEventDeliveryStatDesc;
    }

    /**
     * Setter method for commEventDeliveryStatDesc.
     *
     * @param aCommEventDeliveryStatDesc the new value for commEventDeliveryStatDesc
     */
    public void setCommEventDeliveryStatDesc(String aCommEventDeliveryStatDesc) {
        commEventDeliveryStatDesc = aCommEventDeliveryStatDesc;
    }

    /**
     * Access method for commEventDeliveryDate.
     *
     * @return the current value of commEventDeliveryDate
     */
    public Timestamp getCommEventDeliveryDate() {
        return commEventDeliveryDate;
    }

    /**
     * Setter method for commEventDeliveryDate.
     *
     * @param aCommEventDeliveryDate the new value for commEventDeliveryDate
     */
    public void setCommEventDeliveryDate(Timestamp aCommEventDeliveryDate) {
        commEventDeliveryDate = aCommEventDeliveryDate;
    }

    /**
     * Access method for commEventDeliveryInfo.
     *
     * @return the current value of commEventDeliveryInfo
     */
    public String getCommEventDeliveryInfo() {
        return commEventDeliveryInfo;
    }

    /**
     * Setter method for commEventDeliveryInfo.
     *
     * @param aCommEventDeliveryInfo the new value for commEventDeliveryInfo
     */
    public void setCommEventDeliveryInfo(String aCommEventDeliveryInfo) {
        commEventDeliveryInfo = aCommEventDeliveryInfo;
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
     * Access method for stageCommEventHistDeliveryId.
     *
     * @return the current value of stageCommEventHistDeliveryId
     */
    public long getStageCommEventHistDeliveryId() {
        return stageCommEventHistDeliveryId;
    }

    /**
     * Setter method for stageCommEventHistDeliveryId.
     *
     * @param aStageCommEventHistDeliveryId the new value for stageCommEventHistDeliveryId
     */
    public void setStageCommEventHistDeliveryId(long aStageCommEventHistDeliveryId) {
        stageCommEventHistDeliveryId = aStageCommEventHistDeliveryId;
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
     * Access method for stageCommEvent.
     *
     * @return the current value of stageCommEvent
     */
    public StageCommEvent getStageCommEvent() {
        return stageCommEvent;
    }

    /**
     * Setter method for stageCommEvent.
     *
     * @param aStageCommEvent the new value for stageCommEvent
     */
    public void setStageCommEvent(StageCommEvent aStageCommEvent) {
        stageCommEvent = aStageCommEvent;
    }

    /**
     * Compares the key for this instance with another StageCommEventHistDelivery.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class StageCommEventHistDelivery and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof StageCommEventHistDelivery)) {
            return false;
        }
        StageCommEventHistDelivery that = (StageCommEventHistDelivery) other;
        if (this.getStageCommEventHistDeliveryId() != that.getStageCommEventHistDeliveryId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another StageCommEventHistDelivery.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof StageCommEventHistDelivery)) return false;
        return this.equalKeys(other) && ((StageCommEventHistDelivery)other).equalKeys(this);
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
        i = (int)(getStageCommEventHistDeliveryId() ^ (getStageCommEventHistDeliveryId()>>>32));
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
        StringBuffer sb = new StringBuffer("[StageCommEventHistDelivery |");
        sb.append(" stageCommEventHistDeliveryId=").append(getStageCommEventHistDeliveryId());
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
        ret.put("stageCommEventHistDeliveryId", Long.valueOf(getStageCommEventHistDeliveryId()));
        return ret;
    }

}
