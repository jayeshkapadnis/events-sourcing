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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="solicitation_template")
public class SolicitationTemplate implements Serializable {

    /** Primary key. */
    protected static final String PK = "solTemplateId";

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
    @Column(name="sol_template_id", unique=true, nullable=false, precision=10)
    private BigDecimal solTemplateId;
    @Column(name="sol_template_name", nullable=false, length=100)
    private String solTemplateName;
    @Column(name="user_created", length=30)
    private String userCreated;
    @Column(name="date_created")
    private Timestamp dateCreated;
    @Column(name="user_modified", length=30)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @Column(name="solicitation_template_type_id", precision=10)
    private BigDecimal solicitationTemplateTypeId;
    @Column(name="local_discounts_enabled", precision=1)
    private BigDecimal localDiscountsEnabled;
    @Column(name="sess_cleanup_req_fl", precision=1)
    private BigDecimal sessCleanupReqFl;
    @Column(name="cancel_offset_days", precision=3)
    private BigDecimal cancelOffsetDays;
    @Column(name="alt_pymt_vehicle_enabled_flag", precision=1)
    private BigDecimal altPymtVehicleEnabledFlag;
    @Column(name="ivr_cancel_flag", length=1)
    private String ivrCancelFlag;
    @Column(name="variable_billing_fl", nullable=false, precision=1)
    private BigDecimal variableBillingFl;
    @ManyToOne
    @JoinColumn(name="legal_entity_sysid")
    private LegalEntity legalEntity;
    @OneToMany(mappedBy="solicitationTemplate")
    private Set<Solicitation> solicitation;
    @ManyToOne
    @JoinColumn(name="organization_id")
    private Organization organization;
    @ManyToOne
    @JoinColumn(name="country_id")
    private Country country;
    @ManyToOne
    @JoinColumn(name="currency_type_id")
    private CurrencyType currencyType;
    @ManyToOne
    @JoinColumn(name="org_lang_grp_id")
    private OrgLangGrp orgLangGrp;
    @ManyToOne
    @JoinColumn(name="card_type_grp_id")
    private CardTypeGrp cardTypeGrp;

    /** Default constructor. */
    public SolicitationTemplate() {
        super();
    }

    /**
     * Access method for solTemplateId.
     *
     * @return the current value of solTemplateId
     */
    public BigDecimal getSolTemplateId() {
        return solTemplateId;
    }

    /**
     * Setter method for solTemplateId.
     *
     * @param aSolTemplateId the new value for solTemplateId
     */
    public void setSolTemplateId(BigDecimal aSolTemplateId) {
        solTemplateId = aSolTemplateId;
    }

    /**
     * Access method for solTemplateName.
     *
     * @return the current value of solTemplateName
     */
    public String getSolTemplateName() {
        return solTemplateName;
    }

