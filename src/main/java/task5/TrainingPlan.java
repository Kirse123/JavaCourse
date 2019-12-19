package task5;

import java.util.ArrayList;
import java.util.Date;

public class TrainingPlan {
    private ArrayList<TrainingSession> sessions;

    TrainingPlan(ArrayList<TrainingSession> sessions){
        this.sessions = sessions;
    }

    public ArrayList<TrainingSession> GetTraininngSessionForPilot(String pilotName){
        ArrayList <TrainingSession> resList = new ArrayList<TrainingSession>();
        for (int i = 0; i < this.sessions.size(); i++){
            TrainingSession tmp = this.sessions.get(i);
            if (tmp.pilotName == pilotName){
                resList.add(tmp);
            }
        }
        return resList;
    }
    public ArrayList<TrainingSession> GetTrainingSessionOnDate(Date date){
        ArrayList <TrainingSession> resList = new ArrayList<TrainingSession>();
        for (int i = 0; i < this.sessions.size(); i++){
            TrainingSession tmp = this.sessions.get(i);
            if (tmp.date.compareTo(date) == 0){
                resList.add(tmp);
            }
        }
        return resList;
    }
    public ArrayList<TrainingSession> GetTrainingSessionForVehicleType(RaceType racePurpose){
        ArrayList <TrainingSession> resList = new ArrayList<TrainingSession>();
        for (int i = 0; i < this.sessions.size(); i++){
            TrainingSession tmp = this.sessions.get(i);
            if (tmp.vehicle.racePurpose == racePurpose){
                resList.add(tmp);
            }
        }
        return resList;
    }
}
