/**
*Laberinto. Clase que contiene el o los laberintos que el robot debe superar
*@version: 1.0
*@author: Gladys de La Roca, 15755 // Jackeline Hidalgo, 15776 // Steven Rubio, 15044 // Andrea Pena, 15127
*@since 2016-08-03
*/
import java.lang.reflect.Array;

public class Laberinto {

	//private char[][] T = new char[10][10];
	//Se deben cambiar coordenadas de X y Y final e inicial, y la dimension segun el laberinto
	private Object[][] T = new Object[8][8];
	private int xi= 1;
	private int yi= 2;
	private int xf= 3;
	private int yf= 7;
	private int dimx=8;
	private int dimy=8;
	
	
	


	public Laberinto(/*int a, int b*/){
		
	/*	T[0]= new Object[] {1,1,1,1,1,1,1,1,1,1};
		T[1]= new Object[] {0,0,0,0,0,0,0,0,0,1};
		T[2]= new Object[] {1,0,1,1,1,0,1,1,0,1};
		T[3]= new Object[] {1,0,1,1,1,0,1,1,0,1};
		T[4]= new Object[] {1,0,0,0,0,0,0,1,0,1};
		T[5]= new Object[] {1,1,1,1,0,1,0,1,0,1};
		T[6]= new Object[] {1,0,1,1,0,1,0,1,1,1};
		T[7]= new Object[] {1,0,1,1,0,1,0,0,0,1};
		T[8]= new Object[] {1,0,0,0,0,1,1,1,0,1};
		T[9]= new Object[] {1,1,1,1,1,1,1,1,0,1};*/
		/**
		 * 
		 * private int xf= 18;
		private int yf= 1;	  
		 * T[0] =new Object[] {1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,0 ,1 };
		 T[1]= new Object[] {1 ,0 ,1 ,0 ,1 ,0 ,0 ,0 ,0 ,1 ,0 ,0 ,0 ,0 ,1 ,0 ,0 ,0 ,0 ,1 };
		 T[2]= new Object[] {1 ,0 ,1 ,0 ,0 ,0 ,1 ,1 ,0 ,1 ,0 ,1 ,0 ,1 ,1 ,0 ,0 ,0 ,1 ,1 };
		 T[3]= new Object[] {1 ,0 ,1 ,0 ,1 ,1 ,1 ,0 ,0 ,1 ,0 ,1 ,0 ,0 ,0 ,0 ,1 ,0 ,1 ,1 };
		 T[4]= new Object[] {1 ,0 ,0 ,0 ,1 ,0 ,0 ,0 ,1 ,1 ,0 ,1 ,1 ,1 ,1 ,0 ,1 ,0 ,1 ,1 };
		 T[5]= new Object[] {1 ,1 ,1 ,1 ,1 ,0 ,1 ,1 ,1 ,1 ,0 ,0 ,0 ,0 ,1 ,0 ,1 ,0 ,1 ,1 };
		 T[6]= new Object[] {1 ,0 ,1 ,0 ,0 ,0 ,1 ,0 ,0 ,1 ,1 ,1 ,1 ,0 ,1 ,0 ,0 ,0 ,1 ,1 };
		 T[7]= new Object[] {1 ,0 ,1 ,0 ,0 ,0 ,1 ,0 ,0 ,1 ,0 ,0 ,1 ,0 ,1 ,1 ,1 ,1 ,1 ,1 };
		 T[8]= new Object[] {1 ,0 ,0 ,0 ,1 ,1 ,1 ,0 ,0 ,1 ,0 ,0 ,1 ,0 ,0 ,0 ,0 ,0 ,0 ,1 };
		 T[9]= new Object[] {1 ,0 ,1 ,1 ,1 ,0 ,0 ,0 ,0 ,1 ,0 ,1 ,1 ,1 ,1 ,1 ,1 ,0 ,1 ,1 };
		T[10]= new Object[] {1 ,0 ,0 ,0 ,0 ,0 ,1 ,1 ,1 ,1 ,0 ,0 ,0 ,0 ,0 ,0 ,0 ,0 ,0 ,1 };
		T[11]= new Object[] {1 ,1 ,1 ,1 ,0 ,1 ,1 ,0 ,0 ,1 ,0 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 };
		T[12]= new Object[] {1 ,0 ,0 ,1 ,0 ,1 ,0 ,0 ,0 ,0 ,0 ,0 ,0 ,0 ,1 ,0 ,0 ,0 ,0 ,1 };
		T[13]= new Object[] {1 ,1 ,0 ,1 ,0 ,1 ,0 ,0 ,0 ,1 ,1 ,1 ,1 ,0 ,1 ,0 ,1 ,0 ,1 ,1 };
		T[14]= new Object[] {1 ,1 ,0 ,0 ,0 ,0 ,0 ,0 ,0 ,1 ,0 ,0 ,0 ,0 ,0 ,0 ,1 ,0 ,0 ,1 };
		T[15]= new Object[] {1 ,1 ,0 ,1 ,0 ,1 ,1 ,1 ,1 ,1 ,0 ,0 ,1 ,1 ,1 ,0 ,1 ,0 ,1 ,1 };
		T[16]= new Object[] {1 ,0 ,0 ,0 ,0 ,1 ,0 ,0 ,0 ,1 ,0 ,0 ,1 ,0 ,1 ,0 ,1 ,0 ,0 ,1 };
		T[17]= new Object[] {1 ,0 ,1 ,0 ,1 ,1 ,0 ,1 ,0 ,1 ,0 ,0 ,1 ,0 ,0 ,0 ,1 ,0 ,1 ,1 };
		T[18]= new Object[] {1 ,0 ,1 ,0 ,0 ,0 ,0 ,1 ,0 ,0 ,0 ,0 ,1 ,0 ,1 ,0 ,0 ,0 ,0 ,1 };
		T[19]= new Object[] {1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 };

		 * 
		 */
		 
		 /* Object[8][6] inicio(0,3) fin(6,1)
 	T[0]= new Object[] {1,0,1,1,1,1,1,1};
	T[1]= new Object[] {1,0,0,0,0,1,0,1};
	T[2]= new Object[] {1,0,1,1,0,1,0,1};
	T[3]= new Object[] {1,0,1,1,0,1,0,1};
	T[4]= new Object[] {1,0,0,0,0,0,0,1};
	T[5]= new Object[] {1,1,1,1,0,1,1,1};
	*/
	
	//Object[8][8] inicio(0,3) fin(5,0)
	T[0]= new Object[] {1,1,1,1,1,1,1,1};
	T[1]= new Object[] {1,0,1,0,0,0,0,1};
	T[2]= new Object[] {0,0,0,0,1,1,0,1};
	T[3]= new Object[] {1,1,0,1,1,1,0,1};
	T[4]= new Object[] {1,0,0,0,0,0,1,1};
	T[5]= new Object[] {1,1,1,1,1,0,1,1};
	T[6]= new Object[] {1,0,0,0,0,0,0,1};
	T[7]= new Object[] {1,1,1,0,1,1,1,1};
	
	
	/* Object[8][14] inicio(2,7) fin(8,7)
	T[0]= new Object[] {1,1,1,1,1,1,1,1};
	T[1]= new Object[] {1,1,0,0,0,0,0,1};
	T[2]= new Object[] {1,1,0,1,1,1,0,1};
	T[3]= new Object[] {1,1,0,1,1,1,0,1};
	T[4]= new Object[] {1,0,0,0,0,0,0,1};
	T[5]= new Object[] {1,1,1,0,1,0,0,0};
	T[6]= new Object[] {1,1,1,0,1,0,1,1};
	T[7]= new Object[] {1,0,0,0,1,0,1,1};
	T[8]= new Object[] {1,0,1,1,0,0,1,1};
	T[9]= new Object[] {1,1,1,1,0,1,1,1};
	T[10]= new Object[] {1,1,0,0,0,1,0,1};
	T[11]= new Object[] {1,0,0,1,0,1,0,0};
	T[12]= new Object[] {1,1,1,1,0,0,0,1};
	T[13]= new Object[] {1,1,1,1,1,1,1,1};
	*/
	
	/* Object[7][7] inicio(0,1) fin(3,0)
	T[0]= new Object[] {1,1,1,1,1,1,1};
	T[1]= new Object[] {1,0,0,1,0,0,1};
	T[2]= new Object[] {1,0,1,1,0,0,1};
	T[3]= new Object[] {0,0,0,0,0,0,1};
	T[4]= new Object[] {1,1,1,1,0,1,1};
	T[5]= new Object[] {1,0,0,0,0,0,1};
	T[6]= new Object[] {1,0,1,1,1,1,1};
	
	*/
	
	/* Object[8][10] inicio(1,7) fin(8,0)
	T[0]= new Object[] {1,1,1,1,1,1,1,1};
	T[1]= new Object[] {0,0,0,0,1,1,1,1};
	T[2]= new Object[] {1,1,1,0,0,0,0,1};
	T[3]= new Object[] {1,0,0,1,0,1,1,1};
	T[4]= new Object[] {1,1,0,0,0,0,0,1};
	T[5]= new Object[] {1,1,1,1,1,1,0,1};
	T[6]= new Object[] {1,1,0,0,0,0,0,1};
	T[7]= new Object[] {1,0,0,1,0,1,1,1};
	T[8]= new Object[] {1,1,1,1,0,0,0,0};
	T[9]= new Object[] {1,1,1,1,1,1,1,1};
	*/
	
		
		
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
	

	public int getDimx() {
		return dimx;
	}


	public void setDimx(int dimx) {
		this.dimx = dimx;
	}


	public int getDimy() {
		return dimy;
	}


	public void setDimy(int dimy) {
		this.dimy = dimy;
	}


	public Object[][] getT() {
		return T;
	}

	public void setT(Object[][] t) {
		T = t;
	}	
		
	
	
}

