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
@Table(name="legal_entity", indexes={@Index(name="legal_entity_legal_entity_name_IX", columnList="legal_entity_name", unique=true)})
public class LegalEntity implements Serializable {

    /** Primary key. */
    protected static final String PK = "legalEntitySysid";

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
    @Column(name="legal_entity_sysid", unique=true, nullable=false, precision=10)
    private BigDecimal legalEntitySysid;
    @Column(name="legal_entity_name", unique=true, nullable=false, length=50)
    private String legalEntityName;
    @Column(name="user_created", length=30)
    private String userCreated;
    @Column(name="date_created")
    private Timestamp dateCreated;
    @Column(name="user_modified", length=30)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @Column(name="creditor_identifier", length=35)
    private String creditorIdentifier;
    @OneToMany(mappedBy="legalEntity")
    private Set<SolicitationTemplate> solicitationTemplate;

    /** Default constructor. */
    public LegalEntity() {
        super();
    }

    /**
     * Access method for legalEntitySysid.
     *
     * @return the current value of legalEntitySysid
     */
    public BigDecimal getLegalEntitySysid() {
        return legalEntitySysid;
    }

    /**
     * Setter method for legalEntitySysid.
     *
     * @param aLegalEntitySysid the new value for legalEntitySysid
     */
    public void setLegalEntitySysid(BigDecimal aLegalEntitySysid) {
        legalEntitySysid = aLegalEntitySysid;
    }

    /**
     * Access method for legalEntityName.
     *
     * @return the current value of legalEntityName
     */
    public String getLegalEntityName() {
        return legalEntityName;
    }

    /**
     * Setter method for legalEntityName.
     *
     * @param aLegalEntityName the new value for legalEntityName
     */
    public void setLegalEntityName(String aLegalEntityName) {
        legalEntityName = aLegalEntityName;
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
     * Access method for creditorIdentifier.
     *
     * @return the current value of creditorIdentifier
     */
    public String getCreditorIdentifier() {
        return creditorIdentifier;
    }

    /**
     * Setter method for creditorIdentifier.
     *
     * @param aCreditorIdentifier the new value for creditorIdentifier
     */
    public void setCreditorIdentifier(String aCreditorIdentifier) {
        creditorIdentifier = aCreditorIdentifier;
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
     * Compares the key for this instance with another LegalEntity.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class LegalEntity and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof LegalEntity)) {
            return false;
        }
        LegalEntity that = (LegalEntity) other;
        Object myLegalEntitySysid = this.getLegalEntitySysid();
        Object yourLegalEntitySysid = that.getLegalEntitySysid();
        if (myLegalEntitySysid==null ? yourLegalEntitySysid!=null : !myLegalEntitySysid.equals(yourLegalEntitySysid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another LegalEntity.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof LegalEntity)) return false;
        return this.equalKeys(other) && ((LegalEntity)other).equalKeys(this);
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
        if (getLegalEntitySysid() == null) {
            i = 0;
        } else {
            i = getLegalEntitySysid().hashCode();
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
        StringBuffer sb = new StringBuffer("[LegalEntity |");
        sb.append(" legalEntitySysid=").append(getLegalEntitySysid());
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
        ret.put("legalEntitySysid", getLegalEntitySysid());
        return ret;
    }

}
