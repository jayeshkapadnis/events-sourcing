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

@Entity(name="benefit_attribute_type")
public class BenefitAttributeType implements Serializable {

    /** Primary key. */
    protected static final String PK = "benAttributeTypeId";

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
    @Column(name="ben_attribute_type_id", unique=true, nullable=false, precision=10)
    private BigDecimal benAttributeTypeId;
    @Column(name="ben_attr_type_name", nullable=false, length=100)
    private String benAttrTypeName;
    @Column(name="user_created", nullable=false, length=30)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=30)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @OneToMany(mappedBy="benefitAttributeType")
    private Set<BenefitAttribute> benefitAttribute;

    /** Default constructor. */
    public BenefitAttributeType() {
        super();
    }

    /**
     * Access method for benAttributeTypeId.
     *
     * @return the current value of benAttributeTypeId
     */
    public BigDecimal getBenAttributeTypeId() {
        return benAttributeTypeId;
    }

    /**
     * Setter method for benAttributeTypeId.
     *
     * @param aBenAttributeTypeId the new value for benAttributeTypeId
     */
    public void setBenAttributeTypeId(BigDecimal aBenAttributeTypeId) {
        benAttributeTypeId = aBenAttributeTypeId;
    }

    /**
     * Access method for benAttrTypeName.
     *
     * @return the current value of benAttrTypeName
     */
    public String getBenAttrTypeName() {
        return benAttrTypeName;
    }

    /**
     * Setter method for benAttrTypeName.
     *
     * @param aBenAttrTypeName the new value for benAttrTypeName
     */
    public void setBenAttrTypeName(String aBenAttrTypeName) {
        benAttrTypeName = aBenAttrTypeName;
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
     * Compares the key for this instance with another BenefitAttributeType.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class BenefitAttributeType and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof BenefitAttributeType)) {
            return false;
        }
        BenefitAttributeType that = (BenefitAttributeType) other;
        Object myBenAttributeTypeId = this.getBenAttributeTypeId();
        Object yourBenAttributeTypeId = that.getBenAttributeTypeId();
        if (myBenAttributeTypeId==null ? yourBenAttributeTypeId!=null : !myBenAttributeTypeId.equals(yourBenAttributeTypeId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another BenefitAttributeType.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof BenefitAttributeType)) return false;
        return this.equalKeys(other) && ((BenefitAttributeType)other).equalKeys(this);
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
        if (getBenAttributeTypeId() == null) {
            i = 0;
        } else {
            i = getBenAttributeTypeId().hashCode();
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
        StringBuffer sb = new StringBuffer("[BenefitAttributeType |");
        sb.append(" benAttributeTypeId=").append(getBenAttributeTypeId());
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
        ret.put("benAttributeTypeId", getBenAttributeTypeId());
        return ret;
    }

}
