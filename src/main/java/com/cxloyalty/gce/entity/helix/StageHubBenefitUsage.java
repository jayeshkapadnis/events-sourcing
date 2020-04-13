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

@Entity(name="stage_hub_benefit_usage")
public class StageHubBenefitUsage implements Serializable {

    /** Primary key. */
    protected static final String PK = "benefitUsageSysid";

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
    @Column(name="benefit_usage_sysid", unique=true, nullable=false, precision=9)
    private BigDecimal benefitUsageSysid;
    @Column(name="insert_date", nullable=false)
    private Timestamp insertDate;
    @Column(name="update_date", nullable=false)
    private Timestamp updateDate;
    @Column(name="usage_source", nullable=false, length=30)
    private String usageSource;
    @Column(name="data_origin", nullable=false, length=30)
    private String dataOrigin;
    @Column(name="usage_id", nullable=false, length=25)
    private String usageId;
    @Column(name="usage_line_id", nullable=false, length=15)
    private String usageLineId;
    @Column(name="member_number", length=100)
    private String memberNumber;
    @Column(name="usage_type", length=30)
    private String usageType;
    @Column(name="usage_date")
    private Timestamp usageDate;
    @Column(name="booking_type", length=50)
    private String bookingType;
    @Column(name="event_category", length=30)
    private String eventCategory;
    @Column(name="supplier_code", length=3)
    private String supplierCode;
    @Column(name="benefit_type_category", length=30)
    private String benefitTypeCategory;
    @Column(name="feature_name", length=50)
    private String featureName;
    @Column(name="ticket_count", length=131089)
    private BigDecimal ticketCount;
    @Column(name="order_amount", precision=9, scale=2)
    private BigDecimal orderAmount;
    @Column(name="discount_amount", precision=9, scale=2)
    private BigDecimal discountAmount;
    @Column(name="claim_amount", precision=9, scale=2)
    private BigDecimal claimAmount;
    @Column(name="settlement_amount", precision=9, scale=2)
    private BigDecimal settlementAmount;
    @Column(name="event_name", length=100)
    private String eventName;
    @Column(name="airport_desc", length=250)
    private String airportDesc;
    @Column(name="travel_location", length=100)
    private String travelLocation;
    @Column(name="passenger_count", precision=5)
    private BigDecimal passengerCount;
    @Column(name="membership_id", precision=19)
    private long membershipId;
    @ManyToOne(optional=false)
    @JoinColumn(name="member_id", nullable=false)
    private StageMember stageMember;

    /** Default constructor. */
    public StageHubBenefitUsage() {
        super();
    }

    /**
     * Access method for benefitUsageSysid.
     *
     * @return the current value of benefitUsageSysid
     */
    public BigDecimal getBenefitUsageSysid() {
        return benefitUsageSysid;
    }

    /**
     * Setter method for benefitUsageSysid.
     *
     * @param aBenefitUsageSysid the new value for benefitUsageSysid
     */
    public void setBenefitUsageSysid(BigDecimal aBenefitUsageSysid) {
        benefitUsageSysid = aBenefitUsageSysid;
    }

    /**
     * Access method for insertDate.
     *
     * @return the current value of insertDate
     */
    public Timestamp getInsertDate() {
        return insertDate;
    }

