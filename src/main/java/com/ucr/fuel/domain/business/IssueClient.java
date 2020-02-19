package com.ucr.fuel.domain.business;


import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "Issue_Client")
public class IssueClient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "description")
    @NotNull
    @Size(max = 50)
    private String description;

    @Column(name = "report_number")
    @NotNull
    @Size(max = 100)
    private String reportNumber;

    @Column(name = "register_timestamp")
    @NotNull
    private Date registerTimestamp;

    @Column(name = "address")
    @NotNull
    @Size(max = 250)
    private String address;

    @Column(name = "contact_phone")
    @Size(min = 6, max = 20)
    private String phone;

    @Column(name = "contact_email")
    @Email
    @NotNull
    private String email;

    @Column(name = "status")
    @NotNull
    @Size(max = 50)
    private String status;

    @Column(name = "support_user_asigned")
    @NotNull
    @Size(max = 50)
    private String supportUserAsigned;


    @OneToMany(mappedBy = "issueClient", fetch = FetchType.EAGER) //@OneToMany(mappedBy = "Issue_Client", fetch = FetchType.LAZY)
    private List<CommentsClient> commentsClients;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_user") //, nullable = false
    private UserClient userClient;


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

    public List<CommentsClient> getCommentsClients() {
        return commentsClients;
    }

    public void setCommentsClients(List<CommentsClient> commentsClients) {
        this.commentsClients = commentsClients;
    }

    public UserClient getUserClient() {
        return userClient;
    }

    public void setUserClient(UserClient userClient) {
        this.userClient = userClient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IssueClient that = (IssueClient) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "IssueClient{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", reportNumber='" + reportNumber + '\'' +
                ", registerTimestamp=" + registerTimestamp +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", status='" + status + '\'' +
                ", supportUserAsigned='" + supportUserAsigned + '\'' +
                //", commentsClients=" + commentsClients +
                ", userClient=" + userClient +
                '}';
    }
}//class






