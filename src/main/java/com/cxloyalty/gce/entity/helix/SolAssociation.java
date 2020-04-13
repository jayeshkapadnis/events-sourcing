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

@Entity(name="sol_association")
public class SolAssociation implements Serializable {

    /** Primary key. */
    protected static final String PK = "solAssociationId";

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
    @Column(name="sol_association_id", unique=true, nullable=false, precision=9)
    private BigDecimal solAssociationId;
    @Column(name="add_date")
    private Timestamp addDate;
    @Column(name="add_username", length=200)
    private String addUsername;
    @Column(name="update_date")
    private Timestamp updateDate;
    @Column(name="update_username", length=200)
    private String updateUsername;
    @Column(name="active_flag", length=1)
    private String activeFlag;
    @ManyToOne
    @JoinColumn(name="from_sol_id")
    private Solicitation solicitation;
    @ManyToOne
    @JoinColumn(name="to_sol_id")
    private Solicitation solicitation2;
    @ManyToOne
    @JoinColumn(name="sol_association_type_id")
    private SolAssociationType solAssociationType;

    /** Default constructor. */
    public SolAssociation() {
        super();
    }

    /**
     * Access method for solAssociationId.
     *
     * @return the current value of solAssociationId
     */
    public BigDecimal getSolAssociationId() {
        return solAssociationId;
    }

    /**
     * Setter method for solAssociationId.
     *
     * @param aSolAssociationId the new value for solAssociationId
     */
    public void setSolAssociationId(BigDecimal aSolAssociationId) {
        solAssociationId = aSolAssociationId;
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
     * Access method for activeFlag.
     *
     * @return the current value of activeFlag
     */
    public String getActiveFlag() {
        return activeFlag;
    }

    /**
     * Setter method for activeFlag.
     *
     * @param aActiveFlag the new value for activeFlag
     */
    public void setActiveFlag(String aActiveFlag) {
        activeFlag = aActiveFlag;
    }

    /**
     * Access method for solicitation.
     *
     * @return the current value of solicitation
     */
    public Solicitation getSolicitation() {
        return solicitation;
    }

    /**
     * Setter method for solicitation.
     *
     * @param aSolicitation the new value for solicitation
     */
    public void setSolicitation(Solicitation aSolicitation) {
        solicitation = aSolicitation;
    }

    /**
     * Access method for solicitation2.
     *
     * @return the current value of solicitation2
     */
    public Solicitation getSolicitation2() {
        return solicitation2;
    }

    /**
     * Setter method for solicitation2.
     *
     * @param aSolicitation2 the new value for solicitation2
     */
    public void setSolicitation2(Solicitation aSolicitation2) {
        solicitation2 = aSolicitation2;
    }

    /**
     * Access method for solAssociationType.
     *
     * @return the current value of solAssociationType
     */
    public SolAssociationType getSolAssociationType() {
        return solAssociationType;
    }

    /**
     * Setter method for solAssociationType.
     *
     * @param aSolAssociationType the new value for solAssociationType
     */
    public void setSolAssociationType(SolAssociationType aSolAssociationType) {
        solAssociationType = aSolAssociationType;
    }

    /**
     * Compares the key for this instance with another SolAssociation.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class SolAssociation and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof SolAssociation)) {
            return false;
        }
        SolAssociation that = (SolAssociation) other;
        Object mySolAssociationId = this.getSolAssociationId();
        Object yourSolAssociationId = that.getSolAssociationId();
        if (mySolAssociationId==null ? yourSolAssociationId!=null : !mySolAssociationId.equals(yourSolAssociationId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another SolAssociation.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof SolAssociation)) return false;
        return this.equalKeys(other) && ((SolAssociation)other).equalKeys(this);
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
        if (getSolAssociationId() == null) {
            i = 0;
        } else {
            i = getSolAssociationId().hashCode();
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
        StringBuffer sb = new StringBuffer("[SolAssociation |");
        sb.append(" solAssociationId=").append(getSolAssociationId());
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
        ret.put("solAssociationId", getSolAssociationId());
        return ret;
    }

}
