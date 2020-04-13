// Generated with g9.

package com.cxloyalty.gce.entity.helix;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="up_offer")
public class UpOffer implements Serializable {

    /** Primary key. */
    protected static final String PK = "upOfferGuid";

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
    @Column(name="up_offer_guid", unique=true, nullable=false, length=36)
    private String upOfferGuid;
    @Column(name="start_date", nullable=false)
    private Timestamp startDate;
    @Column(name="end_date")
    private Timestamp endDate;
    @Column(name="offer_description", length=400)
    private String offerDescription;
    @Column(name="user_created", nullable=false, length=200)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=200)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @OneToMany(mappedBy="upOffer")
    private Set<UpOfferDetail> upOfferDetail;
    @ManyToOne(optional=false)
    @JoinColumn(name="pkg_id", nullable=false)
    private Package package_;

    /** Default constructor. */
    public UpOffer() {
        super();
    }

    /**
     * Access method for upOfferGuid.
     *
     * @return the current value of upOfferGuid
     */
    public String getUpOfferGuid() {
        return upOfferGuid;
    }

    /**
     * Setter method for upOfferGuid.
     *
     * @param aUpOfferGuid the new value for upOfferGuid
     */
    public void setUpOfferGuid(String aUpOfferGuid) {
        upOfferGuid = aUpOfferGuid;
    }

    /**
     * Access method for startDate.
     *
     * @return the current value of startDate
     */
    public Timestamp getStartDate() {
        return startDate;
    }

    /**
     * Setter method for startDate.
     *
     * @param aStartDate the new value for startDate
     */
    public void setStartDate(Timestamp aStartDate) {
        startDate = aStartDate;
    }

    /**
     * Access method for endDate.
     *
     * @return the current value of endDate
     */
    public Timestamp getEndDate() {
        return endDate;
    }

    /**
     * Setter method for endDate.
     *
     * @param aEndDate the new value for endDate
     */
    public void setEndDate(Timestamp aEndDate) {
        endDate = aEndDate;
    }

    /**
     * Access method for offerDescription.
     *
     * @return the current value of offerDescription
     */
    public String getOfferDescription() {
        return offerDescription;
    }

    /**
     * Setter method for offerDescription.
     *
     * @param aOfferDescription the new value for offerDescription
     */
    public void setOfferDescription(String aOfferDescription) {
        offerDescription = aOfferDescription;
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
     * Access method for package_.
     *
     * @return the current value of package_
     */
    public Package getPackage_() {
        return package_;
    }

    /**
     * Setter method for package_.
     *
     * @param aPackage_ the new value for package_
     */
    public void setPackage_(Package aPackage_) {
        package_ = aPackage_;
    }

    /**
     * Compares the key for this instance with another UpOffer.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class UpOffer and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof UpOffer)) {
            return false;
        }
        UpOffer that = (UpOffer) other;
        Object myUpOfferGuid = this.getUpOfferGuid();
        Object yourUpOfferGuid = that.getUpOfferGuid();
        if (myUpOfferGuid==null ? yourUpOfferGuid!=null : !myUpOfferGuid.equals(yourUpOfferGuid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another UpOffer.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof UpOffer)) return false;
        return this.equalKeys(other) && ((UpOffer)other).equalKeys(this);
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
        if (getUpOfferGuid() == null) {
            i = 0;
        } else {
            i = getUpOfferGuid().hashCode();
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
        StringBuffer sb = new StringBuffer("[UpOffer |");
        sb.append(" upOfferGuid=").append(getUpOfferGuid());
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
        ret.put("upOfferGuid", getUpOfferGuid());
        return ret;
    }

}
