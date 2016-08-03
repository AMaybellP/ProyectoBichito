
public class Main {

	public static void main(String []args)
	{
		Robot bichito= new Robot();
		
		System.out.println("inicio");
		
		while(bichito.getCordenadaX()!=bichito.getLaberinto().getXf() && bichito.getCordenadaY()!=bichito.getLaberinto().getYf())
		{
			System.out.println("Eje: "+bichito.getEje()+"   X: "+bichito.getCordenadaX()+"   Y: "+bichito.getCordenadaY());
			bichito.avanzar();
		}
		
		System.out.println("fin");
		
	}
}
