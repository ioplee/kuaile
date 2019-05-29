package com.hw.dao;

import com.hw.bean.PO.VerificationCodePO;

/**
 * Created by robin on 2019/5/27.
 */
public interface VerificationCodeDAO {

    /**
     * Add send record integer.     发送短信验证码(入库操作)
     *
     * @param verificationCodePO the verification code po
     * @return the integer
     */
    public Integer addSendRecord(VerificationCodePO verificationCodePO);
}
