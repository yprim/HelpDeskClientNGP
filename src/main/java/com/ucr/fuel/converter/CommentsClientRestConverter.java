package com.ucr.fuel.converter;


import com.ucr.fuel.domain.business.CommentsClient;
import com.ucr.fuel.dto.CommentsClientDTO;
import com.ucr.fuel.service.IssueClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentsClientRestConverter
            implements RestConverter<CommentsClient, CommentsClientDTO.Response, CommentsClientDTO.Request>  {
    @Autowired
    private IssueClientRestConverter issueClientConverter;
    @Autowired
    private IssueClientService issueClientService;

    @Override
    public CommentsClientDTO.Response toResponse(CommentsClient entity) {
        CommentsClientDTO.Response response = new CommentsClientDTO.Response();
        response.setId(entity.getId());
        response.setDescription(entity.getDescription());
        response.setNoteTimestamp(entity.getNoteTimestamp());
        response.setIssueClient(issueClientConverter.toResponse(entity.getIssueClient()) );

        return response;
    }

    @Override
    public CommentsClient fromRequest(CommentsClientDTO.Request request) {
        CommentsClient entity = new CommentsClient();
        entity.setDescription(request.getDescription() );
        entity.setNoteTimestamp(request.getNoteTimestamp() );
        entity.setIssueClient(issueClientService.find(request.getIdIssue()) );
        return null;
    }
}
