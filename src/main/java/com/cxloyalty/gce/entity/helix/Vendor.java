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

@Entity(name="vendor")
public class Vendor implements Serializable {

    /** Primary key. */
    protected static final String PK = "vendorId";

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
    @Column(name="vendor_id", unique=true, nullable=false, precision=9)
    private BigDecimal vendorId;
    @Column(name="vendor_name", nullable=false, length=100)
    private String vendorName;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_created", nullable=false, length=30)
    private String userCreated;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @Column(name="user_modified", length=30)
    private String userModified;
    @OneToMany(mappedBy="vendor")
    private Set<BenefitVendorXref> benefitVendorXref;
    @OneToMany(mappedBy="vendor")
    private Set<VendorOrgDetail> vendorOrgDetail;

    /** Default constructor. */
    public Vendor() {
        super();
    }

    /**
     * Access method for vendorId.
     *
     * @return the current value of vendorId
     */
    public BigDecimal getVendorId() {
        return vendorId;
    }

    /**
     * Setter method for vendorId.
     *
     * @param aVendorId the new value for vendorId
     */
    public void setVendorId(BigDecimal aVendorId) {
        vendorId = aVendorId;
    }

    /**
     * Access method for vendorName.
     *
     * @return the current value of vendorName
     */
    public String getVendorName() {
        return vendorName;
    }

    /**
     * Setter method for vendorName.
     *
     * @param aVendorName the new value for vendorName
     */
    public void setVendorName(String aVendorName) {
        vendorName = aVendorName;
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
     * Access method for benefitVendorXref.
     *
     * @return the current value of benefitVendorXref
     */
    public Set<BenefitVendorXref> getBenefitVendorXref() {
        return benefitVendorXref;
    }

    /**
     * Setter method for benefitVendorXref.
     *
     * @param aBenefitVendorXref the new value for benefitVendorXref
     */
    public void setBenefitVendorXref(Set<BenefitVendorXref> aBenefitVendorXref) {
        benefitVendorXref = aBenefitVendorXref;
    }

    /**
     * Access method for vendorOrgDetail.
     *
     * @return the current value of vendorOrgDetail
     */
    public Set<VendorOrgDetail> getVendorOrgDetail() {
        return vendorOrgDetail;
    }

    /**
     * Setter method for vendorOrgDetail.
     *
     * @param aVendorOrgDetail the new value for vendorOrgDetail
     */
    public void setVendorOrgDetail(Set<VendorOrgDetail> aVendorOrgDetail) {
        vendorOrgDetail = aVendorOrgDetail;
    }

    /**
     * Compares the key for this instance with another Vendor.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Vendor and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Vendor)) {
            return false;
        }
        Vendor that = (Vendor) other;
        Object myVendorId = this.getVendorId();
        Object yourVendorId = that.getVendorId();
        if (myVendorId==null ? yourVendorId!=null : !myVendorId.equals(yourVendorId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Vendor.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Vendor)) return false;
        return this.equalKeys(other) && ((Vendor)other).equalKeys(this);
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
        if (getVendorId() == null) {
            i = 0;
        } else {
            i = getVendorId().hashCode();
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
        StringBuffer sb = new StringBuffer("[Vendor |");
        sb.append(" vendorId=").append(getVendorId());
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
        ret.put("vendorId", getVendorId());
        return ret;
    }

}
