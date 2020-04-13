// Generated with g9.

package com.cxloyalty.gce.entity.helix;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name="country_group")
public class CountryGroup implements Serializable {

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
    @Column(name="country_group_id", nullable=false, precision=10)
    private BigDecimal countryGroupId;
    @Column(name="country_group_desc", nullable=false, length=200)
    private String countryGroupDesc;
    @Column(name="date_created")
    private Timestamp dateCreated;
    @Column(name="user_created", length=30)
    private String userCreated;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @Column(name="user_modified", length=30)
    private String userModified;
    @Column(name="system_origin_sysid", precision=10)
    private BigDecimal systemOriginSysid;

    /** Default constructor. */
    public CountryGroup() {
        super();
    }

    /**
     * Access method for countryGroupId.
     *
     * @return the current value of countryGroupId
     */
    public BigDecimal getCountryGroupId() {
        return countryGroupId;
    }

    /**
     * Setter method for countryGroupId.
     *
     * @param aCountryGroupId the new value for countryGroupId
     */
    public void setCountryGroupId(BigDecimal aCountryGroupId) {
        countryGroupId = aCountryGroupId;
    }

    /**
     * Access method for countryGroupDesc.
     *
     * @return the current value of countryGroupDesc
     */
    public String getCountryGroupDesc() {
        return countryGroupDesc;
    }

    /**
     * Setter method for countryGroupDesc.
     *
     * @param aCountryGroupDesc the new value for countryGroupDesc
     */
    public void setCountryGroupDesc(String aCountryGroupDesc) {
        countryGroupDesc = aCountryGroupDesc;
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

}
