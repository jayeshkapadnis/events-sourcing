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

@Entity(name="issuer_contact")
public class IssuerContact implements Serializable {

    /** Primary key. */
    protected static final String PK = "issuerContactSysid";

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
    @Column(name="issuer_contact_sysid", unique=true, nullable=false, precision=9)
    private BigDecimal issuerContactSysid;
    @Column(name="loss_center_name", length=100)
    private String lossCenterName;
    @Column(name="phone_number", length=40)
    private String phoneNumber;
    @Column(name="fax_number", length=40)
    private String faxNumber;
    @Column(name="add_date", nullable=false)
    private Timestamp addDate;
    @Column(name="add_username", nullable=false, length=50)
    private String addUsername;
    @Column(name="update_date", nullable=false)
    private Timestamp updateDate;
    @Column(name="update_username", nullable=false, length=50)
    private String updateUsername;
    @Column(length=500)
    private String comments;
    @Column(name="siebel_id", length=50)
    private String siebelId;
    @Column(name="contact_name", length=50)
    private String contactName;
    @Column(name="email_address", length=100)
    private String emailAddress;
    @ManyToOne
    @JoinColumn(name="language_id")
    private Language language;
    @ManyToOne
    @JoinColumn(name="notification_method_sysid")
    private IssuerNotificationMethod issuerNotificationMethod;
    @ManyToOne
    @JoinColumn(name="region_id")
    private Organization organization;

    /** Default constructor. */
    public IssuerContact() {
        super();
    }

    /**
     * Access method for issuerContactSysid.
     *
     * @return the current value of issuerContactSysid
     */
    public BigDecimal getIssuerContactSysid() {
        return issuerContactSysid;
    }

    /**
     * Setter method for issuerContactSysid.
     *
     * @param aIssuerContactSysid the new value for issuerContactSysid
     */
    public void setIssuerContactSysid(BigDecimal aIssuerContactSysid) {
        issuerContactSysid = aIssuerContactSysid;
    }

    /**
     * Access method for lossCenterName.
     *
     * @return the current value of lossCenterName
     */
    public String getLossCenterName() {
        return lossCenterName;
    }

    /**
     * Setter method for lossCenterName.
     *
     * @param aLossCenterName the new value for lossCenterName
     */
    public void setLossCenterName(String aLossCenterName) {
        lossCenterName = aLossCenterName;
    }

    /**
     * Access method for phoneNumber.
     *
     * @return the current value of phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Setter method for phoneNumber.
     *
     * @param aPhoneNumber the new value for phoneNumber
     */
    public void setPhoneNumber(String aPhoneNumber) {
        phoneNumber = aPhoneNumber;
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
     * Access method for emailAddress.
     *
     * @return the current value of emailAddress
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Setter method for emailAddress.
     *
     * @param aEmailAddress the new value for emailAddress
     */
    public void setEmailAddress(String aEmailAddress) {
        emailAddress = aEmailAddress;
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
     * Compares the key for this instance with another IssuerContact.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class IssuerContact and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof IssuerContact)) {
            return false;
        }
        IssuerContact that = (IssuerContact) other;
        Object myIssuerContactSysid = this.getIssuerContactSysid();
        Object yourIssuerContactSysid = that.getIssuerContactSysid();
        if (myIssuerContactSysid==null ? yourIssuerContactSysid!=null : !myIssuerContactSysid.equals(yourIssuerContactSysid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another IssuerContact.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof IssuerContact)) return false;
        return this.equalKeys(other) && ((IssuerContact)other).equalKeys(this);
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
        if (getIssuerContactSysid() == null) {
            i = 0;
        } else {
            i = getIssuerContactSysid().hashCode();
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
        StringBuffer sb = new StringBuffer("[IssuerContact |");
        sb.append(" issuerContactSysid=").append(getIssuerContactSysid());
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
        ret.put("issuerContactSysid", getIssuerContactSysid());
        return ret;
    }

}
