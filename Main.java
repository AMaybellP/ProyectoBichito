
public class Main {

	public static void main(String []args)
	{
		Robot bichito= new Robot();
		
		System.out.println("--inicio--");
		
		while(bichito.getCordenadaX()!=bichito.getLaberinto().getXf() && bichito.getCordenadaY()!=bichito.getLaberinto().getYf())
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
		System.out.println("--fin--");
		
		
	}
}
