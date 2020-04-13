// Generated with g9.

package com.cxloyalty.gce.entity.helix;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="stage_voucher_detail")
public class StageVoucherDetail implements Serializable {

    /** Primary key. */
    protected static final String PK = "voucherDetailId";

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
    @Column(name="voucher_detail_id", unique=true, nullable=false, precision=19)
    private long voucherDetailId;
    @Column(nullable=false, length=80)
    private String ecode;
    @Column(name="ecode_online", length=80)
    private String ecodeOnline;
    @Column(name="expiry_date", nullable=false)
    private Timestamp expiryDate;
    @Column(name="voucher_type", nullable=false, length=80)
    private String voucherType;
    @Column(precision=16, scale=2)
    private BigDecimal cost;
    @Column(name="cost_exclude_vat", precision=16, scale=2)
    private BigDecimal costExcludeVat;
    @Column(nullable=false, precision=16, scale=2)
    private BigDecimal price;
    @Column(name="price_exclude_vat", precision=16, scale=2)
    private BigDecimal priceExcludeVat;
    @Column(length=200)
    private String description;
    @Column(name="extra_attribute", length=80)
    private String extraAttribute;
    @Column(name="load_date", nullable=false)
    private Timestamp loadDate;
    @Column(name="load_filename", nullable=false, length=4000)
    private String loadFilename;
    @Column(name="user_created", length=200)
    private String userCreated;
    @Column(name="date_created")
    private Timestamp dateCreated;
    @Column(name="user_modified", length=200)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @Column(name="load_file_supplier", length=100)
    private String loadFileSupplier;
    @ManyToOne(optional=false)
    @JoinColumn(name="voucher_header_id", nullable=false)
    private StageServiceRequest stageServiceRequest;

    /** Default constructor. */
    public StageVoucherDetail() {
        super();
    }

    /**
     * Access method for voucherDetailId.
     *
     * @return the current value of voucherDetailId
     */
    public long getVoucherDetailId() {
        return voucherDetailId;
    }

    /**
     * Setter method for voucherDetailId.
     *
     * @param aVoucherDetailId the new value for voucherDetailId
     */
    public void setVoucherDetailId(long aVoucherDetailId) {
        voucherDetailId = aVoucherDetailId;
    }

    /**
     * Access method for ecode.
     *
     * @return the current value of ecode
     */
    public String getEcode() {
        return ecode;
    }

    /**
     * Setter method for ecode.
     *
     * @param aEcode the new value for ecode
     */
    public void setEcode(String aEcode) {
        ecode = aEcode;
    }

    /**
     * Access method for ecodeOnline.
     *
     * @return the current value of ecodeOnline
     */
    public String getEcodeOnline() {
        return ecodeOnline;
    }

    /**
     * Setter method for ecodeOnline.
     *
     * @param aEcodeOnline the new value for ecodeOnline
     */
    public void setEcodeOnline(String aEcodeOnline) {
        ecodeOnline = aEcodeOnline;
    }

    /**
     * Access method for expiryDate.
     *
     * @return the current value of expiryDate
     */
    public Timestamp getExpiryDate() {
        return expiryDate;
    }

    /**
     * Setter method for expiryDate.
     *
     * @param aExpiryDate the new value for expiryDate
     */
    public void setExpiryDate(Timestamp aExpiryDate) {
        expiryDate = aExpiryDate;
    }

    /**
     * Access method for voucherType.
     *
     * @return the current value of voucherType
     */
    public String getVoucherType() {
        return voucherType;
    }

    /**
     * Setter method for voucherType.
     *
     * @param aVoucherType the new value for voucherType
     */
    public void setVoucherType(String aVoucherType) {
        voucherType = aVoucherType;
    }

    /**
     * Access method for cost.
     *
     * @return the current value of cost
     */
    public BigDecimal getCost() {
        return cost;
    }

    /**
     * Setter method for cost.
     *
     * @param aCost the new value for cost
     */
    public void setCost(BigDecimal aCost) {
        cost = aCost;
    }

