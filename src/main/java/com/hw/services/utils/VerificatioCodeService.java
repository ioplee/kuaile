package com.hw.services.utils;

import com.hw.bean.DTO.player.SendVeryCodeDTO;
import com.hw.utils.BaseResultDTO;

/**
 * Created by robin on 2019/5/27.
 */
public interface VerificatioCodeService {

    /**
     * Send code base result dto.   发送短信验证码
     *
     * @param sendVeryCodeDTO the send very code dto
     * @return the base result dto
     */
    public BaseResultDTO sendCode(SendVeryCodeDTO sendVeryCodeDTO);
}
