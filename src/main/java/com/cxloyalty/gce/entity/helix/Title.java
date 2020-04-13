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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="title")
public class Title implements Serializable {

    /** Primary key. */
    protected static final String PK = "titleId";

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
    @Column(name="title_id", unique=true, nullable=false, precision=16)
    private BigDecimal titleId;
    @Column(name="title_desc", nullable=false, length=4000)
    private String titleDesc;
    @Column(name="user_created", nullable=false, length=4000)
    private String userCreated;
    @Column(name="date_created")
    private Timestamp dateCreated;
    @Column(name="user_modified", length=4000)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @ManyToOne(optional=false)
    @JoinColumn(name="language_id", nullable=false)
    private Language language;

    /** Default constructor. */
    public Title() {
        super();
    }

    /**
     * Access method for titleId.
     *
     * @return the current value of titleId
     */
    public BigDecimal getTitleId() {
        return titleId;
    }

    /**
     * Setter method for titleId.
     *
     * @param aTitleId the new value for titleId
     */
    public void setTitleId(BigDecimal aTitleId) {
        titleId = aTitleId;
    }

    /**
     * Access method for titleDesc.
     *
     * @return the current value of titleDesc
     */
    public String getTitleDesc() {
        return titleDesc;
    }

    /**
     * Setter method for titleDesc.
     *
     * @param aTitleDesc the new value for titleDesc
     */
    public void setTitleDesc(String aTitleDesc) {
        titleDesc = aTitleDesc;
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
     * Access method for language.
     *
     * @return the current value of language
     */
    public Language getLanguage() {
        return language;
    }

    /**
     * Setter method for language.
     *
     * @param aLanguage the new value for language
     */
    public void setLanguage(Language aLanguage) {
        language = aLanguage;
    }

    /**
     * Compares the key for this instance with another Title.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Title and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Title)) {
            return false;
        }
        Title that = (Title) other;
        Object myTitleId = this.getTitleId();
        Object yourTitleId = that.getTitleId();
        if (myTitleId==null ? yourTitleId!=null : !myTitleId.equals(yourTitleId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Title.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Title)) return false;
        return this.equalKeys(other) && ((Title)other).equalKeys(this);
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
        if (getTitleId() == null) {
            i = 0;
        } else {
            i = getTitleId().hashCode();
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
        StringBuffer sb = new StringBuffer("[Title |");
        sb.append(" titleId=").append(getTitleId());
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
        ret.put("titleId", getTitleId());
        return ret;
    }

}
