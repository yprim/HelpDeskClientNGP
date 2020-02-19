package com.ucr.fuel;

import com.ucr.fuel.domain.business.CommentsClient;
import com.ucr.fuel.domain.business.Driver;
import com.ucr.fuel.domain.business.IssueClient;
import com.ucr.fuel.domain.business.UserClient;
import com.ucr.fuel.domain.security.User;
import com.ucr.fuel.service.CommentsClientService;
import com.ucr.fuel.service.DriverService;
import com.ucr.fuel.service.IssueClientService;
import com.ucr.fuel.service.UserClientService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@SpringBootApplication
public class FuelControlApplication {

    public static void main(String[] args) {
        //SpringApplication.run(FuelControlApplication.class, args);
        ApplicationContext context = (ApplicationContext) SpringApplication.run(FuelControlApplication.class, args);
       /* Date date = new Date();
        //IssueClient issue = new IssueClient();


        CommentsClientService serviceComments = (CommentsClientService) context.getBean("commentsClientService");
        CommentsClient comments = new CommentsClient();
        comments.setDescription("Cuarta prueba");
        comments.setNoteTimestamp(date );
        //comments.setIssueClient(issue);
        CommentsClient commentsCreated = serviceComments.save(comments);
        System.out.println("\n\n\n"+serviceComments.findById(commentsCreated.getId())+"\n\n\n" );


//        CommentsClient commentsCreated = serviceComments.save(comments);
//        System.out.println("\n\n\n"+serviceComments.findById(commentsCreated.getId())+"\n\n\n" );

        IssueClientService serviceIssue = (IssueClientService) context.getBean("issueClientService");
        IssueClient issue = new IssueClient();
        issue.setDescription("Problemas con el phone");
        issue.setReportNumber("03");
        issue.setRegisterTimestamp(date);
        issue.setAddress("Agua Caliente");
        issue.setPhone("83908741");
        issue.setEmail("gregorypc22@gmail.com");
        issue.setStatus("Ingresado");
        issue.setSupportUserAsigned("");
        issue.setCommentsClients( new ArrayList<CommentsClient>() );
        issue.getCommentsClients().add((commentsCreated));
        //issue.setUserClient(user)


        IssueClient issueCreated = serviceIssue.save(issue);
        System.out.println("\n\n\n"+serviceIssue.find(issueCreated.getId())+"\n\n\n" );
        //System.out.println("\n\n\n Comments de ISSUE: "+ serviceIssue.find(issueCreated.getId()).getCommentsClients()  +"\n\n\n" );
        List<CommentsClient> list = new ArrayList<CommentsClient>();
        list.add(issueCreated.getCommentsClients().get(0) );
        //list.add(serviceIssue.find(issueCreated.getId()).getCommentsClients().get(0) );
        System.out.println("\n\nLista: "+list);

        UserClientService serviceUser = (UserClientService) context.getBean("userClientService");
        UserClient user = new UserClient();
        user.setName("Joseph");
        user.setFirstSurname("Pacheco" );
        user.setSecondSurname("Cantillo" );
        user.setAddress("Agua Caliente, casa A17" );
        user.setPhone("83908740" );
        user.setSecondContact("85584369" );
        user.setEmail("gregorypc22@gmail.com" );
        user.setPassword("password" );
        user.setTelevision(1 );
        user.setMobilePhone(0 );
        user.setTelephone(1 );
        user.setInternet(0 );
        user.setIssueClients( new ArrayList<IssueClient>() {{ add(issueCreated); }} );
        UserClient userCreated = serviceUser.save(user);
        System.out.println("\n\n\n"+serviceUser.find(userCreated.getId()) +"\n\n\n");

        List<IssueClient> list2 = new ArrayList<IssueClient>();//(serviceIssue.find(issueCreated.getId()) ).getCommentsClients();
        list2.add(userCreated.getIssueClients().get(0));
        System.out.println("\n\nLista : "+list2+"\n");

        issueCreated.setUserClient(userCreated);
        serviceIssue.update(issueCreated);
        System.out.println("\n\n\n---User de los ISSUE: "+serviceIssue.find(issueCreated.getId())+"\n\n\n" );

        commentsCreated.setIssueClient(issueCreated);
        serviceComments.update(commentsCreated);
        System.out.println("\n\n\n---Issue de los COMMENTS: "+  ( serviceComments.findById(commentsCreated.getId()) )  +"\n\n\n" );
*/
       
    }//MAIN

}
