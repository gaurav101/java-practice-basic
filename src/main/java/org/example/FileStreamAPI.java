package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileStreamAPI {
    public void walkDir(){
        Path p = Paths.get("/Users/gauravsingh/Downloads");
        boolean isDirectory= Files.isDirectory(p);
        try{
            Stream<Path> s= Files.walk(p);
         long count=   s.filter(path -> Files.isDirectory(path))
                            .count();

            System.out.println(count);
        }catch (IOException ex){
            ex.printStackTrace();
        }

    }
    public void transponse(){
        int a[][]={{1,2,3},{4,5,6}};
        int t[][]=new int [3][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                t[j][i]=a[i][j];
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
               System.out.print(t[i][j]+" ");
            }
            System.out.println();
        }
    }
    public  int [][] getIdentityMatrix(int size){
        int [][]id=new int[size][size];
        for (int i=0;i<size;i++){
         id[i][i]=1;
        }
        for (int i=0;i<size;i++){
            System.out.print(" |");
            for(int j=0;j<size;j++) {
                System.out.print(id[i][j]+" ");
            }
            System.out.print("|");
            System.out.println();
            }
        return  id;
    }
    public void printChar(String s){
        char [] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            System.out.println((int)ch[i]);
        }
    }
}