    /**
     * Setter method for insertDate.
     *
     * @param aInsertDate the new value for insertDate
     */
    public void setInsertDate(Timestamp aInsertDate) {
        insertDate = aInsertDate;
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
     * Access method for usageSource.
     *
     * @return the current value of usageSource
     */
    public String getUsageSource() {
        return usageSource;
    }

    /**
     * Setter method for usageSource.
     *
     * @param aUsageSource the new value for usageSource
     */
    public void setUsageSource(String aUsageSource) {
        usageSource = aUsageSource;
    }

    /**
     * Access method for dataOrigin.
     *
     * @return the current value of dataOrigin
     */
    public String getDataOrigin() {
        return dataOrigin;
    }

    /**
     * Setter method for dataOrigin.
     *
     * @param aDataOrigin the new value for dataOrigin
     */
    public void setDataOrigin(String aDataOrigin) {
        dataOrigin = aDataOrigin;
    }

    /**
     * Access method for usageId.
     *
     * @return the current value of usageId
     */
    public String getUsageId() {
        return usageId;
    }

    /**
     * Setter method for usageId.
     *
     * @param aUsageId the new value for usageId
     */
    public void setUsageId(String aUsageId) {
        usageId = aUsageId;
    }

    /**
     * Access method for usageLineId.
     *
     * @return the current value of usageLineId
     */
    public String getUsageLineId() {
        return usageLineId;
    }

    /**
     * Setter method for usageLineId.
     *
     * @param aUsageLineId the new value for usageLineId
     */
    public void setUsageLineId(String aUsageLineId) {
        usageLineId = aUsageLineId;
    }

    /**
     * Access method for memberNumber.
     *
     * @return the current value of memberNumber
     */
    public String getMemberNumber() {
        return memberNumber;
    }

    /**
     * Setter method for memberNumber.
     *
     * @param aMemberNumber the new value for memberNumber
     */
    public void setMemberNumber(String aMemberNumber) {
        memberNumber = aMemberNumber;
    }

    /**
     * Access method for usageType.
     *
     * @return the current value of usageType
     */
    public String getUsageType() {
        return usageType;
    }

    /**
     * Setter method for usageType.
     *
     * @param aUsageType the new value for usageType
     */
    public void setUsageType(String aUsageType) {
        usageType = aUsageType;
    }

    /**
     * Access method for usageDate.
     *
     * @return the current value of usageDate
     */
    public Timestamp getUsageDate() {
        return usageDate;
    }

    /**
     * Setter method for usageDate.
     *
     * @param aUsageDate the new value for usageDate
     */
    public void setUsageDate(Timestamp aUsageDate) {
        usageDate = aUsageDate;
    }

    /**
     * Access method for bookingType.
     *
     * @return the current value of bookingType
     */
    public String getBookingType() {
        return bookingType;
    }

    /**
     * Setter method for bookingType.
     *
     * @param aBookingType the new value for bookingType
     */
    public void setBookingType(String aBookingType) {
        bookingType = aBookingType;
    }

    /**
     * Access method for eventCategory.
     *
     * @return the current value of eventCategory
     */
    public String getEventCategory() {
        return eventCategory;
    }

    /**
     * Setter method for eventCategory.
     *
     * @param aEventCategory the new value for eventCategory
     */
    public void setEventCategory(String aEventCategory) {
        eventCategory = aEventCategory;
    }

    /**
     * Access method for supplierCode.
     *
     * @return the current value of supplierCode
     */
    public String getSupplierCode() {
        return supplierCode;
    }

    /**
     * Setter method for supplierCode.
     *
     * @param aSupplierCode the new value for supplierCode
     */
    public void setSupplierCode(String aSupplierCode) {
        supplierCode = aSupplierCode;
    }

    /**
     * Access method for benefitTypeCategory.
     *
     * @return the current value of benefitTypeCategory
     */
    public String getBenefitTypeCategory() {
        return benefitTypeCategory;
    }

    /**
     * Setter method for benefitTypeCategory.
     *
     * @param aBenefitTypeCategory the new value for benefitTypeCategory
     */
    public void setBenefitTypeCategory(String aBenefitTypeCategory) {
        benefitTypeCategory = aBenefitTypeCategory;
    }

    /**
     * Access method for featureName.
     *
     * @return the current value of featureName
     */
    public String getFeatureName() {
        return featureName;
    }

    /**
     * Setter method for featureName.
     *
     * @param aFeatureName the new value for featureName
     */
    public void setFeatureName(String aFeatureName) {
        featureName = aFeatureName;
    }

    /**
     * Access method for ticketCount.
     *
     * @return the current value of ticketCount
     */
    public BigDecimal getTicketCount() {
        return ticketCount;
    }

    /**
     * Setter method for ticketCount.
     *
     * @param aTicketCount the new value for ticketCount
     */
    public void setTicketCount(BigDecimal aTicketCount) {
        ticketCount = aTicketCount;
    }

    /**
     * Access method for orderAmount.
     *
     * @return the current value of orderAmount
     */
    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    /**
     * Setter method for orderAmount.
     *
     * @param aOrderAmount the new value for orderAmount
     */
    public void setOrderAmount(BigDecimal aOrderAmount) {
        orderAmount = aOrderAmount;
    }

    /**
     * Access method for discountAmount.
     *
     * @return the current value of discountAmount
     */
    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Setter method for discountAmount.
     *
     * @param aDiscountAmount the new value for discountAmount
     */
    public void setDiscountAmount(BigDecimal aDiscountAmount) {
        discountAmount = aDiscountAmount;
    }

    /**
     * Access method for claimAmount.
     *
     * @return the current value of claimAmount
     */
    public BigDecimal getClaimAmount() {
        return claimAmount;
    }

    /**
     * Setter method for claimAmount.
     *
     * @param aClaimAmount the new value for claimAmount
     */
    public void setClaimAmount(BigDecimal aClaimAmount) {
        claimAmount = aClaimAmount;
    }

    /**
     * Access method for settlementAmount.
     *
     * @return the current value of settlementAmount
     */
    public BigDecimal getSettlementAmount() {
        return settlementAmount;
    }

    /**
     * Setter method for settlementAmount.
     *
     * @param aSettlementAmount the new value for settlementAmount
     */
    public void setSettlementAmount(BigDecimal aSettlementAmount) {
        settlementAmount = aSettlementAmount;
    }

    /**
     * Access method for eventName.
     *
     * @return the current value of eventName
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * Setter method for eventName.
     *
     * @param aEventName the new value for eventName
     */
    public void setEventName(String aEventName) {
        eventName = aEventName;
    }

    /**
     * Access method for airportDesc.
     *
     * @return the current value of airportDesc
     */
    public String getAirportDesc() {
        return airportDesc;
    }

    /**
     * Setter method for airportDesc.
     *
     * @param aAirportDesc the new value for airportDesc
     */
    public void setAirportDesc(String aAirportDesc) {
        airportDesc = aAirportDesc;
    }

    /**
     * Access method for travelLocation.
     *
     * @return the current value of travelLocation
     */
    public String getTravelLocation() {
        return travelLocation;
    }

    /**
     * Setter method for travelLocation.
     *
     * @param aTravelLocation the new value for travelLocation
     */
    public void setTravelLocation(String aTravelLocation) {
        travelLocation = aTravelLocation;
    }

    /**
     * Access method for passengerCount.
     *
     * @return the current value of passengerCount
     */
    public BigDecimal getPassengerCount() {
        return passengerCount;
    }

    /**
     * Setter method for passengerCount.
     *
     * @param aPassengerCount the new value for passengerCount
     */
    public void setPassengerCount(BigDecimal aPassengerCount) {
        passengerCount = aPassengerCount;
    }

    /**
     * Access method for membershipId.
     *
     * @return the current value of membershipId
     */
    public long getMembershipId() {
        return membershipId;
    }

    /**
     * Setter method for membershipId.
     *
     * @param aMembershipId the new value for membershipId
     */
    public void setMembershipId(long aMembershipId) {
        membershipId = aMembershipId;
    }

    /**
     * Access method for stageMember.
     *
     * @return the current value of stageMember
     */
    public StageMember getStageMember() {
        return stageMember;
    }

    /**
     * Setter method for stageMember.
     *
     * @param aStageMember the new value for stageMember
     */
    public void setStageMember(StageMember aStageMember) {
        stageMember = aStageMember;
    }

    /**
     * Compares the key for this instance with another StageHubBenefitUsage.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class StageHubBenefitUsage and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof StageHubBenefitUsage)) {
            return false;
        }
        StageHubBenefitUsage that = (StageHubBenefitUsage) other;
        Object myBenefitUsageSysid = this.getBenefitUsageSysid();
        Object yourBenefitUsageSysid = that.getBenefitUsageSysid();
        if (myBenefitUsageSysid==null ? yourBenefitUsageSysid!=null : !myBenefitUsageSysid.equals(yourBenefitUsageSysid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another StageHubBenefitUsage.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof StageHubBenefitUsage)) return false;
        return this.equalKeys(other) && ((StageHubBenefitUsage)other).equalKeys(this);
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
        if (getBenefitUsageSysid() == null) {
            i = 0;
        } else {
            i = getBenefitUsageSysid().hashCode();
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
        StringBuffer sb = new StringBuffer("[StageHubBenefitUsage |");
        sb.append(" benefitUsageSysid=").append(getBenefitUsageSysid());
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
        ret.put("benefitUsageSysid", getBenefitUsageSysid());
        return ret;
    }

}
