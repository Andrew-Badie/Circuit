package coe318.lab6;
/**
*
* @author andre
*/
public class Node {
private int num;
private static int num2 = -1;
public Node(){
num2++;
num=num2;
}
public String toString (){
String List = ""+num;
return List;
}
public static void main(String[] args) {
Node a = new Node();
Node b = new Node();
System.out.println(""+a+" "+b);
}
}