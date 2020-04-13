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
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="gender", indexes={@Index(name="gender_gender_code_IX", columnList="gender_code", unique=true)})
public class Gender implements Serializable {

    /** Primary key. */
    protected static final String PK = "genderSysid";

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
    @Column(name="gender_sysid", unique=true, nullable=false, precision=10)
    private BigDecimal genderSysid;
    @Column(name="gender_code", unique=true, nullable=false, length=20)
    private String genderCode;
    @Column(name="gender_name", nullable=false, length=50)
    private String genderName;
    @Column(name="user_created", length=200)
    private String userCreated;
    @Column(name="date_created")
    private Timestamp dateCreated;
    @Column(name="user_modified", length=200)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;

    /** Default constructor. */
    public Gender() {
        super();
    }

    /**
     * Access method for genderSysid.
     *
     * @return the current value of genderSysid
     */
    public BigDecimal getGenderSysid() {
        return genderSysid;
    }

    /**
     * Setter method for genderSysid.
     *
     * @param aGenderSysid the new value for genderSysid
     */
    public void setGenderSysid(BigDecimal aGenderSysid) {
        genderSysid = aGenderSysid;
    }

    /**
     * Access method for genderCode.
     *
     * @return the current value of genderCode
     */
    public String getGenderCode() {
        return genderCode;
    }

    /**
     * Setter method for genderCode.
     *
     * @param aGenderCode the new value for genderCode
     */
    public void setGenderCode(String aGenderCode) {
        genderCode = aGenderCode;
    }

    /**
     * Access method for genderName.
     *
     * @return the current value of genderName
     */
    public String getGenderName() {
        return genderName;
    }

    /**
     * Setter method for genderName.
     *
     * @param aGenderName the new value for genderName
     */
    public void setGenderName(String aGenderName) {
        genderName = aGenderName;
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
     * Compares the key for this instance with another Gender.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Gender and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Gender)) {
            return false;
        }
        Gender that = (Gender) other;
        Object myGenderSysid = this.getGenderSysid();
        Object yourGenderSysid = that.getGenderSysid();
        if (myGenderSysid==null ? yourGenderSysid!=null : !myGenderSysid.equals(yourGenderSysid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Gender.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Gender)) return false;
        return this.equalKeys(other) && ((Gender)other).equalKeys(this);
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
        if (getGenderSysid() == null) {
            i = 0;
        } else {
            i = getGenderSysid().hashCode();
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
        StringBuffer sb = new StringBuffer("[Gender |");
        sb.append(" genderSysid=").append(getGenderSysid());
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
        ret.put("genderSysid", getGenderSysid());
        return ret;
    }

}
