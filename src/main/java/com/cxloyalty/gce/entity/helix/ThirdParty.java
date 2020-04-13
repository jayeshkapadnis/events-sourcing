// Generated with g9.

package com.cxloyalty.gce.entity.helix;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="third_party")
public class ThirdParty implements Serializable {

    /** Primary key. */
    protected static final String PK = "thirdPartySysid";

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
    @Column(name="third_party_sysid", unique=true, nullable=false, precision=9)
    private BigDecimal thirdPartySysid;
    @Column(nullable=false, length=100)
    private String name;
    @Column(length=500)
    private String description;
    @Column(name="phone_number", nullable=false, length=40)
    private String phoneNumber;
    @Column(name="add_date", nullable=false)
    private Timestamp addDate;
    @Column(name="add_username", nullable=false, length=50)
    private String addUsername;
    @Column(name="update_date", nullable=false)
    private Timestamp updateDate;
    @Column(name="update_username", nullable=false, length=50)
    private String updateUsername;
    @Column(name="active_flag", nullable=false, length=1)
    private String activeFlag;
    @OneToMany(mappedBy="thirdParty")
    private Set<ThirdPartyOrg> thirdPartyOrg;
    @OneToMany(mappedBy="thirdParty")
    private Set<AccountThirdPartyConsent> accountThirdPartyConsent;

    /** Default constructor. */
    public ThirdParty() {
        super();
    }

    /**
     * Access method for thirdPartySysid.
     *
     * @return the current value of thirdPartySysid
     */
    public BigDecimal getThirdPartySysid() {
        return thirdPartySysid;
    }

    /**
     * Setter method for thirdPartySysid.
     *
     * @param aThirdPartySysid the new value for thirdPartySysid
     */
    public void setThirdPartySysid(BigDecimal aThirdPartySysid) {
        thirdPartySysid = aThirdPartySysid;
    }

    /**
     * Access method for name.
     *
     * @return the current value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for name.
     *
     * @param aName the new value for name
     */
    public void setName(String aName) {
        name = aName;
    }

    /**
     * Access method for description.
     *
     * @return the current value of description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter method for description.
     *
     * @param aDescription the new value for description
     */
    public void setDescription(String aDescription) {
        description = aDescription;
    }

    /**
     * Access method for phoneNumber.
     *
     * @return the current value of phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Setter method for phoneNumber.
     *
     * @param aPhoneNumber the new value for phoneNumber
     */
    public void setPhoneNumber(String aPhoneNumber) {
        phoneNumber = aPhoneNumber;
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
     * Access method for activeFlag.
     *
     * @return the current value of activeFlag
     */
    public String getActiveFlag() {
        return activeFlag;
    }

    /**
     * Setter method for activeFlag.
     *
     * @param aActiveFlag the new value for activeFlag
     */
    public void setActiveFlag(String aActiveFlag) {
        activeFlag = aActiveFlag;
    }

    /**
     * Access method for thirdPartyOrg.
     *
     * @return the current value of thirdPartyOrg
     */
    public Set<ThirdPartyOrg> getThirdPartyOrg() {
        return thirdPartyOrg;
    }

    /**
     * Setter method for thirdPartyOrg.
     *
     * @param aThirdPartyOrg the new value for thirdPartyOrg
     */
    public void setThirdPartyOrg(Set<ThirdPartyOrg> aThirdPartyOrg) {
        thirdPartyOrg = aThirdPartyOrg;
    }

    /**
     * Access method for accountThirdPartyConsent.
     *
     * @return the current value of accountThirdPartyConsent
     */
    public Set<AccountThirdPartyConsent> getAccountThirdPartyConsent() {
        return accountThirdPartyConsent;
    }

    /**
     * Setter method for accountThirdPartyConsent.
     *
     * @param aAccountThirdPartyConsent the new value for accountThirdPartyConsent
     */
    public void setAccountThirdPartyConsent(Set<AccountThirdPartyConsent> aAccountThirdPartyConsent) {
        accountThirdPartyConsent = aAccountThirdPartyConsent;
    }

    /**
     * Compares the key for this instance with another ThirdParty.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ThirdParty and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ThirdParty)) {
            return false;
        }
        ThirdParty that = (ThirdParty) other;
        Object myThirdPartySysid = this.getThirdPartySysid();
        Object yourThirdPartySysid = that.getThirdPartySysid();
        if (myThirdPartySysid==null ? yourThirdPartySysid!=null : !myThirdPartySysid.equals(yourThirdPartySysid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ThirdParty.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ThirdParty)) return false;
        return this.equalKeys(other) && ((ThirdParty)other).equalKeys(this);
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
        if (getThirdPartySysid() == null) {
            i = 0;
        } else {
            i = getThirdPartySysid().hashCode();
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
        StringBuffer sb = new StringBuffer("[ThirdParty |");
        sb.append(" thirdPartySysid=").append(getThirdPartySysid());
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
        ret.put("thirdPartySysid", getThirdPartySysid());
        return ret;
    }

}
