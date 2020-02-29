package task;

import creator.Creator;
import exception.ExceptionGestionTaches;
import exception.ExceptionTask;

import java.util.Date;
import java.util.List;

public interface ITask {
    void createTask(Creator createur, String description, Date date, EnumStatus status) throws ExceptionTask;

    void cancelTask(Task task) throws ExceptionTask, ExceptionGestionTaches;

    void rescheduleTask(Task task, Date date) throws ExceptionTask, ExceptionGestionTaches;

    List<Task> viewTask();

    List<Task> viewTask(EnumStatus status);

    List<Task> viewTask(Date date);

    List<Task> viewTask(EnumStatus status, Date date);
}
