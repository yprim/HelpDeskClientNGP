package com.ucr.fuel.domain.business;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "Service_Client")
public class ServiceClient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    @NotNull
    @Size(max = 50)
    private String name;

//    @ManyToMany(cascade = {
//            CascadeType.DETACH
//    }, fetch = FetchType.EAGER)
//    @JoinTable(name = "Client_Service_Client",
//            joinColumns = {@JoinColumn(name = "id_client")},
//            inverseJoinColumns = {@JoinColumn(name = "id_service")})
//    private List<UserClient> userClients;


}
