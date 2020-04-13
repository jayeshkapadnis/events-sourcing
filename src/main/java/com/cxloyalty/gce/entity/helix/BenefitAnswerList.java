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

@Entity(name="benefit_answer_list")
public class BenefitAnswerList implements Serializable {

    /** Primary key. */
    protected static final String PK = "answerId";

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
    @Column(name="answer_id", unique=true, nullable=false, precision=16)
    private BigDecimal answerId;
    @Column(nullable=false, length=100)
    private String answer;
    @Column(name="user_created", nullable=false, length=200)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=200)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @OneToMany(mappedBy="benefitAnswerList")
    private Set<BenefitQuestionList> benefitQuestionList;

    /** Default constructor. */
    public BenefitAnswerList() {
        super();
    }

    /**
     * Access method for answerId.
     *
     * @return the current value of answerId
     */
    public BigDecimal getAnswerId() {
        return answerId;
    }

    /**
     * Setter method for answerId.
     *
     * @param aAnswerId the new value for answerId
     */
    public void setAnswerId(BigDecimal aAnswerId) {
        answerId = aAnswerId;
    }

    /**
     * Access method for answer.
     *
     * @return the current value of answer
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * Setter method for answer.
     *
     * @param aAnswer the new value for answer
     */
    public void setAnswer(String aAnswer) {
        answer = aAnswer;
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
     * Access method for benefitQuestionList.
     *
     * @return the current value of benefitQuestionList
     */
    public Set<BenefitQuestionList> getBenefitQuestionList() {
        return benefitQuestionList;
    }

    /**
     * Setter method for benefitQuestionList.
     *
     * @param aBenefitQuestionList the new value for benefitQuestionList
     */
    public void setBenefitQuestionList(Set<BenefitQuestionList> aBenefitQuestionList) {
        benefitQuestionList = aBenefitQuestionList;
    }

    /**
     * Compares the key for this instance with another BenefitAnswerList.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class BenefitAnswerList and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof BenefitAnswerList)) {
            return false;
        }
        BenefitAnswerList that = (BenefitAnswerList) other;
        Object myAnswerId = this.getAnswerId();
        Object yourAnswerId = that.getAnswerId();
        if (myAnswerId==null ? yourAnswerId!=null : !myAnswerId.equals(yourAnswerId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another BenefitAnswerList.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof BenefitAnswerList)) return false;
        return this.equalKeys(other) && ((BenefitAnswerList)other).equalKeys(this);
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
        if (getAnswerId() == null) {
            i = 0;
        } else {
            i = getAnswerId().hashCode();
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
        StringBuffer sb = new StringBuffer("[BenefitAnswerList |");
        sb.append(" answerId=").append(getAnswerId());
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
        ret.put("answerId", getAnswerId());
        return ret;
    }

}
