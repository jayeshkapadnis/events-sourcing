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

@Entity(name="stage_member")
public class StageMember implements Serializable {

    /** Primary key. */
    protected static final String PK = "memberId";

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
    @Column(name="member_id", unique=true, nullable=false, precision=19)
    private long memberId;
    @Column(name="title_id", precision=19)
    private long titleId;
    @Column(name="title_desc", length=4000)
    private String titleDesc;
    @Column(nullable=false, length=120)
    private String fname;
    @Column(length=120)
    private String mname;
    @Column(nullable=false, length=120)
    private String lname;
    @Column(length=100)
    private String suffix;
    private Timestamp dob;
    @Column(name="gender_sysid", precision=10)
    private BigDecimal genderSysid;
    @Column(name="mem_gender_code", length=20)
    private String memGenderCode;
    @Column(name="mem_gender_name", length=50)
    private String memGenderName;
    @Column(name="national_id", length=25)
    private String nationalId;
    @Column(name="is_active", nullable=false, length=1)
    private boolean isActive;
    @Column(name="created_by", nullable=false, length=120)
    private String createdBy;
    @Column(name="created_date", nullable=false)
    private Timestamp createdDate;
    @Column(name="updated_by", length=120)
    private String updatedBy;
    @Column(name="updated_date")
    private Timestamp updatedDate;
    @Column(length=100)
    private String salutation;
    @Column(name="language_id", nullable=false, precision=19)
    private long languageId;
    @Column(name="member_address_id", nullable=false, precision=19)
    private long memberAddressId;
    @Column(name="address_type_id", nullable=false, precision=19)
    private long addressTypeId;
    @Column(name="mem_address_type_desc", length=100)
    private String memAddressTypeDesc;
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
    @Column(name="mem_address_user_created", nullable=false, length=120)
    private String memAddressUserCreated;
    @Column(name="mem_address_date_created", nullable=false)
    private Timestamp memAddressDateCreated;
    @Column(name="mem_address_user_modified", length=120)
    private String memAddressUserModified;
    @Column(name="mem_address_date_modified")
    private Timestamp memAddressDateModified;
    @Column(name="address_line_3", length=100)
    private String addressLine3;
    @Column(name="country_id", precision=19)
    private long countryId;
    @Column(name="date_moved_to_addr")
    private Timestamp dateMovedToAddr;
    @Column(name="flat_nbr", length=30)
    private String flatNbr;
    @Column(name="house_nbr", length=30)
    private String houseNbr;
    @Column(name="house_name", length=100)
    private String houseName;
    @Column(name="street_name", length=100)
    private String streetName;
    @Column(name="state_id", precision=19)
    private long stateId;
    @Column(name="member_addressee_id", nullable=false, precision=19)
    private long memberAddresseeId;
    @Column(name="addressee_type_id", nullable=false, precision=19)
    private long addresseeTypeId;
    @Column(name="mem_addressee_type_desc", length=100)
    private String memAddresseeTypeDesc;
    @Column(name="addressee_line_1", length=100)
    private String addresseeLine1;
    @Column(name="addressee_line_2", length=100)
    private String addresseeLine2;
    @Column(name="addressee_line_3", length=100)
    private String addresseeLine3;
    @Column(name="mem_addressee_user_created", nullable=false, length=120)
    private String memAddresseeUserCreated;
    @Column(name="mem_addressee_date_created", nullable=false)
    private Timestamp memAddresseeDateCreated;
    @Column(name="mem_addressee_user_modified", length=120)
    private String memAddresseeUserModified;
    @Column(name="mem_addressee_date_modified")
    private Timestamp memAddresseeDateModified;
    @Column(name="home_phone_id", precision=19)
    private long homePhoneId;
    @Column(name="home_phone_value", length=20)
    private String homePhoneValue;
    @Column(name="home_phone_user_created", length=120)
    private String homePhoneUserCreated;
    @Column(name="home_phone_date_created")
    private Timestamp homePhoneDateCreated;
    @Column(name="home_phone_user_modified", length=120)
    private String homePhoneUserModified;
    @Column(name="home_phone_date_modified")
    private Timestamp homePhoneDateModified;
    @Column(name="home_phone_numeric_phone_number", length=20)
    private String homePhoneNumericPhoneNumber;
    @Column(name="business_phone_id", precision=19)
    private long businessPhoneId;
    @Column(name="business_phone_value", length=20)
    private String businessPhoneValue;
    @Column(name="business_phone_user_created", length=120)
    private String businessPhoneUserCreated;
    @Column(name="business_phone_date_created")
    private Timestamp businessPhoneDateCreated;
    @Column(name="business_phone_user_modified", length=120)
    private String businessPhoneUserModified;
    @Column(name="business_phone_date_modified")
    private Timestamp businessPhoneDateModified;
    @Column(name="business_phone_numeric_phone_number", length=20)
    private String businessPhoneNumericPhoneNumber;
    @Column(name="mobile_phone_id", precision=19)
    private long mobilePhoneId;
    @Column(name="mobile_phone_value", length=20)
    private String mobilePhoneValue;
    @Column(name="mobile_phone_user_created", length=120)
    private String mobilePhoneUserCreated;
    @Column(name="mobile_phone_date_created")
    private Timestamp mobilePhoneDateCreated;
    @Column(name="mobile_phone_user_modified", length=120)
    private String mobilePhoneUserModified;
    @Column(name="mobile_phone_date_modified")
    private Timestamp mobilePhoneDateModified;
    @Column(name="mobile_phone_numeric_phone_number", length=20)
    private String mobilePhoneNumericPhoneNumber;
    @Column(name="external_email_id", precision=19)
    private long externalEmailId;
    @Column(name="external_email_address", length=4000)
    private String externalEmailAddress;
    @Column(name="external_email_address_user_created", length=4000)
    private String externalEmailAddressUserCreated;
    @Column(name="external_email_address_date_created")
    private Timestamp externalEmailAddressDateCreated;
    @Column(name="external_email_address_user_modified", length=4000)
    private String externalEmailAddressUserModified;
    @Column(name="external_email_address_date_modified")
    private Timestamp externalEmailAddressDateModified;
    @Column(name="client_email_id", precision=19)
    private long clientEmailId;
    @Column(name="client_email_address", length=4000)
    private String clientEmailAddress;
    @Column(name="client_email_address_user_created", length=4000)
    private String clientEmailAddressUserCreated;
    @Column(name="client_email_address_date_created")
    private Timestamp clientEmailAddressDateCreated;
    @Column(name="client_email_address_user_modified", length=4000)
    private String clientEmailAddressUserModified;
    @Column(name="client_email_address_date_modified")
    private Timestamp clientEmailAddressDateModified;
    @Column(name="primary_email_id", precision=19)
    private long primaryEmailId;
    @Column(name="primary_email_address", length=4000)
    private String primaryEmailAddress;
    @Column(name="primary_email_address_user_created", length=4000)
    private String primaryEmailAddressUserCreated;
    @Column(name="primary_email_address_date_created")
    private Timestamp primaryEmailAddressDateCreated;
    @Column(name="primary_email_address_user_modified", length=4000)
    private String primaryEmailAddressUserModified;
    @Column(name="primary_email_address_date_modified")
    private Timestamp primaryEmailAddressDateModified;
    @Column(name="stage_created_date")
    private Timestamp stageCreatedDate;
    @Column(name="stage_updated_date")
    private Timestamp stageUpdatedDate;
    @OneToMany(mappedBy="stageMember")
    private Set<StageServiceRequest> stageServiceRequest;
    @OneToMany(mappedBy="stageMember")
    private Set<StageMemberAttribute> stageMemberAttribute;
    @OneToMany(mappedBy="stageMember")
    private Set<StageMemberAddresseeHistory> stageMemberAddresseeHistory;
    @OneToMany(mappedBy="stageMember")
    private Set<StageMemberAddressHistory> stageMemberAddressHistory;
    @OneToMany(mappedBy="stageMember")
    private Set<StageHubBenefitUsage> stageHubBenefitUsage;
    @OneToMany(mappedBy="stageMember")
    private Set<StageEventTrack> stageEventTrack;
    @OneToMany(mappedBy="stageMember")
    private Set<StageCommEvent> stageCommEvent;
    @OneToMany(mappedBy="stageMember")
    private Set<StageBankAccount> stageBankAccount;
    @OneToMany(mappedBy="stageMember")
    private Set<StageProtectedCard> stageProtectedCard;
    @OneToMany(mappedBy="stageMember")
    private Set<StageProofOfEnroll> stageProofOfEnroll;
    @OneToMany(mappedBy="stageMember")
    private Set<StagePaymentVehicle> stagePaymentVehicle;
    @OneToMany(mappedBy="stageMember")
    private Set<StageMembershipMember> stageMembershipMember;
    @OneToMany(mappedBy="stageMember")
    private Set<StageMemberPrefs> stageMemberPrefs;
    @OneToMany(mappedBy="stageMember")
    private Set<StageMemberPhoneHistory> stageMemberPhoneHistory;
    @OneToMany(mappedBy="stageMember")
    private Set<StageMemberEmailHistory> stageMemberEmailHistory;
    @OneToMany(mappedBy="stageMember")
    private Set<StageMemberCancelHistory> stageMemberCancelHistory;

