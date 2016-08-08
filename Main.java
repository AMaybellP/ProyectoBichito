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
		
		System.out.println("-------------------------------------------------------------------------");
		for (int x=0; x < bichito.getLaberinto().getDimx(); x++) {
  			System.out.print("|");
  			for (int y=0; y < bichito.getLaberinto().getDimy(); y++) {
  				int p = (int)bichito.getLaberinto().getT()[x][y];
  				if(x == bichito.getLaberinto().getYi()-1 && y == bichito.getLaberinto().getXi()-1){
  					System.out.print (222);
  				}else{
  				System.out.print (p);}
  				if (y!=9) System.out.print("\t");	
  				}
  			System.out.println("|");
  			}
		
		while(bichito.getCordenadaX()!=bichito.getLaberinto().getXf() || bichito.getCordenadaY()!=bichito.getLaberinto().getYf())
		{
			//System.out.println("Eje: "+bichito.getEje()+"   X: "+bichito.getCordenadaX()+"   Y: "+bichito.getCordenadaY());
			bichito.avanzar();
			try
			{
				Thread.sleep(1500);
			} 
			catch(InterruptedException ex)
			{
				Thread.currentThread().interrupt();
			}
		}
		System.out.println("-------------------------------------------------------------------------");
		for (int x=0; x < bichito.getLaberinto().getDimx(); x++) {
  			System.out.print("|");
  			for (int y=0; y < bichito.getLaberinto().getDimy(); y++) {
  				int p = (int)bichito.getLaberinto().getT()[x][y];
  				if(x == bichito.getCordenadaY() && y == bichito.getCordenadaX()){
  					System.out.print (222);
  				}else{
  				System.out.print (p);}
  				if (y!=9) System.out.print("\t");	
  				}
  			System.out.println("|");
  			}
		
		System.out.println("-------------------------------------------------------------------------");
		for (int x=0; x < bichito.getLaberinto().getDimx(); x++) {
  			System.out.print("|");
  			for (int y=0; y < bichito.getLaberinto().getDimy(); y++) {
  				int p = (int)bichito.getLaberinto().getT()[x][y];
  				if(x == bichito.getCordenadaY() && y == bichito.getCordenadaX()){
  					System.out.print (p);
  				}else{
  				System.out.print (p);}
  				if (y!=9) System.out.print("\t");	
  			}
  			System.out.println("|");
  			}
		
		System.out.println("-------------------------------------Haz salido!------------------------------(222)");
		
		System.out.println("El laberinto ha sido resuelto en: "+bichito.getPasos()+" pasos.");
	}
}
