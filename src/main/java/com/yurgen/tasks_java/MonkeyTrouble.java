package com.yurgen.tasks_java;

public class MonkeyTrouble {

    public static void main(String []args){

    }
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) {
            return true;
        }
        return ((aSmile && bSmile) || (!aSmile && !bSmile));

        // The above can be shortened to:
        //   return ((aSmile && bSmile) || (!aSmile && !bSmile));
        // Or this very short version (think about how this is the same as the above)
        //   return (aSmile == bSmile);
    }
}
