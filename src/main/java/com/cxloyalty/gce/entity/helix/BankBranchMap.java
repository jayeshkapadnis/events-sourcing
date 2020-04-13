// Generated with g9.

package com.cxloyalty.gce.entity.helix;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.*;

@Entity(name="bank_branch_map")
public class BankBranchMap implements Serializable {

    /** Primary key. */
    protected static final String PK = "BankBranchMapPkBbMap";

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
    @Column(name="client_code", nullable=false, length=10)
    private String clientCode;
    @Column(name="branch_code", nullable=false, precision=10)
    private BigDecimal branchCode;
    @Column(name="group_code", nullable=false, precision=10)
    private BigDecimal groupCode;
    @Column(name="branch_num", nullable=false, precision=10)
    private BigDecimal branchNum;
    @Column(name="branch_allocation", precision=10)
    private BigDecimal branchAllocation;
    @Column(name="group_allocation", precision=10)
    private BigDecimal groupAllocation;
    @Column(name="bank_sort_code", nullable=false, length=50)
    private String bankSortCode;
    @Column(name="branch_name", length=50)
    private String branchName;
    @Column(name="group_name", length=50)
    private String groupName;
    @Column(name="group_abbr", length=50)
    private String groupAbbr;
    @Column(name="user_created", nullable=false, length=4000)
    private String userCreated;
    @Column(name="date_created", nullable=false)
    private Timestamp dateCreated;
    @Column(name="user_modified", length=4000)
    private String userModified;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @ManyToOne
    @JoinColumn(name="bank_branch_sysid")
    private BankBranch bankBranch;

    /** Default constructor. */
    public BankBranchMap() {
        super();
    }

    /**
     * Access method for clientCode.
     *
     * @return the current value of clientCode
     */
    public String getClientCode() {
        return clientCode;
    }

    /**
     * Setter method for clientCode.
     *
     * @param aClientCode the new value for clientCode
     */
    public void setClientCode(String aClientCode) {
        clientCode = aClientCode;
    }

    /**
     * Access method for branchCode.
     *
     * @return the current value of branchCode
     */
    public BigDecimal getBranchCode() {
        return branchCode;
    }

    /**
     * Setter method for branchCode.
     *
     * @param aBranchCode the new value for branchCode
     */
    public void setBranchCode(BigDecimal aBranchCode) {
        branchCode = aBranchCode;
    }

    /**
     * Access method for groupCode.
     *
     * @return the current value of groupCode
     */
    public BigDecimal getGroupCode() {
        return groupCode;
    }

    /**
     * Setter method for groupCode.
     *
     * @param aGroupCode the new value for groupCode
     */
    public void setGroupCode(BigDecimal aGroupCode) {
        groupCode = aGroupCode;
    }

    /**
     * Access method for branchNum.
     *
     * @return the current value of branchNum
     */
    public BigDecimal getBranchNum() {
        return branchNum;
    }

    /**
     * Setter method for branchNum.
     *
     * @param aBranchNum the new value for branchNum
     */
    public void setBranchNum(BigDecimal aBranchNum) {
        branchNum = aBranchNum;
    }

    /**
     * Access method for branchAllocation.
     *
     * @return the current value of branchAllocation
     */
    public BigDecimal getBranchAllocation() {
        return branchAllocation;
    }

    /**
     * Setter method for branchAllocation.
     *
     * @param aBranchAllocation the new value for branchAllocation
     */
    public void setBranchAllocation(BigDecimal aBranchAllocation) {
        branchAllocation = aBranchAllocation;
    }

    /**
     * Access method for groupAllocation.
     *
     * @return the current value of groupAllocation
     */
    public BigDecimal getGroupAllocation() {
        return groupAllocation;
    }

    /**
     * Setter method for groupAllocation.
     *
     * @param aGroupAllocation the new value for groupAllocation
     */
    public void setGroupAllocation(BigDecimal aGroupAllocation) {
        groupAllocation = aGroupAllocation;
    }

    /**
     * Access method for bankSortCode.
     *
     * @return the current value of bankSortCode
     */
    public String getBankSortCode() {
        return bankSortCode;
    }

