import java.util.logging.*;


public class Ex0043 {
    public static void main(String[] args) {
    final Logger logger = Logger.getLogger(Ex0043.class.getName());
       logger.setLevel(Level.INFO);
       
       ConsoleHandler ch = new ConsoleHandler();
      
       logger.addHandler(ch);
       
       SimpleFormatter sFormat = new SimpleFormatter();
       ch.setFormatter(sFormat);
       
       logger.log(Level.WARNING, "Тестовое логирование");
       
       logger.info("Тестовое логирование");

 
    }
    
}
/* */
