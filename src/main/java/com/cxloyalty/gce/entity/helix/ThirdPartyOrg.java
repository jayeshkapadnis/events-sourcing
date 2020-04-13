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
@Table(name="third_party_org", indexes={@Index(name="thirdPartyOrgUnThirdPartyOrg", columnList="third_party_sysid,organization_sysid", unique=true)})
public class ThirdPartyOrg implements Serializable {

    /** Primary key. */
    protected static final String PK = "thirdPartyOrgSysid";

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
    @Column(name="third_party_org_sysid", unique=true, nullable=false, precision=12)
    private BigDecimal thirdPartyOrgSysid;
    @Column(name="add_date", nullable=false)
    private Timestamp addDate;
    @Column(name="add_username", nullable=false, length=50)
    private String addUsername;
    @Column(name="update_date", nullable=false)
    private Timestamp updateDate;
    @Column(name="update_username", nullable=false, length=50)
    private String updateUsername;
    @Column(name="active_flag", nullable=false, length=1)
    private String activeFlag;
    @ManyToOne(optional=false)
    @JoinColumn(name="third_party_sysid", nullable=false)
    private ThirdParty thirdParty;
    @ManyToOne(optional=false)
    @JoinColumn(name="organization_sysid", nullable=false)
    private Organization organization;

    /** Default constructor. */
    public ThirdPartyOrg() {
        super();
    }

    /**
     * Access method for thirdPartyOrgSysid.
     *
     * @return the current value of thirdPartyOrgSysid
     */
    public BigDecimal getThirdPartyOrgSysid() {
        return thirdPartyOrgSysid;
    }

    /**
     * Setter method for thirdPartyOrgSysid.
     *
     * @param aThirdPartyOrgSysid the new value for thirdPartyOrgSysid
     */
    public void setThirdPartyOrgSysid(BigDecimal aThirdPartyOrgSysid) {
        thirdPartyOrgSysid = aThirdPartyOrgSysid;
    }

    /**
     * Access method for addDate.
     *
     * @return the current value of addDate
     */
    public Timestamp getAddDate() {
        return addDate;
    }

    /**
     * Setter method for addDate.
     *
     * @param aAddDate the new value for addDate
     */
    public void setAddDate(Timestamp aAddDate) {
        addDate = aAddDate;
    }

    /**
     * Access method for addUsername.
     *
     * @return the current value of addUsername
     */
    public String getAddUsername() {
        return addUsername;
    }

    /**
     * Setter method for addUsername.
     *
     * @param aAddUsername the new value for addUsername
     */
    public void setAddUsername(String aAddUsername) {
        addUsername = aAddUsername;
    }

    /**
     * Access method for updateDate.
     *
     * @return the current value of updateDate
     */
    public Timestamp getUpdateDate() {
        return updateDate;
    }

    /**
     * Setter method for updateDate.
     *
     * @param aUpdateDate the new value for updateDate
     */
    public void setUpdateDate(Timestamp aUpdateDate) {
        updateDate = aUpdateDate;
    }

    /**
     * Access method for updateUsername.
     *
     * @return the current value of updateUsername
     */
    public String getUpdateUsername() {
        return updateUsername;
    }

    /**
     * Setter method for updateUsername.
     *
     * @param aUpdateUsername the new value for updateUsername
     */
    public void setUpdateUsername(String aUpdateUsername) {
        updateUsername = aUpdateUsername;
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
     * Access method for thirdParty.
     *
     * @return the current value of thirdParty
     */
    public ThirdParty getThirdParty() {
        return thirdParty;
    }

    /**
     * Setter method for thirdParty.
     *
     * @param aThirdParty the new value for thirdParty
     */
    public void setThirdParty(ThirdParty aThirdParty) {
        thirdParty = aThirdParty;
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
     * Gets the group fragment thirdPartySysid for member thirdParty.
     *
     * @return Current value of the group fragment
     * @see ThirdParty
     */
    public BigDecimal getThirdPartyThirdPartySysid() {
        return (getThirdParty() == null ? null : getThirdParty().getThirdPartySysid());
    }

    /**
     * Sets the group fragment thirdPartySysid from member thirdParty.
     *
     * @param aThirdPartySysid New value for the group fragment
     * @see ThirdParty
     */
    public void setThirdPartyThirdPartySysid(BigDecimal aThirdPartySysid) {
        if (getThirdParty() != null) {
            getThirdParty().setThirdPartySysid(aThirdPartySysid);
        }
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
     * Compares the key for this instance with another ThirdPartyOrg.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ThirdPartyOrg and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ThirdPartyOrg)) {
            return false;
        }
        ThirdPartyOrg that = (ThirdPartyOrg) other;
        Object myThirdPartyOrgSysid = this.getThirdPartyOrgSysid();
        Object yourThirdPartyOrgSysid = that.getThirdPartyOrgSysid();
        if (myThirdPartyOrgSysid==null ? yourThirdPartyOrgSysid!=null : !myThirdPartyOrgSysid.equals(yourThirdPartyOrgSysid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ThirdPartyOrg.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ThirdPartyOrg)) return false;
        return this.equalKeys(other) && ((ThirdPartyOrg)other).equalKeys(this);
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
        if (getThirdPartyOrgSysid() == null) {
            i = 0;
        } else {
            i = getThirdPartyOrgSysid().hashCode();
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
        StringBuffer sb = new StringBuffer("[ThirdPartyOrg |");
        sb.append(" thirdPartyOrgSysid=").append(getThirdPartyOrgSysid());
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
        ret.put("thirdPartyOrgSysid", getThirdPartyOrgSysid());
        return ret;
    }

}
