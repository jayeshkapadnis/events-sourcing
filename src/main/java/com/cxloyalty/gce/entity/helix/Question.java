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

@Entity(name="question")
public class Question implements Serializable {

    /** Primary key. */
    protected static final String PK = "questionId";

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
    @Column(name="question_id", unique=true, nullable=false, precision=16)
    private BigDecimal questionId;
    @Column(name="question_text", nullable=false, length=4000)
    private String questionText;
    @Column(name="question_abbr", nullable=false, length=4000)
    private String questionAbbr;
    @Column(name="user_created", nullable=false, length=4000)
    private String userCreated;
    @Column(name="date_created")
    private Timestamp dateCreated;
    @Column(name="user_modified", length=4000)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @Column(name="question_type_desc", length=100)
    private String questionTypeDesc;
    @ManyToOne(optional=false)
    @JoinColumn(name="poe_common_abbr_id", nullable=false)
    private PoeCommonAbbr poeCommonAbbr;
    @ManyToOne(optional=false)
    @JoinColumn(name="language_id", nullable=false)
    private Language language;

    /** Default constructor. */
    public Question() {
        super();
    }

    /**
     * Access method for questionId.
     *
     * @return the current value of questionId
     */
    public BigDecimal getQuestionId() {
        return questionId;
    }

    /**
     * Setter method for questionId.
     *
     * @param aQuestionId the new value for questionId
     */
    public void setQuestionId(BigDecimal aQuestionId) {
        questionId = aQuestionId;
    }

    /**
     * Access method for questionText.
     *
     * @return the current value of questionText
     */
    public String getQuestionText() {
        return questionText;
    }

    /**
     * Setter method for questionText.
     *
     * @param aQuestionText the new value for questionText
     */
    public void setQuestionText(String aQuestionText) {
        questionText = aQuestionText;
    }

    /**
     * Access method for questionAbbr.
     *
     * @return the current value of questionAbbr
     */
    public String getQuestionAbbr() {
        return questionAbbr;
    }

    /**
     * Setter method for questionAbbr.
     *
     * @param aQuestionAbbr the new value for questionAbbr
     */
    public void setQuestionAbbr(String aQuestionAbbr) {
        questionAbbr = aQuestionAbbr;
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
     * Access method for questionTypeDesc.
     *
     * @return the current value of questionTypeDesc
     */
    public String getQuestionTypeDesc() {
        return questionTypeDesc;
    }

    /**
     * Setter method for questionTypeDesc.
     *
     * @param aQuestionTypeDesc the new value for questionTypeDesc
     */
    public void setQuestionTypeDesc(String aQuestionTypeDesc) {
        questionTypeDesc = aQuestionTypeDesc;
    }

    /**
     * Access method for poeCommonAbbr.
     *
     * @return the current value of poeCommonAbbr
     */
    public PoeCommonAbbr getPoeCommonAbbr() {
        return poeCommonAbbr;
    }

    /**
     * Setter method for poeCommonAbbr.
     *
     * @param aPoeCommonAbbr the new value for poeCommonAbbr
     */
    public void setPoeCommonAbbr(PoeCommonAbbr aPoeCommonAbbr) {
        poeCommonAbbr = aPoeCommonAbbr;
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
     * Compares the key for this instance with another Question.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Question and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Question)) {
            return false;
        }
        Question that = (Question) other;
        Object myQuestionId = this.getQuestionId();
        Object yourQuestionId = that.getQuestionId();
        if (myQuestionId==null ? yourQuestionId!=null : !myQuestionId.equals(yourQuestionId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Question.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Question)) return false;
        return this.equalKeys(other) && ((Question)other).equalKeys(this);
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
        if (getQuestionId() == null) {
            i = 0;
        } else {
            i = getQuestionId().hashCode();
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
        StringBuffer sb = new StringBuffer("[Question |");
        sb.append(" questionId=").append(getQuestionId());
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
        ret.put("questionId", getQuestionId());
        return ret;
    }

}
