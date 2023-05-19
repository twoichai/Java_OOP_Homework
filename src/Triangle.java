public class Triangle {
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

    public Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;

    }
    public double countArea (){
        double s =  (this.a + this.b + this.c) / 2;
        return  (Math.sqrt(s * (s - a) * (s - b) * (s - c)));

    }

}
