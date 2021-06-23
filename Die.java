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

public class Die {//class starts

 private int currentSideUp;   // Number showing on the die(current side up).
 private int numberOfSides;   // Number of sides of the die.
 private String diceType;     // Type of dice



public Die() {// a constructor which set default side number 6 and dice type d6
    diceType="d6";//store dice type in  data member
    numberOfSides=6;// store number of sides in data member
    System.out.println("Creating a default d6...");
                // Constructor.  Rolls the dice, so that they initially have random side up
    roll(6);// Call the roll() method to roll the dice.
}



public Die(int numberOfSides) {// a constructor which accept number of sides as parameter and make dice type as d(numberOfSides)
    diceType="d"+numberOfSides;//store dice type in  data member
    this.numberOfSides=numberOfSides;// store number of sides in data member,  here this keyword is used to differentiate local and global numberOfSides
    System.out.println("Creating a "+diceType+"...");
                // Constructor.  Rolls the dice, so that they initially have random side up
    roll(this.numberOfSides);  // Call the roll() method to roll the dice.  here this keyword is used to differentiate local and global numberOfSides
}



public Die(int numberOfSides, String diceType) {// a constructor which accept number of sides and dice type as parameter 
    this.diceType=diceType;//store dice type in  data member . here this keyword is used to differentiate local and global diceType
    this.numberOfSides=numberOfSides;// store number of sides in data member . here this keyword is used to differentiate local and global numberOfSides
    System.out.println("Creating "+this.diceType+" die (a special d"+this.numberOfSides+")...");
    // Constructor.  Rolls the dice, so that they initially have random side up
    roll(this.numberOfSides);  // Call the roll() method to roll the dice. here this keyword is used to differentiate local and global numberOfSidesS
}




public void roll(int numberOfSides ) { // a mutator or member function which roll dice once 
    // Roll the dice by setting each of the dice to be
    // a random number between 1 and numberOfSides 
    currentSideUp = (int)(Math.random()*numberOfSides) + 1;
}



public int roll2(int numberOfSides ) {//a mutator or member function which roll dice once , same as roll() but it returns current side up also
    currentSideUp = (int)(Math.random()*numberOfSides) + 1;// a random number between 1 and numberOfSides 
    return currentSideUp;// return current side up od instance of class( a die) at point where it is called
}


public void display(){// a accessor which display current side up of particlar instance whcih calls this .(or a particular dice object)
    if(diceType.equals("d6")){//this is default case , so we set static value d6 for dice 1
    System.out.println("The current side up for d6 is "+currentSideUp);
if(currentSideUp==numberOfSides){//if currentSide Up equals numberOfSides this condition runs
System.out.println("YAY! It's a "+numberOfSides);}}
    else {// this depends on input dice type and its sides.
    System.out.println("The current side up for d"+numberOfSides+" is "+currentSideUp);
if(currentSideUp==numberOfSides){//if currentSide Up equals numberOfSides this condition runs
System.out.println("YAY! It's a "+numberOfSides);}}
}//display end

public int display2(){// a accessor which display current side up of particlar instance whcih calls this and alsp return currentSideUp for comarison in DiceGame.java .(or a particular dice object)
    if(diceType.equals("d6")){//this is default case , so we set static value d6 for dice 1
    System.out.println("The current side up for d6 is "+currentSideUp);
if(currentSideUp==numberOfSides){//if currentSide Up equals numberOfSides this condition runs
System.out.println("YAY! It's a "+numberOfSides);}}
    else {// this depends on input dice type and its sides.
    System.out.println("The current side up for d"+numberOfSides+" is "+currentSideUp);
if(currentSideUp==numberOfSides){//if currentSide Up equals numberOfSides this condition runs
System.out.println("YAY! It's a "+numberOfSides);}}
return currentSideUp;
}//display end

 
 public void changeNumberOfSides(int numberOfSides){// to change number of sides
this.numberOfSides = numberOfSides;
}

public  void changeDiceType(String diceType){ // to change dice type
this.diceType = diceType;
}

}//class ends
