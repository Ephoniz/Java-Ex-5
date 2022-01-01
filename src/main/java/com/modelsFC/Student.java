package com.modelsFC;

import java.util.List;

public class Student {
    String fullname;
    String city;
    String country;
    String phone_number;
    String email;
    Boolean presence;
    Boolean transfer;
    String photo;
    String curriculumVitae;

    User usersObj;
    List<UserTags> userTagsList;

    public Student(String fullname, String city, String country, String phone_number, String email, Boolean presence, Boolean transfer, String photo, String curriculumVitae) {

        this.fullname = fullname;
        this.city = city;
        this.country = country;
        this.phone_number = phone_number;
        this.email = email;
        this.presence = presence;
        this.transfer = transfer;
        this.photo = photo;
        this.curriculumVitae = curriculumVitae;
    }

    public String getFullname() {
        return fullname;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public String getEmail() {
        return email;
    }

    public Boolean getPresence() {
        return presence;
    }

    public Boolean getTransfer() {
        return transfer;
    }

    public String getPhoto() {
        return photo;
    }

    public String getCurriculumVitae() {
        return curriculumVitae;
    }

    public User getUsersObj() {
        return usersObj;
    }

    public List<UserTags> getUserTagsList() {
        return userTagsList;
    }
}
