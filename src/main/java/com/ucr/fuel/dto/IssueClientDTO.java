package com.ucr.fuel.dto;

import com.ucr.fuel.domain.business.CommentsClient;
import com.ucr.fuel.domain.business.UserClient;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

public class IssueClientDTO {

    public static class Request{
        @NotNull
        String description;
        @NotNull
        String reportNumber;
        @NotNull
        Date registerTimestamp;
        @NotNull
        String address;
        @NotNull
        String phone;
        @NotNull
        String email;
        @NotNull
        String status;
        @NotNull
        String supportUserAsigned;
        //@NotNull
        Integer userClientID;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getReportNumber() {
            return reportNumber;
        }

        public void setReportNumber(String reportNumber) {
            this.reportNumber = reportNumber;
        }

        public Date getRegisterTimestamp() {
            return registerTimestamp;
        }

        public void setRegisterTimestamp(Date registerTimestamp) {
            this.registerTimestamp = registerTimestamp;
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

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getSupportUserAsigned() {
            return supportUserAsigned;
        }

        public void setSupportUserAsigned(String supportUserAsigned) {
            this.supportUserAsigned = supportUserAsigned;
        }

        public Integer getUserClientID() {
            return userClientID;
        }

        public void setUserClientID(Integer userClientID) {
            this.userClientID = userClientID;
        }
    }


    public static class Response{
        Integer id;
         String description;
        String reportNumber;
        Date registerTimestamp;
        String address;
        String phone;
        String email;
        String status;
        String supportUserAsigned;
        UserClientDTO.Response userClient;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getReportNumber() {
            return reportNumber;
        }

        public void setReportNumber(String reportNumber) {
            this.reportNumber = reportNumber;
        }

        public Date getRegisterTimestamp() {
            return registerTimestamp;
        }

        public void setRegisterTimestamp(Date registerTimestamp) {
            this.registerTimestamp = registerTimestamp;
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

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getSupportUserAsigned() {
            return supportUserAsigned;
        }

        public void setSupportUserAsigned(String supportUserAsigned) {
            this.supportUserAsigned = supportUserAsigned;
        }

        public UserClientDTO.Response getUserClient() {
            return userClient;
        }

        public void setUserClient(UserClientDTO.Response userClient) {
            this.userClient = userClient;
        }
    }



}
