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
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="hub_client_group")
public class HubClientGroup implements Serializable {

    /** Primary key. */
    protected static final String PK = "hubClientGroupId";

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
    @Column(name="hub_client_group_id", unique=true, nullable=false, precision=9)
    private BigDecimal hubClientGroupId;
    @Column(name="external_client_group_id", nullable=false, length=100)
    private String externalClientGroupId;
    @Column(name="client_group_description", length=200)
    private String clientGroupDescription;
    @Column(name="agentportal_brand_code", length=20)
    private String agentportalBrandCode;
    @Column(name="agentportal_domain_url", length=40)
    private String agentportalDomainUrl;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_created", nullable=false, length=200)
    private String userCreated;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @Column(name="user_modified", length=200)
    private String userModified;
    @OneToMany(mappedBy="hubClientGroup")
    private Set<PartnerClient> partnerClient;

    /** Default constructor. */
    public HubClientGroup() {
        super();
    }

    /**
     * Access method for hubClientGroupId.
     *
     * @return the current value of hubClientGroupId
     */
    public BigDecimal getHubClientGroupId() {
        return hubClientGroupId;
    }

    /**
     * Setter method for hubClientGroupId.
     *
     * @param aHubClientGroupId the new value for hubClientGroupId
     */
    public void setHubClientGroupId(BigDecimal aHubClientGroupId) {
        hubClientGroupId = aHubClientGroupId;
    }

    /**
     * Access method for externalClientGroupId.
     *
     * @return the current value of externalClientGroupId
     */
    public String getExternalClientGroupId() {
        return externalClientGroupId;
    }

    /**
     * Setter method for externalClientGroupId.
     *
     * @param aExternalClientGroupId the new value for externalClientGroupId
     */
    public void setExternalClientGroupId(String aExternalClientGroupId) {
        externalClientGroupId = aExternalClientGroupId;
    }

    /**
     * Access method for clientGroupDescription.
     *
     * @return the current value of clientGroupDescription
     */
    public String getClientGroupDescription() {
        return clientGroupDescription;
    }

    /**
     * Setter method for clientGroupDescription.
     *
     * @param aClientGroupDescription the new value for clientGroupDescription
     */
    public void setClientGroupDescription(String aClientGroupDescription) {
        clientGroupDescription = aClientGroupDescription;
    }

    /**
     * Access method for agentportalBrandCode.
     *
     * @return the current value of agentportalBrandCode
     */
    public String getAgentportalBrandCode() {
        return agentportalBrandCode;
    }

    /**
     * Setter method for agentportalBrandCode.
     *
     * @param aAgentportalBrandCode the new value for agentportalBrandCode
     */
    public void setAgentportalBrandCode(String aAgentportalBrandCode) {
        agentportalBrandCode = aAgentportalBrandCode;
    }

    /**
     * Access method for agentportalDomainUrl.
     *
     * @return the current value of agentportalDomainUrl
     */
    public String getAgentportalDomainUrl() {
        return agentportalDomainUrl;
    }

    /**
     * Setter method for agentportalDomainUrl.
     *
     * @param aAgentportalDomainUrl the new value for agentportalDomainUrl
     */
    public void setAgentportalDomainUrl(String aAgentportalDomainUrl) {
        agentportalDomainUrl = aAgentportalDomainUrl;
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
     * Access method for partnerClient.
     *
     * @return the current value of partnerClient
     */
    public Set<PartnerClient> getPartnerClient() {
        return partnerClient;
    }

    /**
     * Setter method for partnerClient.
     *
     * @param aPartnerClient the new value for partnerClient
     */
    public void setPartnerClient(Set<PartnerClient> aPartnerClient) {
        partnerClient = aPartnerClient;
    }

    /**
     * Compares the key for this instance with another HubClientGroup.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class HubClientGroup and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof HubClientGroup)) {
            return false;
        }
        HubClientGroup that = (HubClientGroup) other;
        Object myHubClientGroupId = this.getHubClientGroupId();
        Object yourHubClientGroupId = that.getHubClientGroupId();
        if (myHubClientGroupId==null ? yourHubClientGroupId!=null : !myHubClientGroupId.equals(yourHubClientGroupId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another HubClientGroup.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof HubClientGroup)) return false;
        return this.equalKeys(other) && ((HubClientGroup)other).equalKeys(this);
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
        if (getHubClientGroupId() == null) {
            i = 0;
        } else {
            i = getHubClientGroupId().hashCode();
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
        StringBuffer sb = new StringBuffer("[HubClientGroup |");
        sb.append(" hubClientGroupId=").append(getHubClientGroupId());
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
        ret.put("hubClientGroupId", getHubClientGroupId());
        return ret;
    }

}
