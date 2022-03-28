package edu.friday.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class SysRoleMenuPK implements Serializable {
    private long roleId;
    private long menuId;

    @Column(name = "role_id")
    @Id
    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    @Column(name = "menu_id")
    @Id
    public long getMenuId() {
        return menuId;
    }

    public void setMenuId(long menuId) {
        this.menuId = menuId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysRoleMenuPK that = (SysRoleMenuPK) o;

        if (roleId != that.roleId) return false;
        if (menuId != that.menuId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (roleId ^ (roleId >>> 32));
        result = 31 * result + (int) (menuId ^ (menuId >>> 32));
        return result;
    }
}
