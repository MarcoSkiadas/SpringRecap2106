package org.example.springrecap2106.Controller;

import lombok.RequiredArgsConstructor;
import org.example.springrecap2106.Model.ToDo;
import org.example.springrecap2106.Service.RecapService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class RecapController {

    private final RecapService recapService;

    @GetMapping("/api/todo")
    public ToDo getToDo(@RequestBody ToDo toDo) {
        return recapService.getToDo(toDo);
    }
@PostMapping("/api/todo")
    public ToDo addToDo(@RequestBody ToDo toDo) {
    return null;
}

}
