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
@Table(name="benefit_questions", indexes={@Index(name="benefitQuestionsUnBenefitQuestionsBenorgid", columnList="ben_id,organization_id,question_id", unique=true)})
public class BenefitQuestions implements Serializable {

    /** Primary key. */
    protected static final String PK = "benefitQuestionsId";

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
    @Column(name="benefit_questions_id", unique=true, nullable=false, precision=16)
    private BigDecimal benefitQuestionsId;
    @Column(name="display_order_number", nullable=false, precision=10)
    private BigDecimal displayOrderNumber;
    @Column(name="user_created", nullable=false, length=200)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=200)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @ManyToOne(optional=false)
    @JoinColumn(name="ben_id", nullable=false)
    private Benefit benefit;
    @ManyToOne(optional=false)
    @JoinColumn(name="organization_id", nullable=false)
    private Organization organization;
    @ManyToOne(optional=false)
    @JoinColumn(name="question_id", nullable=false)
    private BenefitQuestionList benefitQuestionList;

    /** Default constructor. */
    public BenefitQuestions() {
        super();
    }

    /**
     * Access method for benefitQuestionsId.
     *
     * @return the current value of benefitQuestionsId
     */
    public BigDecimal getBenefitQuestionsId() {
        return benefitQuestionsId;
    }

    /**
     * Setter method for benefitQuestionsId.
     *
     * @param aBenefitQuestionsId the new value for benefitQuestionsId
     */
    public void setBenefitQuestionsId(BigDecimal aBenefitQuestionsId) {
        benefitQuestionsId = aBenefitQuestionsId;
    }

    /**
     * Access method for displayOrderNumber.
     *
     * @return the current value of displayOrderNumber
     */
    public BigDecimal getDisplayOrderNumber() {
        return displayOrderNumber;
    }

    /**
     * Setter method for displayOrderNumber.
     *
     * @param aDisplayOrderNumber the new value for displayOrderNumber
     */
    public void setDisplayOrderNumber(BigDecimal aDisplayOrderNumber) {
        displayOrderNumber = aDisplayOrderNumber;
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
     * Access method for benefit.
     *
     * @return the current value of benefit
     */
    public Benefit getBenefit() {
        return benefit;
    }

    /**
     * Setter method for benefit.
     *
     * @param aBenefit the new value for benefit
     */
    public void setBenefit(Benefit aBenefit) {
        benefit = aBenefit;
    }

    /**
     * Access method for organization.
     *
     * @return the current value of organization
     */
    public Organization getOrganization() {
        return organization;
    }

    /**
     * Setter method for organization.
     *
     * @param aOrganization the new value for organization
     */
    public void setOrganization(Organization aOrganization) {
        organization = aOrganization;
    }

    /**
     * Access method for benefitQuestionList.
     *
     * @return the current value of benefitQuestionList
     */
    public BenefitQuestionList getBenefitQuestionList() {
        return benefitQuestionList;
    }

    /**
     * Setter method for benefitQuestionList.
     *
     * @param aBenefitQuestionList the new value for benefitQuestionList
     */
    public void setBenefitQuestionList(BenefitQuestionList aBenefitQuestionList) {
        benefitQuestionList = aBenefitQuestionList;
    }

    /**
     * Gets the group fragment benId for member benefit.
     *
     * @return Current value of the group fragment
     * @see Benefit
     */
    public BigDecimal getBenefitBenId() {
        return (getBenefit() == null ? null : getBenefit().getBenId());
    }

    /**
     * Sets the group fragment benId from member benefit.
     *
     * @param aBenId New value for the group fragment
     * @see Benefit
     */
    public void setBenefitBenId(BigDecimal aBenId) {
        if (getBenefit() != null) {
            getBenefit().setBenId(aBenId);
        }
    }

    /**
     * Gets the group fragment organizationId for member organization.
     *
     * @return Current value of the group fragment
     * @see Organization
     */
    public BigDecimal getOrganizationOrganizationId() {
        return (getOrganization() == null ? null : getOrganization().getOrganizationId());
    }

    /**
     * Sets the group fragment organizationId from member organization.
     *
     * @param aOrganizationId New value for the group fragment
     * @see Organization
     */
    public void setOrganizationOrganizationId(BigDecimal aOrganizationId) {
        if (getOrganization() != null) {
            getOrganization().setOrganizationId(aOrganizationId);
        }
    }

    /**
     * Gets the group fragment questionId for member benefitQuestionList.
     *
     * @return Current value of the group fragment
     * @see BenefitQuestionList
     */
    public BigDecimal getBenefitQuestionListQuestionId() {
        return (getBenefitQuestionList() == null ? null : getBenefitQuestionList().getQuestionId());
    }

    /**
     * Sets the group fragment questionId from member benefitQuestionList.
     *
     * @param aQuestionId New value for the group fragment
     * @see BenefitQuestionList
     */
    public void setBenefitQuestionListQuestionId(BigDecimal aQuestionId) {
        if (getBenefitQuestionList() != null) {
            getBenefitQuestionList().setQuestionId(aQuestionId);
        }
    }

    /**
     * Compares the key for this instance with another BenefitQuestions.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class BenefitQuestions and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof BenefitQuestions)) {
            return false;
        }
        BenefitQuestions that = (BenefitQuestions) other;
        Object myBenefitQuestionsId = this.getBenefitQuestionsId();
        Object yourBenefitQuestionsId = that.getBenefitQuestionsId();
        if (myBenefitQuestionsId==null ? yourBenefitQuestionsId!=null : !myBenefitQuestionsId.equals(yourBenefitQuestionsId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another BenefitQuestions.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof BenefitQuestions)) return false;
        return this.equalKeys(other) && ((BenefitQuestions)other).equalKeys(this);
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
        if (getBenefitQuestionsId() == null) {
            i = 0;
        } else {
            i = getBenefitQuestionsId().hashCode();
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
        StringBuffer sb = new StringBuffer("[BenefitQuestions |");
        sb.append(" benefitQuestionsId=").append(getBenefitQuestionsId());
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
        ret.put("benefitQuestionsId", getBenefitQuestionsId());
        return ret;
    }

}
