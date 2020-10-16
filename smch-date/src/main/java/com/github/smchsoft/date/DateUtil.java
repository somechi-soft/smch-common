package com.github.smchsoft.date;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {

    public static Date today(){
        return Calendar.getInstance().getTime();
    }
}
