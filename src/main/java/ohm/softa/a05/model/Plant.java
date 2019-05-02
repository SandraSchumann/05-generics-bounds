package ohm.softa.a05.model;

public abstract class Plant implements Comparable<Plant> {

    String family;
    String name;
    double height;

    protected Plant(String family, String name, double height) {
        if(family == null || family.length() == 0) throw new IllegalArgumentException("Specify a family");
        if(name == null || name.length() == 0) throw new IllegalArgumentException("Specify a name");
        if(height <= 0.0) throw new IllegalArgumentException("Height may not be less or equal zero");
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

    @Override
    public int compareTo(Plant plant) {
        return Double.compare(this.height, plant.height);
    }
}
