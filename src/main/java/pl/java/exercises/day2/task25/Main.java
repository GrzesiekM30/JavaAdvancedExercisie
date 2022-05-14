package pl.java.exercises.day2.task25;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        //jak obsłużyć wyjątek checkd to
        //1.będzie blok try catch np. addToBasket
        //throws na poziomie metody np removeFromBasket
        try {
            basket.addToBasket();
        } catch (BasketFullExeption e) {
            System.out.println(e);;
        }
    }
}
