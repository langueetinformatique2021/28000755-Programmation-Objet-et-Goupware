package devoir7;

public class Cercle extends FigureGeometrique implements Comparable {
	protected float rayon = 0;

	public Cercle(float r){
		super("rouge");
		rayon = r;
	}

	public int compareTo(Object arg0) {
		Cercle c = (Cercle) arg0;
		if(c.rayon < rayon) return 1;
		if(c.rayon > rayon) return -1;
		return 0;
	}

	@Override
	public float perimetre() {
		// TODO Auto-generated method stub
		return (float)(2*Math.PI*rayon);
	}

	@Override
	public float surface() {
		// TODO Auto-generated method stub
		return 0;
	}

}
