package sk.kosickaakademia.illiaspivak.calculator;

public class My_Calculator extends Calculator {
    public void multiplication(int a, int b) {
        c = a * b;
        System.out.println("Sucin: " + c);
    }
    My_Calculator(int cislo) {
        super(cislo);
    }


    public static void main(String args[]) {
        int a = 10, b = 20;
        My_Calculator cal = new My_Calculator(24);
        cal.addition(a, b);
        cal.subtraction(a, b);
        cal.multiplication(a, b);
        cal.getCislo();
    }
}
