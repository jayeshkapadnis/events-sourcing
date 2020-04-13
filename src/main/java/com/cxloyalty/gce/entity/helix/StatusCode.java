// Generated with g9.

package com.cxloyalty.gce.entity.helix;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name="status_code")
public class StatusCode implements Serializable {

    /** Primary key. */
    protected static final String PK = "statusCode";

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
    @Column(name="status_code", unique=true, nullable=false, length=1)
    private String statusCode;
    @Column(nullable=false, length=32)
    private String description;

    /** Default constructor. */
    public StatusCode() {
        super();
    }

    /**
     * Access method for statusCode.
     *
     * @return the current value of statusCode
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Setter method for statusCode.
     *
     * @param aStatusCode the new value for statusCode
     */
    public void setStatusCode(String aStatusCode) {
        statusCode = aStatusCode;
    }

    /**
     * Access method for description.
     *
     * @return the current value of description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter method for description.
     *
     * @param aDescription the new value for description
     */
    public void setDescription(String aDescription) {
        description = aDescription;
    }

    /**
     * Compares the key for this instance with another StatusCode.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class StatusCode and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof StatusCode)) {
            return false;
        }
        StatusCode that = (StatusCode) other;
        Object myStatusCode = this.getStatusCode();
        Object yourStatusCode = that.getStatusCode();
        if (myStatusCode==null ? yourStatusCode!=null : !myStatusCode.equals(yourStatusCode)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another StatusCode.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof StatusCode)) return false;
        return this.equalKeys(other) && ((StatusCode)other).equalKeys(this);
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
        if (getStatusCode() == null) {
            i = 0;
        } else {
            i = getStatusCode().hashCode();
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
        StringBuffer sb = new StringBuffer("[StatusCode |");
        sb.append(" statusCode=").append(getStatusCode());
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
        ret.put("statusCode", getStatusCode());
        return ret;
    }

}
