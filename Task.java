package TaskManagerProject;

import java.time.LocalDateTime;

public class Task {
    private Integer id;
    private String description;
    private Status status = Status.TODO;
    private LocalDateTime createdDate = LocalDateTime.now();
    private LocalDateTime updatedDate = null;

    public Task() {
    }

    public Task(Integer id, String description) {
        this.id = id;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Override
    public String toString() {
        return "TaskManagerProject.Task{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                '}';
    }
}
