// Generated with g9.

package com.cxloyalty.gce.entity.helix;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="issuer_notification_method")
public class IssuerNotificationMethod implements Serializable {

    /** Primary key. */
    protected static final String PK = "notificationMethodSysid";

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
    @Column(name="notification_method_sysid", unique=true, nullable=false, precision=2)
    private BigDecimal notificationMethodSysid;
    @Column(name="notification_method", nullable=false, length=30)
    private String notificationMethod;
    @OneToMany(mappedBy="issuerNotificationMethod")
    private Set<BankBranch> bankBranch;
    @OneToMany(mappedBy="issuerNotificationMethod")
    private Set<IssuerContact> issuerContact;

    /** Default constructor. */
    public IssuerNotificationMethod() {
        super();
    }

    /**
     * Access method for notificationMethodSysid.
     *
     * @return the current value of notificationMethodSysid
     */
    public BigDecimal getNotificationMethodSysid() {
        return notificationMethodSysid;
    }

    /**
     * Setter method for notificationMethodSysid.
     *
     * @param aNotificationMethodSysid the new value for notificationMethodSysid
     */
    public void setNotificationMethodSysid(BigDecimal aNotificationMethodSysid) {
        notificationMethodSysid = aNotificationMethodSysid;
    }

    /**
     * Access method for notificationMethod.
     *
     * @return the current value of notificationMethod
     */
    public String getNotificationMethod() {
        return notificationMethod;
    }

    /**
     * Setter method for notificationMethod.
     *
     * @param aNotificationMethod the new value for notificationMethod
     */
    public void setNotificationMethod(String aNotificationMethod) {
        notificationMethod = aNotificationMethod;
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
     * Compares the key for this instance with another IssuerNotificationMethod.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class IssuerNotificationMethod and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof IssuerNotificationMethod)) {
            return false;
        }
        IssuerNotificationMethod that = (IssuerNotificationMethod) other;
        Object myNotificationMethodSysid = this.getNotificationMethodSysid();
        Object yourNotificationMethodSysid = that.getNotificationMethodSysid();
        if (myNotificationMethodSysid==null ? yourNotificationMethodSysid!=null : !myNotificationMethodSysid.equals(yourNotificationMethodSysid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another IssuerNotificationMethod.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof IssuerNotificationMethod)) return false;
        return this.equalKeys(other) && ((IssuerNotificationMethod)other).equalKeys(this);
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
        if (getNotificationMethodSysid() == null) {
            i = 0;
        } else {
            i = getNotificationMethodSysid().hashCode();
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
        StringBuffer sb = new StringBuffer("[IssuerNotificationMethod |");
        sb.append(" notificationMethodSysid=").append(getNotificationMethodSysid());
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
        ret.put("notificationMethodSysid", getNotificationMethodSysid());
        return ret;
    }

}
