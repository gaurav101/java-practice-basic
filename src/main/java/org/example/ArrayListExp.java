package org.example;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayListExp {
    public boolean findInArray(int [] a,int k){
        boolean returunVal=false;
        for (int j : a) {
            returunVal = k == j;
        }
        return returunVal;
    }
    public int findFrequencyArray(int [] a,int k){
        int returunVal=0;
        for (int j : a) {
            if (k == j) {
                returunVal++;
            }
        }
        return returunVal;
    }
    public boolean adjecentDiff(int[] a, int k){
        boolean retVal=false;
        for(int i=0;i<a.length-1;i++){

            if (a[i] + k == a[i + 1]) {
                retVal = true;
                break;
            }

        }
        return retVal;
    }
    public void ArrayListMethods(){
        ArrayList<Integer> a=new ArrayList<Integer>();
        a.add(2);
        a.set(0,4);
        a.get(0);
    }
    public int sumOfArrayListElement(){
        ArrayList<Integer> arr=new ArrayList<>();
        int sum=0;
        for(int i=0;i<10;i++){
            arr.add(i);
        }
        for(int i=0;i<arr.size();i++){
            sum+=arr.get(i);
        }
        return sum;
    }


    public int solve(ArrayList<Integer> A, int B) {
        int a=0;
        for(int i =0;i<A.size();i++){
            if(A.get(i).equals(B)){
                a++;
            }
        }
        return a;
    }
    public int countPair(ArrayList<Integer> A, int B) {
        int count=0;
        for(int i=0;i<A.size();i++){
                int sum=B-A.get(i);
                int index=A.indexOf(sum);
                if(index>=0 && index!=i){
                    count++;
                }

        }
        return count;
    }


}
