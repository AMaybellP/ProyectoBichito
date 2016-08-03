/**
*Main. Clase Que corre el programa
*@version: 1.0
*@author: Gladys de La Roca, 15755 // Jackeline Hidalgo, 15776 // Steven Rubio, 15044 // Andrea Pena, 15127
*@since 2016-08-03
*/

public class Main {

	public static void main(String []args)
	{
		Robot bichito= new Robot();
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("------------Bienvenido, veras como el robot sale del laberinto------------");
		System.out.println("-------------------El 2 es el robot, 1 pared y 0 camino-------------------");
		System.out.println("------------------------------------inicio--------------------------------");
		
		while(bichito.getCordenadaX()!=bichito.getLaberinto().getXf() || bichito.getCordenadaY()!=bichito.getLaberinto().getYf())
		{
			//System.out.println("Eje: "+bichito.getEje()+"   X: "+bichito.getCordenadaX()+"   Y: "+bichito.getCordenadaY());
			bichito.avanzar();
			try
			{
				Thread.sleep(2000);
			} 
			catch(InterruptedException ex)
			{
				Thread.currentThread().interrupt();
			}
		}
		System.out.println("-------------------------------------Fin!--------------------------------");
		
		
	}
}
