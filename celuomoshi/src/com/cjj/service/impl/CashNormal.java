package com.cjj.service.impl;

import com.cjj.service.CashSuper;

/**
 * 正常收费
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/2/22
 * Time:11:01
 */
public class CashNormal extends CashSuper {

    @Override
    public double accecptCash(double money) {
        System.out.println("正常收费");
        return 0;
    }
}
