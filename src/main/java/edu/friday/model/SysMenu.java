package edu.friday.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "sys_menu", schema = "friday", catalog = "")
public class SysMenu {
    private Long id;
    private long menuId;
    private String menuName;
    private Long parentId;
    private Integer orderNum;
    private String path;
    private String component;
    private Integer isFrame;
    private String menuType;
    private String visible;
    private String perms;
    private String icon;
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
    @Column(name = "menu_id")
    public long getMenuId() {
        return menuId;
    }

    public void setMenuId(long menuId) {
        this.menuId = menuId;
    }

    @Basic
    @Column(name = "menu_name")
    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    @Basic
    @Column(name = "parent_id")
    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    @Basic
    @Column(name = "order_num")
    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    @Basic
    @Column(name = "path")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Basic
    @Column(name = "component")
    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    @Basic
    @Column(name = "is_frame")
    public Integer getIsFrame() {
        return isFrame;
    }

    public void setIsFrame(Integer isFrame) {
        this.isFrame = isFrame;
    }

    @Basic
    @Column(name = "menu_type")
    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }

    @Basic
    @Column(name = "visible")
    public String getVisible() {
        return visible;
    }

    public void setVisible(String visible) {
        this.visible = visible;
    }

    @Basic
    @Column(name = "perms")
    public String getPerms() {
        return perms;
    }

    public void setPerms(String perms) {
        this.perms = perms;
    }

    @Basic
    @Column(name = "icon")
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
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

        SysMenu sysMenu = (SysMenu) o;

        if (menuId != sysMenu.menuId) return false;
        if (menuName != null ? !menuName.equals(sysMenu.menuName) : sysMenu.menuName != null) return false;
        if (parentId != null ? !parentId.equals(sysMenu.parentId) : sysMenu.parentId != null) return false;
        if (orderNum != null ? !orderNum.equals(sysMenu.orderNum) : sysMenu.orderNum != null) return false;
        if (path != null ? !path.equals(sysMenu.path) : sysMenu.path != null) return false;
        if (component != null ? !component.equals(sysMenu.component) : sysMenu.component != null) return false;
        if (isFrame != null ? !isFrame.equals(sysMenu.isFrame) : sysMenu.isFrame != null) return false;
        if (menuType != null ? !menuType.equals(sysMenu.menuType) : sysMenu.menuType != null) return false;
        if (visible != null ? !visible.equals(sysMenu.visible) : sysMenu.visible != null) return false;
        if (perms != null ? !perms.equals(sysMenu.perms) : sysMenu.perms != null) return false;
        if (icon != null ? !icon.equals(sysMenu.icon) : sysMenu.icon != null) return false;
        if (createBy != null ? !createBy.equals(sysMenu.createBy) : sysMenu.createBy != null) return false;
        if (createTime != null ? !createTime.equals(sysMenu.createTime) : sysMenu.createTime != null) return false;
        if (updateBy != null ? !updateBy.equals(sysMenu.updateBy) : sysMenu.updateBy != null) return false;
        if (updateTime != null ? !updateTime.equals(sysMenu.updateTime) : sysMenu.updateTime != null) return false;
        if (remark != null ? !remark.equals(sysMenu.remark) : sysMenu.remark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (menuId ^ (menuId >>> 32));
        result = 31 * result + (menuName != null ? menuName.hashCode() : 0);
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        result = 31 * result + (orderNum != null ? orderNum.hashCode() : 0);
        result = 31 * result + (path != null ? path.hashCode() : 0);
        result = 31 * result + (component != null ? component.hashCode() : 0);
        result = 31 * result + (isFrame != null ? isFrame.hashCode() : 0);
        result = 31 * result + (menuType != null ? menuType.hashCode() : 0);
        result = 31 * result + (visible != null ? visible.hashCode() : 0);
        result = 31 * result + (perms != null ? perms.hashCode() : 0);
        result = 31 * result + (icon != null ? icon.hashCode() : 0);
        result = 31 * result + (createBy != null ? createBy.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateBy != null ? updateBy.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }
}
