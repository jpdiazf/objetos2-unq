package practica3;

public class Point {
	Integer x;
	Integer y;
	
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	
	public Point(Integer x, Integer y) {
		this.x = x;
		this.y = y;
	}
	
	Integer getX() {
		return x;
	}
	
	Integer getY() {
		return y;
	}
	
	public void move(Integer offSetX, Integer offSetY) {
		this.x += offSetX;
		this.y += offSetY;
	}
	
	public void sumar(Point point) {
		this.x += point.getX();
		this.y += point.getY();
	}
}
