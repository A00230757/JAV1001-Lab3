/*
Program Description:
Die.java --> a class (Die.java) that closely replicates dice:
This class has three different type of constructors to set number of sides of dice , dice type 
and has method to roll the dice and display the up side on dice.
 
DiceGame.java --> a class (having main function) to test your Die class:
This class mae object of Die.java class and has main function . This class make objects of Die.java 
and calls different constructors to set values, get values.

Student Details
Name: Harpreet Singh
Student ID: A00230757
Date:8/6/21
time:17:52
 */
import java.util.Scanner;

public class DiceGame {//class start

public static void main(String args[]){//main start
Scanner myScanner =new Scanner(System.in); 

//by default first dice has 6 sides , so for second and third dice we need user input with below code.
int numberOfSidesDice2;
int numberOfSidesDice3;
String dice3Type ="";
try{System.out.println("\nBy default dice 1 is of 6 sides and its default type is d6");
System.out.println("enter number of  sides for dice 2, dice type will be d(number of sides)");
numberOfSidesDice2 = myScanner.nextInt();
System.out.println("enter number of  sides for dice 3");
numberOfSidesDice3 = myScanner.nextInt();
System.out.println("enter dice type for dice 3");
dice3Type = myScanner.next();
System.out.println("\n");


//creating three different type dice objects (three different instances of Die.java class have their own data members, member functions , mutators,accessors)
Die d1= new Die();//create default d6 dice with number of sides 6 , and rolled after creating its object(roll() method called in constructor)
Die d2= new Die(numberOfSidesDice2);//this constructor accept number of dice and create d(number of dice) type dice . roll() method is called by contrsuctor
Die d3= new Die(numberOfSidesDice3,dice3Type);//this constructor accept both type and number of sides and calll roll() method after creating its object
d1.display();//this member function or accessor display current side up of default d6 dice
d2.display();//this member function or accessor display current side up of dice 2
d3.display();//this member function or accessor display current side up of dice 3

//rolling second time
int compareDice1Side;//to compare which sides match in second rolling
int compareDice2Side;
int compareDice3Side;
System.out.println("\nTesting The Roll Method\n");
d1.roll(6);// roll() method is called which is also a mutator in Die.java and it change current side up on dice 1 by rolling it once
d2.roll(numberOfSidesDice2);// roll() method is called which is also a mutator in Die.java and it change current side up on dice 2 by rolling it once
d3.roll(numberOfSidesDice3);// roll() method is called which is also a mutator in Die.java and it change current side up on dice 3 by rolling it once
System.out.println("Rolling the d6... second time");
compareDice1Side=d1.display2();//this member function or accessor display current side up of dice 1
System.out.println("After Rolling the d"+numberOfSidesDice2+"... second time");
compareDice2Side=d2.display2();//this member function or accessor display current side up of dice 2
System.out.println("After Rolling the d"+numberOfSidesDice3+"... second time");
compareDice3Side=d3.display2();//this member function or accessor display current side up of dice 3
if(compareDice1Side ==compareDice2Side){//if dice 1 and dice 2 sides match
System.out.println("\nThe d6 and d"+numberOfSidesDice2+" values matched ");
}
else if(compareDice2Side ==compareDice3Side){//if dice 2 and dice 3 sides match
System.out.println("\nThe d"+numberOfSidesDice2+" and d"+numberOfSidesDice3+" values matched ");
}
else if(compareDice3Side ==compareDice1Side){//if dice 3 and dice 1 sides match
System.out.println("\nThe d"+numberOfSidesDice3+" and d6 values matched ");
}
else if(compareDice1Side ==compareDice2Side && compareDice2Side ==compareDice3Side){//if dice 1 , dice 2 and dice 4 sides match

System.out.println("\nThe d"+numberOfSidesDice2+" and d"+numberOfSidesDice3+" and d6 values matched ");
}
else{
}


//-------------------------------------------------------------
//Setting the d(numberOfSidesDice2) to show numberOfSidesDice2...(means to get highest value on dice 2)
System.out.println("\nSetting the d"+numberOfSidesDice2+" to show(highest value) "+numberOfSidesDice2+"...\n");
int count=0;// a variable which keeps record of how many times dice is rolled to get highest value on dice
int sideUp;// variable which stores which side up of dice 2 to match it with highest value on dice(number of sides)

while(true){//while start
sideUp=d2.roll2(numberOfSidesDice2);// roll2() mutator is same as roll() whose purpose is to roll dice once but it also returns current side up.
count++;// value of cpunt variable increase till we get higest value , after every roll
//System.out.println(sideUp);
if(sideUp==numberOfSidesDice2){//matching condition when we get current side up equal to number of sides of dice(highest valye)
if(count ==1){//matching condition(excellent case only 1 roll) when we get current side up equal to number of sides of dice(highest valye)
System.out.println("The side up is now "+numberOfSidesDice2+". Finally.\nNumber of times dice(d"+numberOfSidesDice2+") rolled  to get this side : "+count+"\nYAH! its only 1 roll");
}
else{System.out.println("The side up is now "+numberOfSidesDice2+". Finally.\nNumber of times dice(d"+numberOfSidesDice2+") rolled  to get this side : "+count);}
break;// break the loop , matching is their
}
}//while end
//---------------------------------------------------------



//----------------------------------------------------------------
//Creating 5 d6
//BONUS code start here
System.out.println("\n-------\nBONUS-------\nCreating 5 d6");//creating five 6 sided dice
Die sixSided1= new Die();//
Die sixSided2= new Die();
Die sixSided3= new Die();
Die sixSided4= new Die();
Die sixSided5= new Die();
int sideUp1;//variable to store current side up of sixSided1 die
int sideUp2;//variable to store current side up of sixSided2 die
int sideUp3;//variable to store current side up of sixSided3 die
int sideUp4;//variable to store current side up of sixSided4 die
int sideUp5;//variable to store current side up of sixSided5 die
int count1=0; // to keep record of number times all 5 six sided dice rolled

while(true){//while start   // we roll all 5 six sided dice till the current side of all match
sideUp1=sixSided1.roll2(6);// again roll2() method called which roll a dice and return current side up
sideUp2=sixSided2.roll2(6);
sideUp3=sixSided3.roll2(6);
sideUp4=sixSided4.roll2(6);
sideUp5=sixSided5.roll2(6);
count1++;
//System.out.println(sideUp1+","+sideUp2+","+sideUp3+","+sideUp4+","+sideUp5);
if(sideUp1==sideUp2 && sideUp2==sideUp3 && sideUp3==sideUp4 && sideUp4==sideUp5){// when current side up of all dice same 
if(count1 ==1){//condition(excellent case only 1 roll) when current side up of all dice same 
System.out.println("\nYAHTZEE! It took "+count1+" rolls and SIDEUP on all five dice is : "+sideUp1+"\nYAH! its only 1 roll");
}
else{System.out.println("\nYAHTZEE! It took "+count1+" rolls and SIDEUP on all five dice is : "+sideUp1+" ");}
break;// break the loop , as matchong is their
}

//bonus code complete here


}//while end
//--------------------------------------------------------------------


}
catch(Exception ex){System.out.println("enter number of sides of dice in  numeric only , program stopped run again");}//try catch end


}//main end


}//class end
