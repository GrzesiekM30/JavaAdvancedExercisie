package pl.java.exercises.day2.task25;

public class Basket {
    private int itemCouter;

    public Basket() {
        this.itemCouter = 0;
    }

    public void addToBasket()throws BasketFullExeption{
        if (itemCouter>=10){
            throw new BasketFullExeption("To many items in basket");
        }
        itemCouter++;
    }
    public void removeFromBasket()throws BasketEmptyExeption {
        if(itemCouter<=0){
            throw new BasketEmptyExeption("Basket is empty");
        }
        itemCouter--;
    }
}
