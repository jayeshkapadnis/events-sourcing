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
import javax.persistence.Index;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="vendor_attribute_type", indexes={@Index(name="vendor_attribute_type_vendor_attr_type_desc_IX", columnList="vendor_attr_type_desc", unique=true)})
public class VendorAttributeType implements Serializable {

    /** Primary key. */
    protected static final String PK = "vendorAttributeTypeId";

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
    @Column(name="vendor_attribute_type_id", unique=true, nullable=false, precision=9)
    private BigDecimal vendorAttributeTypeId;
    @Column(name="vendor_attr_type_desc", unique=true, nullable=false, length=200)
    private String vendorAttrTypeDesc;
    @Column(name="user_created", nullable=false, length=200)
    private String userCreated;
    @Column(name="date_created")
    private Timestamp dateCreated;
    @Column(name="user_modified", length=200)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @OneToMany(mappedBy="vendorAttributeType")
    private Set<VendorOrgAttribute> vendorOrgAttribute;

    /** Default constructor. */
    public VendorAttributeType() {
        super();
    }

    /**
     * Access method for vendorAttributeTypeId.
     *
     * @return the current value of vendorAttributeTypeId
     */
    public BigDecimal getVendorAttributeTypeId() {
        return vendorAttributeTypeId;
    }

    /**
     * Setter method for vendorAttributeTypeId.
     *
     * @param aVendorAttributeTypeId the new value for vendorAttributeTypeId
     */
    public void setVendorAttributeTypeId(BigDecimal aVendorAttributeTypeId) {
        vendorAttributeTypeId = aVendorAttributeTypeId;
    }

    /**
     * Access method for vendorAttrTypeDesc.
     *
     * @return the current value of vendorAttrTypeDesc
     */
    public String getVendorAttrTypeDesc() {
        return vendorAttrTypeDesc;
    }

    /**
     * Setter method for vendorAttrTypeDesc.
     *
     * @param aVendorAttrTypeDesc the new value for vendorAttrTypeDesc
     */
    public void setVendorAttrTypeDesc(String aVendorAttrTypeDesc) {
        vendorAttrTypeDesc = aVendorAttrTypeDesc;
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
     * Access method for vendorOrgAttribute.
     *
     * @return the current value of vendorOrgAttribute
     */
    public Set<VendorOrgAttribute> getVendorOrgAttribute() {
        return vendorOrgAttribute;
    }

    /**
     * Setter method for vendorOrgAttribute.
     *
     * @param aVendorOrgAttribute the new value for vendorOrgAttribute
     */
    public void setVendorOrgAttribute(Set<VendorOrgAttribute> aVendorOrgAttribute) {
        vendorOrgAttribute = aVendorOrgAttribute;
    }

    /**
     * Compares the key for this instance with another VendorAttributeType.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class VendorAttributeType and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof VendorAttributeType)) {
            return false;
        }
        VendorAttributeType that = (VendorAttributeType) other;
        Object myVendorAttributeTypeId = this.getVendorAttributeTypeId();
        Object yourVendorAttributeTypeId = that.getVendorAttributeTypeId();
        if (myVendorAttributeTypeId==null ? yourVendorAttributeTypeId!=null : !myVendorAttributeTypeId.equals(yourVendorAttributeTypeId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another VendorAttributeType.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof VendorAttributeType)) return false;
        return this.equalKeys(other) && ((VendorAttributeType)other).equalKeys(this);
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
        if (getVendorAttributeTypeId() == null) {
            i = 0;
        } else {
            i = getVendorAttributeTypeId().hashCode();
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
        StringBuffer sb = new StringBuffer("[VendorAttributeType |");
        sb.append(" vendorAttributeTypeId=").append(getVendorAttributeTypeId());
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
        ret.put("vendorAttributeTypeId", getVendorAttributeTypeId());
        return ret;
    }

}
