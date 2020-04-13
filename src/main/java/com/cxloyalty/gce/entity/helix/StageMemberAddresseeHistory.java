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

@Entity(name="stage_member_addressee_history")
public class StageMemberAddresseeHistory implements Serializable {

    /** Primary key. */
    protected static final String PK = "memberAddresseeHistId";

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
    @Column(name="member_addressee_hist_id", unique=true, nullable=false, precision=19)
    private long memberAddresseeHistId;
    @Column(name="member_addressee_id", nullable=false, precision=19)
    private long memberAddresseeId;
    @Column(name="addressee_type_id", nullable=false, precision=19)
    private long addresseeTypeId;
    @Column(name="addressee_type_desc", nullable=false, length=100)
    private String addresseeTypeDesc;
    @Column(name="addressee_line_1", length=100)
    private String addresseeLine1;
    @Column(name="addressee_line_2", length=100)
    private String addresseeLine2;
    @Column(name="addressee_line_3", length=100)
    private String addresseeLine3;
    @Column(name="user_created", nullable=false, length=30)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=30)
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
    public StageMemberAddresseeHistory() {
        super();
    }

    /**
     * Access method for memberAddresseeHistId.
     *
     * @return the current value of memberAddresseeHistId
     */
    public long getMemberAddresseeHistId() {
        return memberAddresseeHistId;
    }

    /**
     * Setter method for memberAddresseeHistId.
     *
     * @param aMemberAddresseeHistId the new value for memberAddresseeHistId
     */
    public void setMemberAddresseeHistId(long aMemberAddresseeHistId) {
        memberAddresseeHistId = aMemberAddresseeHistId;
    }

    /**
     * Access method for memberAddresseeId.
     *
     * @return the current value of memberAddresseeId
     */
    public long getMemberAddresseeId() {
        return memberAddresseeId;
    }

    /**
     * Setter method for memberAddresseeId.
     *
     * @param aMemberAddresseeId the new value for memberAddresseeId
     */
    public void setMemberAddresseeId(long aMemberAddresseeId) {
        memberAddresseeId = aMemberAddresseeId;
    }

    /**
     * Access method for addresseeTypeId.
     *
     * @return the current value of addresseeTypeId
     */
    public long getAddresseeTypeId() {
        return addresseeTypeId;
    }

    /**
     * Setter method for addresseeTypeId.
     *
     * @param aAddresseeTypeId the new value for addresseeTypeId
     */
    public void setAddresseeTypeId(long aAddresseeTypeId) {
        addresseeTypeId = aAddresseeTypeId;
    }

    /**
     * Access method for addresseeTypeDesc.
     *
     * @return the current value of addresseeTypeDesc
     */
    public String getAddresseeTypeDesc() {
        return addresseeTypeDesc;
    }

    /**
     * Setter method for addresseeTypeDesc.
     *
     * @param aAddresseeTypeDesc the new value for addresseeTypeDesc
     */
    public void setAddresseeTypeDesc(String aAddresseeTypeDesc) {
        addresseeTypeDesc = aAddresseeTypeDesc;
    }

    /**
     * Access method for addresseeLine1.
     *
     * @return the current value of addresseeLine1
     */
    public String getAddresseeLine1() {
        return addresseeLine1;
    }

    /**
     * Setter method for addresseeLine1.
     *
     * @param aAddresseeLine1 the new value for addresseeLine1
     */
    public void setAddresseeLine1(String aAddresseeLine1) {
        addresseeLine1 = aAddresseeLine1;
    }

    /**
     * Access method for addresseeLine2.
     *
     * @return the current value of addresseeLine2
     */
    public String getAddresseeLine2() {
        return addresseeLine2;
    }

    /**
     * Setter method for addresseeLine2.
     *
     * @param aAddresseeLine2 the new value for addresseeLine2
     */
    public void setAddresseeLine2(String aAddresseeLine2) {
        addresseeLine2 = aAddresseeLine2;
    }

    /**
     * Access method for addresseeLine3.
     *
     * @return the current value of addresseeLine3
     */
    public String getAddresseeLine3() {
        return addresseeLine3;
    }

    /**
     * Setter method for addresseeLine3.
     *
     * @param aAddresseeLine3 the new value for addresseeLine3
     */
    public void setAddresseeLine3(String aAddresseeLine3) {
        addresseeLine3 = aAddresseeLine3;
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
     * Compares the key for this instance with another StageMemberAddresseeHistory.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class StageMemberAddresseeHistory and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof StageMemberAddresseeHistory)) {
            return false;
        }
        StageMemberAddresseeHistory that = (StageMemberAddresseeHistory) other;
        if (this.getMemberAddresseeHistId() != that.getMemberAddresseeHistId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another StageMemberAddresseeHistory.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof StageMemberAddresseeHistory)) return false;
        return this.equalKeys(other) && ((StageMemberAddresseeHistory)other).equalKeys(this);
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
        i = (int)(getMemberAddresseeHistId() ^ (getMemberAddresseeHistId()>>>32));
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
        StringBuffer sb = new StringBuffer("[StageMemberAddresseeHistory |");
        sb.append(" memberAddresseeHistId=").append(getMemberAddresseeHistId());
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
        ret.put("memberAddresseeHistId", Long.valueOf(getMemberAddresseeHistId()));
        return ret;
    }

}
