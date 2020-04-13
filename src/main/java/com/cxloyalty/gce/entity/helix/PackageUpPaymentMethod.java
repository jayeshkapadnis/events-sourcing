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

@Entity(name="package_up_payment_method")
public class PackageUpPaymentMethod implements Serializable {

    /** Primary key. */
    protected static final String PK = "packageUpPaymentMethodId";

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
    @Column(name="package_up_payment_method_id", unique=true, nullable=false, precision=16)
    private BigDecimal packageUpPaymentMethodId;
    @Column(name="user_created", nullable=false, length=200)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=200)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @ManyToOne(optional=false)
    @JoinColumn(name="pkg_id", nullable=false)
    private Package package_;
    @ManyToOne(optional=false)
    @JoinColumn(name="up_payment_method_id", nullable=false)
    private UpPaymentMethod upPaymentMethod;

    /** Default constructor. */
    public PackageUpPaymentMethod() {
        super();
    }

    /**
     * Access method for packageUpPaymentMethodId.
     *
     * @return the current value of packageUpPaymentMethodId
     */
    public BigDecimal getPackageUpPaymentMethodId() {
        return packageUpPaymentMethodId;
    }

    /**
     * Setter method for packageUpPaymentMethodId.
     *
     * @param aPackageUpPaymentMethodId the new value for packageUpPaymentMethodId
     */
    public void setPackageUpPaymentMethodId(BigDecimal aPackageUpPaymentMethodId) {
        packageUpPaymentMethodId = aPackageUpPaymentMethodId;
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
     * Access method for upPaymentMethod.
     *
     * @return the current value of upPaymentMethod
     */
    public UpPaymentMethod getUpPaymentMethod() {
        return upPaymentMethod;
    }

    /**
     * Setter method for upPaymentMethod.
     *
     * @param aUpPaymentMethod the new value for upPaymentMethod
     */
    public void setUpPaymentMethod(UpPaymentMethod aUpPaymentMethod) {
        upPaymentMethod = aUpPaymentMethod;
    }

    /**
     * Compares the key for this instance with another PackageUpPaymentMethod.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class PackageUpPaymentMethod and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof PackageUpPaymentMethod)) {
            return false;
        }
        PackageUpPaymentMethod that = (PackageUpPaymentMethod) other;
        Object myPackageUpPaymentMethodId = this.getPackageUpPaymentMethodId();
        Object yourPackageUpPaymentMethodId = that.getPackageUpPaymentMethodId();
        if (myPackageUpPaymentMethodId==null ? yourPackageUpPaymentMethodId!=null : !myPackageUpPaymentMethodId.equals(yourPackageUpPaymentMethodId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another PackageUpPaymentMethod.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof PackageUpPaymentMethod)) return false;
        return this.equalKeys(other) && ((PackageUpPaymentMethod)other).equalKeys(this);
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
        if (getPackageUpPaymentMethodId() == null) {
            i = 0;
        } else {
            i = getPackageUpPaymentMethodId().hashCode();
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
        StringBuffer sb = new StringBuffer("[PackageUpPaymentMethod |");
        sb.append(" packageUpPaymentMethodId=").append(getPackageUpPaymentMethodId());
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
        ret.put("packageUpPaymentMethodId", getPackageUpPaymentMethodId());
        return ret;
    }

}
