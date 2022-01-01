package com.modelsFC;

import java.util.List;

public class Student {
    String fullname;
    String city;
    String country;
    String phone_number;
    String email;
    String presence;
    Boolean transfer;
    String photo;
    String curriculumVitae;

    User usersObj;
    List<UserTags> userTagsList;

    public Student(String fullname, String city, String country, String phone_number, String email, String presence, Boolean transfer, String photo, String curriculumVitae) {

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

    public String getPresence() {
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

    @Override
    public String toString() {
        return "Student{" +
                "fullname='" + fullname + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", email='" + email + '\'' +
                ", presence='" + presence + '\'' +
                ", transfer=" + transfer +
                ", photo='" + photo + '\'' +
                ", curriculumVitae='" + curriculumVitae + '\'' +
                ", usersObj=" + usersObj +
                ", userTagsList=" + userTagsList +
                '}';
    }
}
