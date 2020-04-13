// Generated with g9.

package com.cxloyalty.gce.entity.helix;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="issuer_contact_xref", indexes={@Index(name="issuerContactXrefUcIssuerIssuerContact", columnList="issuer_sysid,issuer_contact_sysid", unique=true)})
public class IssuerContactXref implements Serializable {

    /** Primary key. */
    protected static final String PK = "issuerContactXrefSysid";

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
    @Column(name="issuer_contact_xref_sysid", unique=true, nullable=false, precision=9)
    private BigDecimal issuerContactXrefSysid;
    @Column(name="issuer_sysid", nullable=false, precision=9)
    private BigDecimal issuerSysid;
    @Column(name="issuer_contact_sysid", nullable=false, precision=9)
    private BigDecimal issuerContactSysid;

    /** Default constructor. */
    public IssuerContactXref() {
        super();
    }

    /**
     * Access method for issuerContactXrefSysid.
     *
     * @return the current value of issuerContactXrefSysid
     */
    public BigDecimal getIssuerContactXrefSysid() {
        return issuerContactXrefSysid;
    }

    /**
     * Setter method for issuerContactXrefSysid.
     *
     * @param aIssuerContactXrefSysid the new value for issuerContactXrefSysid
     */
    public void setIssuerContactXrefSysid(BigDecimal aIssuerContactXrefSysid) {
        issuerContactXrefSysid = aIssuerContactXrefSysid;
    }

    /**
     * Access method for issuerSysid.
     *
     * @return the current value of issuerSysid
     */
    public BigDecimal getIssuerSysid() {
        return issuerSysid;
    }

    /**
     * Setter method for issuerSysid.
     *
     * @param aIssuerSysid the new value for issuerSysid
     */
    public void setIssuerSysid(BigDecimal aIssuerSysid) {
        issuerSysid = aIssuerSysid;
    }

    /**
     * Access method for issuerContactSysid.
     *
     * @return the current value of issuerContactSysid
     */
    public BigDecimal getIssuerContactSysid() {
        return issuerContactSysid;
    }

    /**
     * Setter method for issuerContactSysid.
     *
     * @param aIssuerContactSysid the new value for issuerContactSysid
     */
    public void setIssuerContactSysid(BigDecimal aIssuerContactSysid) {
        issuerContactSysid = aIssuerContactSysid;
    }

    /**
     * Compares the key for this instance with another IssuerContactXref.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class IssuerContactXref and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof IssuerContactXref)) {
            return false;
        }
        IssuerContactXref that = (IssuerContactXref) other;
        Object myIssuerContactXrefSysid = this.getIssuerContactXrefSysid();
        Object yourIssuerContactXrefSysid = that.getIssuerContactXrefSysid();
        if (myIssuerContactXrefSysid==null ? yourIssuerContactXrefSysid!=null : !myIssuerContactXrefSysid.equals(yourIssuerContactXrefSysid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another IssuerContactXref.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof IssuerContactXref)) return false;
        return this.equalKeys(other) && ((IssuerContactXref)other).equalKeys(this);
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
        if (getIssuerContactXrefSysid() == null) {
            i = 0;
        } else {
            i = getIssuerContactXrefSysid().hashCode();
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
        StringBuffer sb = new StringBuffer("[IssuerContactXref |");
        sb.append(" issuerContactXrefSysid=").append(getIssuerContactXrefSysid());
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
        ret.put("issuerContactXrefSysid", getIssuerContactXrefSysid());
        return ret;
    }

}
