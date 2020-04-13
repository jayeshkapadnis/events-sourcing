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
@Table(name="partner", indexes={@Index(name="partner_name_IX", columnList="name", unique=true)})
public class Partner implements Serializable {

    /** Primary key. */
    protected static final String PK = "partnerId";

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
    @Column(name="partner_id", unique=true, nullable=false, precision=16)
    private BigDecimal partnerId;
    @Column(unique=true, nullable=false, length=200)
    private String name;
    @Column(name="user_created", nullable=false, length=200)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=200)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @OneToMany(mappedBy="partner")
    private Set<PartnerClient> partnerClient;
    @OneToMany(mappedBy="partner")
    private Set<PartnerReportingDivision> partnerReportingDivision;

    /** Default constructor. */
    public Partner() {
        super();
    }

    /**
     * Access method for partnerId.
     *
     * @return the current value of partnerId
     */
    public BigDecimal getPartnerId() {
        return partnerId;
    }

    /**
     * Setter method for partnerId.
     *
     * @param aPartnerId the new value for partnerId
     */
    public void setPartnerId(BigDecimal aPartnerId) {
        partnerId = aPartnerId;
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
     * Access method for partnerClient.
     *
     * @return the current value of partnerClient
     */
    public Set<PartnerClient> getPartnerClient() {
        return partnerClient;
    }

    /**
     * Setter method for partnerClient.
     *
     * @param aPartnerClient the new value for partnerClient
     */
    public void setPartnerClient(Set<PartnerClient> aPartnerClient) {
        partnerClient = aPartnerClient;
    }

    /**
     * Access method for partnerReportingDivision.
     *
     * @return the current value of partnerReportingDivision
     */
    public Set<PartnerReportingDivision> getPartnerReportingDivision() {
        return partnerReportingDivision;
    }

    /**
     * Setter method for partnerReportingDivision.
     *
     * @param aPartnerReportingDivision the new value for partnerReportingDivision
     */
    public void setPartnerReportingDivision(Set<PartnerReportingDivision> aPartnerReportingDivision) {
        partnerReportingDivision = aPartnerReportingDivision;
    }

    /**
     * Compares the key for this instance with another Partner.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Partner and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Partner)) {
            return false;
        }
        Partner that = (Partner) other;
        Object myPartnerId = this.getPartnerId();
        Object yourPartnerId = that.getPartnerId();
        if (myPartnerId==null ? yourPartnerId!=null : !myPartnerId.equals(yourPartnerId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Partner.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Partner)) return false;
        return this.equalKeys(other) && ((Partner)other).equalKeys(this);
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
        if (getPartnerId() == null) {
            i = 0;
        } else {
            i = getPartnerId().hashCode();
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
        StringBuffer sb = new StringBuffer("[Partner |");
        sb.append(" partnerId=").append(getPartnerId());
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
        ret.put("partnerId", getPartnerId());
        return ret;
    }

}
