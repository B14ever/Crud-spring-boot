package ToDoList.ToDoList.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import ToDoList.ToDoList.model.ToDoList;

public interface ToDoListInterface extends MongoRepository<ToDoList, String> {

}
