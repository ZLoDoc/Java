// Напишите метод сжимающий строку
package Seminar.Seminar2;

public class task2_sem2 {
    public static void main(String[] args) {
        String result = myRLEcoding(("tttttttest ssssssstriiiiiiiiing"));
        System.out.println(result);

        
    }

    public static String myRLEcoding(String argInput){
        int count = 1;
        String argOutput = "";
        StringBuilder myBuilder = new StringBuilder();

        for( int i =0;i< argInput.length();i++){
            if((i+1)< argInput.length()){
                if (argInput.charAt(i+1) == argInput.charAt(i) && (count < 9)){
                    count++;
                }
                else{
                    myBuilder.append(argOutput);
                    myBuilder.append(count);
                    myBuilder.append(argInput.charAt(i));
                    count = 1;
                        }        }
            else{
                myBuilder.append(argOutput);
                myBuilder.append(count);
                myBuilder.append(argInput.charAt(i));
            }

            
        }
        return myBuilder.toString();
    }
    
}
