package task;

import creator.Creator;

import java.util.Date;

public interface ITask {
    void createTask(Creator createur, String description, Date date, EnumStatus status);

    void cancelTask();

    void rescheduleTask(Date date);

    Task viewTask();

    Task viewTask(EnumStatus status);

    Task viewTask(Date date);

    Task viewTask(EnumStatus status, Date date);
}
