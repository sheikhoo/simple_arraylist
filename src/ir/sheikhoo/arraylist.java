package ir.sheikhoo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Show list of item,add new item and remove the item of ArrayList
 * @author Mohammad Sadegh Sheeikh Zahedi :)
 * @see ArrayList
 */
public class arraylist {
    public static ArrayList<String> mystring=new ArrayList<String>();

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int commandNumber;

        // add default item
        mystring.add("Mohammad Saleh");
        mystring.add("Mohammad Sadegh");
        mystring.add("Amir Ali");
        System.out.println("My String Size is => " + mystring.size());

        // Loop until enter 4
        loop: while (true) {
            System.out.println("===============What do you want to do?==============\n" +
                    "                    ¯\\_(ツ)_/¯                     \n" +
                    "1. Print list of item\n" +
                    "2. Add new item\n" +
                    "3. Remove a item\n" +
                    "4. Exit");
            System.out.print("Command Number: ");
            // Get command number
            commandNumber = sc.nextInt();
            System.out.println("====================================================\n");

            switch (commandNumber){
                /* (1)Show list of ArrayList item
                   (2)Add New item to ArrayList
                   (3)Remove item from ArrayList
                   (4)Exit
                 */
                case 1:
                    printList();
                    break;
                case 2:
                    addNew();
                    break;
                case 3:
                    removeItem();
                    break;
                case 4:
                    break loop;
            }
        }
    }

    // Show list of ArrayList item
    public static void printList(){
        int index=1;
        System.out.println("\n=====================List Of Items====================");
        for(String item:mystring){
            System.out.println(index++ + " " + item);
        }
        System.out.println("====================================================\n");
        Continue();
    }

    //Add New item to ArrayList
    public static void addNew(){
        Scanner sc=new Scanner(System.in);
        String name;

        System.out.println("\n=====================Add new Item====================");
        System.out.print("Enter the name: ");
        name=sc.nextLine();
        mystring.add(name);
        System.out.println(name + " is added!");
        System.out.println("====================================================\n");
        Continue();
    }

    // Remove item from ArrayList
    public static void removeItem(){
        Scanner sc=new Scanner(System.in);
        int removeIndex;
        String name;

        System.out.println("\n=====================Remove Item====================");
        //Show list of item
        printList();

        System.out.print("Enter indexof item: ");
        removeIndex=sc.nextInt();
        removeIndex--;
        name=mystring.get(removeIndex);
        mystring.remove(removeIndex);
        System.out.println(name + " is removed!");
        System.out.println("====================================================\n");
        Continue();
    }

    //Wait to press Enter
    public static void Continue(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Press Enter to continue...");
        sc.nextLine();
    }
}

