import java.util.ArrayList;
import java.util.Scanner;
public class ToDoList{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<String> tasks=new ArrayList<>();
        int choice;
        do{
            System.out.println("-----To Do List-----");
            System.out.println("1.Add Task");
            System.out.println("2.View Tasks");
            System.out.println("3.Complete Task");
            System.out.println("4.Exit");
            System.out.print("Enter a choice:");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Enter task:");
                    String task=sc.nextLine();
                    tasks.add(task);
                    System.out.println("Task Added");
                    break;
                case 2:
                    if(tasks.isEmpty()){
                        System.out.println("No tasks Available");
                    }
                        else{
                            for (int i=0;i<tasks.size();i++) {
                                System.out.println((i+1)+"."+tasks.get(i));
                                }    
                         }
                    break;
                case 3:
                    System.out.print("Enter task number to complete:");
                    int n=sc.nextInt();
                    if (n>=1 && n<=tasks.size()) {
                        tasks.set(n-1,tasks.get(n-1)+"[Completed]");
                        System.out.println("Task completed!");
                    } else {
                        System.out.println("Invalid task number");
                    }
                    break;
                case 4:
                    System.out.print("Goodbye!");
                    break;
                default:
                    System.out.print("Please enter a valid choice");
                     }
        }while(choice!=4);
        sc.close();
    }
}