public class SwitchProgram {
  public static void main(String args[]) {
  
  
  









int number = 30;
String size;

switch (number)
{
case 29:
size ="small";
break;
case 30:
size ="medium";
break;
case 32:
size ="large";
break;
case 34:
size ="xtralarge";
break;
case 36:
size ="doublextra";
break;
default:
size="unknown";
System.out.println("Select valid Sizes between 29 to 36");
break;
}
System.out.println("Customer selected:"+ size + "." );

   
  }
}