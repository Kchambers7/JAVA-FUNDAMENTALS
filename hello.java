public class hello {
    public static void main(String[] args) {



        // YOU MUST START WITH MAIN

        // EX:  btw you dont use Main as your class all the time its whatever your class is supposed to be 
    class Main {
        public static void main(String[] args) {

           System.out.println("Hello World");
        }
    }

// HOW TO PRINT
     System.out.println("Hello World");

     // VARIABLES
     int num = 5;
     double doubley = 4.6;
     String name = "KC";
     boolean isSchool = false;

     System.out.println(num);
     System.out.println(doubley);
     System.out.println(name);
     System.out.println(isSchool);

  
     if (name.equals("KC")) {
        System.out.println("Hey girl hey!!!");
     } else {
        System.out.println("hey KC");
     }

     while(num < 18) {
        System.out.println("Girl, Hey!");
        // num = num + 1; 
        num++;
     }

     for (int i = 0; i < 20; i++){
        System.out.println(i);  
     }
   }
}


// File name must be the same as the clas name 
// Every file IS a class 

public class Test {

    // The file or class with the exact method signature below
    // is always the launching point of the application 
    // You cannot run a Java program without it. 
	public static void main(String[] args) {

        // for now, all your code goes in here!
        // think of Main as the launchpad for all your applications. 
        // file and class names MUST match
	}
}
