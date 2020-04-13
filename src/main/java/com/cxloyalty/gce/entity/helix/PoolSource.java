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
@Table(name="pool_source", indexes={@Index(name="poolSourceUidxPoolSource", columnList="source_id,pool_id", unique=true)})
public class PoolSource implements Serializable {

    /** Primary key. */
    protected static final String PK = "poolSourceId";

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
    @Column(name="pool_source_id", unique=true, nullable=false, precision=16)
    private BigDecimal poolSourceId;
    @ManyToOne(optional=false)
    @JoinColumn(name="pool_id", nullable=false)
    private Pool pool;
    @ManyToOne(optional=false)
    @JoinColumn(name="source_id", nullable=false)
    private Source source;

    /** Default constructor. */
    public PoolSource() {
        super();
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
     * Access method for poolSourceId.
     *
     * @return the current value of poolSourceId
     */
    public BigDecimal getPoolSourceId() {
        return poolSourceId;
    }

    /**
     * Setter method for poolSourceId.
     *
     * @param aPoolSourceId the new value for poolSourceId
     */
    public void setPoolSourceId(BigDecimal aPoolSourceId) {
        poolSourceId = aPoolSourceId;
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
     * Access method for source.
     *
     * @return the current value of source
     */
    public Source getSource() {
        return source;
    }

    /**
     * Setter method for source.
     *
     * @param aSource the new value for source
     */
    public void setSource(Source aSource) {
        source = aSource;
    }

    /**
     * Gets the group fragment sourceId for member source.
     *
     * @return Current value of the group fragment
     * @see Source
     */
    public BigDecimal getSourceSourceId() {
        return (getSource() == null ? null : getSource().getSourceId());
    }

    /**
     * Sets the group fragment sourceId from member source.
     *
     * @param aSourceId New value for the group fragment
     * @see Source
     */
    public void setSourceSourceId(BigDecimal aSourceId) {
        if (getSource() != null) {
            getSource().setSourceId(aSourceId);
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
     * Compares the key for this instance with another PoolSource.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class PoolSource and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof PoolSource)) {
            return false;
        }
        PoolSource that = (PoolSource) other;
        Object myPoolSourceId = this.getPoolSourceId();
        Object yourPoolSourceId = that.getPoolSourceId();
        if (myPoolSourceId==null ? yourPoolSourceId!=null : !myPoolSourceId.equals(yourPoolSourceId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another PoolSource.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof PoolSource)) return false;
        return this.equalKeys(other) && ((PoolSource)other).equalKeys(this);
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
        if (getPoolSourceId() == null) {
            i = 0;
        } else {
            i = getPoolSourceId().hashCode();
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
        StringBuffer sb = new StringBuffer("[PoolSource |");
        sb.append(" poolSourceId=").append(getPoolSourceId());
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
        ret.put("poolSourceId", getPoolSourceId());
        return ret;
    }

}
