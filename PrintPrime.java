public class PrintPrime{

  public static void main(String args[]) {


for(int n=2;n<=100;n++){
boolean flag=true;

for(int i=2;i<n;i++){
if(n%i==0){
flag=false;

}
}
if(flag){
System.out.println(n);
}

}

}}