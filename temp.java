import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class temp {
    public static void main(String[] args) throws IOException {
       
        File file = new File("e://_temp/text.txt");
        if (file.exists());{
            file.createNewFile();
        }
        
        FileWriter fileWriter = new FileWriter(file); 
            
       
       
    }
}
