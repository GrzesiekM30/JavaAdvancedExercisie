package pl.java.exercises.day2.task24;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;


class BasketTest {
    private Basket basket;
    @BeforeEach
    void setUp(){
        basket = new Basket();
    }
    @Test
    void shouldNotBePossibleToAddNewItemWhenBasketIsFull(){
        //given
        basket.addToBasket();
        basket.addToBasket();
        basket.addToBasket();
        basket.addToBasket();
        basket.addToBasket();
        basket.addToBasket();
        basket.addToBasket();
        basket.addToBasket();
        basket.addToBasket();
        basket.addToBasket();
        //when
        assertThatThrownBy(()->basket.addToBasket())
                .isInstanceOf(BasketFullExeption.class)
                .hasMessage("To many items in basket");
        //then
    }
    @Test
    void shouldNotBePossibleToRemoveFromWhenBasketIsEmpty(){
        //given
        //when
        assertThatThrownBy(()->basket.removeFromBasket())
                .isInstanceOf(BasketEmptyExeption.class)
                .hasMessage("Basket is empty");
        //then
    }
}