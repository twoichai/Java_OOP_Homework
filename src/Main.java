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

        //todo: Unnecessary 'toString()' call
        // метод toString() лишний в данном случае
    System.out.println(item1.toString());
    System.out.println(item2.toString());
    System.out.println(item1.getName());
    item2.setName("cookie");
    System.out.println(item2.toString());



        //todo: логику в таблицей умножения нужно вынести в отдельный метод и просто вызвать его в методе main
        // передав в метод два параметра height и width
    // multiplication table task
        int value = 5;
        for(int i = 1; i <= 10; i ++){
            int temp = value * i;
            System.out.println(value + " x "+ i + " = " + temp);

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
        // triangle task
        Triangle triangle1 = new Triangle(5, 4, 7);
        double areaTriangle1 = triangle1.countArea();
        System.out.println(areaTriangle1);
    }

    //todo: PS: файлы с форматом .iml и директорию .idea лучше исключать с помощью .gitignore при пуше в репозиторий
}