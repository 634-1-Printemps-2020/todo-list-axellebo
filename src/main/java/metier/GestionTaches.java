package metier;

import creator.Creator;
import exception.ExceptionGestionTaches;
import exception.ExceptionTask;
import task.EnumStatus;
import task.ITask;
import task.Task;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GestionTaches implements ITask {

    private List<Task> lstTask = new ArrayList<>();
    @Override
    public void createTask(Creator createur, String description, Date date, EnumStatus status) throws ExceptionTask {
        lstTask.add(new Task(createur, description, date, status));
    }

    @Override
    public void cancelTask(Task task) throws ExceptionTask, ExceptionGestionTaches {
        if(!lstTask.contains(task)){
            throw new ExceptionGestionTaches("Cette tâche n'existe pas dans la liste des tâches existantes");
        }
        for (Task t : lstTask){
            if (t.equals(task)){
                task.changeStatue(EnumStatus.CANCELED);
                break;
            }
        }
    }

    @Override
    public void rescheduleTask(Task task, Date date) throws ExceptionTask, ExceptionGestionTaches {
        if(!lstTask.contains(task)){
            throw new ExceptionGestionTaches("Cette tâche n'existe pas dans la liste des tâches existantes");
        }
        for (Task t : lstTask){
            if (t.equals(task)){
                task.rescheduleTask(date);
                break;
            }
        }
    }

    @Override
    public List<Task> viewTask() {
        return lstTask;
    }

    @Override
    public List<Task> viewTask(EnumStatus status) {
        ArrayList<Task> lstTaskView = new ArrayList<>();
        for (Task t : lstTask){
            if(t.getStatus().equals(status)){
                lstTaskView.add(t);
            }
        }
        return lstTaskView;
    }

    @Override
    public List<Task> viewTask(Date date) {
        ArrayList<Task> lstTaskView = new ArrayList<>();
        for (Task t : lstTask){
            if(t.getDateTask().equals(date)){
                lstTaskView.add(t);
            }
        }
        return lstTaskView;
    }

    @Override
    public List<Task> viewTask(EnumStatus status, Date date) {
        ArrayList<Task> lstTaskView = new ArrayList<>();
        for (Task t : lstTask){
            if(t.getStatus().equals(status) && t.getDateTask().equals(date)){
                lstTaskView.add(t);
            }
        }
        return lstTaskView;
    }
}
