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
@Table(name="cashback_payment_pref", indexes={@Index(name="cashback_payment_pref_cashback_payment_pref_name_IX", columnList="cashback_payment_pref_name", unique=true), @Index(name="cashbackPaymentPrefIdxCashbkpmtprefOrgpkgid", columnList="organization_id,pkg_id", unique=true)})
public class CashbackPaymentPref implements Serializable {

    /** Primary key. */
    protected static final String PK = "cashbackPaymentPrefId";

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
    @Column(name="cashback_payment_pref_id", unique=true, nullable=false, precision=16)
    private BigDecimal cashbackPaymentPrefId;
    @Column(name="cashback_payment_pref_name", unique=true, nullable=false, length=100)
    private String cashbackPaymentPrefName;
    @Column(name="pkg_id", precision=16)
    private BigDecimal pkgId;
    @Column(name="pref_payment_vehicle_type_id", nullable=false, precision=2)
    private BigDecimal prefPaymentVehicleTypeId;
    @Column(name="alternate_pay_by_check_fl", precision=1)
    private BigDecimal alternatePayByCheckFl;
    @Column(name="active_fl", nullable=false, precision=1)
    private BigDecimal activeFl;
    @Column(name="user_created", nullable=false, length=200)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=200)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @ManyToOne(optional=false)
    @JoinColumn(name="organization_id", nullable=false)
    private Organization organization;

    /** Default constructor. */
    public CashbackPaymentPref() {
        super();
    }

    /**
     * Access method for cashbackPaymentPrefId.
     *
     * @return the current value of cashbackPaymentPrefId
     */
    public BigDecimal getCashbackPaymentPrefId() {
        return cashbackPaymentPrefId;
    }

    /**
     * Setter method for cashbackPaymentPrefId.
     *
     * @param aCashbackPaymentPrefId the new value for cashbackPaymentPrefId
     */
    public void setCashbackPaymentPrefId(BigDecimal aCashbackPaymentPrefId) {
        cashbackPaymentPrefId = aCashbackPaymentPrefId;
    }

    /**
     * Access method for cashbackPaymentPrefName.
     *
     * @return the current value of cashbackPaymentPrefName
     */
    public String getCashbackPaymentPrefName() {
        return cashbackPaymentPrefName;
    }

    /**
     * Setter method for cashbackPaymentPrefName.
     *
     * @param aCashbackPaymentPrefName the new value for cashbackPaymentPrefName
     */
    public void setCashbackPaymentPrefName(String aCashbackPaymentPrefName) {
        cashbackPaymentPrefName = aCashbackPaymentPrefName;
    }

    /**
     * Access method for pkgId.
     *
     * @return the current value of pkgId
     */
    public BigDecimal getPkgId() {
        return pkgId;
    }

    /**
     * Setter method for pkgId.
     *
     * @param aPkgId the new value for pkgId
     */
    public void setPkgId(BigDecimal aPkgId) {
        pkgId = aPkgId;
    }

    /**
     * Access method for prefPaymentVehicleTypeId.
     *
     * @return the current value of prefPaymentVehicleTypeId
     */
    public BigDecimal getPrefPaymentVehicleTypeId() {
        return prefPaymentVehicleTypeId;
    }

    /**
     * Setter method for prefPaymentVehicleTypeId.
     *
     * @param aPrefPaymentVehicleTypeId the new value for prefPaymentVehicleTypeId
     */
    public void setPrefPaymentVehicleTypeId(BigDecimal aPrefPaymentVehicleTypeId) {
        prefPaymentVehicleTypeId = aPrefPaymentVehicleTypeId;
    }

    /**
     * Access method for alternatePayByCheckFl.
     *
     * @return the current value of alternatePayByCheckFl
     */
    public BigDecimal getAlternatePayByCheckFl() {
        return alternatePayByCheckFl;
    }

    /**
     * Setter method for alternatePayByCheckFl.
     *
     * @param aAlternatePayByCheckFl the new value for alternatePayByCheckFl
     */
    public void setAlternatePayByCheckFl(BigDecimal aAlternatePayByCheckFl) {
        alternatePayByCheckFl = aAlternatePayByCheckFl;
    }

    /**
     * Access method for activeFl.
     *
     * @return the current value of activeFl
     */
    public BigDecimal getActiveFl() {
        return activeFl;
    }

    /**
     * Setter method for activeFl.
     *
     * @param aActiveFl the new value for activeFl
     */
    public void setActiveFl(BigDecimal aActiveFl) {
        activeFl = aActiveFl;
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
     * Compares the key for this instance with another CashbackPaymentPref.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class CashbackPaymentPref and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof CashbackPaymentPref)) {
            return false;
        }
        CashbackPaymentPref that = (CashbackPaymentPref) other;
        Object myCashbackPaymentPrefId = this.getCashbackPaymentPrefId();
        Object yourCashbackPaymentPrefId = that.getCashbackPaymentPrefId();
        if (myCashbackPaymentPrefId==null ? yourCashbackPaymentPrefId!=null : !myCashbackPaymentPrefId.equals(yourCashbackPaymentPrefId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another CashbackPaymentPref.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof CashbackPaymentPref)) return false;
        return this.equalKeys(other) && ((CashbackPaymentPref)other).equalKeys(this);
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
        if (getCashbackPaymentPrefId() == null) {
            i = 0;
        } else {
            i = getCashbackPaymentPrefId().hashCode();
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
        StringBuffer sb = new StringBuffer("[CashbackPaymentPref |");
        sb.append(" cashbackPaymentPrefId=").append(getCashbackPaymentPrefId());
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
        ret.put("cashbackPaymentPrefId", getCashbackPaymentPrefId());
        return ret;
    }

}
