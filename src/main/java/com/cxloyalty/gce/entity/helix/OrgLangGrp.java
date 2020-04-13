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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="org_lang_grp")
public class OrgLangGrp implements Serializable {

    /** Primary key. */
    protected static final String PK = "orgLangGrpId";

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
    @Column(name="org_lang_grp_id", unique=true, nullable=false, precision=8)
    private BigDecimal orgLangGrpId;
    @Column(name="org_lang_grp_desc", length=50)
    private String orgLangGrpDesc;
    @Column(name="org_lang_grp_default_flg", precision=1)
    private BigDecimal orgLangGrpDefaultFlg;
    @Column(name="user_created", nullable=false, length=50)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=50)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @ManyToOne
    @JoinColumn(name="organization_id")
    private Organization organization;
    @OneToMany(mappedBy="orgLangGrp")
    private Set<SolicitationTemplate> solicitationTemplate;

    /** Default constructor. */
    public OrgLangGrp() {
        super();
    }

    /**
     * Access method for orgLangGrpId.
     *
     * @return the current value of orgLangGrpId
     */
    public BigDecimal getOrgLangGrpId() {
        return orgLangGrpId;
    }

    /**
     * Setter method for orgLangGrpId.
     *
     * @param aOrgLangGrpId the new value for orgLangGrpId
     */
    public void setOrgLangGrpId(BigDecimal aOrgLangGrpId) {
        orgLangGrpId = aOrgLangGrpId;
    }

    /**
     * Access method for orgLangGrpDesc.
     *
     * @return the current value of orgLangGrpDesc
     */
    public String getOrgLangGrpDesc() {
        return orgLangGrpDesc;
    }

    /**
     * Setter method for orgLangGrpDesc.
     *
     * @param aOrgLangGrpDesc the new value for orgLangGrpDesc
     */
    public void setOrgLangGrpDesc(String aOrgLangGrpDesc) {
        orgLangGrpDesc = aOrgLangGrpDesc;
    }

    /**
     * Access method for orgLangGrpDefaultFlg.
     *
     * @return the current value of orgLangGrpDefaultFlg
     */
    public BigDecimal getOrgLangGrpDefaultFlg() {
        return orgLangGrpDefaultFlg;
    }

    /**
     * Setter method for orgLangGrpDefaultFlg.
     *
     * @param aOrgLangGrpDefaultFlg the new value for orgLangGrpDefaultFlg
     */
    public void setOrgLangGrpDefaultFlg(BigDecimal aOrgLangGrpDefaultFlg) {
        orgLangGrpDefaultFlg = aOrgLangGrpDefaultFlg;
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
     * Access method for solicitationTemplate.
     *
     * @return the current value of solicitationTemplate
     */
    public Set<SolicitationTemplate> getSolicitationTemplate() {
        return solicitationTemplate;
    }

    /**
     * Setter method for solicitationTemplate.
     *
     * @param aSolicitationTemplate the new value for solicitationTemplate
     */
    public void setSolicitationTemplate(Set<SolicitationTemplate> aSolicitationTemplate) {
        solicitationTemplate = aSolicitationTemplate;
    }

    /**
     * Compares the key for this instance with another OrgLangGrp.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class OrgLangGrp and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof OrgLangGrp)) {
            return false;
        }
        OrgLangGrp that = (OrgLangGrp) other;
        Object myOrgLangGrpId = this.getOrgLangGrpId();
        Object yourOrgLangGrpId = that.getOrgLangGrpId();
        if (myOrgLangGrpId==null ? yourOrgLangGrpId!=null : !myOrgLangGrpId.equals(yourOrgLangGrpId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another OrgLangGrp.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof OrgLangGrp)) return false;
        return this.equalKeys(other) && ((OrgLangGrp)other).equalKeys(this);
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
        if (getOrgLangGrpId() == null) {
            i = 0;
        } else {
            i = getOrgLangGrpId().hashCode();
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
        StringBuffer sb = new StringBuffer("[OrgLangGrp |");
        sb.append(" orgLangGrpId=").append(getOrgLangGrpId());
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
        ret.put("orgLangGrpId", getOrgLangGrpId());
        return ret;
    }

}
