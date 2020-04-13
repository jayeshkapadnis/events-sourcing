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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="stage_bank_account")
public class StageBankAccount implements Serializable {

    /** Primary key. */
    protected static final String PK = "bankAccountSysid";

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
    @Column(name="bank_account_sysid", unique=true, nullable=false, precision=9)
    private BigDecimal bankAccountSysid;
    @Column(name="account_number", nullable=false, length=30)
    private String accountNumber;
    @Column(name="region_id", nullable=false, precision=2)
    private BigDecimal regionId;
    @Column(name="bank_branch_sysid", nullable=false, precision=9)
    private BigDecimal bankBranchSysid;
    @Column(name="account_holder_name", length=100)
    private String accountHolderName;
    @Column(name="status_code", nullable=false, length=1)
    private String statusCode;
    @Column(name="status_code_description", nullable=false, length=32)
    private String statusCodeDescription;
    @Column(name="is_validated", length=1)
    private String isValidated;
    @Column(name="registered_date")
    private Timestamp registeredDate;
    @Column(name="account_package", length=10)
    private String accountPackage;
    @Column(name="payment_mandate_type", nullable=false, precision=3)
    private BigDecimal paymentMandateType;
    @Column(name="payment_mandate_type_desc", nullable=false, length=20)
    private String paymentMandateTypeDesc;
    @Column(name="control_digit", length=30)
    private String controlDigit;
    @Column(length=255)
    private String description;
    @Column(name="registered_flg", length=1)
    private String registeredFlg;
    @Column(name="add_username", nullable=false, length=50)
    private String addUsername;
    @Column(name="update_username", nullable=false, length=50)
    private String updateUsername;
    @Column(name="add_date", nullable=false)
    private Timestamp addDate;
    @Column(name="update_date", nullable=false)
    private Timestamp updateDate;
    @Column(name="add_client_username", length=50)
    private String addClientUsername;
    @Column(name="update_client_username", length=50)
    private String updateClientUsername;
    @Column(name="siebel_id", length=100)
    private String siebelId;
    @Column(name="last_status_chg_date")
    private Timestamp lastStatusChgDate;
    @Column(name="do_not_display_flag", length=1)
    private String doNotDisplayFlag;
    @Column(name="membership_id", nullable=false, precision=19)
    private long membershipId;
    @Column(name="data_vault_id", precision=19)
    private long dataVaultId;
    @OneToMany(mappedBy="stageBankAccount")
    private Set<StagePaymentVehicle> stagePaymentVehicle;
    @ManyToOne(optional=false)
    @JoinColumn(name="member_id", nullable=false)
    private StageMember stageMember;

    /** Default constructor. */
    public StageBankAccount() {
        super();
    }

    /**
     * Access method for bankAccountSysid.
     *
     * @return the current value of bankAccountSysid
     */
    public BigDecimal getBankAccountSysid() {
        return bankAccountSysid;
    }

    /**
     * Setter method for bankAccountSysid.
     *
     * @param aBankAccountSysid the new value for bankAccountSysid
     */
    public void setBankAccountSysid(BigDecimal aBankAccountSysid) {
        bankAccountSysid = aBankAccountSysid;
    }

    /**
     * Access method for accountNumber.
     *
     * @return the current value of accountNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Setter method for accountNumber.
     *
     * @param aAccountNumber the new value for accountNumber
     */
    public void setAccountNumber(String aAccountNumber) {
        accountNumber = aAccountNumber;
    }

    /**
     * Access method for regionId.
     *
     * @return the current value of regionId
     */
    public BigDecimal getRegionId() {
        return regionId;
    }

    /**
     * Setter method for regionId.
     *
     * @param aRegionId the new value for regionId
     */
    public void setRegionId(BigDecimal aRegionId) {
        regionId = aRegionId;
    }

    /**
     * Access method for bankBranchSysid.
     *
     * @return the current value of bankBranchSysid
     */
    public BigDecimal getBankBranchSysid() {
        return bankBranchSysid;
    }

    /**
     * Setter method for bankBranchSysid.
     *
     * @param aBankBranchSysid the new value for bankBranchSysid
     */
    public void setBankBranchSysid(BigDecimal aBankBranchSysid) {
        bankBranchSysid = aBankBranchSysid;
    }

