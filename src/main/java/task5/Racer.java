package task5;

enum RaceType{
    rally("Rally"),
    f1("Formula 1"),
    gt3("GT3"),
    gt1("GT1"),
    dtm("DTM"),
    moto("Motoraces");

    private String type;

    RaceType(String day){
        this.type = day;
    }

    public String getType(){
        return type;
    }
}

public class Racer extends Person {
    public RaceType raceTypePrefed;
    public int amoutOfSeasons;

    Racer(RaceType raceType, int seasons){
        this.raceTypePrefed = raceType;
        this.amoutOfSeasons = seasons;
    }
}

