import java.lang.reflect.Array;

public class Laberinto {

	private char[][] T = new char[9][9];
	
	
	public Laberinto(/*int a, int b*/){
		//this.setT(new char[9][9]);
		T[0]= new char[] {'-',' ',' ',' ',' ',' ',' ',' ',' ',' ',};
	}


	public char[][] getT() {
		return T;
	}

	public void setT(char[][] t) {
		T = t;
	}	
		
	
	/*Metodos */
	public boolean VerificarDerecha(){
		return false;
	}
	
	public boolean BuscarPared(){
		return false;
	}
	
	
}
