package com.dayton.dolphin.test.entity;

import java.util.Date;

/**
 * Created by root on 17-2-6.
 */
public class ErpReportdetailImgtask {

    /** 1. VARCHAR2(100 BYTE) 主键 */
    private String id;
    /** 2. VARCHAR2(100 BYTE) erp_customer表ID */
    private String customerId;
    /** 3. VARCHAR2(100 BYTE) 条码 */
    private String code;
    /** 4. VARCHAR2(100 BYTE) 会员姓名 */
    private String userName;
    /** 5. NUMBER 会员电话 */
    private Integer phoneNo;
    /** 6. VARCHAR2(20 BYTE) 出生日期 */
    private String birthday;
    /** 7. NUMBER 图片生成状态,0:未生成;1：已生成 */
    private Integer state;
    /** 8. DATE 创建时间 */
    private Date createDate;
    /** 9. NUMBER 是否删除,0：有效;1：已删除 */
    private Integer isDelete;

}
