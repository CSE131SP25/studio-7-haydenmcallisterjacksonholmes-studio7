package studio7;

public class Rectangle {
	private double length;
    private double width;
    private double area;
    private double perimeter;
    private boolean isSquare;
    private boolean isBigger;
	
	public Rectangle(double width, double length) {
		this.length = length;
	    this.width = width;
		area = length*width;
		perimeter = 2*length + 2*width;
		}

	public boolean isSquare() {
		isSquare = false;
		if(length == width) {
			isSquare = true;
		}
		return isSquare;
		}
	
	public void Print() {
		System.out.println("Area :" + area);
		System.out.println("Perimeter :" + perimeter);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(1.0,2.0);
		Rectangle r2 = new Rectangle(4.0,4.0);
		System.out.println("Rectangle 1 stats: ");
		r1.Print();
		System.out.println("Is it square? " + r1.isSquare());
		boolean larger = false;
		if (r1.area>r2.area) {
			larger = true;
		}
		else {
			larger = false;
		}
		System.out.println("Is it larger than the other one?: " + larger);
		System.out.println();
		System.out.println("Rectangle 2 stats: ");
		r2.Print();
		System.out.println("Is it square? " + r2.isSquare());
		larger = false;
		if (r2.area>r1.area) {
			larger = true;
		}
		else {
			larger = false;
		}
		System.out.println("Is it larger than the other one?: " + larger);
		
		
	}
}