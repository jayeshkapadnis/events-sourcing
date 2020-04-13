// Generated with g9.

package com.cxloyalty.gce.entity.helix;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name="bank_branch_santander")
public class BankBranchSantander implements Serializable {

    /** Primary key. */
    protected static final String PK = "bankBranchCode";

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
    @Column(name="bank_branch_code", unique=true, nullable=false, precision=10)
    private BigDecimal bankBranchCode;
    @Column(name="san_code", length=50)
    private String sanCode;
    @Column(name="bank_branch_desc", length=200)
    private String bankBranchDesc;

    /** Default constructor. */
    public BankBranchSantander() {
        super();
    }

    /**
     * Access method for bankBranchCode.
     *
     * @return the current value of bankBranchCode
     */
    public BigDecimal getBankBranchCode() {
        return bankBranchCode;
    }

    /**
     * Setter method for bankBranchCode.
     *
     * @param aBankBranchCode the new value for bankBranchCode
     */
    public void setBankBranchCode(BigDecimal aBankBranchCode) {
        bankBranchCode = aBankBranchCode;
    }

    /**
     * Access method for sanCode.
     *
     * @return the current value of sanCode
     */
    public String getSanCode() {
        return sanCode;
    }

    /**
     * Setter method for sanCode.
     *
     * @param aSanCode the new value for sanCode
     */
    public void setSanCode(String aSanCode) {
        sanCode = aSanCode;
    }

    /**
     * Access method for bankBranchDesc.
     *
     * @return the current value of bankBranchDesc
     */
    public String getBankBranchDesc() {
        return bankBranchDesc;
    }

    /**
     * Setter method for bankBranchDesc.
     *
     * @param aBankBranchDesc the new value for bankBranchDesc
     */
    public void setBankBranchDesc(String aBankBranchDesc) {
        bankBranchDesc = aBankBranchDesc;
    }

    /**
     * Compares the key for this instance with another BankBranchSantander.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class BankBranchSantander and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof BankBranchSantander)) {
            return false;
        }
        BankBranchSantander that = (BankBranchSantander) other;
        Object myBankBranchCode = this.getBankBranchCode();
        Object yourBankBranchCode = that.getBankBranchCode();
        if (myBankBranchCode==null ? yourBankBranchCode!=null : !myBankBranchCode.equals(yourBankBranchCode)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another BankBranchSantander.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof BankBranchSantander)) return false;
        return this.equalKeys(other) && ((BankBranchSantander)other).equalKeys(this);
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
        if (getBankBranchCode() == null) {
            i = 0;
        } else {
            i = getBankBranchCode().hashCode();
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
        StringBuffer sb = new StringBuffer("[BankBranchSantander |");
        sb.append(" bankBranchCode=").append(getBankBranchCode());
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
        ret.put("bankBranchCode", getBankBranchCode());
        return ret;
    }

}
