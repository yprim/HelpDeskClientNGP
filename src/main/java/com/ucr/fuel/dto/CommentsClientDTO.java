package com.ucr.fuel.dto;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class CommentsClientDTO {

    public static class Request{
        @NotNull
        String description;
        @NotNull
        Date noteTimestamp;
        //@NotNull
         Integer idIssue;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Date getNoteTimestamp() {
            return noteTimestamp;
        }

        public void setNoteTimestamp(Date noteTimestamp) {
            this.noteTimestamp = noteTimestamp;
        }

        public Integer getIdIssue() {
            return idIssue;
        }

        public void setIdIssue(Integer idIssue) {
            this.idIssue = idIssue;
        }
    }//Request


    public static class Response{
         Integer id;
         String description;
         Date noteTimestamp;
         IssueClientDTO.Response issueClient;

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

        public Date getNoteTimestamp() {
            return noteTimestamp;
        }

        public void setNoteTimestamp(Date noteTimestamp) {
            this.noteTimestamp = noteTimestamp;
        }

        public IssueClientDTO.Response getIssueClient() {
            return issueClient;
        }

        public void setIssueClient(IssueClientDTO.Response issueClient) {
            this.issueClient = issueClient;
        }
    }



}//class
