import java.lang.reflect.Array;

public class Laberinto {

	private Robot robotPrueba;
	private Object[] T;
	
	public Laberinto(int a, int b){
		this.setRobotPrueba(new Robot(a,b));
		this.setT(new Array[9][9]);
	}

	public Robot getRobotPrueba() {
		return robotPrueba;
	}



	public void setRobotPrueba(Robot robotPrueba) {
		this.robotPrueba = robotPrueba;
	}


	public Object[] getT() {
		return T;
	}

	public void setT(Object[] t) {
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
