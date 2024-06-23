package org.example.springrecap2106.Service;

import lombok.RequiredArgsConstructor;
import org.example.springrecap2106.Controller.IdService;
import org.example.springrecap2106.Model.Status;
import org.example.springrecap2106.Model.ToDo;
import org.example.springrecap2106.Model.ToDoWithoutID;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RecapService {

    private final IdService idService;


    public void addToDo(ToDoWithoutID toDo) {
        ToDo newToDo = new ToDo(idService.generateId(), toDo.description(), Status.OPEN);

    }

    public ToDo getToDo(ToDo toDo) {
        return toDo;
    }
}
