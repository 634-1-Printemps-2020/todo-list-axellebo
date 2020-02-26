package task;

import creator.Creator;

import java.util.Date;

public class Task implements ITask{

    private Creator creator;
    private String description;
    private Date date;
    private EnumStatus status;
    private EnumResolution resolution;

    @Override
    public void createTask(Creator createur, String description, Date date, EnumStatus status) {
        this.creator = createur;
        this.description = description;
        this.date = date;
        this.status = status;
    }

    @Override
    public void cancelTask() {
        this.status = EnumStatus.CANCELED;
    }

    @Override
    public void rescheduleTask(Date date) {
        this.date = date;
    }

    @Override
    public Task viewTask() {
        return null;
    }

    @Override
    public Task viewTask(EnumStatus status) {
        return null;
    }

    @Override
    public Task viewTask(Date date) {
        return null;
    }

    @Override
    public Task viewTask(EnumStatus status, Date date) {
        return null;
    }
}
