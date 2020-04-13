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
@Table(name="benefit_selection_type", indexes={@Index(name="benefit_selection_type_name_IX", columnList="name", unique=true)})
public class BenefitSelectionType implements Serializable {

    /** Primary key. */
    protected static final String PK = "benefitSelectionTypeId";

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
    @Column(name="benefit_selection_type_id", unique=true, nullable=false, precision=16)
    private BigDecimal benefitSelectionTypeId;
    @Column(unique=true, nullable=false, length=100)
    private String name;
    @Column(name="user_created", nullable=false, length=200)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=200)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @OneToMany(mappedBy="benefitSelectionType")
    private Set<Package> package_;

    /** Default constructor. */
    public BenefitSelectionType() {
        super();
    }

    /**
     * Access method for benefitSelectionTypeId.
     *
     * @return the current value of benefitSelectionTypeId
     */
    public BigDecimal getBenefitSelectionTypeId() {
        return benefitSelectionTypeId;
    }

    /**
     * Setter method for benefitSelectionTypeId.
     *
     * @param aBenefitSelectionTypeId the new value for benefitSelectionTypeId
     */
    public void setBenefitSelectionTypeId(BigDecimal aBenefitSelectionTypeId) {
        benefitSelectionTypeId = aBenefitSelectionTypeId;
    }

    /**
     * Access method for name.
     *
     * @return the current value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for name.
     *
     * @param aName the new value for name
     */
    public void setName(String aName) {
        name = aName;
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
    public Set<Package> getPackage_() {
        return package_;
    }

    /**
     * Setter method for package_.
     *
     * @param aPackage_ the new value for package_
     */
    public void setPackage_(Set<Package> aPackage_) {
        package_ = aPackage_;
    }

    /**
     * Compares the key for this instance with another BenefitSelectionType.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class BenefitSelectionType and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof BenefitSelectionType)) {
            return false;
        }
        BenefitSelectionType that = (BenefitSelectionType) other;
        Object myBenefitSelectionTypeId = this.getBenefitSelectionTypeId();
        Object yourBenefitSelectionTypeId = that.getBenefitSelectionTypeId();
        if (myBenefitSelectionTypeId==null ? yourBenefitSelectionTypeId!=null : !myBenefitSelectionTypeId.equals(yourBenefitSelectionTypeId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another BenefitSelectionType.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof BenefitSelectionType)) return false;
        return this.equalKeys(other) && ((BenefitSelectionType)other).equalKeys(this);
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
        if (getBenefitSelectionTypeId() == null) {
            i = 0;
        } else {
            i = getBenefitSelectionTypeId().hashCode();
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
        StringBuffer sb = new StringBuffer("[BenefitSelectionType |");
        sb.append(" benefitSelectionTypeId=").append(getBenefitSelectionTypeId());
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
        ret.put("benefitSelectionTypeId", getBenefitSelectionTypeId());
        return ret;
    }

}
