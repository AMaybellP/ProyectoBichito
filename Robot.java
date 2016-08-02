public class Robot {
	

	private int eje; //1, 2, 3, 4,
	private int cordenadaX;
	private int cordenadaY; 
	
	/**
	 *Constructor  
	 */
	public Robot(int a, int b){
		this.setCordenadaX(a);
		this.setCordenadaY(b);
		this.setEje(0);
	}
	/**
	 *
	 */
	public int getEje() {
		return eje;
	}

	public void setEje(int eje) {
		this.eje = eje;
	}

	public int getCordenadaY() {
		return cordenadaY;
	}

	public void setCordenadaY(int cordenadaY) {
		this.cordenadaY = cordenadaY;
	}

	public int getCordenadaX() {
		return cordenadaX;
	}

	public void setCordenadaX(int cordenadaX) {
		this.cordenadaX = cordenadaX;
	}
	
	/*Metodos */
	public void GirarIzquierda(){
		if(this.eje == 1){
			this.eje = 4;
		}else{
			this.eje = this.eje - 1;
		}
	}
	
	public void GirarDerecha(){
		if(this.eje == 4){
			this.eje = 1;
		}else{
			this.eje = this.eje + 1;
		}
	}
	
	public boolean VerificarDerecha(){
		return false;
	}
	
	public boolean BuscarPared(){
		return false;
	}
	

	public void mover(){
		if(eje == 1){
			this.cordenadaX = this.cordenadaX+1;
		}if(eje == 2){
			this.cordenadaY = this.cordenadaY+1;
		}if(eje == 3){
			this.cordenadaX = this.cordenadaX-1;
		}else{
			this.cordenadaY = this.cordenadaY-1;
		}
		
	}

}

