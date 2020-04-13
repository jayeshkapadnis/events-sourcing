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

@Entity(name="attribute_value_type")
public class AttributeValueType implements Serializable {

    /** Primary key. */
    protected static final String PK = "attributeId";

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
    @Column(name="attribute_id", unique=true, nullable=false, precision=4)
    private BigDecimal attributeId;
    @Column(name="attribute_desc", nullable=false, length=100)
    private String attributeDesc;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_created", nullable=false, length=200)
    private String userCreated;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @Column(name="user_modified", length=200)
    private String userModified;
    @OneToMany(mappedBy="attributeValueType")
    private Set<BenefitAttribute> benefitAttribute;
    @OneToMany(mappedBy="attributeValueType")
    private Set<PackageAttribute> packageAttribute;

    /** Default constructor. */
    public AttributeValueType() {
        super();
    }

    /**
     * Access method for attributeId.
     *
     * @return the current value of attributeId
     */
    public BigDecimal getAttributeId() {
        return attributeId;
    }

    /**
     * Setter method for attributeId.
     *
     * @param aAttributeId the new value for attributeId
     */
    public void setAttributeId(BigDecimal aAttributeId) {
        attributeId = aAttributeId;
    }

    /**
     * Access method for attributeDesc.
     *
     * @return the current value of attributeDesc
     */
    public String getAttributeDesc() {
        return attributeDesc;
    }

    /**
     * Setter method for attributeDesc.
     *
     * @param aAttributeDesc the new value for attributeDesc
     */
    public void setAttributeDesc(String aAttributeDesc) {
        attributeDesc = aAttributeDesc;
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
     * Access method for benefitAttribute.
     *
     * @return the current value of benefitAttribute
     */
    public Set<BenefitAttribute> getBenefitAttribute() {
        return benefitAttribute;
    }

    /**
     * Setter method for benefitAttribute.
     *
     * @param aBenefitAttribute the new value for benefitAttribute
     */
    public void setBenefitAttribute(Set<BenefitAttribute> aBenefitAttribute) {
        benefitAttribute = aBenefitAttribute;
    }

    /**
     * Access method for packageAttribute.
     *
     * @return the current value of packageAttribute
     */
    public Set<PackageAttribute> getPackageAttribute() {
        return packageAttribute;
    }

    /**
     * Setter method for packageAttribute.
     *
     * @param aPackageAttribute the new value for packageAttribute
     */
    public void setPackageAttribute(Set<PackageAttribute> aPackageAttribute) {
        packageAttribute = aPackageAttribute;
    }

    /**
     * Compares the key for this instance with another AttributeValueType.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class AttributeValueType and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof AttributeValueType)) {
            return false;
        }
        AttributeValueType that = (AttributeValueType) other;
        Object myAttributeId = this.getAttributeId();
        Object yourAttributeId = that.getAttributeId();
        if (myAttributeId==null ? yourAttributeId!=null : !myAttributeId.equals(yourAttributeId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another AttributeValueType.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof AttributeValueType)) return false;
        return this.equalKeys(other) && ((AttributeValueType)other).equalKeys(this);
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
        if (getAttributeId() == null) {
            i = 0;
        } else {
            i = getAttributeId().hashCode();
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
        StringBuffer sb = new StringBuffer("[AttributeValueType |");
        sb.append(" attributeId=").append(getAttributeId());
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
        ret.put("attributeId", getAttributeId());
        return ret;
    }

}
