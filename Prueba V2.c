/*
  Blank Simple Project.c
  http://learn.parallax.com/propeller-c-tutorials 
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
      drive_speed(32,32); //Avanza
      pause(500);
      high(26);
      high(27);
      //drive_goto(25,-26); //Gira derecha
      drive_speed(32,-32);
      pause(700);
      //drive_speed(0,0);
      low(26);
      low(27);
      drive_speed(32,32); //Avanza
      pause(1200);
      //drive_speed(0,0);
    }      
    if(irRight == 0 && ping_cm(8)<12){    //Si hay pared a la derecha y enfrente 
      
      drive_speed(0,0);
     //Gira izquierda
      drive_speed(-32,32);
      pause(800);
      drive_speed(0,0);
     }else{ //Si no hay pared enfrente
        drive_speed(32,32);
        pause(50);
    }

     
    
  }  
}
