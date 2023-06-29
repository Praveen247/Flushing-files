public class Prime{
  public static void main(String args[]) {

boolean flag=true;
for(int n=1;n<=100;n++){

for(int i=2;i<n;i++){
if(n%i==0){
flag=false;
break;
}
}}
if(flag){

System.out.println("prime number");
}
else{
System.out.println("not a prime number");
}
}}