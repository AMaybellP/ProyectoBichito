import java.lang.reflect.Array;

public class Laberinto {

	private char[][] T = new char[10][10];
	private int xi= 0;
	private int yi= 1;
	private int xf= 8;
	private int yf= 9;
	
	
	

	public Laberinto(/*int a, int b*/){
		//this.setT(new char[9][9]);
		T[0]= new char[] {'-','-','-','-','-','-','-','-','-','-'};
		T[1]= new char[] {' ',' ',' ',' ',' ',' ',' ',' ',' ','-'};
		T[2]= new char[] {'-',' ','-','-','-',' ','-','-',' ','-'};
		T[3]= new char[] {'-',' ','-','-','-',' ','-','-',' ','-'};
		T[4]= new char[] {'-',' ',' ',' ',' ',' ',' ','-',' ','-'};
		T[5]= new char[] {'-','-','-','-',' ','-',' ','-',' ','-'};
		T[6]= new char[] {'-',' ','-','-',' ','-',' ','-','-','-'};
		T[7]= new char[] {'-',' ','-','-',' ','-',' ',' ',' ','-'};
		T[8]= new char[] {'-',' ',' ',' ',' ','-','-','-',' ','-'};
		T[9]= new char[] {'-','-','-','-','-','-','-','-',' ','-'};
	}


	public int getXi() {
		return xi;
	}


	public void setXi(int xi) {
		this.xi = xi;
	}


	public int getYi() {
		return yi;
	}


	public void setYi(int yi) {
		this.yi = yi;
	}


	public int getXf() {
		return xf;
	}


	public void setXf(int xf) {
		this.xf = xf;
	}


	public int getYf() {
		return yf;
	}


	public void setYf(int yf) {
		this.yf = yf;
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
