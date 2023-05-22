public class Triangle {
   
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(int sideA, int sideB, int sideC){ 
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;

    }
    
    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    //todo: при наличии гэттэров и сэттэров в классе, обращаться к полям класса всегда лучше с их помощью
    // это более целостно обеспечивает выполнение одного из принципов ООП - инкапсуляция (твой вариант тоже возможен)
    public double countArea () {
        double s =  (this.sideA + this.sideB + this.sideC) / 2;
        return  (Math.sqrt(s * (s - getSideA()) * (s - getSideB()) * (s - getSideC())));

    }

}
