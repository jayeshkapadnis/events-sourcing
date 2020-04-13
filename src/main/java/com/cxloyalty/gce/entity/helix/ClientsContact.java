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

@Entity(name="clients_contact")
public class ClientsContact implements Serializable {

    /** Primary key. */
    protected static final String PK = "clientsContactId";

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
    @Column(name="clients_contact_id", unique=true, nullable=false, precision=16)
    private BigDecimal clientsContactId;
    @Column(name="contact_last", nullable=false, length=50)
    private String contactLast;
    @Column(name="contact_first", nullable=false, length=50)
    private String contactFirst;
    @Column(name="contact_mi", length=3)
    private String contactMi;
    @Column(name="address_1", length=50)
    private String address1;
    @Column(name="address_2", length=50)
    private String address2;
    @Column(length=50)
    private String city;
    @Column(length=2)
    private String state;
    @Column(name="postal_code", length=10)
    private String postalCode;
    @Column(length=20)
    private String phone;
    @Column(length=200)
    private String email;
    @Column(name="user_created", nullable=false, length=200)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=200)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @Column(name="contact_type_desc", length=500)
    private String contactTypeDesc;
    @ManyToOne(optional=false)
    @JoinColumn(name="client_id", nullable=false)
    private Clients clients;

    /** Default constructor. */
    public ClientsContact() {
        super();
    }

    /**
     * Access method for clientsContactId.
     *
     * @return the current value of clientsContactId
     */
    public BigDecimal getClientsContactId() {
        return clientsContactId;
    }

    /**
     * Setter method for clientsContactId.
     *
     * @param aClientsContactId the new value for clientsContactId
     */
    public void setClientsContactId(BigDecimal aClientsContactId) {
        clientsContactId = aClientsContactId;
    }

    /**
     * Access method for contactLast.
     *
     * @return the current value of contactLast
     */
    public String getContactLast() {
        return contactLast;
    }

    /**
     * Setter method for contactLast.
     *
     * @param aContactLast the new value for contactLast
     */
    public void setContactLast(String aContactLast) {
        contactLast = aContactLast;
    }

    /**
     * Access method for contactFirst.
     *
     * @return the current value of contactFirst
     */
    public String getContactFirst() {
        return contactFirst;
    }

    /**
     * Setter method for contactFirst.
     *
     * @param aContactFirst the new value for contactFirst
     */
    public void setContactFirst(String aContactFirst) {
        contactFirst = aContactFirst;
    }

    /**
     * Access method for contactMi.
     *
     * @return the current value of contactMi
     */
    public String getContactMi() {
        return contactMi;
    }

    /**
     * Setter method for contactMi.
     *
     * @param aContactMi the new value for contactMi
     */
    public void setContactMi(String aContactMi) {
        contactMi = aContactMi;
    }

    /**
     * Access method for address1.
     *
     * @return the current value of address1
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * Setter method for address1.
     *
     * @param aAddress1 the new value for address1
     */
    public void setAddress1(String aAddress1) {
        address1 = aAddress1;
    }

    /**
     * Access method for address2.
     *
     * @return the current value of address2
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * Setter method for address2.
     *
     * @param aAddress2 the new value for address2
     */
    public void setAddress2(String aAddress2) {
        address2 = aAddress2;
    }

    /**
     * Access method for city.
     *
     * @return the current value of city
     */
    public String getCity() {
        return city;
    }

    /**
     * Setter method for city.
     *
     * @param aCity the new value for city
     */
    public void setCity(String aCity) {
        city = aCity;
    }

    /**
     * Access method for state.
     *
     * @return the current value of state
     */
    public String getState() {
        return state;
    }

    /**
     * Setter method for state.
     *
     * @param aState the new value for state
     */
    public void setState(String aState) {
        state = aState;
    }

    /**
     * Access method for postalCode.
     *
     * @return the current value of postalCode
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Setter method for postalCode.
     *
     * @param aPostalCode the new value for postalCode
     */
    public void setPostalCode(String aPostalCode) {
        postalCode = aPostalCode;
    }

    /**
     * Access method for phone.
     *
     * @return the current value of phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Setter method for phone.
     *
     * @param aPhone the new value for phone
     */
    public void setPhone(String aPhone) {
        phone = aPhone;
    }

    /**
     * Access method for email.
     *
     * @return the current value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter method for email.
     *
     * @param aEmail the new value for email
     */
    public void setEmail(String aEmail) {
        email = aEmail;
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
     * Access method for contactTypeDesc.
     *
     * @return the current value of contactTypeDesc
     */
    public String getContactTypeDesc() {
        return contactTypeDesc;
    }

    /**
     * Setter method for contactTypeDesc.
     *
     * @param aContactTypeDesc the new value for contactTypeDesc
     */
    public void setContactTypeDesc(String aContactTypeDesc) {
        contactTypeDesc = aContactTypeDesc;
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
     * Compares the key for this instance with another ClientsContact.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ClientsContact and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ClientsContact)) {
            return false;
        }
        ClientsContact that = (ClientsContact) other;
        Object myClientsContactId = this.getClientsContactId();
        Object yourClientsContactId = that.getClientsContactId();
        if (myClientsContactId==null ? yourClientsContactId!=null : !myClientsContactId.equals(yourClientsContactId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ClientsContact.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ClientsContact)) return false;
        return this.equalKeys(other) && ((ClientsContact)other).equalKeys(this);
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
        if (getClientsContactId() == null) {
            i = 0;
        } else {
            i = getClientsContactId().hashCode();
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
        StringBuffer sb = new StringBuffer("[ClientsContact |");
        sb.append(" clientsContactId=").append(getClientsContactId());
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
        ret.put("clientsContactId", getClientsContactId());
        return ret;
    }

}
