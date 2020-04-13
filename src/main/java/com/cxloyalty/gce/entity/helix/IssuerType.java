// Generated with g9.

package com.cxloyalty.gce.entity.helix;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="issuer_type")
public class IssuerType implements Serializable {

    /** Primary key. */
    protected static final String PK = "issuerType";

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
    @Column(name="issuer_type", unique=true, nullable=false, length=1)
    private String issuerType;
    @Column(nullable=false, length=30)
    private String description;
    @OneToMany(mappedBy="issuerType")
    private Set<Issuer> issuer;

    /** Default constructor. */
    public IssuerType() {
        super();
    }

    /**
     * Access method for issuerType.
     *
     * @return the current value of issuerType
     */
    public String getIssuerType() {
        return issuerType;
    }

    /**
     * Setter method for issuerType.
     *
     * @param aIssuerType the new value for issuerType
     */
    public void setIssuerType(String aIssuerType) {
        issuerType = aIssuerType;
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
     * Compares the key for this instance with another IssuerType.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class IssuerType and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof IssuerType)) {
            return false;
        }
        IssuerType that = (IssuerType) other;
        Object myIssuerType = this.getIssuerType();
        Object yourIssuerType = that.getIssuerType();
        if (myIssuerType==null ? yourIssuerType!=null : !myIssuerType.equals(yourIssuerType)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another IssuerType.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof IssuerType)) return false;
        return this.equalKeys(other) && ((IssuerType)other).equalKeys(this);
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
        if (getIssuerType() == null) {
            i = 0;
        } else {
            i = getIssuerType().hashCode();
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
        StringBuffer sb = new StringBuffer("[IssuerType |");
        sb.append(" issuerType=").append(getIssuerType());
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
        ret.put("issuerType", getIssuerType());
        return ret;
    }

}
