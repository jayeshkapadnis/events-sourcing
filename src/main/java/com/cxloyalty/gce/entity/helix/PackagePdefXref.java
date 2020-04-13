// Generated with g9.

package com.cxloyalty.gce.entity.helix;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.*;

@Entity(name="package_pdef_xref")
public class PackagePdefXref implements Serializable {

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
    @Column(name="pkg_pdef_xref_id", precision=16)
    private BigDecimal pkgPdefXrefId;
    @Column(name="pdef_id", precision=16)
    private BigDecimal pdefId;
    @Column(name="legacy_pdef_name", length=100)
    private String legacyPdefName;
    @ManyToOne
    @JoinColumn(name="pkg_id")
    private Package package_;

    /** Default constructor. */
    public PackagePdefXref() {
        super();
    }

    /**
     * Access method for pkgPdefXrefId.
     *
     * @return the current value of pkgPdefXrefId
     */
    public BigDecimal getPkgPdefXrefId() {
        return pkgPdefXrefId;
    }

    /**
     * Setter method for pkgPdefXrefId.
     *
     * @param aPkgPdefXrefId the new value for pkgPdefXrefId
     */
    public void setPkgPdefXrefId(BigDecimal aPkgPdefXrefId) {
        pkgPdefXrefId = aPkgPdefXrefId;
    }

    /**
     * Access method for pdefId.
     *
     * @return the current value of pdefId
     */
    public BigDecimal getPdefId() {
        return pdefId;
    }

    /**
     * Setter method for pdefId.
     *
     * @param aPdefId the new value for pdefId
     */
    public void setPdefId(BigDecimal aPdefId) {
        pdefId = aPdefId;
    }

    /**
     * Access method for legacyPdefName.
     *
     * @return the current value of legacyPdefName
     */
    public String getLegacyPdefName() {
        return legacyPdefName;
    }

    /**
     * Setter method for legacyPdefName.
     *
     * @param aLegacyPdefName the new value for legacyPdefName
     */
    public void setLegacyPdefName(String aLegacyPdefName) {
        legacyPdefName = aLegacyPdefName;
    }

    /**
     * Access method for package_.
     *
     * @return the current value of package_
     */
    public Package getPackage_() {
        return package_;
    }

    /**
     * Setter method for package_.
     *
     * @param aPackage_ the new value for package_
     */
    public void setPackage_(Package aPackage_) {
        package_ = aPackage_;
    }

}
