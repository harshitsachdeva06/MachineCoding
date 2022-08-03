package com.Harshit;


import java.util.*;


public class Main {
    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        System.out.println("Enter The Number Of Users You Allow To Register in Application");
        int n = input.nextInt();
//        String name;
//        int pass;
        ArrayList<Pair> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        HashMap<String,String> map1 = new HashMap<>();


        map.put("6am-7am",0);
        map.put("7am-8am",0);
        map.put("8am-9am",0);
        map.put("6pm-7pm",0);
        map.put("7pm-8pm",0);
        map.put("8pm-9pm",0);

        System.out.println("Enter Limit Per Batch");
        int limit = input.nextInt();

        for (int i = 0; i <n; i++){
            System.out.println("Enter User Details");
            list.add(new Pair(input.next(),input.nextInt()));
            System.out.println("User Added");
        }
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).c == 1){
                System.out.println(list.get(i).a +" is registered at Koramangala");

                System.out.println("Enter your prefered timing : ");

                boolean reg = false;
                while(!reg) {
                    String time = input.next();
                    if (map.get(time) > limit) {
                        System.out.println("This Batch Full Please Entre Different Timing");
                        continue;
                    }
                    map.put(time, map.getOrDefault(time, 0) + 1);
                    map1.put(list.get(i).a , time);
                    reg = true;
                }
            }
            else if(list.get(i).c == 2){
                System.out.println(list.get(i).a +" is registered at Bellandur");
                System.out.println("Enter your prefered timing : ");
                boolean reg = false;
                while(!reg) {
                    String time = input.next();
                    if (map.get(time) > limit) {
                        System.out.println("This Batch Full Please Entre Different Timing");
                        continue;
                    }
                    map.put(time, map.getOrDefault(time, 0) + 1);
                    map1.put(list.get(i).a,time);
                    reg = true;
                }
            }
            else{
                System.out.println("You Can Register on 2 Branches");
            }
        }



        // Workout for particular day
        System.out.println("Enter Day For Which You Want To Check Workout Details");
        String Day = input.next();
        Workout workout = new Workout(Day);
        System.out.println(workout.workout());

        System.out.println("To Check The user Details Please Enter username");
        String userName = input.next();

        if(map1.containsKey(userName)){
            System.out.println("Workout Schedule For This User Will Be:"+map1.get(userName));
        }
    }
}