    /**
     * Access method for accountHolderName.
     *
     * @return the current value of accountHolderName
     */
    public String getAccountHolderName() {
        return accountHolderName;
    }

    /**
     * Setter method for accountHolderName.
     *
     * @param aAccountHolderName the new value for accountHolderName
     */
    public void setAccountHolderName(String aAccountHolderName) {
        accountHolderName = aAccountHolderName;
    }

    /**
     * Access method for statusCode.
     *
     * @return the current value of statusCode
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Setter method for statusCode.
     *
     * @param aStatusCode the new value for statusCode
     */
    public void setStatusCode(String aStatusCode) {
        statusCode = aStatusCode;
    }

    /**
     * Access method for statusCodeDescription.
     *
     * @return the current value of statusCodeDescription
     */
    public String getStatusCodeDescription() {
        return statusCodeDescription;
    }

    /**
     * Setter method for statusCodeDescription.
     *
     * @param aStatusCodeDescription the new value for statusCodeDescription
     */
    public void setStatusCodeDescription(String aStatusCodeDescription) {
        statusCodeDescription = aStatusCodeDescription;
    }

    /**
     * Access method for isValidated.
     *
     * @return the current value of isValidated
     */
    public String getIsValidated() {
        return isValidated;
    }

    /**
     * Setter method for isValidated.
     *
     * @param aIsValidated the new value for isValidated
     */
    public void setIsValidated(String aIsValidated) {
        isValidated = aIsValidated;
    }

    /**
     * Access method for registeredDate.
     *
     * @return the current value of registeredDate
     */
    public Timestamp getRegisteredDate() {
        return registeredDate;
    }

    /**
     * Setter method for registeredDate.
     *
     * @param aRegisteredDate the new value for registeredDate
     */
    public void setRegisteredDate(Timestamp aRegisteredDate) {
        registeredDate = aRegisteredDate;
    }

    /**
     * Access method for accountPackage.
     *
     * @return the current value of accountPackage
     */
    public String getAccountPackage() {
        return accountPackage;
    }

    /**
     * Setter method for accountPackage.
     *
     * @param aAccountPackage the new value for accountPackage
     */
    public void setAccountPackage(String aAccountPackage) {
        accountPackage = aAccountPackage;
    }

    /**
     * Access method for paymentMandateType.
     *
     * @return the current value of paymentMandateType
     */
    public BigDecimal getPaymentMandateType() {
        return paymentMandateType;
    }

    /**
     * Setter method for paymentMandateType.
     *
     * @param aPaymentMandateType the new value for paymentMandateType
     */
    public void setPaymentMandateType(BigDecimal aPaymentMandateType) {
        paymentMandateType = aPaymentMandateType;
    }

    /**
     * Access method for paymentMandateTypeDesc.
     *
     * @return the current value of paymentMandateTypeDesc
     */
    public String getPaymentMandateTypeDesc() {
        return paymentMandateTypeDesc;
    }

    /**
     * Setter method for paymentMandateTypeDesc.
     *
     * @param aPaymentMandateTypeDesc the new value for paymentMandateTypeDesc
     */
    public void setPaymentMandateTypeDesc(String aPaymentMandateTypeDesc) {
        paymentMandateTypeDesc = aPaymentMandateTypeDesc;
    }

    /**
     * Access method for controlDigit.
     *
     * @return the current value of controlDigit
     */
    public String getControlDigit() {
        return controlDigit;
    }

    /**
     * Setter method for controlDigit.
     *
     * @param aControlDigit the new value for controlDigit
     */
    public void setControlDigit(String aControlDigit) {
        controlDigit = aControlDigit;
    }

    /**
     * Access method for description.
     *
     * @return the current value of description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter method for description.
     *
     * @param aDescription the new value for description
     */
    public void setDescription(String aDescription) {
        description = aDescription;
    }

    /**
     * Access method for registeredFlg.
     *
     * @return the current value of registeredFlg
     */
    public String getRegisteredFlg() {
        return registeredFlg;
    }

