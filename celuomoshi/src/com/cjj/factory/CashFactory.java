package com.cjj.factory;

import com.cjj.service.CashSuper;
import com.cjj.service.impl.CashNormal;
import com.cjj.service.impl.CashRebate;
import com.cjj.service.impl.CashReturn;

/**
 * 工厂
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/2/23
 * Time:10:27
 */
public class CashFactory {


    public static CashSuper createCashAccept(String type){
        CashSuper cs = null;
        switch (type){
            case "1":
                cs = new CashNormal();
                break;
            case "2":
                cs = new CashReturn();
                break;
            case "3":
                cs = new CashRebate();
                break;
        }
        return  cs;
    }

}
