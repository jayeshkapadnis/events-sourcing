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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="partner_reporting_division", indexes={@Index(name="partnerReportingDivisionUnPartnerRptDivPrtnrDivnm", columnList="partner_id,division_name", unique=true)})
public class PartnerReportingDivision implements Serializable {

    /** Primary key. */
    protected static final String PK = "partnerReportingDivisionId";

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
    @Column(name="partner_reporting_division_id", unique=true, nullable=false, precision=16)
    private BigDecimal partnerReportingDivisionId;
    @Column(name="division_name", nullable=false, length=2000)
    private String divisionName;
    @Column(name="user_created", nullable=false, length=200)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=200)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @ManyToOne(optional=false)
    @JoinColumn(name="partner_id", nullable=false)
    private Partner partner;
    @OneToMany(mappedBy="partnerReportingDivision")
    private Set<PartnerReportingDivClient> partnerReportingDivClient;

    /** Default constructor. */
    public PartnerReportingDivision() {
        super();
    }

    /**
     * Access method for partnerReportingDivisionId.
     *
     * @return the current value of partnerReportingDivisionId
     */
    public BigDecimal getPartnerReportingDivisionId() {
        return partnerReportingDivisionId;
    }

    /**
     * Setter method for partnerReportingDivisionId.
     *
     * @param aPartnerReportingDivisionId the new value for partnerReportingDivisionId
     */
    public void setPartnerReportingDivisionId(BigDecimal aPartnerReportingDivisionId) {
        partnerReportingDivisionId = aPartnerReportingDivisionId;
    }

    /**
     * Access method for divisionName.
     *
     * @return the current value of divisionName
     */
    public String getDivisionName() {
        return divisionName;
    }

    /**
     * Setter method for divisionName.
     *
     * @param aDivisionName the new value for divisionName
     */
    public void setDivisionName(String aDivisionName) {
        divisionName = aDivisionName;
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
     * Access method for partner.
     *
     * @return the current value of partner
     */
    public Partner getPartner() {
        return partner;
    }

    /**
     * Setter method for partner.
     *
     * @param aPartner the new value for partner
     */
    public void setPartner(Partner aPartner) {
        partner = aPartner;
    }

    /**
     * Access method for partnerReportingDivClient.
     *
     * @return the current value of partnerReportingDivClient
     */
    public Set<PartnerReportingDivClient> getPartnerReportingDivClient() {
        return partnerReportingDivClient;
    }

    /**
     * Setter method for partnerReportingDivClient.
     *
     * @param aPartnerReportingDivClient the new value for partnerReportingDivClient
     */
    public void setPartnerReportingDivClient(Set<PartnerReportingDivClient> aPartnerReportingDivClient) {
        partnerReportingDivClient = aPartnerReportingDivClient;
    }

    /**
     * Gets the group fragment partnerId for member partner.
     *
     * @return Current value of the group fragment
     * @see Partner
     */
    public BigDecimal getPartnerPartnerId() {
        return (getPartner() == null ? null : getPartner().getPartnerId());
    }

    /**
     * Sets the group fragment partnerId from member partner.
     *
     * @param aPartnerId New value for the group fragment
     * @see Partner
     */
    public void setPartnerPartnerId(BigDecimal aPartnerId) {
        if (getPartner() != null) {
            getPartner().setPartnerId(aPartnerId);
        }
    }

    /**
     * Compares the key for this instance with another PartnerReportingDivision.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class PartnerReportingDivision and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof PartnerReportingDivision)) {
            return false;
        }
        PartnerReportingDivision that = (PartnerReportingDivision) other;
        Object myPartnerReportingDivisionId = this.getPartnerReportingDivisionId();
        Object yourPartnerReportingDivisionId = that.getPartnerReportingDivisionId();
        if (myPartnerReportingDivisionId==null ? yourPartnerReportingDivisionId!=null : !myPartnerReportingDivisionId.equals(yourPartnerReportingDivisionId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another PartnerReportingDivision.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof PartnerReportingDivision)) return false;
        return this.equalKeys(other) && ((PartnerReportingDivision)other).equalKeys(this);
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
        if (getPartnerReportingDivisionId() == null) {
            i = 0;
        } else {
            i = getPartnerReportingDivisionId().hashCode();
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
        StringBuffer sb = new StringBuffer("[PartnerReportingDivision |");
        sb.append(" partnerReportingDivisionId=").append(getPartnerReportingDivisionId());
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
        ret.put("partnerReportingDivisionId", getPartnerReportingDivisionId());
        return ret;
    }

}