    /** Default constructor. */
    public StageMember() {
        super();
    }

    /**
     * Access method for memberId.
     *
     * @return the current value of memberId
     */
    public long getMemberId() {
        return memberId;
    }

    /**
     * Setter method for memberId.
     *
     * @param aMemberId the new value for memberId
     */
    public void setMemberId(long aMemberId) {
        memberId = aMemberId;
    }

    /**
     * Access method for titleId.
     *
     * @return the current value of titleId
     */
    public long getTitleId() {
        return titleId;
    }

    /**
     * Setter method for titleId.
     *
     * @param aTitleId the new value for titleId
     */
    public void setTitleId(long aTitleId) {
        titleId = aTitleId;
    }

    /**
     * Access method for titleDesc.
     *
     * @return the current value of titleDesc
     */
    public String getTitleDesc() {
        return titleDesc;
    }

    /**
     * Setter method for titleDesc.
     *
     * @param aTitleDesc the new value for titleDesc
     */
    public void setTitleDesc(String aTitleDesc) {
        titleDesc = aTitleDesc;
    }

    /**
     * Access method for fname.
     *
     * @return the current value of fname
     */
    public String getFname() {
        return fname;
    }

    /**
     * Setter method for fname.
     *
     * @param aFname the new value for fname
     */
    public void setFname(String aFname) {
        fname = aFname;
    }

    /**
     * Access method for mname.
     *
     * @return the current value of mname
     */
    public String getMname() {
        return mname;
    }

    /**
     * Setter method for mname.
     *
     * @param aMname the new value for mname
     */
    public void setMname(String aMname) {
        mname = aMname;
    }

    /**
     * Access method for lname.
     *
     * @return the current value of lname
     */
    public String getLname() {
        return lname;
    }

    /**
     * Setter method for lname.
     *
     * @param aLname the new value for lname
     */
    public void setLname(String aLname) {
        lname = aLname;
    }

    /**
     * Access method for suffix.
     *
     * @return the current value of suffix
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * Setter method for suffix.
     *
     * @param aSuffix the new value for suffix
     */
    public void setSuffix(String aSuffix) {
        suffix = aSuffix;
    }

    /**
     * Access method for dob.
     *
     * @return the current value of dob
     */
    public Timestamp getDob() {
        return dob;
    }

    /**
     * Setter method for dob.
     *
     * @param aDob the new value for dob
     */
    public void setDob(Timestamp aDob) {
        dob = aDob;
    }

    /**
     * Access method for genderSysid.
     *
     * @return the current value of genderSysid
     */
    public BigDecimal getGenderSysid() {
        return genderSysid;
    }

    /**
     * Setter method for genderSysid.
     *
     * @param aGenderSysid the new value for genderSysid
     */
    public void setGenderSysid(BigDecimal aGenderSysid) {
        genderSysid = aGenderSysid;
    }

    /**
     * Access method for memGenderCode.
     *
     * @return the current value of memGenderCode
     */
    public String getMemGenderCode() {
        return memGenderCode;
    }

    /**
     * Setter method for memGenderCode.
     *
     * @param aMemGenderCode the new value for memGenderCode
     */
    public void setMemGenderCode(String aMemGenderCode) {
        memGenderCode = aMemGenderCode;
    }

    /**
     * Access method for memGenderName.
     *
     * @return the current value of memGenderName
     */
    public String getMemGenderName() {
        return memGenderName;
    }

    /**
     * Setter method for memGenderName.
     *
     * @param aMemGenderName the new value for memGenderName
     */
    public void setMemGenderName(String aMemGenderName) {
        memGenderName = aMemGenderName;
    }

    /**
     * Access method for nationalId.
     *
     * @return the current value of nationalId
     */
    public String getNationalId() {
        return nationalId;
    }

