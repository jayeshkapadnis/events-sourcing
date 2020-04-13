// Generated with g9.

package com.cxloyalty.gce.entity.helix;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="lov_value_org", indexes={@Index(name="lovValueOrgUnLovValOrg", columnList="lov_value_sysid,organization_sysid", unique=true)})
public class LovValueOrg implements Serializable {

    /** Primary key. */
    protected static final String PK = "lovValOrgSysid";

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
    @Column(name="lov_val_org_sysid", unique=true, nullable=false, precision=12)
    private BigDecimal lovValOrgSysid;
    @Column(name="add_date", nullable=false)
    private Timestamp addDate;
    @Column(name="add_username", nullable=false, length=50)
    private String addUsername;
    @Column(name="update_date", nullable=false)
    private Timestamp updateDate;
    @Column(name="update_username", nullable=false, length=50)
    private String updateUsername;
    @Column(nullable=false, length=1)
    private String legacy;
    @OneToMany(mappedBy="lovValueOrg")
    private Set<LovValueBenefit> lovValueBenefit;
    @ManyToOne(optional=false)
    @JoinColumn(name="lov_value_sysid", nullable=false)
    private LovValue lovValue;
    @ManyToOne(optional=false)
    @JoinColumn(name="organization_sysid", nullable=false)
    private Organization organization;

    /** Default constructor. */
    public LovValueOrg() {
        super();
    }

    /**
     * Access method for lovValOrgSysid.
     *
     * @return the current value of lovValOrgSysid
     */
    public BigDecimal getLovValOrgSysid() {
        return lovValOrgSysid;
    }

    /**
     * Setter method for lovValOrgSysid.
     *
     * @param aLovValOrgSysid the new value for lovValOrgSysid
     */
    public void setLovValOrgSysid(BigDecimal aLovValOrgSysid) {
        lovValOrgSysid = aLovValOrgSysid;
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
     * Access method for legacy.
     *
     * @return the current value of legacy
     */
    public String getLegacy() {
        return legacy;
    }

    /**
     * Setter method for legacy.
     *
     * @param aLegacy the new value for legacy
     */
    public void setLegacy(String aLegacy) {
        legacy = aLegacy;
    }

    /**
     * Access method for lovValueBenefit.
     *
     * @return the current value of lovValueBenefit
     */
    public Set<LovValueBenefit> getLovValueBenefit() {
        return lovValueBenefit;
    }

    /**
     * Setter method for lovValueBenefit.
     *
     * @param aLovValueBenefit the new value for lovValueBenefit
     */
    public void setLovValueBenefit(Set<LovValueBenefit> aLovValueBenefit) {
        lovValueBenefit = aLovValueBenefit;
    }

    /**
     * Access method for lovValue.
     *
     * @return the current value of lovValue
     */
    public LovValue getLovValue() {
        return lovValue;
    }

    /**
     * Setter method for lovValue.
     *
     * @param aLovValue the new value for lovValue
     */
    public void setLovValue(LovValue aLovValue) {
        lovValue = aLovValue;
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
     * Gets the group fragment lovValueSysid for member lovValue.
     *
     * @return Current value of the group fragment
     * @see LovValue
     */
    public BigDecimal getLovValueLovValueSysid() {
        return (getLovValue() == null ? null : getLovValue().getLovValueSysid());
    }

    /**
     * Sets the group fragment lovValueSysid from member lovValue.
     *
     * @param aLovValueSysid New value for the group fragment
     * @see LovValue
     */
    public void setLovValueLovValueSysid(BigDecimal aLovValueSysid) {
        if (getLovValue() != null) {
            getLovValue().setLovValueSysid(aLovValueSysid);
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
     * Compares the key for this instance with another LovValueOrg.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class LovValueOrg and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof LovValueOrg)) {
            return false;
        }
        LovValueOrg that = (LovValueOrg) other;
        Object myLovValOrgSysid = this.getLovValOrgSysid();
        Object yourLovValOrgSysid = that.getLovValOrgSysid();
        if (myLovValOrgSysid==null ? yourLovValOrgSysid!=null : !myLovValOrgSysid.equals(yourLovValOrgSysid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another LovValueOrg.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof LovValueOrg)) return false;
        return this.equalKeys(other) && ((LovValueOrg)other).equalKeys(this);
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
        if (getLovValOrgSysid() == null) {
            i = 0;
        } else {
            i = getLovValOrgSysid().hashCode();
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
        StringBuffer sb = new StringBuffer("[LovValueOrg |");
        sb.append(" lovValOrgSysid=").append(getLovValOrgSysid());
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
        ret.put("lovValOrgSysid", getLovValOrgSysid());
        return ret;
    }

}
