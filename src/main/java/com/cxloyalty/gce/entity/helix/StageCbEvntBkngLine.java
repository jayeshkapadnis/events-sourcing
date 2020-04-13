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

@Entity(name="stage_cb_evnt_bkng_line")
public class StageCbEvntBkngLine implements Serializable {

    /** Primary key. */
    protected static final String PK = "cbEvntBkngLineSysid";

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
    @Column(name="cb_evnt_bkng_line_sysid", unique=true, nullable=false, precision=19)
    private long cbEvntBkngLineSysid;
    @Column(name="ticket_type", length=200)
    private String ticketType;
    @Column(name="order_item_status", length=200)
    private String orderItemStatus;
    @Column(name="tickets_qty", nullable=false, precision=10)
    private BigDecimal ticketsQty;
    @Column(name="price_per_ticket_amt", nullable=false, precision=22, scale=7)
    private BigDecimal pricePerTicketAmt;
    @Column(name="bkng_fee_amt", precision=22, scale=7)
    private BigDecimal bkngFeeAmt;
    @Column(name="total_line_price_amt", precision=22, scale=7)
    private BigDecimal totalLinePriceAmt;
    @Column(name="line_item_cb_amt", precision=22, scale=7)
    private BigDecimal lineItemCbAmt;
    @Column(name="no_cashback_fl", precision=1)
    private BigDecimal noCashbackFl;
    @Column(name="add_date")
    private Timestamp addDate;
    @Column(name="add_username", length=200)
    private String addUsername;
    @Column(name="update_date")
    private Timestamp updateDate;
    @Column(name="update_username", length=200)
    private String updateUsername;
    @ManyToOne(optional=false)
    @JoinColumn(name="cb_evnt_bkng_sysid", nullable=false)
    private StageServiceRequest stageServiceRequest;

    /** Default constructor. */
    public StageCbEvntBkngLine() {
        super();
    }

    /**
     * Access method for cbEvntBkngLineSysid.
     *
     * @return the current value of cbEvntBkngLineSysid
     */
    public long getCbEvntBkngLineSysid() {
        return cbEvntBkngLineSysid;
    }

    /**
     * Setter method for cbEvntBkngLineSysid.
     *
     * @param aCbEvntBkngLineSysid the new value for cbEvntBkngLineSysid
     */
    public void setCbEvntBkngLineSysid(long aCbEvntBkngLineSysid) {
        cbEvntBkngLineSysid = aCbEvntBkngLineSysid;
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
     * Access method for orderItemStatus.
     *
     * @return the current value of orderItemStatus
     */
    public String getOrderItemStatus() {
        return orderItemStatus;
    }

    /**
     * Setter method for orderItemStatus.
     *
     * @param aOrderItemStatus the new value for orderItemStatus
     */
    public void setOrderItemStatus(String aOrderItemStatus) {
        orderItemStatus = aOrderItemStatus;
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
     * Access method for pricePerTicketAmt.
     *
     * @return the current value of pricePerTicketAmt
     */
    public BigDecimal getPricePerTicketAmt() {
        return pricePerTicketAmt;
    }

    /**
     * Setter method for pricePerTicketAmt.
     *
     * @param aPricePerTicketAmt the new value for pricePerTicketAmt
     */
    public void setPricePerTicketAmt(BigDecimal aPricePerTicketAmt) {
        pricePerTicketAmt = aPricePerTicketAmt;
    }

    /**
     * Access method for bkngFeeAmt.
     *
     * @return the current value of bkngFeeAmt
     */
    public BigDecimal getBkngFeeAmt() {
        return bkngFeeAmt;
    }

    /**
     * Setter method for bkngFeeAmt.
     *
     * @param aBkngFeeAmt the new value for bkngFeeAmt
     */
    public void setBkngFeeAmt(BigDecimal aBkngFeeAmt) {
        bkngFeeAmt = aBkngFeeAmt;
    }

    /**
     * Access method for totalLinePriceAmt.
     *
     * @return the current value of totalLinePriceAmt
     */
    public BigDecimal getTotalLinePriceAmt() {
        return totalLinePriceAmt;
    }

    /**
     * Setter method for totalLinePriceAmt.
     *
     * @param aTotalLinePriceAmt the new value for totalLinePriceAmt
     */
    public void setTotalLinePriceAmt(BigDecimal aTotalLinePriceAmt) {
        totalLinePriceAmt = aTotalLinePriceAmt;
    }

    /**
     * Access method for lineItemCbAmt.
     *
     * @return the current value of lineItemCbAmt
     */
    public BigDecimal getLineItemCbAmt() {
        return lineItemCbAmt;
    }

    /**
     * Setter method for lineItemCbAmt.
     *
     * @param aLineItemCbAmt the new value for lineItemCbAmt
     */
    public void setLineItemCbAmt(BigDecimal aLineItemCbAmt) {
        lineItemCbAmt = aLineItemCbAmt;
    }

    /**
     * Access method for noCashbackFl.
     *
     * @return the current value of noCashbackFl
     */
    public BigDecimal getNoCashbackFl() {
        return noCashbackFl;
    }

    /**
     * Setter method for noCashbackFl.
     *
     * @param aNoCashbackFl the new value for noCashbackFl
     */
    public void setNoCashbackFl(BigDecimal aNoCashbackFl) {
        noCashbackFl = aNoCashbackFl;
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
     * Compares the key for this instance with another StageCbEvntBkngLine.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class StageCbEvntBkngLine and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof StageCbEvntBkngLine)) {
            return false;
        }
        StageCbEvntBkngLine that = (StageCbEvntBkngLine) other;
        if (this.getCbEvntBkngLineSysid() != that.getCbEvntBkngLineSysid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another StageCbEvntBkngLine.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof StageCbEvntBkngLine)) return false;
        return this.equalKeys(other) && ((StageCbEvntBkngLine)other).equalKeys(this);
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
        i = (int)(getCbEvntBkngLineSysid() ^ (getCbEvntBkngLineSysid()>>>32));
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
        StringBuffer sb = new StringBuffer("[StageCbEvntBkngLine |");
        sb.append(" cbEvntBkngLineSysid=").append(getCbEvntBkngLineSysid());
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
        ret.put("cbEvntBkngLineSysid", Long.valueOf(getCbEvntBkngLineSysid()));
        return ret;
    }

}
