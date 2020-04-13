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

@Entity(name="site")
public class Site implements Serializable {

    /** Primary key. */
    protected static final String PK = "siteId";

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
    @Column(name="site_id", unique=true, nullable=false, precision=16)
    private BigDecimal siteId;
    @Column(name="site_name", nullable=false, length=50)
    private String siteName;
    @Column(name="site_desc", nullable=false, length=50)
    private String siteDesc;
    @Column(name="domain_url", nullable=false, length=100)
    private String domainUrl;
    @Column(name="bbb_cd", length=50)
    private String bbbCd;
    @Column(name="truste_cd", length=100)
    private String trusteCd;
    @Column(name="verisign_cd", length=50)
    private String verisignCd;
    @Column(name="user_created", nullable=false, length=30)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", nullable=false, length=30)
    private String userModified;
    @Column(name="date_modified", nullable=false)
    private Timestamp dateModified;
    @Column(name="nav_survey_img_path", length=255)
    private String navSurveyImgPath;
    @Column(name="nav_survey_link", length=255)
    private String navSurveyLink;
    @Column(name="nav_banner_img_path", length=255)
    private String navBannerImgPath;
    @Column(name="static_site_fl", nullable=false, precision=1)
    private BigDecimal staticSiteFl;
    @Column(name="product_id", precision=10)
    private BigDecimal productId;
    @Column(name="password_reset_page", length=200)
    private String passwordResetPage;
    @Column(name="sign_in_page", length=200)
    private String signInPage;
    @Column(name="web_enable_page", length=200)
    private String webEnablePage;
    @Column(name="system_origin_name", length=100)
    private String systemOriginName;
    @OneToMany(mappedBy="site")
    private Set<Brand> brand;
    @ManyToOne
    @JoinColumn(name="dflt_source_id")
    private Source source;

