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
@Table(name="vendor_org_attribute", indexes={@Index(name="vendorOrgAttributeUidVendorOrgAttriTypId", columnList="vendor_org_id,vendor_attribute_type_id", unique=true)})
public class VendorOrgAttribute implements Serializable {

    /** Primary key. */
    protected static final String PK = "vendorOrgAttributeId";

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
    @Column(name="vendor_org_attribute_id", unique=true, nullable=false, precision=9)
    private BigDecimal vendorOrgAttributeId;
    @Column(name="display_order", nullable=false, precision=2)
    private BigDecimal displayOrder;
    @Column(name="user_created", length=200)
    private String userCreated;
    @Column(name="date_created")
    private Timestamp dateCreated;
    @Column(name="user_modified", length=200)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @ManyToOne(optional=false)
    @JoinColumn(name="vendor_attribute_type_id", nullable=false)
    private VendorAttributeType vendorAttributeType;
    @ManyToOne(optional=false)
    @JoinColumn(name="vendor_org_id", nullable=false)
    private VendorOrgDetail vendorOrgDetail;

    /** Default constructor. */
    public VendorOrgAttribute() {
        super();
    }

    /**
     * Access method for vendorOrgAttributeId.
     *
     * @return the current value of vendorOrgAttributeId
     */
    public BigDecimal getVendorOrgAttributeId() {
        return vendorOrgAttributeId;
    }

    /**
     * Setter method for vendorOrgAttributeId.
     *
     * @param aVendorOrgAttributeId the new value for vendorOrgAttributeId
     */
    public void setVendorOrgAttributeId(BigDecimal aVendorOrgAttributeId) {
        vendorOrgAttributeId = aVendorOrgAttributeId;
    }

    /**
     * Access method for displayOrder.
     *
     * @return the current value of displayOrder
     */
    public BigDecimal getDisplayOrder() {
        return displayOrder;
    }

    /**
     * Setter method for displayOrder.
     *
     * @param aDisplayOrder the new value for displayOrder
     */
    public void setDisplayOrder(BigDecimal aDisplayOrder) {
        displayOrder = aDisplayOrder;
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
     * Access method for vendorAttributeType.
     *
     * @return the current value of vendorAttributeType
     */
    public VendorAttributeType getVendorAttributeType() {
        return vendorAttributeType;
    }

    /**
     * Setter method for vendorAttributeType.
     *
     * @param aVendorAttributeType the new value for vendorAttributeType
     */
    public void setVendorAttributeType(VendorAttributeType aVendorAttributeType) {
        vendorAttributeType = aVendorAttributeType;
    }

    /**
     * Access method for vendorOrgDetail.
     *
     * @return the current value of vendorOrgDetail
     */
    public VendorOrgDetail getVendorOrgDetail() {
        return vendorOrgDetail;
    }

    /**
     * Setter method for vendorOrgDetail.
     *
     * @param aVendorOrgDetail the new value for vendorOrgDetail
     */
    public void setVendorOrgDetail(VendorOrgDetail aVendorOrgDetail) {
        vendorOrgDetail = aVendorOrgDetail;
    }

    /**
     * Gets the group fragment vendorOrgId for member vendorOrgDetail.
     *
     * @return Current value of the group fragment
     * @see VendorOrgDetail
     */
    public BigDecimal getVendorOrgDetailVendorOrgId() {
        return (getVendorOrgDetail() == null ? null : getVendorOrgDetail().getVendorOrgId());
    }

    /**
     * Sets the group fragment vendorOrgId from member vendorOrgDetail.
     *
     * @param aVendorOrgId New value for the group fragment
     * @see VendorOrgDetail
     */
    public void setVendorOrgDetailVendorOrgId(BigDecimal aVendorOrgId) {
        if (getVendorOrgDetail() != null) {
            getVendorOrgDetail().setVendorOrgId(aVendorOrgId);
        }
    }

    /**
     * Gets the group fragment vendorAttributeTypeId for member vendorAttributeType.
     *
     * @return Current value of the group fragment
     * @see VendorAttributeType
     */
    public BigDecimal getVendorAttributeTypeVendorAttributeTypeId() {
        return (getVendorAttributeType() == null ? null : getVendorAttributeType().getVendorAttributeTypeId());
    }

    /**
     * Sets the group fragment vendorAttributeTypeId from member vendorAttributeType.
     *
     * @param aVendorAttributeTypeId New value for the group fragment
     * @see VendorAttributeType
     */
    public void setVendorAttributeTypeVendorAttributeTypeId(BigDecimal aVendorAttributeTypeId) {
        if (getVendorAttributeType() != null) {
            getVendorAttributeType().setVendorAttributeTypeId(aVendorAttributeTypeId);
        }
    }

    /**
     * Compares the key for this instance with another VendorOrgAttribute.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class VendorOrgAttribute and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof VendorOrgAttribute)) {
            return false;
        }
        VendorOrgAttribute that = (VendorOrgAttribute) other;
        Object myVendorOrgAttributeId = this.getVendorOrgAttributeId();
        Object yourVendorOrgAttributeId = that.getVendorOrgAttributeId();
        if (myVendorOrgAttributeId==null ? yourVendorOrgAttributeId!=null : !myVendorOrgAttributeId.equals(yourVendorOrgAttributeId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another VendorOrgAttribute.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof VendorOrgAttribute)) return false;
        return this.equalKeys(other) && ((VendorOrgAttribute)other).equalKeys(this);
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
        if (getVendorOrgAttributeId() == null) {
            i = 0;
        } else {
            i = getVendorOrgAttributeId().hashCode();
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
        StringBuffer sb = new StringBuffer("[VendorOrgAttribute |");
        sb.append(" vendorOrgAttributeId=").append(getVendorOrgAttributeId());
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
        ret.put("vendorOrgAttributeId", getVendorOrgAttributeId());
        return ret;
    }

}
