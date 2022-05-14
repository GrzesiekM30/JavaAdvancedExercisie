package pl.java.exercises.day2.task24;

public class Basket {
    private int itemCouter;

    public Basket() {
        this.itemCouter = 0;
    }

    public void addToBasket(){
        if (itemCouter>=10){
            throw new BasketFullExeption("To many items in basket");
        }
        itemCouter++;
    }
    public void removeFromBasket() {
        if(itemCouter<=0){
            throw new BasketEmptyExeption("Basket is empty");
        }
        itemCouter--;
    }
}