    /**
     * Access method for costExcludeVat.
     *
     * @return the current value of costExcludeVat
     */
    public BigDecimal getCostExcludeVat() {
        return costExcludeVat;
    }

    /**
     * Setter method for costExcludeVat.
     *
     * @param aCostExcludeVat the new value for costExcludeVat
     */
    public void setCostExcludeVat(BigDecimal aCostExcludeVat) {
        costExcludeVat = aCostExcludeVat;
    }

    /**
     * Access method for price.
     *
     * @return the current value of price
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Setter method for price.
     *
     * @param aPrice the new value for price
     */
    public void setPrice(BigDecimal aPrice) {
        price = aPrice;
    }

    /**
     * Access method for priceExcludeVat.
     *
     * @return the current value of priceExcludeVat
     */
    public BigDecimal getPriceExcludeVat() {
        return priceExcludeVat;
    }

    /**
     * Setter method for priceExcludeVat.
     *
     * @param aPriceExcludeVat the new value for priceExcludeVat
     */
    public void setPriceExcludeVat(BigDecimal aPriceExcludeVat) {
        priceExcludeVat = aPriceExcludeVat;
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
     * Access method for extraAttribute.
     *
     * @return the current value of extraAttribute
     */
    public String getExtraAttribute() {
        return extraAttribute;
    }

    /**
     * Setter method for extraAttribute.
     *
     * @param aExtraAttribute the new value for extraAttribute
     */
    public void setExtraAttribute(String aExtraAttribute) {
        extraAttribute = aExtraAttribute;
    }

    /**
     * Access method for loadDate.
     *
     * @return the current value of loadDate
     */
    public Timestamp getLoadDate() {
        return loadDate;
    }

    /**
     * Setter method for loadDate.
     *
     * @param aLoadDate the new value for loadDate
     */
    public void setLoadDate(Timestamp aLoadDate) {
        loadDate = aLoadDate;
    }

    /**
     * Access method for loadFilename.
     *
     * @return the current value of loadFilename
     */
    public String getLoadFilename() {
        return loadFilename;
    }

    /**
     * Setter method for loadFilename.
     *
     * @param aLoadFilename the new value for loadFilename
     */
    public void setLoadFilename(String aLoadFilename) {
        loadFilename = aLoadFilename;
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
     * Access method for loadFileSupplier.
     *
     * @return the current value of loadFileSupplier
     */
    public String getLoadFileSupplier() {
        return loadFileSupplier;
    }

    /**
     * Setter method for loadFileSupplier.
     *
     * @param aLoadFileSupplier the new value for loadFileSupplier
     */
    public void setLoadFileSupplier(String aLoadFileSupplier) {
        loadFileSupplier = aLoadFileSupplier;
    }

    /**
     * Access method for stageServiceRequest.
     *
     * @return the current value of stageServiceRequest
     */
    public StageServiceRequest getStageServiceRequest() {
        return stageServiceRequest;
    }

    /**
     * Setter method for stageServiceRequest.
     *
     * @param aStageServiceRequest the new value for stageServiceRequest
     */
    public void setStageServiceRequest(StageServiceRequest aStageServiceRequest) {
        stageServiceRequest = aStageServiceRequest;
    }

    /**
     * Compares the key for this instance with another StageVoucherDetail.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class StageVoucherDetail and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof StageVoucherDetail)) {
            return false;
        }
        StageVoucherDetail that = (StageVoucherDetail) other;
        if (this.getVoucherDetailId() != that.getVoucherDetailId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another StageVoucherDetail.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof StageVoucherDetail)) return false;
        return this.equalKeys(other) && ((StageVoucherDetail)other).equalKeys(this);
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
        i = (int)(getVoucherDetailId() ^ (getVoucherDetailId()>>>32));
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
        StringBuffer sb = new StringBuffer("[StageVoucherDetail |");
        sb.append(" voucherDetailId=").append(getVoucherDetailId());
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
        ret.put("voucherDetailId", Long.valueOf(getVoucherDetailId()));
        return ret;
    }

}
