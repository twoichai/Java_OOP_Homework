public class Triangle {
    //todo: полям класса лучше всегда давать название, из которого понятно за что отвечает поле
    // например sideA, sideB, sideC - это нужно в том числе для облегчения работы с твоим полями вне твоего класса и облегчения жизни другим разработчикам
    private double a;
    private double b;
    private double c;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public Triangle(int a, int b, int c){ //todo: перенести конструктор
        this.a = a;
        this.b = b;
        this.c = c;

    }

    //todo: при наличии гэттэров и сэттэров в классе, обращаться к полям класса всегда лучше с их помощью
    // это более целостно обеспечивает выполнение одного из принципов ООП - инкапсуляция (твой вариант тоже возможен)
    public double countArea () {
        double s =  (this.a + this.b + this.c) / 2;
        return  (Math.sqrt(s * (s - a) * (s - b) * (s - c)));

    }

}
