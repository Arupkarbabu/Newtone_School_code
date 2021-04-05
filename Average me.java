import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
 int i;
double sum=0;
double a[]=new double[10000000];
Scanner sc= new Scanner(System.in); 
double n= sc.nextInt();

 for(i=1 ;i<=n ;i++)
  a[i]= sc.nextInt();
for(i=1 ;i<=n ;i++)
sum =sum+a[i];

double avg =sum/n;
int k =(int)avg;
System.out.print(k);
	}
}