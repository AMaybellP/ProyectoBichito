
public class Main {

	public static void main(String []args)
	{
		Robot bichito= new Robot();
		
		System.out.println("--inicio--");
		
		while(bichito.getCordenadaX()!=bichito.getLaberinto().getXf() && bichito.getCordenadaY()!=bichito.getLaberinto().getYf())
		{
			//System.out.println("Eje: "+bichito.getEje()+"   X: "+bichito.getCordenadaX()+"   Y: "+bichito.getCordenadaY());
			bichito.avanzar();
			//Impresion laberinto + posicion del bichito
			for (int x=0; x < bichito.getLaberinto().getXf(); x++) {
  				System.out.print("|");
  				for (int y=0; y < bichito.getLaberinto().getYf(); y++) {
   				 System.out.print (bichito.getLaberinto().getT());
   				 System.out.print (bichito.getCordenadaX()+bichito.getCordenadaY());
   					// if (y!=T[x].length-1) System.out.print("\t");
  				}				
  				System.out.println("|");
			}
			try
			{
				Thread.sleep(2000);
			} 
			catch(InterruptedException ex)
			{
				Thread.currentThread().interrupt();
			}
		}
		System.out.println("--fin--");
		
		
	}
}
