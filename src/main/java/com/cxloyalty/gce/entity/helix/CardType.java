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

@Entity(name="card_type")
public class CardType implements Serializable {

    /** Primary key. */
    protected static final String PK = "cardTypeId";

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
    @Column(name="card_type_id", unique=true, nullable=false, precision=3)
    private BigDecimal cardTypeId;
    @Column(nullable=false, length=50)
    private String description;
    @Column(name="mod10_compatible_flag", nullable=false, length=1)
    private String mod10CompatibleFlag;
    @Column(name="card_number_min_length", precision=2)
    private BigDecimal cardNumberMinLength;
    @Column(name="card_number_max_length", precision=2)
    private BigDecimal cardNumberMaxLength;
    @Column(name="valid_for_payment_flag", length=1)
    private String validForPaymentFlag;
    @Column(name="default_valid_for_payment_flag", length=1)
    private String defaultValidForPaymentFlag;
    @Column(name="default_card_min_max_len_flag", length=1)
    private String defaultCardMinMaxLenFlag;
    @Column(name="default_mod10_compatible_flag", length=1)
    private String defaultMod10CompatibleFlag;
    @Column(name="user_created", nullable=false, length=200)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=200)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @OneToMany(mappedBy="cardType")
    private Set<Issuer> issuer;

    /** Default constructor. */
    public CardType() {
        super();
    }

    /**
     * Access method for cardTypeId.
     *
     * @return the current value of cardTypeId
     */
    public BigDecimal getCardTypeId() {
        return cardTypeId;
    }

    /**
     * Setter method for cardTypeId.
     *
     * @param aCardTypeId the new value for cardTypeId
     */
    public void setCardTypeId(BigDecimal aCardTypeId) {
        cardTypeId = aCardTypeId;
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
     * Access method for mod10CompatibleFlag.
     *
     * @return the current value of mod10CompatibleFlag
     */
    public String getMod10CompatibleFlag() {
        return mod10CompatibleFlag;
    }

    /**
     * Setter method for mod10CompatibleFlag.
     *
     * @param aMod10CompatibleFlag the new value for mod10CompatibleFlag
     */
    public void setMod10CompatibleFlag(String aMod10CompatibleFlag) {
        mod10CompatibleFlag = aMod10CompatibleFlag;
    }

    /**
     * Access method for cardNumberMinLength.
     *
     * @return the current value of cardNumberMinLength
     */
    public BigDecimal getCardNumberMinLength() {
        return cardNumberMinLength;
    }

    /**
     * Setter method for cardNumberMinLength.
     *
     * @param aCardNumberMinLength the new value for cardNumberMinLength
     */
    public void setCardNumberMinLength(BigDecimal aCardNumberMinLength) {
        cardNumberMinLength = aCardNumberMinLength;
    }

    /**
     * Access method for cardNumberMaxLength.
     *
     * @return the current value of cardNumberMaxLength
     */
    public BigDecimal getCardNumberMaxLength() {
        return cardNumberMaxLength;
    }

    /**
     * Setter method for cardNumberMaxLength.
     *
     * @param aCardNumberMaxLength the new value for cardNumberMaxLength
     */
    public void setCardNumberMaxLength(BigDecimal aCardNumberMaxLength) {
        cardNumberMaxLength = aCardNumberMaxLength;
    }

    /**
     * Access method for validForPaymentFlag.
     *
     * @return the current value of validForPaymentFlag
     */
    public String getValidForPaymentFlag() {
        return validForPaymentFlag;
    }

    /**
     * Setter method for validForPaymentFlag.
     *
     * @param aValidForPaymentFlag the new value for validForPaymentFlag
     */
    public void setValidForPaymentFlag(String aValidForPaymentFlag) {
        validForPaymentFlag = aValidForPaymentFlag;
    }

    /**
     * Access method for defaultValidForPaymentFlag.
     *
     * @return the current value of defaultValidForPaymentFlag
     */
    public String getDefaultValidForPaymentFlag() {
        return defaultValidForPaymentFlag;
    }

    /**
     * Setter method for defaultValidForPaymentFlag.
     *
     * @param aDefaultValidForPaymentFlag the new value for defaultValidForPaymentFlag
     */
    public void setDefaultValidForPaymentFlag(String aDefaultValidForPaymentFlag) {
        defaultValidForPaymentFlag = aDefaultValidForPaymentFlag;
    }

    /**
     * Access method for defaultCardMinMaxLenFlag.
     *
     * @return the current value of defaultCardMinMaxLenFlag
     */
    public String getDefaultCardMinMaxLenFlag() {
        return defaultCardMinMaxLenFlag;
    }

    /**
     * Setter method for defaultCardMinMaxLenFlag.
     *
     * @param aDefaultCardMinMaxLenFlag the new value for defaultCardMinMaxLenFlag
     */
    public void setDefaultCardMinMaxLenFlag(String aDefaultCardMinMaxLenFlag) {
        defaultCardMinMaxLenFlag = aDefaultCardMinMaxLenFlag;
    }

    /**
     * Access method for defaultMod10CompatibleFlag.
     *
     * @return the current value of defaultMod10CompatibleFlag
     */
    public String getDefaultMod10CompatibleFlag() {
        return defaultMod10CompatibleFlag;
    }

    /**
     * Setter method for defaultMod10CompatibleFlag.
     *
     * @param aDefaultMod10CompatibleFlag the new value for defaultMod10CompatibleFlag
     */
    public void setDefaultMod10CompatibleFlag(String aDefaultMod10CompatibleFlag) {
        defaultMod10CompatibleFlag = aDefaultMod10CompatibleFlag;
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
     * Compares the key for this instance with another CardType.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class CardType and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof CardType)) {
            return false;
        }
        CardType that = (CardType) other;
        Object myCardTypeId = this.getCardTypeId();
        Object yourCardTypeId = that.getCardTypeId();
        if (myCardTypeId==null ? yourCardTypeId!=null : !myCardTypeId.equals(yourCardTypeId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another CardType.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof CardType)) return false;
        return this.equalKeys(other) && ((CardType)other).equalKeys(this);
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
        if (getCardTypeId() == null) {
            i = 0;
        } else {
            i = getCardTypeId().hashCode();
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
        StringBuffer sb = new StringBuffer("[CardType |");
        sb.append(" cardTypeId=").append(getCardTypeId());
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
        ret.put("cardTypeId", getCardTypeId());
        return ret;
    }

}
