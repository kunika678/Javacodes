import java.util.*;

class Eom{
    private int n,a[],i;
    
    public void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of n :");
        n = sc.nextInt();
        a = new int[n];
        System.out.println("Enter number in n:");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        
    }
    public void display(){
        
        System.out.println("Display List of Numbers ");
        for(i=0;i<n;i++){
            System.out.println(a[i]);
        }
       
        
    }
    public void even(){
        for(i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
            System.out.println("Number is even "+a[i]);
            }
        }
        
    
    }
    public void odd(){
        for(i=0;i<n;i++)
        {
            if(a[i]%2!=0)
            {
            System.out.println("Number is odd "+a[i]);
            }
        }
    }
    public void max()
    {
        int max;
        max=a[0];
        for(i=1;i<n;i++){
            if(max<a[i])
        {
            max=a[i];
        }
        System.out.println("Max : "+max);
        }    
    }    
}
public class Maths {
    
    public static void main(String args[]){
        Eom x = new Eom();
        x.accept();
        x.display();
        x.even();
        x.odd();
        x.max();
    }    
}
