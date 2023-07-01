public class CubeVolume {
  public static void main(String args[]) {

Box box1=new Box(8,9,10);
Box box2=new Box(5,7,10);



// double volume1=box1.volume();





System.out.println(box1.volume()+box2.volume());

}}

class Box{

double height;
double width;
double depth;

Box(double height, double width, double depth){
this.height=height;
this.width=width;
this.depth=depth;


}

double volume()
{
System.out.println(width);

return height*width*depth;


}


}