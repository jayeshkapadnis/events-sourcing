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
@Table(name="lov_value_benefit", indexes={@Index(name="lovValueBenefitUnLovValBen", columnList="lov_val_ben_sysid,ben_id", unique=true), @Index(name="lovValueBenefitUnLovValOrgBen", columnList="lov_val_org_sysid,ben_id", unique=true)})
public class LovValueBenefit implements Serializable {

    /** Primary key. */
    protected static final String PK = "lovValBenSysid";

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
    @Column(name="lov_val_ben_sysid", unique=true, nullable=false, precision=9)
    private BigDecimal lovValBenSysid;
    @Column(name="add_date", nullable=false)
    private Timestamp addDate;
    @Column(name="add_username", nullable=false, length=50)
    private String addUsername;
    @Column(name="update_date", nullable=false)
    private Timestamp updateDate;
    @Column(name="update_username", nullable=false, length=50)
    private String updateUsername;
    @ManyToOne(optional=false)
    @JoinColumn(name="ben_id", nullable=false)
    private Benefit benefit;
    @ManyToOne(optional=false)
    @JoinColumn(name="lov_val_org_sysid", nullable=false)
    private LovValueOrg lovValueOrg;

    /** Default constructor. */
    public LovValueBenefit() {
        super();
    }

    /**
     * Access method for lovValBenSysid.
     *
     * @return the current value of lovValBenSysid
     */
    public BigDecimal getLovValBenSysid() {
        return lovValBenSysid;
    }

    /**
     * Setter method for lovValBenSysid.
     *
     * @param aLovValBenSysid the new value for lovValBenSysid
     */
    public void setLovValBenSysid(BigDecimal aLovValBenSysid) {
        lovValBenSysid = aLovValBenSysid;
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
     * Access method for lovValueOrg.
     *
     * @return the current value of lovValueOrg
     */
    public LovValueOrg getLovValueOrg() {
        return lovValueOrg;
    }

    /**
     * Setter method for lovValueOrg.
     *
     * @param aLovValueOrg the new value for lovValueOrg
     */
    public void setLovValueOrg(LovValueOrg aLovValueOrg) {
        lovValueOrg = aLovValueOrg;
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
     * Gets the group fragment lovValOrgSysid for member lovValueOrg.
     *
     * @return Current value of the group fragment
     * @see LovValueOrg
     */
    public BigDecimal getLovValueOrgLovValOrgSysid() {
        return (getLovValueOrg() == null ? null : getLovValueOrg().getLovValOrgSysid());
    }

    /**
     * Sets the group fragment lovValOrgSysid from member lovValueOrg.
     *
     * @param aLovValOrgSysid New value for the group fragment
     * @see LovValueOrg
     */
    public void setLovValueOrgLovValOrgSysid(BigDecimal aLovValOrgSysid) {
        if (getLovValueOrg() != null) {
            getLovValueOrg().setLovValOrgSysid(aLovValOrgSysid);
        }
    }

    /**
     * Compares the key for this instance with another LovValueBenefit.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class LovValueBenefit and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof LovValueBenefit)) {
            return false;
        }
        LovValueBenefit that = (LovValueBenefit) other;
        Object myLovValBenSysid = this.getLovValBenSysid();
        Object yourLovValBenSysid = that.getLovValBenSysid();
        if (myLovValBenSysid==null ? yourLovValBenSysid!=null : !myLovValBenSysid.equals(yourLovValBenSysid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another LovValueBenefit.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof LovValueBenefit)) return false;
        return this.equalKeys(other) && ((LovValueBenefit)other).equalKeys(this);
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
        if (getLovValBenSysid() == null) {
            i = 0;
        } else {
            i = getLovValBenSysid().hashCode();
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
        StringBuffer sb = new StringBuffer("[LovValueBenefit |");
        sb.append(" lovValBenSysid=").append(getLovValBenSysid());
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
        ret.put("lovValBenSysid", getLovValBenSysid());
        return ret;
    }

}
