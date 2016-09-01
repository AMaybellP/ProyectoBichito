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
		if(ping_cm(9) > 11){ //no hay pared a la derecha
            drive_goto(28,-27);//girar derecha
            drive_goto(29,26); }                            
     /*if(ping_cm(8) > 10){ //no hay pared enfrente
			drive_goto(29,26); 
      }
      else{
      drive_goto(-28,27);} //girar izquierda
      }*/
      
		else{
        drive_goto(-28,27);//girar izquierda
  }   } }

