package Seminar.Seminar6;

import java.security.KeyStore.Entry;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;

public class katz {
    int parId; // ID кота
    String parName; //Имя кота
    Date parBirthDate;//Дата рождения кота
    String parModel;//Порода
    String parColour;//Цвет
    int parPrice;//Цена    
    HashMap <Date,String> parVisitStory; //История посещений
    Date parVisit; // Дата следующего визита
    String[]parColours= new String[]{"Black","Orange","White"};
    String[]parModels= new String[]{"StreetCat","Persian","Bengal"};

    
    katz(int argId,String argName, Date argBirthday){
        Random rand = new Random();
        this.parId = argId;
        parName = argName;
        parBirthDate = argBirthday;
        parColour = parColours[rand.nextInt(parColours.length)];
        parModel = parModels[rand.nextInt(parModels.length)];
        priceCalc();
    }    
    katz(int argId,String argName){
        Date curDate =new Date(); 
        Random rand = new Random();
        parId = argId;
        parName = argName;
        parBirthDate = Date.from(curDate.toInstant());
        parColour = parColours[rand.nextInt(parColours.length)];
        parModel = parModels[rand.nextInt(parModels.length)];
        priceCalc();

    }
    void priceCalc(){
        switch (parModel) {
            case "StreetCat":
                parPrice =10;              
                break;
            case "Persian":
                parPrice =20;
                break;
            case "Bengal":
                parPrice =30;
                break;            
        }
    }
    
public void info(){
    System.out.printf("Имя кота %s\n", parName);
    System.out.printf("Порода кота %s\n",parModel);    
    System.out.printf("Дата рождения кота %s\n",parBirthDate.toString());
    System.out.printf("Цвет кота %s\n",parColour);    
    System.out.printf("Цена кота %d\n",parPrice);
}
    
}
