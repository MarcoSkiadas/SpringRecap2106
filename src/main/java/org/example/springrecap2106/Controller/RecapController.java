package org.example.springrecap2106.Controller;

import lombok.RequiredArgsConstructor;
import org.example.springrecap2106.Model.ToDo;
import org.example.springrecap2106.Model.ToDoWithoutID;
import org.example.springrecap2106.Service.RecapService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/todo")
@RequiredArgsConstructor
public class RecapController {

    private final RecapService recapService;

    @GetMapping()
    public List<ToDo> getToDo() {
        return recapService.getToDo();
    }
@PostMapping()
    public void addToDo(@RequestBody ToDoWithoutID toDo) {
    recapService.addToDo(toDo);
}
    @GetMapping("/{id}")
    public ToDo getDetail(@PathVariable String id) {
        return recapService.getDetail(id);

    }
    @PutMapping("/{id}")
    public void updateToDo(@PathVariable String id, @RequestBody ToDo toDo) {
        recapService.updateToDo(id, toDo);
    }
    @DeleteMapping("/{id}")
    public void deleteToDo(@PathVariable String id) {
        recapService.deleteToDo(id);
    }


}
