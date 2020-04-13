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

@Entity(name="package")
public class Package implements Serializable {

    /** Primary key. */
    protected static final String PK = "pkgId";

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
    @Column(name="pkg_id", unique=true, nullable=false, precision=16)
    private BigDecimal pkgId;
    @Column(name="pkg_name", nullable=false, length=100)
    private String pkgName;
    @Column(name="user_created", nullable=false, length=30)
    private String userCreated;
    @Column(name="date_created")
    private Timestamp dateCreated;
    @Column(name="user_modified", length=30)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @Column(name="intro_html_path", length=60)
    private String introHtmlPath;
    @Column(name="email_copy", length=1000)
    private String emailCopy;
    @Column(name="data_owner", length=100)
    private String dataOwner;
    @Column(length=30)
    private String abbreviation;
    @Column(length=300)
    private String description;
    @Column(name="pkg_reference_name", length=200)
    private String pkgReferenceName;
    @Column(name="flex_ben_allowed_flag", length=1)
    private String flexBenAllowedFlag;
    @Column(name="no_of_days_tc_renewal", precision=10)
    private BigDecimal noOfDaysTcRenewal;
    @Column(name="email_ovrrd_flg", length=1)
    private String emailOvrrdFlg;
    @Column(name="num_flexible_child_pkg_allowed", precision=9)
    private BigDecimal numFlexibleChildPkgAllowed;
    @Column(name="num_flexible_ben_allowed", precision=9)
    private BigDecimal numFlexibleBenAllowed;
    @Column(name="external_pkg_reference_name", length=200)
    private String externalPkgReferenceName;
    @Column(name="min_flexible_child_pkg_allowed", precision=9)
    private BigDecimal minFlexibleChildPkgAllowed;
    @Column(name="min_flexible_ben_allowed", precision=9)
    private BigDecimal minFlexibleBenAllowed;
    @Column(name="switch_hardletter_correspond", length=1)
    private String switchHardletterCorrespond;
    @Column(name="pkg_type_name", length=100)
    private String pkgTypeName;
    @Column(name="restricted_country_group_desc", length=100)
    private String restrictedCountryGroupDesc;
    @OneToMany(mappedBy="package_")
    private Set<BenefitRule> benefitRule;
    @OneToMany(mappedBy="package_")
    private Set<BenefitPackage> benefitPackage;
    @OneToMany(mappedBy="package_")
    private Set<Brand> brand;
    @OneToMany(mappedBy="package_2")
    private Set<Brand> brand2;
    @OneToMany(mappedBy="package_")
    private Set<ClientPackage> clientPackage;
    @ManyToOne
    @JoinColumn(name="client_id")
    private Clients clients;
    @OneToMany(mappedBy="package_2")
    private Set<FlexibleChildPackage> flexibleChildPackage2;
    @OneToMany(mappedBy="package_")
    private Set<FlexibleChildPackage> flexibleChildPackage;
    @OneToMany(mappedBy="package_")
    private Set<BenefitPackageBundle> benefitPackageBundle;
    @ManyToOne
    @JoinColumn(name="organization_id")
    private Organization organization;
    @OneToMany(mappedBy="package_")
    private Set<PackageAttribute> packageAttribute;
    @ManyToOne
    @JoinColumn(name="benefit_selection_type_id")
    private BenefitSelectionType benefitSelectionType;
    @OneToMany(mappedBy="package_")
    private Set<PackagePdefXref> packagePdefXref;
    @OneToMany(mappedBy="package_")
    private Set<PackageUpPaymentMethod> packageUpPaymentMethod;
    @OneToMany(mappedBy="package_")
    private Set<RelatedPackage> relatedPackage;
    @OneToMany(mappedBy="package_")
    private Set<Solicitation> solicitation;
    @OneToMany(mappedBy="package_2")
    private Set<Solicitation> solicitation2;
    @OneToMany(mappedBy="package_")
    private Set<UpOfferDetail> upOfferDetail;
    @OneToMany(mappedBy="package_")
    private Set<UpOffer> upOffer;

    /** Default constructor. */
    public Package() {
        super();
    }

    /**
     * Access method for pkgId.
     *
     * @return the current value of pkgId
     */
    public BigDecimal getPkgId() {
        return pkgId;
    }

