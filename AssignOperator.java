public class AssignOperator{
public static void main(String[] args){
byte a= 1;
short b= 2000;
int c= 67;
long d= 6788999l;
char item= 'c';
float e=4.4f;
double f=5.66;
System.out.println(a+b);

System.out.println(a-b);

System.out.println(a*b);
System.out.println(a/b);

System.out.println(a%b);

int p=a++;
System.out.println(p);
System.out.println(a);
int y=++a;
System.out.println(y);

int g=a--;
System.out.println(g);
System.out.println(a);
int h=--a;
System.out.println(h);

System.out.println(a+=b);
System.out.println(a-=b);
System.out.println(a*=b);
System.out.println(a/=b);
System.out.println(a%=b);

}
}