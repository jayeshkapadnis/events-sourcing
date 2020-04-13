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

@Entity(name="solicitation")
public class Solicitation implements Serializable {

    /** Primary key. */
    protected static final String PK = "solId";

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
    @Column(name="sol_id", unique=true, nullable=false, precision=10)
    private BigDecimal solId;
    @Column(name="active_fl", nullable=false, precision=1)
    private BigDecimal activeFl;
    @Column(name="sol_desc", nullable=false, length=100)
    private String solDesc;
    @Column(name="redirect_url", length=250)
    private String redirectUrl;
    @Column(name="site_id", precision=10)
    private BigDecimal siteId;
    @Column(name="brn_id", precision=10)
    private BigDecimal brnId;
    @Column(name="user_created", nullable=false, length=30)
    private String userCreated;
    @Column(name="date_created")
    private Timestamp dateCreated;
    @Column(name="user_modified", length=30)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @Column(name="us_only_fl", precision=1)
    private BigDecimal usOnlyFl;
    @Column(name="enroll_process_method_id", precision=10)
    private BigDecimal enrollProcessMethodId;
    @Column(name="xplusone_fl", precision=1)
    private BigDecimal xplusoneFl;
    @Column(name="membership_override_fl", precision=1)
    private BigDecimal membershipOverrideFl;
    @Column(name="discounted_fl", precision=1)
    private BigDecimal discountedFl;
    @Column(name="max_members_per_membership", precision=10)
    private BigDecimal maxMembersPerMembership;
    @Column(name="reinstate_comm_offset_days", precision=10)
    private BigDecimal reinstateCommOffsetDays;
    @Column(name="max_free_days", precision=8)
    private BigDecimal maxFreeDays;
    @Column(name="initial_commsn_rate", precision=22, scale=7)
    private BigDecimal initialCommsnRate;
    @Column(name="renewal_commsn_rate", precision=22, scale=7)
    private BigDecimal renewalCommsnRate;
    @Column(name="sol_type_name", length=100)
    private String solTypeName;
    @OneToMany(mappedBy="solicitation")
    private Set<SolAssociation> solAssociation;
    @OneToMany(mappedBy="solicitation2")
    private Set<SolAssociation> solAssociation2;
    @ManyToOne(optional=false)
    @JoinColumn(name="act_id", nullable=false)
    private Account account;
    @OneToMany(mappedBy="solicitation")
    private Set<SolicitationAttribute> solicitationAttribute;
    @ManyToOne
    @JoinColumn(name="language_id")
    private Language language;
    @ManyToOne
    @JoinColumn(name="ben_pkg_id")
    private Package package_;
    @ManyToOne
    @JoinColumn(name="ftr_pkg_id")
    private Package package_2;
    @OneToMany(mappedBy="solicitation")
    private Set<SolicitationPool> solicitationPool;
    @ManyToOne
    @JoinColumn(name="product_id")
    private Product product;
    @ManyToOne
    @JoinColumn(name="sol_template_id")
    private SolicitationTemplate solicitationTemplate;

    /** Default constructor. */
    public Solicitation() {
        super();
    }

    /**
     * Access method for solId.
     *
     * @return the current value of solId
     */
    public BigDecimal getSolId() {
        return solId;
    }

    /**
     * Setter method for solId.
     *
     * @param aSolId the new value for solId
     */
    public void setSolId(BigDecimal aSolId) {
        solId = aSolId;
    }

    /**
     * Access method for activeFl.
     *
     * @return the current value of activeFl
     */
    public BigDecimal getActiveFl() {
        return activeFl;
    }

    /**
     * Setter method for activeFl.
     *
     * @param aActiveFl the new value for activeFl
     */
    public void setActiveFl(BigDecimal aActiveFl) {
        activeFl = aActiveFl;
    }

    /**
     * Access method for solDesc.
     *
     * @return the current value of solDesc
     */
    public String getSolDesc() {
        return solDesc;
    }

    /**
     * Setter method for solDesc.
     *
     * @param aSolDesc the new value for solDesc
     */
    public void setSolDesc(String aSolDesc) {
        solDesc = aSolDesc;
    }

    /**
     * Access method for redirectUrl.
     *
     * @return the current value of redirectUrl
     */
    public String getRedirectUrl() {
        return redirectUrl;
    }

    /**
     * Setter method for redirectUrl.
     *
     * @param aRedirectUrl the new value for redirectUrl
     */
    public void setRedirectUrl(String aRedirectUrl) {
        redirectUrl = aRedirectUrl;
    }

    /**
     * Access method for siteId.
     *
     * @return the current value of siteId
     */
    public BigDecimal getSiteId() {
        return siteId;
    }

    /**
     * Setter method for siteId.
     *
     * @param aSiteId the new value for siteId
     */
    public void setSiteId(BigDecimal aSiteId) {
        siteId = aSiteId;
    }

