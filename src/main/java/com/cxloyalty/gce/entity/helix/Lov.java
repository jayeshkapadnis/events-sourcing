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
@Table(name="lov", indexes={@Index(name="lov_name_IX", columnList="name", unique=true)})
public class Lov implements Serializable {

    /** Primary key. */
    protected static final String PK = "lovSysid";

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
    @Column(name="lov_sysid", unique=true, nullable=false, precision=9)
    private BigDecimal lovSysid;
    @Column(unique=true, nullable=false, length=100)
    private String name;
    @Column(nullable=false, length=500)
    private String description;
    @Column(name="add_date", nullable=false)
    private Timestamp addDate;
    @Column(name="add_username", nullable=false, length=50)
    private String addUsername;
    @Column(name="update_date", nullable=false)
    private Timestamp updateDate;
    @Column(name="update_username", nullable=false, length=50)
    private String updateUsername;
    @OneToMany(mappedBy="lov2")
    private Set<Lov> lov3;
    @ManyToOne
    @JoinColumn(name="parent_lov_sysid")
    private Lov lov2;
    @OneToMany(mappedBy="lov")
    private Set<LovValue> lovValue;

    /** Default constructor. */
    public Lov() {
        super();
    }

    /**
     * Access method for lovSysid.
     *
     * @return the current value of lovSysid
     */
    public BigDecimal getLovSysid() {
        return lovSysid;
    }

    /**
     * Setter method for lovSysid.
     *
     * @param aLovSysid the new value for lovSysid
     */
    public void setLovSysid(BigDecimal aLovSysid) {
        lovSysid = aLovSysid;
    }

    /**
     * Access method for name.
     *
     * @return the current value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for name.
     *
     * @param aName the new value for name
     */
    public void setName(String aName) {
        name = aName;
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
     * Access method for addDate.
     *
     * @return the current value of addDate
     */
    public Timestamp getAddDate() {
        return addDate;
    }

    /**
     * Setter method for addDate.
     *
     * @param aAddDate the new value for addDate
     */
    public void setAddDate(Timestamp aAddDate) {
        addDate = aAddDate;
    }

    /**
     * Access method for addUsername.
     *
     * @return the current value of addUsername
     */
    public String getAddUsername() {
        return addUsername;
    }

    /**
     * Setter method for addUsername.
     *
     * @param aAddUsername the new value for addUsername
     */
    public void setAddUsername(String aAddUsername) {
        addUsername = aAddUsername;
    }

    /**
     * Access method for updateDate.
     *
     * @return the current value of updateDate
     */
    public Timestamp getUpdateDate() {
        return updateDate;
    }

    /**
     * Setter method for updateDate.
     *
     * @param aUpdateDate the new value for updateDate
     */
    public void setUpdateDate(Timestamp aUpdateDate) {
        updateDate = aUpdateDate;
    }

    /**
     * Access method for updateUsername.
     *
     * @return the current value of updateUsername
     */
    public String getUpdateUsername() {
        return updateUsername;
    }

    /**
     * Setter method for updateUsername.
     *
     * @param aUpdateUsername the new value for updateUsername
     */
    public void setUpdateUsername(String aUpdateUsername) {
        updateUsername = aUpdateUsername;
    }

    /**
     * Access method for lov3.
     *
     * @return the current value of lov3
     */
    public Set<Lov> getLov3() {
        return lov3;
    }

    /**
     * Setter method for lov3.
     *
     * @param aLov3 the new value for lov3
     */
    public void setLov3(Set<Lov> aLov3) {
        lov3 = aLov3;
    }

    /**
     * Access method for lov2.
     *
     * @return the current value of lov2
     */
    public Lov getLov2() {
        return lov2;
    }

    /**
     * Setter method for lov2.
     *
     * @param aLov2 the new value for lov2
     */
    public void setLov2(Lov aLov2) {
        lov2 = aLov2;
    }

    /**
     * Access method for lovValue.
     *
     * @return the current value of lovValue
     */
    public Set<LovValue> getLovValue() {
        return lovValue;
    }

    /**
     * Setter method for lovValue.
     *
     * @param aLovValue the new value for lovValue
     */
    public void setLovValue(Set<LovValue> aLovValue) {
        lovValue = aLovValue;
    }

    /**
     * Compares the key for this instance with another Lov.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Lov and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Lov)) {
            return false;
        }
        Lov that = (Lov) other;
        Object myLovSysid = this.getLovSysid();
        Object yourLovSysid = that.getLovSysid();
        if (myLovSysid==null ? yourLovSysid!=null : !myLovSysid.equals(yourLovSysid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Lov.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Lov)) return false;
        return this.equalKeys(other) && ((Lov)other).equalKeys(this);
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
        if (getLovSysid() == null) {
            i = 0;
        } else {
            i = getLovSysid().hashCode();
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
        StringBuffer sb = new StringBuffer("[Lov |");
        sb.append(" lovSysid=").append(getLovSysid());
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
        ret.put("lovSysid", getLovSysid());
        return ret;
    }

}
