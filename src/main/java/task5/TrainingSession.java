package task5;

import java.util.Date;
import java.util.List;

public class TrainingSession {
    public String pilotName;
    public Date date;
    public vehicle vehicle;

    TrainingSession(Date date, String pilotName, vehicle vehicle) {
        this.date = date;
        this.pilotName = pilotName;
        this.vehicle = vehicle;
    }
}
