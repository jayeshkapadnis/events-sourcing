// Generated with g9.

package com.cxloyalty.gce.entity.helix;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name="fulfillment_type")
public class FulfillmentType implements Serializable {

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
    @Column(name="fulfillment_type_id", nullable=false, precision=10)
    private BigDecimal fulfillmentTypeId;
    @Column(name="fulfillment_type_desc", nullable=false, length=250)
    private String fulfillmentTypeDesc;
    @Column(name="fulfillment_object_type_id", nullable=false, precision=10)
    private BigDecimal fulfillmentObjectTypeId;
    @Column(name="user_created", nullable=false, length=30)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=30)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;

    /** Default constructor. */
    public FulfillmentType() {
        super();
    }

    /**
     * Access method for fulfillmentTypeId.
     *
     * @return the current value of fulfillmentTypeId
     */
    public BigDecimal getFulfillmentTypeId() {
        return fulfillmentTypeId;
    }

    /**
     * Setter method for fulfillmentTypeId.
     *
     * @param aFulfillmentTypeId the new value for fulfillmentTypeId
     */
    public void setFulfillmentTypeId(BigDecimal aFulfillmentTypeId) {
        fulfillmentTypeId = aFulfillmentTypeId;
    }

    /**
     * Access method for fulfillmentTypeDesc.
     *
     * @return the current value of fulfillmentTypeDesc
     */
    public String getFulfillmentTypeDesc() {
        return fulfillmentTypeDesc;
    }

    /**
     * Setter method for fulfillmentTypeDesc.
     *
     * @param aFulfillmentTypeDesc the new value for fulfillmentTypeDesc
     */
    public void setFulfillmentTypeDesc(String aFulfillmentTypeDesc) {
        fulfillmentTypeDesc = aFulfillmentTypeDesc;
    }

    /**
     * Access method for fulfillmentObjectTypeId.
     *
     * @return the current value of fulfillmentObjectTypeId
     */
    public BigDecimal getFulfillmentObjectTypeId() {
        return fulfillmentObjectTypeId;
    }

    /**
     * Setter method for fulfillmentObjectTypeId.
     *
     * @param aFulfillmentObjectTypeId the new value for fulfillmentObjectTypeId
     */
    public void setFulfillmentObjectTypeId(BigDecimal aFulfillmentObjectTypeId) {
        fulfillmentObjectTypeId = aFulfillmentObjectTypeId;
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

}
