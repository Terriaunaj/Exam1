
public class Cuboid extends Shape {
	private double length;
	private double width;
	private double height;

	public Cuboid(double length, double width, double height) {
		// Complete this constructor
		this.length = length;
		this.width = width;
		this.height = height;
		surfaceArea();
		calculateVolume();
		
	}
	
	// Complete this class
	
	public void surfaceArea() {
		double area = (2*length*width) + (2*length*height)+(2*height*width);
		addToSurfaceArea(area);
	}
	public void calculateVolume() {
		double volume = length*width*height;
		addToVolume(volume);
	}

}