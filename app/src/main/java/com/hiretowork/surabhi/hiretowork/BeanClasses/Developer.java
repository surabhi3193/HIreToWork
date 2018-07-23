package com.hiretowork.surabhi.hiretowork.BeanClasses;

public class Developer {
    private String id,dev_name,dev_pic1,
            dev_skills,
            dev_location,dev_rating,dev_desc;

    private int dev_pic;
    public Developer() {
    }

    public Developer(String id, String dev_name, int dev_pic, String dev_skills, String dev_location, String dev_rating, String dev_desc) {
        this.id = id;
        this.dev_pic = dev_pic;
        this.dev_skills = dev_skills;
        this.dev_name = dev_name;
        this.dev_location = dev_location;
        this.dev_rating = dev_rating;
        this.dev_desc = dev_desc;
    }

    public String getdev_desc() {
        return dev_desc;
    }

    public void setdev_desc(String dev_desc) {
        this.dev_desc = dev_desc;
    }

    public String getdev_rating() {
        return dev_rating;
    }

    public void setdev_rating(String dev_rating) {
        this.dev_rating = dev_rating;
    }

    public String getdev_name() {
        return dev_name;
    }

    public void setdev_name(String dev_name) {
        this.dev_name = dev_name;
    }


    public int getdev_pic() {
        return dev_pic;
    }

    public void setdev_pic(int dev_pic) {
        this.dev_pic = dev_pic;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getdev_skills() {
        return dev_skills;
    }

    public void setdev_skills(String dev_skills) {
        this.dev_skills = dev_skills;
    }

    public String getdev_location() {
        return dev_location;
    }

    public void setdev_location(String dev_location) {
        this.dev_location = dev_location;
    }

    
    
}
