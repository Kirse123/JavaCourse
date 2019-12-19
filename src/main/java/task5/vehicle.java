package task5;

public class vehicle {
    public String producer;
    public RaceType racePurpose;
    public int engineHP;
    public int serialNumber;

        vehicle(String producer, RaceType racePurpose, int engineHP, int serialNumber){
            this.producer = producer;
            this.serialNumber = serialNumber;
            this.racePurpose = racePurpose;
            this.engineHP = engineHP;
    }
}
