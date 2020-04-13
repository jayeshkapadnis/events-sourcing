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

@Entity(name="stage_member_address_history")
public class StageMemberAddressHistory implements Serializable {

    /** Primary key. */
    protected static final String PK = "memberAddressHistId";

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
    @Column(name="member_address_hist_id", unique=true, nullable=false, precision=19)
    private long memberAddressHistId;
    @Column(name="member_address_id", nullable=false, precision=19)
    private long memberAddressId;
    @Column(name="address_type_id", nullable=false, precision=19)
    private long addressTypeId;
    @Column(name="address_type_desc", nullable=false, length=100)
    private String addressTypeDesc;
    @Column(name="address_line_1", length=100)
    private String addressLine1;
    @Column(name="address_line_2", length=100)
    private String addressLine2;
    @Column(length=50)
    private String city;
    @Column(length=50)
    private String county;
    @Column(length=10)
    private String zip;
    @Column(length=100)
    private String country;
    @Column(name="user_created", nullable=false, length=30)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=30)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @Column(name="address_line_3", length=100)
    private String addressLine3;
    @Column(name="country_id", precision=19)
    private long countryId;
    @Column(name="history_user_created", length=30)
    private String historyUserCreated;
    @Column(name="history_date_created")
    private Timestamp historyDateCreated;
    @Column(name="flat_nbr", length=30)
    private String flatNbr;
    @Column(name="house_nbr", length=30)
    private String houseNbr;
    @Column(name="house_name", length=100)
    private String houseName;
    @Column(name="street_name", length=100)
    private String streetName;
    @ManyToOne(optional=false)
    @JoinColumn(name="member_id", nullable=false)
    private StageMember stageMember;

    /** Default constructor. */
    public StageMemberAddressHistory() {
        super();
    }

    /**
     * Access method for memberAddressHistId.
     *
     * @return the current value of memberAddressHistId
     */
    public long getMemberAddressHistId() {
        return memberAddressHistId;
    }

    /**
     * Setter method for memberAddressHistId.
     *
     * @param aMemberAddressHistId the new value for memberAddressHistId
     */
    public void setMemberAddressHistId(long aMemberAddressHistId) {
        memberAddressHistId = aMemberAddressHistId;
    }

    /**
     * Access method for memberAddressId.
     *
     * @return the current value of memberAddressId
     */
    public long getMemberAddressId() {
        return memberAddressId;
    }

    /**
     * Setter method for memberAddressId.
     *
     * @param aMemberAddressId the new value for memberAddressId
     */
    public void setMemberAddressId(long aMemberAddressId) {
        memberAddressId = aMemberAddressId;
    }

    /**
     * Access method for addressTypeId.
     *
     * @return the current value of addressTypeId
     */
    public long getAddressTypeId() {
        return addressTypeId;
    }

    /**
     * Setter method for addressTypeId.
     *
     * @param aAddressTypeId the new value for addressTypeId
     */
    public void setAddressTypeId(long aAddressTypeId) {
        addressTypeId = aAddressTypeId;
    }

    /**
     * Access method for addressTypeDesc.
     *
     * @return the current value of addressTypeDesc
     */
    public String getAddressTypeDesc() {
        return addressTypeDesc;
    }

    /**
     * Setter method for addressTypeDesc.
     *
     * @param aAddressTypeDesc the new value for addressTypeDesc
     */
    public void setAddressTypeDesc(String aAddressTypeDesc) {
        addressTypeDesc = aAddressTypeDesc;
    }

    /**
     * Access method for addressLine1.
     *
     * @return the current value of addressLine1
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Setter method for addressLine1.
     *
     * @param aAddressLine1 the new value for addressLine1
     */
    public void setAddressLine1(String aAddressLine1) {
        addressLine1 = aAddressLine1;
    }

    /**
     * Access method for addressLine2.
     *
     * @return the current value of addressLine2
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * Setter method for addressLine2.
     *
     * @param aAddressLine2 the new value for addressLine2
     */
    public void setAddressLine2(String aAddressLine2) {
        addressLine2 = aAddressLine2;
    }

    /**
     * Access method for city.
     *
     * @return the current value of city
     */
    public String getCity() {
        return city;
    }

    /**
     * Setter method for city.
     *
     * @param aCity the new value for city
     */
    public void setCity(String aCity) {
        city = aCity;
    }

    /**
     * Access method for county.
     *
     * @return the current value of county
     */
    public String getCounty() {
        return county;
    }

    /**
     * Setter method for county.
     *
     * @param aCounty the new value for county
     */
    public void setCounty(String aCounty) {
        county = aCounty;
    }

    /**
     * Access method for zip.
     *
     * @return the current value of zip
     */
    public String getZip() {
        return zip;
    }

    /**
     * Setter method for zip.
     *
     * @param aZip the new value for zip
     */
    public void setZip(String aZip) {
        zip = aZip;
    }

    /**
     * Access method for country.
     *
     * @return the current value of country
     */
    public String getCountry() {
        return country;
    }

    /**
     * Setter method for country.
     *
     * @param aCountry the new value for country
     */
    public void setCountry(String aCountry) {
        country = aCountry;
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
     * Access method for addressLine3.
     *
     * @return the current value of addressLine3
     */
    public String getAddressLine3() {
        return addressLine3;
    }

    /**
     * Setter method for addressLine3.
     *
     * @param aAddressLine3 the new value for addressLine3
     */
    public void setAddressLine3(String aAddressLine3) {
        addressLine3 = aAddressLine3;
    }

    /**
     * Access method for countryId.
     *
     * @return the current value of countryId
     */
    public long getCountryId() {
        return countryId;
    }

    /**
     * Setter method for countryId.
     *
     * @param aCountryId the new value for countryId
     */
    public void setCountryId(long aCountryId) {
        countryId = aCountryId;
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
     * Access method for flatNbr.
     *
     * @return the current value of flatNbr
     */
    public String getFlatNbr() {
        return flatNbr;
    }

    /**
     * Setter method for flatNbr.
     *
     * @param aFlatNbr the new value for flatNbr
     */
    public void setFlatNbr(String aFlatNbr) {
        flatNbr = aFlatNbr;
    }

    /**
     * Access method for houseNbr.
     *
     * @return the current value of houseNbr
     */
    public String getHouseNbr() {
        return houseNbr;
    }

    /**
     * Setter method for houseNbr.
     *
     * @param aHouseNbr the new value for houseNbr
     */
    public void setHouseNbr(String aHouseNbr) {
        houseNbr = aHouseNbr;
    }

    /**
     * Access method for houseName.
     *
     * @return the current value of houseName
     */
    public String getHouseName() {
        return houseName;
    }

    /**
     * Setter method for houseName.
     *
     * @param aHouseName the new value for houseName
     */
    public void setHouseName(String aHouseName) {
        houseName = aHouseName;
    }

    /**
     * Access method for streetName.
     *
     * @return the current value of streetName
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * Setter method for streetName.
     *
     * @param aStreetName the new value for streetName
     */
    public void setStreetName(String aStreetName) {
        streetName = aStreetName;
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
     * Compares the key for this instance with another StageMemberAddressHistory.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class StageMemberAddressHistory and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof StageMemberAddressHistory)) {
            return false;
        }
        StageMemberAddressHistory that = (StageMemberAddressHistory) other;
        if (this.getMemberAddressHistId() != that.getMemberAddressHistId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another StageMemberAddressHistory.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof StageMemberAddressHistory)) return false;
        return this.equalKeys(other) && ((StageMemberAddressHistory)other).equalKeys(this);
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
        i = (int)(getMemberAddressHistId() ^ (getMemberAddressHistId()>>>32));
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
        StringBuffer sb = new StringBuffer("[StageMemberAddressHistory |");
        sb.append(" memberAddressHistId=").append(getMemberAddressHistId());
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
        ret.put("memberAddressHistId", Long.valueOf(getMemberAddressHistId()));
        return ret;
    }

}
