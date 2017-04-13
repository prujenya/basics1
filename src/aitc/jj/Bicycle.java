package aitc.jj;

/**
 * Created by Studenta on 03.04.2017.
 */
public class Bicycle {

    String color = "";
    int speed = 0;
    int length = 0;

    void changeSpeed(int val){

        speed = speed + val;

    }

    void changeColor(String col){

        color = col;
    }

    void changeLength(int val){
        length = length + val;

    }

    void printState(){

        System.out.println("color: " + color + ", speed: " + speed + ", length: " + length);

    }

}