    /**
     * Setter method for nationalId.
     *
     * @param aNationalId the new value for nationalId
     */
    public void setNationalId(String aNationalId) {
        nationalId = aNationalId;
    }

    /**
     * Access method for isActive.
     *
     * @return true if and only if isActive is currently true
     */
    public boolean getIsActive() {
        return isActive;
    }

    /**
     * Setter method for isActive.
     *
     * @param aIsActive the new value for isActive
     */
    public void setIsActive(boolean aIsActive) {
        isActive = aIsActive;
    }

    /**
     * Access method for createdBy.
     *
     * @return the current value of createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Setter method for createdBy.
     *
     * @param aCreatedBy the new value for createdBy
     */
    public void setCreatedBy(String aCreatedBy) {
        createdBy = aCreatedBy;
    }

    /**
     * Access method for createdDate.
     *
     * @return the current value of createdDate
     */
    public Timestamp getCreatedDate() {
        return createdDate;
    }

    /**
     * Setter method for createdDate.
     *
     * @param aCreatedDate the new value for createdDate
     */
    public void setCreatedDate(Timestamp aCreatedDate) {
        createdDate = aCreatedDate;
    }

    /**
     * Access method for updatedBy.
     *
     * @return the current value of updatedBy
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * Setter method for updatedBy.
     *
     * @param aUpdatedBy the new value for updatedBy
     */
    public void setUpdatedBy(String aUpdatedBy) {
        updatedBy = aUpdatedBy;
    }

    /**
     * Access method for updatedDate.
     *
     * @return the current value of updatedDate
     */
    public Timestamp getUpdatedDate() {
        return updatedDate;
    }

    /**
     * Setter method for updatedDate.
     *
     * @param aUpdatedDate the new value for updatedDate
     */
    public void setUpdatedDate(Timestamp aUpdatedDate) {
        updatedDate = aUpdatedDate;
    }

    /**
     * Access method for salutation.
     *
     * @return the current value of salutation
     */
    public String getSalutation() {
        return salutation;
    }

    /**
     * Setter method for salutation.
     *
     * @param aSalutation the new value for salutation
     */
    public void setSalutation(String aSalutation) {
        salutation = aSalutation;
    }

    /**
     * Access method for languageId.
     *
     * @return the current value of languageId
     */
    public long getLanguageId() {
        return languageId;
    }

