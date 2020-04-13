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
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="organization_country", indexes={@Index(name="organizationCountryUidxOrganizationCountry", columnList="organization_id,country_id", unique=true)})
public class OrganizationCountry implements Serializable {

    /** Primary key. */
    protected static final String PK = "organizationCountryId";

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
    @Column(name="organization_country_id", unique=true, nullable=false, precision=10)
    private BigDecimal organizationCountryId;
    @Column(name="active_flag", length=1)
    private String activeFlag;
    @Column(name="user_created", nullable=false, length=50)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=50)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @ManyToOne(optional=false)
    @JoinColumn(name="country_id", nullable=false)
    private Country country;
    @ManyToOne(optional=false)
    @JoinColumn(name="organization_id", nullable=false)
    private Organization organization;

    /** Default constructor. */
    public OrganizationCountry() {
        super();
    }

    /**
     * Access method for organizationCountryId.
     *
     * @return the current value of organizationCountryId
     */
    public BigDecimal getOrganizationCountryId() {
        return organizationCountryId;
    }

    /**
     * Setter method for organizationCountryId.
     *
     * @param aOrganizationCountryId the new value for organizationCountryId
     */
    public void setOrganizationCountryId(BigDecimal aOrganizationCountryId) {
        organizationCountryId = aOrganizationCountryId;
    }

    /**
     * Access method for activeFlag.
     *
     * @return the current value of activeFlag
     */
    public String getActiveFlag() {
        return activeFlag;
    }

    /**
     * Setter method for activeFlag.
     *
     * @param aActiveFlag the new value for activeFlag
     */
    public void setActiveFlag(String aActiveFlag) {
        activeFlag = aActiveFlag;
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
     * Access method for country.
     *
     * @return the current value of country
     */
    public Country getCountry() {
        return country;
    }

    /**
     * Setter method for country.
     *
     * @param aCountry the new value for country
     */
    public void setCountry(Country aCountry) {
        country = aCountry;
    }

    /**
     * Access method for organization.
     *
     * @return the current value of organization
     */
    public Organization getOrganization() {
        return organization;
    }

    /**
     * Setter method for organization.
     *
     * @param aOrganization the new value for organization
     */
    public void setOrganization(Organization aOrganization) {
        organization = aOrganization;
    }

    /**
     * Gets the group fragment organizationId for member organization.
     *
     * @return Current value of the group fragment
     * @see Organization
     */
    public BigDecimal getOrganizationOrganizationId() {
        return (getOrganization() == null ? null : getOrganization().getOrganizationId());
    }

    /**
     * Sets the group fragment organizationId from member organization.
     *
     * @param aOrganizationId New value for the group fragment
     * @see Organization
     */
    public void setOrganizationOrganizationId(BigDecimal aOrganizationId) {
        if (getOrganization() != null) {
            getOrganization().setOrganizationId(aOrganizationId);
        }
    }

    /**
     * Gets the group fragment countryId for member country.
     *
     * @return Current value of the group fragment
     * @see Country
     */
    public BigDecimal getCountryCountryId() {
        return (getCountry() == null ? null : getCountry().getCountryId());
    }

    /**
     * Sets the group fragment countryId from member country.
     *
     * @param aCountryId New value for the group fragment
     * @see Country
     */
    public void setCountryCountryId(BigDecimal aCountryId) {
        if (getCountry() != null) {
            getCountry().setCountryId(aCountryId);
        }
    }

    /**
     * Compares the key for this instance with another OrganizationCountry.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class OrganizationCountry and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof OrganizationCountry)) {
            return false;
        }
        OrganizationCountry that = (OrganizationCountry) other;
        Object myOrganizationCountryId = this.getOrganizationCountryId();
        Object yourOrganizationCountryId = that.getOrganizationCountryId();
        if (myOrganizationCountryId==null ? yourOrganizationCountryId!=null : !myOrganizationCountryId.equals(yourOrganizationCountryId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another OrganizationCountry.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof OrganizationCountry)) return false;
        return this.equalKeys(other) && ((OrganizationCountry)other).equalKeys(this);
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
        if (getOrganizationCountryId() == null) {
            i = 0;
        } else {
            i = getOrganizationCountryId().hashCode();
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
        StringBuffer sb = new StringBuffer("[OrganizationCountry |");
        sb.append(" organizationCountryId=").append(getOrganizationCountryId());
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
        ret.put("organizationCountryId", getOrganizationCountryId());
        return ret;
    }

}
