package br.ufpb.dcx.dsc.repositoryproject.services;


import br.ufpb.dcx.dsc.repositoryproject.models.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {


    private final List<Repository> repositoryList = Arrays.asList(
            new Repository(1L, "Pedro", "público", LocalDateTime.now()),
            new Repository(1L, "Carlos","privado", LocalDateTime.now()),
            new Repository(2L, "Henrique", "público", LocalDateTime.now()),
            new Repository(2L, "João", "privado", LocalDateTime.now())
    );
    public List<Repository> listRepositorys(Long userId){

        List<Repository> selected = new ArrayList<>();
        for (Repository repository: repositoryList) {
            if(repository.getUserId().equals(userId)){
                selected.add(repository);
            }
        }
        return selected;

        //Outra forma de fazer usando streams
/*        return taskList.stream()
                .filter(task -> task.getUserId() == userId)
                .collect(Collectors.toList());*/
    }

    public List<Repository> listRepositorys() {
        return repositoryList;
    }
}

