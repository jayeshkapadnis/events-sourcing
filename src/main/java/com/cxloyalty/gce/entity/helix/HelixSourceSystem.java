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
import javax.persistence.Version;

@Entity(name="helix_source_system")
public class HelixSourceSystem implements Serializable {

    /** Primary key. */
    protected static final String PK = "sourceSystemId";

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
    @Column(name="source_system_id", unique=true, nullable=false, precision=4)
    private BigDecimal sourceSystemId;
    @Column(name="source_system_desc", length=40)
    private String sourceSystemDesc;
    @Column(name="user_created", nullable=false, length=200)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="batch_sla_flag", nullable=false, precision=1)
    private BigDecimal batchSlaFlag;

    /** Default constructor. */
    public HelixSourceSystem() {
        super();
    }

    /**
     * Access method for sourceSystemId.
     *
     * @return the current value of sourceSystemId
     */
    public BigDecimal getSourceSystemId() {
        return sourceSystemId;
    }

    /**
     * Setter method for sourceSystemId.
     *
     * @param aSourceSystemId the new value for sourceSystemId
     */
    public void setSourceSystemId(BigDecimal aSourceSystemId) {
        sourceSystemId = aSourceSystemId;
    }

    /**
     * Access method for sourceSystemDesc.
     *
     * @return the current value of sourceSystemDesc
     */
    public String getSourceSystemDesc() {
        return sourceSystemDesc;
    }

    /**
     * Setter method for sourceSystemDesc.
     *
     * @param aSourceSystemDesc the new value for sourceSystemDesc
     */
    public void setSourceSystemDesc(String aSourceSystemDesc) {
        sourceSystemDesc = aSourceSystemDesc;
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
     * Access method for batchSlaFlag.
     *
     * @return the current value of batchSlaFlag
     */
    public BigDecimal getBatchSlaFlag() {
        return batchSlaFlag;
    }

    /**
     * Setter method for batchSlaFlag.
     *
     * @param aBatchSlaFlag the new value for batchSlaFlag
     */
    public void setBatchSlaFlag(BigDecimal aBatchSlaFlag) {
        batchSlaFlag = aBatchSlaFlag;
    }

    /**
     * Compares the key for this instance with another HelixSourceSystem.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class HelixSourceSystem and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof HelixSourceSystem)) {
            return false;
        }
        HelixSourceSystem that = (HelixSourceSystem) other;
        Object mySourceSystemId = this.getSourceSystemId();
        Object yourSourceSystemId = that.getSourceSystemId();
        if (mySourceSystemId==null ? yourSourceSystemId!=null : !mySourceSystemId.equals(yourSourceSystemId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another HelixSourceSystem.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof HelixSourceSystem)) return false;
        return this.equalKeys(other) && ((HelixSourceSystem)other).equalKeys(this);
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
        if (getSourceSystemId() == null) {
            i = 0;
        } else {
            i = getSourceSystemId().hashCode();
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
        StringBuffer sb = new StringBuffer("[HelixSourceSystem |");
        sb.append(" sourceSystemId=").append(getSourceSystemId());
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
        ret.put("sourceSystemId", getSourceSystemId());
        return ret;
    }

}
