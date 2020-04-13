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

@Entity(name="issuer_bin")
public class IssuerBin implements Serializable {

    /** Primary key. */
    protected static final String PK = "issuerBinSysid";

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
    @Column(name="issuer_bin_sysid", unique=true, nullable=false, precision=9)
    private BigDecimal issuerBinSysid;
    @Column(name="bin_number_begin", nullable=false, precision=12)
    private BigDecimal binNumberBegin;
    @Column(name="bin_number_end", nullable=false, precision=12)
    private BigDecimal binNumberEnd;
    @Column(name="add_date", nullable=false)
    private Timestamp addDate;
    @Column(name="add_username", nullable=false, length=50)
    private String addUsername;
    @Column(name="update_date", nullable=false)
    private Timestamp updateDate;
    @Column(name="update_username", nullable=false, length=50)
    private String updateUsername;
    @Column(name="siebel_issuer_bin_id", length=15)
    private String siebelIssuerBinId;
    @Column(nullable=false, precision=9)
    private BigDecimal priority;
    @ManyToOne(optional=false)
    @JoinColumn(name="issuer_sysid", nullable=false)
    private Issuer issuer;

    /** Default constructor. */
    public IssuerBin() {
        super();
    }

    /**
     * Access method for issuerBinSysid.
     *
     * @return the current value of issuerBinSysid
     */
    public BigDecimal getIssuerBinSysid() {
        return issuerBinSysid;
    }

    /**
     * Setter method for issuerBinSysid.
     *
     * @param aIssuerBinSysid the new value for issuerBinSysid
     */
    public void setIssuerBinSysid(BigDecimal aIssuerBinSysid) {
        issuerBinSysid = aIssuerBinSysid;
    }

    /**
     * Access method for binNumberBegin.
     *
     * @return the current value of binNumberBegin
     */
    public BigDecimal getBinNumberBegin() {
        return binNumberBegin;
    }

    /**
     * Setter method for binNumberBegin.
     *
     * @param aBinNumberBegin the new value for binNumberBegin
     */
    public void setBinNumberBegin(BigDecimal aBinNumberBegin) {
        binNumberBegin = aBinNumberBegin;
    }

    /**
     * Access method for binNumberEnd.
     *
     * @return the current value of binNumberEnd
     */
    public BigDecimal getBinNumberEnd() {
        return binNumberEnd;
    }

    /**
     * Setter method for binNumberEnd.
     *
     * @param aBinNumberEnd the new value for binNumberEnd
     */
    public void setBinNumberEnd(BigDecimal aBinNumberEnd) {
        binNumberEnd = aBinNumberEnd;
    }

    /**
     * Access method for addDate.
     *
     * @return the current value of addDate
     */
    public Timestamp getAddDate() {
        return addDate;
    }

    /**
     * Setter method for addDate.
     *
     * @param aAddDate the new value for addDate
     */
    public void setAddDate(Timestamp aAddDate) {
        addDate = aAddDate;
    }

    /**
     * Access method for addUsername.
     *
     * @return the current value of addUsername
     */
    public String getAddUsername() {
        return addUsername;
    }

    /**
     * Setter method for addUsername.
     *
     * @param aAddUsername the new value for addUsername
     */
    public void setAddUsername(String aAddUsername) {
        addUsername = aAddUsername;
    }

    /**
     * Access method for updateDate.
     *
     * @return the current value of updateDate
     */
    public Timestamp getUpdateDate() {
        return updateDate;
    }

    /**
     * Setter method for updateDate.
     *
     * @param aUpdateDate the new value for updateDate
     */
    public void setUpdateDate(Timestamp aUpdateDate) {
        updateDate = aUpdateDate;
    }

    /**
     * Access method for updateUsername.
     *
     * @return the current value of updateUsername
     */
    public String getUpdateUsername() {
        return updateUsername;
    }

    /**
     * Setter method for updateUsername.
     *
     * @param aUpdateUsername the new value for updateUsername
     */
    public void setUpdateUsername(String aUpdateUsername) {
        updateUsername = aUpdateUsername;
    }

    /**
     * Access method for siebelIssuerBinId.
     *
     * @return the current value of siebelIssuerBinId
     */
    public String getSiebelIssuerBinId() {
        return siebelIssuerBinId;
    }

    /**
     * Setter method for siebelIssuerBinId.
     *
     * @param aSiebelIssuerBinId the new value for siebelIssuerBinId
     */
    public void setSiebelIssuerBinId(String aSiebelIssuerBinId) {
        siebelIssuerBinId = aSiebelIssuerBinId;
    }

    /**
     * Access method for priority.
     *
     * @return the current value of priority
     */
    public BigDecimal getPriority() {
        return priority;
    }

    /**
     * Setter method for priority.
     *
     * @param aPriority the new value for priority
     */
    public void setPriority(BigDecimal aPriority) {
        priority = aPriority;
    }

    /**
     * Access method for issuer.
     *
     * @return the current value of issuer
     */
    public Issuer getIssuer() {
        return issuer;
    }

    /**
     * Setter method for issuer.
     *
     * @param aIssuer the new value for issuer
     */
    public void setIssuer(Issuer aIssuer) {
        issuer = aIssuer;
    }

    /**
     * Compares the key for this instance with another IssuerBin.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class IssuerBin and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof IssuerBin)) {
            return false;
        }
        IssuerBin that = (IssuerBin) other;
        Object myIssuerBinSysid = this.getIssuerBinSysid();
        Object yourIssuerBinSysid = that.getIssuerBinSysid();
        if (myIssuerBinSysid==null ? yourIssuerBinSysid!=null : !myIssuerBinSysid.equals(yourIssuerBinSysid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another IssuerBin.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof IssuerBin)) return false;
        return this.equalKeys(other) && ((IssuerBin)other).equalKeys(this);
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
        if (getIssuerBinSysid() == null) {
            i = 0;
        } else {
            i = getIssuerBinSysid().hashCode();
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
        StringBuffer sb = new StringBuffer("[IssuerBin |");
        sb.append(" issuerBinSysid=").append(getIssuerBinSysid());
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
        ret.put("issuerBinSysid", getIssuerBinSysid());
        return ret;
    }

}