    /**
     * Access method for brnId.
     *
     * @return the current value of brnId
     */
    public BigDecimal getBrnId() {
        return brnId;
    }

    /**
     * Setter method for brnId.
     *
     * @param aBrnId the new value for brnId
     */
    public void setBrnId(BigDecimal aBrnId) {
        brnId = aBrnId;
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
     * Access method for usOnlyFl.
     *
     * @return the current value of usOnlyFl
     */
    public BigDecimal getUsOnlyFl() {
        return usOnlyFl;
    }

    /**
     * Setter method for usOnlyFl.
     *
     * @param aUsOnlyFl the new value for usOnlyFl
     */
    public void setUsOnlyFl(BigDecimal aUsOnlyFl) {
        usOnlyFl = aUsOnlyFl;
    }

    /**
     * Access method for enrollProcessMethodId.
     *
     * @return the current value of enrollProcessMethodId
     */
    public BigDecimal getEnrollProcessMethodId() {
        return enrollProcessMethodId;
    }

    /**
     * Setter method for enrollProcessMethodId.
     *
     * @param aEnrollProcessMethodId the new value for enrollProcessMethodId
     */
    public void setEnrollProcessMethodId(BigDecimal aEnrollProcessMethodId) {
        enrollProcessMethodId = aEnrollProcessMethodId;
    }

    /**
     * Access method for xplusoneFl.
     *
     * @return the current value of xplusoneFl
     */
    public BigDecimal getXplusoneFl() {
        return xplusoneFl;
    }

    /**
     * Setter method for xplusoneFl.
     *
     * @param aXplusoneFl the new value for xplusoneFl
     */
    public void setXplusoneFl(BigDecimal aXplusoneFl) {
        xplusoneFl = aXplusoneFl;
    }

    /**
     * Access method for membershipOverrideFl.
     *
     * @return the current value of membershipOverrideFl
     */
    public BigDecimal getMembershipOverrideFl() {
        return membershipOverrideFl;
    }

    /**
     * Setter method for membershipOverrideFl.
     *
     * @param aMembershipOverrideFl the new value for membershipOverrideFl
     */
    public void setMembershipOverrideFl(BigDecimal aMembershipOverrideFl) {
        membershipOverrideFl = aMembershipOverrideFl;
    }

    /**
     * Access method for discountedFl.
     *
     * @return the current value of discountedFl
     */
    public BigDecimal getDiscountedFl() {
        return discountedFl;
    }

    /**
     * Setter method for discountedFl.
     *
     * @param aDiscountedFl the new value for discountedFl
     */
    public void setDiscountedFl(BigDecimal aDiscountedFl) {
        discountedFl = aDiscountedFl;
    }

    /**
     * Access method for maxMembersPerMembership.
     *
     * @return the current value of maxMembersPerMembership
     */
    public BigDecimal getMaxMembersPerMembership() {
        return maxMembersPerMembership;
    }

    /**
     * Setter method for maxMembersPerMembership.
     *
     * @param aMaxMembersPerMembership the new value for maxMembersPerMembership
     */
    public void setMaxMembersPerMembership(BigDecimal aMaxMembersPerMembership) {
        maxMembersPerMembership = aMaxMembersPerMembership;
    }

    /**
     * Access method for reinstateCommOffsetDays.
     *
     * @return the current value of reinstateCommOffsetDays
     */
    public BigDecimal getReinstateCommOffsetDays() {
        return reinstateCommOffsetDays;
    }

    /**
     * Setter method for reinstateCommOffsetDays.
     *
     * @param aReinstateCommOffsetDays the new value for reinstateCommOffsetDays
     */
    public void setReinstateCommOffsetDays(BigDecimal aReinstateCommOffsetDays) {
        reinstateCommOffsetDays = aReinstateCommOffsetDays;
    }

    /**
     * Access method for maxFreeDays.
     *
     * @return the current value of maxFreeDays
     */
    public BigDecimal getMaxFreeDays() {
        return maxFreeDays;
    }

    /**
     * Setter method for maxFreeDays.
     *
     * @param aMaxFreeDays the new value for maxFreeDays
     */
    public void setMaxFreeDays(BigDecimal aMaxFreeDays) {
        maxFreeDays = aMaxFreeDays;
    }

    /**
     * Access method for initialCommsnRate.
     *
     * @return the current value of initialCommsnRate
     */
    public BigDecimal getInitialCommsnRate() {
        return initialCommsnRate;
    }

    /**
     * Setter method for initialCommsnRate.
     *
     * @param aInitialCommsnRate the new value for initialCommsnRate
     */
    public void setInitialCommsnRate(BigDecimal aInitialCommsnRate) {
        initialCommsnRate = aInitialCommsnRate;
    }

    /**
     * Access method for renewalCommsnRate.
     *
     * @return the current value of renewalCommsnRate
     */
    public BigDecimal getRenewalCommsnRate() {
        return renewalCommsnRate;
    }

    /**
     * Setter method for renewalCommsnRate.
     *
     * @param aRenewalCommsnRate the new value for renewalCommsnRate
     */
    public void setRenewalCommsnRate(BigDecimal aRenewalCommsnRate) {
        renewalCommsnRate = aRenewalCommsnRate;
    }

    /**
     * Access method for solTypeName.
     *
     * @return the current value of solTypeName
     */
    public String getSolTypeName() {
        return solTypeName;
    }

    /**
     * Setter method for solTypeName.
     *
     * @param aSolTypeName the new value for solTypeName
     */
    public void setSolTypeName(String aSolTypeName) {
        solTypeName = aSolTypeName;
    }

    /**
     * Access method for solAssociation.
     *
     * @return the current value of solAssociation
     */
    public Set<SolAssociation> getSolAssociation() {
        return solAssociation;
    }

    /**
     * Setter method for solAssociation.
     *
     * @param aSolAssociation the new value for solAssociation
     */
    public void setSolAssociation(Set<SolAssociation> aSolAssociation) {
        solAssociation = aSolAssociation;
    }

    /**
     * Access method for solAssociation2.
     *
     * @return the current value of solAssociation2
     */
    public Set<SolAssociation> getSolAssociation2() {
        return solAssociation2;
    }

    /**
     * Setter method for solAssociation2.
     *
     * @param aSolAssociation2 the new value for solAssociation2
     */
    public void setSolAssociation2(Set<SolAssociation> aSolAssociation2) {
        solAssociation2 = aSolAssociation2;
    }

    /**
     * Access method for account.
     *
     * @return the current value of account
     */
    public Account getAccount() {
        return account;
    }

    /**
     * Setter method for account.
     *
     * @param aAccount the new value for account
     */
    public void setAccount(Account aAccount) {
        account = aAccount;
    }

    /**
     * Access method for solicitationAttribute.
     *
     * @return the current value of solicitationAttribute
     */
    public Set<SolicitationAttribute> getSolicitationAttribute() {
        return solicitationAttribute;
    }

    /**
     * Setter method for solicitationAttribute.
     *
     * @param aSolicitationAttribute the new value for solicitationAttribute
     */
    public void setSolicitationAttribute(Set<SolicitationAttribute> aSolicitationAttribute) {
        solicitationAttribute = aSolicitationAttribute;
    }

    /**
     * Access method for language.
     *
     * @return the current value of language
     */
    public Language getLanguage() {
        return language;
    }

    /**
     * Setter method for language.
     *
     * @param aLanguage the new value for language
     */
    public void setLanguage(Language aLanguage) {
        language = aLanguage;
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
     * Access method for package_2.
     *
     * @return the current value of package_2
     */
    public Package getPackage_2() {
        return package_2;
    }

    /**
     * Setter method for package_2.
     *
     * @param aPackage_2 the new value for package_2
     */
    public void setPackage_2(Package aPackage_2) {
        package_2 = aPackage_2;
    }

    /**
     * Access method for solicitationPool.
     *
     * @return the current value of solicitationPool
     */
    public Set<SolicitationPool> getSolicitationPool() {
        return solicitationPool;
    }

    /**
     * Setter method for solicitationPool.
     *
     * @param aSolicitationPool the new value for solicitationPool
     */
    public void setSolicitationPool(Set<SolicitationPool> aSolicitationPool) {
        solicitationPool = aSolicitationPool;
    }

    /**
     * Access method for product.
     *
     * @return the current value of product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Setter method for product.
     *
     * @param aProduct the new value for product
     */
    public void setProduct(Product aProduct) {
        product = aProduct;
    }

    /**
     * Access method for solicitationTemplate.
     *
     * @return the current value of solicitationTemplate
     */
    public SolicitationTemplate getSolicitationTemplate() {
        return solicitationTemplate;
    }

    /**
     * Setter method for solicitationTemplate.
     *
     * @param aSolicitationTemplate the new value for solicitationTemplate
     */
    public void setSolicitationTemplate(SolicitationTemplate aSolicitationTemplate) {
        solicitationTemplate = aSolicitationTemplate;
    }

    /**
     * Compares the key for this instance with another Solicitation.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Solicitation and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Solicitation)) {
            return false;
        }
        Solicitation that = (Solicitation) other;
        Object mySolId = this.getSolId();
        Object yourSolId = that.getSolId();
        if (mySolId==null ? yourSolId!=null : !mySolId.equals(yourSolId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Solicitation.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Solicitation)) return false;
        return this.equalKeys(other) && ((Solicitation)other).equalKeys(this);
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
        if (getSolId() == null) {
            i = 0;
        } else {
            i = getSolId().hashCode();
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
        StringBuffer sb = new StringBuffer("[Solicitation |");
        sb.append(" solId=").append(getSolId());
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
        ret.put("solId", getSolId());
        return ret;
    }

}
