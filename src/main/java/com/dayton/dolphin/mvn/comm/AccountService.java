package com.dayton.dolphin.mvn.comm;

import com.dayton.dolphin.mvn.account.entity.SignUpRequest;

/**
 * Created by root on 17-1-10.
 */
public interface AccountService {

    String generateCaptchaKey();

    String generateCaptchaImage(String captchaKey);

    Boolean signUp(SignUpRequest signUpRequest);

    String activate(String activationNumber);

    Boolean login(String id, String password);

}
