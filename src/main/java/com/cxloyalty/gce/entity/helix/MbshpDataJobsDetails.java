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

@Entity(name="mbshp_data_jobs_details")
public class MbshpDataJobsDetails implements Serializable {

    /** Primary key. */
    protected static final String PK = "jobDetailsId";

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
    @Column(name="job_details_id", unique=true, nullable=false, precision=9)
    private BigDecimal jobDetailsId;
    @Column(name="table_name", length=50)
    private String tableName;
    @Column(name="insert_update_count", precision=6)
    private BigDecimal insertUpdateCount;
    @Column(name="delete_count", precision=6)
    private BigDecimal deleteCount;
    @Column(length=20)
    private String status;
    @Column(name="date_created")
    private Timestamp dateCreated;
    @Column(name="date_modified")
    private Timestamp dateModified;
    @ManyToOne
    @JoinColumn(name="job_id")
    private MbshpDataJobs mbshpDataJobs;

    /** Default constructor. */
    public MbshpDataJobsDetails() {
        super();
    }

    /**
     * Access method for jobDetailsId.
     *
     * @return the current value of jobDetailsId
     */
    public BigDecimal getJobDetailsId() {
        return jobDetailsId;
    }

    /**
     * Setter method for jobDetailsId.
     *
     * @param aJobDetailsId the new value for jobDetailsId
     */
    public void setJobDetailsId(BigDecimal aJobDetailsId) {
        jobDetailsId = aJobDetailsId;
    }

    /**
     * Access method for tableName.
     *
     * @return the current value of tableName
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * Setter method for tableName.
     *
     * @param aTableName the new value for tableName
     */
    public void setTableName(String aTableName) {
        tableName = aTableName;
    }

    /**
     * Access method for insertUpdateCount.
     *
     * @return the current value of insertUpdateCount
     */
    public BigDecimal getInsertUpdateCount() {
        return insertUpdateCount;
    }

    /**
     * Setter method for insertUpdateCount.
     *
     * @param aInsertUpdateCount the new value for insertUpdateCount
     */
    public void setInsertUpdateCount(BigDecimal aInsertUpdateCount) {
        insertUpdateCount = aInsertUpdateCount;
    }

    /**
     * Access method for deleteCount.
     *
     * @return the current value of deleteCount
     */
    public BigDecimal getDeleteCount() {
        return deleteCount;
    }

    /**
     * Setter method for deleteCount.
     *
     * @param aDeleteCount the new value for deleteCount
     */
    public void setDeleteCount(BigDecimal aDeleteCount) {
        deleteCount = aDeleteCount;
    }

    /**
     * Access method for status.
     *
     * @return the current value of status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Setter method for status.
     *
     * @param aStatus the new value for status
     */
    public void setStatus(String aStatus) {
        status = aStatus;
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
     * Access method for mbshpDataJobs.
     *
     * @return the current value of mbshpDataJobs
     */
    public MbshpDataJobs getMbshpDataJobs() {
        return mbshpDataJobs;
    }

    /**
     * Setter method for mbshpDataJobs.
     *
     * @param aMbshpDataJobs the new value for mbshpDataJobs
     */
    public void setMbshpDataJobs(MbshpDataJobs aMbshpDataJobs) {
        mbshpDataJobs = aMbshpDataJobs;
    }

    /**
     * Compares the key for this instance with another MbshpDataJobsDetails.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class MbshpDataJobsDetails and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof MbshpDataJobsDetails)) {
            return false;
        }
        MbshpDataJobsDetails that = (MbshpDataJobsDetails) other;
        Object myJobDetailsId = this.getJobDetailsId();
        Object yourJobDetailsId = that.getJobDetailsId();
        if (myJobDetailsId==null ? yourJobDetailsId!=null : !myJobDetailsId.equals(yourJobDetailsId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another MbshpDataJobsDetails.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof MbshpDataJobsDetails)) return false;
        return this.equalKeys(other) && ((MbshpDataJobsDetails)other).equalKeys(this);
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
        if (getJobDetailsId() == null) {
            i = 0;
        } else {
            i = getJobDetailsId().hashCode();
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
        StringBuffer sb = new StringBuffer("[MbshpDataJobsDetails |");
        sb.append(" jobDetailsId=").append(getJobDetailsId());
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
        ret.put("jobDetailsId", getJobDetailsId());
        return ret;
    }

}
