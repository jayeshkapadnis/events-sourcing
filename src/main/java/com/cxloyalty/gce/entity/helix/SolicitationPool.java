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
@Table(name="solicitation_pool", indexes={@Index(name="solicitationPoolUidxSolicitationPool", columnList="sol_id,pool_id", unique=true)})
public class SolicitationPool implements Serializable {

    /** Primary key. */
    protected static final String PK = "solicitationPoolId";

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

    @Column(name="active_fl", nullable=false, precision=1)
    private BigDecimal activeFl;
    @Column(nullable=false, precision=10)
    private BigDecimal weight;
    @Column(name="priority_sequence", nullable=false, precision=3)
    private BigDecimal prioritySequence;
    @Column(name="user_created", nullable=false, length=30)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=30)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @Column(name="default_start_date")
    private Timestamp defaultStartDate;
    @Column(name="default_end_date")
    private Timestamp defaultEndDate;
    @Id
    @Column(name="solicitation_pool_id", unique=true, nullable=false, precision=16)
    private BigDecimal solicitationPoolId;
    @ManyToOne(optional=false)
    @JoinColumn(name="pool_id", nullable=false)
    private Pool pool;
    @ManyToOne(optional=false)
    @JoinColumn(name="sol_id", nullable=false)
    private Solicitation solicitation;

    /** Default constructor. */
    public SolicitationPool() {
        super();
    }

    /**
     * Access method for activeFl.
     *
     * @return the current value of activeFl
     */
    public BigDecimal getActiveFl() {
        return activeFl;
    }

    /**
     * Setter method for activeFl.
     *
     * @param aActiveFl the new value for activeFl
     */
    public void setActiveFl(BigDecimal aActiveFl) {
        activeFl = aActiveFl;
    }

    /**
     * Access method for weight.
     *
     * @return the current value of weight
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * Setter method for weight.
     *
     * @param aWeight the new value for weight
     */
    public void setWeight(BigDecimal aWeight) {
        weight = aWeight;
    }

    /**
     * Access method for prioritySequence.
     *
     * @return the current value of prioritySequence
     */
    public BigDecimal getPrioritySequence() {
        return prioritySequence;
    }

    /**
     * Setter method for prioritySequence.
     *
     * @param aPrioritySequence the new value for prioritySequence
     */
    public void setPrioritySequence(BigDecimal aPrioritySequence) {
        prioritySequence = aPrioritySequence;
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
     * Access method for defaultStartDate.
     *
     * @return the current value of defaultStartDate
     */
    public Timestamp getDefaultStartDate() {
        return defaultStartDate;
    }

    /**
     * Setter method for defaultStartDate.
     *
     * @param aDefaultStartDate the new value for defaultStartDate
     */
    public void setDefaultStartDate(Timestamp aDefaultStartDate) {
        defaultStartDate = aDefaultStartDate;
    }

    /**
     * Access method for defaultEndDate.
     *
     * @return the current value of defaultEndDate
     */
    public Timestamp getDefaultEndDate() {
        return defaultEndDate;
    }

    /**
     * Setter method for defaultEndDate.
     *
     * @param aDefaultEndDate the new value for defaultEndDate
     */
    public void setDefaultEndDate(Timestamp aDefaultEndDate) {
        defaultEndDate = aDefaultEndDate;
    }

    /**
     * Access method for solicitationPoolId.
     *
     * @return the current value of solicitationPoolId
     */
    public BigDecimal getSolicitationPoolId() {
        return solicitationPoolId;
    }

    /**
     * Setter method for solicitationPoolId.
     *
     * @param aSolicitationPoolId the new value for solicitationPoolId
     */
    public void setSolicitationPoolId(BigDecimal aSolicitationPoolId) {
        solicitationPoolId = aSolicitationPoolId;
    }

    /**
     * Access method for pool.
     *
     * @return the current value of pool
     */
    public Pool getPool() {
        return pool;
    }

    /**
     * Setter method for pool.
     *
     * @param aPool the new value for pool
     */
    public void setPool(Pool aPool) {
        pool = aPool;
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
     * Gets the group fragment solId for member solicitation.
     *
     * @return Current value of the group fragment
     * @see Solicitation
     */
    public BigDecimal getSolicitationSolId() {
        return (getSolicitation() == null ? null : getSolicitation().getSolId());
    }

    /**
     * Sets the group fragment solId from member solicitation.
     *
     * @param aSolId New value for the group fragment
     * @see Solicitation
     */
    public void setSolicitationSolId(BigDecimal aSolId) {
        if (getSolicitation() != null) {
            getSolicitation().setSolId(aSolId);
        }
    }

    /**
     * Gets the group fragment poolId for member pool.
     *
     * @return Current value of the group fragment
     * @see Pool
     */
    public BigDecimal getPoolPoolId() {
        return (getPool() == null ? null : getPool().getPoolId());
    }

    /**
     * Sets the group fragment poolId from member pool.
     *
     * @param aPoolId New value for the group fragment
     * @see Pool
     */
    public void setPoolPoolId(BigDecimal aPoolId) {
        if (getPool() != null) {
            getPool().setPoolId(aPoolId);
        }
    }

    /**
     * Compares the key for this instance with another SolicitationPool.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class SolicitationPool and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof SolicitationPool)) {
            return false;
        }
        SolicitationPool that = (SolicitationPool) other;
        Object mySolicitationPoolId = this.getSolicitationPoolId();
        Object yourSolicitationPoolId = that.getSolicitationPoolId();
        if (mySolicitationPoolId==null ? yourSolicitationPoolId!=null : !mySolicitationPoolId.equals(yourSolicitationPoolId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another SolicitationPool.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof SolicitationPool)) return false;
        return this.equalKeys(other) && ((SolicitationPool)other).equalKeys(this);
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
        if (getSolicitationPoolId() == null) {
            i = 0;
        } else {
            i = getSolicitationPoolId().hashCode();
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
        StringBuffer sb = new StringBuffer("[SolicitationPool |");
        sb.append(" solicitationPoolId=").append(getSolicitationPoolId());
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
        ret.put("solicitationPoolId", getSolicitationPoolId());
        return ret;
    }

}
