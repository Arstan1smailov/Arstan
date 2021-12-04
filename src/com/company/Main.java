package com.company;

public class Main {

    public static void main(String[] args) {
        walkingSchedule(32, 19);
        walkingSchedule(16, 4);
        walkingSchedule(52, 36);
        walkingSchedule(46, 1);
        walkingSchedule(7, 22);
        walkingSchedule(generateRandomAge(),generateRandomAge());

    }
    public static int generateRandomAge(){
    int min = -40;
    int max = 45;
    int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
    return random_int;
}
    public static String walkingSchedule(int age, int temperature) {
        if ((age >= 20 && age <= 40) && (temperature >= -20 && temperature <= 30)) {
            System.out.println("Можно идти гулять");
        } else if ((age <= 20) && (temperature >= 0 && temperature <= 25)) {
            System.out.println("Можно идти гулять");
        } else {
            System.out.println("Оставайтесь дома");
        }
        return "";
    }
}
