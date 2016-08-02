import java.lang.reflect.Array;

public class Laberinto {

	private Object[] T;
	
	
	public Laberinto(int a, int b){
		this.setT(new Array[a][b]);
	}


	public Object[] getT() {
		return T;
	}

	public void setT(Object[] t) {
		T = t;
	}	
	

}
