package com.example.week1_testv3;

public class Room {
    public final boolean isInfected;
    public boolean visited = false;
    Room(boolean infected){
        isInfected = infected;
    }

    public static boolean isOutbreak(Room[][] floor) {
        int count = 0;

        for (int row = 0; row < floor.length; row++) {
            for (int col = 0; col < floor[row].length; col++) {
                Boolean contagion;
                String s = floor[row][col].isInfected ? "X" : " ";
                if (floor[row][col].visited) s = "O";

                if (floor[row][col].isInfected) {
                    count++;
                    if (floor[row + 1][col].isInfected) {
                        count++;
                        if (floor[row + 2][col].isInfected) {
                            count++;
                            if(floor[row + 3][col].isInfected) {
                                count++;
                                if(floor[row + 4][col].isInfected) {
                                    count++;
                                }
                                if(floor[row+3][col+1].isInfected){
                                    count++;
                                }
                                if(floor[row+3][col-1].isInfected){
                                    count++;
                                }
                            }
                            if(floor[row+2][col+1].isInfected){
                                count++;
                                if(floor[row+3][col+1].isInfected){
                                    count++;
                                }
                                if(floor[row+2][col+2].isInfected){
                                    count++;
                                }

                            }

                            if(floor[row+2][col-1].isInfected){
                                count++;
                                if(floor[row+2][col-2].isInfected){
                                    count++;
                                }
                                if(floor[row+3][col-1].isInfected){
                                    count++;
                                }
                            }
                        }
                        if(floor[row+1][col-1].isInfected){
                            count++;

                            if(floor[row+2][col-1].isInfected){
                                count++;
                                if(floor[row+3][col-1].isInfected) {
                                    count++;
                                }
                                if(floor[row+2][col-2].isInfected) {
                                    count++;
                                }

                            }
                            if(floor[row+1][col-2].isInfected) {
                                count++;
                                if(floor[row+2][col-2].isInfected) {
                                    count++;
                                }
                                if(floor[row][col-2].isInfected) {
                                    count++;
                                }
                                if(floor[row+1][col-3].isInfected) {
                                    count++;
                                }
                            }
                        }
                        if(floor[row+1][col+1].isInfected){
                            count++;

                            if(floor[row+2][col+1].isInfected){
                                count++;
                                if(floor[row+3][col+1].isInfected) {
                                    count++;
                                }
                                if(floor[row+2][col+2].isInfected) {
                                    count++;
                                }

                            }
                            if(floor[row+1][col+2].isInfected) {
                                count++;
                                if(floor[row+2][col+2].isInfected) {
                                    count++;
                                }
                                if(floor[row][col+2].isInfected) {
                                    count++;
                                }
                                if(floor[row+1][col+3].isInfected) {
                                    count++;
                                }
                            }
                        }
                    }
                    if (floor[row][col + 1].isInfected) {
                        count++;
                        if (floor[row][col+2].isInfected) {
                            count++;
                            if(floor[row][col+3].isInfected) {
                                count++;
                                if(floor[row][col+4].isInfected) {
                                    count++;
                                }
                                if(floor[row+1][col+3].isInfected){
                                    count++;
                                }
                            }
                            if(floor[row+1][col+2].isInfected){
                                count++;
                                if(floor[row+1][col+3].isInfected){
                                    count++;
                                }
                                if(floor[row+2][col+2].isInfected){
                                    count++;
                                }

                            }

                        }
                        if(floor[row+1][col+1].isInfected){
                            count++;

                            if(floor[row+1][col+2].isInfected){
                                count++;
                                if(floor[row+1][col+3].isInfected) {
                                    count++;
                                }
                                if(floor[row+2][col+2].isInfected) {
                                    count++;
                                }

                            }
                            if(floor[row+2][col+1].isInfected) {
                                count++;
                                if(floor[row+2][col+2].isInfected) {
                                    count++;
                                }
                                if(floor[row+2][col].isInfected) {
                                    count++;
                                }
                                if(floor[row+3][col+1].isInfected) {
                                    count++;
                                }
                            }
                        }
                    }
                }
                if(count >= 5){
                    //System.out.println();
                    contagion = true;
                    return true;
                }
                else{
                    count = 0;
                    contagion = false;
                }
                System.out.print("[" + contagion + "]");
                //System.out.println();
            }
            System.out.println();
        }

        return false;

    }

    public static void main(String[] args) {

        System.out.println(isOutbreak(getPantsTrue()) );
    }

    public static Room[][] getPantsTrue() {
        Room[][] horizontalTrue = new Room[][]{
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(true), new Room(true), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
        };
        return horizontalTrue;
    }

}
