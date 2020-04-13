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

@Entity(name="package_attribute")
public class PackageAttribute implements Serializable {

    /** Primary key. */
    protected static final String PK = "pkgAttributeId";

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
    @Column(name="pkg_attribute_id", unique=true, nullable=false, precision=16)
    private BigDecimal pkgAttributeId;
    @Column(name="pkg_attribute_value", nullable=false, length=400)
    private String pkgAttributeValue;
    @Column(name="user_created", nullable=false, length=30)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=30)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @Column(name="pkg_attribute_type_desc", length=100)
    private String pkgAttributeTypeDesc;
    @ManyToOne(optional=false)
    @JoinColumn(name="pkg_id", nullable=false)
    private Package package_;
    @ManyToOne
    @JoinColumn(name="pkg_attr_value_type")
    private AttributeValueType attributeValueType;

    /** Default constructor. */
    public PackageAttribute() {
        super();
    }

    /**
     * Access method for pkgAttributeId.
     *
     * @return the current value of pkgAttributeId
     */
    public BigDecimal getPkgAttributeId() {
        return pkgAttributeId;
    }

    /**
     * Setter method for pkgAttributeId.
     *
     * @param aPkgAttributeId the new value for pkgAttributeId
     */
    public void setPkgAttributeId(BigDecimal aPkgAttributeId) {
        pkgAttributeId = aPkgAttributeId;
    }

    /**
     * Access method for pkgAttributeValue.
     *
     * @return the current value of pkgAttributeValue
     */
    public String getPkgAttributeValue() {
        return pkgAttributeValue;
    }

    /**
     * Setter method for pkgAttributeValue.
     *
     * @param aPkgAttributeValue the new value for pkgAttributeValue
     */
    public void setPkgAttributeValue(String aPkgAttributeValue) {
        pkgAttributeValue = aPkgAttributeValue;
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
     * Access method for pkgAttributeTypeDesc.
     *
     * @return the current value of pkgAttributeTypeDesc
     */
    public String getPkgAttributeTypeDesc() {
        return pkgAttributeTypeDesc;
    }

    /**
     * Setter method for pkgAttributeTypeDesc.
     *
     * @param aPkgAttributeTypeDesc the new value for pkgAttributeTypeDesc
     */
    public void setPkgAttributeTypeDesc(String aPkgAttributeTypeDesc) {
        pkgAttributeTypeDesc = aPkgAttributeTypeDesc;
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
     * Access method for attributeValueType.
     *
     * @return the current value of attributeValueType
     */
    public AttributeValueType getAttributeValueType() {
        return attributeValueType;
    }

    /**
     * Setter method for attributeValueType.
     *
     * @param aAttributeValueType the new value for attributeValueType
     */
    public void setAttributeValueType(AttributeValueType aAttributeValueType) {
        attributeValueType = aAttributeValueType;
    }

    /**
     * Compares the key for this instance with another PackageAttribute.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class PackageAttribute and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof PackageAttribute)) {
            return false;
        }
        PackageAttribute that = (PackageAttribute) other;
        Object myPkgAttributeId = this.getPkgAttributeId();
        Object yourPkgAttributeId = that.getPkgAttributeId();
        if (myPkgAttributeId==null ? yourPkgAttributeId!=null : !myPkgAttributeId.equals(yourPkgAttributeId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another PackageAttribute.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof PackageAttribute)) return false;
        return this.equalKeys(other) && ((PackageAttribute)other).equalKeys(this);
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
        if (getPkgAttributeId() == null) {
            i = 0;
        } else {
            i = getPkgAttributeId().hashCode();
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
        StringBuffer sb = new StringBuffer("[PackageAttribute |");
        sb.append(" pkgAttributeId=").append(getPkgAttributeId());
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
        ret.put("pkgAttributeId", getPkgAttributeId());
        return ret;
    }

}
