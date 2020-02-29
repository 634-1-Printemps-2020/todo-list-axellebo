package task;

import creator.Creator;
import exception.ExceptionTask;

import java.util.Date;

public class Task{

    private Creator creator;
    private String description;
    private Date date;
    private EnumStatus status;
    private EnumResolution resolution;

    public Task(Creator creator, String description, Date date, EnumStatus status) throws ExceptionTask {
        if(new Date().compareTo(date)<0){throw new ExceptionTask("Erreur de date, date inscrite : "+date+" date du jour"+ new Date());}
        this.creator = creator;
        this.description = description;
        this.date = date;
        this.status = status;
    }

    public void changeStatue(EnumStatus status) throws ExceptionTask {
        if(this.status.equals(status)){
            throw new ExceptionTask("Impossible de changer le status de cette tâche car elle est déjà de ce status, status de la tâche :"+ this.status+" nouveau status :"+status);
        }
        this.status=status;
    }

    public void rescheduleTask(Date date) throws ExceptionTask {
        if(new Date().compareTo(date)<0){throw new ExceptionTask("Modification de la date impossible, date inscrite : "+date+" date du jour"+ new Date());}
        this.date=date;
    }

    public EnumStatus getStatus(){
        return this.status;
    }

    public Date getDateTask(){
        return this.date;
    }
}
