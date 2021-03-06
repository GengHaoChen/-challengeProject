package cn.start.utils;

import java.util.HashMap;

/**
 * Created by yoho8 on 2017/3/28.
 */
public enum  ResultInfo {
    SUCCESS(0,"返回成功"),INfO_EMPT(-1,"参数错误"),USER_PWD_ERROR(1,"用户名密码错误"),
    SYSTEM_ERROR(500,"系统错误");


    private int code;
    private String msg;

    ResultInfo(int code,String msg){

        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }


    public String getMsg() {
        return msg;
    }

}
