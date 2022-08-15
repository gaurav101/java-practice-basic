package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //calculateUnit();
       // perfectSqare();
      //  Loops l = new Loops();
       // l.toDecimal("101");
       // Scanner sc = new Scanner(System.in);
      //  int n = sc.nextInt();
       // for(int i=0;i<=n-1;i++){
       //     l.executeOddEven();
       // }
       // l.reverseDigits();
        //l.primeNumber();
        ArrayListExp obj=new ArrayListExp();
       // int a[]={1,2,2,4,5,2};
        // System.err.println(obj.adjecentDiff(a,0));
      //  obj.ArrayListMethods();
        //System.err.println(obj.sumOfArrayListElement());
        ArrayList<Integer> arr= new ArrayList<>();
       /* arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(2);
        arr.add(1);


       System.out.println( obj.countPair(arr,5));

        */
        FileStreamAPI f= new FileStreamAPI();
     //   f.walkDir();
       // f.getIdentityMatrix(4);
        f.printChar("INDIA");
    }
    private static void perfectSqare(){
        int n=getScanner();
        for(int i=1;i<=n;i++){
            if(i*i<=n){
                System.out.print("Perfect square : "+i*i);
                System.out.print("Square Root: "+i);
                System.out.println();
            }
        }

    }
    private static void calculateUnit() {
        int unit = getScanner();
        double totalCharge=0.0;
        if(unit >0 && unit <=50){
            totalCharge=unit*0.5;
        }else if(unit>50 && unit<=150){
            totalCharge=0.75*unit-12.5;
        }else {
            totalCharge=1.2*unit-80;

        }
        System.out.println(totalCharge);
    }

    private static int getScanner() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        return sc.nextInt();
    }
}