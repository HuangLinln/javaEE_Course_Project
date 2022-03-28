package edu.friday.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "sys_role", schema = "friday", catalog = "")
public class SysRole {
    private Long id;
    private long roleId;
    private String roleName;
    private String roleKey;
    private int roleSort;
    private String dataScope;
    private String status;
    private String delFlag;
    private String createBy;
    private Timestamp createTime;
    private String updateBy;
    private Timestamp updateTime;
    private String remark;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @Column(name = "role_id")
    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    @Basic
    @Column(name = "role_name")
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Basic
    @Column(name = "role_key")
    public String getRoleKey() {
        return roleKey;
    }

    public void setRoleKey(String roleKey) {
        this.roleKey = roleKey;
    }

    @Basic
    @Column(name = "role_sort")
    public int getRoleSort() {
        return roleSort;
    }

    public void setRoleSort(int roleSort) {
        this.roleSort = roleSort;
    }

    @Basic
    @Column(name = "data_scope")
    public String getDataScope() {
        return dataScope;
    }

    public void setDataScope(String dataScope) {
        this.dataScope = dataScope;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "del_flag")
    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    @Basic
    @Column(name = "create_by")
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    @Basic
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "update_by")
    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    @Basic
    @Column(name = "update_time")
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysRole sysRole = (SysRole) o;

        if (roleId != sysRole.roleId) return false;
        if (roleSort != sysRole.roleSort) return false;
        if (roleName != null ? !roleName.equals(sysRole.roleName) : sysRole.roleName != null) return false;
        if (roleKey != null ? !roleKey.equals(sysRole.roleKey) : sysRole.roleKey != null) return false;
        if (dataScope != null ? !dataScope.equals(sysRole.dataScope) : sysRole.dataScope != null) return false;
        if (status != null ? !status.equals(sysRole.status) : sysRole.status != null) return false;
        if (delFlag != null ? !delFlag.equals(sysRole.delFlag) : sysRole.delFlag != null) return false;
        if (createBy != null ? !createBy.equals(sysRole.createBy) : sysRole.createBy != null) return false;
        if (createTime != null ? !createTime.equals(sysRole.createTime) : sysRole.createTime != null) return false;
        if (updateBy != null ? !updateBy.equals(sysRole.updateBy) : sysRole.updateBy != null) return false;
        if (updateTime != null ? !updateTime.equals(sysRole.updateTime) : sysRole.updateTime != null) return false;
        if (remark != null ? !remark.equals(sysRole.remark) : sysRole.remark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (roleId ^ (roleId >>> 32));
        result = 31 * result + (roleName != null ? roleName.hashCode() : 0);
        result = 31 * result + (roleKey != null ? roleKey.hashCode() : 0);
        result = 31 * result + roleSort;
        result = 31 * result + (dataScope != null ? dataScope.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (delFlag != null ? delFlag.hashCode() : 0);
        result = 31 * result + (createBy != null ? createBy.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateBy != null ? updateBy.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }
}
