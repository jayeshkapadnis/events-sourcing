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

@Entity(name="sol_association_type")
public class SolAssociationType implements Serializable {

    /** Primary key. */
    protected static final String PK = "solAssociationTypeId";

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
    @Column(name="sol_association_type_id", unique=true, nullable=false, precision=9)
    private BigDecimal solAssociationTypeId;
    @Column(name="sol_association_type_desc", length=100)
    private String solAssociationTypeDesc;
    @Column(name="add_date")
    private Timestamp addDate;
    @Column(name="add_username", length=200)
    private String addUsername;
    @Column(name="update_date")
    private Timestamp updateDate;
    @Column(name="update_username", length=200)
    private String updateUsername;
    @OneToMany(mappedBy="solAssociationType")
    private Set<SolAssociation> solAssociation;

    /** Default constructor. */
    public SolAssociationType() {
        super();
    }

    /**
     * Access method for solAssociationTypeId.
     *
     * @return the current value of solAssociationTypeId
     */
    public BigDecimal getSolAssociationTypeId() {
        return solAssociationTypeId;
    }

    /**
     * Setter method for solAssociationTypeId.
     *
     * @param aSolAssociationTypeId the new value for solAssociationTypeId
     */
    public void setSolAssociationTypeId(BigDecimal aSolAssociationTypeId) {
        solAssociationTypeId = aSolAssociationTypeId;
    }

    /**
     * Access method for solAssociationTypeDesc.
     *
     * @return the current value of solAssociationTypeDesc
     */
    public String getSolAssociationTypeDesc() {
        return solAssociationTypeDesc;
    }

    /**
     * Setter method for solAssociationTypeDesc.
     *
     * @param aSolAssociationTypeDesc the new value for solAssociationTypeDesc
     */
    public void setSolAssociationTypeDesc(String aSolAssociationTypeDesc) {
        solAssociationTypeDesc = aSolAssociationTypeDesc;
    }

    /**
     * Access method for addDate.
     *
     * @return the current value of addDate
     */
    public Timestamp getAddDate() {
        return addDate;
    }

    /**
     * Setter method for addDate.
     *
     * @param aAddDate the new value for addDate
     */
    public void setAddDate(Timestamp aAddDate) {
        addDate = aAddDate;
    }

    /**
     * Access method for addUsername.
     *
     * @return the current value of addUsername
     */
    public String getAddUsername() {
        return addUsername;
    }

    /**
     * Setter method for addUsername.
     *
     * @param aAddUsername the new value for addUsername
     */
    public void setAddUsername(String aAddUsername) {
        addUsername = aAddUsername;
    }

    /**
     * Access method for updateDate.
     *
     * @return the current value of updateDate
     */
    public Timestamp getUpdateDate() {
        return updateDate;
    }

    /**
     * Setter method for updateDate.
     *
     * @param aUpdateDate the new value for updateDate
     */
    public void setUpdateDate(Timestamp aUpdateDate) {
        updateDate = aUpdateDate;
    }

    /**
     * Access method for updateUsername.
     *
     * @return the current value of updateUsername
     */
    public String getUpdateUsername() {
        return updateUsername;
    }

    /**
     * Setter method for updateUsername.
     *
     * @param aUpdateUsername the new value for updateUsername
     */
    public void setUpdateUsername(String aUpdateUsername) {
        updateUsername = aUpdateUsername;
    }

    /**
     * Access method for solAssociation.
     *
     * @return the current value of solAssociation
     */
    public Set<SolAssociation> getSolAssociation() {
        return solAssociation;
    }

    /**
     * Setter method for solAssociation.
     *
     * @param aSolAssociation the new value for solAssociation
     */
    public void setSolAssociation(Set<SolAssociation> aSolAssociation) {
        solAssociation = aSolAssociation;
    }

    /**
     * Compares the key for this instance with another SolAssociationType.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class SolAssociationType and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof SolAssociationType)) {
            return false;
        }
        SolAssociationType that = (SolAssociationType) other;
        Object mySolAssociationTypeId = this.getSolAssociationTypeId();
        Object yourSolAssociationTypeId = that.getSolAssociationTypeId();
        if (mySolAssociationTypeId==null ? yourSolAssociationTypeId!=null : !mySolAssociationTypeId.equals(yourSolAssociationTypeId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another SolAssociationType.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof SolAssociationType)) return false;
        return this.equalKeys(other) && ((SolAssociationType)other).equalKeys(this);
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
        if (getSolAssociationTypeId() == null) {
            i = 0;
        } else {
            i = getSolAssociationTypeId().hashCode();
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
        StringBuffer sb = new StringBuffer("[SolAssociationType |");
        sb.append(" solAssociationTypeId=").append(getSolAssociationTypeId());
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
        ret.put("solAssociationTypeId", getSolAssociationTypeId());
        return ret;
    }

}
