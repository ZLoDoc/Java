package main;

import asus.AsusModel1;
import asus.AsusModel2;
import objects.Computer;
import objects.Monitor;
import objects.Notebook;
import toshiba.ToshibaModel1;
import toshiba.ToshibaModel2;

public class StartProgram {

    public static void main(String[] args) {
        Computer comp =null;
        comp.print("test string2");
        Computer.print("test string");
        
        // 7 урок, задание 2, полиморфизм: создание метода connect для каждой модели ноутбуков
        // вызов в классе Monitor с использованием полиморфизма
        Computer toshiba1 = new ToshibaModel1("T1");
        // Computer toshiba2 = new ToshibaModel2("T2");
        
        Computer asus1 = new AsusModel1("A1");
        // Computer asus2 = new AsusModel2("A2");
        
        // Computer note1 = new Notebook("Note1");
        // Computer comp1 = new Computer("Comp1");
        
        // Monitor monitor = new Monitor();
         
        
        // monitor.connectDevice(toshiba1);
        // monitor.connectDevice(toshiba2);
        // monitor.connectDevice(asus1);
        // monitor.connectDevice(asus2);
        // monitor.connectDevice(note1);
        // monitor.connectDevice(comp1);
        
        // ToshibaModel1 mod1 = (ToshibaModel1)asus1;



     
    }
    
    
}
