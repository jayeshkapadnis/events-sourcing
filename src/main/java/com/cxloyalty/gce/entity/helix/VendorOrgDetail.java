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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="vendor_org_detail", indexes={@Index(name="vendorOrgDetailUixVendorDetailOrgVendor", columnList="organization_id,vendor_id", unique=true)})
public class VendorOrgDetail implements Serializable {

    /** Primary key. */
    protected static final String PK = "vendorOrgId";

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
    @Column(name="vendor_org_id", unique=true, nullable=false, precision=9)
    private BigDecimal vendorOrgId;
    @Column(name="vendor_legal_name", length=200)
    private String vendorLegalName;
    @Column(name="user_created", length=200)
    private String userCreated;
    @Column(name="date_created")
    private Timestamp dateCreated;
    @Column(name="user_modified", length=200)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @ManyToOne(optional=false)
    @JoinColumn(name="organization_id", nullable=false)
    private Organization organization;
    @ManyToOne(optional=false)
    @JoinColumn(name="vendor_id", nullable=false)
    private Vendor vendor;
    @OneToMany(mappedBy="vendorOrgDetail")
    private Set<VendorOrgAttribute> vendorOrgAttribute;

    /** Default constructor. */
    public VendorOrgDetail() {
        super();
    }

    /**
     * Access method for vendorOrgId.
     *
     * @return the current value of vendorOrgId
     */
    public BigDecimal getVendorOrgId() {
        return vendorOrgId;
    }

    /**
     * Setter method for vendorOrgId.
     *
     * @param aVendorOrgId the new value for vendorOrgId
     */
    public void setVendorOrgId(BigDecimal aVendorOrgId) {
        vendorOrgId = aVendorOrgId;
    }

    /**
     * Access method for vendorLegalName.
     *
     * @return the current value of vendorLegalName
     */
    public String getVendorLegalName() {
        return vendorLegalName;
    }

    /**
     * Setter method for vendorLegalName.
     *
     * @param aVendorLegalName the new value for vendorLegalName
     */
    public void setVendorLegalName(String aVendorLegalName) {
        vendorLegalName = aVendorLegalName;
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
     * Access method for organization.
     *
     * @return the current value of organization
     */
    public Organization getOrganization() {
        return organization;
    }

    /**
     * Setter method for organization.
     *
     * @param aOrganization the new value for organization
     */
    public void setOrganization(Organization aOrganization) {
        organization = aOrganization;
    }

    /**
     * Access method for vendor.
     *
     * @return the current value of vendor
     */
    public Vendor getVendor() {
        return vendor;
    }

    /**
     * Setter method for vendor.
     *
     * @param aVendor the new value for vendor
     */
    public void setVendor(Vendor aVendor) {
        vendor = aVendor;
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
     * Gets the group fragment organizationId for member organization.
     *
     * @return Current value of the group fragment
     * @see Organization
     */
    public BigDecimal getOrganizationOrganizationId() {
        return (getOrganization() == null ? null : getOrganization().getOrganizationId());
    }

    /**
     * Sets the group fragment organizationId from member organization.
     *
     * @param aOrganizationId New value for the group fragment
     * @see Organization
     */
    public void setOrganizationOrganizationId(BigDecimal aOrganizationId) {
        if (getOrganization() != null) {
            getOrganization().setOrganizationId(aOrganizationId);
        }
    }

    /**
     * Gets the group fragment vendorId for member vendor.
     *
     * @return Current value of the group fragment
     * @see Vendor
     */
    public BigDecimal getVendorVendorId() {
        return (getVendor() == null ? null : getVendor().getVendorId());
    }

    /**
     * Sets the group fragment vendorId from member vendor.
     *
     * @param aVendorId New value for the group fragment
     * @see Vendor
     */
    public void setVendorVendorId(BigDecimal aVendorId) {
        if (getVendor() != null) {
            getVendor().setVendorId(aVendorId);
        }
    }

    /**
     * Compares the key for this instance with another VendorOrgDetail.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class VendorOrgDetail and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof VendorOrgDetail)) {
            return false;
        }
        VendorOrgDetail that = (VendorOrgDetail) other;
        Object myVendorOrgId = this.getVendorOrgId();
        Object yourVendorOrgId = that.getVendorOrgId();
        if (myVendorOrgId==null ? yourVendorOrgId!=null : !myVendorOrgId.equals(yourVendorOrgId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another VendorOrgDetail.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof VendorOrgDetail)) return false;
        return this.equalKeys(other) && ((VendorOrgDetail)other).equalKeys(this);
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
        if (getVendorOrgId() == null) {
            i = 0;
        } else {
            i = getVendorOrgId().hashCode();
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
        StringBuffer sb = new StringBuffer("[VendorOrgDetail |");
        sb.append(" vendorOrgId=").append(getVendorOrgId());
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
        ret.put("vendorOrgId", getVendorOrgId());
        return ret;
    }

}
