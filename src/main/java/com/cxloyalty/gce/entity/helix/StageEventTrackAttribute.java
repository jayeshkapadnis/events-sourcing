// Generated with g9.

package com.cxloyalty.gce.entity.helix;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.*;

@Entity(name="stage_event_track_attribute")
public class StageEventTrackAttribute implements Serializable {

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
    @Column(name="event_track_attr_id", nullable=false, precision=19)
    private long eventTrackAttrId;
    @Column(name="attribute_type_id", nullable=false, precision=9)
    private BigDecimal attributeTypeId;
    @Column(name="attribute_type_description", nullable=false, length=200)
    private String attributeTypeDescription;
    @Column(name="attribute_value", nullable=false, length=800)
    private String attributeValue;
    @Column(name="user_created", nullable=false, length=200)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=200)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @ManyToOne(optional=false)
    @JoinColumn(name="event_track_id", nullable=false)
    private StageEventTrack stageEventTrack;

    /** Default constructor. */
    public StageEventTrackAttribute() {
        super();
    }

    /**
     * Access method for eventTrackAttrId.
     *
     * @return the current value of eventTrackAttrId
     */
    public long getEventTrackAttrId() {
        return eventTrackAttrId;
    }

    /**
     * Setter method for eventTrackAttrId.
     *
     * @param aEventTrackAttrId the new value for eventTrackAttrId
     */
    public void setEventTrackAttrId(long aEventTrackAttrId) {
        eventTrackAttrId = aEventTrackAttrId;
    }

    /**
     * Access method for attributeTypeId.
     *
     * @return the current value of attributeTypeId
     */
    public BigDecimal getAttributeTypeId() {
        return attributeTypeId;
    }

    /**
     * Setter method for attributeTypeId.
     *
     * @param aAttributeTypeId the new value for attributeTypeId
     */
    public void setAttributeTypeId(BigDecimal aAttributeTypeId) {
        attributeTypeId = aAttributeTypeId;
    }

    /**
     * Access method for attributeTypeDescription.
     *
     * @return the current value of attributeTypeDescription
     */
    public String getAttributeTypeDescription() {
        return attributeTypeDescription;
    }

    /**
     * Setter method for attributeTypeDescription.
     *
     * @param aAttributeTypeDescription the new value for attributeTypeDescription
     */
    public void setAttributeTypeDescription(String aAttributeTypeDescription) {
        attributeTypeDescription = aAttributeTypeDescription;
    }

    /**
     * Access method for attributeValue.
     *
     * @return the current value of attributeValue
     */
    public String getAttributeValue() {
        return attributeValue;
    }

    /**
     * Setter method for attributeValue.
     *
     * @param aAttributeValue the new value for attributeValue
     */
    public void setAttributeValue(String aAttributeValue) {
        attributeValue = aAttributeValue;
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
     * Access method for stageEventTrack.
     *
     * @return the current value of stageEventTrack
     */
    public StageEventTrack getStageEventTrack() {
        return stageEventTrack;
    }

    /**
     * Setter method for stageEventTrack.
     *
     * @param aStageEventTrack the new value for stageEventTrack
     */
    public void setStageEventTrack(StageEventTrack aStageEventTrack) {
        stageEventTrack = aStageEventTrack;
    }

}
