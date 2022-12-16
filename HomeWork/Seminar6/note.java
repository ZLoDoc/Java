package HomeWork.Seminar6;
import java.util.HashMap;
import java.util.Random;



public class note {
    int modelId; // ID модели
    public String name; // название производителя
    Integer sizeScr; //диагональ экрана
    String color;//цвет
    String cpu;//модель процессора
    Integer memory;// количество ОЗУ
    Integer hddSize; // размер жесткого диска
    String osType;// тип операционной системы
    public static String[]names=new String[]{"Accer","Asus","HP","Samsung","Dell"};
    Integer[]sizeScrs=new Integer[]{14,15,16,17,19,21};    
    public static String[]colors=new String[]{"White","Black","Silver"};
    public static String[]cpus=new String[]{"Intel","AMD"};
    Integer[]memories=new Integer[]{8,16,32,64,128,256};
    public static Integer[]hdds=new Integer[]{512,1,2,4};
    String[]osVariant=new String[]{"Windows","macOs","Linux","None"};
      
    
    public note(int modId){
        Random rnd = new Random();
        // for (int i=0;i<names.length;i++){
            this. modelId = modId;

            name = names[rnd.nextInt(names.length)]; 
            sizeScr = sizeScrs[rnd.nextInt(sizeScrs.length)];
            color = colors[rnd.nextInt(colors.length)];
            cpu = cpus[rnd.nextInt(cpus.length)];
            memory = memories[rnd.nextInt((memories.length))];
            hddSize = hdds[rnd.nextInt(hdds.length)];
            osType=osVariant[rnd.nextInt(osVariant.length)];
        }


        public void info(){
            System.out.println("======================================");
            System.out.printf("название производителя %s \n", name);
            System.out.printf("диагональ экрана %d\n",sizeScr);    
            System.out.printf("цвет %s\n",color.toString());
            System.out.printf("Тип процессора %s\n",cpu);    
            System.out.printf("количество ОЗУ %d\n",memory);
            System.out.printf("размер жесткого диска %d\n",hddSize);
            System.out.printf("Тип операционной системы %s\n",osType);
            System.out.println("======================================"); 
        
        }


      
       
}
