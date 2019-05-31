package com.sameer.streaminputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Driver {
    public static void main(String args[]){
       BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
       try {
           String s = reader.readLine();
           String s2 = reader.readLine();
           PrintWriter writer = new PrintWriter(System.out,true);
           writer.println(s);
           writer.println(s2);

       }catch (IOException e){
           System.out.println("IOException caught");
       }
    }
}
