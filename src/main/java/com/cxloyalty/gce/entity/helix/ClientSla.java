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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="client_sla")
public class ClientSla implements Serializable {

    /** Primary key. */
    protected static final String PK = "clientSlaId";

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
    @Column(name="client_sla_id", unique=true, nullable=false, precision=9)
    private BigDecimal clientSlaId;
    @Column(name="real_time_request_corr_sla_sec", nullable=false, precision=9)
    private BigDecimal realTimeRequestCorrSlaSec;
    @Column(name="batch_request_corr_sla_sec", nullable=false, precision=9)
    private BigDecimal batchRequestCorrSlaSec;
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

    /** Default constructor. */
    public ClientSla() {
        super();
    }

    /**
     * Access method for clientSlaId.
     *
     * @return the current value of clientSlaId
     */
    public BigDecimal getClientSlaId() {
        return clientSlaId;
    }

    /**
     * Setter method for clientSlaId.
     *
     * @param aClientSlaId the new value for clientSlaId
     */
    public void setClientSlaId(BigDecimal aClientSlaId) {
        clientSlaId = aClientSlaId;
    }

    /**
     * Access method for realTimeRequestCorrSlaSec.
     *
     * @return the current value of realTimeRequestCorrSlaSec
     */
    public BigDecimal getRealTimeRequestCorrSlaSec() {
        return realTimeRequestCorrSlaSec;
    }

    /**
     * Setter method for realTimeRequestCorrSlaSec.
     *
     * @param aRealTimeRequestCorrSlaSec the new value for realTimeRequestCorrSlaSec
     */
    public void setRealTimeRequestCorrSlaSec(BigDecimal aRealTimeRequestCorrSlaSec) {
        realTimeRequestCorrSlaSec = aRealTimeRequestCorrSlaSec;
    }

    /**
     * Access method for batchRequestCorrSlaSec.
     *
     * @return the current value of batchRequestCorrSlaSec
     */
    public BigDecimal getBatchRequestCorrSlaSec() {
        return batchRequestCorrSlaSec;
    }

    /**
     * Setter method for batchRequestCorrSlaSec.
     *
     * @param aBatchRequestCorrSlaSec the new value for batchRequestCorrSlaSec
     */
    public void setBatchRequestCorrSlaSec(BigDecimal aBatchRequestCorrSlaSec) {
        batchRequestCorrSlaSec = aBatchRequestCorrSlaSec;
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
     * Compares the key for this instance with another ClientSla.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ClientSla and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ClientSla)) {
            return false;
        }
        ClientSla that = (ClientSla) other;
        Object myClientSlaId = this.getClientSlaId();
        Object yourClientSlaId = that.getClientSlaId();
        if (myClientSlaId==null ? yourClientSlaId!=null : !myClientSlaId.equals(yourClientSlaId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ClientSla.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ClientSla)) return false;
        return this.equalKeys(other) && ((ClientSla)other).equalKeys(this);
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
        if (getClientSlaId() == null) {
            i = 0;
        } else {
            i = getClientSlaId().hashCode();
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
        StringBuffer sb = new StringBuffer("[ClientSla |");
        sb.append(" clientSlaId=").append(getClientSlaId());
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
        ret.put("clientSlaId", getClientSlaId());
        return ret;
    }

}
