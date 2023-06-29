public class Equality{
  public static void main(String args[]) {
 int [] array1 = {2,3,4,5}; 
int []array2 = {2,3,4,5};
boolean output= true;

if(array1.length != array2.length){
output=false;
}
else
{

for(int i=0;i<array1.length;i++){
if(array1[i] != array2[i]){
output=false;
break;
}
}
}

System.out.println(output);
}
}
