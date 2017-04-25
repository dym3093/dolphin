package com.dayton.dolphin.mvn.account.entity;

/**
 * Created by root on 17-1-10.
 */
public class SignUpRequest {

    private String id;
    private String email;
    private String displayName;
    private String password;
    private String confirmPassword;
    private String captchaKey;
    private String captchaValue;

    public SignUpRequest() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getCaptchaKey() {
        return captchaKey;
    }

    public void setCaptchaKey(String captchaKey) {
        this.captchaKey = captchaKey;
    }

    public String getCaptchaValue() {
        return captchaValue;
    }

    public void setCaptchaValue(String captchaValue) {
        this.captchaValue = captchaValue;
    }

    @Override
    public String toString() {
        return "SignUpRequest{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", displayName='" + displayName + '\'' +
                ", password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                ", captchaKey='" + captchaKey + '\'' +
                ", captchaValue='" + captchaValue + '\'' +
                '}';
    }
}

