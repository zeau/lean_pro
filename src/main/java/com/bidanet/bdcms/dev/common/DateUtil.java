package com.bidanet.bdcms.dev.common;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Administrator on 2017/1/2.
 */
public class DateUtil {

    /**
     * 获取年
     * @param dateTime
     * @return
     */
    public static Integer getYearFromDate(Long dateTime){
        Calendar calendar=Calendar.getInstance();
        Date date=new Date(dateTime);
        calendar.setTime(date);
       return  calendar.get(Calendar.YEAR);

    }

    /**
     * 获取月
     * @param dateTime
     * @return
     */
    public static Integer getMonthFromDate(Long dateTime){
        Calendar calendar=Calendar.getInstance();
        Date date=new Date(dateTime);
        calendar.setTime(date);
        return  calendar.get(Calendar.MONTH)+1;
    }

    /**
     * 获取日
     * @param dateTime
     * @return
     */
    public static Integer getDayFromDate(Long dateTime){
        Calendar calendar=Calendar.getInstance();
        Date date=new Date(dateTime);
        calendar.setTime(date);
        return  calendar.get(Calendar.DAY_OF_MONTH);
    }



}
