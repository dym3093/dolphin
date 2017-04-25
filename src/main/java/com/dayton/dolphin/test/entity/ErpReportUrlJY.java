package com.dayton.dolphin.test.entity;/**
 * Created by admin on 2016/11/29.
 */

import java.util.Date;

/**
 * 报告URL地址信息表(ERP_REPORT_SCHEDULE_JY的从表)
 *
 * @author YoumingDeng
 * @create 2016-11-29 17:41
 */
public class ErpReportUrlJY {
    /** 1. ID VARCHAR2(32) */
    private String id;
    /** 2. ERP_REPORT_SCHEDULE_JY表ID VARCHAR2(32) */
    private String idRelated;
    /** 3. 条形码 VARCHAR2(256) */
    private String code;
    /** 4. 姓名 VARCHAR2(256) */
    private String name;
    /** 5. 电话 VARCHAR2(256) */
    private String phone;
    /** 6. 文件类型 VARCHAR2(128) */
    private String fileType;
    /** 7. 报告URL地址 VARCHAR2(512) */
    private String url;
    /** 8. HTTP状态码（200，500等） NUMBER */
    private Integer httpCode;
    /** 9. 是否删除 ：0-否，1-是 NUMBER */
    private Integer isDeleted;
    /** 10. 创建时间 DATE */
    private Date createTime;
    /** 11. 创建人ID VARCHAR2(100) */
    private String createUserId;
    /** 12. 创建人姓名 VARCHAR2(256) */
    private String createUserName;
    /** 13. 修改时间 DATE */
    private Date updateTime;
    /** 14. 修改人ID VARCHAR2(100) */
    private String updateUserId;
    /** 15. 修改人姓名 VARCHAR2(256) */
    private String updateUserName;
    /** 16. 状态(0:未完成，1：已完成) NUMBER */
    private Integer status;
    /** 17. 操作次数 NUMBER */
    private Integer counter;

}
