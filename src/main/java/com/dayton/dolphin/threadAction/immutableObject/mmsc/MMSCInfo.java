package com.dayton.dolphin.threadAction.immutableObject.mmsc;

/**
 * 彩信中心信息
 * Created by bruce on 17-6-1.
 */
public final class MMSCInfo {

    /**
     * 设备编号
     */
    private final String deviceID;
    /**
     * 彩信中心URL
     */
    private final String url;
    /**
     * 彩信中心允许的最大附件值大小
     */
    private final int maxAttachmentSizeInBytes;

    public MMSCInfo(String deviceID, String url, int maxAttachmentSizeInBytes) {
        this.deviceID = deviceID;
        this.url = url;
        this.maxAttachmentSizeInBytes = maxAttachmentSizeInBytes;
    }

    public MMSCInfo(MMSCInfo prototype) {
        this.deviceID = prototype.deviceID;
        this.url = prototype.url;
        this.maxAttachmentSizeInBytes = prototype.maxAttachmentSizeInBytes;
    }

    public String getDeviceID() {
        return deviceID;
    }

    public String getUrl() {
        return url;
    }

    public int getMaxAttachmentSizeInBytes() {
        return maxAttachmentSizeInBytes;
    }

    @Override
    public String toString() {
        return "MMSCInfo{" +
                "deviceID='" + deviceID + '\'' +
                ", url='" + url + '\'' +
                ", maxAttachmentSizeInBytes=" + maxAttachmentSizeInBytes +
                '}';
    }

}
