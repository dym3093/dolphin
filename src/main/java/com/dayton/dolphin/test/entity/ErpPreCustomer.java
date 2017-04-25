package com.dayton.dolphin.test.entity;

import java.util.Date;

/**
 * Created by root on 16-12-28.
 */
public class ErpPreCustomer {

    /**
     * 1 .	VARCHAR2(32 BYTE) 主键id
     */
    private String id;
    /**
     * 2 .	VARCHAR2(200 BYTE) 投保人姓名
     */
    private String applicantName;
    /**
     * 3 .	VARCHAR2(200 BYTE) 投保人身份证号
     */
    private String applicantIdcard;
    /**
     * 4 .	VARCHAR2(100 BYTE) 投保人手机号
     */
    private String applicantPhone;
    /**
     * 5 .	VARCHAR2(10 BYTE) 投保人性别
     */
    private String applicantSex;
    /**
     * 6 .	VARCHAR2(200 BYTE) 投保人年龄
     */
    private String applicantAge;
    /**
     * 7 .	VARCHAR2(200 BYTE) 被检人姓名
     */
    private String wereName;
    /**
     * 8 .	VARCHAR2(200 BYTE) 被检人身份证号
     */
    private String wereIdcard;
    /**
     * 9 .	VARCHAR2(100 BYTE) 被检人手机号
     */
    private String werePhone;
    /**
     * 10 .	VARCHAR2(10 BYTE) 被检人性别
     */
    private String wereSex;
    /**
     * 11 .	VARCHAR2(200 BYTE) 被检人年龄
     */
    private String wereAge;
    /**
     * 12 .	VARCHAR2(200 BYTE) 检测盒邮寄地址
     */
    private String checkboxEmilAddr;
    /**
     * 13 .	VARCHAR2(200 BYTE) 报告寄送地址
     */
    private String reportSendAddr;
    /**
     * 14 .	VARCHAR2(200 BYTE) 检测套餐
     */
    private String checkCobmo;
    /**
     * 15 .	VARCHAR2(200 BYTE) 保单号
     */
    private String numPolicy;
    /**
     * 16 .	DATE 订单生成日期
     */
    private Date orderCreateDate;
    /**
     * 17 .	VARCHAR2(200 BYTE) 备注
     */
    private String remark;
    /**
     * 18 .	VARCHAR2(200 BYTE) 场次号
     */
    private String eventsNo;
    /**
     * 19 .	VARCHAR2(200 BYTE) 被检人身高
     */
    private String wereHeight;
    /**
     * 20 .	VARCHAR2(200 BYTE) 体重
     */
    private String wereWeight;
    /**
     * 21 .	VARCHAR2(200 BYTE) 家族病史
     */
    private String familyHistory;
    /**
     * 22 .	VARCHAR2(200 BYTE) 既往病史
     */
    private String customerHistory;
    /**
     * 23 .	VARCHAR2(200 BYTE) 报告接收人姓名
     */
    private String reportReceiveName;
    /**
     * 24 .	VARCHAR2(200 BYTE) 电话
     */
    private String phone;
    /**
     * 25 .	VARCHAR2(100 BYTE) 地址
     */
    private String address;
    /**
     * 26 .	DATE 创建日期
     */
    private Date createTime;
    /**
     * 27 .	VARCHAR2(32 BYTE) 创建人
     */
    private String createUserId;
    /**
     * 28 .	DATE 修改日期
     */
    private Date updateTime;
    /**
     * 29 .	VARCHAR2(32 BYTE) 修改人
     */
    private String updateUserId;
    /**
     * 30 .	VARCHAR2(32 BYTE) 条码
     */
    private String code;
    /**
     * 31 .	VARCHAR2(32 BYTE) ERP_CUSTOMER表的ID
     */
    private String erpCustomerId;
    /**
     * 32.     VARCAHR2(32 BYTE) 申请单号ID, 表(erp_application)
     */
    private String erpApplicationId;

    private String ymCombo; //远盟套餐;
    private String emsNumber; //快递单号;   create by henry.xu 20170117
    private String companyId; //支公司ID;  create by henry.xu 20170118
    private String shipPorId;  // 项目id;  create by henry.xu 20170118

    private String batchNo;        //批次号(修改版，增加批次号); add by leslieTong. 2017-2-13

    private Integer statusYm;    //客户状态(修改版); add by leslieTong. 2017-2-14

    /* 平安新增字段  */
    /**
     * 履约单号（客户订单号）
     **/
    private String performNo;

    /**
     * 套餐详细检测项
     */
    private String detailedTestItem;

    /**
     * 履约单状态 （2：申请中；  4：检测中；  5：检测失败；  6：完成；）
     */
    private String performStatus;

    /**
     * 检测失败原因
     */
    private String checkFailCaus;

    /**
     * 对方系统报告名称
     */
    private String systemReportName;

    /**
     * 确认受检时间
     */
    private Date confirmCaryTime;

    /**
     * 上传报告时间
     */
    private Date uploadReportTime;

    /* 监护人信息 */
    /**
     * 监护人姓名
     */
    private String guardianName;
    /**
     * 关系
     */
    private String relationship;

    /**
     * 报告地址
     */
    private String filePath;

}
