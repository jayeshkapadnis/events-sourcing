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

@Entity(name="clients")
public class Clients implements Serializable {

    /** Primary key. */
    protected static final String PK = "clnClientId";

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
    @Column(name="cln_client_id", unique=true, nullable=false, precision=10)
    private BigDecimal clnClientId;
    @Column(name="cln_name", length=50)
    private String clnName;
    @Column(name="cln_timestamp")
    private Timestamp clnTimestamp;
    @Column(name="cln_billing_description", length=23)
    private String clnBillingDescription;
    @Column(name="wholesale_cancel_allowed_fl", precision=1)
    private BigDecimal wholesaleCancelAllowedFl;
    @Column(name="user_created", nullable=false, length=50)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=50)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @Column(name="client_reference_number", length=100)
    private String clientReferenceNumber;
    @Column(name="source_system", length=50)
    private String sourceSystem;
    @Column(name="effective_date")
    private Timestamp effectiveDate;
    @Column(name="expiration_date")
    private Timestamp expirationDate;
    @Column(name="retention_period", precision=16)
    private BigDecimal retentionPeriod;
    @OneToMany(mappedBy="clients")
    private Set<Account> account;
    @OneToMany(mappedBy="clients")
    private Set<ClientAddress> clientAddress;
    @OneToMany(mappedBy="clients")
    private Set<ClientPackage> clientPackage;
    @OneToMany(mappedBy="clients")
    private Set<ClientSla> clientSla;
    @ManyToOne
    @JoinColumn(name="organization_id")
    private Organization organization;
    @OneToMany(mappedBy="clients")
    private Set<Package> package_;
    @OneToMany(mappedBy="clients")
    private Set<ClientsContact> clientsContact;
    @OneToMany(mappedBy="clients")
    private Set<PartnerClient> partnerClient;
    @OneToMany(mappedBy="clients")
    private Set<PartnerReportingDivClient> partnerReportingDivClient;
    @OneToMany(mappedBy="clients")
    private Set<RelatedPackage> relatedPackage;

    /** Default constructor. */
    public Clients() {
        super();
    }

    /**
     * Access method for clnClientId.
     *
     * @return the current value of clnClientId
     */
    public BigDecimal getClnClientId() {
        return clnClientId;
    }

    /**
     * Setter method for clnClientId.
     *
     * @param aClnClientId the new value for clnClientId
     */
    public void setClnClientId(BigDecimal aClnClientId) {
        clnClientId = aClnClientId;
    }

    /**
     * Access method for clnName.
     *
     * @return the current value of clnName
     */
    public String getClnName() {
        return clnName;
    }

    /**
     * Setter method for clnName.
     *
     * @param aClnName the new value for clnName
     */
    public void setClnName(String aClnName) {
        clnName = aClnName;
    }

    /**
     * Access method for clnTimestamp.
     *
     * @return the current value of clnTimestamp
     */
    public Timestamp getClnTimestamp() {
        return clnTimestamp;
    }

    /**
     * Setter method for clnTimestamp.
     *
     * @param aClnTimestamp the new value for clnTimestamp
     */
    public void setClnTimestamp(Timestamp aClnTimestamp) {
        clnTimestamp = aClnTimestamp;
    }

    /**
     * Access method for clnBillingDescription.
     *
     * @return the current value of clnBillingDescription
     */
    public String getClnBillingDescription() {
        return clnBillingDescription;
    }

    /**
     * Setter method for clnBillingDescription.
     *
     * @param aClnBillingDescription the new value for clnBillingDescription
     */
    public void setClnBillingDescription(String aClnBillingDescription) {
        clnBillingDescription = aClnBillingDescription;
    }

    /**
     * Access method for wholesaleCancelAllowedFl.
     *
     * @return the current value of wholesaleCancelAllowedFl
     */
    public BigDecimal getWholesaleCancelAllowedFl() {
        return wholesaleCancelAllowedFl;
    }

    /**
     * Setter method for wholesaleCancelAllowedFl.
     *
     * @param aWholesaleCancelAllowedFl the new value for wholesaleCancelAllowedFl
     */
    public void setWholesaleCancelAllowedFl(BigDecimal aWholesaleCancelAllowedFl) {
        wholesaleCancelAllowedFl = aWholesaleCancelAllowedFl;
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
     * Access method for clientReferenceNumber.
     *
     * @return the current value of clientReferenceNumber
     */
    public String getClientReferenceNumber() {
        return clientReferenceNumber;
    }

    /**
     * Setter method for clientReferenceNumber.
     *
     * @param aClientReferenceNumber the new value for clientReferenceNumber
     */
    public void setClientReferenceNumber(String aClientReferenceNumber) {
        clientReferenceNumber = aClientReferenceNumber;
    }

    /**
     * Access method for sourceSystem.
     *
     * @return the current value of sourceSystem
     */
    public String getSourceSystem() {
        return sourceSystem;
    }

    /**
     * Setter method for sourceSystem.
     *
     * @param aSourceSystem the new value for sourceSystem
     */
    public void setSourceSystem(String aSourceSystem) {
        sourceSystem = aSourceSystem;
    }

    /**
     * Access method for effectiveDate.
     *
     * @return the current value of effectiveDate
     */
    public Timestamp getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Setter method for effectiveDate.
     *
     * @param aEffectiveDate the new value for effectiveDate
     */
    public void setEffectiveDate(Timestamp aEffectiveDate) {
        effectiveDate = aEffectiveDate;
    }

    /**
     * Access method for expirationDate.
     *
     * @return the current value of expirationDate
     */
    public Timestamp getExpirationDate() {
        return expirationDate;
    }

    /**
     * Setter method for expirationDate.
     *
     * @param aExpirationDate the new value for expirationDate
     */
    public void setExpirationDate(Timestamp aExpirationDate) {
        expirationDate = aExpirationDate;
    }

    /**
     * Access method for retentionPeriod.
     *
     * @return the current value of retentionPeriod
     */
    public BigDecimal getRetentionPeriod() {
        return retentionPeriod;
    }

    /**
     * Setter method for retentionPeriod.
     *
     * @param aRetentionPeriod the new value for retentionPeriod
     */
    public void setRetentionPeriod(BigDecimal aRetentionPeriod) {
        retentionPeriod = aRetentionPeriod;
    }

    /**
     * Access method for account.
     *
     * @return the current value of account
     */
    public Set<Account> getAccount() {
        return account;
    }

    /**
     * Setter method for account.
     *
     * @param aAccount the new value for account
     */
    public void setAccount(Set<Account> aAccount) {
        account = aAccount;
    }

    /**
     * Access method for clientAddress.
     *
     * @return the current value of clientAddress
     */
    public Set<ClientAddress> getClientAddress() {
        return clientAddress;
    }

    /**
     * Setter method for clientAddress.
     *
     * @param aClientAddress the new value for clientAddress
     */
    public void setClientAddress(Set<ClientAddress> aClientAddress) {
        clientAddress = aClientAddress;
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
     * Access method for clientSla.
     *
     * @return the current value of clientSla
     */
    public Set<ClientSla> getClientSla() {
        return clientSla;
    }

    /**
     * Setter method for clientSla.
     *
     * @param aClientSla the new value for clientSla
     */
    public void setClientSla(Set<ClientSla> aClientSla) {
        clientSla = aClientSla;
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
     * Access method for clientsContact.
     *
     * @return the current value of clientsContact
     */
    public Set<ClientsContact> getClientsContact() {
        return clientsContact;
    }

    /**
     * Setter method for clientsContact.
     *
     * @param aClientsContact the new value for clientsContact
     */
    public void setClientsContact(Set<ClientsContact> aClientsContact) {
        clientsContact = aClientsContact;
    }

    /**
     * Access method for partnerClient.
     *
     * @return the current value of partnerClient
     */
    public Set<PartnerClient> getPartnerClient() {
        return partnerClient;
    }

    /**
     * Setter method for partnerClient.
     *
     * @param aPartnerClient the new value for partnerClient
     */
    public void setPartnerClient(Set<PartnerClient> aPartnerClient) {
        partnerClient = aPartnerClient;
    }

    /**
     * Access method for partnerReportingDivClient.
     *
     * @return the current value of partnerReportingDivClient
     */
    public Set<PartnerReportingDivClient> getPartnerReportingDivClient() {
        return partnerReportingDivClient;
    }

    /**
     * Setter method for partnerReportingDivClient.
     *
     * @param aPartnerReportingDivClient the new value for partnerReportingDivClient
     */
    public void setPartnerReportingDivClient(Set<PartnerReportingDivClient> aPartnerReportingDivClient) {
        partnerReportingDivClient = aPartnerReportingDivClient;
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
     * Compares the key for this instance with another Clients.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Clients and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Clients)) {
            return false;
        }
        Clients that = (Clients) other;
        Object myClnClientId = this.getClnClientId();
        Object yourClnClientId = that.getClnClientId();
        if (myClnClientId==null ? yourClnClientId!=null : !myClnClientId.equals(yourClnClientId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Clients.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Clients)) return false;
        return this.equalKeys(other) && ((Clients)other).equalKeys(this);
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
        if (getClnClientId() == null) {
            i = 0;
        } else {
            i = getClnClientId().hashCode();
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
        StringBuffer sb = new StringBuffer("[Clients |");
        sb.append(" clnClientId=").append(getClnClientId());
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
        ret.put("clnClientId", getClnClientId());
        return ret;
    }

}
