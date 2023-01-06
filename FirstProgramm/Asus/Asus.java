package asus;

import objects.Notebook;

public class Asus extends Notebook {

    // нельзя создать экземпляр, т.к. protected
    // вызывающий класс MyFirstProgram должен находиться в другом пакете
    protected Asus(String name) {
        super(name, false);// запрещаем записывать диски
    }
}
