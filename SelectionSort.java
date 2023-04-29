import java.util.*;

class Selection{
    private int n, i, j, t ;
    private int a[] ;
    
    public void enter(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n :");
        n = sc.nextInt();
        System.out.print("Enter elements : ");
        a = new int[n];
        
        for(i=0;i<n;i++){
            a[i] = sc.nextInt();            
        }
    }
    
    public void display(){        
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        
    }
    
    public void sorting(){
        for(i=0;i<=n-2;i++){
            for(j=i+1;j<=n-1;j++){
                if(a[i]>a[j]){
                    t = a[i];
                    a[i]=a[j];
                    a[j]=t;    
                }
            }
        }        
    }    
}
   
public class SelectionSort {
    public static void main(String args[]){
        Selection y = new Selection();
        y.enter();
        System.out.print("Display Elements Before Selection Sorting : ");
        y.display();
        y.sorting();
        System.out.print("Display Elements After Selection Sorting : ");
        y.display();
    }
    
}
