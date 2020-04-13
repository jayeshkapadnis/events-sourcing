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

@Entity(name="stage_member_phone_history")
public class StageMemberPhoneHistory implements Serializable {

    /** Primary key. */
    protected static final String PK = "memPhoneHistId";

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
    @Column(name="mem_phone_hist_id", unique=true, nullable=false, precision=19)
    private long memPhoneHistId;
    @Column(name="mem_phone_id", nullable=false, precision=19)
    private long memPhoneId;
    @Column(name="phone_type_id", nullable=false, precision=10)
    private BigDecimal phoneTypeId;
    @Column(name="phone_type_desc", nullable=false, length=100)
    private String phoneTypeDesc;
    @Column(length=20)
    private String value;
    @Column(name="user_created", nullable=false, length=30)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="history_user_created", length=30)
    private String historyUserCreated;
    @Column(name="history_date_created")
    private Timestamp historyDateCreated;
    @Column(name="numeric_phone_number", length=20)
    private String numericPhoneNumber;
    @ManyToOne(optional=false)
    @JoinColumn(name="member_id", nullable=false)
    private StageMember stageMember;

    /** Default constructor. */
    public StageMemberPhoneHistory() {
        super();
    }

    /**
     * Access method for memPhoneHistId.
     *
     * @return the current value of memPhoneHistId
     */
    public long getMemPhoneHistId() {
        return memPhoneHistId;
    }

    /**
     * Setter method for memPhoneHistId.
     *
     * @param aMemPhoneHistId the new value for memPhoneHistId
     */
    public void setMemPhoneHistId(long aMemPhoneHistId) {
        memPhoneHistId = aMemPhoneHistId;
    }

    /**
     * Access method for memPhoneId.
     *
     * @return the current value of memPhoneId
     */
    public long getMemPhoneId() {
        return memPhoneId;
    }

    /**
     * Setter method for memPhoneId.
     *
     * @param aMemPhoneId the new value for memPhoneId
     */
    public void setMemPhoneId(long aMemPhoneId) {
        memPhoneId = aMemPhoneId;
    }

    /**
     * Access method for phoneTypeId.
     *
     * @return the current value of phoneTypeId
     */
    public BigDecimal getPhoneTypeId() {
        return phoneTypeId;
    }

    /**
     * Setter method for phoneTypeId.
     *
     * @param aPhoneTypeId the new value for phoneTypeId
     */
    public void setPhoneTypeId(BigDecimal aPhoneTypeId) {
        phoneTypeId = aPhoneTypeId;
    }

    /**
     * Access method for phoneTypeDesc.
     *
     * @return the current value of phoneTypeDesc
     */
    public String getPhoneTypeDesc() {
        return phoneTypeDesc;
    }

    /**
     * Setter method for phoneTypeDesc.
     *
     * @param aPhoneTypeDesc the new value for phoneTypeDesc
     */
    public void setPhoneTypeDesc(String aPhoneTypeDesc) {
        phoneTypeDesc = aPhoneTypeDesc;
    }

    /**
     * Access method for value.
     *
     * @return the current value of value
     */
    public String getValue() {
        return value;
    }

    /**
     * Setter method for value.
     *
     * @param aValue the new value for value
     */
    public void setValue(String aValue) {
        value = aValue;
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
     * Access method for numericPhoneNumber.
     *
     * @return the current value of numericPhoneNumber
     */
    public String getNumericPhoneNumber() {
        return numericPhoneNumber;
    }

    /**
     * Setter method for numericPhoneNumber.
     *
     * @param aNumericPhoneNumber the new value for numericPhoneNumber
     */
    public void setNumericPhoneNumber(String aNumericPhoneNumber) {
        numericPhoneNumber = aNumericPhoneNumber;
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
     * Compares the key for this instance with another StageMemberPhoneHistory.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class StageMemberPhoneHistory and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof StageMemberPhoneHistory)) {
            return false;
        }
        StageMemberPhoneHistory that = (StageMemberPhoneHistory) other;
        if (this.getMemPhoneHistId() != that.getMemPhoneHistId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another StageMemberPhoneHistory.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof StageMemberPhoneHistory)) return false;
        return this.equalKeys(other) && ((StageMemberPhoneHistory)other).equalKeys(this);
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
        i = (int)(getMemPhoneHistId() ^ (getMemPhoneHistId()>>>32));
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
        StringBuffer sb = new StringBuffer("[StageMemberPhoneHistory |");
        sb.append(" memPhoneHistId=").append(getMemPhoneHistId());
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
        ret.put("memPhoneHistId", Long.valueOf(getMemPhoneHistId()));
        return ret;
    }

}
