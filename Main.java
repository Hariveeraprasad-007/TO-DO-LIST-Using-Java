
import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    public static void main(Strings args[]){
        Array<ListString> tasks=new ArrayList<>();
        Scanner scanner=new Scannner(System.in);
        boolean running=true;
        while(running){
            System.out.println("\nTo Do List menu:");
            System.out.println('1.Add a task');
            System.out.println('2.Remove a task');
            System.out.println('3.Update a task');
            System.out.println('4.View tasks');
            System.out.println('5.Exit');
            String input=scanner.nextline();
            int choice;
            try{
                choice=Interer.parseInt(input);
            }
            catch(NumberFormatException e){
                System.out.println("Please enter the number in the range of 1-5.");
                continue;
            }
            switch(choice){
                case 1:
                    System.out.println("Please enter the description: ");
                    String task=scanner.nextline();
                    if(!task.trim().isEmpty()){
                        tasks.add(task);
                        System.out.println("Task added sucessfully");
                    }
                    else{
                        System.out.println("Description may be empty");
                    }
                    break;
                case 2:
                    if(tasks.isEmpty()){
                        System.out.println("No tasks to remove");
                    }
                    else{
                        display(tasks);
                        System.out.println("Please the enter the index of the task that to be removed");
                        try{
                            int index=Integer.parseInt(scanner.nextline())-1;
                            if(index>0 && index<task.size()){
                                tasks.remove(index);
                                System.out.println("Task removed succesfully.");
                            }
                            else{
                                System.out.println("enter valid index");
                            }
                        }
                        catch(NumberFormatException){
                            System.out.println("Please enter correct index.")
                        }
                    }
            }

        }
    }
}