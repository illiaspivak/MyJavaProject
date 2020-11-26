package sk.kosickaakademia.illiaspivak.calculator;

public class Calculator {
    int c;

    public void addition(int a, int b) {
        c = a + b;
        System.out.println("Summa: " + c);
    }

    public void subtraction(int a, int b) {
        c = a - b;
        System.out.println("Rozdiel: " + c);
    }

    int cislo;

    Calculator(int cislo) {
        this.cislo = cislo;
    }

    public void getCislo() {
        System.out.println("Hodnota  premennej cislo je: " + cislo);
    }
}
