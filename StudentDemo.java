public class StudentDemo {
  public static void main(String args[]) {


Student student1=new Student();
student1.age= 55;
student1.noOfFriends=25;
Student student2=new Student();
student2.age= 55;
student2.noOfFriends=25;
Student student3=new Student();
student3.age= 55;
student3.noOfFriends=25;
Student student4=new Student();
student4.age= 55;
student4.noOfFriends=25;
Student student5=new Student();
student5.age= 55;
student5.noOfFriends=25;
int totalSum= student1.noOfFriends+student2.noOfFriends+student3.noOfFriends+student4.noOfFriends+student5.noOfFriends;
System.out.println(totalSum);
}
}
class Student{
int age;
int noOfFriends;

int noOfFriends(){

return noOfFriends;
}

}
