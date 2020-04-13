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
@Table(name="related_package", indexes={@Index(name="relatedPackageUidxRelatedPackage", columnList="client_id,source_pkg_id,target_pkg_id", unique=true)})
public class RelatedPackage implements Serializable {

    /** Primary key. */
    protected static final String PK = "relatedPackageId";

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
    @Column(name="related_package_id", unique=true, nullable=false, precision=10)
    private BigDecimal relatedPackageId;
    @Column(name="target_pkg_id", nullable=false, precision=10)
    private BigDecimal targetPkgId;
    @Column(name="user_created", nullable=false, length=50)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=50)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @ManyToOne
    @JoinColumn(name="client_id")
    private Clients clients;
    @ManyToOne(optional=false)
    @JoinColumn(name="source_pkg_id", nullable=false)
    private Package package_;

    /** Default constructor. */
    public RelatedPackage() {
        super();
    }

    /**
     * Access method for relatedPackageId.
     *
     * @return the current value of relatedPackageId
     */
    public BigDecimal getRelatedPackageId() {
        return relatedPackageId;
    }

    /**
     * Setter method for relatedPackageId.
     *
     * @param aRelatedPackageId the new value for relatedPackageId
     */
    public void setRelatedPackageId(BigDecimal aRelatedPackageId) {
        relatedPackageId = aRelatedPackageId;
    }

    /**
     * Access method for targetPkgId.
     *
     * @return the current value of targetPkgId
     */
    public BigDecimal getTargetPkgId() {
        return targetPkgId;
    }

    /**
     * Setter method for targetPkgId.
     *
     * @param aTargetPkgId the new value for targetPkgId
     */
    public void setTargetPkgId(BigDecimal aTargetPkgId) {
        targetPkgId = aTargetPkgId;
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
     * Compares the key for this instance with another RelatedPackage.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class RelatedPackage and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof RelatedPackage)) {
            return false;
        }
        RelatedPackage that = (RelatedPackage) other;
        Object myRelatedPackageId = this.getRelatedPackageId();
        Object yourRelatedPackageId = that.getRelatedPackageId();
        if (myRelatedPackageId==null ? yourRelatedPackageId!=null : !myRelatedPackageId.equals(yourRelatedPackageId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another RelatedPackage.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof RelatedPackage)) return false;
        return this.equalKeys(other) && ((RelatedPackage)other).equalKeys(this);
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
        if (getRelatedPackageId() == null) {
            i = 0;
        } else {
            i = getRelatedPackageId().hashCode();
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
        StringBuffer sb = new StringBuffer("[RelatedPackage |");
        sb.append(" relatedPackageId=").append(getRelatedPackageId());
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
        ret.put("relatedPackageId", getRelatedPackageId());
        return ret;
    }

}
