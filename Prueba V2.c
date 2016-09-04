*/
#include "abdrive.h"
#include "ping.h"
int irRight;
int main()                                    // Main function
{
  // Add startup code here.

 
  while(1)
  {
    freqout(1, 1, 38000);                       // Repeat for right detector
    irRight = input(2);
    if(irRight == 1){ // Si no hay pared a la derecha
      high(26);
      high(27);
      drive_goto(25,-26); //Gira derecha
      drive_speed(0,0);
      drive_goto(29,26);  //Avanza
      low(26);
      low(27);
    }      
    if(irRight == 0 && ping_cm(8)<13){    //Si hay pared a la derecha y enfrente 
      
      drive_speed(0,0);
      drive_goto(-25,26); //Gira izquierda
      pause(50); 
     }else{ //Si no hay pared enfrente
        drive_speed(32,32);
        pause(50);
    }

     
    
  }  
}
