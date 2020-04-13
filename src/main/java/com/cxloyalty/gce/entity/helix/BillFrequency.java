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

@Entity(name="bill_frequency")
public class BillFrequency implements Serializable {

    /** Primary key. */
    protected static final String PK = "billFrequencyId";

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
    @Column(name="bill_frequency_id", unique=true, nullable=false, precision=9)
    private BigDecimal billFrequencyId;
    @Column(name="bill_frequency_desc", length=200)
    private String billFrequencyDesc;
    @Column(name="user_created", nullable=false, length=200)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=200)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @OneToMany(mappedBy="billFrequency")
    private Set<UpOfferDetail> upOfferDetail;

    /** Default constructor. */
    public BillFrequency() {
        super();
    }

    /**
     * Access method for billFrequencyId.
     *
     * @return the current value of billFrequencyId
     */
    public BigDecimal getBillFrequencyId() {
        return billFrequencyId;
    }

    /**
     * Setter method for billFrequencyId.
     *
     * @param aBillFrequencyId the new value for billFrequencyId
     */
    public void setBillFrequencyId(BigDecimal aBillFrequencyId) {
        billFrequencyId = aBillFrequencyId;
    }

    /**
     * Access method for billFrequencyDesc.
     *
     * @return the current value of billFrequencyDesc
     */
    public String getBillFrequencyDesc() {
        return billFrequencyDesc;
    }

    /**
     * Setter method for billFrequencyDesc.
     *
     * @param aBillFrequencyDesc the new value for billFrequencyDesc
     */
    public void setBillFrequencyDesc(String aBillFrequencyDesc) {
        billFrequencyDesc = aBillFrequencyDesc;
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
     * Access method for upOfferDetail.
     *
     * @return the current value of upOfferDetail
     */
    public Set<UpOfferDetail> getUpOfferDetail() {
        return upOfferDetail;
    }

    /**
     * Setter method for upOfferDetail.
     *
     * @param aUpOfferDetail the new value for upOfferDetail
     */
    public void setUpOfferDetail(Set<UpOfferDetail> aUpOfferDetail) {
        upOfferDetail = aUpOfferDetail;
    }

    /**
     * Compares the key for this instance with another BillFrequency.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class BillFrequency and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof BillFrequency)) {
            return false;
        }
        BillFrequency that = (BillFrequency) other;
        Object myBillFrequencyId = this.getBillFrequencyId();
        Object yourBillFrequencyId = that.getBillFrequencyId();
        if (myBillFrequencyId==null ? yourBillFrequencyId!=null : !myBillFrequencyId.equals(yourBillFrequencyId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another BillFrequency.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof BillFrequency)) return false;
        return this.equalKeys(other) && ((BillFrequency)other).equalKeys(this);
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
        if (getBillFrequencyId() == null) {
            i = 0;
        } else {
            i = getBillFrequencyId().hashCode();
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
        StringBuffer sb = new StringBuffer("[BillFrequency |");
        sb.append(" billFrequencyId=").append(getBillFrequencyId());
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
        ret.put("billFrequencyId", getBillFrequencyId());
        return ret;
    }

}
