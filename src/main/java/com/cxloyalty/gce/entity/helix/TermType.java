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

@Entity(name="term_type")
public class TermType implements Serializable {

    /** Primary key. */
    protected static final String PK = "termTypeId";

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
    @Column(name="term_type_id", unique=true, nullable=false, precision=10)
    private BigDecimal termTypeId;
    @Column(name="term_type_desc", nullable=false, length=100)
    private String termTypeDesc;
    @Column(name="user_created", length=30)
    private String userCreated;
    @Column(name="date_created")
    private Timestamp dateCreated;
    @Column(name="user_modified", length=30)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;

    /** Default constructor. */
    public TermType() {
        super();
    }

    /**
     * Access method for termTypeId.
     *
     * @return the current value of termTypeId
     */
    public BigDecimal getTermTypeId() {
        return termTypeId;
    }

    /**
     * Setter method for termTypeId.
     *
     * @param aTermTypeId the new value for termTypeId
     */
    public void setTermTypeId(BigDecimal aTermTypeId) {
        termTypeId = aTermTypeId;
    }

    /**
     * Access method for termTypeDesc.
     *
     * @return the current value of termTypeDesc
     */
    public String getTermTypeDesc() {
        return termTypeDesc;
    }

    /**
     * Setter method for termTypeDesc.
     *
     * @param aTermTypeDesc the new value for termTypeDesc
     */
    public void setTermTypeDesc(String aTermTypeDesc) {
        termTypeDesc = aTermTypeDesc;
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
     * Compares the key for this instance with another TermType.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class TermType and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof TermType)) {
            return false;
        }
        TermType that = (TermType) other;
        Object myTermTypeId = this.getTermTypeId();
        Object yourTermTypeId = that.getTermTypeId();
        if (myTermTypeId==null ? yourTermTypeId!=null : !myTermTypeId.equals(yourTermTypeId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another TermType.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof TermType)) return false;
        return this.equalKeys(other) && ((TermType)other).equalKeys(this);
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
        if (getTermTypeId() == null) {
            i = 0;
        } else {
            i = getTermTypeId().hashCode();
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
        StringBuffer sb = new StringBuffer("[TermType |");
        sb.append(" termTypeId=").append(getTermTypeId());
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
        ret.put("termTypeId", getTermTypeId());
        return ret;
    }

}
