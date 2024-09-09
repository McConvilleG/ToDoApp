package ToDoApp;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Main Class
 * 
 * Entry point for the To-Do List application.
 */
public class Main {

    /**
     * Start point for the application.
     * 
     */
    public static void main(String[] args) {

        // Set up scanner to take input from the user
        Scanner scan = new Scanner(System.in);

        try {
            // Create an instance of the ToDoList class to manage tasks
            ToDoList todoList = new ToDoList();

            // Loop to continuously display options and process user input
            boolean keepRunning = true;
            while (keepRunning) {

                // Display the current To-Do list
                System.out.println("\nTo-Do List:");
                todoList.showTasks();
                
                //display user menu
                showMenu();

                try {
                    // Get the user option
                    int userOption = scan.nextInt();
                    scan.nextLine(); // Consume the newline character

                    // Process the user's choice
                    switch (userOption) {
                        case 1:
                            // Option to add a new task
                            System.out.print("Enter task description: ");
                            String description = scan.nextLine();
                            todoList.addTask(description);
                            break;
                        case 2:
                            // Option to mark a task as completed
                            System.out.print("Enter task number to mark as completed: ");
                            int taskNumber = scan.nextInt();
                            scan.nextLine(); // Consume the newline character
                            todoList.markTaskAsCompleted(taskNumber - 1);
                            break;
                        case 3:
                            // Option to exit the application
                            System.out.println("Exiting...");
                            keepRunning = false; // End the loop
                            break;
                        default:
                            // Handle invalid input
                            System.out.println("Invalid choice. Please try again.");
                    }
                } catch (InputMismatchException inputMismatchException) {
                    System.out.println("Please enter a numerical value only, between 1-3.");
                    scan.nextLine(); // Consume the leftover newline character
                }
            }

        } catch (Exception e) { // Handle any unexpected exceptions
            System.out.println("Something went wrong, please try again.");
        } finally {
            // Close the scanner resource
            scan.close();
        }
    } // end of main method

    /*
     * Method to display the menu to the user
     */
    public static void showMenu() {
    	
    	System.out.println("---------------------------------------------------");
        // Display available user options
        System.out.println("Menu:");
        System.out.println();
        System.out.println("1. Add task");
        System.out.println("2. Mark task as completed");
        System.out.println("3. Exit");
        System.out.println();

        // Prompt the user to choose an option
        System.out.print("Choose an option: \n");
        
        System.out.println("---------------------------------------------------");

    } // end of showMenu

} // end of Main class
