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

@Entity(name="stage_onsale_reg_evt_bkng_line")
public class StageOnsaleRegEvtBkngLine implements Serializable {

    /** Primary key. */
    protected static final String PK = "onsaleRegEvtBkngLineId";

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
    @Column(name="onsale_reg_evt_bkng_line_id", unique=true, nullable=false, precision=19)
    private long onsaleRegEvtBkngLineId;
    @Column(name="ticket_type_id", nullable=false, precision=9)
    private BigDecimal ticketTypeId;
    @Column(name="ticket_type", length=200)
    private String ticketType;
    @Column(name="tickets_qty", nullable=false, precision=10)
    private BigDecimal ticketsQty;
    @Column(length=200)
    private String notes;
    @Column(name="user_created", length=200)
    private String userCreated;
    @Column(name="date_created")
    private Timestamp dateCreated;
    @Column(name="user_modified", length=200)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @ManyToOne(optional=false)
    @JoinColumn(name="onsale_reg_evt_bkng_id", nullable=false)
    private StageServiceRequest stageServiceRequest;

    /** Default constructor. */
    public StageOnsaleRegEvtBkngLine() {
        super();
    }

    /**
     * Access method for onsaleRegEvtBkngLineId.
     *
     * @return the current value of onsaleRegEvtBkngLineId
     */
    public long getOnsaleRegEvtBkngLineId() {
        return onsaleRegEvtBkngLineId;
    }

    /**
     * Setter method for onsaleRegEvtBkngLineId.
     *
     * @param aOnsaleRegEvtBkngLineId the new value for onsaleRegEvtBkngLineId
     */
    public void setOnsaleRegEvtBkngLineId(long aOnsaleRegEvtBkngLineId) {
        onsaleRegEvtBkngLineId = aOnsaleRegEvtBkngLineId;
    }

    /**
     * Access method for ticketTypeId.
     *
     * @return the current value of ticketTypeId
     */
    public BigDecimal getTicketTypeId() {
        return ticketTypeId;
    }

    /**
     * Setter method for ticketTypeId.
     *
     * @param aTicketTypeId the new value for ticketTypeId
     */
    public void setTicketTypeId(BigDecimal aTicketTypeId) {
        ticketTypeId = aTicketTypeId;
    }

    /**
     * Access method for ticketType.
     *
     * @return the current value of ticketType
     */
    public String getTicketType() {
        return ticketType;
    }

    /**
     * Setter method for ticketType.
     *
     * @param aTicketType the new value for ticketType
     */
    public void setTicketType(String aTicketType) {
        ticketType = aTicketType;
    }

    /**
     * Access method for ticketsQty.
     *
     * @return the current value of ticketsQty
     */
    public BigDecimal getTicketsQty() {
        return ticketsQty;
    }

    /**
     * Setter method for ticketsQty.
     *
     * @param aTicketsQty the new value for ticketsQty
     */
    public void setTicketsQty(BigDecimal aTicketsQty) {
        ticketsQty = aTicketsQty;
    }

    /**
     * Access method for notes.
     *
     * @return the current value of notes
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Setter method for notes.
     *
     * @param aNotes the new value for notes
     */
    public void setNotes(String aNotes) {
        notes = aNotes;
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
     * Access method for stageServiceRequest.
     *
     * @return the current value of stageServiceRequest
     */
    public StageServiceRequest getStageServiceRequest() {
        return stageServiceRequest;
    }

    /**
     * Setter method for stageServiceRequest.
     *
     * @param aStageServiceRequest the new value for stageServiceRequest
     */
    public void setStageServiceRequest(StageServiceRequest aStageServiceRequest) {
        stageServiceRequest = aStageServiceRequest;
    }

    /**
     * Compares the key for this instance with another StageOnsaleRegEvtBkngLine.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class StageOnsaleRegEvtBkngLine and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof StageOnsaleRegEvtBkngLine)) {
            return false;
        }
        StageOnsaleRegEvtBkngLine that = (StageOnsaleRegEvtBkngLine) other;
        if (this.getOnsaleRegEvtBkngLineId() != that.getOnsaleRegEvtBkngLineId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another StageOnsaleRegEvtBkngLine.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof StageOnsaleRegEvtBkngLine)) return false;
        return this.equalKeys(other) && ((StageOnsaleRegEvtBkngLine)other).equalKeys(this);
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
        i = (int)(getOnsaleRegEvtBkngLineId() ^ (getOnsaleRegEvtBkngLineId()>>>32));
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
        StringBuffer sb = new StringBuffer("[StageOnsaleRegEvtBkngLine |");
        sb.append(" onsaleRegEvtBkngLineId=").append(getOnsaleRegEvtBkngLineId());
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
        ret.put("onsaleRegEvtBkngLineId", Long.valueOf(getOnsaleRegEvtBkngLineId()));
        return ret;
    }

}
