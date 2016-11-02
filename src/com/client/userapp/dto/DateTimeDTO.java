/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.client.userapp.dto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Giang
 */
public class DateTimeDTO {
    private static final SimpleDateFormat FMT = new SimpleDateFormat(getPropertyValueByKey("date_format"));
    private DateTimeDTO(){}
    
    public static Date toDate(String date) throws ParseException {
        return FMT.parse(date);
    }
    
    public static long toLong(String date) throws ParseException {
        return FMT.parse(date).getTime();
    }
    
    public static String fromLong(long time) {
        return FMT.format(new Date(time));
    }
    
    public static String fromDate(Date d) {
        return FMT.format(d);
    }

    private static String getPropertyValueByKey(java.lang.String propertyKey) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.getPropertyValueByKey(propertyKey);
    }
}
