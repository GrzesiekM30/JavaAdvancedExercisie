package pl.java.exercises.day2.task12_task13;

import java.util.*;
import java.util.stream.Collectors;

public class CarService {
    private List<Car> carsList;

    public CarService() {
        carsList = new ArrayList<>();
    }
    //point 1
    public void add(Car car){
        carsList.add(car);
    }

    //point2
    public void remove(Car car){
        carsList.remove(car);
    }
    //point 3
    public List<Car> getAll(){
        return new ArrayList<>(carsList);//zwróci modyfikowalną listę/kolecje
        //return List.copyOf(carsList);//zwróci nie modyfikowalną listę/kolekcje
        //return carsList;//będziemy cały czas pracować na carsList
    }
    //point 4
    public List<Car> showAllCarsWithV12Engine(){
         return carsList.stream()
                .filter(car -> car.getEngineType().equals(EngineType.V12))
                .collect(Collectors.toList());
    }
    //point 5
    public List<Car> carsProducedBefore1999(){
       return carsList.stream()
                .filter(car -> car.getProductionYear()<1999)
                .collect(Collectors.toList());
    }
    //point 6
    public Optional<Car> mostExpensiveCar(){
        return carsList.stream()
                .max(Comparator.comparingDouble(car->car.getPrice()));
                //.max(Comparator.comparingDouble(Car::getPrice)) zapis metod referens
    }

    //point 9
    public List<Car> getCarsSortedByName(boolean ascending){
        if(ascending){
            return carsList.stream()
                    .sorted(Comparator.comparing(Car::getName))
                    .collect(Collectors.toList());
        }else{
            return carsList.stream()
                    .sorted(Comparator.comparing(Car::getName).reversed())
                    .collect(Collectors.toList());
        }
    }

    //point 12
    public List<Car> getCarsFoundedBy(int founded, Operation operation){
        switch (operation){
            case GREATER_THAN:
                return carsList.stream()
                        .filter(car -> car.getManufacturerList().stream()
                                .anyMatch(manufacturer -> manufacturer.getFoundedInYear()> founded))
                        .collect(Collectors.toList());
            case LESS_THAN:
                return carsList.stream()
                        .filter(car -> car.getManufacturerList().stream()
                                .anyMatch(manufacturer -> manufacturer.getFoundedInYear()< founded))
                        .collect(Collectors.toList());
            case EQUAL:
                return carsList.stream()
                        .filter(car -> car.getManufacturerList().stream()
                                .anyMatch(manufacturer -> manufacturer.getFoundedInYear()== founded))
                        .collect(Collectors.toList());
        }
        return Collections.emptyList();
    }
}
