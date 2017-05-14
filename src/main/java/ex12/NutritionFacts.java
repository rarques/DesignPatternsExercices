package ex12;

/**
 * Created by rarques on 5/14/2017.
 */
public class NutritionFacts {

    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    protected NutritionFacts(int servingSize,
                             int servings,
                             int calories,
                             int fat,
                             int sodium,
                             int carbohydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }

    @Override
    public String toString() {
        return "NutritionFacts{" +
                "servingSize=" + servingSize +
                ", servings=" + servings +
                ", calories=" + calories +
                ", fat=" + fat +
                ", sodium=" + sodium +
                ", carbohydrate=" + carbohydrate +
                '}';
    }

    public static class Builder {

        private int servingSize;
        private int servings;
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public NutritionFacts build() {
            return new NutritionFacts(servingSize,
                    servings,
                    calories,
                    fat,
                    sodium,
                    carbohydrate);
        }

        public NutritionFacts.Builder calories(int calories) {
            this.calories = calories;
            return this;
        }

        public NutritionFacts.Builder fat(int fat) {
            this.fat = fat;
            return this;
        }

        public NutritionFacts.Builder sodium(int sodium) {
            this.sodium = sodium;
            return this;
        }

        public NutritionFacts.Builder carbohydrate(int carbohydrate) {
            this.carbohydrate = carbohydrate;
            return this;
        }

    }

}
