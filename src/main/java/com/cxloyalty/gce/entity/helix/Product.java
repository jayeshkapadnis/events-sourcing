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
@Table(name="product", indexes={@Index(name="productIdxProductAof", columnList="product_id,aof_check_enabled_flg")})
public class Product implements Serializable {

    /** Primary key. */
    protected static final String PK = "productId";

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
    @Column(name="product_id", unique=true, nullable=false, precision=10)
    private BigDecimal productId;
    @Column(name="product_desc", nullable=false, length=100)
    private String productDesc;
    @Column(name="site_id", precision=16)
    private BigDecimal siteId;
    @Column(name="user_created", nullable=false, length=30)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=30)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @Column(name="aof_check_enabled_flg", nullable=false, length=1)
    private String aofCheckEnabledFlg;
    @ManyToOne
    @JoinColumn(name="product_group_id")
    private ProductGroup productGroup;
    @ManyToOne(optional=false)
    @JoinColumn(name="prod_type_id", nullable=false)
    private ProductType productType;
    @ManyToOne
    @JoinColumn(name="organization_id")
    private Organization organization;
    @OneToMany(mappedBy="product")
    private Set<Solicitation> solicitation;

    /** Default constructor. */
    public Product() {
        super();
    }

    /**
     * Access method for productId.
     *
     * @return the current value of productId
     */
    public BigDecimal getProductId() {
        return productId;
    }

    /**
     * Setter method for productId.
     *
     * @param aProductId the new value for productId
     */
    public void setProductId(BigDecimal aProductId) {
        productId = aProductId;
    }

    /**
     * Access method for productDesc.
     *
     * @return the current value of productDesc
     */
    public String getProductDesc() {
        return productDesc;
    }

    /**
     * Setter method for productDesc.
     *
     * @param aProductDesc the new value for productDesc
     */
    public void setProductDesc(String aProductDesc) {
        productDesc = aProductDesc;
    }

    /**
     * Access method for siteId.
     *
     * @return the current value of siteId
     */
    public BigDecimal getSiteId() {
        return siteId;
    }

    /**
     * Setter method for siteId.
     *
     * @param aSiteId the new value for siteId
     */
    public void setSiteId(BigDecimal aSiteId) {
        siteId = aSiteId;
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
     * Access method for aofCheckEnabledFlg.
     *
     * @return the current value of aofCheckEnabledFlg
     */
    public String getAofCheckEnabledFlg() {
        return aofCheckEnabledFlg;
    }

    /**
     * Setter method for aofCheckEnabledFlg.
     *
     * @param aAofCheckEnabledFlg the new value for aofCheckEnabledFlg
     */
    public void setAofCheckEnabledFlg(String aAofCheckEnabledFlg) {
        aofCheckEnabledFlg = aAofCheckEnabledFlg;
    }

    /**
     * Access method for productGroup.
     *
     * @return the current value of productGroup
     */
    public ProductGroup getProductGroup() {
        return productGroup;
    }

    /**
     * Setter method for productGroup.
     *
     * @param aProductGroup the new value for productGroup
     */
    public void setProductGroup(ProductGroup aProductGroup) {
        productGroup = aProductGroup;
    }

    /**
     * Access method for productType.
     *
     * @return the current value of productType
     */
    public ProductType getProductType() {
        return productType;
    }

    /**
     * Setter method for productType.
     *
     * @param aProductType the new value for productType
     */
    public void setProductType(ProductType aProductType) {
        productType = aProductType;
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
     * Compares the key for this instance with another Product.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Product and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Product)) {
            return false;
        }
        Product that = (Product) other;
        Object myProductId = this.getProductId();
        Object yourProductId = that.getProductId();
        if (myProductId==null ? yourProductId!=null : !myProductId.equals(yourProductId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Product.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Product)) return false;
        return this.equalKeys(other) && ((Product)other).equalKeys(this);
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
        if (getProductId() == null) {
            i = 0;
        } else {
            i = getProductId().hashCode();
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
        StringBuffer sb = new StringBuffer("[Product |");
        sb.append(" productId=").append(getProductId());
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
        ret.put("productId", getProductId());
        return ret;
    }

}
