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
@Table(name="state", indexes={@Index(name="state_iso_3166_2_IX", columnList="iso_3166_2", unique=true), @Index(name="stateIdxStateCountryidAbbr", columnList="country_id,abbreviation", unique=true)})
public class State implements Serializable {

    /** Primary key. */
    protected static final String PK = "stateId";

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
    @Column(name="state_id", unique=true, nullable=false, precision=16)
    private BigDecimal stateId;
    @Column(nullable=false, length=3)
    private String abbreviation;
    @Column(name="iso_3166_2", unique=true, nullable=false, length=6)
    private String iso31662;
    @Column(nullable=false, length=100)
    private String description;
    @Column(name="user_created", nullable=false, length=50)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=50)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @ManyToOne(optional=false)
    @JoinColumn(name="country_id", nullable=false)
    private Country country;

    /** Default constructor. */
    public State() {
        super();
    }

    /**
     * Access method for stateId.
     *
     * @return the current value of stateId
     */
    public BigDecimal getStateId() {
        return stateId;
    }

    /**
     * Setter method for stateId.
     *
     * @param aStateId the new value for stateId
     */
    public void setStateId(BigDecimal aStateId) {
        stateId = aStateId;
    }

    /**
     * Access method for abbreviation.
     *
     * @return the current value of abbreviation
     */
    public String getAbbreviation() {
        return abbreviation;
    }

    /**
     * Setter method for abbreviation.
     *
     * @param aAbbreviation the new value for abbreviation
     */
    public void setAbbreviation(String aAbbreviation) {
        abbreviation = aAbbreviation;
    }

    /**
     * Access method for iso31662.
     *
     * @return the current value of iso31662
     */
    public String getIso31662() {
        return iso31662;
    }

    /**
     * Setter method for iso31662.
     *
     * @param aIso31662 the new value for iso31662
     */
    public void setIso31662(String aIso31662) {
        iso31662 = aIso31662;
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
     * Access method for country.
     *
     * @return the current value of country
     */
    public Country getCountry() {
        return country;
    }

    /**
     * Setter method for country.
     *
     * @param aCountry the new value for country
     */
    public void setCountry(Country aCountry) {
        country = aCountry;
    }

    /**
     * Gets the group fragment countryId for member country.
     *
     * @return Current value of the group fragment
     * @see Country
     */
    public BigDecimal getCountryCountryId() {
        return (getCountry() == null ? null : getCountry().getCountryId());
    }

    /**
     * Sets the group fragment countryId from member country.
     *
     * @param aCountryId New value for the group fragment
     * @see Country
     */
    public void setCountryCountryId(BigDecimal aCountryId) {
        if (getCountry() != null) {
            getCountry().setCountryId(aCountryId);
        }
    }

    /**
     * Compares the key for this instance with another State.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class State and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State that = (State) other;
        Object myStateId = this.getStateId();
        Object yourStateId = that.getStateId();
        if (myStateId==null ? yourStateId!=null : !myStateId.equals(yourStateId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another State.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof State)) return false;
        return this.equalKeys(other) && ((State)other).equalKeys(this);
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
        if (getStateId() == null) {
            i = 0;
        } else {
            i = getStateId().hashCode();
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
        StringBuffer sb = new StringBuffer("[State |");
        sb.append(" stateId=").append(getStateId());
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
        ret.put("stateId", getStateId());
        return ret;
    }

}
