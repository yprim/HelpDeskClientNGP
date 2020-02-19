package com.ucr.fuel.dto;

import com.ucr.fuel.domain.business.IssueClient;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

public class UserClientDTO {

    public static class Request{
        @NotNull
        String name;
        @NotNull
        String firstSurname;
        @NotNull
        String secondSurname;
        @NotNull
        String address;
        @NotNull
        String phone;
        @NotNull
        String secondContact;
        @NotNull
        String email;
        @NotNull
        String password;
        @NotNull
        Integer television;
        @NotNull
        Integer mobilePhone;
        @NotNull
        Integer telephone;
        @NotNull
        Integer internet;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getFirstSurname() {
            return firstSurname;
        }

        public void setFirstSurname(String firstSurname) {
            this.firstSurname = firstSurname;
        }

        public String getSecondSurname() {
            return secondSurname;
        }

        public void setSecondSurname(String secondSurname) {
            this.secondSurname = secondSurname;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getSecondContact() {
            return secondContact;
        }

        public void setSecondContact(String secondContact) {
            this.secondContact = secondContact;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public Integer getTelevision() {
            return television;
        }

        public void setTelevision(Integer television) {
            this.television = television;
        }

        public Integer getMobilePhone() {
            return mobilePhone;
        }

        public void setMobilePhone(Integer mobilePhone) {
            this.mobilePhone = mobilePhone;
        }

        public Integer getTelephone() {
            return telephone;
        }

        public void setTelephone(Integer telephone) {
            this.telephone = telephone;
        }

        public Integer getInternet() {
            return internet;
        }

        public void setInternet(Integer internet) {
            this.internet = internet;
        }
    }

    public static class Response{
        Integer id;
        String name;
        String firstSurname;
        String secondSurname;
        String address;
        String phone;
        String secondContact;
        String email;
        String password;
        Integer television;
        Integer mobilePhone;
        Integer telephone;
        Integer internet;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getFirstSurname() {
            return firstSurname;
        }

        public void setFirstSurname(String firstSurname) {
            this.firstSurname = firstSurname;
        }

        public String getSecondSurname() {
            return secondSurname;
        }

        public void setSecondSurname(String secondSurname) {
            this.secondSurname = secondSurname;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getSecondContact() {
            return secondContact;
        }

        public void setSecondContact(String secondContact) {
            this.secondContact = secondContact;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public Integer getTelevision() {
            return television;
        }

        public void setTelevision(Integer television) {
            this.television = television;
        }

        public Integer getMobilePhone() {
            return mobilePhone;
        }

        public void setMobilePhone(Integer mobilePhone) {
            this.mobilePhone = mobilePhone;
        }

        public Integer getTelephone() {
            return telephone;
        }

        public void setTelephone(Integer telephone) {
            this.telephone = telephone;
        }

        public Integer getInternet() {
            return internet;
        }

        public void setInternet(Integer internet) {
            this.internet = internet;
        }
    }

}
