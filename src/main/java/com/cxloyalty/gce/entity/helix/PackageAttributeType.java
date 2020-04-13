// Generated with g9.

package com.cxloyalty.gce.entity.helix;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name="package_attribute_type")
public class PackageAttributeType implements Serializable {

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
    @Column(name="pkg_attribute_type_id", nullable=false, precision=10)
    private BigDecimal pkgAttributeTypeId;
    @Column(name="pkg_attribute_type_desc", nullable=false, length=100)
    private String pkgAttributeTypeDesc;
    @Column(name="user_created", nullable=false, length=30)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=30)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @Column(length=50)
    private String name;

    /** Default constructor. */
    public PackageAttributeType() {
        super();
    }

    /**
     * Access method for pkgAttributeTypeId.
     *
     * @return the current value of pkgAttributeTypeId
     */
    public BigDecimal getPkgAttributeTypeId() {
        return pkgAttributeTypeId;
    }

    /**
     * Setter method for pkgAttributeTypeId.
     *
     * @param aPkgAttributeTypeId the new value for pkgAttributeTypeId
     */
    public void setPkgAttributeTypeId(BigDecimal aPkgAttributeTypeId) {
        pkgAttributeTypeId = aPkgAttributeTypeId;
    }

    /**
     * Access method for pkgAttributeTypeDesc.
     *
     * @return the current value of pkgAttributeTypeDesc
     */
    public String getPkgAttributeTypeDesc() {
        return pkgAttributeTypeDesc;
    }

    /**
     * Setter method for pkgAttributeTypeDesc.
     *
     * @param aPkgAttributeTypeDesc the new value for pkgAttributeTypeDesc
     */
    public void setPkgAttributeTypeDesc(String aPkgAttributeTypeDesc) {
        pkgAttributeTypeDesc = aPkgAttributeTypeDesc;
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

}
