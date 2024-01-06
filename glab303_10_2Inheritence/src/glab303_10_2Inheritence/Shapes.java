package glab303_10_2Inheritence;

public class Shapes {
	   
	private String color;
	   protected double area = 1.0;
	   protected double base = 1.0;
	   protected double width = 1.0;
	   protected double height = 1.0;
	   
	   /** Constructs a Shape instance with only the given color */
	 public Shapes(String color) {
		 this.color= color;
	 }

	 public Shapes(){
		 
	   }
	 
	 public Shapes(String color, double area,double base, double width, double height) {
		 this.color=color;
		 this.area=area;
		 this.base=base;
		 this.width=width;
		 this.height=height;
	 }
	 
	 //getters and setters
	 
	 public void setColor(String color) {

		 this.color=color;
}
	 
	 public void setBase(double base) {
		 this.base=base;
	 }
	 
	 public void setWidth(double width) {
		 this.width=width;
	 }
	 
	 public void setHeight(double height) {
		 this.height=height;
	 }
	 
	 public String getColor(String color) {
		 return color;
	 }
	 
	 public double getBase(double base) {
		 return base;
	 }
	 
	   /** All shapes must provide a method called getArea() */
	   public double getArea() {
	       // We have a problem here!
	       // We need to return some value to compile the program.
	       System.out.println("Shape unknown! Cannot compute area!");
	       return 0;
	   }
	   
	   public void displayshapName(){
	       System.out.println("I am a Shape.");
	   }
	
	   {

	 }
}
