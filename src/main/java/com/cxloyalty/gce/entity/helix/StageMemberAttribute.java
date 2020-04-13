// Generated with g9.

package com.cxloyalty.gce.entity.helix;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="stage_member_attribute")
public class StageMemberAttribute implements Serializable {

    /** Primary key. */
    protected static final String PK = "stageMemberAttributeId";

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
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="stage_member_attribute_id", unique=true, nullable=false, precision=19)
    private long stageMemberAttributeId;
    @Column(name="member_attribute_value", nullable=false, length=400)
    private String memberAttributeValue;
    @Column(name="member_attribute_type_id", nullable=false, precision=10)
    private BigDecimal memberAttributeTypeId;
    @Column(name="member_attribute_type_desc", nullable=false, length=100)
    private String memberAttributeTypeDesc;
    @Column(name="is_flag_indicator", nullable=false, precision=1)
    private BigDecimal isFlagIndicator;
    @Column(name="cs_admin_display_fl", nullable=false, precision=1)
    private BigDecimal csAdminDisplayFl;
    @Column(name="status_code", length=1)
    private String statusCode;
    @Column(name="user_created", nullable=false, length=50)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=50)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @ManyToOne(optional=false)
    @JoinColumn(name="member_id", nullable=false)
    private StageMember stageMember;

    /** Default constructor. */
    public StageMemberAttribute() {
        super();
    }

    /**
     * Access method for stageMemberAttributeId.
     *
     * @return the current value of stageMemberAttributeId
     */
    public long getStageMemberAttributeId() {
        return stageMemberAttributeId;
    }

    /**
     * Setter method for stageMemberAttributeId.
     *
     * @param aStageMemberAttributeId the new value for stageMemberAttributeId
     */
    public void setStageMemberAttributeId(long aStageMemberAttributeId) {
        stageMemberAttributeId = aStageMemberAttributeId;
    }

    /**
     * Access method for memberAttributeValue.
     *
     * @return the current value of memberAttributeValue
     */
    public String getMemberAttributeValue() {
        return memberAttributeValue;
    }

    /**
     * Setter method for memberAttributeValue.
     *
     * @param aMemberAttributeValue the new value for memberAttributeValue
     */
    public void setMemberAttributeValue(String aMemberAttributeValue) {
        memberAttributeValue = aMemberAttributeValue;
    }

    /**
     * Access method for memberAttributeTypeId.
     *
     * @return the current value of memberAttributeTypeId
     */
    public BigDecimal getMemberAttributeTypeId() {
        return memberAttributeTypeId;
    }

    /**
     * Setter method for memberAttributeTypeId.
     *
     * @param aMemberAttributeTypeId the new value for memberAttributeTypeId
     */
    public void setMemberAttributeTypeId(BigDecimal aMemberAttributeTypeId) {
        memberAttributeTypeId = aMemberAttributeTypeId;
    }

    /**
     * Access method for memberAttributeTypeDesc.
     *
     * @return the current value of memberAttributeTypeDesc
     */
    public String getMemberAttributeTypeDesc() {
        return memberAttributeTypeDesc;
    }

    /**
     * Setter method for memberAttributeTypeDesc.
     *
     * @param aMemberAttributeTypeDesc the new value for memberAttributeTypeDesc
     */
    public void setMemberAttributeTypeDesc(String aMemberAttributeTypeDesc) {
        memberAttributeTypeDesc = aMemberAttributeTypeDesc;
    }

    /**
     * Access method for isFlagIndicator.
     *
     * @return the current value of isFlagIndicator
     */
    public BigDecimal getIsFlagIndicator() {
        return isFlagIndicator;
    }

    /**
     * Setter method for isFlagIndicator.
     *
     * @param aIsFlagIndicator the new value for isFlagIndicator
     */
    public void setIsFlagIndicator(BigDecimal aIsFlagIndicator) {
        isFlagIndicator = aIsFlagIndicator;
    }

    /**
     * Access method for csAdminDisplayFl.
     *
     * @return the current value of csAdminDisplayFl
     */
    public BigDecimal getCsAdminDisplayFl() {
        return csAdminDisplayFl;
    }

    /**
     * Setter method for csAdminDisplayFl.
     *
     * @param aCsAdminDisplayFl the new value for csAdminDisplayFl
     */
    public void setCsAdminDisplayFl(BigDecimal aCsAdminDisplayFl) {
        csAdminDisplayFl = aCsAdminDisplayFl;
    }

    /**
     * Access method for statusCode.
     *
     * @return the current value of statusCode
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Setter method for statusCode.
     *
     * @param aStatusCode the new value for statusCode
     */
    public void setStatusCode(String aStatusCode) {
        statusCode = aStatusCode;
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
     * Compares the key for this instance with another StageMemberAttribute.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class StageMemberAttribute and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof StageMemberAttribute)) {
            return false;
        }
        StageMemberAttribute that = (StageMemberAttribute) other;
        if (this.getStageMemberAttributeId() != that.getStageMemberAttributeId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another StageMemberAttribute.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof StageMemberAttribute)) return false;
        return this.equalKeys(other) && ((StageMemberAttribute)other).equalKeys(this);
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
        i = (int)(getStageMemberAttributeId() ^ (getStageMemberAttributeId()>>>32));
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
        StringBuffer sb = new StringBuffer("[StageMemberAttribute |");
        sb.append(" stageMemberAttributeId=").append(getStageMemberAttributeId());
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
        ret.put("stageMemberAttributeId", Long.valueOf(getStageMemberAttributeId()));
        return ret;
    }

}
