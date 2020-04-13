// Generated with g9.

package com.cxloyalty.gce.entity.helix;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name="system_origin")
public class SystemOrigin implements Serializable {

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
    @Column(name="system_origin_sysid", nullable=false, precision=10)
    private BigDecimal systemOriginSysid;
    @Column(name="system_origin_name", nullable=false, length=30)
    private String systemOriginName;
    @Column(name="user_created", nullable=false, length=30)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=30)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;

    /** Default constructor. */
    public SystemOrigin() {
        super();
    }

    /**
     * Access method for systemOriginSysid.
     *
     * @return the current value of systemOriginSysid
     */
    public BigDecimal getSystemOriginSysid() {
        return systemOriginSysid;
    }

    /**
     * Setter method for systemOriginSysid.
     *
     * @param aSystemOriginSysid the new value for systemOriginSysid
     */
    public void setSystemOriginSysid(BigDecimal aSystemOriginSysid) {
        systemOriginSysid = aSystemOriginSysid;
    }

    /**
     * Access method for systemOriginName.
     *
     * @return the current value of systemOriginName
     */
    public String getSystemOriginName() {
        return systemOriginName;
    }

    /**
     * Setter method for systemOriginName.
     *
     * @param aSystemOriginName the new value for systemOriginName
     */
    public void setSystemOriginName(String aSystemOriginName) {
        systemOriginName = aSystemOriginName;
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
