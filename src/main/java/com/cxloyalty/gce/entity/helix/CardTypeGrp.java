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

@Entity(name="card_type_grp")
public class CardTypeGrp implements Serializable {

    /** Primary key. */
    protected static final String PK = "cardTypeGrpId";

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
    @Column(name="card_type_grp_id", unique=true, nullable=false, precision=8)
    private BigDecimal cardTypeGrpId;
    @Column(name="card_type_desc", nullable=false, length=50)
    private String cardTypeDesc;
    @Column(name="default_flg", nullable=false, precision=1)
    private BigDecimal defaultFlg;
    @Column(name="user_created", nullable=false, length=50)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=50)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @ManyToOne(optional=false)
    @JoinColumn(name="organization_id", nullable=false)
    private Organization organization;
    @OneToMany(mappedBy="cardTypeGrp")
    private Set<SolicitationTemplate> solicitationTemplate;

    /** Default constructor. */
    public CardTypeGrp() {
        super();
    }

    /**
     * Access method for cardTypeGrpId.
     *
     * @return the current value of cardTypeGrpId
     */
    public BigDecimal getCardTypeGrpId() {
        return cardTypeGrpId;
    }

    /**
     * Setter method for cardTypeGrpId.
     *
     * @param aCardTypeGrpId the new value for cardTypeGrpId
     */
    public void setCardTypeGrpId(BigDecimal aCardTypeGrpId) {
        cardTypeGrpId = aCardTypeGrpId;
    }

    /**
     * Access method for cardTypeDesc.
     *
     * @return the current value of cardTypeDesc
     */
    public String getCardTypeDesc() {
        return cardTypeDesc;
    }

    /**
     * Setter method for cardTypeDesc.
     *
     * @param aCardTypeDesc the new value for cardTypeDesc
     */
    public void setCardTypeDesc(String aCardTypeDesc) {
        cardTypeDesc = aCardTypeDesc;
    }

    /**
     * Access method for defaultFlg.
     *
     * @return the current value of defaultFlg
     */
    public BigDecimal getDefaultFlg() {
        return defaultFlg;
    }

    /**
     * Setter method for defaultFlg.
     *
     * @param aDefaultFlg the new value for defaultFlg
     */
    public void setDefaultFlg(BigDecimal aDefaultFlg) {
        defaultFlg = aDefaultFlg;
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
     * Compares the key for this instance with another CardTypeGrp.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class CardTypeGrp and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof CardTypeGrp)) {
            return false;
        }
        CardTypeGrp that = (CardTypeGrp) other;
        Object myCardTypeGrpId = this.getCardTypeGrpId();
        Object yourCardTypeGrpId = that.getCardTypeGrpId();
        if (myCardTypeGrpId==null ? yourCardTypeGrpId!=null : !myCardTypeGrpId.equals(yourCardTypeGrpId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another CardTypeGrp.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof CardTypeGrp)) return false;
        return this.equalKeys(other) && ((CardTypeGrp)other).equalKeys(this);
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
        if (getCardTypeGrpId() == null) {
            i = 0;
        } else {
            i = getCardTypeGrpId().hashCode();
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
        StringBuffer sb = new StringBuffer("[CardTypeGrp |");
        sb.append(" cardTypeGrpId=").append(getCardTypeGrpId());
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
        ret.put("cardTypeGrpId", getCardTypeGrpId());
        return ret;
    }

}
