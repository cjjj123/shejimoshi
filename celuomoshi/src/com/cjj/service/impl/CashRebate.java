package com.cjj.service.impl;

import com.cjj.service.CashSuper;

/**
 * 打折收费
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/2/22
 * Time:11:46
 */
public class CashRebate extends CashSuper {
    @Override
    public double accecptCash(double money) {
        System.out.println("打折收费");
        return 0;
    }
}
