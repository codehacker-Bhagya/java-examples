package com.bhagya.practice.model;

public class Train {
    int TrainId;
    String TrainName;
    String TrainRoute;


    public Train(){

    }

    public Train(int id , String Name , String Route){
        this.TrainId = id;
        this.TrainName = Name;
        this.TrainRoute = Route;
    }

    @Override
    public String toString() {
        return "Train{" +
                "TrainId=" + TrainId +
                ", TrainName='" + TrainName + '\'' +
                ", TrainRoute='" + TrainRoute + '\'' +
                '}';
    }
}
