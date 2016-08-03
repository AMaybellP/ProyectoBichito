

public class Robot {
	

	private int eje; //1, 2, 3, 4,
	private int cordenadaX;
	private int cordenadaY; 
	private Laberinto laberinto= new Laberinto();
	

	/**
	 *Constructor  
	 */
	public Robot(){
		this.setCordenadaX(laberinto.getXi());
		this.setCordenadaY(laberinto.getYi());
		this.setEje(1);
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
	public Laberinto getLaberinto() {
		return laberinto;
	}
	public void setLaberinto(Laberinto laberinto) {
		this.laberinto = laberinto;
	}
	
	
	/*Metodos */
	public void GirarIzquierda(){
		if(eje == 1){
			setEje(4);
		}else{
			setEje(eje-1);
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
		for (int x=0; x < 10; x++) {
  			System.out.print("|");
  			for (int y=0; y < 10; y++) {
  				int p = (int)laberinto.getT()[x][y];
  				if(x == getCordenadaY() && y == getCordenadaX()){
  					System.out.print (222);
  				}else{
  				System.out.print (p);}
  				if (y!=9) System.out.print("\t");
  			}				
  			System.out.println("|");
		}
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
			if((int)laberinto.getT()[cordenadaY][cordenadaX+1] == 1 /*'-' o == pared*/){
				pared=true;
			}
		}
		if(eje==2)
		{
			if((int)laberinto.getT()[cordenadaY+1][cordenadaX] == 1 /*'-' o == pared*/){
				pared=true;
			}
		}
		if(eje==3)
		{
			if((int)laberinto.getT()[cordenadaY][cordenadaX-1] == 1 /*'-' o == pared*/){
				pared=true;
			}
		}
		if(eje==4)
		{
			if((int)laberinto.getT()[cordenadaY-1][cordenadaX] == 1 /*'-' o == pared*/){
				pared=true;
			}
		}
		return pared;
	}
	
	public boolean verificarD(){
		boolean puedo=true;
		if(eje==1)
		{
			if((int)laberinto.getT()[cordenadaY+1][cordenadaX] == 1 /*'-' o == pared*/){
				puedo=false;
			}
		}
		if(eje==2)
		{
			if((int)laberinto.getT()[cordenadaY][cordenadaX-1] == 1 /*'-' o == pared*/){
				puedo=false;
			}
		}
		if(eje==3)
		{
			if((int)laberinto.getT()[cordenadaY-1][cordenadaX] == 1 /*'-' o == pared*/){
				puedo=false;
			}
		}
		if(eje==4)
		{
			if((int)laberinto.getT()[cordenadaY][cordenadaX+1] == 1 /*'-' o == pared*/){
				puedo=false;
			}
		}
		return puedo;
	}
	
	public void avanzar()
	{
		if (verificarD()==true)
		{
			System.out.println("giro derecha");
			GirarDerecha();
			System.out.println("avanzo");
			mover();
		
		}
		else
		{
			while(pared()==true)
			{
				System.out.println("giro izquierda");
				GirarIzquierda();
				
			}
			if(pared()==false)
			{
				System.out.println("avanzo");
				mover();
				
			}
		}
	}

}


