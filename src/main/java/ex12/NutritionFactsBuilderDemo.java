package ex12;

/**
 * Created by rarques on 5/14/2017.
 */
public class NutritionFactsBuilderDemo {

    public static void main(String[] args) {

        NutritionFacts beverage;
        beverage = new NutritionFacts.Builder(240, 8)
                .calories(100)
                .sodium(35)
                .carbohydrate(27)
                .build();

        System.out.println(beverage);

    }

}
