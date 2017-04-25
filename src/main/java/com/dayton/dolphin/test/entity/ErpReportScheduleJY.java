package com.dayton.dolphin.test.entity;/**
 * Created by admin on 2016/11/29.
 */

import java.util.Date;

/**
 * 定时获取报告任务表(金域)
 *
 * @author YoumingDeng
 * @create 2016-11-29 15:33
 */
public class ErpReportScheduleJY{

    /** 1. ID VARCHAR2(32) */
    private String id;
    /** 2. ERP_REPORT_ORG_JY表ID VARCHAR2(32) */
    private String idRelated;
    /** 3. 条形码 VARCHAR2(256) */
    private String code;
    /** 4. 姓名 VARCHAR2(256) */
    private String name;
    /** 5. 身份证号/证件号 VARCHAR2(256) */
    private String idNo;
    /** 6. 性别 VARCHAR2(32) */
    private String gender;
    /** 7. 生日 DATE */
    private Date birthday;
    /** 8. 电话 VARCHAR2(256) */
    private String phone;
    /** 9. 套餐名 VARCHAR2(256) */
    private String combo;
    /** 10. 场次号 VARCHAR2(256) */
    private String eventsNo;
    /** 11. 批次号 VARCHAR2(256) */
    private String batchNo;
    /** 12. 团单号(对应金域serviceId) VARCHAR2(256) */
    private String groupOrderNo;
    /** 13. 报告ID（来自金域） VARCHAR2(100) */
    private String reportId;
    /** 14. 报告名称 VARCHAR2(256) */
    private String reportName;
    /** 15. 采样日期 DATE */
    private Date samplingDate;
    /** 16. 接受到报告日期 DATE */
    private Date entryDate;
    /** 17. 发布报告时间 DATE */
    private Date publishedDate;
    /** 18. 备注 VARCHAR2(1024) */
    private String remark;
    /** 19. 是否删除 0-否1-是 NUMBER */
    private Integer isDeleted;
    /** 20. 创建时间 DATE */
    private Date createTime;
    /** 21. 创建人ID VARCHAR2(100) */
    private String createUserId;
    /** 22. 创建人姓名 VARCHAR2(256) */
    private String createUserName;
    /** 23. 修改时间 DATE */
    private Date updateTime;
    /** 24. 修改人ID VARCHAR2(100) */
    private String updateUserId;
    /** 25. 修改人姓名 VARCHAR2(256) */
    private String updateUserName;
    /** 26. 状态(0:未完成，1：已完成) NUMBER */
    private Integer status;
    /** 27. 操作次数 NUMBER */
    private Integer counter;

}


