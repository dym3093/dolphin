package com.dayton.dolphin.test.entity;/**
 * Created by admin on 2016/11/28.
 */

import java.sql.Clob;
import java.util.Date;

/**
 * 原始报告信息表(金域)
 *
 * @author YoumingDeng
 * @create 2016-11-28 11:36
 */
public class ErpReportOrgJY {

    /** 1. ID VARCHAR2(32) */
    private String id;
    /** 2. 报告ID（来自金域） VARCHAR2(100) */
    private String reportId;
    /** 3. 报告名称 VARCHAR2(256) */
    private String reportName;
    /** 4. 条码(唯一的) VARCHAR2(256) */
    private String barcode;
    /** 5. 服务ID（团单号） VARCHAR2(256) */
    private String serviceId;
    /** 6. 远盟的场次号 VARCHAR2(256) */
    private String corServiceId;
    /** 7. 用户提交过来的corOwnerId VARCHAR2(256) */
    private String corOwnerId;
    /** 8. 姓名 VARCHAR2(256) */
    private String userName;
    /** 9. 电话 VARCHAR2(256) */
    private String phone;
    /** 10. 性别 VARCHAR2(32) */
    private String gender;
    /** 11. 生日 DATE */
    private Date birthday;
    /** 12. 年龄 NUMBER(3) */
    private Integer age;
    /** 13. 岁 VARCHAR2(32) */
    private String ageUnit;
    /** 14. 检测项目代码(单项+组合项) VARCHAR2(256) */
    private String itemCodes;
    /** 15. 采样时间(2006-01-02 15:04:05 -0700) VARCHAR2(128) */
    private String samplingAt;
    /** 16. 状态 NUMBER(3) */
    private Integer state;
    /** 17. 接受到报告时间 VARCHAR2(128) */
    private String entryAt;
    /** 18. 发布报告时间 VARCHAR2(128) */
    private String publishedAt;
    /** 19. "报告结果(原始报告单，实验室报告单) " VARCHAR2(1024) */
    private String rawResults;
    /** 20. 报告结果（JSON字符串） CLOB */
    private Clob results;
    /** 21. PDF的URL地址 VARCHAR2(512) */
    private String pdfUrl;
    /** 22. WAP版报告地址 VARCHAR2(512) */
    private String wapShowUrl;
    /** 23. WEB版报告地址 VARCHAR2(512) */
    private String webShowUrl;
    /** 24. 健康建议 CLOB */
    private Clob healthAdvice;
    /** 25. 血液结果解读(JSON字符串) CLOB */
    private Clob anomalyIndex;
    /** 26. 是否删除 0-否1-是 NUMBER */
    private Integer isDeleted;
    /** 27. 创建时间 DATE */
    private Date createTime;
    /** 28. 创建人ID VARCHAR2(100) */
    private String createId;
    /** 29. 创建人姓名 VARCHAR2(256) */
    private String createBy;
    /** 30. 修改时间 DATE */
    private Date updateTime;
    /** 31. 修改人ID VARCHAR2(100) */
    private String updateUserId;
    /** 32. 修改人姓名 VARCHAR2(256) */
    private String updateBy;
    /** 33. 状态 NUMBER */
    private Integer status;
    /** 34. 操作次数 NUMBER */
    private Integer counter;


}
