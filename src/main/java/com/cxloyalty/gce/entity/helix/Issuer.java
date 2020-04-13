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

@Entity(name="issuer")
public class Issuer implements Serializable {

    /** Primary key. */
    protected static final String PK = "issuerSysid";

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
    @Column(name="issuer_sysid", unique=true, nullable=false, precision=9)
    private BigDecimal issuerSysid;
    @Column(name="issuer_code", length=6)
    private String issuerCode;
    @Column(name="bank_sort_code_req_flag", nullable=false, length=1)
    private String bankSortCodeReqFlag;
    @Column(nullable=false, length=100)
    private String name;
    @Column(name="third_party_replace_flag", nullable=false, length=1)
    private String thirdPartyReplaceFlag;
    @Column(name="siebel_issuer_id", length=15)
    private String siebelIssuerId;
    @Column(name="add_date", nullable=false)
    private Timestamp addDate;
    @Column(name="add_username", nullable=false, length=50)
    private String addUsername;
    @Column(name="update_date", nullable=false)
    private Timestamp updateDate;
    @Column(name="update_username", nullable=false, length=50)
    private String updateUsername;
    @Column(name="bank_sort_code", length=50)
    private String bankSortCode;
    @Column(name="external_name", length=100)
    private String externalName;
    @Column(name="valid_for_payment_flag", length=1)
    private String validForPaymentFlag;
    @Column(name="card_issue_digits", precision=2)
    private BigDecimal cardIssueDigits;
    @Column(name="card_cont_auth_flg", length=1)
    private String cardContAuthFlg;
    @Column(name="card_start_dt_req_flg", length=1)
    private String cardStartDtReqFlg;
    @Column(name="card_end_dt_req_flg", length=1)
    private String cardEndDtReqFlg;
    @Column(name="x_card_issue_num_req_flg", length=1)
    private String xCardIssueNumReqFlg;
    @Column(name="x_card_block_via_branch", length=1)
    private String xCardBlockViaBranch;
    @Column(name="card_number_min_length", precision=2)
    private BigDecimal cardNumberMinLength;
    @Column(name="card_number_max_length", precision=2)
    private BigDecimal cardNumberMaxLength;
    @Column(name="mod10_compatible_flag", nullable=false, length=1)
    private String mod10CompatibleFlag;
    @Column(length=256)
    private String comments;
    @Column(name="bank_code", length=15)
    private String bankCode;
    @Column(name="branch_code2", length=30)
    private String branchCode2;
    @Column(name="coanotification_fl", nullable=false, precision=1)
    private BigDecimal coanotificationFl;
    @Column(name="status_code_description", length=32)
    private String statusCodeDescription;
    @OneToMany(mappedBy="issuer")
    private Set<IssuerBin> issuerBin;
    @ManyToOne
    @JoinColumn(name="card_type_id")
    private CardType cardType;
    @ManyToOne
    @JoinColumn(name="country_sysid")
    private Country country;
    @ManyToOne(optional=false)
    @JoinColumn(name="issuer_type", nullable=false)
    private IssuerType issuerType;
    @ManyToOne(optional=false)
    @JoinColumn(name="region_id", nullable=false)
    private Organization organization;

    /** Default constructor. */
    public Issuer() {
        super();
    }

    /**
     * Access method for issuerSysid.
     *
     * @return the current value of issuerSysid
     */
    public BigDecimal getIssuerSysid() {
        return issuerSysid;
    }

    /**
     * Setter method for issuerSysid.
     *
     * @param aIssuerSysid the new value for issuerSysid
     */
    public void setIssuerSysid(BigDecimal aIssuerSysid) {
        issuerSysid = aIssuerSysid;
    }

    /**
     * Access method for issuerCode.
     *
     * @return the current value of issuerCode
     */
    public String getIssuerCode() {
        return issuerCode;
    }

    /**
     * Setter method for issuerCode.
     *
     * @param aIssuerCode the new value for issuerCode
     */
    public void setIssuerCode(String aIssuerCode) {
        issuerCode = aIssuerCode;
    }

    /**
     * Access method for bankSortCodeReqFlag.
     *
     * @return the current value of bankSortCodeReqFlag
     */
    public String getBankSortCodeReqFlag() {
        return bankSortCodeReqFlag;
    }

    /**
     * Setter method for bankSortCodeReqFlag.
     *
     * @param aBankSortCodeReqFlag the new value for bankSortCodeReqFlag
     */
    public void setBankSortCodeReqFlag(String aBankSortCodeReqFlag) {
        bankSortCodeReqFlag = aBankSortCodeReqFlag;
    }

