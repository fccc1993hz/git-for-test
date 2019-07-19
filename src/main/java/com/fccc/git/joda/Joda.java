package com.fccc.git.joda;

import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;

/**
 * Created by fccc on 2019/5/22
 */
public class Joda {
    public static void main(String[] args) {
        DateTime dateTime = new DateTime();
        System.out.println(dateTime.toDate());
        DateTime dateTime1 = DateTime.now();
        System.out.println(dateTime1.toDate());
        DateTime dateTime2 = new DateTime(2000, 1, 2, 3, 4, 5, 6);
        System.out.println(dateTime2.toDate());
        DateTime dateTime3 = new DateTime(2000, 1, 2, 3, 4, 5);
        System.out.println(dateTime3.toDate());
        DateTime dateTime4 = new DateTime(2000, 1, 2, 3, 4);
        System.out.println(dateTime4.toDate());
        DateTime dateTime5 = dateTime2.plusYears(1).plusMonths(1).plusDays(1).plusHours(1).plusMinutes(1).plusSeconds(1).plusMillis(1);
        System.out.println(dateTime5.toDate());
        DateTime dateTime6 = dateTime2.withYear(2008).withMonthOfYear(8).withDayOfMonth(8).withHourOfDay(8).withMinuteOfHour(8).withSecondOfMinute(8).withMillisOfSecond(8);
        System.out.println(dateTime6.toDate());
        int year = dateTime2.getYear();
        int month = dateTime2.getMonthOfYear();
        int day = dateTime2.getDayOfMonth();
        int hour = dateTime2.getHourOfDay();
        int minute = dateTime2.getMinuteOfHour();
        int second = dateTime2.getSecondOfMinute();
        int milis = dateTime2.getMillisOfSecond();
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        System.out.println(hour);
        System.out.println(minute);
        System.out.println(second);
        System.out.println(milis);
        boolean b = dateTime6.isAfterNow();
        System.out.println(b);
        boolean b1 = dateTime6.isBeforeNow();
        System.out.println(b1);
        DateTime dateTime7 = dateTime6.withTimeAtStartOfDay();
        System.out.println(dateTime7.toDate());

        DateTime dateTime8=dateTime7.property(DateTimeFieldType.monthOfYear()).withMaximumValue()
                .property(DateTimeFieldType.dayOfMonth()).withMaximumValue().property(DateTimeFieldType.hourOfDay()).withMaximumValue()
                .property(DateTimeFieldType.minuteOfHour()).withMinimumValue().property(DateTimeFieldType.secondOfMinute()).withMinimumValue();
        System.out.println(dateTime8.toDate());


    }
}
