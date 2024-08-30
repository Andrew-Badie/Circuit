package coe318.lab6;
import java.util.ArrayList;
/**
*
* @author andre
*/
public class Circuit {
public ArrayList<Resistor> resistors=new ArrayList<Resistor>();
private static Circuit instance =null;
public static Circuit getInstance() {
if (instance == null)
{ instance = new
Circuit();
}
return instance;
}
public void add(Resistor resistor){
resistors.add(resistor);
}
public String toString(){
String List = "\n";
for(Resistor resistor:resistors){
List+=resistor.toString()+"\n";
}
return List;
}
private Circuit() {} //Yes, the constructor is PRIVATE!
public static void main(String[] args) {
    
}
}
