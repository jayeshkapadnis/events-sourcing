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

@Entity(name="benefit_selection_window")
public class BenefitSelectionWindow implements Serializable {

    /** Primary key. */
    protected static final String PK = "benefitSelectionWindowId";

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
    @Column(name="benefit_selection_window_id", unique=true, nullable=false, precision=16)
    private BigDecimal benefitSelectionWindowId;
    @Column(name="start_range", nullable=false, precision=9)
    private BigDecimal startRange;
    @Column(name="end_range", nullable=false, precision=9)
    private BigDecimal endRange;
    @Column(name="user_created", nullable=false, length=200)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=200)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @Column(name="ben_sel_window_ref_type_name", length=100)
    private String benSelWindowRefTypeName;
    @ManyToOne(optional=false)
    @JoinColumn(name="act_id", nullable=false)
    private Account account;

    /** Default constructor. */
    public BenefitSelectionWindow() {
        super();
    }

    /**
     * Access method for benefitSelectionWindowId.
     *
     * @return the current value of benefitSelectionWindowId
     */
    public BigDecimal getBenefitSelectionWindowId() {
        return benefitSelectionWindowId;
    }

    /**
     * Setter method for benefitSelectionWindowId.
     *
     * @param aBenefitSelectionWindowId the new value for benefitSelectionWindowId
     */
    public void setBenefitSelectionWindowId(BigDecimal aBenefitSelectionWindowId) {
        benefitSelectionWindowId = aBenefitSelectionWindowId;
    }

    /**
     * Access method for startRange.
     *
     * @return the current value of startRange
     */
    public BigDecimal getStartRange() {
        return startRange;
    }

    /**
     * Setter method for startRange.
     *
     * @param aStartRange the new value for startRange
     */
    public void setStartRange(BigDecimal aStartRange) {
        startRange = aStartRange;
    }

    /**
     * Access method for endRange.
     *
     * @return the current value of endRange
     */
    public BigDecimal getEndRange() {
        return endRange;
    }

    /**
     * Setter method for endRange.
     *
     * @param aEndRange the new value for endRange
     */
    public void setEndRange(BigDecimal aEndRange) {
        endRange = aEndRange;
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
     * Access method for benSelWindowRefTypeName.
     *
     * @return the current value of benSelWindowRefTypeName
     */
    public String getBenSelWindowRefTypeName() {
        return benSelWindowRefTypeName;
    }

    /**
     * Setter method for benSelWindowRefTypeName.
     *
     * @param aBenSelWindowRefTypeName the new value for benSelWindowRefTypeName
     */
    public void setBenSelWindowRefTypeName(String aBenSelWindowRefTypeName) {
        benSelWindowRefTypeName = aBenSelWindowRefTypeName;
    }

    /**
     * Access method for account.
     *
     * @return the current value of account
     */
    public Account getAccount() {
        return account;
    }

    /**
     * Setter method for account.
     *
     * @param aAccount the new value for account
     */
    public void setAccount(Account aAccount) {
        account = aAccount;
    }

    /**
     * Compares the key for this instance with another BenefitSelectionWindow.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class BenefitSelectionWindow and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof BenefitSelectionWindow)) {
            return false;
        }
        BenefitSelectionWindow that = (BenefitSelectionWindow) other;
        Object myBenefitSelectionWindowId = this.getBenefitSelectionWindowId();
        Object yourBenefitSelectionWindowId = that.getBenefitSelectionWindowId();
        if (myBenefitSelectionWindowId==null ? yourBenefitSelectionWindowId!=null : !myBenefitSelectionWindowId.equals(yourBenefitSelectionWindowId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another BenefitSelectionWindow.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof BenefitSelectionWindow)) return false;
        return this.equalKeys(other) && ((BenefitSelectionWindow)other).equalKeys(this);
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
        if (getBenefitSelectionWindowId() == null) {
            i = 0;
        } else {
            i = getBenefitSelectionWindowId().hashCode();
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
        StringBuffer sb = new StringBuffer("[BenefitSelectionWindow |");
        sb.append(" benefitSelectionWindowId=").append(getBenefitSelectionWindowId());
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
        ret.put("benefitSelectionWindowId", getBenefitSelectionWindowId());
        return ret;
    }

}
