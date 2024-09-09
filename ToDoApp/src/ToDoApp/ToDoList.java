package ToDoApp;

import java.util.ArrayList;
import java.util.List;

/*
 * Class handles/manages task list for app
 */
public class ToDoList {

    //declare vars
    private List<Task> tasks;

    //constructor
    public ToDoList() {
        tasks = new ArrayList<>();
    }

    //add task
    public void addTask(String description) {
        tasks.add(new Task(description));
    }

    //mark as completed 
    public void markTaskAsCompleted(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markAsCompleted();
        } else {
            System.out.println("Task not found.");
        }
    }

    //show tasks
    public void showTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks added.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public List<Task> getTasks() {
        return tasks;
    }

}//end of class

