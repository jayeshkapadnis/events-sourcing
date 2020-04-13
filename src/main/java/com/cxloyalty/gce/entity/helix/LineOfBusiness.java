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

@Entity(name="line_of_business")
public class LineOfBusiness implements Serializable {

    /** Primary key. */
    protected static final String PK = "lobId";

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
    @Column(name="lob_id", unique=true, nullable=false, precision=16)
    private BigDecimal lobId;
    @Column(name="lob_desc", length=50)
    private String lobDesc;
    @Column(name="user_created", length=30)
    private String userCreated;
    @Column(name="date_created")
    private Timestamp dateCreated;
    @Column(name="user_modified", length=30)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @OneToMany(mappedBy="lineOfBusiness")
    private Set<Source> source;

    /** Default constructor. */
    public LineOfBusiness() {
        super();
    }

    /**
     * Access method for lobId.
     *
     * @return the current value of lobId
     */
    public BigDecimal getLobId() {
        return lobId;
    }

    /**
     * Setter method for lobId.
     *
     * @param aLobId the new value for lobId
     */
    public void setLobId(BigDecimal aLobId) {
        lobId = aLobId;
    }

    /**
     * Access method for lobDesc.
     *
     * @return the current value of lobDesc
     */
    public String getLobDesc() {
        return lobDesc;
    }

    /**
     * Setter method for lobDesc.
     *
     * @param aLobDesc the new value for lobDesc
     */
    public void setLobDesc(String aLobDesc) {
        lobDesc = aLobDesc;
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
     * Access method for source.
     *
     * @return the current value of source
     */
    public Set<Source> getSource() {
        return source;
    }

    /**
     * Setter method for source.
     *
     * @param aSource the new value for source
     */
    public void setSource(Set<Source> aSource) {
        source = aSource;
    }

    /**
     * Compares the key for this instance with another LineOfBusiness.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class LineOfBusiness and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof LineOfBusiness)) {
            return false;
        }
        LineOfBusiness that = (LineOfBusiness) other;
        Object myLobId = this.getLobId();
        Object yourLobId = that.getLobId();
        if (myLobId==null ? yourLobId!=null : !myLobId.equals(yourLobId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another LineOfBusiness.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof LineOfBusiness)) return false;
        return this.equalKeys(other) && ((LineOfBusiness)other).equalKeys(this);
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
        if (getLobId() == null) {
            i = 0;
        } else {
            i = getLobId().hashCode();
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
        StringBuffer sb = new StringBuffer("[LineOfBusiness |");
        sb.append(" lobId=").append(getLobId());
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
        ret.put("lobId", getLobId());
        return ret;
    }

}
