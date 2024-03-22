package com.example;

public class Main {
    
    public static void main(String[] args) {
        Thread[] arrayThread=new Thread[10];
        int[] array=new int[10];
        for(int i=0;i<array.length;i++){
            arrayThread[i]=new Thread(array, i);
        }
        for(int i=0;i<array.length;i++){
            arrayThread[i].start();
        }
        for(int i=0;i<array.length;i++){
           try{
            arrayThread[i].join();

           }catch(InterruptedException e){
            e.printStackTrace();
           }
        }
        for(int i=0;i<array.length;i++){
           System.out.println(array[i]);

        }
    }
}