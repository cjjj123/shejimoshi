package com.cjj;

import com.cjj.factory.CashFactory;
import com.cjj.service.CashSuper;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/2/22
 * Time:10:42
 */
public class Demo {

    public static void main(String[] args) {
        CashSuper cashSuper = CashFactory.createCashAccept("3");
        cashSuper.accecptCash(0d);
    }
}
