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
@Table(name="benefit_attribute", indexes={@Index(name="benefitAttributeIdxBenefitAttribute", columnList="ben_id,ben_attribute_type_id", unique=true)})
public class BenefitAttribute implements Serializable {

    /** Primary key. */
    protected static final String PK = "benAttributeId";

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
    @Column(name="ben_attribute_id", unique=true, nullable=false, precision=16)
    private BigDecimal benAttributeId;
    @Column(name="user_created", nullable=false, length=30)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=30)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @Column(name="default_value", nullable=false, length=400)
    private String defaultValue;
    @ManyToOne(optional=false)
    @JoinColumn(name="ben_attribute_type_id", nullable=false)
    private BenefitAttributeType benefitAttributeType;
    @ManyToOne(optional=false)
    @JoinColumn(name="ben_id", nullable=false)
    private Benefit benefit;
    @ManyToOne
    @JoinColumn(name="ben_attr_value_type")
    private AttributeValueType attributeValueType;
    @OneToMany(mappedBy="benefitAttribute")
    private Set<PkgBenefitAttribute> pkgBenefitAttribute;

    /** Default constructor. */
    public BenefitAttribute() {
        super();
    }

    /**
     * Access method for benAttributeId.
     *
     * @return the current value of benAttributeId
     */
    public BigDecimal getBenAttributeId() {
        return benAttributeId;
    }

    /**
     * Setter method for benAttributeId.
     *
     * @param aBenAttributeId the new value for benAttributeId
     */
    public void setBenAttributeId(BigDecimal aBenAttributeId) {
        benAttributeId = aBenAttributeId;
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
     * Access method for defaultValue.
     *
     * @return the current value of defaultValue
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * Setter method for defaultValue.
     *
     * @param aDefaultValue the new value for defaultValue
     */
    public void setDefaultValue(String aDefaultValue) {
        defaultValue = aDefaultValue;
    }

    /**
     * Access method for benefitAttributeType.
     *
     * @return the current value of benefitAttributeType
     */
    public BenefitAttributeType getBenefitAttributeType() {
        return benefitAttributeType;
    }

    /**
     * Setter method for benefitAttributeType.
     *
     * @param aBenefitAttributeType the new value for benefitAttributeType
     */
    public void setBenefitAttributeType(BenefitAttributeType aBenefitAttributeType) {
        benefitAttributeType = aBenefitAttributeType;
    }

    /**
     * Access method for benefit.
     *
     * @return the current value of benefit
     */
    public Benefit getBenefit() {
        return benefit;
    }

    /**
     * Setter method for benefit.
     *
     * @param aBenefit the new value for benefit
     */
    public void setBenefit(Benefit aBenefit) {
        benefit = aBenefit;
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
     * Access method for pkgBenefitAttribute.
     *
     * @return the current value of pkgBenefitAttribute
     */
    public Set<PkgBenefitAttribute> getPkgBenefitAttribute() {
        return pkgBenefitAttribute;
    }

    /**
     * Setter method for pkgBenefitAttribute.
     *
     * @param aPkgBenefitAttribute the new value for pkgBenefitAttribute
     */
    public void setPkgBenefitAttribute(Set<PkgBenefitAttribute> aPkgBenefitAttribute) {
        pkgBenefitAttribute = aPkgBenefitAttribute;
    }

    /**
     * Gets the group fragment benId for member benefit.
     *
     * @return Current value of the group fragment
     * @see Benefit
     */
    public BigDecimal getBenefitBenId() {
        return (getBenefit() == null ? null : getBenefit().getBenId());
    }

    /**
     * Sets the group fragment benId from member benefit.
     *
     * @param aBenId New value for the group fragment
     * @see Benefit
     */
    public void setBenefitBenId(BigDecimal aBenId) {
        if (getBenefit() != null) {
            getBenefit().setBenId(aBenId);
        }
    }

    /**
     * Gets the group fragment benAttributeTypeId for member benefitAttributeType.
     *
     * @return Current value of the group fragment
     * @see BenefitAttributeType
     */
    public BigDecimal getBenefitAttributeTypeBenAttributeTypeId() {
        return (getBenefitAttributeType() == null ? null : getBenefitAttributeType().getBenAttributeTypeId());
    }

    /**
     * Sets the group fragment benAttributeTypeId from member benefitAttributeType.
     *
     * @param aBenAttributeTypeId New value for the group fragment
     * @see BenefitAttributeType
     */
    public void setBenefitAttributeTypeBenAttributeTypeId(BigDecimal aBenAttributeTypeId) {
        if (getBenefitAttributeType() != null) {
            getBenefitAttributeType().setBenAttributeTypeId(aBenAttributeTypeId);
        }
    }

    /**
     * Compares the key for this instance with another BenefitAttribute.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class BenefitAttribute and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof BenefitAttribute)) {
            return false;
        }
        BenefitAttribute that = (BenefitAttribute) other;
        Object myBenAttributeId = this.getBenAttributeId();
        Object yourBenAttributeId = that.getBenAttributeId();
        if (myBenAttributeId==null ? yourBenAttributeId!=null : !myBenAttributeId.equals(yourBenAttributeId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another BenefitAttribute.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof BenefitAttribute)) return false;
        return this.equalKeys(other) && ((BenefitAttribute)other).equalKeys(this);
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
        if (getBenAttributeId() == null) {
            i = 0;
        } else {
            i = getBenAttributeId().hashCode();
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
        StringBuffer sb = new StringBuffer("[BenefitAttribute |");
        sb.append(" benAttributeId=").append(getBenAttributeId());
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
        ret.put("benAttributeId", getBenAttributeId());
        return ret;
    }

}
