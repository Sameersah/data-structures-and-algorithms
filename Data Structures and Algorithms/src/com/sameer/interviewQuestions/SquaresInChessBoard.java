package com.sameer.interviewQuestions;

public class SquaresInChessBoard {

    public static void main(String args[]){
        int side =  2;

        System.out.println(getSquaresInChessBoard(side));
    }

    private static int getSquaresInChessBoard(int side){
        int counter=0;
        int endy;
        for(int starty =0;starty<side;starty++){
            endy = starty+1;
            for(int startx=0;startx<side-1;startx++){
                for(int endx = startx+1;endx<=side;endx++){
                    if(endy<=side){
                        System.out.println(startx+""+endx+""+starty+""+endy);
                        counter++;
                    }
                    endy++;
                }
                endy =1;
            }

        }
        return counter;
    }
}
