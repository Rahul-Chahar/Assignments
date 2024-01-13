package Collections_Generics_and_Stream_API.Fruit_Basket_Estimation_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class FruitBasketUtility {
    private List<FruitBasket> fruitBasketList;

    public FruitBasketUtility() {
        this.fruitBasketList = new ArrayList<>();
    }

    public List<FruitBasket> getFruitBasketList() {
        return fruitBasketList;
    }

    public void setFruitBasketList(List<FruitBasket> fruitBasketList) {
        this.fruitBasketList = fruitBasketList;
    }

    public void addToBasket(FruitBasket fbObj) {
        fruitBasketList.add(fbObj);
    }

    public int calculateBill(Stream<FruitBasket> fruitBasketStream) {
        return fruitBasketStream.mapToInt(fb -> fb.getWeightInKgs() * fb.getPricePerKg()).sum();
    }
}

