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

@Entity(name="up_payment_processor")
public class UpPaymentProcessor implements Serializable {

    /** Primary key. */
    protected static final String PK = "upPaymentProcessorId";

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
    @Column(name="up_payment_processor_id", unique=true, nullable=false, precision=9)
    private BigDecimal upPaymentProcessorId;
    @Column(name="up_payment_processor_desc", length=200)
    private String upPaymentProcessorDesc;
    @Column(name="user_created", nullable=false, length=200)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=200)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @Column(name="up_payment_processor_type_desc", length=100)
    private String upPaymentProcessorTypeDesc;
    @OneToMany(mappedBy="upPaymentProcessor")
    private Set<UserpaysDetail> userpaysDetail;

    /** Default constructor. */
    public UpPaymentProcessor() {
        super();
    }

    /**
     * Access method for upPaymentProcessorId.
     *
     * @return the current value of upPaymentProcessorId
     */
    public BigDecimal getUpPaymentProcessorId() {
        return upPaymentProcessorId;
    }

    /**
     * Setter method for upPaymentProcessorId.
     *
     * @param aUpPaymentProcessorId the new value for upPaymentProcessorId
     */
    public void setUpPaymentProcessorId(BigDecimal aUpPaymentProcessorId) {
        upPaymentProcessorId = aUpPaymentProcessorId;
    }

    /**
     * Access method for upPaymentProcessorDesc.
     *
     * @return the current value of upPaymentProcessorDesc
     */
    public String getUpPaymentProcessorDesc() {
        return upPaymentProcessorDesc;
    }

    /**
     * Setter method for upPaymentProcessorDesc.
     *
     * @param aUpPaymentProcessorDesc the new value for upPaymentProcessorDesc
     */
    public void setUpPaymentProcessorDesc(String aUpPaymentProcessorDesc) {
        upPaymentProcessorDesc = aUpPaymentProcessorDesc;
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
     * Access method for upPaymentProcessorTypeDesc.
     *
     * @return the current value of upPaymentProcessorTypeDesc
     */
    public String getUpPaymentProcessorTypeDesc() {
        return upPaymentProcessorTypeDesc;
    }

    /**
     * Setter method for upPaymentProcessorTypeDesc.
     *
     * @param aUpPaymentProcessorTypeDesc the new value for upPaymentProcessorTypeDesc
     */
    public void setUpPaymentProcessorTypeDesc(String aUpPaymentProcessorTypeDesc) {
        upPaymentProcessorTypeDesc = aUpPaymentProcessorTypeDesc;
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
     * Compares the key for this instance with another UpPaymentProcessor.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class UpPaymentProcessor and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof UpPaymentProcessor)) {
            return false;
        }
        UpPaymentProcessor that = (UpPaymentProcessor) other;
        Object myUpPaymentProcessorId = this.getUpPaymentProcessorId();
        Object yourUpPaymentProcessorId = that.getUpPaymentProcessorId();
        if (myUpPaymentProcessorId==null ? yourUpPaymentProcessorId!=null : !myUpPaymentProcessorId.equals(yourUpPaymentProcessorId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another UpPaymentProcessor.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof UpPaymentProcessor)) return false;
        return this.equalKeys(other) && ((UpPaymentProcessor)other).equalKeys(this);
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
        if (getUpPaymentProcessorId() == null) {
            i = 0;
        } else {
            i = getUpPaymentProcessorId().hashCode();
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
        StringBuffer sb = new StringBuffer("[UpPaymentProcessor |");
        sb.append(" upPaymentProcessorId=").append(getUpPaymentProcessorId());
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
        ret.put("upPaymentProcessorId", getUpPaymentProcessorId());
        return ret;
    }

}
