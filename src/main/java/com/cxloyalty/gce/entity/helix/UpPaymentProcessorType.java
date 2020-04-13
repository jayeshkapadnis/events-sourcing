// Generated with g9.

package com.cxloyalty.gce.entity.helix;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name="up_payment_processor_type")
public class UpPaymentProcessorType implements Serializable {

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
    @Column(name="up_payment_processor_type_id", nullable=false, precision=9)
    private BigDecimal upPaymentProcessorTypeId;
    @Column(name="up_payment_processor_type_desc", length=200)
    private String upPaymentProcessorTypeDesc;
    @Column(name="user_created", nullable=false, length=200)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=200)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;

    /** Default constructor. */
    public UpPaymentProcessorType() {
        super();
    }

    /**
     * Access method for upPaymentProcessorTypeId.
     *
     * @return the current value of upPaymentProcessorTypeId
     */
    public BigDecimal getUpPaymentProcessorTypeId() {
        return upPaymentProcessorTypeId;
    }

    /**
     * Setter method for upPaymentProcessorTypeId.
     *
     * @param aUpPaymentProcessorTypeId the new value for upPaymentProcessorTypeId
     */
    public void setUpPaymentProcessorTypeId(BigDecimal aUpPaymentProcessorTypeId) {
        upPaymentProcessorTypeId = aUpPaymentProcessorTypeId;
    }

    /**
     * Access method for upPaymentProcessorTypeDesc.
     *
     * @return the current value of upPaymentProcessorTypeDesc
     */
    public String getUpPaymentProcessorTypeDesc() {
        return upPaymentProcessorTypeDesc;
    }

    /**
     * Setter method for upPaymentProcessorTypeDesc.
     *
     * @param aUpPaymentProcessorTypeDesc the new value for upPaymentProcessorTypeDesc
     */
    public void setUpPaymentProcessorTypeDesc(String aUpPaymentProcessorTypeDesc) {
        upPaymentProcessorTypeDesc = aUpPaymentProcessorTypeDesc;
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
