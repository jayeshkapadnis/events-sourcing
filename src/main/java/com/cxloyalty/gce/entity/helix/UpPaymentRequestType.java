// Generated with g9.

package com.cxloyalty.gce.entity.helix;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name="up_payment_request_type")
public class UpPaymentRequestType implements Serializable {

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
    @Column(name="up_payment_request_type_id", nullable=false, precision=9)
    private BigDecimal upPaymentRequestTypeId;
    @Column(name="up_payment_request_type_desc", length=200)
    private String upPaymentRequestTypeDesc;
    @Column(name="user_created", nullable=false, length=200)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=200)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;

    /** Default constructor. */
    public UpPaymentRequestType() {
        super();
    }

    /**
     * Access method for upPaymentRequestTypeId.
     *
     * @return the current value of upPaymentRequestTypeId
     */
    public BigDecimal getUpPaymentRequestTypeId() {
        return upPaymentRequestTypeId;
    }

    /**
     * Setter method for upPaymentRequestTypeId.
     *
     * @param aUpPaymentRequestTypeId the new value for upPaymentRequestTypeId
     */
    public void setUpPaymentRequestTypeId(BigDecimal aUpPaymentRequestTypeId) {
        upPaymentRequestTypeId = aUpPaymentRequestTypeId;
    }

    /**
     * Access method for upPaymentRequestTypeDesc.
     *
     * @return the current value of upPaymentRequestTypeDesc
     */
    public String getUpPaymentRequestTypeDesc() {
        return upPaymentRequestTypeDesc;
    }

    /**
     * Setter method for upPaymentRequestTypeDesc.
     *
     * @param aUpPaymentRequestTypeDesc the new value for upPaymentRequestTypeDesc
     */
    public void setUpPaymentRequestTypeDesc(String aUpPaymentRequestTypeDesc) {
        upPaymentRequestTypeDesc = aUpPaymentRequestTypeDesc;
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
