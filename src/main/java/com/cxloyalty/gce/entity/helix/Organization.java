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

@Entity(name="organization")
public class Organization implements Serializable {

    /** Primary key. */
    protected static final String PK = "organizationId";

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
    @Column(name="organization_id", unique=true, nullable=false, precision=16)
    private BigDecimal organizationId;
    @Column(name="organization_desc", nullable=false, length=4000)
    private String organizationDesc;
    @Column(name="user_created", nullable=false, length=4000)
    private String userCreated;
    @Column(name="date_created")
    private Timestamp dateCreated;
    @Column(name="user_modified", length=4000)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @Column(name="minimum_utc_offset", precision=4)
    private BigDecimal minimumUtcOffset;
    @Column(name="maximum_utc_offset", precision=4)
    private BigDecimal maximumUtcOffset;
    @OneToMany(mappedBy="organization")
    private Set<BankBranch> bankBranch;
    @OneToMany(mappedBy="organization")
    private Set<BenefitQuestions> benefitQuestions;
    @OneToMany(mappedBy="organization")
    private Set<Brand> brand;
    @OneToMany(mappedBy="organization")
    private Set<CashbackPaymentPref> cashbackPaymentPref;
    @OneToMany(mappedBy="organization")
    private Set<Clients> clients;
    @OneToMany(mappedBy="organization")
    private Set<CardTypeGrp> cardTypeGrp;
    @OneToMany(mappedBy="organization")
    private Set<IssuerContact> issuerContact;
    @OneToMany(mappedBy="organization")
    private Set<Issuer> issuer;
    @OneToMany(mappedBy="organization")
    private Set<LovValueOrg> lovValueOrg;
    @OneToMany(mappedBy="organization")
    private Set<VendorOrgDetail> vendorOrgDetail;
    @OneToMany(mappedBy="organization")
    private Set<OrganizationCountry> organizationCountry;
    @OneToMany(mappedBy="organization")
    private Set<OrgLangGrp> orgLangGrp;
    @OneToMany(mappedBy="organization")
    private Set<Package> package_;
    @OneToMany(mappedBy="organization2")
    private Set<Organization> organization3;
    @ManyToOne
    @JoinColumn(name="parent_organization_id")
    private Organization organization2;
    @OneToMany(mappedBy="organization")
    private Set<Product> product;
    @OneToMany(mappedBy="organization")
    private Set<SolicitationTemplate> solicitationTemplate;
    @OneToMany(mappedBy="organization")
    private Set<ThirdPartyOrg> thirdPartyOrg;

    /** Default constructor. */
    public Organization() {
        super();
    }

    /**
     * Access method for organizationId.
     *
     * @return the current value of organizationId
     */
    public BigDecimal getOrganizationId() {
        return organizationId;
    }

    /**
     * Setter method for organizationId.
     *
     * @param aOrganizationId the new value for organizationId
     */
    public void setOrganizationId(BigDecimal aOrganizationId) {
        organizationId = aOrganizationId;
    }

    /**
     * Access method for organizationDesc.
     *
     * @return the current value of organizationDesc
     */
    public String getOrganizationDesc() {
        return organizationDesc;
    }

