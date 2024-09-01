package ToDoList.ToDoList.model;

import java.util.Date;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("todolist")

public class ToDoList {
    private String title;
    private String description;
    private Date startDate;
    private Date endDate;
}
