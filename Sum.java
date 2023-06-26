public class Sum{
  public static void main(String args[]) {
int []arr= {4,5,2,8,3,6};
int sumeven=0;
int sumodd=0;
for(int i=0;i<arr.length;i++){
if(i%2==0){
sumeven=sumeven+arr[i];
}
else
sumodd+=arr[i];
}

String result=sumeven>sumodd?"sum at even indices is greatest":"sum at odd indices is greatest";

System.out.println(result);

}
}
