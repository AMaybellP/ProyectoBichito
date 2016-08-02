

public class Robot {
	

	private int eje; //1, 2, 3, 4,
	private int cordenadaX;
	private int cordenadaY; 
	private Laberinto laberinto= new Laberinto();
	
	
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
		if(eje == 1){
			eje = 4;
		}else{
			eje = eje - 1;
		}
	}
	
	public void GirarDerecha(){
		if(eje == 4){
			eje = 1;
		}else{
			eje = eje + 1;
		}
	}

	
	public void mover(){
		if(eje==1)
		{
			cordenadaX=cordenadaX+1;
		}
		if(eje==2)
		{
			cordenadaY=cordenadaY+1;
		}
		if(eje==3)
		{
			cordenadaX=cordenadaX-1;
		}
		if(eje==4)
		{
			cordenadaY=cordenadaY-1;
		}
		
	}
	
	public boolean pared(){
		boolean pared=false;
		if(eje==1)
		{
			if(laberinto.getT()[cordenadaX+1][cordenadaY] == '-' /*o == pared*/){
				pared=true;
			}
		}
		if(eje==2)
		{
			if(laberinto.getT()[cordenadaX][cordenadaY+1] == '-' /*o == pared*/){
				pared=true;
			}
		}
		if(eje==3)
		{
			if(laberinto.getT()[cordenadaX-1][cordenadaY] == '-' /*o == pared*/){
				pared=true;
			}
		}
		if(eje==4)
		{
			if(laberinto.getT()[cordenadaX][cordenadaY-1] == '-' /*o == pared*/){
				pared=true;
			}
		}
		return pared;
	}
	
	public boolean verificarD(){
		boolean puedo=true;
		if(eje==1)
		{
			if(laberinto.getT()[cordenadaX][cordenadaY-1] == '-' /*o == pared*/){
				puedo=false;
			}
		}
		if(eje==2)
		{
			if(laberinto.getT()[cordenadaX-1][cordenadaY] == '-' /*o == pared*/){
				puedo=false;
			}
		}
		if(eje==3)
		{
			if(laberinto.getT()[cordenadaX][cordenadaY+1] == '-' /*o == pared*/){
				puedo=false;
			}
		}
		if(eje==4)
		{
			if(laberinto.getT()[cordenadaX+1][cordenadaY] == '-' /*o == pared*/){
				puedo=false;
			}
		}
		return puedo;
	}
	
	public void avanzar()
	{
		if (verificarD()==true)
		{
			GirarDerecha();
			mover();
		}
		else
		{
			while(pared()==true)
			{
				GirarIzquierda();
			}
			if(pared()==false)
			{
				mover();
			}
		}
	}

}