    /**
     * Setter method for bankSortCode.
     *
     * @param aBankSortCode the new value for bankSortCode
     */
    public void setBankSortCode(String aBankSortCode) {
        bankSortCode = aBankSortCode;
    }

    /**
     * Access method for branchName.
     *
     * @return the current value of branchName
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * Setter method for branchName.
     *
     * @param aBranchName the new value for branchName
     */
    public void setBranchName(String aBranchName) {
        branchName = aBranchName;
    }

    /**
     * Access method for groupName.
     *
     * @return the current value of groupName
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Setter method for groupName.
     *
     * @param aGroupName the new value for groupName
     */
    public void setGroupName(String aGroupName) {
        groupName = aGroupName;
    }

    /**
     * Access method for groupAbbr.
     *
     * @return the current value of groupAbbr
     */
    public String getGroupAbbr() {
        return groupAbbr;
    }

    /**
     * Setter method for groupAbbr.
     *
     * @param aGroupAbbr the new value for groupAbbr
     */
    public void setGroupAbbr(String aGroupAbbr) {
        groupAbbr = aGroupAbbr;
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
     * Access method for bankBranch.
     *
     * @return the current value of bankBranch
     */
    public BankBranch getBankBranch() {
        return bankBranch;
    }

    /**
     * Setter method for bankBranch.
     *
     * @param aBankBranch the new value for bankBranch
     */
    public void setBankBranch(BankBranch aBankBranch) {
        bankBranch = aBankBranch;
    }

    /**
     * Compares the key for this instance with another BankBranchMap.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class BankBranchMap and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof BankBranchMap)) {
            return false;
        }
        BankBranchMap that = (BankBranchMap) other;
        Object myClientCode = this.getClientCode();
        Object yourClientCode = that.getClientCode();
        if (myClientCode==null ? yourClientCode!=null : !myClientCode.equals(yourClientCode)) {
            return false;
        }
        Object myBranchCode = this.getBranchCode();
        Object yourBranchCode = that.getBranchCode();
        if (myBranchCode==null ? yourBranchCode!=null : !myBranchCode.equals(yourBranchCode)) {
            return false;
        }
        Object myGroupCode = this.getGroupCode();
        Object yourGroupCode = that.getGroupCode();
        if (myGroupCode==null ? yourGroupCode!=null : !myGroupCode.equals(yourGroupCode)) {
            return false;
        }
        Object myBranchNum = this.getBranchNum();
        Object yourBranchNum = that.getBranchNum();
        if (myBranchNum==null ? yourBranchNum!=null : !myBranchNum.equals(yourBranchNum)) {
            return false;
        }
        Object myBankSortCode = this.getBankSortCode();
        Object yourBankSortCode = that.getBankSortCode();
        if (myBankSortCode==null ? yourBankSortCode!=null : !myBankSortCode.equals(yourBankSortCode)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another BankBranchMap.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof BankBranchMap)) return false;
        return this.equalKeys(other) && ((BankBranchMap)other).equalKeys(this);
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
        if (getClientCode() == null) {
            i = 0;
        } else {
            i = getClientCode().hashCode();
        }
        result = 37*result + i;
        if (getBranchCode() == null) {
            i = 0;
        } else {
            i = getBranchCode().hashCode();
        }
        result = 37*result + i;
        if (getGroupCode() == null) {
            i = 0;
        } else {
            i = getGroupCode().hashCode();
        }
        result = 37*result + i;
        if (getBranchNum() == null) {
            i = 0;
        } else {
            i = getBranchNum().hashCode();
        }
        result = 37*result + i;
        if (getBankSortCode() == null) {
            i = 0;
        } else {
            i = getBankSortCode().hashCode();
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
        StringBuffer sb = new StringBuffer("[BankBranchMap |");
        sb.append(" clientCode=").append(getClientCode());
        sb.append(" branchCode=").append(getBranchCode());
        sb.append(" groupCode=").append(getGroupCode());
        sb.append(" branchNum=").append(getBranchNum());
        sb.append(" bankSortCode=").append(getBankSortCode());
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
        ret.put("clientCode", getClientCode());
        ret.put("branchCode", getBranchCode());
        ret.put("groupCode", getGroupCode());
        ret.put("branchNum", getBranchNum());
        ret.put("bankSortCode", getBankSortCode());
        return ret;
    }

}
