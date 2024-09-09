package ToDoApp;

/*
*class to handle task for ToDo App 
*
*/
public class Task {

    //declare vars
    private String description;
    private boolean completed;

    /*
     * constructor with args
     */
    public Task(String description) {
        this.description = description;
        this.completed = false;
    }

    //task desc
    public String getDescription() {
        return description;
    }

    //is task completed
    public boolean isCompleted() {
        return completed;
    }

    //mark as completed
    public void markAsCompleted() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return (completed ? "[X] " : "[ ] ") + description;
    }

}//end of class

