package TaskManagerProject;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        taskManager.addTask(new Task(1, "Wash the dishes"));
        taskManager.addTask(new Task(2, "read a book"));
        taskManager.addTask(new Task(3, "Listen a music"));
        taskManager.addTask(new Task(4, "Work on the project"));
        taskManager.addTask(new Task(5, "Eat a sandwich"));

        taskManager.listAllTasks();
        System.out.println("------------------------------------------------------------------------------");

        taskManager.updateDescription(1, "go to the market");
        taskManager.deleteTaskById(2);
        taskManager.updateStatus(4, Status.IN_PROGRESS);
        taskManager.updateStatus(5, Status.DONE);
        taskManager.listAllTasks();
        System.out.println("------------------------------------------------------------------------------");
        taskManager.listByStatus(Status.TODO);
        System.out.println("------------------------------------------------------------------------------");
        taskManager.listByStatus(Status.DONE);
        System.out.println("------------------------------------------------------------------------------");
        taskManager.listByStatus(Status.IN_PROGRESS);


    }

}
