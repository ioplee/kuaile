package com.hw.services.utils.impl;/**
 * Created by robin on 2019/5/27.
 */

import com.hw.bean.DTO.player.SendVeryCodeDTO;
import com.hw.services.utils.VerificatioCodeService;
import com.hw.utils.BaseResultDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: Robin
 * @create: 2019-05-27 17:14
 * @description: 短信验证码Service 实现类
 **/

@Service
@Slf4j
@Transactional
public class VerificatioCodeServiceImpl implements VerificatioCodeService {

    @Autowired


    @Override
    public BaseResultDTO sendCode(SendVeryCodeDTO sendVeryCodeDTO) {
        BaseResultDTO resultDTO = new BaseResultDTO();
        try {

        }catch (Exception e){
            log.error("#VerificatioCodeServiceImpl called sendCode error#",e);
            resultDTO.setResultCode("0");
            resultDTO.setSuccess(false);
            resultDTO.setErrorDetail("发送短信验证码失败");
        }
        return null;
    }
}
