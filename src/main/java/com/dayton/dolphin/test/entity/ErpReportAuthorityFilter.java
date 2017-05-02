package com.dayton.dolphin.test.entity;/**
 * Created by admin on 2016/12/6.
 */

import java.util.Date;

/**
 * 报告权限过滤表
 *
 * @author YoumingDeng
 * @since 2016-12-06 11:39
 */
public class ErpReportAuthorityFilter {
    /** 1. ID VARCHAR2(32) */
    private String id;
    /** 2. 项目编号 VARCHAR2(256) */
    private String projectNo;
    /** 3. 过滤条件，0推送，1不推送 VARCHAR2(128) */
    private String filterNo;
    /** 4. 预留字段 VARCHAR2(1024) */
    private String reserve1;
    /** 5. 预留字段 VARCHAR2(1024) */
    private String reserve2;
    /** 6. 预留字段 VARCHAR2(1024) */
    private String reserve3;
    /** 7. 预留字段 VARCHAR2(1024) */
    private String reserve4;
    /** 8. 是否删除,0不删除,1删除 NUMBER */
    private Integer isDeleted;
    /** 9. 备注 VARCHAR2(1024) */
    private String remark;
    /** 10. 创建时间 DATE */
    private Date createTime;
    /** 11. 创建人ID VARCHAR2(100) */
    private String createUserId;
    /** 12. 创建人姓名 VARCHAR2(256) */
    private String createUser;
    /** 13. 修改时间 DATE */
    private Date updateTime;
    /** 14. 修改人ID VARCHAR2(100) */
    private String updateUserId;
    /** 15. 修改人姓名 VARCHAR2(256) */
    private String updateUser;
    /** 16. 其他状态 NUMBER */
    private Integer status;

}
