/*Universidad del Valle de Guatemala
Algoritmos y Estructura de Datos
Proyecto 1. Grupo x
Steven Rubio, Andrea Peña, Jackeline Hidalgo, Gladys de la Roca
*/

#include "abdrive.h"
#include "ping.h"
int irRight;
int main()                                    // Main function
{
  // Add startup code here.

 
  while(1)
  {
    freqout(1, 1, 33000);                       // Repeat for right detector
    irRight = input(2);
   if(ping_cm(8)>50){ //Salida del laberinto 
       drive_speed(64,64);
       pause (4000);
     }
    if(irRight == 1){ // Si no hay pared a la derecha
      drive_speed(42,42); //Avanza
      pause(600);
      high(26);
      high(27);
      //drive_goto(25,-26); //Gira derecha
      drive_speed(32,-32);
      pause(750);
      //drive_speed(0,0);
      low(26);
      low(27);
      drive_speed(42,42); //Avanza
      pause(1200);
      //drive_speed(0,0);
    }      
    if(irRight == 0 && ping_cm(8)<10){    //Si hay pared a la derecha y enfrente 
      
      drive_speed(0,0);
     //Gira izquierda
      drive_speed(-32,32);
      pause(800);
      drive_speed(0,0);
     }       
     else{ //Si no hay pared enfrente
        drive_speed(42,42);
        pause(50);
    }

     
    
  }  
}
