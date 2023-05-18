import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    // product/item task
        Item item1 = new Item(
                "Potato",
                (int) 2.5,
                2.4);

        Item item2 = new Item(
                "Cookie",
                (int) 1.2,
                0.200);

    System.out.println(item1.toString());
    System.out.println(item2.toString());

    item2.setName("cookie");
    System.out.println(item2.toString());


    // multiplication table task
        int five = 5;
        for(int i = 1; i <= 10; i ++){
            int temp = five * i;
            System.out.println("5 x "+ i + " = " + temp);

        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height");
        int height = sc.nextInt();
        System.out.println("Enter the width");
        int width = sc.nextInt();

        for(int i = 0; i < height; i++){
            System.out.println();
            for(int j = 0; j < width; j++) {
            System.out.print("@ ");
        }}
    }
}