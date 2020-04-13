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
@Table(name="partner_client", indexes={@Index(name="partnerClientUnPartnerClient", columnList="partner_id,client_id", unique=true)})
public class PartnerClient implements Serializable {

    /** Primary key. */
    protected static final String PK = "partnerClientId";

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
    @Column(name="partner_client_id", unique=true, nullable=false, precision=16)
    private BigDecimal partnerClientId;
    @Column(name="user_created", nullable=false, length=200)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=200)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @ManyToOne(optional=false)
    @JoinColumn(name="partner_id", nullable=false)
    private Partner partner;
    @ManyToOne
    @JoinColumn(name="hub_client_group_id")
    private HubClientGroup hubClientGroup;
    @ManyToOne(optional=false)
    @JoinColumn(name="client_id", nullable=false)
    private Clients clients;

    /** Default constructor. */
    public PartnerClient() {
        super();
    }

    /**
     * Access method for partnerClientId.
     *
     * @return the current value of partnerClientId
     */
    public BigDecimal getPartnerClientId() {
        return partnerClientId;
    }

    /**
     * Setter method for partnerClientId.
     *
     * @param aPartnerClientId the new value for partnerClientId
     */
    public void setPartnerClientId(BigDecimal aPartnerClientId) {
        partnerClientId = aPartnerClientId;
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
     * Access method for partner.
     *
     * @return the current value of partner
     */
    public Partner getPartner() {
        return partner;
    }

    /**
     * Setter method for partner.
     *
     * @param aPartner the new value for partner
     */
    public void setPartner(Partner aPartner) {
        partner = aPartner;
    }

    /**
     * Access method for hubClientGroup.
     *
     * @return the current value of hubClientGroup
     */
    public HubClientGroup getHubClientGroup() {
        return hubClientGroup;
    }

    /**
     * Setter method for hubClientGroup.
     *
     * @param aHubClientGroup the new value for hubClientGroup
     */
    public void setHubClientGroup(HubClientGroup aHubClientGroup) {
        hubClientGroup = aHubClientGroup;
    }

    /**
     * Access method for clients.
     *
     * @return the current value of clients
     */
    public Clients getClients() {
        return clients;
    }

    /**
     * Setter method for clients.
     *
     * @param aClients the new value for clients
     */
    public void setClients(Clients aClients) {
        clients = aClients;
    }

    /**
     * Gets the group fragment partnerId for member partner.
     *
     * @return Current value of the group fragment
     * @see Partner
     */
    public BigDecimal getPartnerPartnerId() {
        return (getPartner() == null ? null : getPartner().getPartnerId());
    }

    /**
     * Sets the group fragment partnerId from member partner.
     *
     * @param aPartnerId New value for the group fragment
     * @see Partner
     */
    public void setPartnerPartnerId(BigDecimal aPartnerId) {
        if (getPartner() != null) {
            getPartner().setPartnerId(aPartnerId);
        }
    }

    /**
     * Gets the group fragment clnClientId for member clients.
     *
     * @return Current value of the group fragment
     * @see Clients
     */
    public BigDecimal getClientsClnClientId() {
        return (getClients() == null ? null : getClients().getClnClientId());
    }

    /**
     * Sets the group fragment clnClientId from member clients.
     *
     * @param aClnClientId New value for the group fragment
     * @see Clients
     */
    public void setClientsClnClientId(BigDecimal aClnClientId) {
        if (getClients() != null) {
            getClients().setClnClientId(aClnClientId);
        }
    }

    /**
     * Compares the key for this instance with another PartnerClient.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class PartnerClient and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof PartnerClient)) {
            return false;
        }
        PartnerClient that = (PartnerClient) other;
        Object myPartnerClientId = this.getPartnerClientId();
        Object yourPartnerClientId = that.getPartnerClientId();
        if (myPartnerClientId==null ? yourPartnerClientId!=null : !myPartnerClientId.equals(yourPartnerClientId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another PartnerClient.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof PartnerClient)) return false;
        return this.equalKeys(other) && ((PartnerClient)other).equalKeys(this);
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
        if (getPartnerClientId() == null) {
            i = 0;
        } else {
            i = getPartnerClientId().hashCode();
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
        StringBuffer sb = new StringBuffer("[PartnerClient |");
        sb.append(" partnerClientId=").append(getPartnerClientId());
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
        ret.put("partnerClientId", getPartnerClientId());
        return ret;
    }

}
