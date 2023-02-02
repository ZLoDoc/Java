package OOP.Lecture.Lecture3.Ex004;

import OOP.Lecture.Lecture3.Ex004.ExBeverage.*;

// три вода
public class Program {
    public static void main(String[] args) {
        Coffee latte = new Coffee();
        latte.addComponent(new Milk("milk"));
        latte.addComponent(new Beans("зерна"));
        latte.addComponent(new Water("вода"));
        
        for (var ingredient : latte) {
            System.err.println(ingredient);
            
        }
    }
}