// Generated with g9.

package com.cxloyalty.gce.entity.helix;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name="solicitation_attribute_type")
public class SolicitationAttributeType implements Serializable {

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
    @Column(name="sol_attribute_type_id", nullable=false, precision=10)
    private BigDecimal solAttributeTypeId;
    @Column(name="sol_attribute_type_desc", nullable=false, length=100)
    private String solAttributeTypeDesc;
    @Column(name="user_created", nullable=false, length=30)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=30)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;

    /** Default constructor. */
    public SolicitationAttributeType() {
        super();
    }

    /**
     * Access method for solAttributeTypeId.
     *
     * @return the current value of solAttributeTypeId
     */
    public BigDecimal getSolAttributeTypeId() {
        return solAttributeTypeId;
    }

    /**
     * Setter method for solAttributeTypeId.
     *
     * @param aSolAttributeTypeId the new value for solAttributeTypeId
     */
    public void setSolAttributeTypeId(BigDecimal aSolAttributeTypeId) {
        solAttributeTypeId = aSolAttributeTypeId;
    }

    /**
     * Access method for solAttributeTypeDesc.
     *
     * @return the current value of solAttributeTypeDesc
     */
    public String getSolAttributeTypeDesc() {
        return solAttributeTypeDesc;
    }

    /**
     * Setter method for solAttributeTypeDesc.
     *
     * @param aSolAttributeTypeDesc the new value for solAttributeTypeDesc
     */
    public void setSolAttributeTypeDesc(String aSolAttributeTypeDesc) {
        solAttributeTypeDesc = aSolAttributeTypeDesc;
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
