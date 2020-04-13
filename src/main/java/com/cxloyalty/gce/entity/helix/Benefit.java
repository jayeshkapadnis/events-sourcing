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

@Entity(name="benefit")
public class Benefit implements Serializable {

    /** Primary key. */
    protected static final String PK = "benId";

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
    @Column(name="ben_id", unique=true, nullable=false, precision=16)
    private BigDecimal benId;
    @Column(name="ben_name", nullable=false, length=100)
    private String benName;
    @Column(name="link_url", length=60)
    private String linkUrl;
    @Column(name="link_faq", length=60)
    private String linkFaq;
    @Column(name="link_tos", length=60)
    private String linkTos;
    @Column(name="link_desc", length=80)
    private String linkDesc;
    @Column(name="image_path", length=100)
    private String imagePath;
    @Column(name="short_desc", nullable=false, length=500)
    private String shortDesc;
    @Column(name="long_desc", nullable=false, length=2000)
    private String longDesc;
    @Column(name="user_created", nullable=false, length=30)
    private String userCreated;
    @Column(name="date_created")
    private Timestamp dateCreated;
    @Column(name="user_modified", length=30)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @Column(name="ben_reference_name", length=200)
    private String benReferenceName;
    @Column(name="external_reference_name", length=200)
    private String externalReferenceName;
    @Column(name="benefit_contract_desc", length=400)
    private String benefitContractDesc;
    @OneToMany(mappedBy="benefit")
    private Set<BenefitAttribute> benefitAttribute;
    @ManyToOne
    @JoinColumn(name="benefit_type_id")
    private BenefitType benefitType;
    @OneToMany(mappedBy="benefit")
    private Set<BenefitQuestions> benefitQuestions;
    @OneToMany(mappedBy="benefit")
    private Set<BenefitRule> benefitRule;
    @OneToMany(mappedBy="benefit")
    private Set<BenefitPackage> benefitPackage;
    @OneToMany(mappedBy="benefit")
    private Set<BenefitVendorXref> benefitVendorXref;
    @OneToMany(mappedBy="benefit")
    private Set<LegacyBenefitXref> legacyBenefitXref;
    @OneToMany(mappedBy="benefit")
    private Set<LovValueBenefit> lovValueBenefit;
    @OneToMany(mappedBy="benefit")
    private Set<UpOfferDetail> upOfferDetail;

    /** Default constructor. */
    public Benefit() {
        super();
    }

    /**
     * Access method for benId.
     *
     * @return the current value of benId
     */
    public BigDecimal getBenId() {
        return benId;
    }

    /**
     * Setter method for benId.
     *
     * @param aBenId the new value for benId
     */
    public void setBenId(BigDecimal aBenId) {
        benId = aBenId;
    }

    /**
     * Access method for benName.
     *
     * @return the current value of benName
     */
    public String getBenName() {
        return benName;
    }

    /**
     * Setter method for benName.
     *
     * @param aBenName the new value for benName
     */
    public void setBenName(String aBenName) {
        benName = aBenName;
    }

    /**
     * Access method for linkUrl.
     *
     * @return the current value of linkUrl
     */
    public String getLinkUrl() {
        return linkUrl;
    }

    /**
     * Setter method for linkUrl.
     *
     * @param aLinkUrl the new value for linkUrl
     */
    public void setLinkUrl(String aLinkUrl) {
        linkUrl = aLinkUrl;
    }

    /**
     * Access method for linkFaq.
     *
     * @return the current value of linkFaq
     */
    public String getLinkFaq() {
        return linkFaq;
    }

    /**
     * Setter method for linkFaq.
     *
     * @param aLinkFaq the new value for linkFaq
     */
    public void setLinkFaq(String aLinkFaq) {
        linkFaq = aLinkFaq;
    }

    /**
     * Access method for linkTos.
     *
     * @return the current value of linkTos
     */
    public String getLinkTos() {
        return linkTos;
    }

    /**
     * Setter method for linkTos.
     *
     * @param aLinkTos the new value for linkTos
     */
    public void setLinkTos(String aLinkTos) {
        linkTos = aLinkTos;
    }

    /**
     * Access method for linkDesc.
     *
     * @return the current value of linkDesc
     */
    public String getLinkDesc() {
        return linkDesc;
    }

    /**
     * Setter method for linkDesc.
     *
     * @param aLinkDesc the new value for linkDesc
     */
    public void setLinkDesc(String aLinkDesc) {
        linkDesc = aLinkDesc;
    }

    /**
     * Access method for imagePath.
     *
     * @return the current value of imagePath
     */
    public String getImagePath() {
        return imagePath;
    }

    /**
     * Setter method for imagePath.
     *
     * @param aImagePath the new value for imagePath
     */
    public void setImagePath(String aImagePath) {
        imagePath = aImagePath;
    }

    /**
     * Access method for shortDesc.
     *
     * @return the current value of shortDesc
     */
    public String getShortDesc() {
        return shortDesc;
    }

