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
@Table(name="userpays_detail", indexes={@Index(name="userpaysDetailIdxUpDtlFlxChldBenPkgId", columnList="flexible_child_package_id,ben_pkg_id")})
public class UserpaysDetail implements Serializable {

    /** Primary key. */
    protected static final String PK = "userpaysDetailId";

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
    @Column(name="userpays_detail_id", unique=true, nullable=false, precision=16)
    private BigDecimal userpaysDetailId;
    @Column(name="ben_activate_wait_hours_file", nullable=false, precision=2)
    private BigDecimal benActivateWaitHoursFile;
    @Column(name="renewal_notification_days", nullable=false, precision=2)
    private BigDecimal renewalNotificationDays;
    @Column(name="user_created", nullable=false, length=200)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=200)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @Column(name="payment_request_type_desc", length=100)
    private String paymentRequestTypeDesc;
    @ManyToOne
    @JoinColumn(name="ben_pkg_id")
    private BenefitPackage benefitPackage;
    @ManyToOne
    @JoinColumn(name="flexible_child_package_id")
    private FlexibleChildPackage flexibleChildPackage;
    @ManyToOne(optional=false)
    @JoinColumn(name="payment_processor_id", nullable=false)
    private UpPaymentProcessor upPaymentProcessor;
    @ManyToOne(optional=false)
    @JoinColumn(name="renewal_type_id", nullable=false)
    private RenewalType renewalType;

    /** Default constructor. */
    public UserpaysDetail() {
        super();
    }

    /**
     * Access method for userpaysDetailId.
     *
     * @return the current value of userpaysDetailId
     */
    public BigDecimal getUserpaysDetailId() {
        return userpaysDetailId;
    }

    /**
     * Setter method for userpaysDetailId.
     *
     * @param aUserpaysDetailId the new value for userpaysDetailId
     */
    public void setUserpaysDetailId(BigDecimal aUserpaysDetailId) {
        userpaysDetailId = aUserpaysDetailId;
    }

    /**
     * Access method for benActivateWaitHoursFile.
     *
     * @return the current value of benActivateWaitHoursFile
     */
    public BigDecimal getBenActivateWaitHoursFile() {
        return benActivateWaitHoursFile;
    }

    /**
     * Setter method for benActivateWaitHoursFile.
     *
     * @param aBenActivateWaitHoursFile the new value for benActivateWaitHoursFile
     */
    public void setBenActivateWaitHoursFile(BigDecimal aBenActivateWaitHoursFile) {
        benActivateWaitHoursFile = aBenActivateWaitHoursFile;
    }

    /**
     * Access method for renewalNotificationDays.
     *
     * @return the current value of renewalNotificationDays
     */
    public BigDecimal getRenewalNotificationDays() {
        return renewalNotificationDays;
    }

    /**
     * Setter method for renewalNotificationDays.
     *
     * @param aRenewalNotificationDays the new value for renewalNotificationDays
     */
    public void setRenewalNotificationDays(BigDecimal aRenewalNotificationDays) {
        renewalNotificationDays = aRenewalNotificationDays;
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
     * Access method for paymentRequestTypeDesc.
     *
     * @return the current value of paymentRequestTypeDesc
     */
    public String getPaymentRequestTypeDesc() {
        return paymentRequestTypeDesc;
    }

    /**
     * Setter method for paymentRequestTypeDesc.
     *
     * @param aPaymentRequestTypeDesc the new value for paymentRequestTypeDesc
     */
    public void setPaymentRequestTypeDesc(String aPaymentRequestTypeDesc) {
        paymentRequestTypeDesc = aPaymentRequestTypeDesc;
    }

    /**
     * Access method for benefitPackage.
     *
     * @return the current value of benefitPackage
     */
    public BenefitPackage getBenefitPackage() {
        return benefitPackage;
    }

    /**
     * Setter method for benefitPackage.
     *
     * @param aBenefitPackage the new value for benefitPackage
     */
    public void setBenefitPackage(BenefitPackage aBenefitPackage) {
        benefitPackage = aBenefitPackage;
    }

    /**
     * Access method for flexibleChildPackage.
     *
     * @return the current value of flexibleChildPackage
     */
    public FlexibleChildPackage getFlexibleChildPackage() {
        return flexibleChildPackage;
    }

    /**
     * Setter method for flexibleChildPackage.
     *
     * @param aFlexibleChildPackage the new value for flexibleChildPackage
     */
    public void setFlexibleChildPackage(FlexibleChildPackage aFlexibleChildPackage) {
        flexibleChildPackage = aFlexibleChildPackage;
    }

    /**
     * Access method for upPaymentProcessor.
     *
     * @return the current value of upPaymentProcessor
     */
    public UpPaymentProcessor getUpPaymentProcessor() {
        return upPaymentProcessor;
    }

    /**
     * Setter method for upPaymentProcessor.
     *
     * @param aUpPaymentProcessor the new value for upPaymentProcessor
     */
    public void setUpPaymentProcessor(UpPaymentProcessor aUpPaymentProcessor) {
        upPaymentProcessor = aUpPaymentProcessor;
    }

    /**
     * Access method for renewalType.
     *
     * @return the current value of renewalType
     */
    public RenewalType getRenewalType() {
        return renewalType;
    }

    /**
     * Setter method for renewalType.
     *
     * @param aRenewalType the new value for renewalType
     */
    public void setRenewalType(RenewalType aRenewalType) {
        renewalType = aRenewalType;
    }

    /**
     * Gets the group fragment flexibleChildPackageId for member flexibleChildPackage.
     *
     * @return Current value of the group fragment
     * @see FlexibleChildPackage
     */
    public BigDecimal getFlexibleChildPackageFlexibleChildPackageId() {
        return (getFlexibleChildPackage() == null ? null : getFlexibleChildPackage().getFlexibleChildPackageId());
    }

    /**
     * Sets the group fragment flexibleChildPackageId from member flexibleChildPackage.
     *
     * @param aFlexibleChildPackageId New value for the group fragment
     * @see FlexibleChildPackage
     */
    public void setFlexibleChildPackageFlexibleChildPackageId(BigDecimal aFlexibleChildPackageId) {
        if (getFlexibleChildPackage() != null) {
            getFlexibleChildPackage().setFlexibleChildPackageId(aFlexibleChildPackageId);
        }
    }

    /**
     * Gets the group fragment benPkgId for member benefitPackage.
     *
     * @return Current value of the group fragment
     * @see BenefitPackage
     */
    public BigDecimal getBenefitPackageBenPkgId() {
        return (getBenefitPackage() == null ? null : getBenefitPackage().getBenPkgId());
    }

    /**
     * Sets the group fragment benPkgId from member benefitPackage.
     *
     * @param aBenPkgId New value for the group fragment
     * @see BenefitPackage
     */
    public void setBenefitPackageBenPkgId(BigDecimal aBenPkgId) {
        if (getBenefitPackage() != null) {
            getBenefitPackage().setBenPkgId(aBenPkgId);
        }
    }

    /**
     * Compares the key for this instance with another UserpaysDetail.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class UserpaysDetail and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof UserpaysDetail)) {
            return false;
        }
        UserpaysDetail that = (UserpaysDetail) other;
        Object myUserpaysDetailId = this.getUserpaysDetailId();
        Object yourUserpaysDetailId = that.getUserpaysDetailId();
        if (myUserpaysDetailId==null ? yourUserpaysDetailId!=null : !myUserpaysDetailId.equals(yourUserpaysDetailId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another UserpaysDetail.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof UserpaysDetail)) return false;
        return this.equalKeys(other) && ((UserpaysDetail)other).equalKeys(this);
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
        if (getUserpaysDetailId() == null) {
            i = 0;
        } else {
            i = getUserpaysDetailId().hashCode();
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
        StringBuffer sb = new StringBuffer("[UserpaysDetail |");
        sb.append(" userpaysDetailId=").append(getUserpaysDetailId());
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
        ret.put("userpaysDetailId", getUserpaysDetailId());
        return ret;
    }

}