    /**
     * Setter method for organizationDesc.
     *
     * @param aOrganizationDesc the new value for organizationDesc
     */
    public void setOrganizationDesc(String aOrganizationDesc) {
        organizationDesc = aOrganizationDesc;
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
     * Access method for minimumUtcOffset.
     *
     * @return the current value of minimumUtcOffset
     */
    public BigDecimal getMinimumUtcOffset() {
        return minimumUtcOffset;
    }

    /**
     * Setter method for minimumUtcOffset.
     *
     * @param aMinimumUtcOffset the new value for minimumUtcOffset
     */
    public void setMinimumUtcOffset(BigDecimal aMinimumUtcOffset) {
        minimumUtcOffset = aMinimumUtcOffset;
    }

    /**
     * Access method for maximumUtcOffset.
     *
     * @return the current value of maximumUtcOffset
     */
    public BigDecimal getMaximumUtcOffset() {
        return maximumUtcOffset;
    }

    /**
     * Setter method for maximumUtcOffset.
     *
     * @param aMaximumUtcOffset the new value for maximumUtcOffset
     */
    public void setMaximumUtcOffset(BigDecimal aMaximumUtcOffset) {
        maximumUtcOffset = aMaximumUtcOffset;
    }

    /**
     * Access method for bankBranch.
     *
     * @return the current value of bankBranch
     */
    public Set<BankBranch> getBankBranch() {
        return bankBranch;
    }

    /**
     * Setter method for bankBranch.
     *
     * @param aBankBranch the new value for bankBranch
     */
    public void setBankBranch(Set<BankBranch> aBankBranch) {
        bankBranch = aBankBranch;
    }

    /**
     * Access method for benefitQuestions.
     *
     * @return the current value of benefitQuestions
     */
    public Set<BenefitQuestions> getBenefitQuestions() {
        return benefitQuestions;
    }

    /**
     * Setter method for benefitQuestions.
     *
     * @param aBenefitQuestions the new value for benefitQuestions
     */
    public void setBenefitQuestions(Set<BenefitQuestions> aBenefitQuestions) {
        benefitQuestions = aBenefitQuestions;
    }

    /**
     * Access method for brand.
     *
     * @return the current value of brand
     */
    public Set<Brand> getBrand() {
        return brand;
    }

    /**
     * Setter method for brand.
     *
     * @param aBrand the new value for brand
     */
    public void setBrand(Set<Brand> aBrand) {
        brand = aBrand;
    }

    /**
     * Access method for cashbackPaymentPref.
     *
     * @return the current value of cashbackPaymentPref
     */
    public Set<CashbackPaymentPref> getCashbackPaymentPref() {
        return cashbackPaymentPref;
    }

    /**
     * Setter method for cashbackPaymentPref.
     *
     * @param aCashbackPaymentPref the new value for cashbackPaymentPref
     */
    public void setCashbackPaymentPref(Set<CashbackPaymentPref> aCashbackPaymentPref) {
        cashbackPaymentPref = aCashbackPaymentPref;
    }

    /**
     * Access method for clients.
     *
     * @return the current value of clients
     */
    public Set<Clients> getClients() {
        return clients;
    }

    /**
     * Setter method for clients.
     *
     * @param aClients the new value for clients
     */
    public void setClients(Set<Clients> aClients) {
        clients = aClients;
    }

    /**
     * Access method for cardTypeGrp.
     *
     * @return the current value of cardTypeGrp
     */
    public Set<CardTypeGrp> getCardTypeGrp() {
        return cardTypeGrp;
    }

    /**
     * Setter method for cardTypeGrp.
     *
     * @param aCardTypeGrp the new value for cardTypeGrp
     */
    public void setCardTypeGrp(Set<CardTypeGrp> aCardTypeGrp) {
        cardTypeGrp = aCardTypeGrp;
    }

    /**
     * Access method for issuerContact.
     *
     * @return the current value of issuerContact
     */
    public Set<IssuerContact> getIssuerContact() {
        return issuerContact;
    }

    /**
     * Setter method for issuerContact.
     *
     * @param aIssuerContact the new value for issuerContact
     */
    public void setIssuerContact(Set<IssuerContact> aIssuerContact) {
        issuerContact = aIssuerContact;
    }

    /**
     * Access method for issuer.
     *
     * @return the current value of issuer
     */
    public Set<Issuer> getIssuer() {
        return issuer;
    }

    /**
     * Setter method for issuer.
     *
     * @param aIssuer the new value for issuer
     */
    public void setIssuer(Set<Issuer> aIssuer) {
        issuer = aIssuer;
    }

    /**
     * Access method for lovValueOrg.
     *
     * @return the current value of lovValueOrg
     */
    public Set<LovValueOrg> getLovValueOrg() {
        return lovValueOrg;
    }

    /**
     * Setter method for lovValueOrg.
     *
     * @param aLovValueOrg the new value for lovValueOrg
     */
    public void setLovValueOrg(Set<LovValueOrg> aLovValueOrg) {
        lovValueOrg = aLovValueOrg;
    }

    /**
     * Access method for vendorOrgDetail.
     *
     * @return the current value of vendorOrgDetail
     */
    public Set<VendorOrgDetail> getVendorOrgDetail() {
        return vendorOrgDetail;
    }

    /**
     * Setter method for vendorOrgDetail.
     *
     * @param aVendorOrgDetail the new value for vendorOrgDetail
     */
    public void setVendorOrgDetail(Set<VendorOrgDetail> aVendorOrgDetail) {
        vendorOrgDetail = aVendorOrgDetail;
    }

    /**
     * Access method for organizationCountry.
     *
     * @return the current value of organizationCountry
     */
    public Set<OrganizationCountry> getOrganizationCountry() {
        return organizationCountry;
    }

    /**
     * Setter method for organizationCountry.
     *
     * @param aOrganizationCountry the new value for organizationCountry
     */
    public void setOrganizationCountry(Set<OrganizationCountry> aOrganizationCountry) {
        organizationCountry = aOrganizationCountry;
    }

    /**
     * Access method for orgLangGrp.
     *
     * @return the current value of orgLangGrp
     */
    public Set<OrgLangGrp> getOrgLangGrp() {
        return orgLangGrp;
    }

    /**
     * Setter method for orgLangGrp.
     *
     * @param aOrgLangGrp the new value for orgLangGrp
     */
    public void setOrgLangGrp(Set<OrgLangGrp> aOrgLangGrp) {
        orgLangGrp = aOrgLangGrp;
    }

    /**
     * Access method for package_.
     *
     * @return the current value of package_
     */
    public Set<Package> getPackage_() {
        return package_;
    }

    /**
     * Setter method for package_.
     *
     * @param aPackage_ the new value for package_
     */
    public void setPackage_(Set<Package> aPackage_) {
        package_ = aPackage_;
    }

    /**
     * Access method for organization3.
     *
     * @return the current value of organization3
     */
    public Set<Organization> getOrganization3() {
        return organization3;
    }

    /**
     * Setter method for organization3.
     *
     * @param aOrganization3 the new value for organization3
     */
    public void setOrganization3(Set<Organization> aOrganization3) {
        organization3 = aOrganization3;
    }

    /**
     * Access method for organization2.
     *
     * @return the current value of organization2
     */
    public Organization getOrganization2() {
        return organization2;
    }

    /**
     * Setter method for organization2.
     *
     * @param aOrganization2 the new value for organization2
     */
    public void setOrganization2(Organization aOrganization2) {
        organization2 = aOrganization2;
    }

    /**
     * Access method for product.
     *
     * @return the current value of product
     */
    public Set<Product> getProduct() {
        return product;
    }

    /**
     * Setter method for product.
     *
     * @param aProduct the new value for product
     */
    public void setProduct(Set<Product> aProduct) {
        product = aProduct;
    }

    /**
     * Access method for solicitationTemplate.
     *
     * @return the current value of solicitationTemplate
     */
    public Set<SolicitationTemplate> getSolicitationTemplate() {
        return solicitationTemplate;
    }

    /**
     * Setter method for solicitationTemplate.
     *
     * @param aSolicitationTemplate the new value for solicitationTemplate
     */
    public void setSolicitationTemplate(Set<SolicitationTemplate> aSolicitationTemplate) {
        solicitationTemplate = aSolicitationTemplate;
    }

    /**
     * Access method for thirdPartyOrg.
     *
     * @return the current value of thirdPartyOrg
     */
    public Set<ThirdPartyOrg> getThirdPartyOrg() {
        return thirdPartyOrg;
    }

    /**
     * Setter method for thirdPartyOrg.
     *
     * @param aThirdPartyOrg the new value for thirdPartyOrg
     */
    public void setThirdPartyOrg(Set<ThirdPartyOrg> aThirdPartyOrg) {
        thirdPartyOrg = aThirdPartyOrg;
    }

    /**
     * Compares the key for this instance with another Organization.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Organization and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Organization)) {
            return false;
        }
        Organization that = (Organization) other;
        Object myOrganizationId = this.getOrganizationId();
        Object yourOrganizationId = that.getOrganizationId();
        if (myOrganizationId==null ? yourOrganizationId!=null : !myOrganizationId.equals(yourOrganizationId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Organization.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Organization)) return false;
        return this.equalKeys(other) && ((Organization)other).equalKeys(this);
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
        if (getOrganizationId() == null) {
            i = 0;
        } else {
            i = getOrganizationId().hashCode();
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
        StringBuffer sb = new StringBuffer("[Organization |");
        sb.append(" organizationId=").append(getOrganizationId());
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
        ret.put("organizationId", getOrganizationId());
        return ret;
    }

}
