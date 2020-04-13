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
@Table(name="partner_reporting_div_client", indexes={@Index(name="partnerReportingDivClientUnPrtnrrptdivclntRptdivclnt", columnList="partner_reporting_division_id,client_id", unique=true)})
public class PartnerReportingDivClient implements Serializable {

    /** Primary key. */
    protected static final String PK = "partnerReportingDivClntId";

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
    @Column(name="partner_reporting_div_clnt_id", unique=true, nullable=false, precision=16)
    private BigDecimal partnerReportingDivClntId;
    @Column(name="user_created", nullable=false, length=200)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=200)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @ManyToOne(optional=false)
    @JoinColumn(name="client_id", nullable=false)
    private Clients clients;
    @ManyToOne(optional=false)
    @JoinColumn(name="partner_reporting_division_id", nullable=false)
    private PartnerReportingDivision partnerReportingDivision;

    /** Default constructor. */
    public PartnerReportingDivClient() {
        super();
    }

    /**
     * Access method for partnerReportingDivClntId.
     *
     * @return the current value of partnerReportingDivClntId
     */
    public BigDecimal getPartnerReportingDivClntId() {
        return partnerReportingDivClntId;
    }

    /**
     * Setter method for partnerReportingDivClntId.
     *
     * @param aPartnerReportingDivClntId the new value for partnerReportingDivClntId
     */
    public void setPartnerReportingDivClntId(BigDecimal aPartnerReportingDivClntId) {
        partnerReportingDivClntId = aPartnerReportingDivClntId;
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
     * Access method for partnerReportingDivision.
     *
     * @return the current value of partnerReportingDivision
     */
    public PartnerReportingDivision getPartnerReportingDivision() {
        return partnerReportingDivision;
    }

    /**
     * Setter method for partnerReportingDivision.
     *
     * @param aPartnerReportingDivision the new value for partnerReportingDivision
     */
    public void setPartnerReportingDivision(PartnerReportingDivision aPartnerReportingDivision) {
        partnerReportingDivision = aPartnerReportingDivision;
    }

    /**
     * Gets the group fragment partnerReportingDivisionId for member partnerReportingDivision.
     *
     * @return Current value of the group fragment
     * @see PartnerReportingDivision
     */
    public BigDecimal getPartnerReportingDivisionPartnerReportingDivisionId() {
        return (getPartnerReportingDivision() == null ? null : getPartnerReportingDivision().getPartnerReportingDivisionId());
    }

    /**
     * Sets the group fragment partnerReportingDivisionId from member partnerReportingDivision.
     *
     * @param aPartnerReportingDivisionId New value for the group fragment
     * @see PartnerReportingDivision
     */
    public void setPartnerReportingDivisionPartnerReportingDivisionId(BigDecimal aPartnerReportingDivisionId) {
        if (getPartnerReportingDivision() != null) {
            getPartnerReportingDivision().setPartnerReportingDivisionId(aPartnerReportingDivisionId);
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
     * Compares the key for this instance with another PartnerReportingDivClient.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class PartnerReportingDivClient and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof PartnerReportingDivClient)) {
            return false;
        }
        PartnerReportingDivClient that = (PartnerReportingDivClient) other;
        Object myPartnerReportingDivClntId = this.getPartnerReportingDivClntId();
        Object yourPartnerReportingDivClntId = that.getPartnerReportingDivClntId();
        if (myPartnerReportingDivClntId==null ? yourPartnerReportingDivClntId!=null : !myPartnerReportingDivClntId.equals(yourPartnerReportingDivClntId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another PartnerReportingDivClient.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof PartnerReportingDivClient)) return false;
        return this.equalKeys(other) && ((PartnerReportingDivClient)other).equalKeys(this);
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
        if (getPartnerReportingDivClntId() == null) {
            i = 0;
        } else {
            i = getPartnerReportingDivClntId().hashCode();
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
        StringBuffer sb = new StringBuffer("[PartnerReportingDivClient |");
        sb.append(" partnerReportingDivClntId=").append(getPartnerReportingDivClntId());
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
        ret.put("partnerReportingDivClntId", getPartnerReportingDivClntId());
        return ret;
    }

}
