//import java.util.Scanner;
import java.util.*;
class Demo {
    public static void main(String args[]){        
        Scanner obj = new Scanner(System.in);
        System.out.println("how many number do you want to store?");
        int n = obj.nextInt();
        int []id=new int[n];
        String []name = new String[n];
        float []salary = new float[n];
        String []desg=new String[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the id");
            id[i]=obj.nextInt();
            System.out.println("Enter the name");
            name[i]=obj.next();
            System.out.println("Enter the salary");
            salary[i]=obj.nextFloat();
            System.out.println("Enter the Desg");
            desg[i]=obj.next();
        }  
        for(int i=0;i<n;i++){
            if(desg[i].equals("Manager")){
                  salary[i]=salary[i]+5000;  
            }else if(desg[i].equals("Developer")){
                   salary[i]=salary[i]+3000; 
            }else {
                salary[i]=salary[i]+1500;
            }
        }
        System.out.println("All details are");
        for(int i=0;i<n;i++){
            System.out.println("id is "+id[i]);
            System.out.println("name is "+name[i]);
            System.out.println("salary is "+salary[i]);
            System.out.println("desg is "+desg[i]);
        }
    }
}