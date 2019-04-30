package ohm.softa.a05.model;

public class Flower extends Plant {

    private final PlantColor color;

    public Flower(String family, String name, double height, PlantColor color) {
        super(family, name, height);

        if(color == PlantColor.GREEN){
            throw new IllegalArgumentException("A flower is not green!");
        }

        this.color = color;
    }

    @Override
    public PlantColor getColor() {
        return color;
    }
}
