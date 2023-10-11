package Opgave1;

public class Task1 {

    boolean nextLetter = false;
    boolean nextLetter2 = false;
    void method1(){
        if(!nextLetter) {
            System.out.print("j");
        } else if(nextLetter2) System.out.print("t");
        else System.out.print("r");

    }
    void method2(){
        if(!nextLetter) {
            System.out.print("a");
        } else if(nextLetter2) System.out.print("o");
        else System.out.print("s");
    }
    void method3(){
        if(!nextLetter) {
            System.out.print("v");
        }
        else System.out.print("j");
    }
    void method4(){
        if(!nextLetter) {
            method2();
            nextLetter = true;
            method4();
            nextLetter = false;
            System.out.print("e");
            nextLetter = true;
            method1();
            nextLetter = true;
            method4();
            method2();
            method3();
            nextLetter2 = true;
            method2();
            nextLetter = false;
            nextLetter2 = false;
            method3();
            nextLetter = true;
            nextLetter2 = true;
            method1();
        }
        else System.out.print(" ");
    }

}