    /**
     * Setter method for shortDesc.
     *
     * @param aShortDesc the new value for shortDesc
     */
    public void setShortDesc(String aShortDesc) {
        shortDesc = aShortDesc;
    }

    /**
     * Access method for longDesc.
     *
     * @return the current value of longDesc
     */
    public String getLongDesc() {
        return longDesc;
    }

    /**
     * Setter method for longDesc.
     *
     * @param aLongDesc the new value for longDesc
     */
    public void setLongDesc(String aLongDesc) {
        longDesc = aLongDesc;
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
     * Access method for benReferenceName.
     *
     * @return the current value of benReferenceName
     */
    public String getBenReferenceName() {
        return benReferenceName;
    }

    /**
     * Setter method for benReferenceName.
     *
     * @param aBenReferenceName the new value for benReferenceName
     */
    public void setBenReferenceName(String aBenReferenceName) {
        benReferenceName = aBenReferenceName;
    }

    /**
     * Access method for externalReferenceName.
     *
     * @return the current value of externalReferenceName
     */
    public String getExternalReferenceName() {
        return externalReferenceName;
    }

    /**
     * Setter method for externalReferenceName.
     *
     * @param aExternalReferenceName the new value for externalReferenceName
     */
    public void setExternalReferenceName(String aExternalReferenceName) {
        externalReferenceName = aExternalReferenceName;
    }

    /**
     * Access method for benefitContractDesc.
     *
     * @return the current value of benefitContractDesc
     */
    public String getBenefitContractDesc() {
        return benefitContractDesc;
    }

    /**
     * Setter method for benefitContractDesc.
     *
     * @param aBenefitContractDesc the new value for benefitContractDesc
     */
    public void setBenefitContractDesc(String aBenefitContractDesc) {
        benefitContractDesc = aBenefitContractDesc;
    }

    /**
     * Access method for benefitAttribute.
     *
     * @return the current value of benefitAttribute
     */
    public Set<BenefitAttribute> getBenefitAttribute() {
        return benefitAttribute;
    }

    /**
     * Setter method for benefitAttribute.
     *
     * @param aBenefitAttribute the new value for benefitAttribute
     */
    public void setBenefitAttribute(Set<BenefitAttribute> aBenefitAttribute) {
        benefitAttribute = aBenefitAttribute;
    }

    /**
     * Access method for benefitType.
     *
     * @return the current value of benefitType
     */
    public BenefitType getBenefitType() {
        return benefitType;
    }

    /**
     * Setter method for benefitType.
     *
     * @param aBenefitType the new value for benefitType
     */
    public void setBenefitType(BenefitType aBenefitType) {
        benefitType = aBenefitType;
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
     * Access method for benefitVendorXref.
     *
     * @return the current value of benefitVendorXref
     */
    public Set<BenefitVendorXref> getBenefitVendorXref() {
        return benefitVendorXref;
    }

    /**
     * Setter method for benefitVendorXref.
     *
     * @param aBenefitVendorXref the new value for benefitVendorXref
     */
    public void setBenefitVendorXref(Set<BenefitVendorXref> aBenefitVendorXref) {
        benefitVendorXref = aBenefitVendorXref;
    }

    /**
     * Access method for legacyBenefitXref.
     *
     * @return the current value of legacyBenefitXref
     */
    public Set<LegacyBenefitXref> getLegacyBenefitXref() {
        return legacyBenefitXref;
    }

    /**
     * Setter method for legacyBenefitXref.
     *
     * @param aLegacyBenefitXref the new value for legacyBenefitXref
     */
    public void setLegacyBenefitXref(Set<LegacyBenefitXref> aLegacyBenefitXref) {
        legacyBenefitXref = aLegacyBenefitXref;
    }

    /**
     * Access method for lovValueBenefit.
     *
     * @return the current value of lovValueBenefit
     */
    public Set<LovValueBenefit> getLovValueBenefit() {
        return lovValueBenefit;
    }

    /**
     * Setter method for lovValueBenefit.
     *
     * @param aLovValueBenefit the new value for lovValueBenefit
     */
    public void setLovValueBenefit(Set<LovValueBenefit> aLovValueBenefit) {
        lovValueBenefit = aLovValueBenefit;
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
     * Compares the key for this instance with another Benefit.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Benefit and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Benefit)) {
            return false;
        }
        Benefit that = (Benefit) other;
        Object myBenId = this.getBenId();
        Object yourBenId = that.getBenId();
        if (myBenId==null ? yourBenId!=null : !myBenId.equals(yourBenId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Benefit.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Benefit)) return false;
        return this.equalKeys(other) && ((Benefit)other).equalKeys(this);
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
        if (getBenId() == null) {
            i = 0;
        } else {
            i = getBenId().hashCode();
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
        StringBuffer sb = new StringBuffer("[Benefit |");
        sb.append(" benId=").append(getBenId());
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
        ret.put("benId", getBenId());
        return ret;
    }

}
