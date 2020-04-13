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

@Entity(name="bank_branch")
public class BankBranch implements Serializable {

    /** Primary key. */
    protected static final String PK = "bankBranchSysid";

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
    @Column(name="bank_branch_sysid", unique=true, nullable=false, precision=9)
    private BigDecimal bankBranchSysid;
    @Column(name="branch_name", length=100)
    private String branchName;
    @Column(name="contact_name", length=50)
    private String contactName;
    @Column(name="contact_phone", length=20)
    private String contactPhone;
    @Column(name="bank_sort_code", length=50)
    private String bankSortCode;
    @Column(name="add_date", nullable=false)
    private Timestamp addDate;
    @Column(name="add_username", nullable=false, length=50)
    private String addUsername;
    @Column(name="update_date", nullable=false)
    private Timestamp updateDate;
    @Column(name="update_username", nullable=false, length=50)
    private String updateUsername;
    @Column(name="bank_code", length=15)
    private String bankCode;
    @Column(name="branch_code2", length=30)
    private String branchCode2;
    @Column(name="cust_stat_cd", length=1)
    private String custStatCd;
    @Column(name="siebel_id", length=50)
    private String siebelId;
    @Column(length=255)
    private String description;
    @Column(name="valid_for_payment_flag", length=1)
    private String validForPaymentFlag;
    @Column(name="status_code", length=1)
    private String statusCode;
    @Column(name="fax_number", length=40)
    private String faxNumber;
    @ManyToOne
    @JoinColumn(name="notification_method_sysid")
    private IssuerNotificationMethod issuerNotificationMethod;
    @ManyToOne(optional=false)
    @JoinColumn(name="region_id", nullable=false)
    private Organization organization;
    @OneToMany(mappedBy="bankBranch")
    private Set<BankBranchMap> bankBranchMap;

    /** Default constructor. */
    public BankBranch() {
        super();
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
     * Access method for branchName.
     *
     * @return the current value of branchName
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * Setter method for branchName.
     *
     * @param aBranchName the new value for branchName
     */
    public void setBranchName(String aBranchName) {
        branchName = aBranchName;
    }

    /**
     * Access method for contactName.
     *
     * @return the current value of contactName
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Setter method for contactName.
     *
     * @param aContactName the new value for contactName
     */
    public void setContactName(String aContactName) {
        contactName = aContactName;
    }

    /**
     * Access method for contactPhone.
     *
     * @return the current value of contactPhone
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * Setter method for contactPhone.
     *
     * @param aContactPhone the new value for contactPhone
     */
    public void setContactPhone(String aContactPhone) {
        contactPhone = aContactPhone;
    }

    /**
     * Access method for bankSortCode.
     *
     * @return the current value of bankSortCode
     */
    public String getBankSortCode() {
        return bankSortCode;
    }

    /**
     * Setter method for bankSortCode.
     *
     * @param aBankSortCode the new value for bankSortCode
     */
    public void setBankSortCode(String aBankSortCode) {
        bankSortCode = aBankSortCode;
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
     * Access method for bankCode.
     *
     * @return the current value of bankCode
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * Setter method for bankCode.
     *
     * @param aBankCode the new value for bankCode
     */
    public void setBankCode(String aBankCode) {
        bankCode = aBankCode;
    }

    /**
     * Access method for branchCode2.
     *
     * @return the current value of branchCode2
     */
    public String getBranchCode2() {
        return branchCode2;
    }

    /**
     * Setter method for branchCode2.
     *
     * @param aBranchCode2 the new value for branchCode2
     */
    public void setBranchCode2(String aBranchCode2) {
        branchCode2 = aBranchCode2;
    }

    /**
     * Access method for custStatCd.
     *
     * @return the current value of custStatCd
     */
    public String getCustStatCd() {
        return custStatCd;
    }

    /**
     * Setter method for custStatCd.
     *
     * @param aCustStatCd the new value for custStatCd
     */
    public void setCustStatCd(String aCustStatCd) {
        custStatCd = aCustStatCd;
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
     * Access method for validForPaymentFlag.
     *
     * @return the current value of validForPaymentFlag
     */
    public String getValidForPaymentFlag() {
        return validForPaymentFlag;
    }

    /**
     * Setter method for validForPaymentFlag.
     *
     * @param aValidForPaymentFlag the new value for validForPaymentFlag
     */
    public void setValidForPaymentFlag(String aValidForPaymentFlag) {
        validForPaymentFlag = aValidForPaymentFlag;
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
     * Access method for faxNumber.
     *
     * @return the current value of faxNumber
     */
    public String getFaxNumber() {
        return faxNumber;
    }

    /**
     * Setter method for faxNumber.
     *
     * @param aFaxNumber the new value for faxNumber
     */
    public void setFaxNumber(String aFaxNumber) {
        faxNumber = aFaxNumber;
    }

    /**
     * Access method for issuerNotificationMethod.
     *
     * @return the current value of issuerNotificationMethod
     */
    public IssuerNotificationMethod getIssuerNotificationMethod() {
        return issuerNotificationMethod;
    }

    /**
     * Setter method for issuerNotificationMethod.
     *
     * @param aIssuerNotificationMethod the new value for issuerNotificationMethod
     */
    public void setIssuerNotificationMethod(IssuerNotificationMethod aIssuerNotificationMethod) {
        issuerNotificationMethod = aIssuerNotificationMethod;
    }

    /**
     * Access method for organization.
     *
     * @return the current value of organization
     */
    public Organization getOrganization() {
        return organization;
    }

    /**
     * Setter method for organization.
     *
     * @param aOrganization the new value for organization
     */
    public void setOrganization(Organization aOrganization) {
        organization = aOrganization;
    }

    /**
     * Access method for bankBranchMap.
     *
     * @return the current value of bankBranchMap
     */
    public Set<BankBranchMap> getBankBranchMap() {
        return bankBranchMap;
    }

    /**
     * Setter method for bankBranchMap.
     *
     * @param aBankBranchMap the new value for bankBranchMap
     */
    public void setBankBranchMap(Set<BankBranchMap> aBankBranchMap) {
        bankBranchMap = aBankBranchMap;
    }

    /**
     * Compares the key for this instance with another BankBranch.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class BankBranch and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof BankBranch)) {
            return false;
        }
        BankBranch that = (BankBranch) other;
        Object myBankBranchSysid = this.getBankBranchSysid();
        Object yourBankBranchSysid = that.getBankBranchSysid();
        if (myBankBranchSysid==null ? yourBankBranchSysid!=null : !myBankBranchSysid.equals(yourBankBranchSysid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another BankBranch.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof BankBranch)) return false;
        return this.equalKeys(other) && ((BankBranch)other).equalKeys(this);
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
        if (getBankBranchSysid() == null) {
            i = 0;
        } else {
            i = getBankBranchSysid().hashCode();
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
        StringBuffer sb = new StringBuffer("[BankBranch |");
        sb.append(" bankBranchSysid=").append(getBankBranchSysid());
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
        ret.put("bankBranchSysid", getBankBranchSysid());
        return ret;
    }

}
