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

@Entity(name="poe_common_abbr")
public class PoeCommonAbbr implements Serializable {

    /** Primary key. */
    protected static final String PK = "poeCommonAbbrId";

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
    @Column(name="poe_common_abbr_id", unique=true, nullable=false, precision=16)
    private BigDecimal poeCommonAbbrId;
    @Column(name="poe_common_abbr_desc", nullable=false, length=4000)
    private String poeCommonAbbrDesc;
    @Column(name="user_created", nullable=false, length=4000)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=4000)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @OneToMany(mappedBy="poeCommonAbbr")
    private Set<Question> question;

    /** Default constructor. */
    public PoeCommonAbbr() {
        super();
    }

    /**
     * Access method for poeCommonAbbrId.
     *
     * @return the current value of poeCommonAbbrId
     */
    public BigDecimal getPoeCommonAbbrId() {
        return poeCommonAbbrId;
    }

    /**
     * Setter method for poeCommonAbbrId.
     *
     * @param aPoeCommonAbbrId the new value for poeCommonAbbrId
     */
    public void setPoeCommonAbbrId(BigDecimal aPoeCommonAbbrId) {
        poeCommonAbbrId = aPoeCommonAbbrId;
    }

    /**
     * Access method for poeCommonAbbrDesc.
     *
     * @return the current value of poeCommonAbbrDesc
     */
    public String getPoeCommonAbbrDesc() {
        return poeCommonAbbrDesc;
    }

    /**
     * Setter method for poeCommonAbbrDesc.
     *
     * @param aPoeCommonAbbrDesc the new value for poeCommonAbbrDesc
     */
    public void setPoeCommonAbbrDesc(String aPoeCommonAbbrDesc) {
        poeCommonAbbrDesc = aPoeCommonAbbrDesc;
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
     * Access method for question.
     *
     * @return the current value of question
     */
    public Set<Question> getQuestion() {
        return question;
    }

    /**
     * Setter method for question.
     *
     * @param aQuestion the new value for question
     */
    public void setQuestion(Set<Question> aQuestion) {
        question = aQuestion;
    }

    /**
     * Compares the key for this instance with another PoeCommonAbbr.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class PoeCommonAbbr and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof PoeCommonAbbr)) {
            return false;
        }
        PoeCommonAbbr that = (PoeCommonAbbr) other;
        Object myPoeCommonAbbrId = this.getPoeCommonAbbrId();
        Object yourPoeCommonAbbrId = that.getPoeCommonAbbrId();
        if (myPoeCommonAbbrId==null ? yourPoeCommonAbbrId!=null : !myPoeCommonAbbrId.equals(yourPoeCommonAbbrId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another PoeCommonAbbr.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof PoeCommonAbbr)) return false;
        return this.equalKeys(other) && ((PoeCommonAbbr)other).equalKeys(this);
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
        if (getPoeCommonAbbrId() == null) {
            i = 0;
        } else {
            i = getPoeCommonAbbrId().hashCode();
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
        StringBuffer sb = new StringBuffer("[PoeCommonAbbr |");
        sb.append(" poeCommonAbbrId=").append(getPoeCommonAbbrId());
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
        ret.put("poeCommonAbbrId", getPoeCommonAbbrId());
        return ret;
    }

}
