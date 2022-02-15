package work23;

public class Task23 {
    public static void main(String[] args) {
int a = 22;
int b = 33;
        System.out.println("переменная до перестановки: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a -= b;
        System.out.println("Перемменная после перестановки: a = " + a + ", b = " + b);

    }
}
