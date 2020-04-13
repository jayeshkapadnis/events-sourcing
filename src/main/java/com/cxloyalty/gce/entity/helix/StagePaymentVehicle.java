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

@Entity(name="stage_payment_vehicle")
public class StagePaymentVehicle implements Serializable {

    /** Primary key. */
    protected static final String PK = "paymentVehicleSysid";

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
    @Column(name="payment_vehicle_sysid", unique=true, nullable=false, precision=9)
    private BigDecimal paymentVehicleSysid;
    @Column(name="payment_vehicle_type_sysid", nullable=false, precision=2)
    private BigDecimal paymentVehicleTypeSysid;
    @Column(name="payment_vehicle_type_desc", nullable=false, length=32)
    private String paymentVehicleTypeDesc;
    @Column(name="add_date", nullable=false)
    private Timestamp addDate;
    @Column(name="add_username", nullable=false, length=50)
    private String addUsername;
    @Column(name="update_date", nullable=false)
    private Timestamp updateDate;
    @Column(name="updated_username", nullable=false, length=50)
    private String updatedUsername;
    @Column(name="carrier_billing_id", precision=19)
    private long carrierBillingId;
    @Column(name="payment_vehicle_guid", nullable=false, length=800)
    private String paymentVehicleGuid;
    @Column(name="membership_id", nullable=false, precision=19)
    private long membershipId;
    @Column(name="transaction_id", precision=19)
    private long transactionId;
    @ManyToOne
    @JoinColumn(name="bank_account_sysid")
    private StageBankAccount stageBankAccount;
    @ManyToOne(optional=false)
    @JoinColumn(name="member_id", nullable=false)
    private StageMember stageMember;
    @ManyToOne
    @JoinColumn(name="protected_card_sysid")
    private StageProtectedCard stageProtectedCard;

    /** Default constructor. */
    public StagePaymentVehicle() {
        super();
    }

    /**
     * Access method for paymentVehicleSysid.
     *
     * @return the current value of paymentVehicleSysid
     */
    public BigDecimal getPaymentVehicleSysid() {
        return paymentVehicleSysid;
    }

    /**
     * Setter method for paymentVehicleSysid.
     *
     * @param aPaymentVehicleSysid the new value for paymentVehicleSysid
     */
    public void setPaymentVehicleSysid(BigDecimal aPaymentVehicleSysid) {
        paymentVehicleSysid = aPaymentVehicleSysid;
    }

    /**
     * Access method for paymentVehicleTypeSysid.
     *
     * @return the current value of paymentVehicleTypeSysid
     */
    public BigDecimal getPaymentVehicleTypeSysid() {
        return paymentVehicleTypeSysid;
    }

    /**
     * Setter method for paymentVehicleTypeSysid.
     *
     * @param aPaymentVehicleTypeSysid the new value for paymentVehicleTypeSysid
     */
    public void setPaymentVehicleTypeSysid(BigDecimal aPaymentVehicleTypeSysid) {
        paymentVehicleTypeSysid = aPaymentVehicleTypeSysid;
    }

    /**
     * Access method for paymentVehicleTypeDesc.
     *
     * @return the current value of paymentVehicleTypeDesc
     */
    public String getPaymentVehicleTypeDesc() {
        return paymentVehicleTypeDesc;
    }

    /**
     * Setter method for paymentVehicleTypeDesc.
     *
     * @param aPaymentVehicleTypeDesc the new value for paymentVehicleTypeDesc
     */
    public void setPaymentVehicleTypeDesc(String aPaymentVehicleTypeDesc) {
        paymentVehicleTypeDesc = aPaymentVehicleTypeDesc;
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
     * Access method for updatedUsername.
     *
     * @return the current value of updatedUsername
     */
    public String getUpdatedUsername() {
        return updatedUsername;
    }

    /**
     * Setter method for updatedUsername.
     *
     * @param aUpdatedUsername the new value for updatedUsername
     */
    public void setUpdatedUsername(String aUpdatedUsername) {
        updatedUsername = aUpdatedUsername;
    }

    /**
     * Access method for carrierBillingId.
     *
     * @return the current value of carrierBillingId
     */
    public long getCarrierBillingId() {
        return carrierBillingId;
    }

    /**
     * Setter method for carrierBillingId.
     *
     * @param aCarrierBillingId the new value for carrierBillingId
     */
    public void setCarrierBillingId(long aCarrierBillingId) {
        carrierBillingId = aCarrierBillingId;
    }

    /**
     * Access method for paymentVehicleGuid.
     *
     * @return the current value of paymentVehicleGuid
     */
    public String getPaymentVehicleGuid() {
        return paymentVehicleGuid;
    }

    /**
     * Setter method for paymentVehicleGuid.
     *
     * @param aPaymentVehicleGuid the new value for paymentVehicleGuid
     */
    public void setPaymentVehicleGuid(String aPaymentVehicleGuid) {
        paymentVehicleGuid = aPaymentVehicleGuid;
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
     * Access method for transactionId.
     *
     * @return the current value of transactionId
     */
    public long getTransactionId() {
        return transactionId;
    }

    /**
     * Setter method for transactionId.
     *
     * @param aTransactionId the new value for transactionId
     */
    public void setTransactionId(long aTransactionId) {
        transactionId = aTransactionId;
    }

    /**
     * Access method for stageBankAccount.
     *
     * @return the current value of stageBankAccount
     */
    public StageBankAccount getStageBankAccount() {
        return stageBankAccount;
    }

    /**
     * Setter method for stageBankAccount.
     *
     * @param aStageBankAccount the new value for stageBankAccount
     */
    public void setStageBankAccount(StageBankAccount aStageBankAccount) {
        stageBankAccount = aStageBankAccount;
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
     * Access method for stageProtectedCard.
     *
     * @return the current value of stageProtectedCard
     */
    public StageProtectedCard getStageProtectedCard() {
        return stageProtectedCard;
    }

    /**
     * Setter method for stageProtectedCard.
     *
     * @param aStageProtectedCard the new value for stageProtectedCard
     */
    public void setStageProtectedCard(StageProtectedCard aStageProtectedCard) {
        stageProtectedCard = aStageProtectedCard;
    }

    /**
     * Compares the key for this instance with another StagePaymentVehicle.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class StagePaymentVehicle and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof StagePaymentVehicle)) {
            return false;
        }
        StagePaymentVehicle that = (StagePaymentVehicle) other;
        Object myPaymentVehicleSysid = this.getPaymentVehicleSysid();
        Object yourPaymentVehicleSysid = that.getPaymentVehicleSysid();
        if (myPaymentVehicleSysid==null ? yourPaymentVehicleSysid!=null : !myPaymentVehicleSysid.equals(yourPaymentVehicleSysid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another StagePaymentVehicle.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof StagePaymentVehicle)) return false;
        return this.equalKeys(other) && ((StagePaymentVehicle)other).equalKeys(this);
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
        if (getPaymentVehicleSysid() == null) {
            i = 0;
        } else {
            i = getPaymentVehicleSysid().hashCode();
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
        StringBuffer sb = new StringBuffer("[StagePaymentVehicle |");
        sb.append(" paymentVehicleSysid=").append(getPaymentVehicleSysid());
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
        ret.put("paymentVehicleSysid", getPaymentVehicleSysid());
        return ret;
    }

}
