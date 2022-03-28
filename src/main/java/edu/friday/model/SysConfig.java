package edu.friday.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "sys_config", schema = "friday", catalog = "")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class SysConfig {
    //    private Long id;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int configId;
    private String configName;
    private String configKey;
    private String configValue;
    private String configType;
    private String createBy;
    private Timestamp createTime;
    private String updateBy;
    private Timestamp updateTime;
    private String remark;

/*    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @Column(name = "config_id")
    public int getConfigId() {
        return configId;
    }

    public void setConfigId(int configId) {
        this.configId = configId;
    }

    @Basic
    @Column(name = "config_name")
    public String getConfigName() {
        return configName;
    }

    public void setConfigName(String configName) {
        this.configName = configName;
    }

    @Basic
    @Column(name = "config_key")
    public String getConfigKey() {
        return configKey;
    }

    public void setConfigKey(String configKey) {
        this.configKey = configKey;
    }

    @Basic
    @Column(name = "config_value")
    public String getConfigValue() {
        return configValue;
    }

    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }

    @Basic
    @Column(name = "config_type")
    public String getConfigType() {
        return configType;
    }

    public void setConfigType(String configType) {
        this.configType = configType;
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

        SysConfig sysConfig = (SysConfig) o;

        if (configId != sysConfig.configId) return false;
        if (configName != null ? !configName.equals(sysConfig.configName) : sysConfig.configName != null) return false;
        if (configKey != null ? !configKey.equals(sysConfig.configKey) : sysConfig.configKey != null) return false;
        if (configValue != null ? !configValue.equals(sysConfig.configValue) : sysConfig.configValue != null)
            return false;
        if (configType != null ? !configType.equals(sysConfig.configType) : sysConfig.configType != null) return false;
        if (createBy != null ? !createBy.equals(sysConfig.createBy) : sysConfig.createBy != null) return false;
        if (createTime != null ? !createTime.equals(sysConfig.createTime) : sysConfig.createTime != null) return false;
        if (updateBy != null ? !updateBy.equals(sysConfig.updateBy) : sysConfig.updateBy != null) return false;
        if (updateTime != null ? !updateTime.equals(sysConfig.updateTime) : sysConfig.updateTime != null) return false;
        if (remark != null ? !remark.equals(sysConfig.remark) : sysConfig.remark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = configId;
        result = 31 * result + (configName != null ? configName.hashCode() : 0);
        result = 31 * result + (configKey != null ? configKey.hashCode() : 0);
        result = 31 * result + (configValue != null ? configValue.hashCode() : 0);
        result = 31 * result + (configType != null ? configType.hashCode() : 0);
        result = 31 * result + (createBy != null ? createBy.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateBy != null ? updateBy.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }*/
}
