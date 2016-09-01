#include "simpletools.h"
#include "abdrive.h"
#include "ping.h"

int turn = 1;
//Pin sensor frontal, 8
//Pin sensor derecha, 9
int main()
{
	while(turn ==1){
		//drive_rampStep(115,115);
		if(ping_cm(9) < 10 && ping_cm(8) > 10{ //A la derecha tenga pared y enfrente este libre
			drive_goto(30,30); 
		}
		if(ping_cm(9)> 10{
			drive_goto(26,-25);
		}
}
