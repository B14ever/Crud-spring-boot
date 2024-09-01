package ToDoList.ToDoList.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ToDoList.ToDoList.model.ToDoList;
import ToDoList.ToDoList.repositories.ToDoListInterface;

@Service
public class ToDoListServies {
    @Autowired
    private ToDoListInterface ToDoListInterface;

    public List<ToDoList> findAllServices() {
        return ToDoListInterface.findAll();
    }

    public ToDoList saveNewTodoList(ToDoList toDoList) {
        return ToDoListInterface.save(toDoList);
    }
}
