import java.text.NumberFormat;
import java.util.Locale;

public class Item {
    private String name;
    private double price;
    private double weight;

    public Item(String name, int price, double weight){  
       this.name = name;
       this.price = price;
       this.weight = weight;
         
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    }
    @Override
    public String toString() {
        //todo: форматирование и доп. логику лучше выносить в отдельный метод. toString отвечает только за toString
        // + метод .format() также может выбрасывать исключение (ArithmeticException), которое должно быть корректно обработано
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        String formattedPrice = currencyFormat.format(price);
        return  "Name: " + name +
                ", Price: " + formattedPrice +
                ", Weight: " + weight +
                '}';
    }


}
