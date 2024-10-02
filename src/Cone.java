
public class Cone extends Shape{
    private double radius;
    private double height;

    
    // Complete this class
    
    public Cone(double radius, double height) {
    	// Complete this constructor
    	this.radius = radius;
    	this.height = height;
    	calculateArea();
    	calculateVolume();
    }
    
    
    public void calculateArea() {
    	double area = Math.PI * radius *(radius + Math.sqrt(height * height + radius * radius));
    	addToSurfaceArea(area);

    }
    public void calculateVolume() {
    	double volume = (Math.PI* radius * radius * height) / 3;
    	addToVolume(volume);
    }

    
}
