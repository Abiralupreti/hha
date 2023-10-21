package com.chatgp.Util;

public class UtilClass extends Thread{

    public void run(){
        try {

            System.out.println("Current "+ Thread.currentThread().getName()+ " "+ Thread.currentThread().getId());

        }catch (Exception e){
            e.printStackTrace();

        }
    }



}


