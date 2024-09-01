package ToDoList.ToDoList.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import ToDoList.ToDoList.model.ToDoList;
import ToDoList.ToDoList.services.ToDoListServies;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class ToDoListController {
    @Autowired
    private ToDoListServies tDoListServies;

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/todo")
    public List<ToDoList> getallTodoListes() {
        return tDoListServies.findAllServices();
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PostMapping("/add")
    public ToDoList createTodoList(@RequestBody ToDoList tDoList) {
        return tDoListServies.saveNewTodoList(tDoList);
    }
}
