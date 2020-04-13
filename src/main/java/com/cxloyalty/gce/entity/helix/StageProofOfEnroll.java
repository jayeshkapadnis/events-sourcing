// Generated with g9.

package com.cxloyalty.gce.entity.helix;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="stage_proof_of_enroll")
public class StageProofOfEnroll implements Serializable {

    /** Primary key. */
    protected static final String PK = "proofOfEnrollId";

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
    @Column(name="proof_of_enroll_id", unique=true, nullable=false, precision=19)
    private long proofOfEnrollId;
    @Column(name="question_id", nullable=false, precision=19)
    private long questionId;
    @Column(nullable=false, length=4000)
    private String answer;
    @Column(name="poe_common_abbr_id", nullable=false, precision=19)
    private long poeCommonAbbrId;
    @Column(name="poe_common_abbr_desc", length=4000)
    private String poeCommonAbbrDesc;
    @Column(name="user_created", length=4000)
    private String userCreated;
    @Column(name="date_created")
    private Timestamp dateCreated;
    @Column(name="user_modified", length=4000)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @Column(name="custom_question_text", length=4000)
    private String customQuestionText;
    @Column(name="membership_id", nullable=false, precision=19)
    private long membershipId;
    @ManyToOne(optional=false)
    @JoinColumn(name="member_id", nullable=false)
    private StageMember stageMember;

    /** Default constructor. */
    public StageProofOfEnroll() {
        super();
    }

    /**
     * Access method for proofOfEnrollId.
     *
     * @return the current value of proofOfEnrollId
     */
    public long getProofOfEnrollId() {
        return proofOfEnrollId;
    }

    /**
     * Setter method for proofOfEnrollId.
     *
     * @param aProofOfEnrollId the new value for proofOfEnrollId
     */
    public void setProofOfEnrollId(long aProofOfEnrollId) {
        proofOfEnrollId = aProofOfEnrollId;
    }

    /**
     * Access method for questionId.
     *
     * @return the current value of questionId
     */
    public long getQuestionId() {
        return questionId;
    }

    /**
     * Setter method for questionId.
     *
     * @param aQuestionId the new value for questionId
     */
    public void setQuestionId(long aQuestionId) {
        questionId = aQuestionId;
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
     * Access method for poeCommonAbbrId.
     *
     * @return the current value of poeCommonAbbrId
     */
    public long getPoeCommonAbbrId() {
        return poeCommonAbbrId;
    }

    /**
     * Setter method for poeCommonAbbrId.
     *
     * @param aPoeCommonAbbrId the new value for poeCommonAbbrId
     */
    public void setPoeCommonAbbrId(long aPoeCommonAbbrId) {
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
     * Access method for customQuestionText.
     *
     * @return the current value of customQuestionText
     */
    public String getCustomQuestionText() {
        return customQuestionText;
    }

    /**
     * Setter method for customQuestionText.
     *
     * @param aCustomQuestionText the new value for customQuestionText
     */
    public void setCustomQuestionText(String aCustomQuestionText) {
        customQuestionText = aCustomQuestionText;
    }

    /**
     * Access method for membershipId.
     *
     * @return the current value of membershipId
     */
    public long getMembershipId() {
        return membershipId;
    }

    /**
     * Setter method for membershipId.
     *
     * @param aMembershipId the new value for membershipId
     */
    public void setMembershipId(long aMembershipId) {
        membershipId = aMembershipId;
    }

    /**
     * Access method for stageMember.
     *
     * @return the current value of stageMember
     */
    public StageMember getStageMember() {
        return stageMember;
    }

    /**
     * Setter method for stageMember.
     *
     * @param aStageMember the new value for stageMember
     */
    public void setStageMember(StageMember aStageMember) {
        stageMember = aStageMember;
    }

    /**
     * Compares the key for this instance with another StageProofOfEnroll.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class StageProofOfEnroll and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof StageProofOfEnroll)) {
            return false;
        }
        StageProofOfEnroll that = (StageProofOfEnroll) other;
        if (this.getProofOfEnrollId() != that.getProofOfEnrollId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another StageProofOfEnroll.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof StageProofOfEnroll)) return false;
        return this.equalKeys(other) && ((StageProofOfEnroll)other).equalKeys(this);
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
        i = (int)(getProofOfEnrollId() ^ (getProofOfEnrollId()>>>32));
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
        StringBuffer sb = new StringBuffer("[StageProofOfEnroll |");
        sb.append(" proofOfEnrollId=").append(getProofOfEnrollId());
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
        ret.put("proofOfEnrollId", Long.valueOf(getProofOfEnrollId()));
        return ret;
    }

}
