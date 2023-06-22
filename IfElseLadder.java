public class IfElseLadder {
  public static void main(String args[]) {
  
  
  int age = 55;
  
  if(age < 20) {
  		if(age < 15){
  			System.out.println("You are too young to vote");
  		}
  		else{
  				System.out.println("Just wait a couple of years");
  		}
  }
  else{
  
  	if(age < 40){
  	System.out.println("Thankyou for voting");
  	}
  	else{
  	System.out.println("Special Thankyou for voting");
  	}
  }
}
}