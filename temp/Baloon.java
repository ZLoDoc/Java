package temp;

import java.util.Iterator;

public class Baloon implements Iterator <String> {
    public Integer number;
    public String color;
    
    public Baloon(Integer number, String color) {
        this.number = number;
        this.color = color;
        this.index=0;
    }
    
    int index;

    @Override
    public boolean hasNext() {
        return index++ < 2;
       
    }

    @Override
    public String next() {
    if (index == 1) return String.format("number = %d ",number);
    else return String.format("color = %s",color);
   }
    
    
   
   
    
    
}
