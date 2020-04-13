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

@Entity(name="language")
public class Language implements Serializable {

    /** Primary key. */
    protected static final String PK = "languageId";

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
    @Column(name="language_id", unique=true, nullable=false, precision=16)
    private BigDecimal languageId;
    @Column(name="language_desc", nullable=false, length=4000)
    private String languageDesc;
    @Column(name="language_locale", length=4000)
    private String languageLocale;
    @Column(name="language_display", length=4000)
    private String languageDisplay;
    @Column(name="language_cd", nullable=false, length=20)
    private String languageCd;
    @Column(name="user_created", nullable=false, length=4000)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=4000)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @Column(name="culture_cd", length=20)
    private String cultureCd;
    @Column(name="iso_639_1", length=2)
    private String iso6391;
    @Column(name="iso_639_2", length=3)
    private String iso6392;
    @OneToMany(mappedBy="language")
    private Set<Bundle> bundle;
    @OneToMany(mappedBy="language")
    private Set<IssuerContact> issuerContact;
    @OneToMany(mappedBy="language")
    private Set<Question> question;
    @OneToMany(mappedBy="language")
    private Set<Solicitation> solicitation;
    @OneToMany(mappedBy="language")
    private Set<Title> title;

    /** Default constructor. */
    public Language() {
        super();
    }

    /**
     * Access method for languageId.
     *
     * @return the current value of languageId
     */
    public BigDecimal getLanguageId() {
        return languageId;
    }

    /**
     * Setter method for languageId.
     *
     * @param aLanguageId the new value for languageId
     */
    public void setLanguageId(BigDecimal aLanguageId) {
        languageId = aLanguageId;
    }

    /**
     * Access method for languageDesc.
     *
     * @return the current value of languageDesc
     */
    public String getLanguageDesc() {
        return languageDesc;
    }

    /**
     * Setter method for languageDesc.
     *
     * @param aLanguageDesc the new value for languageDesc
     */
    public void setLanguageDesc(String aLanguageDesc) {
        languageDesc = aLanguageDesc;
    }

    /**
     * Access method for languageLocale.
     *
     * @return the current value of languageLocale
     */
    public String getLanguageLocale() {
        return languageLocale;
    }

    /**
     * Setter method for languageLocale.
     *
     * @param aLanguageLocale the new value for languageLocale
     */
    public void setLanguageLocale(String aLanguageLocale) {
        languageLocale = aLanguageLocale;
    }

    /**
     * Access method for languageDisplay.
     *
     * @return the current value of languageDisplay
     */
    public String getLanguageDisplay() {
        return languageDisplay;
    }

    /**
     * Setter method for languageDisplay.
     *
     * @param aLanguageDisplay the new value for languageDisplay
     */
    public void setLanguageDisplay(String aLanguageDisplay) {
        languageDisplay = aLanguageDisplay;
    }

    /**
     * Access method for languageCd.
     *
     * @return the current value of languageCd
     */
    public String getLanguageCd() {
        return languageCd;
    }

    /**
     * Setter method for languageCd.
     *
     * @param aLanguageCd the new value for languageCd
     */
    public void setLanguageCd(String aLanguageCd) {
        languageCd = aLanguageCd;
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
     * Access method for cultureCd.
     *
     * @return the current value of cultureCd
     */
    public String getCultureCd() {
        return cultureCd;
    }

    /**
     * Setter method for cultureCd.
     *
     * @param aCultureCd the new value for cultureCd
     */
    public void setCultureCd(String aCultureCd) {
        cultureCd = aCultureCd;
    }

    /**
     * Access method for iso6391.
     *
     * @return the current value of iso6391
     */
    public String getIso6391() {
        return iso6391;
    }

    /**
     * Setter method for iso6391.
     *
     * @param aIso6391 the new value for iso6391
     */
    public void setIso6391(String aIso6391) {
        iso6391 = aIso6391;
    }

    /**
     * Access method for iso6392.
     *
     * @return the current value of iso6392
     */
    public String getIso6392() {
        return iso6392;
    }

    /**
     * Setter method for iso6392.
     *
     * @param aIso6392 the new value for iso6392
     */
    public void setIso6392(String aIso6392) {
        iso6392 = aIso6392;
    }

    /**
     * Access method for bundle.
     *
     * @return the current value of bundle
     */
    public Set<Bundle> getBundle() {
        return bundle;
    }

    /**
     * Setter method for bundle.
     *
     * @param aBundle the new value for bundle
     */
    public void setBundle(Set<Bundle> aBundle) {
        bundle = aBundle;
    }

    /**
     * Access method for issuerContact.
     *
     * @return the current value of issuerContact
     */
    public Set<IssuerContact> getIssuerContact() {
        return issuerContact;
    }

    /**
     * Setter method for issuerContact.
     *
     * @param aIssuerContact the new value for issuerContact
     */
    public void setIssuerContact(Set<IssuerContact> aIssuerContact) {
        issuerContact = aIssuerContact;
    }

    /**
     * Access method for question.
     *
     * @return the current value of question
     */
    public Set<Question> getQuestion() {
        return question;
    }

    /**
     * Setter method for question.
     *
     * @param aQuestion the new value for question
     */
    public void setQuestion(Set<Question> aQuestion) {
        question = aQuestion;
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
     * Access method for title.
     *
     * @return the current value of title
     */
    public Set<Title> getTitle() {
        return title;
    }

    /**
     * Setter method for title.
     *
     * @param aTitle the new value for title
     */
    public void setTitle(Set<Title> aTitle) {
        title = aTitle;
    }

    /**
     * Compares the key for this instance with another Language.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Language and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Language)) {
            return false;
        }
        Language that = (Language) other;
        Object myLanguageId = this.getLanguageId();
        Object yourLanguageId = that.getLanguageId();
        if (myLanguageId==null ? yourLanguageId!=null : !myLanguageId.equals(yourLanguageId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Language.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Language)) return false;
        return this.equalKeys(other) && ((Language)other).equalKeys(this);
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
        if (getLanguageId() == null) {
            i = 0;
        } else {
            i = getLanguageId().hashCode();
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
        StringBuffer sb = new StringBuffer("[Language |");
        sb.append(" languageId=").append(getLanguageId());
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
        ret.put("languageId", getLanguageId());
        return ret;
    }

}