    /**
     * Setter method for pkgId.
     *
     * @param aPkgId the new value for pkgId
     */
    public void setPkgId(BigDecimal aPkgId) {
        pkgId = aPkgId;
    }

    /**
     * Access method for pkgName.
     *
     * @return the current value of pkgName
     */
    public String getPkgName() {
        return pkgName;
    }

    /**
     * Setter method for pkgName.
     *
     * @param aPkgName the new value for pkgName
     */
    public void setPkgName(String aPkgName) {
        pkgName = aPkgName;
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
     * Access method for introHtmlPath.
     *
     * @return the current value of introHtmlPath
     */
    public String getIntroHtmlPath() {
        return introHtmlPath;
    }

    /**
     * Setter method for introHtmlPath.
     *
     * @param aIntroHtmlPath the new value for introHtmlPath
     */
    public void setIntroHtmlPath(String aIntroHtmlPath) {
        introHtmlPath = aIntroHtmlPath;
    }

    /**
     * Access method for emailCopy.
     *
     * @return the current value of emailCopy
     */
    public String getEmailCopy() {
        return emailCopy;
    }

    /**
     * Setter method for emailCopy.
     *
     * @param aEmailCopy the new value for emailCopy
     */
    public void setEmailCopy(String aEmailCopy) {
        emailCopy = aEmailCopy;
    }

    /**
     * Access method for dataOwner.
     *
     * @return the current value of dataOwner
     */
    public String getDataOwner() {
        return dataOwner;
    }

    /**
     * Setter method for dataOwner.
     *
     * @param aDataOwner the new value for dataOwner
     */
    public void setDataOwner(String aDataOwner) {
        dataOwner = aDataOwner;
    }

    /**
     * Access method for abbreviation.
     *
     * @return the current value of abbreviation
     */
    public String getAbbreviation() {
        return abbreviation;
    }

    /**
     * Setter method for abbreviation.
     *
     * @param aAbbreviation the new value for abbreviation
     */
    public void setAbbreviation(String aAbbreviation) {
        abbreviation = aAbbreviation;
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
     * Access method for pkgReferenceName.
     *
     * @return the current value of pkgReferenceName
     */
    public String getPkgReferenceName() {
        return pkgReferenceName;
    }

    /**
     * Setter method for pkgReferenceName.
     *
     * @param aPkgReferenceName the new value for pkgReferenceName
     */
    public void setPkgReferenceName(String aPkgReferenceName) {
        pkgReferenceName = aPkgReferenceName;
    }

    /**
     * Access method for flexBenAllowedFlag.
     *
     * @return the current value of flexBenAllowedFlag
     */
    public String getFlexBenAllowedFlag() {
        return flexBenAllowedFlag;
    }

    /**
     * Setter method for flexBenAllowedFlag.
     *
     * @param aFlexBenAllowedFlag the new value for flexBenAllowedFlag
     */
    public void setFlexBenAllowedFlag(String aFlexBenAllowedFlag) {
        flexBenAllowedFlag = aFlexBenAllowedFlag;
    }

    /**
     * Access method for noOfDaysTcRenewal.
     *
     * @return the current value of noOfDaysTcRenewal
     */
    public BigDecimal getNoOfDaysTcRenewal() {
        return noOfDaysTcRenewal;
    }

    /**
     * Setter method for noOfDaysTcRenewal.
     *
     * @param aNoOfDaysTcRenewal the new value for noOfDaysTcRenewal
     */
    public void setNoOfDaysTcRenewal(BigDecimal aNoOfDaysTcRenewal) {
        noOfDaysTcRenewal = aNoOfDaysTcRenewal;
    }

    /**
     * Access method for emailOvrrdFlg.
     *
     * @return the current value of emailOvrrdFlg
     */
    public String getEmailOvrrdFlg() {
        return emailOvrrdFlg;
    }

    /**
     * Setter method for emailOvrrdFlg.
     *
     * @param aEmailOvrrdFlg the new value for emailOvrrdFlg
     */
    public void setEmailOvrrdFlg(String aEmailOvrrdFlg) {
        emailOvrrdFlg = aEmailOvrrdFlg;
    }

    /**
     * Access method for numFlexibleChildPkgAllowed.
     *
     * @return the current value of numFlexibleChildPkgAllowed
     */
    public BigDecimal getNumFlexibleChildPkgAllowed() {
        return numFlexibleChildPkgAllowed;
    }

    /**
     * Setter method for numFlexibleChildPkgAllowed.
     *
     * @param aNumFlexibleChildPkgAllowed the new value for numFlexibleChildPkgAllowed
     */
    public void setNumFlexibleChildPkgAllowed(BigDecimal aNumFlexibleChildPkgAllowed) {
        numFlexibleChildPkgAllowed = aNumFlexibleChildPkgAllowed;
    }

    /**
     * Access method for numFlexibleBenAllowed.
     *
     * @return the current value of numFlexibleBenAllowed
     */
    public BigDecimal getNumFlexibleBenAllowed() {
        return numFlexibleBenAllowed;
    }

    /**
     * Setter method for numFlexibleBenAllowed.
     *
     * @param aNumFlexibleBenAllowed the new value for numFlexibleBenAllowed
     */
    public void setNumFlexibleBenAllowed(BigDecimal aNumFlexibleBenAllowed) {
        numFlexibleBenAllowed = aNumFlexibleBenAllowed;
    }

    /**
     * Access method for externalPkgReferenceName.
     *
     * @return the current value of externalPkgReferenceName
     */
    public String getExternalPkgReferenceName() {
        return externalPkgReferenceName;
    }

    /**
     * Setter method for externalPkgReferenceName.
     *
     * @param aExternalPkgReferenceName the new value for externalPkgReferenceName
     */
    public void setExternalPkgReferenceName(String aExternalPkgReferenceName) {
        externalPkgReferenceName = aExternalPkgReferenceName;
    }

    /**
     * Access method for minFlexibleChildPkgAllowed.
     *
     * @return the current value of minFlexibleChildPkgAllowed
     */
    public BigDecimal getMinFlexibleChildPkgAllowed() {
        return minFlexibleChildPkgAllowed;
    }

    /**
     * Setter method for minFlexibleChildPkgAllowed.
     *
     * @param aMinFlexibleChildPkgAllowed the new value for minFlexibleChildPkgAllowed
     */
    public void setMinFlexibleChildPkgAllowed(BigDecimal aMinFlexibleChildPkgAllowed) {
        minFlexibleChildPkgAllowed = aMinFlexibleChildPkgAllowed;
    }

    /**
     * Access method for minFlexibleBenAllowed.
     *
     * @return the current value of minFlexibleBenAllowed
     */
    public BigDecimal getMinFlexibleBenAllowed() {
        return minFlexibleBenAllowed;
    }

    /**
     * Setter method for minFlexibleBenAllowed.
     *
     * @param aMinFlexibleBenAllowed the new value for minFlexibleBenAllowed
     */
    public void setMinFlexibleBenAllowed(BigDecimal aMinFlexibleBenAllowed) {
        minFlexibleBenAllowed = aMinFlexibleBenAllowed;
    }

    /**
     * Access method for switchHardletterCorrespond.
     *
     * @return the current value of switchHardletterCorrespond
     */
    public String getSwitchHardletterCorrespond() {
        return switchHardletterCorrespond;
    }

    /**
     * Setter method for switchHardletterCorrespond.
     *
     * @param aSwitchHardletterCorrespond the new value for switchHardletterCorrespond
     */
    public void setSwitchHardletterCorrespond(String aSwitchHardletterCorrespond) {
        switchHardletterCorrespond = aSwitchHardletterCorrespond;
    }

    /**
     * Access method for pkgTypeName.
     *
     * @return the current value of pkgTypeName
     */
    public String getPkgTypeName() {
        return pkgTypeName;
    }

    /**
     * Setter method for pkgTypeName.
     *
     * @param aPkgTypeName the new value for pkgTypeName
     */
    public void setPkgTypeName(String aPkgTypeName) {
        pkgTypeName = aPkgTypeName;
    }

    /**
     * Access method for restrictedCountryGroupDesc.
     *
     * @return the current value of restrictedCountryGroupDesc
     */
    public String getRestrictedCountryGroupDesc() {
        return restrictedCountryGroupDesc;
    }

    /**
     * Setter method for restrictedCountryGroupDesc.
     *
     * @param aRestrictedCountryGroupDesc the new value for restrictedCountryGroupDesc
     */
    public void setRestrictedCountryGroupDesc(String aRestrictedCountryGroupDesc) {
        restrictedCountryGroupDesc = aRestrictedCountryGroupDesc;
    }

    /**
     * Access method for benefitRule.
     *
     * @return the current value of benefitRule
     */
    public Set<BenefitRule> getBenefitRule() {
        return benefitRule;
    }

    /**
     * Setter method for benefitRule.
     *
     * @param aBenefitRule the new value for benefitRule
     */
    public void setBenefitRule(Set<BenefitRule> aBenefitRule) {
        benefitRule = aBenefitRule;
    }

    /**
     * Access method for benefitPackage.
     *
     * @return the current value of benefitPackage
     */
    public Set<BenefitPackage> getBenefitPackage() {
        return benefitPackage;
    }

    /**
     * Setter method for benefitPackage.
     *
     * @param aBenefitPackage the new value for benefitPackage
     */
    public void setBenefitPackage(Set<BenefitPackage> aBenefitPackage) {
        benefitPackage = aBenefitPackage;
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
     * Access method for brand2.
     *
     * @return the current value of brand2
     */
    public Set<Brand> getBrand2() {
        return brand2;
    }

    /**
     * Setter method for brand2.
     *
     * @param aBrand2 the new value for brand2
     */
    public void setBrand2(Set<Brand> aBrand2) {
        brand2 = aBrand2;
    }

    /**
     * Access method for clientPackage.
     *
     * @return the current value of clientPackage
     */
    public Set<ClientPackage> getClientPackage() {
        return clientPackage;
    }

    /**
     * Setter method for clientPackage.
     *
     * @param aClientPackage the new value for clientPackage
     */
    public void setClientPackage(Set<ClientPackage> aClientPackage) {
        clientPackage = aClientPackage;
    }

    /**
     * Access method for clients.
     *
     * @return the current value of clients
     */
    public Clients getClients() {
        return clients;
    }

    /**
     * Setter method for clients.
     *
     * @param aClients the new value for clients
     */
    public void setClients(Clients aClients) {
        clients = aClients;
    }

    /**
     * Access method for flexibleChildPackage2.
     *
     * @return the current value of flexibleChildPackage2
     */
    public Set<FlexibleChildPackage> getFlexibleChildPackage2() {
        return flexibleChildPackage2;
    }

    /**
     * Setter method for flexibleChildPackage2.
     *
     * @param aFlexibleChildPackage2 the new value for flexibleChildPackage2
     */
    public void setFlexibleChildPackage2(Set<FlexibleChildPackage> aFlexibleChildPackage2) {
        flexibleChildPackage2 = aFlexibleChildPackage2;
    }

    /**
     * Access method for flexibleChildPackage.
     *
     * @return the current value of flexibleChildPackage
     */
    public Set<FlexibleChildPackage> getFlexibleChildPackage() {
        return flexibleChildPackage;
    }

    /**
     * Setter method for flexibleChildPackage.
     *
     * @param aFlexibleChildPackage the new value for flexibleChildPackage
     */
    public void setFlexibleChildPackage(Set<FlexibleChildPackage> aFlexibleChildPackage) {
        flexibleChildPackage = aFlexibleChildPackage;
    }

    /**
     * Access method for benefitPackageBundle.
     *
     * @return the current value of benefitPackageBundle
     */
    public Set<BenefitPackageBundle> getBenefitPackageBundle() {
        return benefitPackageBundle;
    }

    /**
     * Setter method for benefitPackageBundle.
     *
     * @param aBenefitPackageBundle the new value for benefitPackageBundle
     */
    public void setBenefitPackageBundle(Set<BenefitPackageBundle> aBenefitPackageBundle) {
        benefitPackageBundle = aBenefitPackageBundle;
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
     * Access method for packageAttribute.
     *
     * @return the current value of packageAttribute
     */
    public Set<PackageAttribute> getPackageAttribute() {
        return packageAttribute;
    }

    /**
     * Setter method for packageAttribute.
     *
     * @param aPackageAttribute the new value for packageAttribute
     */
    public void setPackageAttribute(Set<PackageAttribute> aPackageAttribute) {
        packageAttribute = aPackageAttribute;
    }

    /**
     * Access method for benefitSelectionType.
     *
     * @return the current value of benefitSelectionType
     */
    public BenefitSelectionType getBenefitSelectionType() {
        return benefitSelectionType;
    }

    /**
     * Setter method for benefitSelectionType.
     *
     * @param aBenefitSelectionType the new value for benefitSelectionType
     */
    public void setBenefitSelectionType(BenefitSelectionType aBenefitSelectionType) {
        benefitSelectionType = aBenefitSelectionType;
    }

    /**
     * Access method for packagePdefXref.
     *
     * @return the current value of packagePdefXref
     */
    public Set<PackagePdefXref> getPackagePdefXref() {
        return packagePdefXref;
    }

    /**
     * Setter method for packagePdefXref.
     *
     * @param aPackagePdefXref the new value for packagePdefXref
     */
    public void setPackagePdefXref(Set<PackagePdefXref> aPackagePdefXref) {
        packagePdefXref = aPackagePdefXref;
    }

    /**
     * Access method for packageUpPaymentMethod.
     *
     * @return the current value of packageUpPaymentMethod
     */
    public Set<PackageUpPaymentMethod> getPackageUpPaymentMethod() {
        return packageUpPaymentMethod;
    }

    /**
     * Setter method for packageUpPaymentMethod.
     *
     * @param aPackageUpPaymentMethod the new value for packageUpPaymentMethod
     */
    public void setPackageUpPaymentMethod(Set<PackageUpPaymentMethod> aPackageUpPaymentMethod) {
        packageUpPaymentMethod = aPackageUpPaymentMethod;
    }

    /**
     * Access method for relatedPackage.
     *
     * @return the current value of relatedPackage
     */
    public Set<RelatedPackage> getRelatedPackage() {
        return relatedPackage;
    }

    /**
     * Setter method for relatedPackage.
     *
     * @param aRelatedPackage the new value for relatedPackage
     */
    public void setRelatedPackage(Set<RelatedPackage> aRelatedPackage) {
        relatedPackage = aRelatedPackage;
    }

    /**
     * Access method for solicitation.
     *
     * @return the current value of solicitation
     */
    public Set<Solicitation> getSolicitation() {
        return solicitation;
    }

    /**
     * Setter method for solicitation.
     *
     * @param aSolicitation the new value for solicitation
     */
    public void setSolicitation(Set<Solicitation> aSolicitation) {
        solicitation = aSolicitation;
    }

    /**
     * Access method for solicitation2.
     *
     * @return the current value of solicitation2
     */
    public Set<Solicitation> getSolicitation2() {
        return solicitation2;
    }

    /**
     * Setter method for solicitation2.
     *
     * @param aSolicitation2 the new value for solicitation2
     */
    public void setSolicitation2(Set<Solicitation> aSolicitation2) {
        solicitation2 = aSolicitation2;
    }

    /**
     * Access method for upOfferDetail.
     *
     * @return the current value of upOfferDetail
     */
    public Set<UpOfferDetail> getUpOfferDetail() {
        return upOfferDetail;
    }

    /**
     * Setter method for upOfferDetail.
     *
     * @param aUpOfferDetail the new value for upOfferDetail
     */
    public void setUpOfferDetail(Set<UpOfferDetail> aUpOfferDetail) {
        upOfferDetail = aUpOfferDetail;
    }

    /**
     * Access method for upOffer.
     *
     * @return the current value of upOffer
     */
    public Set<UpOffer> getUpOffer() {
        return upOffer;
    }

    /**
     * Setter method for upOffer.
     *
     * @param aUpOffer the new value for upOffer
     */
    public void setUpOffer(Set<UpOffer> aUpOffer) {
        upOffer = aUpOffer;
    }

    /**
     * Compares the key for this instance with another Package.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Package and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Package)) {
            return false;
        }
        Package that = (Package) other;
        Object myPkgId = this.getPkgId();
        Object yourPkgId = that.getPkgId();
        if (myPkgId==null ? yourPkgId!=null : !myPkgId.equals(yourPkgId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Package.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Package)) return false;
        return this.equalKeys(other) && ((Package)other).equalKeys(this);
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
        if (getPkgId() == null) {
            i = 0;
        } else {
            i = getPkgId().hashCode();
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
        StringBuffer sb = new StringBuffer("[Package |");
        sb.append(" pkgId=").append(getPkgId());
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
        ret.put("pkgId", getPkgId());
        return ret;
    }

}
