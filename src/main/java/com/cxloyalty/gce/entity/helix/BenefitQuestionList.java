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
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="benefit_question_list", indexes={@Index(name="benefit_question_list_question_reference_name_IX", columnList="question_reference_name", unique=true)})
public class BenefitQuestionList implements Serializable {

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
    @Column(name="question_reference_name", unique=true, nullable=false, length=200)
    private String questionReferenceName;
    @Column(nullable=false, length=2000)
    private String question;
    @Column(name="user_created", nullable=false, length=200)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=200)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @ManyToOne(optional=false)
    @JoinColumn(name="qualifying_answer_id", nullable=false)
    private BenefitAnswerList benefitAnswerList;
    @OneToMany(mappedBy="benefitQuestionList")
    private Set<BenefitQuestions> benefitQuestions;

    /** Default constructor. */
    public BenefitQuestionList() {
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
     * Access method for questionReferenceName.
     *
     * @return the current value of questionReferenceName
     */
    public String getQuestionReferenceName() {
        return questionReferenceName;
    }

    /**
     * Setter method for questionReferenceName.
     *
     * @param aQuestionReferenceName the new value for questionReferenceName
     */
    public void setQuestionReferenceName(String aQuestionReferenceName) {
        questionReferenceName = aQuestionReferenceName;
    }

    /**
     * Access method for question.
     *
     * @return the current value of question
     */
    public String getQuestion() {
        return question;
    }

    /**
     * Setter method for question.
     *
     * @param aQuestion the new value for question
     */
    public void setQuestion(String aQuestion) {
        question = aQuestion;
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
     * Access method for benefitAnswerList.
     *
     * @return the current value of benefitAnswerList
     */
    public BenefitAnswerList getBenefitAnswerList() {
        return benefitAnswerList;
    }

    /**
     * Setter method for benefitAnswerList.
     *
     * @param aBenefitAnswerList the new value for benefitAnswerList
     */
    public void setBenefitAnswerList(BenefitAnswerList aBenefitAnswerList) {
        benefitAnswerList = aBenefitAnswerList;
    }

    /**
     * Access method for benefitQuestions.
     *
     * @return the current value of benefitQuestions
     */
    public Set<BenefitQuestions> getBenefitQuestions() {
        return benefitQuestions;
    }

    /**
     * Setter method for benefitQuestions.
     *
     * @param aBenefitQuestions the new value for benefitQuestions
     */
    public void setBenefitQuestions(Set<BenefitQuestions> aBenefitQuestions) {
        benefitQuestions = aBenefitQuestions;
    }

    /**
     * Compares the key for this instance with another BenefitQuestionList.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class BenefitQuestionList and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof BenefitQuestionList)) {
            return false;
        }
        BenefitQuestionList that = (BenefitQuestionList) other;
        Object myQuestionId = this.getQuestionId();
        Object yourQuestionId = that.getQuestionId();
        if (myQuestionId==null ? yourQuestionId!=null : !myQuestionId.equals(yourQuestionId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another BenefitQuestionList.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof BenefitQuestionList)) return false;
        return this.equalKeys(other) && ((BenefitQuestionList)other).equalKeys(this);
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
        StringBuffer sb = new StringBuffer("[BenefitQuestionList |");
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
