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
import javax.persistence.Index;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="country", indexes={@Index(name="country_iso_3166_a3_code_IX", columnList="iso_3166_a3_code", unique=true), @Index(name="country_iso_3166_n3_code_IX", columnList="iso_3166_n3_code", unique=true), @Index(name="country_auto_plate_code_IX", columnList="auto_plate_code", unique=true)})
public class Country implements Serializable {

    /** Primary key. */
    protected static final String PK = "countryId";

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
    @Column(name="country_id", unique=true, nullable=false, precision=10)
    private BigDecimal countryId;
    @Column(name="country_desc", nullable=false, length=100)
    private String countryDesc;
    @Column(name="user_created", length=30)
    private String userCreated;
    @Column(name="date_created")
    private Timestamp dateCreated;
    @Column(name="user_modified", length=30)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @Column(nullable=false, length=2)
    private String abbreviation;
    @Column(name="iso_3166_a2_code", length=2)
    private String iso3166A2Code;
    @Column(name="iso_639_code", length=2)
    private String iso639Code;
    @Column(name="iso_3166_a3_code", unique=true, length=3)
    private String iso3166A3Code;
    @Column(name="iso_3166_n3_code", unique=true, precision=3)
    private BigDecimal iso3166N3Code;
    @Column(name="auto_plate_code", unique=true, length=3)
    private String autoPlateCode;
    @Column(name="international_calling_code", precision=10)
    private BigDecimal internationalCallingCode;
    @OneToMany(mappedBy="country")
    private Set<BankCode> bankCode;
    @OneToMany(mappedBy="country")
    private Set<Issuer> issuer;
    @OneToMany(mappedBy="country")
    private Set<OrganizationCountry> organizationCountry;
    @OneToMany(mappedBy="country")
    private Set<SolicitationTemplate> solicitationTemplate;
    @OneToMany(mappedBy="country")
    private Set<State> state;

    /** Default constructor. */
    public Country() {
        super();
    }

    /**
     * Access method for countryId.
     *
     * @return the current value of countryId
     */
    public BigDecimal getCountryId() {
        return countryId;
    }

    /**
     * Setter method for countryId.
     *
     * @param aCountryId the new value for countryId
     */
    public void setCountryId(BigDecimal aCountryId) {
        countryId = aCountryId;
    }

    /**
     * Access method for countryDesc.
     *
     * @return the current value of countryDesc
     */
    public String getCountryDesc() {
        return countryDesc;
    }

