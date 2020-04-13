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
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="flex_package_status", indexes={@Index(name="flex_package_status_description_IX", columnList="description", unique=true)})
public class FlexPackageStatus implements Serializable {

    /** Primary key. */
    protected static final String PK = "flexPkgStatusId";

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
    @Column(name="flex_pkg_status_id", unique=true, nullable=false, precision=16)
    private BigDecimal flexPkgStatusId;
    @Column(unique=true, nullable=false, length=100)
    private String description;
    @Column(name="user_created", nullable=false, length=200)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=200)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;

    /** Default constructor. */
    public FlexPackageStatus() {
        super();
    }

    /**
     * Access method for flexPkgStatusId.
     *
     * @return the current value of flexPkgStatusId
     */
    public BigDecimal getFlexPkgStatusId() {
        return flexPkgStatusId;
    }

    /**
     * Setter method for flexPkgStatusId.
     *
     * @param aFlexPkgStatusId the new value for flexPkgStatusId
     */
    public void setFlexPkgStatusId(BigDecimal aFlexPkgStatusId) {
        flexPkgStatusId = aFlexPkgStatusId;
    }

    /**
     * Access method for description.
     *
     * @return the current value of description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter method for description.
     *
     * @param aDescription the new value for description
     */
    public void setDescription(String aDescription) {
        description = aDescription;
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
     * Compares the key for this instance with another FlexPackageStatus.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class FlexPackageStatus and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof FlexPackageStatus)) {
            return false;
        }
        FlexPackageStatus that = (FlexPackageStatus) other;
        Object myFlexPkgStatusId = this.getFlexPkgStatusId();
        Object yourFlexPkgStatusId = that.getFlexPkgStatusId();
        if (myFlexPkgStatusId==null ? yourFlexPkgStatusId!=null : !myFlexPkgStatusId.equals(yourFlexPkgStatusId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another FlexPackageStatus.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof FlexPackageStatus)) return false;
        return this.equalKeys(other) && ((FlexPackageStatus)other).equalKeys(this);
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
        if (getFlexPkgStatusId() == null) {
            i = 0;
        } else {
            i = getFlexPkgStatusId().hashCode();
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
        StringBuffer sb = new StringBuffer("[FlexPackageStatus |");
        sb.append(" flexPkgStatusId=").append(getFlexPkgStatusId());
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
        ret.put("flexPkgStatusId", getFlexPkgStatusId());
        return ret;
    }

}