    /**
     * Setter method for solTemplateName.
     *
     * @param aSolTemplateName the new value for solTemplateName
     */
    public void setSolTemplateName(String aSolTemplateName) {
        solTemplateName = aSolTemplateName;
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
     * Access method for solicitationTemplateTypeId.
     *
     * @return the current value of solicitationTemplateTypeId
     */
    public BigDecimal getSolicitationTemplateTypeId() {
        return solicitationTemplateTypeId;
    }

    /**
     * Setter method for solicitationTemplateTypeId.
     *
     * @param aSolicitationTemplateTypeId the new value for solicitationTemplateTypeId
     */
    public void setSolicitationTemplateTypeId(BigDecimal aSolicitationTemplateTypeId) {
        solicitationTemplateTypeId = aSolicitationTemplateTypeId;
    }

    /**
     * Access method for localDiscountsEnabled.
     *
     * @return the current value of localDiscountsEnabled
     */
    public BigDecimal getLocalDiscountsEnabled() {
        return localDiscountsEnabled;
    }

    /**
     * Setter method for localDiscountsEnabled.
     *
     * @param aLocalDiscountsEnabled the new value for localDiscountsEnabled
     */
    public void setLocalDiscountsEnabled(BigDecimal aLocalDiscountsEnabled) {
        localDiscountsEnabled = aLocalDiscountsEnabled;
    }

    /**
     * Access method for sessCleanupReqFl.
     *
     * @return the current value of sessCleanupReqFl
     */
    public BigDecimal getSessCleanupReqFl() {
        return sessCleanupReqFl;
    }

    /**
     * Setter method for sessCleanupReqFl.
     *
     * @param aSessCleanupReqFl the new value for sessCleanupReqFl
     */
    public void setSessCleanupReqFl(BigDecimal aSessCleanupReqFl) {
        sessCleanupReqFl = aSessCleanupReqFl;
    }

    /**
     * Access method for cancelOffsetDays.
     *
     * @return the current value of cancelOffsetDays
     */
    public BigDecimal getCancelOffsetDays() {
        return cancelOffsetDays;
    }

    /**
     * Setter method for cancelOffsetDays.
     *
     * @param aCancelOffsetDays the new value for cancelOffsetDays
     */
    public void setCancelOffsetDays(BigDecimal aCancelOffsetDays) {
        cancelOffsetDays = aCancelOffsetDays;
    }

    /**
     * Access method for altPymtVehicleEnabledFlag.
     *
     * @return the current value of altPymtVehicleEnabledFlag
     */
    public BigDecimal getAltPymtVehicleEnabledFlag() {
        return altPymtVehicleEnabledFlag;
    }

    /**
     * Setter method for altPymtVehicleEnabledFlag.
     *
     * @param aAltPymtVehicleEnabledFlag the new value for altPymtVehicleEnabledFlag
     */
    public void setAltPymtVehicleEnabledFlag(BigDecimal aAltPymtVehicleEnabledFlag) {
        altPymtVehicleEnabledFlag = aAltPymtVehicleEnabledFlag;
    }

    /**
     * Access method for ivrCancelFlag.
     *
     * @return the current value of ivrCancelFlag
     */
    public String getIvrCancelFlag() {
        return ivrCancelFlag;
    }

    /**
     * Setter method for ivrCancelFlag.
     *
     * @param aIvrCancelFlag the new value for ivrCancelFlag
     */
    public void setIvrCancelFlag(String aIvrCancelFlag) {
        ivrCancelFlag = aIvrCancelFlag;
    }

    /**
     * Access method for variableBillingFl.
     *
     * @return the current value of variableBillingFl
     */
    public BigDecimal getVariableBillingFl() {
        return variableBillingFl;
    }

    /**
     * Setter method for variableBillingFl.
     *
     * @param aVariableBillingFl the new value for variableBillingFl
     */
    public void setVariableBillingFl(BigDecimal aVariableBillingFl) {
        variableBillingFl = aVariableBillingFl;
    }

    /**
     * Access method for legalEntity.
     *
     * @return the current value of legalEntity
     */
    public LegalEntity getLegalEntity() {
        return legalEntity;
    }

    /**
     * Setter method for legalEntity.
     *
     * @param aLegalEntity the new value for legalEntity
     */
    public void setLegalEntity(LegalEntity aLegalEntity) {
        legalEntity = aLegalEntity;
    }

    /**
     * Access method for solicitation.
     *
     * @return the current value of solicitation
     */
    public Set<Solicitation> getSolicitation() {
        return solicitation;
    }

    /**
     * Setter method for solicitation.
     *
     * @param aSolicitation the new value for solicitation
     */
    public void setSolicitation(Set<Solicitation> aSolicitation) {
        solicitation = aSolicitation;
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
     * Access method for country.
     *
     * @return the current value of country
     */
    public Country getCountry() {
        return country;
    }

    /**
     * Setter method for country.
     *
     * @param aCountry the new value for country
     */
    public void setCountry(Country aCountry) {
        country = aCountry;
    }

    /**
     * Access method for currencyType.
     *
     * @return the current value of currencyType
     */
    public CurrencyType getCurrencyType() {
        return currencyType;
    }

    /**
     * Setter method for currencyType.
     *
     * @param aCurrencyType the new value for currencyType
     */
    public void setCurrencyType(CurrencyType aCurrencyType) {
        currencyType = aCurrencyType;
    }

    /**
     * Access method for orgLangGrp.
     *
     * @return the current value of orgLangGrp
     */
    public OrgLangGrp getOrgLangGrp() {
        return orgLangGrp;
    }

    /**
     * Setter method for orgLangGrp.
     *
     * @param aOrgLangGrp the new value for orgLangGrp
     */
    public void setOrgLangGrp(OrgLangGrp aOrgLangGrp) {
        orgLangGrp = aOrgLangGrp;
    }

    /**
     * Access method for cardTypeGrp.
     *
     * @return the current value of cardTypeGrp
     */
    public CardTypeGrp getCardTypeGrp() {
        return cardTypeGrp;
    }

    /**
     * Setter method for cardTypeGrp.
     *
     * @param aCardTypeGrp the new value for cardTypeGrp
     */
    public void setCardTypeGrp(CardTypeGrp aCardTypeGrp) {
        cardTypeGrp = aCardTypeGrp;
    }

    /**
     * Compares the key for this instance with another SolicitationTemplate.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class SolicitationTemplate and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof SolicitationTemplate)) {
            return false;
        }
        SolicitationTemplate that = (SolicitationTemplate) other;
        Object mySolTemplateId = this.getSolTemplateId();
        Object yourSolTemplateId = that.getSolTemplateId();
        if (mySolTemplateId==null ? yourSolTemplateId!=null : !mySolTemplateId.equals(yourSolTemplateId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another SolicitationTemplate.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof SolicitationTemplate)) return false;
        return this.equalKeys(other) && ((SolicitationTemplate)other).equalKeys(this);
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
        if (getSolTemplateId() == null) {
            i = 0;
        } else {
            i = getSolTemplateId().hashCode();
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
        StringBuffer sb = new StringBuffer("[SolicitationTemplate |");
        sb.append(" solTemplateId=").append(getSolTemplateId());
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
        ret.put("solTemplateId", getSolTemplateId());
        return ret;
    }

}