    /**
     * Setter method for registeredFlg.
     *
     * @param aRegisteredFlg the new value for registeredFlg
     */
    public void setRegisteredFlg(String aRegisteredFlg) {
        registeredFlg = aRegisteredFlg;
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
     * Access method for addClientUsername.
     *
     * @return the current value of addClientUsername
     */
    public String getAddClientUsername() {
        return addClientUsername;
    }

    /**
     * Setter method for addClientUsername.
     *
     * @param aAddClientUsername the new value for addClientUsername
     */
    public void setAddClientUsername(String aAddClientUsername) {
        addClientUsername = aAddClientUsername;
    }

    /**
     * Access method for updateClientUsername.
     *
     * @return the current value of updateClientUsername
     */
    public String getUpdateClientUsername() {
        return updateClientUsername;
    }

    /**
     * Setter method for updateClientUsername.
     *
     * @param aUpdateClientUsername the new value for updateClientUsername
     */
    public void setUpdateClientUsername(String aUpdateClientUsername) {
        updateClientUsername = aUpdateClientUsername;
    }

    /**
     * Access method for siebelId.
     *
     * @return the current value of siebelId
     */
    public String getSiebelId() {
        return siebelId;
    }

    /**
     * Setter method for siebelId.
     *
     * @param aSiebelId the new value for siebelId
     */
    public void setSiebelId(String aSiebelId) {
        siebelId = aSiebelId;
    }

    /**
     * Access method for lastStatusChgDate.
     *
     * @return the current value of lastStatusChgDate
     */
    public Timestamp getLastStatusChgDate() {
        return lastStatusChgDate;
    }

    /**
     * Setter method for lastStatusChgDate.
     *
     * @param aLastStatusChgDate the new value for lastStatusChgDate
     */
    public void setLastStatusChgDate(Timestamp aLastStatusChgDate) {
        lastStatusChgDate = aLastStatusChgDate;
    }

    /**
     * Access method for doNotDisplayFlag.
     *
     * @return the current value of doNotDisplayFlag
     */
    public String getDoNotDisplayFlag() {
        return doNotDisplayFlag;
    }

    /**
     * Setter method for doNotDisplayFlag.
     *
     * @param aDoNotDisplayFlag the new value for doNotDisplayFlag
     */
    public void setDoNotDisplayFlag(String aDoNotDisplayFlag) {
        doNotDisplayFlag = aDoNotDisplayFlag;
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
     * Access method for dataVaultId.
     *
     * @return the current value of dataVaultId
     */
    public long getDataVaultId() {
        return dataVaultId;
    }

    /**
     * Setter method for dataVaultId.
     *
     * @param aDataVaultId the new value for dataVaultId
     */
    public void setDataVaultId(long aDataVaultId) {
        dataVaultId = aDataVaultId;
    }

    /**
     * Access method for stagePaymentVehicle.
     *
     * @return the current value of stagePaymentVehicle
     */
    public Set<StagePaymentVehicle> getStagePaymentVehicle() {
        return stagePaymentVehicle;
    }

    /**
     * Setter method for stagePaymentVehicle.
     *
     * @param aStagePaymentVehicle the new value for stagePaymentVehicle
     */
    public void setStagePaymentVehicle(Set<StagePaymentVehicle> aStagePaymentVehicle) {
        stagePaymentVehicle = aStagePaymentVehicle;
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
     * Compares the key for this instance with another StageBankAccount.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class StageBankAccount and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof StageBankAccount)) {
            return false;
        }
        StageBankAccount that = (StageBankAccount) other;
        Object myBankAccountSysid = this.getBankAccountSysid();
        Object yourBankAccountSysid = that.getBankAccountSysid();
        if (myBankAccountSysid==null ? yourBankAccountSysid!=null : !myBankAccountSysid.equals(yourBankAccountSysid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another StageBankAccount.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof StageBankAccount)) return false;
        return this.equalKeys(other) && ((StageBankAccount)other).equalKeys(this);
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
        if (getBankAccountSysid() == null) {
            i = 0;
        } else {
            i = getBankAccountSysid().hashCode();
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
        StringBuffer sb = new StringBuffer("[StageBankAccount |");
        sb.append(" bankAccountSysid=").append(getBankAccountSysid());
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
        ret.put("bankAccountSysid", getBankAccountSysid());
        return ret;
    }

}
