package edu.friday.common.base;

import java.sql.Timestamp;

// BaseModel对于多个实体类中共有属性的封装
// Lombok标志BaseModel类
public class BaseModel {
    private String createBy;
    private Timestamp createTime;
    private String updateBy;
    private Timestamp updateTime;
    private String remark;
}
