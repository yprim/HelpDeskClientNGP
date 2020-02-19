package com.ucr.fuel.domain.business;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "Comment_Client")
public class CommentsClient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "description")
    @NotNull
    @Size(max = 250)
    private String description;

    @Column(name = "note_timestamp")
    @NotNull
    private Date noteTimestamp;

//    @Column(name = "id_issue")
//    @NotNull
//    private Integer idIssue;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_issue") //, nullable = false
    private IssueClient issueClient;


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

    public IssueClient getIssueClient() {
        return issueClient;
    }

    public void setIssueClient(IssueClient issueClient) {
        this.issueClient = issueClient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommentsClient that = (CommentsClient) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "CommentsClient{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", noteTimestamp=" + noteTimestamp +
                ", issueClient=" + issueClient +
                '}';
    }
}







