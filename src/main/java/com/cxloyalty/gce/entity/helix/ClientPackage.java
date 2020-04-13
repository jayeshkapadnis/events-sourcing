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
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="client_package", indexes={@Index(name="clientPackageUidxClientPackage", columnList="client_id,pkg_id", unique=true)})
public class ClientPackage implements Serializable {

    /** Primary key. */
    protected static final String PK = "clientPackageId";

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
    @Column(name="client_package_id", unique=true, nullable=false, precision=10)
    private BigDecimal clientPackageId;
    @Column(name="client_pkg_name", length=200)
    private String clientPkgName;
    @Column(name="user_created", nullable=false, length=50)
    private String userCreated;
    @Column(name="date_created")
    private Timestamp dateCreated;
    @Column(name="user_modified", length=50)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @ManyToOne(optional=false)
    @JoinColumn(name="client_id", nullable=false)
    private Clients clients;
    @ManyToOne(optional=false)
    @JoinColumn(name="pkg_id", nullable=false)
    private Package package_;

    /** Default constructor. */
    public ClientPackage() {
        super();
    }

    /**
     * Access method for clientPackageId.
     *
     * @return the current value of clientPackageId
     */
    public BigDecimal getClientPackageId() {
        return clientPackageId;
    }

    /**
     * Setter method for clientPackageId.
     *
     * @param aClientPackageId the new value for clientPackageId
     */
    public void setClientPackageId(BigDecimal aClientPackageId) {
        clientPackageId = aClientPackageId;
    }

    /**
     * Access method for clientPkgName.
     *
     * @return the current value of clientPkgName
     */
    public String getClientPkgName() {
        return clientPkgName;
    }

    /**
     * Setter method for clientPkgName.
     *
     * @param aClientPkgName the new value for clientPkgName
     */
    public void setClientPkgName(String aClientPkgName) {
        clientPkgName = aClientPkgName;
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
     * Gets the group fragment clnClientId for member clients.
     *
     * @return Current value of the group fragment
     * @see Clients
     */
    public BigDecimal getClientsClnClientId() {
        return (getClients() == null ? null : getClients().getClnClientId());
    }

    /**
     * Sets the group fragment clnClientId from member clients.
     *
     * @param aClnClientId New value for the group fragment
     * @see Clients
     */
    public void setClientsClnClientId(BigDecimal aClnClientId) {
        if (getClients() != null) {
            getClients().setClnClientId(aClnClientId);
        }
    }

    /**
     * Gets the group fragment pkgId for member package_.
     *
     * @return Current value of the group fragment
     * @see Package
     */
    public BigDecimal getPackage_PkgId() {
        return (getPackage_() == null ? null : getPackage_().getPkgId());
    }

    /**
     * Sets the group fragment pkgId from member package_.
     *
     * @param aPkgId New value for the group fragment
     * @see Package
     */
    public void setPackage_PkgId(BigDecimal aPkgId) {
        if (getPackage_() != null) {
            getPackage_().setPkgId(aPkgId);
        }
    }

    /**
     * Compares the key for this instance with another ClientPackage.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ClientPackage and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ClientPackage)) {
            return false;
        }
        ClientPackage that = (ClientPackage) other;
        Object myClientPackageId = this.getClientPackageId();
        Object yourClientPackageId = that.getClientPackageId();
        if (myClientPackageId==null ? yourClientPackageId!=null : !myClientPackageId.equals(yourClientPackageId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ClientPackage.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ClientPackage)) return false;
        return this.equalKeys(other) && ((ClientPackage)other).equalKeys(this);
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
        if (getClientPackageId() == null) {
            i = 0;
        } else {
            i = getClientPackageId().hashCode();
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
        StringBuffer sb = new StringBuffer("[ClientPackage |");
        sb.append(" clientPackageId=").append(getClientPackageId());
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
        ret.put("clientPackageId", getClientPackageId());
        return ret;
    }

}
