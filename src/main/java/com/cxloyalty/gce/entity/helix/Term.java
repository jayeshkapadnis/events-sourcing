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

@Entity(name="term")
public class Term implements Serializable {

    /** Primary key. */
    protected static final String PK = "termId";

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
    @Column(name="term_id", unique=true, nullable=false, precision=10)
    private BigDecimal termId;
    @Column(name="term_desc", nullable=false, length=50)
    private String termDesc;
    @Column(name="time_unit_id", nullable=false, precision=10)
    private BigDecimal timeUnitId;
    @Column(name="unit_count", nullable=false, precision=10)
    private BigDecimal unitCount;
    @Column(name="user_created", nullable=false, length=30)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=30)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @Column(name="time_unit_name", length=100)
    private String timeUnitName;
    @OneToMany(mappedBy="term")
    private Set<UpOfferDetail> upOfferDetail;

    /** Default constructor. */
    public Term() {
        super();
    }

    /**
     * Access method for termId.
     *
     * @return the current value of termId
     */
    public BigDecimal getTermId() {
        return termId;
    }

    /**
     * Setter method for termId.
     *
     * @param aTermId the new value for termId
     */
    public void setTermId(BigDecimal aTermId) {
        termId = aTermId;
    }

    /**
     * Access method for termDesc.
     *
     * @return the current value of termDesc
     */
    public String getTermDesc() {
        return termDesc;
    }

    /**
     * Setter method for termDesc.
     *
     * @param aTermDesc the new value for termDesc
     */
    public void setTermDesc(String aTermDesc) {
        termDesc = aTermDesc;
    }

    /**
     * Access method for timeUnitId.
     *
     * @return the current value of timeUnitId
     */
    public BigDecimal getTimeUnitId() {
        return timeUnitId;
    }

    /**
     * Setter method for timeUnitId.
     *
     * @param aTimeUnitId the new value for timeUnitId
     */
    public void setTimeUnitId(BigDecimal aTimeUnitId) {
        timeUnitId = aTimeUnitId;
    }

    /**
     * Access method for unitCount.
     *
     * @return the current value of unitCount
     */
    public BigDecimal getUnitCount() {
        return unitCount;
    }

    /**
     * Setter method for unitCount.
     *
     * @param aUnitCount the new value for unitCount
     */
    public void setUnitCount(BigDecimal aUnitCount) {
        unitCount = aUnitCount;
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
     * Access method for timeUnitName.
     *
     * @return the current value of timeUnitName
     */
    public String getTimeUnitName() {
        return timeUnitName;
    }

    /**
     * Setter method for timeUnitName.
     *
     * @param aTimeUnitName the new value for timeUnitName
     */
    public void setTimeUnitName(String aTimeUnitName) {
        timeUnitName = aTimeUnitName;
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
     * Compares the key for this instance with another Term.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Term and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Term)) {
            return false;
        }
        Term that = (Term) other;
        Object myTermId = this.getTermId();
        Object yourTermId = that.getTermId();
        if (myTermId==null ? yourTermId!=null : !myTermId.equals(yourTermId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Term.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Term)) return false;
        return this.equalKeys(other) && ((Term)other).equalKeys(this);
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
        if (getTermId() == null) {
            i = 0;
        } else {
            i = getTermId().hashCode();
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
        StringBuffer sb = new StringBuffer("[Term |");
        sb.append(" termId=").append(getTermId());
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
        ret.put("termId", getTermId());
        return ret;
    }

}
