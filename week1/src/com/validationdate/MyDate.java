package com.validationdate;

public class MyDate {
    private int day;
    private int month;
    private int year;

    private String result;
    private boolean isvalid;
    private boolean isleapyear;

    public MyDate(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
        isvalid = true;
        isleapyear = false;
    }

    public boolean isLeapYear(int year)
    {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
        {
            isleapyear = true;
        }
        return (isleapyear);
    }

    public boolean checkValidDate(int day, int month, int year)
    {
        isleapyear = isLeapYear(year);

        if(day < 1 || 31 < day)
        {
            isvalid = false;
        }
        if(month < 1 || 12 < month)
        {
            isvalid = false;
        }
        if((month == 4 || month == 6 || month == 9 || month == 11) && 30 < day)
        {
            isvalid = false;
        }
        if(month == 2)
        {
            if (isleapyear && 29 < day)
            {
                isvalid = false;
            }
            else if(!isleapyear && 28 < day)
            {
                isvalid = false;
            }
        }
        return isvalid;
    }

    public String isValid() {

        isvalid = checkValidDate(day, month, year);
        if(isvalid)
        {
            result = year+"년"+month+"월"+day+"일은 유효한 날짜입니다.";
        }
        else
        {
            result = year+"년"+month+"월"+day+"일은 유효하지 않은 날짜입니다.";
        }
        return (result);
    }
}
