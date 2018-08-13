package com.hw.services;

import com.hw.biz.model.AccountTallyDO;

public interface AccountServices {

    /**
     * 入账
     * @param accountTallyDO
     */
    public void enterAccount(AccountTallyDO accountTallyDO);

}
