package com.ucr.fuel.controller;


import com.ucr.fuel.converter.CommentsClientRestConverter;
import com.ucr.fuel.domain.business.CommentsClient;
import com.ucr.fuel.dto.CommentsClientDTO;
import com.ucr.fuel.service.CommentsClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/commentsClients")
@CrossOrigin //permite que un user agent obtenga permiso para acceder a recursos seleccionados desde un servidor, en un origen distinto (dominio) al que pertenece.
public class CommentsClientController {
    //@RequestBody
    //Spring deserializa automáticamente el JSON en un tipo Java, suponiendo que se especifique uno apropiado.
    // Por defecto, el tipo que anotamos con la anotación @RequestBody
    //      debe corresponder al JSON enviado desde nuestro controlador del lado del cliente

    @Autowired
    private CommentsClientService commentsService;

    @Autowired
    private CommentsClientRestConverter commentsConverter;

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public CommentsClientDTO.Response findById( @PathVariable("id") Integer id) {
        return commentsConverter.toResponse(commentsService.findById(id));
    }


    @RequestMapping(path = "/", method = RequestMethod.POST)
    public CommentsClientDTO.Response save(@Valid @RequestBody CommentsClientDTO.Request commentsClient) {
        return commentsConverter.toResponse(commentsService.save(commentsConverter.fromRequest(commentsClient)));
        //    Para el return que es una respuest( Toma el comments y lo guarda ( Toma el Request y lo convierte en comments )
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.PUT)
    public CommentsClientDTO.Response update(@Valid @PathVariable("id") Integer id,
                                    @RequestBody CommentsClientDTO.Request commentsClient) {
        CommentsClient toUpdate = commentsConverter.fromRequest(commentsClient);
        toUpdate.setId(id);
        return commentsConverter.toResponse(commentsService.update(toUpdate));
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Integer id) {
        commentsService.delete(id);
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public List<CommentsClientDTO.Response> findAll() {
        return commentsService.findAll().stream().map(it -> commentsConverter.toResponse(it))
                .collect(Collectors.toList());
    }

}//class
