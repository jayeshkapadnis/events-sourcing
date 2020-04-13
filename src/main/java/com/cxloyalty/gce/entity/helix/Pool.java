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

@Entity(name="pool")
public class Pool implements Serializable {

    /** Primary key. */
    protected static final String PK = "poolId";

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
    @Column(name="pool_id", unique=true, nullable=false, precision=10)
    private BigDecimal poolId;
    @Column(name="pool_desc", nullable=false, length=50)
    private String poolDesc;
    @Column(name="user_created", length=30)
    private String userCreated;
    @Column(name="date_created")
    private Timestamp dateCreated;
    @Column(name="user_modified", length=30)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @Column(name="max_freq_bypass_fl", precision=1)
    private BigDecimal maxFreqBypassFl;
    @Column(name="last_seen_bypass_fl", precision=1)
    private BigDecimal lastSeenBypassFl;
    @Column(name="cref_required_fl", precision=1)
    private BigDecimal crefRequiredFl;
    @OneToMany(mappedBy="pool")
    private Set<PoolSource> poolSource;
    @OneToMany(mappedBy="pool")
    private Set<SolicitationPool> solicitationPool;

    /** Default constructor. */
    public Pool() {
        super();
    }

    /**
     * Access method for poolId.
     *
     * @return the current value of poolId
     */
    public BigDecimal getPoolId() {
        return poolId;
    }

    /**
     * Setter method for poolId.
     *
     * @param aPoolId the new value for poolId
     */
    public void setPoolId(BigDecimal aPoolId) {
        poolId = aPoolId;
    }

    /**
     * Access method for poolDesc.
     *
     * @return the current value of poolDesc
     */
    public String getPoolDesc() {
        return poolDesc;
    }

    /**
     * Setter method for poolDesc.
     *
     * @param aPoolDesc the new value for poolDesc
     */
    public void setPoolDesc(String aPoolDesc) {
        poolDesc = aPoolDesc;
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
     * Access method for maxFreqBypassFl.
     *
     * @return the current value of maxFreqBypassFl
     */
    public BigDecimal getMaxFreqBypassFl() {
        return maxFreqBypassFl;
    }

    /**
     * Setter method for maxFreqBypassFl.
     *
     * @param aMaxFreqBypassFl the new value for maxFreqBypassFl
     */
    public void setMaxFreqBypassFl(BigDecimal aMaxFreqBypassFl) {
        maxFreqBypassFl = aMaxFreqBypassFl;
    }

    /**
     * Access method for lastSeenBypassFl.
     *
     * @return the current value of lastSeenBypassFl
     */
    public BigDecimal getLastSeenBypassFl() {
        return lastSeenBypassFl;
    }

    /**
     * Setter method for lastSeenBypassFl.
     *
     * @param aLastSeenBypassFl the new value for lastSeenBypassFl
     */
    public void setLastSeenBypassFl(BigDecimal aLastSeenBypassFl) {
        lastSeenBypassFl = aLastSeenBypassFl;
    }

    /**
     * Access method for crefRequiredFl.
     *
     * @return the current value of crefRequiredFl
     */
    public BigDecimal getCrefRequiredFl() {
        return crefRequiredFl;
    }

    /**
     * Setter method for crefRequiredFl.
     *
     * @param aCrefRequiredFl the new value for crefRequiredFl
     */
    public void setCrefRequiredFl(BigDecimal aCrefRequiredFl) {
        crefRequiredFl = aCrefRequiredFl;
    }

    /**
     * Access method for poolSource.
     *
     * @return the current value of poolSource
     */
    public Set<PoolSource> getPoolSource() {
        return poolSource;
    }

    /**
     * Setter method for poolSource.
     *
     * @param aPoolSource the new value for poolSource
     */
    public void setPoolSource(Set<PoolSource> aPoolSource) {
        poolSource = aPoolSource;
    }

    /**
     * Access method for solicitationPool.
     *
     * @return the current value of solicitationPool
     */
    public Set<SolicitationPool> getSolicitationPool() {
        return solicitationPool;
    }

    /**
     * Setter method for solicitationPool.
     *
     * @param aSolicitationPool the new value for solicitationPool
     */
    public void setSolicitationPool(Set<SolicitationPool> aSolicitationPool) {
        solicitationPool = aSolicitationPool;
    }

    /**
     * Compares the key for this instance with another Pool.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Pool and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Pool)) {
            return false;
        }
        Pool that = (Pool) other;
        Object myPoolId = this.getPoolId();
        Object yourPoolId = that.getPoolId();
        if (myPoolId==null ? yourPoolId!=null : !myPoolId.equals(yourPoolId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Pool.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Pool)) return false;
        return this.equalKeys(other) && ((Pool)other).equalKeys(this);
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
        if (getPoolId() == null) {
            i = 0;
        } else {
            i = getPoolId().hashCode();
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
        StringBuffer sb = new StringBuffer("[Pool |");
        sb.append(" poolId=").append(getPoolId());
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
        ret.put("poolId", getPoolId());
        return ret;
    }

}
