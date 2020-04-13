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

@Entity(name="stage_member_email_history")
public class StageMemberEmailHistory implements Serializable {

    /** Primary key. */
    protected static final String PK = "memberEmailHistId";

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
    @Column(name="member_email_hist_id", unique=true, nullable=false, precision=19)
    private long memberEmailHistId;
    @Column(name="member_email_id", nullable=false, precision=19)
    private long memberEmailId;
    @Column(name="email_type_id", nullable=false, precision=19)
    private long emailTypeId;
    @Column(name="email_type_desc", nullable=false, length=4000)
    private String emailTypeDesc;
    @Column(name="member_email_address", nullable=false, length=4000)
    private String memberEmailAddress;
    @Column(name="user_created", nullable=false, length=4000)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=4000)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @Column(name="history_user_created", length=30)
    private String historyUserCreated;
    @Column(name="history_date_created")
    private Timestamp historyDateCreated;
    @ManyToOne(optional=false)
    @JoinColumn(name="member_id", nullable=false)
    private StageMember stageMember;

    /** Default constructor. */
    public StageMemberEmailHistory() {
        super();
    }

    /**
     * Access method for memberEmailHistId.
     *
     * @return the current value of memberEmailHistId
     */
    public long getMemberEmailHistId() {
        return memberEmailHistId;
    }

    /**
     * Setter method for memberEmailHistId.
     *
     * @param aMemberEmailHistId the new value for memberEmailHistId
     */
    public void setMemberEmailHistId(long aMemberEmailHistId) {
        memberEmailHistId = aMemberEmailHistId;
    }

    /**
     * Access method for memberEmailId.
     *
     * @return the current value of memberEmailId
     */
    public long getMemberEmailId() {
        return memberEmailId;
    }

    /**
     * Setter method for memberEmailId.
     *
     * @param aMemberEmailId the new value for memberEmailId
     */
    public void setMemberEmailId(long aMemberEmailId) {
        memberEmailId = aMemberEmailId;
    }

    /**
     * Access method for emailTypeId.
     *
     * @return the current value of emailTypeId
     */
    public long getEmailTypeId() {
        return emailTypeId;
    }

    /**
     * Setter method for emailTypeId.
     *
     * @param aEmailTypeId the new value for emailTypeId
     */
    public void setEmailTypeId(long aEmailTypeId) {
        emailTypeId = aEmailTypeId;
    }

    /**
     * Access method for emailTypeDesc.
     *
     * @return the current value of emailTypeDesc
     */
    public String getEmailTypeDesc() {
        return emailTypeDesc;
    }

    /**
     * Setter method for emailTypeDesc.
     *
     * @param aEmailTypeDesc the new value for emailTypeDesc
     */
    public void setEmailTypeDesc(String aEmailTypeDesc) {
        emailTypeDesc = aEmailTypeDesc;
    }

    /**
     * Access method for memberEmailAddress.
     *
     * @return the current value of memberEmailAddress
     */
    public String getMemberEmailAddress() {
        return memberEmailAddress;
    }

    /**
     * Setter method for memberEmailAddress.
     *
     * @param aMemberEmailAddress the new value for memberEmailAddress
     */
    public void setMemberEmailAddress(String aMemberEmailAddress) {
        memberEmailAddress = aMemberEmailAddress;
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
     * Access method for historyUserCreated.
     *
     * @return the current value of historyUserCreated
     */
    public String getHistoryUserCreated() {
        return historyUserCreated;
    }

    /**
     * Setter method for historyUserCreated.
     *
     * @param aHistoryUserCreated the new value for historyUserCreated
     */
    public void setHistoryUserCreated(String aHistoryUserCreated) {
        historyUserCreated = aHistoryUserCreated;
    }

    /**
     * Access method for historyDateCreated.
     *
     * @return the current value of historyDateCreated
     */
    public Timestamp getHistoryDateCreated() {
        return historyDateCreated;
    }

    /**
     * Setter method for historyDateCreated.
     *
     * @param aHistoryDateCreated the new value for historyDateCreated
     */
    public void setHistoryDateCreated(Timestamp aHistoryDateCreated) {
        historyDateCreated = aHistoryDateCreated;
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
     * Compares the key for this instance with another StageMemberEmailHistory.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class StageMemberEmailHistory and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof StageMemberEmailHistory)) {
            return false;
        }
        StageMemberEmailHistory that = (StageMemberEmailHistory) other;
        if (this.getMemberEmailHistId() != that.getMemberEmailHistId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another StageMemberEmailHistory.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof StageMemberEmailHistory)) return false;
        return this.equalKeys(other) && ((StageMemberEmailHistory)other).equalKeys(this);
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
        i = (int)(getMemberEmailHistId() ^ (getMemberEmailHistId()>>>32));
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
        StringBuffer sb = new StringBuffer("[StageMemberEmailHistory |");
        sb.append(" memberEmailHistId=").append(getMemberEmailHistId());
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
        ret.put("memberEmailHistId", Long.valueOf(getMemberEmailHistId()));
        return ret;
    }

}
