// Generated with g9.

package com.cxloyalty.gce.entity.helix;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.*;

@Entity(name="legacy_benefit_xref")
public class LegacyBenefitXref implements Serializable {

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
    @Column(name="legacy_ben_xref_id", precision=16)
    private BigDecimal legacyBenXrefId;
    @Column(name="legacy_ben_id", precision=16)
    private BigDecimal legacyBenId;
    @Column(name="legacy_ben_name", length=50)
    private String legacyBenName;
    @ManyToOne
    @JoinColumn(name="ben_id")
    private Benefit benefit;

    /** Default constructor. */
    public LegacyBenefitXref() {
        super();
    }

    /**
     * Access method for legacyBenXrefId.
     *
     * @return the current value of legacyBenXrefId
     */
    public BigDecimal getLegacyBenXrefId() {
        return legacyBenXrefId;
    }

    /**
     * Setter method for legacyBenXrefId.
     *
     * @param aLegacyBenXrefId the new value for legacyBenXrefId
     */
    public void setLegacyBenXrefId(BigDecimal aLegacyBenXrefId) {
        legacyBenXrefId = aLegacyBenXrefId;
    }

    /**
     * Access method for legacyBenId.
     *
     * @return the current value of legacyBenId
     */
    public BigDecimal getLegacyBenId() {
        return legacyBenId;
    }

    /**
     * Setter method for legacyBenId.
     *
     * @param aLegacyBenId the new value for legacyBenId
     */
    public void setLegacyBenId(BigDecimal aLegacyBenId) {
        legacyBenId = aLegacyBenId;
    }

    /**
     * Access method for legacyBenName.
     *
     * @return the current value of legacyBenName
     */
    public String getLegacyBenName() {
        return legacyBenName;
    }

    /**
     * Setter method for legacyBenName.
     *
     * @param aLegacyBenName the new value for legacyBenName
     */
    public void setLegacyBenName(String aLegacyBenName) {
        legacyBenName = aLegacyBenName;
    }

    /**
     * Access method for benefit.
     *
     * @return the current value of benefit
     */
    public Benefit getBenefit() {
        return benefit;
    }

    /**
     * Setter method for benefit.
     *
     * @param aBenefit the new value for benefit
     */
    public void setBenefit(Benefit aBenefit) {
        benefit = aBenefit;
    }

}
