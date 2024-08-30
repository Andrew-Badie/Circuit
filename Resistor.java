/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coe318.lab6;
/**
*
* @author andre
*/
public class Resistor {
private double resistance;
private int num1;
private static int num= 0;
private Node node1;
private Node node2;
public Resistor(double resistance, Node node1, Node node2){
this.resistance = resistance;
this.node1 = node1;
this.node2= node2;
num++;
num1=num;
if(resistance<0){
throw new IllegalArgumentException("Resistance can't be less than 0");
}
}
public Node [] getNodes(){
Node [] node = new Node [2] ;
node[0]=node1;
node[1]=node2;
return node ;
}
public String toString (){
String List = "R"+num1+" "+node1+" "+node2+" "+resistance;
return List;
}
public static void main(String[] args) {
Node a1 = new Node();
Node b= new Node();
Resistor a = new Resistor(30,a1, b);
a.getNodes();
System.out.println(a);
}
}