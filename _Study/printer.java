package _Study;

public class printer {

    private String stroka;
    private Integer number;
    

    public printer() {
    }

    

        
    public printer(String stroka, Integer number) {
        this.stroka = stroka;
        this.number = number;
    }




    void printString(String str){
        System.out.println(str);
    }

    void printBold(String str){
        System.out.println(str.toUpperCase());
    }
        
    void printTwoParams(String stroka, Integer number){
        System.out.println(stroka+" : "+number);
    }
    
    
    
}
