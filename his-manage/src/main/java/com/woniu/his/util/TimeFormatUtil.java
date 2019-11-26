package com.woniu.his.util;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/*时间类型转换*/
public class TimeFormatUtil {

    /*按时间日期类型*/
    public static String getDateString(Date date){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str=simpleDateFormat.format(date).toString();
        System.out.println(str);
        return str;
    }
}
