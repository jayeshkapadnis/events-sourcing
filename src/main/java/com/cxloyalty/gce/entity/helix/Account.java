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

@Entity(name="account")
public class Account implements Serializable {

    /** Primary key. */
    protected static final String PK = "actId";

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
    @Column(name="act_id", unique=true, nullable=false, precision=16)
    private BigDecimal actId;
    @Column(name="act_name", length=100)
    private String actName;
    @Column(name="user_created", nullable=false, length=30)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=30)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @Column(name="act_url", length=250)
    private String actUrl;
    @Column(name="act_admin_name", length=50)
    private String actAdminName;
    @Column(name="ccdatasource_fl", precision=1)
    private BigDecimal ccdatasourceFl;
    @Column(name="account_prefix", length=10)
    private String accountPrefix;
    @Column(name="client_data_own_fl", precision=1)
    private BigDecimal clientDataOwnFl;
    @Column(name="edit_profile_fl", precision=1)
    private BigDecimal editProfileFl;
    @Column(name="unified_secure_pwd_flag", length=1)
    private String unifiedSecurePwdFlag;
    @OneToMany(mappedBy="account")
    private Set<AccountAttribute> accountAttribute;
    @ManyToOne
    @JoinColumn(name="client_id")
    private Clients clients;
    @OneToMany(mappedBy="account")
    private Set<AccountThirdPartyConsent> accountThirdPartyConsent;
    @OneToMany(mappedBy="account")
    private Set<BenefitSelectionWindow> benefitSelectionWindow;
    @OneToMany(mappedBy="account")
    private Set<Brand> brand;
    @OneToMany(mappedBy="account")
    private Set<FlexibleChildPackage> flexibleChildPackage;
    @OneToMany(mappedBy="account")
    private Set<Solicitation> solicitation;
    @OneToMany(mappedBy="account")
    private Set<Source> source;

    /** Default constructor. */
    public Account() {
        super();
    }

    /**
     * Access method for actId.
     *
     * @return the current value of actId
     */
    public BigDecimal getActId() {
        return actId;
    }

    /**
     * Setter method for actId.
     *
     * @param aActId the new value for actId
     */
    public void setActId(BigDecimal aActId) {
        actId = aActId;
    }

    /**
     * Access method for actName.
     *
     * @return the current value of actName
     */
    public String getActName() {
        return actName;
    }

    /**
     * Setter method for actName.
     *
     * @param aActName the new value for actName
     */
    public void setActName(String aActName) {
        actName = aActName;
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
     * Access method for actUrl.
     *
     * @return the current value of actUrl
     */
    public String getActUrl() {
        return actUrl;
    }

    /**
     * Setter method for actUrl.
     *
     * @param aActUrl the new value for actUrl
     */
    public void setActUrl(String aActUrl) {
        actUrl = aActUrl;
    }

    /**
     * Access method for actAdminName.
     *
     * @return the current value of actAdminName
     */
    public String getActAdminName() {
        return actAdminName;
    }

    /**
     * Setter method for actAdminName.
     *
     * @param aActAdminName the new value for actAdminName
     */
    public void setActAdminName(String aActAdminName) {
        actAdminName = aActAdminName;
    }

    /**
     * Access method for ccdatasourceFl.
     *
     * @return the current value of ccdatasourceFl
     */
    public BigDecimal getCcdatasourceFl() {
        return ccdatasourceFl;
    }

    /**
     * Setter method for ccdatasourceFl.
     *
     * @param aCcdatasourceFl the new value for ccdatasourceFl
     */
    public void setCcdatasourceFl(BigDecimal aCcdatasourceFl) {
        ccdatasourceFl = aCcdatasourceFl;
    }

    /**
     * Access method for accountPrefix.
     *
     * @return the current value of accountPrefix
     */
    public String getAccountPrefix() {
        return accountPrefix;
    }

    /**
     * Setter method for accountPrefix.
     *
     * @param aAccountPrefix the new value for accountPrefix
     */
    public void setAccountPrefix(String aAccountPrefix) {
        accountPrefix = aAccountPrefix;
    }

    /**
     * Access method for clientDataOwnFl.
     *
     * @return the current value of clientDataOwnFl
     */
    public BigDecimal getClientDataOwnFl() {
        return clientDataOwnFl;
    }

    /**
     * Setter method for clientDataOwnFl.
     *
     * @param aClientDataOwnFl the new value for clientDataOwnFl
     */
    public void setClientDataOwnFl(BigDecimal aClientDataOwnFl) {
        clientDataOwnFl = aClientDataOwnFl;
    }

    /**
     * Access method for editProfileFl.
     *
     * @return the current value of editProfileFl
     */
    public BigDecimal getEditProfileFl() {
        return editProfileFl;
    }

    /**
     * Setter method for editProfileFl.
     *
     * @param aEditProfileFl the new value for editProfileFl
     */
    public void setEditProfileFl(BigDecimal aEditProfileFl) {
        editProfileFl = aEditProfileFl;
    }

    /**
     * Access method for unifiedSecurePwdFlag.
     *
     * @return the current value of unifiedSecurePwdFlag
     */
    public String getUnifiedSecurePwdFlag() {
        return unifiedSecurePwdFlag;
    }

    /**
     * Setter method for unifiedSecurePwdFlag.
     *
     * @param aUnifiedSecurePwdFlag the new value for unifiedSecurePwdFlag
     */
    public void setUnifiedSecurePwdFlag(String aUnifiedSecurePwdFlag) {
        unifiedSecurePwdFlag = aUnifiedSecurePwdFlag;
    }

    /**
     * Access method for accountAttribute.
     *
     * @return the current value of accountAttribute
     */
    public Set<AccountAttribute> getAccountAttribute() {
        return accountAttribute;
    }

    /**
     * Setter method for accountAttribute.
     *
     * @param aAccountAttribute the new value for accountAttribute
     */
    public void setAccountAttribute(Set<AccountAttribute> aAccountAttribute) {
        accountAttribute = aAccountAttribute;
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
     * Access method for accountThirdPartyConsent.
     *
     * @return the current value of accountThirdPartyConsent
     */
    public Set<AccountThirdPartyConsent> getAccountThirdPartyConsent() {
        return accountThirdPartyConsent;
    }

    /**
     * Setter method for accountThirdPartyConsent.
     *
     * @param aAccountThirdPartyConsent the new value for accountThirdPartyConsent
     */
    public void setAccountThirdPartyConsent(Set<AccountThirdPartyConsent> aAccountThirdPartyConsent) {
        accountThirdPartyConsent = aAccountThirdPartyConsent;
    }

    /**
     * Access method for benefitSelectionWindow.
     *
     * @return the current value of benefitSelectionWindow
     */
    public Set<BenefitSelectionWindow> getBenefitSelectionWindow() {
        return benefitSelectionWindow;
    }

    /**
     * Setter method for benefitSelectionWindow.
     *
     * @param aBenefitSelectionWindow the new value for benefitSelectionWindow
     */
    public void setBenefitSelectionWindow(Set<BenefitSelectionWindow> aBenefitSelectionWindow) {
        benefitSelectionWindow = aBenefitSelectionWindow;
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
     * Access method for source.
     *
     * @return the current value of source
     */
    public Set<Source> getSource() {
        return source;
    }

    /**
     * Setter method for source.
     *
     * @param aSource the new value for source
     */
    public void setSource(Set<Source> aSource) {
        source = aSource;
    }

    /**
     * Compares the key for this instance with another Account.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Account and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Account)) {
            return false;
        }
        Account that = (Account) other;
        Object myActId = this.getActId();
        Object yourActId = that.getActId();
        if (myActId==null ? yourActId!=null : !myActId.equals(yourActId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Account.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Account)) return false;
        return this.equalKeys(other) && ((Account)other).equalKeys(this);
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
        if (getActId() == null) {
            i = 0;
        } else {
            i = getActId().hashCode();
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
        StringBuffer sb = new StringBuffer("[Account |");
        sb.append(" actId=").append(getActId());
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
        ret.put("actId", getActId());
        return ret;
    }

}
