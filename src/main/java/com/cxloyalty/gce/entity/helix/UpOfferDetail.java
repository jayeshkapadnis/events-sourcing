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
@Table(name="up_offer_detail", indexes={@Index(name="up_offer_detail_up_offer_detail_guid_IX", columnList="up_offer_detail_guid", unique=true)})
public class UpOfferDetail implements Serializable {

    /** Primary key. */
    protected static final String PK = "upOfferDetailId";

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
    @Column(name="up_offer_detail_id", unique=true, nullable=false, precision=16)
    private BigDecimal upOfferDetailId;
    @Column(name="promotional_description", length=400)
    private String promotionalDescription;
    @Column(name="term_amount", nullable=false, precision=10, scale=2)
    private BigDecimal termAmount;
    @Column(name="bill_amount", nullable=false, precision=10, scale=2)
    private BigDecimal billAmount;
    @Column(name="insurance_description", length=200)
    private String insuranceDescription;
    @Column(name="refund_offset_days", nullable=false, precision=3)
    private BigDecimal refundOffsetDays;
    @Column(name="user_created", nullable=false, length=200)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=200)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @Column(name="renewal_end_date")
    private Timestamp renewalEndDate;
    @Column(name="up_offer_detail_guid", unique=true, nullable=false, length=36)
    private String upOfferDetailGuid;
    @ManyToOne(optional=false)
    @JoinColumn(name="up_offer_guid", nullable=false)
    private UpOffer upOffer;
    @ManyToOne(optional=false)
    @JoinColumn(name="term_id", nullable=false)
    private Term term;
    @ManyToOne(optional=false)
    @JoinColumn(name="bill_frequency_id", nullable=false)
    private BillFrequency billFrequency;
    @ManyToOne
    @JoinColumn(name="offer_benefit_id")
    private Benefit benefit;
    @ManyToOne
    @JoinColumn(name="offer_package_id")
    private Package package_;
    @ManyToOne(optional=false)
    @JoinColumn(name="refund_rule_id", nullable=false)
    private RefundRule refundRule;

    /** Default constructor. */
    public UpOfferDetail() {
        super();
    }

    /**
     * Access method for upOfferDetailId.
     *
     * @return the current value of upOfferDetailId
     */
    public BigDecimal getUpOfferDetailId() {
        return upOfferDetailId;
    }

    /**
     * Setter method for upOfferDetailId.
     *
     * @param aUpOfferDetailId the new value for upOfferDetailId
     */
    public void setUpOfferDetailId(BigDecimal aUpOfferDetailId) {
        upOfferDetailId = aUpOfferDetailId;
    }

    /**
     * Access method for promotionalDescription.
     *
     * @return the current value of promotionalDescription
     */
    public String getPromotionalDescription() {
        return promotionalDescription;
    }

    /**
     * Setter method for promotionalDescription.
     *
     * @param aPromotionalDescription the new value for promotionalDescription
     */
    public void setPromotionalDescription(String aPromotionalDescription) {
        promotionalDescription = aPromotionalDescription;
    }

    /**
     * Access method for termAmount.
     *
     * @return the current value of termAmount
     */
    public BigDecimal getTermAmount() {
        return termAmount;
    }

    /**
     * Setter method for termAmount.
     *
     * @param aTermAmount the new value for termAmount
     */
    public void setTermAmount(BigDecimal aTermAmount) {
        termAmount = aTermAmount;
    }

    /**
     * Access method for billAmount.
     *
     * @return the current value of billAmount
     */
    public BigDecimal getBillAmount() {
        return billAmount;
    }

    /**
     * Setter method for billAmount.
     *
     * @param aBillAmount the new value for billAmount
     */
    public void setBillAmount(BigDecimal aBillAmount) {
        billAmount = aBillAmount;
    }

    /**
     * Access method for insuranceDescription.
     *
     * @return the current value of insuranceDescription
     */
    public String getInsuranceDescription() {
        return insuranceDescription;
    }

    /**
     * Setter method for insuranceDescription.
     *
     * @param aInsuranceDescription the new value for insuranceDescription
     */
    public void setInsuranceDescription(String aInsuranceDescription) {
        insuranceDescription = aInsuranceDescription;
    }

    /**
     * Access method for refundOffsetDays.
     *
     * @return the current value of refundOffsetDays
     */
    public BigDecimal getRefundOffsetDays() {
        return refundOffsetDays;
    }

    /**
     * Setter method for refundOffsetDays.
     *
     * @param aRefundOffsetDays the new value for refundOffsetDays
     */
    public void setRefundOffsetDays(BigDecimal aRefundOffsetDays) {
        refundOffsetDays = aRefundOffsetDays;
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
     * Access method for renewalEndDate.
     *
     * @return the current value of renewalEndDate
     */
    public Timestamp getRenewalEndDate() {
        return renewalEndDate;
    }

    /**
     * Setter method for renewalEndDate.
     *
     * @param aRenewalEndDate the new value for renewalEndDate
     */
    public void setRenewalEndDate(Timestamp aRenewalEndDate) {
        renewalEndDate = aRenewalEndDate;
    }

    /**
     * Access method for upOfferDetailGuid.
     *
     * @return the current value of upOfferDetailGuid
     */
    public String getUpOfferDetailGuid() {
        return upOfferDetailGuid;
    }

    /**
     * Setter method for upOfferDetailGuid.
     *
     * @param aUpOfferDetailGuid the new value for upOfferDetailGuid
     */
    public void setUpOfferDetailGuid(String aUpOfferDetailGuid) {
        upOfferDetailGuid = aUpOfferDetailGuid;
    }

    /**
     * Access method for upOffer.
     *
     * @return the current value of upOffer
     */
    public UpOffer getUpOffer() {
        return upOffer;
    }

    /**
     * Setter method for upOffer.
     *
     * @param aUpOffer the new value for upOffer
     */
    public void setUpOffer(UpOffer aUpOffer) {
        upOffer = aUpOffer;
    }

    /**
     * Access method for term.
     *
     * @return the current value of term
     */
    public Term getTerm() {
        return term;
    }

    /**
     * Setter method for term.
     *
     * @param aTerm the new value for term
     */
    public void setTerm(Term aTerm) {
        term = aTerm;
    }

    /**
     * Access method for billFrequency.
     *
     * @return the current value of billFrequency
     */
    public BillFrequency getBillFrequency() {
        return billFrequency;
    }

    /**
     * Setter method for billFrequency.
     *
     * @param aBillFrequency the new value for billFrequency
     */
    public void setBillFrequency(BillFrequency aBillFrequency) {
        billFrequency = aBillFrequency;
    }

    /**
     * Access method for benefit.
     *
     * @return the current value of benefit
     */
    public Benefit getBenefit() {
        return benefit;
    }

    /**
     * Setter method for benefit.
     *
     * @param aBenefit the new value for benefit
     */
    public void setBenefit(Benefit aBenefit) {
        benefit = aBenefit;
    }

    /**
     * Access method for package_.
     *
     * @return the current value of package_
     */
    public Package getPackage_() {
        return package_;
    }

    /**
     * Setter method for package_.
     *
     * @param aPackage_ the new value for package_
     */
    public void setPackage_(Package aPackage_) {
        package_ = aPackage_;
    }

    /**
     * Access method for refundRule.
     *
     * @return the current value of refundRule
     */
    public RefundRule getRefundRule() {
        return refundRule;
    }

    /**
     * Setter method for refundRule.
     *
     * @param aRefundRule the new value for refundRule
     */
    public void setRefundRule(RefundRule aRefundRule) {
        refundRule = aRefundRule;
    }

    /**
     * Compares the key for this instance with another UpOfferDetail.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class UpOfferDetail and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof UpOfferDetail)) {
            return false;
        }
        UpOfferDetail that = (UpOfferDetail) other;
        Object myUpOfferDetailId = this.getUpOfferDetailId();
        Object yourUpOfferDetailId = that.getUpOfferDetailId();
        if (myUpOfferDetailId==null ? yourUpOfferDetailId!=null : !myUpOfferDetailId.equals(yourUpOfferDetailId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another UpOfferDetail.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof UpOfferDetail)) return false;
        return this.equalKeys(other) && ((UpOfferDetail)other).equalKeys(this);
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
        if (getUpOfferDetailId() == null) {
            i = 0;
        } else {
            i = getUpOfferDetailId().hashCode();
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
        StringBuffer sb = new StringBuffer("[UpOfferDetail |");
        sb.append(" upOfferDetailId=").append(getUpOfferDetailId());
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
        ret.put("upOfferDetailId", getUpOfferDetailId());
        return ret;
    }

}
