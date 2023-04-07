package com.goott.pj3.travelinfo.dto;

import java.util.Arrays;
import java.util.Date;

public class TravelInfoDTO {
   int travel_location_idx;
   String user_id;
   String country_a;
   String country_b;
   String country_c;
   String country_detail;
   String country_script;
   String[] country_img;
   Date create_date;
   Date update_date;

    public int getTravel_location_idx() {
        return travel_location_idx;
    }

    public void setTravel_location_idx(int travel_location_idx) {
        this.travel_location_idx = travel_location_idx;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getCountry_a() {
        return country_a;
    }

    public void setCountry_a(String country_a) {
        this.country_a = country_a;
    }

    public String getCountry_b() {
        return country_b;
    }

    public void setCountry_b(String country_b) {
        this.country_b = country_b;
    }

    public String getCountry_c() {
        return country_c;
    }

    public void setCountry_c(String country_c) {
        this.country_c = country_c;
    }

    public String getCountry_detail() {
        return country_detail;
    }

    public void setCountry_detail(String country_detail) {
        this.country_detail = country_detail;
    }

    public String getCountry_script() {
        return country_script;
    }

    public void setCountry_script(String country_script) {
        this.country_script = country_script;
    }

    public String[] getCountry_img() {
        return country_img;
    }

    public void setCountry_img(String[] country_img) {
        this.country_img = country_img;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Date getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(Date update_date) {
        this.update_date = update_date;
    }

    @Override
    public String toString() {
        return "TravelInfoDTO [travel_location_idx=" + travel_location_idx + ",user_id=" + user_id +
                ",country_a=" + country_a + ",country_b=" + country_b + ",country_c=" + country_c +
                ",country_detail=" + country_detail + ",country_script=" + country_script +
                ", country_img=" + Arrays.toString(country_img) +
                ",create_date=" + create_date + ",upate_date=" + update_date + "]";
    }
}
