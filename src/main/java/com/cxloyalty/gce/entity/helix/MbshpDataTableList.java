// Generated with g9.

package com.cxloyalty.gce.entity.helix;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name="mbshp_data_table_list")
public class MbshpDataTableList implements Serializable {

    /** Primary key. */
    protected static final String PK = "id";

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
    @Column(unique=true, nullable=false, precision=5)
    private BigDecimal id;
    @Column(name="table_name", length=50)
    private String tableName;
    @Column(name="delete_flag", length=5)
    private String deleteFlag;

    /** Default constructor. */
    public MbshpDataTableList() {
        super();
    }

    /**
     * Access method for id.
     *
     * @return the current value of id
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * Setter method for id.
     *
     * @param aId the new value for id
     */
    public void setId(BigDecimal aId) {
        id = aId;
    }

    /**
     * Access method for tableName.
     *
     * @return the current value of tableName
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * Setter method for tableName.
     *
     * @param aTableName the new value for tableName
     */
    public void setTableName(String aTableName) {
        tableName = aTableName;
    }

    /**
     * Access method for deleteFlag.
     *
     * @return the current value of deleteFlag
     */
    public String getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * Setter method for deleteFlag.
     *
     * @param aDeleteFlag the new value for deleteFlag
     */
    public void setDeleteFlag(String aDeleteFlag) {
        deleteFlag = aDeleteFlag;
    }

    /**
     * Compares the key for this instance with another MbshpDataTableList.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class MbshpDataTableList and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof MbshpDataTableList)) {
            return false;
        }
        MbshpDataTableList that = (MbshpDataTableList) other;
        Object myId = this.getId();
        Object yourId = that.getId();
        if (myId==null ? yourId!=null : !myId.equals(yourId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another MbshpDataTableList.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof MbshpDataTableList)) return false;
        return this.equalKeys(other) && ((MbshpDataTableList)other).equalKeys(this);
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
        if (getId() == null) {
            i = 0;
        } else {
            i = getId().hashCode();
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
        StringBuffer sb = new StringBuffer("[MbshpDataTableList |");
        sb.append(" id=").append(getId());
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
        ret.put("id", getId());
        return ret;
    }

}