    /**
     * Access method for name.
     *
     * @return the current value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for name.
     *
     * @param aName the new value for name
     */
    public void setName(String aName) {
        name = aName;
    }

    /**
     * Access method for thirdPartyReplaceFlag.
     *
     * @return the current value of thirdPartyReplaceFlag
     */
    public String getThirdPartyReplaceFlag() {
        return thirdPartyReplaceFlag;
    }

    /**
     * Setter method for thirdPartyReplaceFlag.
     *
     * @param aThirdPartyReplaceFlag the new value for thirdPartyReplaceFlag
     */
    public void setThirdPartyReplaceFlag(String aThirdPartyReplaceFlag) {
        thirdPartyReplaceFlag = aThirdPartyReplaceFlag;
    }

    /**
     * Access method for siebelIssuerId.
     *
     * @return the current value of siebelIssuerId
     */
    public String getSiebelIssuerId() {
        return siebelIssuerId;
    }

    /**
     * Setter method for siebelIssuerId.
     *
     * @param aSiebelIssuerId the new value for siebelIssuerId
     */
    public void setSiebelIssuerId(String aSiebelIssuerId) {
        siebelIssuerId = aSiebelIssuerId;
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
     * Access method for externalName.
     *
     * @return the current value of externalName
     */
    public String getExternalName() {
        return externalName;
    }

    /**
     * Setter method for externalName.
     *
     * @param aExternalName the new value for externalName
     */
    public void setExternalName(String aExternalName) {
        externalName = aExternalName;
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
     * Access method for cardIssueDigits.
     *
     * @return the current value of cardIssueDigits
     */
    public BigDecimal getCardIssueDigits() {
        return cardIssueDigits;
    }

    /**
     * Setter method for cardIssueDigits.
     *
     * @param aCardIssueDigits the new value for cardIssueDigits
     */
    public void setCardIssueDigits(BigDecimal aCardIssueDigits) {
        cardIssueDigits = aCardIssueDigits;
    }

    /**
     * Access method for cardContAuthFlg.
     *
     * @return the current value of cardContAuthFlg
     */
    public String getCardContAuthFlg() {
        return cardContAuthFlg;
    }

    /**
     * Setter method for cardContAuthFlg.
     *
     * @param aCardContAuthFlg the new value for cardContAuthFlg
     */
    public void setCardContAuthFlg(String aCardContAuthFlg) {
        cardContAuthFlg = aCardContAuthFlg;
    }

    /**
     * Access method for cardStartDtReqFlg.
     *
     * @return the current value of cardStartDtReqFlg
     */
    public String getCardStartDtReqFlg() {
        return cardStartDtReqFlg;
    }

    /**
     * Setter method for cardStartDtReqFlg.
     *
     * @param aCardStartDtReqFlg the new value for cardStartDtReqFlg
     */
    public void setCardStartDtReqFlg(String aCardStartDtReqFlg) {
        cardStartDtReqFlg = aCardStartDtReqFlg;
    }

    /**
     * Access method for cardEndDtReqFlg.
     *
     * @return the current value of cardEndDtReqFlg
     */
    public String getCardEndDtReqFlg() {
        return cardEndDtReqFlg;
    }

    /**
     * Setter method for cardEndDtReqFlg.
     *
     * @param aCardEndDtReqFlg the new value for cardEndDtReqFlg
     */
    public void setCardEndDtReqFlg(String aCardEndDtReqFlg) {
        cardEndDtReqFlg = aCardEndDtReqFlg;
    }

    /**
     * Access method for xCardIssueNumReqFlg.
     *
     * @return the current value of xCardIssueNumReqFlg
     */
    public String getXCardIssueNumReqFlg() {
        return xCardIssueNumReqFlg;
    }

    /**
     * Setter method for xCardIssueNumReqFlg.
     *
     * @param aXCardIssueNumReqFlg the new value for xCardIssueNumReqFlg
     */
    public void setXCardIssueNumReqFlg(String aXCardIssueNumReqFlg) {
        xCardIssueNumReqFlg = aXCardIssueNumReqFlg;
    }

    /**
     * Access method for xCardBlockViaBranch.
     *
     * @return the current value of xCardBlockViaBranch
     */
    public String getXCardBlockViaBranch() {
        return xCardBlockViaBranch;
    }

    /**
     * Setter method for xCardBlockViaBranch.
     *
     * @param aXCardBlockViaBranch the new value for xCardBlockViaBranch
     */
    public void setXCardBlockViaBranch(String aXCardBlockViaBranch) {
        xCardBlockViaBranch = aXCardBlockViaBranch;
    }

    /**
     * Access method for cardNumberMinLength.
     *
     * @return the current value of cardNumberMinLength
     */
    public BigDecimal getCardNumberMinLength() {
        return cardNumberMinLength;
    }

    /**
     * Setter method for cardNumberMinLength.
     *
     * @param aCardNumberMinLength the new value for cardNumberMinLength
     */
    public void setCardNumberMinLength(BigDecimal aCardNumberMinLength) {
        cardNumberMinLength = aCardNumberMinLength;
    }

    /**
     * Access method for cardNumberMaxLength.
     *
     * @return the current value of cardNumberMaxLength
     */
    public BigDecimal getCardNumberMaxLength() {
        return cardNumberMaxLength;
    }

    /**
     * Setter method for cardNumberMaxLength.
     *
     * @param aCardNumberMaxLength the new value for cardNumberMaxLength
     */
    public void setCardNumberMaxLength(BigDecimal aCardNumberMaxLength) {
        cardNumberMaxLength = aCardNumberMaxLength;
    }

    /**
     * Access method for mod10CompatibleFlag.
     *
     * @return the current value of mod10CompatibleFlag
     */
    public String getMod10CompatibleFlag() {
        return mod10CompatibleFlag;
    }

    /**
     * Setter method for mod10CompatibleFlag.
     *
     * @param aMod10CompatibleFlag the new value for mod10CompatibleFlag
     */
    public void setMod10CompatibleFlag(String aMod10CompatibleFlag) {
        mod10CompatibleFlag = aMod10CompatibleFlag;
    }

    /**
     * Access method for comments.
     *
     * @return the current value of comments
     */
    public String getComments() {
        return comments;
    }

    /**
     * Setter method for comments.
     *
     * @param aComments the new value for comments
     */
    public void setComments(String aComments) {
        comments = aComments;
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
     * Access method for coanotificationFl.
     *
     * @return the current value of coanotificationFl
     */
    public BigDecimal getCoanotificationFl() {
        return coanotificationFl;
    }

    /**
     * Setter method for coanotificationFl.
     *
     * @param aCoanotificationFl the new value for coanotificationFl
     */
    public void setCoanotificationFl(BigDecimal aCoanotificationFl) {
        coanotificationFl = aCoanotificationFl;
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
     * Access method for issuerBin.
     *
     * @return the current value of issuerBin
     */
    public Set<IssuerBin> getIssuerBin() {
        return issuerBin;
    }

    /**
     * Setter method for issuerBin.
     *
     * @param aIssuerBin the new value for issuerBin
     */
    public void setIssuerBin(Set<IssuerBin> aIssuerBin) {
        issuerBin = aIssuerBin;
    }

    /**
     * Access method for cardType.
     *
     * @return the current value of cardType
     */
    public CardType getCardType() {
        return cardType;
    }

    /**
     * Setter method for cardType.
     *
     * @param aCardType the new value for cardType
     */
    public void setCardType(CardType aCardType) {
        cardType = aCardType;
    }

    /**
     * Access method for country.
     *
     * @return the current value of country
     */
    public Country getCountry() {
        return country;
    }

    /**
     * Setter method for country.
     *
     * @param aCountry the new value for country
     */
    public void setCountry(Country aCountry) {
        country = aCountry;
    }

    /**
     * Access method for issuerType.
     *
     * @return the current value of issuerType
     */
    public IssuerType getIssuerType() {
        return issuerType;
    }

    /**
     * Setter method for issuerType.
     *
     * @param aIssuerType the new value for issuerType
     */
    public void setIssuerType(IssuerType aIssuerType) {
        issuerType = aIssuerType;
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
     * Compares the key for this instance with another Issuer.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Issuer and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Issuer)) {
            return false;
        }
        Issuer that = (Issuer) other;
        Object myIssuerSysid = this.getIssuerSysid();
        Object yourIssuerSysid = that.getIssuerSysid();
        if (myIssuerSysid==null ? yourIssuerSysid!=null : !myIssuerSysid.equals(yourIssuerSysid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Issuer.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Issuer)) return false;
        return this.equalKeys(other) && ((Issuer)other).equalKeys(this);
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
        if (getIssuerSysid() == null) {
            i = 0;
        } else {
            i = getIssuerSysid().hashCode();
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
        StringBuffer sb = new StringBuffer("[Issuer |");
        sb.append(" issuerSysid=").append(getIssuerSysid());
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
        ret.put("issuerSysid", getIssuerSysid());
        return ret;
    }

}