    /** Default constructor. */
    public Site() {
        super();
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
     * Access method for siteName.
     *
     * @return the current value of siteName
     */
    public String getSiteName() {
        return siteName;
    }

    /**
     * Setter method for siteName.
     *
     * @param aSiteName the new value for siteName
     */
    public void setSiteName(String aSiteName) {
        siteName = aSiteName;
    }

    /**
     * Access method for siteDesc.
     *
     * @return the current value of siteDesc
     */
    public String getSiteDesc() {
        return siteDesc;
    }

    /**
     * Setter method for siteDesc.
     *
     * @param aSiteDesc the new value for siteDesc
     */
    public void setSiteDesc(String aSiteDesc) {
        siteDesc = aSiteDesc;
    }

    /**
     * Access method for domainUrl.
     *
     * @return the current value of domainUrl
     */
    public String getDomainUrl() {
        return domainUrl;
    }

    /**
     * Setter method for domainUrl.
     *
     * @param aDomainUrl the new value for domainUrl
     */
    public void setDomainUrl(String aDomainUrl) {
        domainUrl = aDomainUrl;
    }

    /**
     * Access method for bbbCd.
     *
     * @return the current value of bbbCd
     */
    public String getBbbCd() {
        return bbbCd;
    }

    /**
     * Setter method for bbbCd.
     *
     * @param aBbbCd the new value for bbbCd
     */
    public void setBbbCd(String aBbbCd) {
        bbbCd = aBbbCd;
    }

    /**
     * Access method for trusteCd.
     *
     * @return the current value of trusteCd
     */
    public String getTrusteCd() {
        return trusteCd;
    }

    /**
     * Setter method for trusteCd.
     *
     * @param aTrusteCd the new value for trusteCd
     */
    public void setTrusteCd(String aTrusteCd) {
        trusteCd = aTrusteCd;
    }

    /**
     * Access method for verisignCd.
     *
     * @return the current value of verisignCd
     */
    public String getVerisignCd() {
        return verisignCd;
    }

    /**
     * Setter method for verisignCd.
     *
     * @param aVerisignCd the new value for verisignCd
     */
    public void setVerisignCd(String aVerisignCd) {
        verisignCd = aVerisignCd;
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
     * Access method for navSurveyImgPath.
     *
     * @return the current value of navSurveyImgPath
     */
    public String getNavSurveyImgPath() {
        return navSurveyImgPath;
    }

    /**
     * Setter method for navSurveyImgPath.
     *
     * @param aNavSurveyImgPath the new value for navSurveyImgPath
     */
    public void setNavSurveyImgPath(String aNavSurveyImgPath) {
        navSurveyImgPath = aNavSurveyImgPath;
    }

    /**
     * Access method for navSurveyLink.
     *
     * @return the current value of navSurveyLink
     */
    public String getNavSurveyLink() {
        return navSurveyLink;
    }

    /**
     * Setter method for navSurveyLink.
     *
     * @param aNavSurveyLink the new value for navSurveyLink
     */
    public void setNavSurveyLink(String aNavSurveyLink) {
        navSurveyLink = aNavSurveyLink;
    }

    /**
     * Access method for navBannerImgPath.
     *
     * @return the current value of navBannerImgPath
     */
    public String getNavBannerImgPath() {
        return navBannerImgPath;
    }

    /**
     * Setter method for navBannerImgPath.
     *
     * @param aNavBannerImgPath the new value for navBannerImgPath
     */
    public void setNavBannerImgPath(String aNavBannerImgPath) {
        navBannerImgPath = aNavBannerImgPath;
    }

    /**
     * Access method for staticSiteFl.
     *
     * @return the current value of staticSiteFl
     */
    public BigDecimal getStaticSiteFl() {
        return staticSiteFl;
    }

    /**
     * Setter method for staticSiteFl.
     *
     * @param aStaticSiteFl the new value for staticSiteFl
     */
    public void setStaticSiteFl(BigDecimal aStaticSiteFl) {
        staticSiteFl = aStaticSiteFl;
    }

    /**
     * Access method for productId.
     *
     * @return the current value of productId
     */
    public BigDecimal getProductId() {
        return productId;
    }

    /**
     * Setter method for productId.
     *
     * @param aProductId the new value for productId
     */
    public void setProductId(BigDecimal aProductId) {
        productId = aProductId;
    }

    /**
     * Access method for passwordResetPage.
     *
     * @return the current value of passwordResetPage
     */
    public String getPasswordResetPage() {
        return passwordResetPage;
    }

    /**
     * Setter method for passwordResetPage.
     *
     * @param aPasswordResetPage the new value for passwordResetPage
     */
    public void setPasswordResetPage(String aPasswordResetPage) {
        passwordResetPage = aPasswordResetPage;
    }

    /**
     * Access method for signInPage.
     *
     * @return the current value of signInPage
     */
    public String getSignInPage() {
        return signInPage;
    }

    /**
     * Setter method for signInPage.
     *
     * @param aSignInPage the new value for signInPage
     */
    public void setSignInPage(String aSignInPage) {
        signInPage = aSignInPage;
    }

    /**
     * Access method for webEnablePage.
     *
     * @return the current value of webEnablePage
     */
    public String getWebEnablePage() {
        return webEnablePage;
    }

    /**
     * Setter method for webEnablePage.
     *
     * @param aWebEnablePage the new value for webEnablePage
     */
    public void setWebEnablePage(String aWebEnablePage) {
        webEnablePage = aWebEnablePage;
    }

    /**
     * Access method for systemOriginName.
     *
     * @return the current value of systemOriginName
     */
    public String getSystemOriginName() {
        return systemOriginName;
    }

    /**
     * Setter method for systemOriginName.
     *
     * @param aSystemOriginName the new value for systemOriginName
     */
    public void setSystemOriginName(String aSystemOriginName) {
        systemOriginName = aSystemOriginName;
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
     * Access method for source.
     *
     * @return the current value of source
     */
    public Source getSource() {
        return source;
    }

    /**
     * Setter method for source.
     *
     * @param aSource the new value for source
     */
    public void setSource(Source aSource) {
        source = aSource;
    }

    /**
     * Compares the key for this instance with another Site.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Site and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Site)) {
            return false;
        }
        Site that = (Site) other;
        Object mySiteId = this.getSiteId();
        Object yourSiteId = that.getSiteId();
        if (mySiteId==null ? yourSiteId!=null : !mySiteId.equals(yourSiteId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Site.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Site)) return false;
        return this.equalKeys(other) && ((Site)other).equalKeys(this);
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
        if (getSiteId() == null) {
            i = 0;
        } else {
            i = getSiteId().hashCode();
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
        StringBuffer sb = new StringBuffer("[Site |");
        sb.append(" siteId=").append(getSiteId());
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
        ret.put("siteId", getSiteId());
        return ret;
    }

}
