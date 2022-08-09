package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loops {
    public void loopExample1() {
        for (int i = 1; i <= 10; i++) {
            for(int j=1;j<=10-i;j++){

              System.out.print(" ");

            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
    public void loopExample2() {
        for (int i = 1; i <= 5; i++) {
            for(int j=1;j<=5-i;j++){

                System.out.print(" ");

            }
            int n=i;
            for(int j=1;j<=2*i-1;j++){
                if(i==1 || i==n){
                    System.out.print(" ");
                }
                System.out.print(n);
                n++;
            }

            System.out.println();
        }
    }
    public void loopExample3() {
        for (int i = 1; i <= 5; i++) {
            for(int j=1;j<=5-i;j++){

                System.out.print(" ");

            }
            int n=i;
            for(int j=1;j<=2*i-1;j++){
                if(i==1 || i==n){
                    System.out.print(" ");
                }

                if(n>2*5-1){
                    n--;
                }else{
                    n++;
                }
                System.out.print(n);

            }

            System.out.println();
        }
    }
    public double areaOfCircle(double radius){
        return Math.PI*radius*radius;
    }
    public  int add(int a,int b){
        return a+b;
    }
    public void printDigits() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number ? ");
        int n = scanner.nextInt();
        int i = 0;
        int sum = 0;
        if (n == 0) {
            System.out.println(0);
        } else {
            n = Math.abs(n);
            while (n > 0 || n < 0) {
                sum = sum + (n % 10);
                n = n / 10;
            }
            System.out.println(sum);

        }
    }
    public void reverseDigits() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number ? ");
        int n = scanner.nextInt();
        int i = 0;
        boolean isNegative = false;
        int newNum = 0;
        if (n == 0) {
            System.out.println(0);
        } else {
            if (n < 0) {
                isNegative = true;
            }
            n = Math.abs(n);
            while (n != 0) {
                newNum = newNum * 10 + (n % 10);
                n = n / 10;
            }
            newNum = isNegative ? newNum * -1 : newNum;
            System.out.println(newNum);

        }
    }
    public  void toBinary(int n) {
        String binary = "";
        int i = 0;
        while (n > 0) {
            int digit = n % 2;
            n = n / 2;
            binary += digit;
        }
       System.out.println( this.reverse(binary));
    }
    public int reverse(String s){
        char ch[] =s.toCharArray();
    String reverse = "";
    for(int c= ch.length;c>=0;c++) {
        reverse+=reverse+ch[c];
    }
    return  Integer.valueOf(reverse);
    }
    public  int toDecimal(String n){
        int digit=0;
        int decimal=0;

        char arr[]=n.toCharArray();
        int counter=0;
       for(int i=arr.length-1;i>=0;i--){

           digit=Integer.parseInt(""+arr[i]);
           if(digit>1 && digit<0){
               return 0;
           }

           decimal+=Math.pow(2,counter)*digit;
           counter++;


       }


        System.out.println(decimal);
        return decimal;
    }
    public void primeNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number ? ");
        int n = scanner.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                System.out.println(String.format("%d is not prime", n));
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(String.format("%d is  prime", n));
        }
    }
    public  int maxArray(int [] a){
        int max =a[0];
        for(int i : a){
            if(max<=i){
                max=i;
            }
        }
        return  max;
    }
    public ArrayList<Integer> solve(final List<Integer> A, int B) {
        ArrayList<Integer> sum = new ArrayList(A.size());
        for(int n:A){
            sum.add(n+B);
        }
        return  sum;
    }
    public void insertInArray (){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int position= sc.nextInt();
        int num= sc.nextInt();
        ArrayList<Integer> newArr= new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            if(position-1==i){
                newArr.add(num);

            }
            newArr.add(a[i]);
        }
        for(int ele: newArr){
            System.out.print(" "+ele);
        }
    }
    public  void executeOddEven(){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int arr[]=new int[l];
        ArrayList<Integer> odd= new ArrayList<Integer>();
        ArrayList<Integer>even=new ArrayList<Integer>();
        for(int i=0;i<l;i++){
             arr[i]=sc.nextInt();
        }
        for(int i=0;i<l;i++){
            if(arr[i]%2==0){
                even.add(arr[i]);
            }else{
                odd.add(arr[i]);
            }
        }
        for(int i=0;i<odd.size();i++){
            System.out.print(odd.get(i)+" ");
        }
        for(int i=0;i<even.size();i++){
            System.out.print(even.get(i)+" ");
        }

    }
}
