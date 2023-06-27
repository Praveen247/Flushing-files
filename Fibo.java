public class Fibo{
  public static void main(String args[]) {
int n=15;
int first=0;
int second=1;
System.out.println("Fibonacci Series: " + first + ", " + second);
for(int i=0;i<n;i++)
{
int next=first+second;
System.out.println(next);
first=second;
second=next;
}

}
}