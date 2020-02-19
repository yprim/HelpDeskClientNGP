package com.ucr.fuel.domain.business;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "User_Client")
public class UserClient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    @NotNull
    @Size(max = 50)
    private String name;

    @Column(name = "first_surname")
    @NotNull
    @Size(max = 50)
    private String firstSurname;

    @Column(name = "second_surname")
    @NotNull
    @Size(max = 50)
    private String secondSurname;

    @Column(name = "address")
    @NotNull
    @Size(max = 250)
    private String address;

    @Column(name = "phone")
    @Size(min = 6, max = 20)
    private String phone;

    @Column(name = "second_contact")
    @Size(min = 6, max = 20)
    private String secondContact;

    @Column(name = "email")
    @Email
    @NotNull
    private String email;

    @Column(name = "password")
    @NotNull
    @Size(max = 50)
    private String password;

    @Column(name = "television")
    private Integer television;

    @Column(name = "mobile_phone")
    private Integer mobilePhone;

    @Column(name = "telephone")
    private Integer telephone;

    @Column(name = "internet")
    private Integer internet;

    @OneToMany(mappedBy = "userClient", fetch = FetchType.EAGER)
    private List<IssueClient> issueClients;

//   @ManyToMany(mappedBy = "User_Client")
//    private List<ServiceClient> serviceClients;

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

    public List<IssueClient> getIssueClients() {
        return issueClients;
    }

    public void setIssueClients(List<IssueClient> issueClients) {
        this.issueClients = issueClients;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserClient that = (UserClient) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "UserClient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", firstSurname='" + firstSurname + '\'' +
                ", secondSurname='" + secondSurname + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", secondContact='" + secondContact + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", television=" + television +
                ", mobilePhone=" + mobilePhone +
                ", telephone=" + telephone +
                ", internet=" + internet +
                //", issueClients=" + issueClients +
                '}';
    }
}





