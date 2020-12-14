package com.yurgen.tasks_java;

public class Bool_Sleep {

    public static void main(String[] args){

    }
    public boolean sleepIn (boolean weekday, boolean vacation) {
        if(!weekday || vacation){
            return true;
        }
        return false;
    }
}
