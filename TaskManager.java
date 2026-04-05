package TaskManagerProject;

import java.time.LocalDateTime;
import java.util.HashMap;

public class TaskManager {
    private HashMap<Integer, Task> hashMap = new HashMap<>();

    public TaskManager() {
    }

    public void addTask(Task task) {
        hashMap.put(task.getId(), task);
    }

    public void deleteTaskById(Integer id) {
        hashMap.remove(id);
    }

    public void updateDescription(Integer id, String description) {
        hashMap.get(id).setDescription(description);
        hashMap.get(id).setUpdatedDate(LocalDateTime.now());

    }

    public void updateStatus(Integer id, Status status) {
        hashMap.get(id).setStatus(status);
    }

    public void listAllTasks() {
        for (Task task : hashMap.values()) {
            System.out.println(task);
        }
    }

    public void listByStatus(Status status) {
        for (Task task : hashMap.values()) {
            if (task.getStatus().equals(status)) {
                System.out.println(task);

            }
        }
    }
}
