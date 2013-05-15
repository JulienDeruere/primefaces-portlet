package com.sample.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.Date;

@SessionScoped
@ManagedBean(name = "calendar")
public class CalendarBean {

    public Date getCurrentDate() {
        return new Date();
    }
}
