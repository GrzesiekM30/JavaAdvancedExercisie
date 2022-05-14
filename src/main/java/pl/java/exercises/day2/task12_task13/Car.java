package pl.java.exercises.day2.task12_task13;


import java.util.List;

public class Car {
    private String name;
    private String model;
    private double price;
    private int productionYear;
    private List<Manufacturer> manufacturerList;
    private EngineType engineType;

    public Car(String name, String model, double price, int productionYear, List<Manufacturer> manufacturerList, EngineType engineType) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.productionYear = productionYear;
        this.manufacturerList = manufacturerList;
        this.engineType = engineType;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public List<Manufacturer> getManufacturerList() {
        return manufacturerList;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", productionYear=" + productionYear +
                ", manufacturerList=" + manufacturerList +
                ", engineType=" + engineType +
                '}';
    }
}
