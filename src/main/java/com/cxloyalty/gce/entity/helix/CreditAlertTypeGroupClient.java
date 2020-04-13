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
import javax.persistence.Version;

@Entity(name="credit_alert_type_group_client")
public class CreditAlertTypeGroupClient implements Serializable {

    /** Primary key. */
    protected static final String PK = "creditAlrtTypGrpClntId";

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
    @Column(name="credit_alrt_typ_grp_clnt_id", unique=true, nullable=false, precision=9)
    private BigDecimal creditAlrtTypGrpClntId;
    @Column(name="cln_client_id", precision=10)
    private BigDecimal clnClientId;
    @Column(name="credit_alert_type_group_id", precision=9)
    private BigDecimal creditAlertTypeGroupId;
    @Column(name="user_created", length=200)
    private String userCreated;
    @Column(name="date_created")
    private Timestamp dateCreated;
    @Column(name="user_modified", length=200)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;

    /** Default constructor. */
    public CreditAlertTypeGroupClient() {
        super();
    }

    /**
     * Access method for creditAlrtTypGrpClntId.
     *
     * @return the current value of creditAlrtTypGrpClntId
     */
    public BigDecimal getCreditAlrtTypGrpClntId() {
        return creditAlrtTypGrpClntId;
    }

    /**
     * Setter method for creditAlrtTypGrpClntId.
     *
     * @param aCreditAlrtTypGrpClntId the new value for creditAlrtTypGrpClntId
     */
    public void setCreditAlrtTypGrpClntId(BigDecimal aCreditAlrtTypGrpClntId) {
        creditAlrtTypGrpClntId = aCreditAlrtTypGrpClntId;
    }

    /**
     * Access method for clnClientId.
     *
     * @return the current value of clnClientId
     */
    public BigDecimal getClnClientId() {
        return clnClientId;
    }

    /**
     * Setter method for clnClientId.
     *
     * @param aClnClientId the new value for clnClientId
     */
    public void setClnClientId(BigDecimal aClnClientId) {
        clnClientId = aClnClientId;
    }

    /**
     * Access method for creditAlertTypeGroupId.
     *
     * @return the current value of creditAlertTypeGroupId
     */
    public BigDecimal getCreditAlertTypeGroupId() {
        return creditAlertTypeGroupId;
    }

    /**
     * Setter method for creditAlertTypeGroupId.
     *
     * @param aCreditAlertTypeGroupId the new value for creditAlertTypeGroupId
     */
    public void setCreditAlertTypeGroupId(BigDecimal aCreditAlertTypeGroupId) {
        creditAlertTypeGroupId = aCreditAlertTypeGroupId;
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
     * Compares the key for this instance with another CreditAlertTypeGroupClient.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class CreditAlertTypeGroupClient and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof CreditAlertTypeGroupClient)) {
            return false;
        }
        CreditAlertTypeGroupClient that = (CreditAlertTypeGroupClient) other;
        Object myCreditAlrtTypGrpClntId = this.getCreditAlrtTypGrpClntId();
        Object yourCreditAlrtTypGrpClntId = that.getCreditAlrtTypGrpClntId();
        if (myCreditAlrtTypGrpClntId==null ? yourCreditAlrtTypGrpClntId!=null : !myCreditAlrtTypGrpClntId.equals(yourCreditAlrtTypGrpClntId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another CreditAlertTypeGroupClient.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof CreditAlertTypeGroupClient)) return false;
        return this.equalKeys(other) && ((CreditAlertTypeGroupClient)other).equalKeys(this);
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
        if (getCreditAlrtTypGrpClntId() == null) {
            i = 0;
        } else {
            i = getCreditAlrtTypGrpClntId().hashCode();
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
        StringBuffer sb = new StringBuffer("[CreditAlertTypeGroupClient |");
        sb.append(" creditAlrtTypGrpClntId=").append(getCreditAlrtTypGrpClntId());
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
        ret.put("creditAlrtTypGrpClntId", getCreditAlrtTypGrpClntId());
        return ret;
    }

}
