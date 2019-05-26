package com.n8programs;

import java.util.Scanner;

public class DecisionTree {
    private static Scanner sc = new Scanner(System.in);
    private String message;
    private DecisionTree choice1;
    private DecisionTree choice2;
    private boolean end = false;
    public DecisionTree(String message, DecisionTree choice1, DecisionTree choice2){
        this.message = message;
        this.choice1 = choice1;
        this.choice2 = choice2;
    }
    public DecisionTree(String message){
        this.message = message;
        end = true;
    }
    public static void tell(DecisionTree story){
        System.out.println(story.message);
        if(story.end == true) return;
        String answer = sc.nextLine();
        switch (answer) {
            case "yes":
            case "Yes":
            case "YES":
                tell(story.choice1);
                break;
            default:
                tell(story.choice2);
                break;
        }
    }
}
