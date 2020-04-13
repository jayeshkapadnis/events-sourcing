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

@Entity(name="product_group")
public class ProductGroup implements Serializable {

    /** Primary key. */
    protected static final String PK = "productGroupId";

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
    @Column(name="product_group_id", unique=true, nullable=false, precision=10)
    private BigDecimal productGroupId;
    @Column(name="product_group_desc", nullable=false, length=100)
    private String productGroupDesc;
    @Column(name="user_created", nullable=false, length=30)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=30)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @OneToMany(mappedBy="productGroup")
    private Set<LockScheme> lockScheme;
    @OneToMany(mappedBy="productGroup")
    private Set<Product> product;

    /** Default constructor. */
    public ProductGroup() {
        super();
    }

    /**
     * Access method for productGroupId.
     *
     * @return the current value of productGroupId
     */
    public BigDecimal getProductGroupId() {
        return productGroupId;
    }

    /**
     * Setter method for productGroupId.
     *
     * @param aProductGroupId the new value for productGroupId
     */
    public void setProductGroupId(BigDecimal aProductGroupId) {
        productGroupId = aProductGroupId;
    }

    /**
     * Access method for productGroupDesc.
     *
     * @return the current value of productGroupDesc
     */
    public String getProductGroupDesc() {
        return productGroupDesc;
    }

    /**
     * Setter method for productGroupDesc.
     *
     * @param aProductGroupDesc the new value for productGroupDesc
     */
    public void setProductGroupDesc(String aProductGroupDesc) {
        productGroupDesc = aProductGroupDesc;
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
     * Access method for lockScheme.
     *
     * @return the current value of lockScheme
     */
    public Set<LockScheme> getLockScheme() {
        return lockScheme;
    }

    /**
     * Setter method for lockScheme.
     *
     * @param aLockScheme the new value for lockScheme
     */
    public void setLockScheme(Set<LockScheme> aLockScheme) {
        lockScheme = aLockScheme;
    }

    /**
     * Access method for product.
     *
     * @return the current value of product
     */
    public Set<Product> getProduct() {
        return product;
    }

    /**
     * Setter method for product.
     *
     * @param aProduct the new value for product
     */
    public void setProduct(Set<Product> aProduct) {
        product = aProduct;
    }

    /**
     * Compares the key for this instance with another ProductGroup.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ProductGroup and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ProductGroup)) {
            return false;
        }
        ProductGroup that = (ProductGroup) other;
        Object myProductGroupId = this.getProductGroupId();
        Object yourProductGroupId = that.getProductGroupId();
        if (myProductGroupId==null ? yourProductGroupId!=null : !myProductGroupId.equals(yourProductGroupId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ProductGroup.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ProductGroup)) return false;
        return this.equalKeys(other) && ((ProductGroup)other).equalKeys(this);
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
        if (getProductGroupId() == null) {
            i = 0;
        } else {
            i = getProductGroupId().hashCode();
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
        StringBuffer sb = new StringBuffer("[ProductGroup |");
        sb.append(" productGroupId=").append(getProductGroupId());
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
        ret.put("productGroupId", getProductGroupId());
        return ret;
    }

}
