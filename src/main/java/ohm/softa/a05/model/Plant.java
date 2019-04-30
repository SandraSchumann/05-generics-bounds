package ohm.softa.a05.model;

public abstract class Plant implements Comparable<Plant> {

    String family;
    String name;
    double height;

    protected Plant(String family, String name, double height) {
        this.family = family;
        this.name = name;
        this.height = height;
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public abstract PlantColor getColor();
}
