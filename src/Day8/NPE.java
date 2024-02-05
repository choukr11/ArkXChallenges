package Day8;

import java.util.Scanner;

public class NPE {
    Scanner sc = new Scanner(System.in);
    double a;

    public NPE(int a) {
        this.a = a;
    }
    public NPE(){}
    public double squareRoot(){
        return a*a;
    }
}
