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
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="up_payment_method")
public class UpPaymentMethod implements Serializable {

    /** Primary key. */
    protected static final String PK = "upPaymentMethodId";

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
    @Column(name="up_payment_method_id", unique=true, nullable=false, precision=9)
    private BigDecimal upPaymentMethodId;
    @Column(name="up_payment_method_desc", length=200)
    private String upPaymentMethodDesc;
    @Column(name="user_created", nullable=false, length=200)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=200)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @OneToMany(mappedBy="upPaymentMethod")
    private Set<PackageUpPaymentMethod> packageUpPaymentMethod;

    /** Default constructor. */
    public UpPaymentMethod() {
        super();
    }

    /**
     * Access method for upPaymentMethodId.
     *
     * @return the current value of upPaymentMethodId
     */
    public BigDecimal getUpPaymentMethodId() {
        return upPaymentMethodId;
    }

    /**
     * Setter method for upPaymentMethodId.
     *
     * @param aUpPaymentMethodId the new value for upPaymentMethodId
     */
    public void setUpPaymentMethodId(BigDecimal aUpPaymentMethodId) {
        upPaymentMethodId = aUpPaymentMethodId;
    }

    /**
     * Access method for upPaymentMethodDesc.
     *
     * @return the current value of upPaymentMethodDesc
     */
    public String getUpPaymentMethodDesc() {
        return upPaymentMethodDesc;
    }

    /**
     * Setter method for upPaymentMethodDesc.
     *
     * @param aUpPaymentMethodDesc the new value for upPaymentMethodDesc
     */
    public void setUpPaymentMethodDesc(String aUpPaymentMethodDesc) {
        upPaymentMethodDesc = aUpPaymentMethodDesc;
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
     * Access method for packageUpPaymentMethod.
     *
     * @return the current value of packageUpPaymentMethod
     */
    public Set<PackageUpPaymentMethod> getPackageUpPaymentMethod() {
        return packageUpPaymentMethod;
    }

    /**
     * Setter method for packageUpPaymentMethod.
     *
     * @param aPackageUpPaymentMethod the new value for packageUpPaymentMethod
     */
    public void setPackageUpPaymentMethod(Set<PackageUpPaymentMethod> aPackageUpPaymentMethod) {
        packageUpPaymentMethod = aPackageUpPaymentMethod;
    }

    /**
     * Compares the key for this instance with another UpPaymentMethod.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class UpPaymentMethod and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof UpPaymentMethod)) {
            return false;
        }
        UpPaymentMethod that = (UpPaymentMethod) other;
        Object myUpPaymentMethodId = this.getUpPaymentMethodId();
        Object yourUpPaymentMethodId = that.getUpPaymentMethodId();
        if (myUpPaymentMethodId==null ? yourUpPaymentMethodId!=null : !myUpPaymentMethodId.equals(yourUpPaymentMethodId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another UpPaymentMethod.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof UpPaymentMethod)) return false;
        return this.equalKeys(other) && ((UpPaymentMethod)other).equalKeys(this);
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
        if (getUpPaymentMethodId() == null) {
            i = 0;
        } else {
            i = getUpPaymentMethodId().hashCode();
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
        StringBuffer sb = new StringBuffer("[UpPaymentMethod |");
        sb.append(" upPaymentMethodId=").append(getUpPaymentMethodId());
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
        ret.put("upPaymentMethodId", getUpPaymentMethodId());
        return ret;
    }

}
