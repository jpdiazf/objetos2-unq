package practica3;

public class Rectangulo {
	private Point point;
	private Integer ladoHorizontal;
	private Integer ladoVertical;
	
	public Rectangulo(Integer valorX, Integer valorY, Integer ladoHorizontal, Integer ladoVertical) {
		this.ladoHorizontal = ladoHorizontal;
		this.ladoVertical = ladoVertical;
		point = new Point(valorX, valorY);	
	}
	
	public Rectangulo(Integer ladoHorizontal, Integer ladoVertical) {
		this.ladoHorizontal = ladoHorizontal;
		this.ladoVertical = ladoVertical;
		point = new Point();
	}
	
	public Integer getLengthLadoHorizontal() {
		return Math.abs(ladoHorizontal);
	}
	
	public Integer getLengthLadoVertical() {
		return Math.abs(ladoVertical);
	}
	
	public Boolean centrado() {
		return point.getX() == 0 &&
			   point.getY() == 0;
	}
	
	public Integer getArea() {
		return this.getLengthLadoHorizontal() *
			   this.getLengthLadoVertical();
	}
	
	public Integer getPerimetro() {
		return this.getLengthLadoHorizontal() * 2 +
			   this.getLengthLadoVertical() * 2;
	}
	
	public Boolean esHorizontal() {
		return this.getLengthLadoHorizontal() >
			   this.getLengthLadoVertical();
	}
	
	public Boolean esVertical() {
		return this.getLengthLadoHorizontal() <
		   	   this.getLengthLadoVertical();
	}
}