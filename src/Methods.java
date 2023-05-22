import java.util.Scanner;

public class Methods {


    public String makeATable(int value) {

        for (int i = 1; i <= 10; i++) {
            int temp = value * i;
            System.out.println(value + " x " + i + " = " + temp);

        }
        return ""; // how to do it without return?
    }
    public String paintASquare(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height");
        int height = sc.nextInt();
        System.out.println("Enter the width");
        int width = sc.nextInt();

        for(int i = 0; i < height; i++){
            System.out.println();
            for(int j = 0; j < width; j++) {
                System.out.print("@ ");
            }
        }
        System.out.println();
        System.out.println();
        return "";


    }
}
