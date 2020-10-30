package ar.com.ada.online.second.tp1;

public class Wands {
    private int points;
    private String name;


    public Wands(int points, String name) {
        this.points = points;
        this.name = name;
    }

    public Wands (){}



    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}
