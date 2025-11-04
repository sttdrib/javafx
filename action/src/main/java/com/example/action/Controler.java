package com.example.action;

public class Controler {

    public void left(){
        System.out.print("Go to left from " + MainStage.circle_x  + ", " + MainStage.circle_y);
        com.example.action.MainStage.circle_x -= 20;
        System.out.print(" to " + MainStage.circle_x  + ", " + MainStage.circle_y +" \n");
    }

    public void right(){
        System.out.print("Go to right from " + MainStage.circle_x  + ", " + MainStage.circle_y);
        com.example.action.MainStage.circle_x += 20;
        System.out.print(" to " + MainStage.circle_x  + ", " + MainStage.circle_y +" \n");
    }

    public void up(){
        System.out.print("Go to up from " + MainStage.circle_x  + ", " + MainStage.circle_y);
        com.example.action.MainStage.circle_y -= 20;
        System.out.print(" to " + MainStage.circle_x  + ", " + MainStage.circle_y +" \n");
    }

    public void down(){
        System.out.print("Go to down from " + MainStage.circle_x  + ", " + MainStage.circle_y);
        com.example.action.MainStage.circle_y += 20;
        System.out.print(" to " + MainStage.circle_x  + ", " + MainStage.circle_y +" \n");
    }

}
