package com.cjj;

import com.cjj.service.CashSuper;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/3/4
 * Time:16:57
 */
public class CashContext {

    private CashSuper cs;

    public CashContext(CashSuper cashSuper){
        this.cs = cashSuper;
    }

    public void getResult(double money){
        cs.accecptCash(money);
    }
}
