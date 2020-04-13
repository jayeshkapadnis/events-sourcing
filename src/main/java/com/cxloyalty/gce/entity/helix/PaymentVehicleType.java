// Generated with g9.

package com.cxloyalty.gce.entity.helix;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name="payment_vehicle_type")
public class PaymentVehicleType implements Serializable {

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
    @Column(name="payment_vehicle_type_sysid", nullable=false, precision=2)
    private BigDecimal paymentVehicleTypeSysid;
    @Column(nullable=false, length=32)
    private String description;

    /** Default constructor. */
    public PaymentVehicleType() {
        super();
    }

    /**
     * Access method for paymentVehicleTypeSysid.
     *
     * @return the current value of paymentVehicleTypeSysid
     */
    public BigDecimal getPaymentVehicleTypeSysid() {
        return paymentVehicleTypeSysid;
    }

    /**
     * Setter method for paymentVehicleTypeSysid.
     *
     * @param aPaymentVehicleTypeSysid the new value for paymentVehicleTypeSysid
     */
    public void setPaymentVehicleTypeSysid(BigDecimal aPaymentVehicleTypeSysid) {
        paymentVehicleTypeSysid = aPaymentVehicleTypeSysid;
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

}
