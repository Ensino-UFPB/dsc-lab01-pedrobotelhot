package br.ufpb.dcx.dsc.repositoryproject.controller;

import br.ufpb.dcx.dsc.repositoryproject.models.Repository;
import br.ufpb.dcx.dsc.repositoryproject.services.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/api/repositorys")
public class Controller {

    private final Service Service;

    public Controller(Service todoService) {
        this.Service = todoService;
    }

    @GetMapping(path = "/{userId}")
    public List<Repository> getRepository(@PathVariable Long userId){
        return Service.listRepositorys(userId);
    }

    @GetMapping()
    public List<Repository> getAllRepository(){
        return Service.listRepositorys();
    }
}
