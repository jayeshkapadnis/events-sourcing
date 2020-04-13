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

@Entity(name="mbshp_data_jobs")
public class MbshpDataJobs implements Serializable {

    /** Primary key. */
    protected static final String PK = "jobId";

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
    @Column(name="job_id", unique=true, nullable=false, precision=9)
    private BigDecimal jobId;
    @Column(name="job_name", length=50)
    private String jobName;
    @Column(name="created_date")
    private Timestamp createdDate;
    @Column(name="start_date")
    private Timestamp startDate;
    @Column(name="end_date")
    private Timestamp endDate;
    @Column(name="created_by", length=50)
    private String createdBy;
    @Column(name="job_status", length=20)
    private String jobStatus;
    @OneToMany(mappedBy="mbshpDataJobs")
    private Set<MbshpDataJobsDetails> mbshpDataJobsDetails;

    /** Default constructor. */
    public MbshpDataJobs() {
        super();
    }

    /**
     * Access method for jobId.
     *
     * @return the current value of jobId
     */
    public BigDecimal getJobId() {
        return jobId;
    }

    /**
     * Setter method for jobId.
     *
     * @param aJobId the new value for jobId
     */
    public void setJobId(BigDecimal aJobId) {
        jobId = aJobId;
    }

    /**
     * Access method for jobName.
     *
     * @return the current value of jobName
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * Setter method for jobName.
     *
     * @param aJobName the new value for jobName
     */
    public void setJobName(String aJobName) {
        jobName = aJobName;
    }

    /**
     * Access method for createdDate.
     *
     * @return the current value of createdDate
     */
    public Timestamp getCreatedDate() {
        return createdDate;
    }

    /**
     * Setter method for createdDate.
     *
     * @param aCreatedDate the new value for createdDate
     */
    public void setCreatedDate(Timestamp aCreatedDate) {
        createdDate = aCreatedDate;
    }

    /**
     * Access method for startDate.
     *
     * @return the current value of startDate
     */
    public Timestamp getStartDate() {
        return startDate;
    }

    /**
     * Setter method for startDate.
     *
     * @param aStartDate the new value for startDate
     */
    public void setStartDate(Timestamp aStartDate) {
        startDate = aStartDate;
    }

    /**
     * Access method for endDate.
     *
     * @return the current value of endDate
     */
    public Timestamp getEndDate() {
        return endDate;
    }

    /**
     * Setter method for endDate.
     *
     * @param aEndDate the new value for endDate
     */
    public void setEndDate(Timestamp aEndDate) {
        endDate = aEndDate;
    }

    /**
     * Access method for createdBy.
     *
     * @return the current value of createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Setter method for createdBy.
     *
     * @param aCreatedBy the new value for createdBy
     */
    public void setCreatedBy(String aCreatedBy) {
        createdBy = aCreatedBy;
    }

    /**
     * Access method for jobStatus.
     *
     * @return the current value of jobStatus
     */
    public String getJobStatus() {
        return jobStatus;
    }

    /**
     * Setter method for jobStatus.
     *
     * @param aJobStatus the new value for jobStatus
     */
    public void setJobStatus(String aJobStatus) {
        jobStatus = aJobStatus;
    }

    /**
     * Access method for mbshpDataJobsDetails.
     *
     * @return the current value of mbshpDataJobsDetails
     */
    public Set<MbshpDataJobsDetails> getMbshpDataJobsDetails() {
        return mbshpDataJobsDetails;
    }

    /**
     * Setter method for mbshpDataJobsDetails.
     *
     * @param aMbshpDataJobsDetails the new value for mbshpDataJobsDetails
     */
    public void setMbshpDataJobsDetails(Set<MbshpDataJobsDetails> aMbshpDataJobsDetails) {
        mbshpDataJobsDetails = aMbshpDataJobsDetails;
    }

    /**
     * Compares the key for this instance with another MbshpDataJobs.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class MbshpDataJobs and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof MbshpDataJobs)) {
            return false;
        }
        MbshpDataJobs that = (MbshpDataJobs) other;
        Object myJobId = this.getJobId();
        Object yourJobId = that.getJobId();
        if (myJobId==null ? yourJobId!=null : !myJobId.equals(yourJobId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another MbshpDataJobs.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof MbshpDataJobs)) return false;
        return this.equalKeys(other) && ((MbshpDataJobs)other).equalKeys(this);
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
        if (getJobId() == null) {
            i = 0;
        } else {
            i = getJobId().hashCode();
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
        StringBuffer sb = new StringBuffer("[MbshpDataJobs |");
        sb.append(" jobId=").append(getJobId());
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
        ret.put("jobId", getJobId());
        return ret;
    }

}
