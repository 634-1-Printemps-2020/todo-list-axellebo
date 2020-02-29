package metier;

import creator.Creator;
import exception.ExceptionGestionTaches;
import exception.ExceptionTask;
import task.EnumStatus;
import task.Task;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class GestionTachesTest {

    @org.junit.Test (expected = ExceptionTask.class)
    public void createTask() throws ParseException, ExceptionTask {
        Creator creator = new Creator("Seiler", "Axelle");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = dateFormat.parse("2020-02-27");
        Task task = new Task(creator, "Faire TP Patterns", date, EnumStatus.OPEN);
    }

    @org.junit.Test (expected = ExceptionTask.class)
    public void cancelTask() {
    }

    @org.junit.Test (expected = ExceptionTask.class)
    public void rescheduleTask() {
    }

    @org.junit.Test
    public void viewTask() {
    }

    @org.junit.Test
    public void testViewTask() {
    }

    @org.junit.Test
    public void testViewTask1() {
    }

    @org.junit.Test
    public void testViewTask2() {
    }
}