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

@Entity(name="renewal_type")
public class RenewalType implements Serializable {

    /** Primary key. */
    protected static final String PK = "renewalTypeId";

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
    @Column(name="renewal_type_id", unique=true, nullable=false, precision=9)
    private BigDecimal renewalTypeId;
    @Column(name="renewal_type_desc", length=200)
    private String renewalTypeDesc;
    @Column(name="user_created", nullable=false, length=200)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=200)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @OneToMany(mappedBy="renewalType")
    private Set<UserpaysDetail> userpaysDetail;

    /** Default constructor. */
    public RenewalType() {
        super();
    }

    /**
     * Access method for renewalTypeId.
     *
     * @return the current value of renewalTypeId
     */
    public BigDecimal getRenewalTypeId() {
        return renewalTypeId;
    }

    /**
     * Setter method for renewalTypeId.
     *
     * @param aRenewalTypeId the new value for renewalTypeId
     */
    public void setRenewalTypeId(BigDecimal aRenewalTypeId) {
        renewalTypeId = aRenewalTypeId;
    }

    /**
     * Access method for renewalTypeDesc.
     *
     * @return the current value of renewalTypeDesc
     */
    public String getRenewalTypeDesc() {
        return renewalTypeDesc;
    }

    /**
     * Setter method for renewalTypeDesc.
     *
     * @param aRenewalTypeDesc the new value for renewalTypeDesc
     */
    public void setRenewalTypeDesc(String aRenewalTypeDesc) {
        renewalTypeDesc = aRenewalTypeDesc;
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
     * Access method for userpaysDetail.
     *
     * @return the current value of userpaysDetail
     */
    public Set<UserpaysDetail> getUserpaysDetail() {
        return userpaysDetail;
    }

    /**
     * Setter method for userpaysDetail.
     *
     * @param aUserpaysDetail the new value for userpaysDetail
     */
    public void setUserpaysDetail(Set<UserpaysDetail> aUserpaysDetail) {
        userpaysDetail = aUserpaysDetail;
    }

    /**
     * Compares the key for this instance with another RenewalType.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class RenewalType and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof RenewalType)) {
            return false;
        }
        RenewalType that = (RenewalType) other;
        Object myRenewalTypeId = this.getRenewalTypeId();
        Object yourRenewalTypeId = that.getRenewalTypeId();
        if (myRenewalTypeId==null ? yourRenewalTypeId!=null : !myRenewalTypeId.equals(yourRenewalTypeId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another RenewalType.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof RenewalType)) return false;
        return this.equalKeys(other) && ((RenewalType)other).equalKeys(this);
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
        if (getRenewalTypeId() == null) {
            i = 0;
        } else {
            i = getRenewalTypeId().hashCode();
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
        StringBuffer sb = new StringBuffer("[RenewalType |");
        sb.append(" renewalTypeId=").append(getRenewalTypeId());
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
        ret.put("renewalTypeId", getRenewalTypeId());
        return ret;
    }

}
