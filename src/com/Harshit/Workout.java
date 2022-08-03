package com.Harshit;

class Workout{
    String day;
    public Workout(String day){
        this.day = day;
    }
    public String workout()
    {
        if(day.equals("Mon") || day.equals("Tue") || day.equals("Wed"))
        {
            return "Workout for " + day + " is Weights";
        }
        return "Workout for " + day + " is Cardio";
    }
}

