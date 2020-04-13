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

@Entity(name="brand")
public class Brand implements Serializable {

    /** Primary key. */
    protected static final String PK = "brnId";

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
    @Column(name="brn_id", unique=true, nullable=false, precision=16)
    private BigDecimal brnId;
    @Column(name="site_framed_fl", precision=1)
    private BigDecimal siteFramedFl;
    @Column(name="brand_name", nullable=false, length=50)
    private String brandName;
    @Column(name="brand_url", length=80)
    private String brandUrl;
    @Column(name="client_url", length=40)
    private String clientUrl;
    @Column(name="product_name", length=50)
    private String productName;
    @Column(name="cust_svc_email", length=60)
    private String custSvcEmail;
    @Column(name="cust_svc_phone", length=20)
    private String custSvcPhone;
    @Column(name="cust_svc_addr", length=100)
    private String custSvcAddr;
    @Column(name="contact_us_email", length=70)
    private String contactUsEmail;
    @Column(name="nav_back_color", length=10)
    private String navBackColor;
    @Column(name="nav_text_color", length=10)
    private String navTextColor;
    @Column(name="headline_text_color", length=10)
    private String headlineTextColor;
    @Column(name="copyright_html_path", length=60)
    private String copyrightHtmlPath;
    @Column(name="trademark_html_path", length=60)
    private String trademarkHtmlPath;
    @Column(name="prod_name_html_path", length=60)
    private String prodNameHtmlPath;
    @Column(name="client_hdr_html_path", length=60)
    private String clientHdrHtmlPath;
    @Column(name="client_ftr_html_path", length=60)
    private String clientFtrHtmlPath;
    @Column(name="client_intro_html_path", length=60)
    private String clientIntroHtmlPath;
    @Column(name="join_now_html_path", length=60)
    private String joinNowHtmlPath;
    @Column(name="cross_sell_html_path", length=60)
    private String crossSellHtmlPath;
    @Column(name="user_created", nullable=false, length=30)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=30)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @Column(name="stylesheet_path", length=255)
    private String stylesheetPath;
    @Column(name="ben_pkg_nav_img_path", length=255)
    private String benPkgNavImgPath;
    @Column(name="ftr_pkg_nav_img_path", length=255)
    private String ftrPkgNavImgPath;
    @Column(name="brand_desc", length=50)
    private String brandDesc;
    @Column(name="cash_back_email", length=60)
    private String cashBackEmail;
    @Column(name="site_home_page_path", length=255)
    private String siteHomePagePath;
    @Column(name="layout_id", precision=10)
    private BigDecimal layoutId;
    @Column(name="branded_site_name", length=100)
    private String brandedSiteName;
    @Column(name="default_site_brand_fl", precision=1)
    private BigDecimal defaultSiteBrandFl;
    @Column(name="home_page_id", precision=76, scale=38)
    private BigDecimal homePageId;
    @Column(name="home_page_layout_id", precision=76, scale=38)
    private BigDecimal homePageLayoutId;
    @Column(name="first_time_home_page_id", precision=76, scale=38)
    private BigDecimal firstTimeHomePageId;
    @Column(name="brand_default_info_id", precision=76, scale=38)
    private BigDecimal brandDefaultInfoId;
    @Column(name="cust_svc_opening_time", length=5)
    private String custSvcOpeningTime;
    @Column(name="cust_svc_closing_time", length=5)
    private String custSvcClosingTime;
    @Column(name="legacy_brand_code", length=20)
    private String legacyBrandCode;
    @Column(name="cust_svc_name", length=100)
    private String custSvcName;
    @Column(name="brand_communication_text", length=125)
    private String brandCommunicationText;
    @Column(name="email_is_username_flag", precision=1)
    private BigDecimal emailIsUsernameFlag;
    @ManyToOne
    @JoinColumn(name="act_id")
    private Account account;
    @ManyToOne
    @JoinColumn(name="def_ben_pkg_id")
    private Package package_;
    @ManyToOne
    @JoinColumn(name="def_ftr_pkg_id")
    private Package package_2;
    @ManyToOne
    @JoinColumn(name="organization_id")
    private Organization organization;
    @ManyToOne
    @JoinColumn(name="site_id")
    private Site site;

    /** Default constructor. */
    public Brand() {
        super();
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
     * Access method for siteFramedFl.
     *
     * @return the current value of siteFramedFl
     */
    public BigDecimal getSiteFramedFl() {
        return siteFramedFl;
    }

    /**
     * Setter method for siteFramedFl.
     *
     * @param aSiteFramedFl the new value for siteFramedFl
     */
    public void setSiteFramedFl(BigDecimal aSiteFramedFl) {
        siteFramedFl = aSiteFramedFl;
    }

    /**
     * Access method for brandName.
     *
     * @return the current value of brandName
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * Setter method for brandName.
     *
     * @param aBrandName the new value for brandName
     */
    public void setBrandName(String aBrandName) {
        brandName = aBrandName;
    }

    /**
     * Access method for brandUrl.
     *
     * @return the current value of brandUrl
     */
    public String getBrandUrl() {
        return brandUrl;
    }

    /**
     * Setter method for brandUrl.
     *
     * @param aBrandUrl the new value for brandUrl
     */
    public void setBrandUrl(String aBrandUrl) {
        brandUrl = aBrandUrl;
    }

    /**
     * Access method for clientUrl.
     *
     * @return the current value of clientUrl
     */
    public String getClientUrl() {
        return clientUrl;
    }

    /**
     * Setter method for clientUrl.
     *
     * @param aClientUrl the new value for clientUrl
     */
    public void setClientUrl(String aClientUrl) {
        clientUrl = aClientUrl;
    }

    /**
     * Access method for productName.
     *
     * @return the current value of productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Setter method for productName.
     *
     * @param aProductName the new value for productName
     */
    public void setProductName(String aProductName) {
        productName = aProductName;
    }

    /**
     * Access method for custSvcEmail.
     *
     * @return the current value of custSvcEmail
     */
    public String getCustSvcEmail() {
        return custSvcEmail;
    }

    /**
     * Setter method for custSvcEmail.
     *
     * @param aCustSvcEmail the new value for custSvcEmail
     */
    public void setCustSvcEmail(String aCustSvcEmail) {
        custSvcEmail = aCustSvcEmail;
    }

    /**
     * Access method for custSvcPhone.
     *
     * @return the current value of custSvcPhone
     */
    public String getCustSvcPhone() {
        return custSvcPhone;
    }

    /**
     * Setter method for custSvcPhone.
     *
     * @param aCustSvcPhone the new value for custSvcPhone
     */
    public void setCustSvcPhone(String aCustSvcPhone) {
        custSvcPhone = aCustSvcPhone;
    }

    /**
     * Access method for custSvcAddr.
     *
     * @return the current value of custSvcAddr
     */
    public String getCustSvcAddr() {
        return custSvcAddr;
    }

    /**
     * Setter method for custSvcAddr.
     *
     * @param aCustSvcAddr the new value for custSvcAddr
     */
    public void setCustSvcAddr(String aCustSvcAddr) {
        custSvcAddr = aCustSvcAddr;
    }

    /**
     * Access method for contactUsEmail.
     *
     * @return the current value of contactUsEmail
     */
    public String getContactUsEmail() {
        return contactUsEmail;
    }

    /**
     * Setter method for contactUsEmail.
     *
     * @param aContactUsEmail the new value for contactUsEmail
     */
    public void setContactUsEmail(String aContactUsEmail) {
        contactUsEmail = aContactUsEmail;
    }

    /**
     * Access method for navBackColor.
     *
     * @return the current value of navBackColor
     */
    public String getNavBackColor() {
        return navBackColor;
    }

    /**
     * Setter method for navBackColor.
     *
     * @param aNavBackColor the new value for navBackColor
     */
    public void setNavBackColor(String aNavBackColor) {
        navBackColor = aNavBackColor;
    }

    /**
     * Access method for navTextColor.
     *
     * @return the current value of navTextColor
     */
    public String getNavTextColor() {
        return navTextColor;
    }

    /**
     * Setter method for navTextColor.
     *
     * @param aNavTextColor the new value for navTextColor
     */
    public void setNavTextColor(String aNavTextColor) {
        navTextColor = aNavTextColor;
    }

    /**
     * Access method for headlineTextColor.
     *
     * @return the current value of headlineTextColor
     */
    public String getHeadlineTextColor() {
        return headlineTextColor;
    }

    /**
     * Setter method for headlineTextColor.
     *
     * @param aHeadlineTextColor the new value for headlineTextColor
     */
    public void setHeadlineTextColor(String aHeadlineTextColor) {
        headlineTextColor = aHeadlineTextColor;
    }

    /**
     * Access method for copyrightHtmlPath.
     *
     * @return the current value of copyrightHtmlPath
     */
    public String getCopyrightHtmlPath() {
        return copyrightHtmlPath;
    }

    /**
     * Setter method for copyrightHtmlPath.
     *
     * @param aCopyrightHtmlPath the new value for copyrightHtmlPath
     */
    public void setCopyrightHtmlPath(String aCopyrightHtmlPath) {
        copyrightHtmlPath = aCopyrightHtmlPath;
    }

    /**
     * Access method for trademarkHtmlPath.
     *
     * @return the current value of trademarkHtmlPath
     */
    public String getTrademarkHtmlPath() {
        return trademarkHtmlPath;
    }

    /**
     * Setter method for trademarkHtmlPath.
     *
     * @param aTrademarkHtmlPath the new value for trademarkHtmlPath
     */
    public void setTrademarkHtmlPath(String aTrademarkHtmlPath) {
        trademarkHtmlPath = aTrademarkHtmlPath;
    }

    /**
     * Access method for prodNameHtmlPath.
     *
     * @return the current value of prodNameHtmlPath
     */
    public String getProdNameHtmlPath() {
        return prodNameHtmlPath;
    }

    /**
     * Setter method for prodNameHtmlPath.
     *
     * @param aProdNameHtmlPath the new value for prodNameHtmlPath
     */
    public void setProdNameHtmlPath(String aProdNameHtmlPath) {
        prodNameHtmlPath = aProdNameHtmlPath;
    }

    /**
     * Access method for clientHdrHtmlPath.
     *
     * @return the current value of clientHdrHtmlPath
     */
    public String getClientHdrHtmlPath() {
        return clientHdrHtmlPath;
    }

    /**
     * Setter method for clientHdrHtmlPath.
     *
     * @param aClientHdrHtmlPath the new value for clientHdrHtmlPath
     */
    public void setClientHdrHtmlPath(String aClientHdrHtmlPath) {
        clientHdrHtmlPath = aClientHdrHtmlPath;
    }

    /**
     * Access method for clientFtrHtmlPath.
     *
     * @return the current value of clientFtrHtmlPath
     */
    public String getClientFtrHtmlPath() {
        return clientFtrHtmlPath;
    }

    /**
     * Setter method for clientFtrHtmlPath.
     *
     * @param aClientFtrHtmlPath the new value for clientFtrHtmlPath
     */
    public void setClientFtrHtmlPath(String aClientFtrHtmlPath) {
        clientFtrHtmlPath = aClientFtrHtmlPath;
    }

    /**
     * Access method for clientIntroHtmlPath.
     *
     * @return the current value of clientIntroHtmlPath
     */
    public String getClientIntroHtmlPath() {
        return clientIntroHtmlPath;
    }

    /**
     * Setter method for clientIntroHtmlPath.
     *
     * @param aClientIntroHtmlPath the new value for clientIntroHtmlPath
     */
    public void setClientIntroHtmlPath(String aClientIntroHtmlPath) {
        clientIntroHtmlPath = aClientIntroHtmlPath;
    }

    /**
     * Access method for joinNowHtmlPath.
     *
     * @return the current value of joinNowHtmlPath
     */
    public String getJoinNowHtmlPath() {
        return joinNowHtmlPath;
    }

    /**
     * Setter method for joinNowHtmlPath.
     *
     * @param aJoinNowHtmlPath the new value for joinNowHtmlPath
     */
    public void setJoinNowHtmlPath(String aJoinNowHtmlPath) {
        joinNowHtmlPath = aJoinNowHtmlPath;
    }

    /**
     * Access method for crossSellHtmlPath.
     *
     * @return the current value of crossSellHtmlPath
     */
    public String getCrossSellHtmlPath() {
        return crossSellHtmlPath;
    }

    /**
     * Setter method for crossSellHtmlPath.
     *
     * @param aCrossSellHtmlPath the new value for crossSellHtmlPath
     */
    public void setCrossSellHtmlPath(String aCrossSellHtmlPath) {
        crossSellHtmlPath = aCrossSellHtmlPath;
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
     * Access method for stylesheetPath.
     *
     * @return the current value of stylesheetPath
     */
    public String getStylesheetPath() {
        return stylesheetPath;
    }

    /**
     * Setter method for stylesheetPath.
     *
     * @param aStylesheetPath the new value for stylesheetPath
     */
    public void setStylesheetPath(String aStylesheetPath) {
        stylesheetPath = aStylesheetPath;
    }

    /**
     * Access method for benPkgNavImgPath.
     *
     * @return the current value of benPkgNavImgPath
     */
    public String getBenPkgNavImgPath() {
        return benPkgNavImgPath;
    }

    /**
     * Setter method for benPkgNavImgPath.
     *
     * @param aBenPkgNavImgPath the new value for benPkgNavImgPath
     */
    public void setBenPkgNavImgPath(String aBenPkgNavImgPath) {
        benPkgNavImgPath = aBenPkgNavImgPath;
    }

    /**
     * Access method for ftrPkgNavImgPath.
     *
     * @return the current value of ftrPkgNavImgPath
     */
    public String getFtrPkgNavImgPath() {
        return ftrPkgNavImgPath;
    }

    /**
     * Setter method for ftrPkgNavImgPath.
     *
     * @param aFtrPkgNavImgPath the new value for ftrPkgNavImgPath
     */
    public void setFtrPkgNavImgPath(String aFtrPkgNavImgPath) {
        ftrPkgNavImgPath = aFtrPkgNavImgPath;
    }

    /**
     * Access method for brandDesc.
     *
     * @return the current value of brandDesc
     */
    public String getBrandDesc() {
        return brandDesc;
    }

    /**
     * Setter method for brandDesc.
     *
     * @param aBrandDesc the new value for brandDesc
     */
    public void setBrandDesc(String aBrandDesc) {
        brandDesc = aBrandDesc;
    }

    /**
     * Access method for cashBackEmail.
     *
     * @return the current value of cashBackEmail
     */
    public String getCashBackEmail() {
        return cashBackEmail;
    }

    /**
     * Setter method for cashBackEmail.
     *
     * @param aCashBackEmail the new value for cashBackEmail
     */
    public void setCashBackEmail(String aCashBackEmail) {
        cashBackEmail = aCashBackEmail;
    }

    /**
     * Access method for siteHomePagePath.
     *
     * @return the current value of siteHomePagePath
     */
    public String getSiteHomePagePath() {
        return siteHomePagePath;
    }

    /**
     * Setter method for siteHomePagePath.
     *
     * @param aSiteHomePagePath the new value for siteHomePagePath
     */
    public void setSiteHomePagePath(String aSiteHomePagePath) {
        siteHomePagePath = aSiteHomePagePath;
    }

    /**
     * Access method for layoutId.
     *
     * @return the current value of layoutId
     */
    public BigDecimal getLayoutId() {
        return layoutId;
    }

    /**
     * Setter method for layoutId.
     *
     * @param aLayoutId the new value for layoutId
     */
    public void setLayoutId(BigDecimal aLayoutId) {
        layoutId = aLayoutId;
    }

    /**
     * Access method for brandedSiteName.
     *
     * @return the current value of brandedSiteName
     */
    public String getBrandedSiteName() {
        return brandedSiteName;
    }

    /**
     * Setter method for brandedSiteName.
     *
     * @param aBrandedSiteName the new value for brandedSiteName
     */
    public void setBrandedSiteName(String aBrandedSiteName) {
        brandedSiteName = aBrandedSiteName;
    }

    /**
     * Access method for defaultSiteBrandFl.
     *
     * @return the current value of defaultSiteBrandFl
     */
    public BigDecimal getDefaultSiteBrandFl() {
        return defaultSiteBrandFl;
    }

    /**
     * Setter method for defaultSiteBrandFl.
     *
     * @param aDefaultSiteBrandFl the new value for defaultSiteBrandFl
     */
    public void setDefaultSiteBrandFl(BigDecimal aDefaultSiteBrandFl) {
        defaultSiteBrandFl = aDefaultSiteBrandFl;
    }

    /**
     * Access method for homePageId.
     *
     * @return the current value of homePageId
     */
    public BigDecimal getHomePageId() {
        return homePageId;
    }

    /**
     * Setter method for homePageId.
     *
     * @param aHomePageId the new value for homePageId
     */
    public void setHomePageId(BigDecimal aHomePageId) {
        homePageId = aHomePageId;
    }

    /**
     * Access method for homePageLayoutId.
     *
     * @return the current value of homePageLayoutId
     */
    public BigDecimal getHomePageLayoutId() {
        return homePageLayoutId;
    }

    /**
     * Setter method for homePageLayoutId.
     *
     * @param aHomePageLayoutId the new value for homePageLayoutId
     */
    public void setHomePageLayoutId(BigDecimal aHomePageLayoutId) {
        homePageLayoutId = aHomePageLayoutId;
    }

    /**
     * Access method for firstTimeHomePageId.
     *
     * @return the current value of firstTimeHomePageId
     */
    public BigDecimal getFirstTimeHomePageId() {
        return firstTimeHomePageId;
    }

    /**
     * Setter method for firstTimeHomePageId.
     *
     * @param aFirstTimeHomePageId the new value for firstTimeHomePageId
     */
    public void setFirstTimeHomePageId(BigDecimal aFirstTimeHomePageId) {
        firstTimeHomePageId = aFirstTimeHomePageId;
    }

    /**
     * Access method for brandDefaultInfoId.
     *
     * @return the current value of brandDefaultInfoId
     */
    public BigDecimal getBrandDefaultInfoId() {
        return brandDefaultInfoId;
    }

    /**
     * Setter method for brandDefaultInfoId.
     *
     * @param aBrandDefaultInfoId the new value for brandDefaultInfoId
     */
    public void setBrandDefaultInfoId(BigDecimal aBrandDefaultInfoId) {
        brandDefaultInfoId = aBrandDefaultInfoId;
    }

    /**
     * Access method for custSvcOpeningTime.
     *
     * @return the current value of custSvcOpeningTime
     */
    public String getCustSvcOpeningTime() {
        return custSvcOpeningTime;
    }

    /**
     * Setter method for custSvcOpeningTime.
     *
     * @param aCustSvcOpeningTime the new value for custSvcOpeningTime
     */
    public void setCustSvcOpeningTime(String aCustSvcOpeningTime) {
        custSvcOpeningTime = aCustSvcOpeningTime;
    }

    /**
     * Access method for custSvcClosingTime.
     *
     * @return the current value of custSvcClosingTime
     */
    public String getCustSvcClosingTime() {
        return custSvcClosingTime;
    }

    /**
     * Setter method for custSvcClosingTime.
     *
     * @param aCustSvcClosingTime the new value for custSvcClosingTime
     */
    public void setCustSvcClosingTime(String aCustSvcClosingTime) {
        custSvcClosingTime = aCustSvcClosingTime;
    }

    /**
     * Access method for legacyBrandCode.
     *
     * @return the current value of legacyBrandCode
     */
    public String getLegacyBrandCode() {
        return legacyBrandCode;
    }

    /**
     * Setter method for legacyBrandCode.
     *
     * @param aLegacyBrandCode the new value for legacyBrandCode
     */
    public void setLegacyBrandCode(String aLegacyBrandCode) {
        legacyBrandCode = aLegacyBrandCode;
    }

    /**
     * Access method for custSvcName.
     *
     * @return the current value of custSvcName
     */
    public String getCustSvcName() {
        return custSvcName;
    }

    /**
     * Setter method for custSvcName.
     *
     * @param aCustSvcName the new value for custSvcName
     */
    public void setCustSvcName(String aCustSvcName) {
        custSvcName = aCustSvcName;
    }

    /**
     * Access method for brandCommunicationText.
     *
     * @return the current value of brandCommunicationText
     */
    public String getBrandCommunicationText() {
        return brandCommunicationText;
    }

    /**
     * Setter method for brandCommunicationText.
     *
     * @param aBrandCommunicationText the new value for brandCommunicationText
     */
    public void setBrandCommunicationText(String aBrandCommunicationText) {
        brandCommunicationText = aBrandCommunicationText;
    }

    /**
     * Access method for emailIsUsernameFlag.
     *
     * @return the current value of emailIsUsernameFlag
     */
    public BigDecimal getEmailIsUsernameFlag() {
        return emailIsUsernameFlag;
    }

    /**
     * Setter method for emailIsUsernameFlag.
     *
     * @param aEmailIsUsernameFlag the new value for emailIsUsernameFlag
     */
    public void setEmailIsUsernameFlag(BigDecimal aEmailIsUsernameFlag) {
        emailIsUsernameFlag = aEmailIsUsernameFlag;
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
     * Access method for site.
     *
     * @return the current value of site
     */
    public Site getSite() {
        return site;
    }

    /**
     * Setter method for site.
     *
     * @param aSite the new value for site
     */
    public void setSite(Site aSite) {
        site = aSite;
    }

    /**
     * Compares the key for this instance with another Brand.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Brand and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Brand)) {
            return false;
        }
        Brand that = (Brand) other;
        Object myBrnId = this.getBrnId();
        Object yourBrnId = that.getBrnId();
        if (myBrnId==null ? yourBrnId!=null : !myBrnId.equals(yourBrnId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Brand.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Brand)) return false;
        return this.equalKeys(other) && ((Brand)other).equalKeys(this);
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
        if (getBrnId() == null) {
            i = 0;
        } else {
            i = getBrnId().hashCode();
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
        StringBuffer sb = new StringBuffer("[Brand |");
        sb.append(" brnId=").append(getBrnId());
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
        ret.put("brnId", getBrnId());
        return ret;
    }

}
