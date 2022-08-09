package org.example;

public class ArrayListExp {
    public boolean findInArray(int [] a,int k){
        boolean returunVal=false;
        for(int i=0;i<a.length;i++){
            if(k==a[i]){
                returunVal= true;
            }else {
                returunVal= false;
            }
        }
        return returunVal;
    }
    public int findFrequencyArray(int [] a,int k){
        int returunVal=0;
        for(int i=0;i<a.length;i++){
            if(k==a[i]){
                returunVal++;
            }
        }
        return returunVal;
    }
    public boolean adjecentDiff(int a[],int k){
        boolean retVal=false;
        for(int i=0;i<a.length-1;i++){

                if(a[i]+k==a[i+1]){
                    retVal=true;
                }

        }
        return retVal;
    }
}