    /**
     * Setter method for languageId.
     *
     * @param aLanguageId the new value for languageId
     */
    public void setLanguageId(long aLanguageId) {
        languageId = aLanguageId;
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
     * Access method for memAddressTypeDesc.
     *
     * @return the current value of memAddressTypeDesc
     */
    public String getMemAddressTypeDesc() {
        return memAddressTypeDesc;
    }

    /**
     * Setter method for memAddressTypeDesc.
     *
     * @param aMemAddressTypeDesc the new value for memAddressTypeDesc
     */
    public void setMemAddressTypeDesc(String aMemAddressTypeDesc) {
        memAddressTypeDesc = aMemAddressTypeDesc;
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
     * Access method for memAddressUserCreated.
     *
     * @return the current value of memAddressUserCreated
     */
    public String getMemAddressUserCreated() {
        return memAddressUserCreated;
    }

    /**
     * Setter method for memAddressUserCreated.
     *
     * @param aMemAddressUserCreated the new value for memAddressUserCreated
     */
    public void setMemAddressUserCreated(String aMemAddressUserCreated) {
        memAddressUserCreated = aMemAddressUserCreated;
    }

    /**
     * Access method for memAddressDateCreated.
     *
     * @return the current value of memAddressDateCreated
     */
    public Timestamp getMemAddressDateCreated() {
        return memAddressDateCreated;
    }

    /**
     * Setter method for memAddressDateCreated.
     *
     * @param aMemAddressDateCreated the new value for memAddressDateCreated
     */
    public void setMemAddressDateCreated(Timestamp aMemAddressDateCreated) {
        memAddressDateCreated = aMemAddressDateCreated;
    }

    /**
     * Access method for memAddressUserModified.
     *
     * @return the current value of memAddressUserModified
     */
    public String getMemAddressUserModified() {
        return memAddressUserModified;
    }

    /**
     * Setter method for memAddressUserModified.
     *
     * @param aMemAddressUserModified the new value for memAddressUserModified
     */
    public void setMemAddressUserModified(String aMemAddressUserModified) {
        memAddressUserModified = aMemAddressUserModified;
    }

    /**
     * Access method for memAddressDateModified.
     *
     * @return the current value of memAddressDateModified
     */
    public Timestamp getMemAddressDateModified() {
        return memAddressDateModified;
    }

    /**
     * Setter method for memAddressDateModified.
     *
     * @param aMemAddressDateModified the new value for memAddressDateModified
     */
    public void setMemAddressDateModified(Timestamp aMemAddressDateModified) {
        memAddressDateModified = aMemAddressDateModified;
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
     * Access method for dateMovedToAddr.
     *
     * @return the current value of dateMovedToAddr
     */
    public Timestamp getDateMovedToAddr() {
        return dateMovedToAddr;
    }

    /**
     * Setter method for dateMovedToAddr.
     *
     * @param aDateMovedToAddr the new value for dateMovedToAddr
     */
    public void setDateMovedToAddr(Timestamp aDateMovedToAddr) {
        dateMovedToAddr = aDateMovedToAddr;
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
     * Access method for stateId.
     *
     * @return the current value of stateId
     */
    public long getStateId() {
        return stateId;
    }

    /**
     * Setter method for stateId.
     *
     * @param aStateId the new value for stateId
     */
    public void setStateId(long aStateId) {
        stateId = aStateId;
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
     * Access method for memAddresseeTypeDesc.
     *
     * @return the current value of memAddresseeTypeDesc
     */
    public String getMemAddresseeTypeDesc() {
        return memAddresseeTypeDesc;
    }

    /**
     * Setter method for memAddresseeTypeDesc.
     *
     * @param aMemAddresseeTypeDesc the new value for memAddresseeTypeDesc
     */
    public void setMemAddresseeTypeDesc(String aMemAddresseeTypeDesc) {
        memAddresseeTypeDesc = aMemAddresseeTypeDesc;
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
     * Access method for memAddresseeUserCreated.
     *
     * @return the current value of memAddresseeUserCreated
     */
    public String getMemAddresseeUserCreated() {
        return memAddresseeUserCreated;
    }

    /**
     * Setter method for memAddresseeUserCreated.
     *
     * @param aMemAddresseeUserCreated the new value for memAddresseeUserCreated
     */
    public void setMemAddresseeUserCreated(String aMemAddresseeUserCreated) {
        memAddresseeUserCreated = aMemAddresseeUserCreated;
    }

    /**
     * Access method for memAddresseeDateCreated.
     *
     * @return the current value of memAddresseeDateCreated
     */
    public Timestamp getMemAddresseeDateCreated() {
        return memAddresseeDateCreated;
    }

    /**
     * Setter method for memAddresseeDateCreated.
     *
     * @param aMemAddresseeDateCreated the new value for memAddresseeDateCreated
     */
    public void setMemAddresseeDateCreated(Timestamp aMemAddresseeDateCreated) {
        memAddresseeDateCreated = aMemAddresseeDateCreated;
    }

    /**
     * Access method for memAddresseeUserModified.
     *
     * @return the current value of memAddresseeUserModified
     */
    public String getMemAddresseeUserModified() {
        return memAddresseeUserModified;
    }

    /**
     * Setter method for memAddresseeUserModified.
     *
     * @param aMemAddresseeUserModified the new value for memAddresseeUserModified
     */
    public void setMemAddresseeUserModified(String aMemAddresseeUserModified) {
        memAddresseeUserModified = aMemAddresseeUserModified;
    }

    /**
     * Access method for memAddresseeDateModified.
     *
     * @return the current value of memAddresseeDateModified
     */
    public Timestamp getMemAddresseeDateModified() {
        return memAddresseeDateModified;
    }

    /**
     * Setter method for memAddresseeDateModified.
     *
     * @param aMemAddresseeDateModified the new value for memAddresseeDateModified
     */
    public void setMemAddresseeDateModified(Timestamp aMemAddresseeDateModified) {
        memAddresseeDateModified = aMemAddresseeDateModified;
    }

    /**
     * Access method for homePhoneId.
     *
     * @return the current value of homePhoneId
     */
    public long getHomePhoneId() {
        return homePhoneId;
    }

    /**
     * Setter method for homePhoneId.
     *
     * @param aHomePhoneId the new value for homePhoneId
     */
    public void setHomePhoneId(long aHomePhoneId) {
        homePhoneId = aHomePhoneId;
    }

    /**
     * Access method for homePhoneValue.
     *
     * @return the current value of homePhoneValue
     */
    public String getHomePhoneValue() {
        return homePhoneValue;
    }

    /**
     * Setter method for homePhoneValue.
     *
     * @param aHomePhoneValue the new value for homePhoneValue
     */
    public void setHomePhoneValue(String aHomePhoneValue) {
        homePhoneValue = aHomePhoneValue;
    }

    /**
     * Access method for homePhoneUserCreated.
     *
     * @return the current value of homePhoneUserCreated
     */
    public String getHomePhoneUserCreated() {
        return homePhoneUserCreated;
    }

    /**
     * Setter method for homePhoneUserCreated.
     *
     * @param aHomePhoneUserCreated the new value for homePhoneUserCreated
     */
    public void setHomePhoneUserCreated(String aHomePhoneUserCreated) {
        homePhoneUserCreated = aHomePhoneUserCreated;
    }

    /**
     * Access method for homePhoneDateCreated.
     *
     * @return the current value of homePhoneDateCreated
     */
    public Timestamp getHomePhoneDateCreated() {
        return homePhoneDateCreated;
    }

    /**
     * Setter method for homePhoneDateCreated.
     *
     * @param aHomePhoneDateCreated the new value for homePhoneDateCreated
     */
    public void setHomePhoneDateCreated(Timestamp aHomePhoneDateCreated) {
        homePhoneDateCreated = aHomePhoneDateCreated;
    }

    /**
     * Access method for homePhoneUserModified.
     *
     * @return the current value of homePhoneUserModified
     */
    public String getHomePhoneUserModified() {
        return homePhoneUserModified;
    }

    /**
     * Setter method for homePhoneUserModified.
     *
     * @param aHomePhoneUserModified the new value for homePhoneUserModified
     */
    public void setHomePhoneUserModified(String aHomePhoneUserModified) {
        homePhoneUserModified = aHomePhoneUserModified;
    }

    /**
     * Access method for homePhoneDateModified.
     *
     * @return the current value of homePhoneDateModified
     */
    public Timestamp getHomePhoneDateModified() {
        return homePhoneDateModified;
    }

    /**
     * Setter method for homePhoneDateModified.
     *
     * @param aHomePhoneDateModified the new value for homePhoneDateModified
     */
    public void setHomePhoneDateModified(Timestamp aHomePhoneDateModified) {
        homePhoneDateModified = aHomePhoneDateModified;
    }

    /**
     * Access method for homePhoneNumericPhoneNumber.
     *
     * @return the current value of homePhoneNumericPhoneNumber
     */
    public String getHomePhoneNumericPhoneNumber() {
        return homePhoneNumericPhoneNumber;
    }

    /**
     * Setter method for homePhoneNumericPhoneNumber.
     *
     * @param aHomePhoneNumericPhoneNumber the new value for homePhoneNumericPhoneNumber
     */
    public void setHomePhoneNumericPhoneNumber(String aHomePhoneNumericPhoneNumber) {
        homePhoneNumericPhoneNumber = aHomePhoneNumericPhoneNumber;
    }

    /**
     * Access method for businessPhoneId.
     *
     * @return the current value of businessPhoneId
     */
    public long getBusinessPhoneId() {
        return businessPhoneId;
    }

    /**
     * Setter method for businessPhoneId.
     *
     * @param aBusinessPhoneId the new value for businessPhoneId
     */
    public void setBusinessPhoneId(long aBusinessPhoneId) {
        businessPhoneId = aBusinessPhoneId;
    }

    /**
     * Access method for businessPhoneValue.
     *
     * @return the current value of businessPhoneValue
     */
    public String getBusinessPhoneValue() {
        return businessPhoneValue;
    }

    /**
     * Setter method for businessPhoneValue.
     *
     * @param aBusinessPhoneValue the new value for businessPhoneValue
     */
    public void setBusinessPhoneValue(String aBusinessPhoneValue) {
        businessPhoneValue = aBusinessPhoneValue;
    }

    /**
     * Access method for businessPhoneUserCreated.
     *
     * @return the current value of businessPhoneUserCreated
     */
    public String getBusinessPhoneUserCreated() {
        return businessPhoneUserCreated;
    }

    /**
     * Setter method for businessPhoneUserCreated.
     *
     * @param aBusinessPhoneUserCreated the new value for businessPhoneUserCreated
     */
    public void setBusinessPhoneUserCreated(String aBusinessPhoneUserCreated) {
        businessPhoneUserCreated = aBusinessPhoneUserCreated;
    }

    /**
     * Access method for businessPhoneDateCreated.
     *
     * @return the current value of businessPhoneDateCreated
     */
    public Timestamp getBusinessPhoneDateCreated() {
        return businessPhoneDateCreated;
    }

    /**
     * Setter method for businessPhoneDateCreated.
     *
     * @param aBusinessPhoneDateCreated the new value for businessPhoneDateCreated
     */
    public void setBusinessPhoneDateCreated(Timestamp aBusinessPhoneDateCreated) {
        businessPhoneDateCreated = aBusinessPhoneDateCreated;
    }

    /**
     * Access method for businessPhoneUserModified.
     *
     * @return the current value of businessPhoneUserModified
     */
    public String getBusinessPhoneUserModified() {
        return businessPhoneUserModified;
    }

    /**
     * Setter method for businessPhoneUserModified.
     *
     * @param aBusinessPhoneUserModified the new value for businessPhoneUserModified
     */
    public void setBusinessPhoneUserModified(String aBusinessPhoneUserModified) {
        businessPhoneUserModified = aBusinessPhoneUserModified;
    }

    /**
     * Access method for businessPhoneDateModified.
     *
     * @return the current value of businessPhoneDateModified
     */
    public Timestamp getBusinessPhoneDateModified() {
        return businessPhoneDateModified;
    }

    /**
     * Setter method for businessPhoneDateModified.
     *
     * @param aBusinessPhoneDateModified the new value for businessPhoneDateModified
     */
    public void setBusinessPhoneDateModified(Timestamp aBusinessPhoneDateModified) {
        businessPhoneDateModified = aBusinessPhoneDateModified;
    }

    /**
     * Access method for businessPhoneNumericPhoneNumber.
     *
     * @return the current value of businessPhoneNumericPhoneNumber
     */
    public String getBusinessPhoneNumericPhoneNumber() {
        return businessPhoneNumericPhoneNumber;
    }

    /**
     * Setter method for businessPhoneNumericPhoneNumber.
     *
     * @param aBusinessPhoneNumericPhoneNumber the new value for businessPhoneNumericPhoneNumber
     */
    public void setBusinessPhoneNumericPhoneNumber(String aBusinessPhoneNumericPhoneNumber) {
        businessPhoneNumericPhoneNumber = aBusinessPhoneNumericPhoneNumber;
    }

    /**
     * Access method for mobilePhoneId.
     *
     * @return the current value of mobilePhoneId
     */
    public long getMobilePhoneId() {
        return mobilePhoneId;
    }

    /**
     * Setter method for mobilePhoneId.
     *
     * @param aMobilePhoneId the new value for mobilePhoneId
     */
    public void setMobilePhoneId(long aMobilePhoneId) {
        mobilePhoneId = aMobilePhoneId;
    }

    /**
     * Access method for mobilePhoneValue.
     *
     * @return the current value of mobilePhoneValue
     */
    public String getMobilePhoneValue() {
        return mobilePhoneValue;
    }

    /**
     * Setter method for mobilePhoneValue.
     *
     * @param aMobilePhoneValue the new value for mobilePhoneValue
     */
    public void setMobilePhoneValue(String aMobilePhoneValue) {
        mobilePhoneValue = aMobilePhoneValue;
    }

    /**
     * Access method for mobilePhoneUserCreated.
     *
     * @return the current value of mobilePhoneUserCreated
     */
    public String getMobilePhoneUserCreated() {
        return mobilePhoneUserCreated;
    }

    /**
     * Setter method for mobilePhoneUserCreated.
     *
     * @param aMobilePhoneUserCreated the new value for mobilePhoneUserCreated
     */
    public void setMobilePhoneUserCreated(String aMobilePhoneUserCreated) {
        mobilePhoneUserCreated = aMobilePhoneUserCreated;
    }

    /**
     * Access method for mobilePhoneDateCreated.
     *
     * @return the current value of mobilePhoneDateCreated
     */
    public Timestamp getMobilePhoneDateCreated() {
        return mobilePhoneDateCreated;
    }

    /**
     * Setter method for mobilePhoneDateCreated.
     *
     * @param aMobilePhoneDateCreated the new value for mobilePhoneDateCreated
     */
    public void setMobilePhoneDateCreated(Timestamp aMobilePhoneDateCreated) {
        mobilePhoneDateCreated = aMobilePhoneDateCreated;
    }

    /**
     * Access method for mobilePhoneUserModified.
     *
     * @return the current value of mobilePhoneUserModified
     */
    public String getMobilePhoneUserModified() {
        return mobilePhoneUserModified;
    }

    /**
     * Setter method for mobilePhoneUserModified.
     *
     * @param aMobilePhoneUserModified the new value for mobilePhoneUserModified
     */
    public void setMobilePhoneUserModified(String aMobilePhoneUserModified) {
        mobilePhoneUserModified = aMobilePhoneUserModified;
    }

    /**
     * Access method for mobilePhoneDateModified.
     *
     * @return the current value of mobilePhoneDateModified
     */
    public Timestamp getMobilePhoneDateModified() {
        return mobilePhoneDateModified;
    }

    /**
     * Setter method for mobilePhoneDateModified.
     *
     * @param aMobilePhoneDateModified the new value for mobilePhoneDateModified
     */
    public void setMobilePhoneDateModified(Timestamp aMobilePhoneDateModified) {
        mobilePhoneDateModified = aMobilePhoneDateModified;
    }

    /**
     * Access method for mobilePhoneNumericPhoneNumber.
     *
     * @return the current value of mobilePhoneNumericPhoneNumber
     */
    public String getMobilePhoneNumericPhoneNumber() {
        return mobilePhoneNumericPhoneNumber;
    }

    /**
     * Setter method for mobilePhoneNumericPhoneNumber.
     *
     * @param aMobilePhoneNumericPhoneNumber the new value for mobilePhoneNumericPhoneNumber
     */
    public void setMobilePhoneNumericPhoneNumber(String aMobilePhoneNumericPhoneNumber) {
        mobilePhoneNumericPhoneNumber = aMobilePhoneNumericPhoneNumber;
    }

    /**
     * Access method for externalEmailId.
     *
     * @return the current value of externalEmailId
     */
    public long getExternalEmailId() {
        return externalEmailId;
    }

    /**
     * Setter method for externalEmailId.
     *
     * @param aExternalEmailId the new value for externalEmailId
     */
    public void setExternalEmailId(long aExternalEmailId) {
        externalEmailId = aExternalEmailId;
    }

    /**
     * Access method for externalEmailAddress.
     *
     * @return the current value of externalEmailAddress
     */
    public String getExternalEmailAddress() {
        return externalEmailAddress;
    }

    /**
     * Setter method for externalEmailAddress.
     *
     * @param aExternalEmailAddress the new value for externalEmailAddress
     */
    public void setExternalEmailAddress(String aExternalEmailAddress) {
        externalEmailAddress = aExternalEmailAddress;
    }

    /**
     * Access method for externalEmailAddressUserCreated.
     *
     * @return the current value of externalEmailAddressUserCreated
     */
    public String getExternalEmailAddressUserCreated() {
        return externalEmailAddressUserCreated;
    }

    /**
     * Setter method for externalEmailAddressUserCreated.
     *
     * @param aExternalEmailAddressUserCreated the new value for externalEmailAddressUserCreated
     */
    public void setExternalEmailAddressUserCreated(String aExternalEmailAddressUserCreated) {
        externalEmailAddressUserCreated = aExternalEmailAddressUserCreated;
    }

    /**
     * Access method for externalEmailAddressDateCreated.
     *
     * @return the current value of externalEmailAddressDateCreated
     */
    public Timestamp getExternalEmailAddressDateCreated() {
        return externalEmailAddressDateCreated;
    }

    /**
     * Setter method for externalEmailAddressDateCreated.
     *
     * @param aExternalEmailAddressDateCreated the new value for externalEmailAddressDateCreated
     */
    public void setExternalEmailAddressDateCreated(Timestamp aExternalEmailAddressDateCreated) {
        externalEmailAddressDateCreated = aExternalEmailAddressDateCreated;
    }

    /**
     * Access method for externalEmailAddressUserModified.
     *
     * @return the current value of externalEmailAddressUserModified
     */
    public String getExternalEmailAddressUserModified() {
        return externalEmailAddressUserModified;
    }

    /**
     * Setter method for externalEmailAddressUserModified.
     *
     * @param aExternalEmailAddressUserModified the new value for externalEmailAddressUserModified
     */
    public void setExternalEmailAddressUserModified(String aExternalEmailAddressUserModified) {
        externalEmailAddressUserModified = aExternalEmailAddressUserModified;
    }

    /**
     * Access method for externalEmailAddressDateModified.
     *
     * @return the current value of externalEmailAddressDateModified
     */
    public Timestamp getExternalEmailAddressDateModified() {
        return externalEmailAddressDateModified;
    }

    /**
     * Setter method for externalEmailAddressDateModified.
     *
     * @param aExternalEmailAddressDateModified the new value for externalEmailAddressDateModified
     */
    public void setExternalEmailAddressDateModified(Timestamp aExternalEmailAddressDateModified) {
        externalEmailAddressDateModified = aExternalEmailAddressDateModified;
    }

    /**
     * Access method for clientEmailId.
     *
     * @return the current value of clientEmailId
     */
    public long getClientEmailId() {
        return clientEmailId;
    }

    /**
     * Setter method for clientEmailId.
     *
     * @param aClientEmailId the new value for clientEmailId
     */
    public void setClientEmailId(long aClientEmailId) {
        clientEmailId = aClientEmailId;
    }

    /**
     * Access method for clientEmailAddress.
     *
     * @return the current value of clientEmailAddress
     */
    public String getClientEmailAddress() {
        return clientEmailAddress;
    }

    /**
     * Setter method for clientEmailAddress.
     *
     * @param aClientEmailAddress the new value for clientEmailAddress
     */
    public void setClientEmailAddress(String aClientEmailAddress) {
        clientEmailAddress = aClientEmailAddress;
    }

    /**
     * Access method for clientEmailAddressUserCreated.
     *
     * @return the current value of clientEmailAddressUserCreated
     */
    public String getClientEmailAddressUserCreated() {
        return clientEmailAddressUserCreated;
    }

    /**
     * Setter method for clientEmailAddressUserCreated.
     *
     * @param aClientEmailAddressUserCreated the new value for clientEmailAddressUserCreated
     */
    public void setClientEmailAddressUserCreated(String aClientEmailAddressUserCreated) {
        clientEmailAddressUserCreated = aClientEmailAddressUserCreated;
    }

    /**
     * Access method for clientEmailAddressDateCreated.
     *
     * @return the current value of clientEmailAddressDateCreated
     */
    public Timestamp getClientEmailAddressDateCreated() {
        return clientEmailAddressDateCreated;
    }

    /**
     * Setter method for clientEmailAddressDateCreated.
     *
     * @param aClientEmailAddressDateCreated the new value for clientEmailAddressDateCreated
     */
    public void setClientEmailAddressDateCreated(Timestamp aClientEmailAddressDateCreated) {
        clientEmailAddressDateCreated = aClientEmailAddressDateCreated;
    }

    /**
     * Access method for clientEmailAddressUserModified.
     *
     * @return the current value of clientEmailAddressUserModified
     */
    public String getClientEmailAddressUserModified() {
        return clientEmailAddressUserModified;
    }

    /**
     * Setter method for clientEmailAddressUserModified.
     *
     * @param aClientEmailAddressUserModified the new value for clientEmailAddressUserModified
     */
    public void setClientEmailAddressUserModified(String aClientEmailAddressUserModified) {
        clientEmailAddressUserModified = aClientEmailAddressUserModified;
    }

    /**
     * Access method for clientEmailAddressDateModified.
     *
     * @return the current value of clientEmailAddressDateModified
     */
    public Timestamp getClientEmailAddressDateModified() {
        return clientEmailAddressDateModified;
    }

    /**
     * Setter method for clientEmailAddressDateModified.
     *
     * @param aClientEmailAddressDateModified the new value for clientEmailAddressDateModified
     */
    public void setClientEmailAddressDateModified(Timestamp aClientEmailAddressDateModified) {
        clientEmailAddressDateModified = aClientEmailAddressDateModified;
    }

    /**
     * Access method for primaryEmailId.
     *
     * @return the current value of primaryEmailId
     */
    public long getPrimaryEmailId() {
        return primaryEmailId;
    }

    /**
     * Setter method for primaryEmailId.
     *
     * @param aPrimaryEmailId the new value for primaryEmailId
     */
    public void setPrimaryEmailId(long aPrimaryEmailId) {
        primaryEmailId = aPrimaryEmailId;
    }

    /**
     * Access method for primaryEmailAddress.
     *
     * @return the current value of primaryEmailAddress
     */
    public String getPrimaryEmailAddress() {
        return primaryEmailAddress;
    }

    /**
     * Setter method for primaryEmailAddress.
     *
     * @param aPrimaryEmailAddress the new value for primaryEmailAddress
     */
    public void setPrimaryEmailAddress(String aPrimaryEmailAddress) {
        primaryEmailAddress = aPrimaryEmailAddress;
    }

    /**
     * Access method for primaryEmailAddressUserCreated.
     *
     * @return the current value of primaryEmailAddressUserCreated
     */
    public String getPrimaryEmailAddressUserCreated() {
        return primaryEmailAddressUserCreated;
    }

    /**
     * Setter method for primaryEmailAddressUserCreated.
     *
     * @param aPrimaryEmailAddressUserCreated the new value for primaryEmailAddressUserCreated
     */
    public void setPrimaryEmailAddressUserCreated(String aPrimaryEmailAddressUserCreated) {
        primaryEmailAddressUserCreated = aPrimaryEmailAddressUserCreated;
    }

    /**
     * Access method for primaryEmailAddressDateCreated.
     *
     * @return the current value of primaryEmailAddressDateCreated
     */
    public Timestamp getPrimaryEmailAddressDateCreated() {
        return primaryEmailAddressDateCreated;
    }

    /**
     * Setter method for primaryEmailAddressDateCreated.
     *
     * @param aPrimaryEmailAddressDateCreated the new value for primaryEmailAddressDateCreated
     */
    public void setPrimaryEmailAddressDateCreated(Timestamp aPrimaryEmailAddressDateCreated) {
        primaryEmailAddressDateCreated = aPrimaryEmailAddressDateCreated;
    }

    /**
     * Access method for primaryEmailAddressUserModified.
     *
     * @return the current value of primaryEmailAddressUserModified
     */
    public String getPrimaryEmailAddressUserModified() {
        return primaryEmailAddressUserModified;
    }

    /**
     * Setter method for primaryEmailAddressUserModified.
     *
     * @param aPrimaryEmailAddressUserModified the new value for primaryEmailAddressUserModified
     */
    public void setPrimaryEmailAddressUserModified(String aPrimaryEmailAddressUserModified) {
        primaryEmailAddressUserModified = aPrimaryEmailAddressUserModified;
    }

    /**
     * Access method for primaryEmailAddressDateModified.
     *
     * @return the current value of primaryEmailAddressDateModified
     */
    public Timestamp getPrimaryEmailAddressDateModified() {
        return primaryEmailAddressDateModified;
    }

    /**
     * Setter method for primaryEmailAddressDateModified.
     *
     * @param aPrimaryEmailAddressDateModified the new value for primaryEmailAddressDateModified
     */
    public void setPrimaryEmailAddressDateModified(Timestamp aPrimaryEmailAddressDateModified) {
        primaryEmailAddressDateModified = aPrimaryEmailAddressDateModified;
    }

    /**
     * Access method for stageCreatedDate.
     *
     * @return the current value of stageCreatedDate
     */
    public Timestamp getStageCreatedDate() {
        return stageCreatedDate;
    }

    /**
     * Setter method for stageCreatedDate.
     *
     * @param aStageCreatedDate the new value for stageCreatedDate
     */
    public void setStageCreatedDate(Timestamp aStageCreatedDate) {
        stageCreatedDate = aStageCreatedDate;
    }

    /**
     * Access method for stageUpdatedDate.
     *
     * @return the current value of stageUpdatedDate
     */
    public Timestamp getStageUpdatedDate() {
        return stageUpdatedDate;
    }

    /**
     * Setter method for stageUpdatedDate.
     *
     * @param aStageUpdatedDate the new value for stageUpdatedDate
     */
    public void setStageUpdatedDate(Timestamp aStageUpdatedDate) {
        stageUpdatedDate = aStageUpdatedDate;
    }

    /**
     * Access method for stageServiceRequest.
     *
     * @return the current value of stageServiceRequest
     */
    public Set<StageServiceRequest> getStageServiceRequest() {
        return stageServiceRequest;
    }

    /**
     * Setter method for stageServiceRequest.
     *
     * @param aStageServiceRequest the new value for stageServiceRequest
     */
    public void setStageServiceRequest(Set<StageServiceRequest> aStageServiceRequest) {
        stageServiceRequest = aStageServiceRequest;
    }

    /**
     * Access method for stageMemberAttribute.
     *
     * @return the current value of stageMemberAttribute
     */
    public Set<StageMemberAttribute> getStageMemberAttribute() {
        return stageMemberAttribute;
    }

    /**
     * Setter method for stageMemberAttribute.
     *
     * @param aStageMemberAttribute the new value for stageMemberAttribute
     */
    public void setStageMemberAttribute(Set<StageMemberAttribute> aStageMemberAttribute) {
        stageMemberAttribute = aStageMemberAttribute;
    }

    /**
     * Access method for stageMemberAddresseeHistory.
     *
     * @return the current value of stageMemberAddresseeHistory
     */
    public Set<StageMemberAddresseeHistory> getStageMemberAddresseeHistory() {
        return stageMemberAddresseeHistory;
    }

    /**
     * Setter method for stageMemberAddresseeHistory.
     *
     * @param aStageMemberAddresseeHistory the new value for stageMemberAddresseeHistory
     */
    public void setStageMemberAddresseeHistory(Set<StageMemberAddresseeHistory> aStageMemberAddresseeHistory) {
        stageMemberAddresseeHistory = aStageMemberAddresseeHistory;
    }

    /**
     * Access method for stageMemberAddressHistory.
     *
     * @return the current value of stageMemberAddressHistory
     */
    public Set<StageMemberAddressHistory> getStageMemberAddressHistory() {
        return stageMemberAddressHistory;
    }

    /**
     * Setter method for stageMemberAddressHistory.
     *
     * @param aStageMemberAddressHistory the new value for stageMemberAddressHistory
     */
    public void setStageMemberAddressHistory(Set<StageMemberAddressHistory> aStageMemberAddressHistory) {
        stageMemberAddressHistory = aStageMemberAddressHistory;
    }

    /**
     * Access method for stageHubBenefitUsage.
     *
     * @return the current value of stageHubBenefitUsage
     */
    public Set<StageHubBenefitUsage> getStageHubBenefitUsage() {
        return stageHubBenefitUsage;
    }

    /**
     * Setter method for stageHubBenefitUsage.
     *
     * @param aStageHubBenefitUsage the new value for stageHubBenefitUsage
     */
    public void setStageHubBenefitUsage(Set<StageHubBenefitUsage> aStageHubBenefitUsage) {
        stageHubBenefitUsage = aStageHubBenefitUsage;
    }

    /**
     * Access method for stageEventTrack.
     *
     * @return the current value of stageEventTrack
     */
    public Set<StageEventTrack> getStageEventTrack() {
        return stageEventTrack;
    }

    /**
     * Setter method for stageEventTrack.
     *
     * @param aStageEventTrack the new value for stageEventTrack
     */
    public void setStageEventTrack(Set<StageEventTrack> aStageEventTrack) {
        stageEventTrack = aStageEventTrack;
    }

    /**
     * Access method for stageCommEvent.
     *
     * @return the current value of stageCommEvent
     */
    public Set<StageCommEvent> getStageCommEvent() {
        return stageCommEvent;
    }

    /**
     * Setter method for stageCommEvent.
     *
     * @param aStageCommEvent the new value for stageCommEvent
     */
    public void setStageCommEvent(Set<StageCommEvent> aStageCommEvent) {
        stageCommEvent = aStageCommEvent;
    }

    /**
     * Access method for stageBankAccount.
     *
     * @return the current value of stageBankAccount
     */
    public Set<StageBankAccount> getStageBankAccount() {
        return stageBankAccount;
    }

    /**
     * Setter method for stageBankAccount.
     *
     * @param aStageBankAccount the new value for stageBankAccount
     */
    public void setStageBankAccount(Set<StageBankAccount> aStageBankAccount) {
        stageBankAccount = aStageBankAccount;
    }

    /**
     * Access method for stageProtectedCard.
     *
     * @return the current value of stageProtectedCard
     */
    public Set<StageProtectedCard> getStageProtectedCard() {
        return stageProtectedCard;
    }

    /**
     * Setter method for stageProtectedCard.
     *
     * @param aStageProtectedCard the new value for stageProtectedCard
     */
    public void setStageProtectedCard(Set<StageProtectedCard> aStageProtectedCard) {
        stageProtectedCard = aStageProtectedCard;
    }

    /**
     * Access method for stageProofOfEnroll.
     *
     * @return the current value of stageProofOfEnroll
     */
    public Set<StageProofOfEnroll> getStageProofOfEnroll() {
        return stageProofOfEnroll;
    }

    /**
     * Setter method for stageProofOfEnroll.
     *
     * @param aStageProofOfEnroll the new value for stageProofOfEnroll
     */
    public void setStageProofOfEnroll(Set<StageProofOfEnroll> aStageProofOfEnroll) {
        stageProofOfEnroll = aStageProofOfEnroll;
    }

    /**
     * Access method for stagePaymentVehicle.
     *
     * @return the current value of stagePaymentVehicle
     */
    public Set<StagePaymentVehicle> getStagePaymentVehicle() {
        return stagePaymentVehicle;
    }

    /**
     * Setter method for stagePaymentVehicle.
     *
     * @param aStagePaymentVehicle the new value for stagePaymentVehicle
     */
    public void setStagePaymentVehicle(Set<StagePaymentVehicle> aStagePaymentVehicle) {
        stagePaymentVehicle = aStagePaymentVehicle;
    }

    /**
     * Access method for stageMembershipMember.
     *
     * @return the current value of stageMembershipMember
     */
    public Set<StageMembershipMember> getStageMembershipMember() {
        return stageMembershipMember;
    }

    /**
     * Setter method for stageMembershipMember.
     *
     * @param aStageMembershipMember the new value for stageMembershipMember
     */
    public void setStageMembershipMember(Set<StageMembershipMember> aStageMembershipMember) {
        stageMembershipMember = aStageMembershipMember;
    }

    /**
     * Access method for stageMemberPrefs.
     *
     * @return the current value of stageMemberPrefs
     */
    public Set<StageMemberPrefs> getStageMemberPrefs() {
        return stageMemberPrefs;
    }

    /**
     * Setter method for stageMemberPrefs.
     *
     * @param aStageMemberPrefs the new value for stageMemberPrefs
     */
    public void setStageMemberPrefs(Set<StageMemberPrefs> aStageMemberPrefs) {
        stageMemberPrefs = aStageMemberPrefs;
    }

    /**
     * Access method for stageMemberPhoneHistory.
     *
     * @return the current value of stageMemberPhoneHistory
     */
    public Set<StageMemberPhoneHistory> getStageMemberPhoneHistory() {
        return stageMemberPhoneHistory;
    }

    /**
     * Setter method for stageMemberPhoneHistory.
     *
     * @param aStageMemberPhoneHistory the new value for stageMemberPhoneHistory
     */
    public void setStageMemberPhoneHistory(Set<StageMemberPhoneHistory> aStageMemberPhoneHistory) {
        stageMemberPhoneHistory = aStageMemberPhoneHistory;
    }

    /**
     * Access method for stageMemberEmailHistory.
     *
     * @return the current value of stageMemberEmailHistory
     */
    public Set<StageMemberEmailHistory> getStageMemberEmailHistory() {
        return stageMemberEmailHistory;
    }

    /**
     * Setter method for stageMemberEmailHistory.
     *
     * @param aStageMemberEmailHistory the new value for stageMemberEmailHistory
     */
    public void setStageMemberEmailHistory(Set<StageMemberEmailHistory> aStageMemberEmailHistory) {
        stageMemberEmailHistory = aStageMemberEmailHistory;
    }

    /**
     * Access method for stageMemberCancelHistory.
     *
     * @return the current value of stageMemberCancelHistory
     */
    public Set<StageMemberCancelHistory> getStageMemberCancelHistory() {
        return stageMemberCancelHistory;
    }

    /**
     * Setter method for stageMemberCancelHistory.
     *
     * @param aStageMemberCancelHistory the new value for stageMemberCancelHistory
     */
    public void setStageMemberCancelHistory(Set<StageMemberCancelHistory> aStageMemberCancelHistory) {
        stageMemberCancelHistory = aStageMemberCancelHistory;
    }

    /**
     * Compares the key for this instance with another StageMember.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class StageMember and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof StageMember)) {
            return false;
        }
        StageMember that = (StageMember) other;
        if (this.getMemberId() != that.getMemberId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another StageMember.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof StageMember)) return false;
        return this.equalKeys(other) && ((StageMember)other).equalKeys(this);
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
        i = (int)(getMemberId() ^ (getMemberId()>>>32));
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
        StringBuffer sb = new StringBuffer("[StageMember |");
        sb.append(" memberId=").append(getMemberId());
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
        ret.put("memberId", Long.valueOf(getMemberId()));
        return ret;
    }

}