    /**
     * Setter method for countryDesc.
     *
     * @param aCountryDesc the new value for countryDesc
     */
    public void setCountryDesc(String aCountryDesc) {
        countryDesc = aCountryDesc;
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
     * Access method for abbreviation.
     *
     * @return the current value of abbreviation
     */
    public String getAbbreviation() {
        return abbreviation;
    }

    /**
     * Setter method for abbreviation.
     *
     * @param aAbbreviation the new value for abbreviation
     */
    public void setAbbreviation(String aAbbreviation) {
        abbreviation = aAbbreviation;
    }

    /**
     * Access method for iso3166A2Code.
     *
     * @return the current value of iso3166A2Code
     */
    public String getIso3166A2Code() {
        return iso3166A2Code;
    }

    /**
     * Setter method for iso3166A2Code.
     *
     * @param aIso3166A2Code the new value for iso3166A2Code
     */
    public void setIso3166A2Code(String aIso3166A2Code) {
        iso3166A2Code = aIso3166A2Code;
    }

    /**
     * Access method for iso639Code.
     *
     * @return the current value of iso639Code
     */
    public String getIso639Code() {
        return iso639Code;
    }

    /**
     * Setter method for iso639Code.
     *
     * @param aIso639Code the new value for iso639Code
     */
    public void setIso639Code(String aIso639Code) {
        iso639Code = aIso639Code;
    }

    /**
     * Access method for iso3166A3Code.
     *
     * @return the current value of iso3166A3Code
     */
    public String getIso3166A3Code() {
        return iso3166A3Code;
    }

    /**
     * Setter method for iso3166A3Code.
     *
     * @param aIso3166A3Code the new value for iso3166A3Code
     */
    public void setIso3166A3Code(String aIso3166A3Code) {
        iso3166A3Code = aIso3166A3Code;
    }

    /**
     * Access method for iso3166N3Code.
     *
     * @return the current value of iso3166N3Code
     */
    public BigDecimal getIso3166N3Code() {
        return iso3166N3Code;
    }

    /**
     * Setter method for iso3166N3Code.
     *
     * @param aIso3166N3Code the new value for iso3166N3Code
     */
    public void setIso3166N3Code(BigDecimal aIso3166N3Code) {
        iso3166N3Code = aIso3166N3Code;
    }

    /**
     * Access method for autoPlateCode.
     *
     * @return the current value of autoPlateCode
     */
    public String getAutoPlateCode() {
        return autoPlateCode;
    }

    /**
     * Setter method for autoPlateCode.
     *
     * @param aAutoPlateCode the new value for autoPlateCode
     */
    public void setAutoPlateCode(String aAutoPlateCode) {
        autoPlateCode = aAutoPlateCode;
    }

    /**
     * Access method for internationalCallingCode.
     *
     * @return the current value of internationalCallingCode
     */
    public BigDecimal getInternationalCallingCode() {
        return internationalCallingCode;
    }

    /**
     * Setter method for internationalCallingCode.
     *
     * @param aInternationalCallingCode the new value for internationalCallingCode
     */
    public void setInternationalCallingCode(BigDecimal aInternationalCallingCode) {
        internationalCallingCode = aInternationalCallingCode;
    }

    /**
     * Access method for bankCode.
     *
     * @return the current value of bankCode
     */
    public Set<BankCode> getBankCode() {
        return bankCode;
    }

    /**
     * Setter method for bankCode.
     *
     * @param aBankCode the new value for bankCode
     */
    public void setBankCode(Set<BankCode> aBankCode) {
        bankCode = aBankCode;
    }

    /**
     * Access method for issuer.
     *
     * @return the current value of issuer
     */
    public Set<Issuer> getIssuer() {
        return issuer;
    }

    /**
     * Setter method for issuer.
     *
     * @param aIssuer the new value for issuer
     */
    public void setIssuer(Set<Issuer> aIssuer) {
        issuer = aIssuer;
    }

    /**
     * Access method for organizationCountry.
     *
     * @return the current value of organizationCountry
     */
    public Set<OrganizationCountry> getOrganizationCountry() {
        return organizationCountry;
    }

    /**
     * Setter method for organizationCountry.
     *
     * @param aOrganizationCountry the new value for organizationCountry
     */
    public void setOrganizationCountry(Set<OrganizationCountry> aOrganizationCountry) {
        organizationCountry = aOrganizationCountry;
    }

    /**
     * Access method for solicitationTemplate.
     *
     * @return the current value of solicitationTemplate
     */
    public Set<SolicitationTemplate> getSolicitationTemplate() {
        return solicitationTemplate;
    }

    /**
     * Setter method for solicitationTemplate.
     *
     * @param aSolicitationTemplate the new value for solicitationTemplate
     */
    public void setSolicitationTemplate(Set<SolicitationTemplate> aSolicitationTemplate) {
        solicitationTemplate = aSolicitationTemplate;
    }

    /**
     * Access method for state.
     *
     * @return the current value of state
     */
    public Set<State> getState() {
        return state;
    }

    /**
     * Setter method for state.
     *
     * @param aState the new value for state
     */
    public void setState(Set<State> aState) {
        state = aState;
    }

    /**
     * Compares the key for this instance with another Country.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Country and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Country)) {
            return false;
        }
        Country that = (Country) other;
        Object myCountryId = this.getCountryId();
        Object yourCountryId = that.getCountryId();
        if (myCountryId==null ? yourCountryId!=null : !myCountryId.equals(yourCountryId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Country.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Country)) return false;
        return this.equalKeys(other) && ((Country)other).equalKeys(this);
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
        if (getCountryId() == null) {
            i = 0;
        } else {
            i = getCountryId().hashCode();
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
        StringBuffer sb = new StringBuffer("[Country |");
        sb.append(" countryId=").append(getCountryId());
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
        ret.put("countryId", getCountryId());
        return ret;
    }

}
