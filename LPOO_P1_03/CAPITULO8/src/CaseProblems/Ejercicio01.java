/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CaseProblems;

/**
 *
 * @author bautista
 */
import java.util.Scanner;
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
      

    private static String NEvent;
    private static int numberOfGuest;
    private static String phoneNum1;
    private static int eventType;
    public static void main(String[] args){
       
        
        Scanner in = new Scanner(System.in);
        
        
        event eventArray[] = new event[3];
        for(int i =0; i<eventArray.length; i++) {
        	 boolean condi = false;
        	System.out.println("Enter the event number");
            NEvent=in.nextLine();
            
            do{
                if(condi){
                    System.out.println("Los invitados deben ser >5 y <100");
                }
                System.out.println("Enter the number of guest (>5 & <100)");
                numberOfGuest=in.nextInt();
                condi = true;
            }while(numberOfGuest <5 || numberOfGuest > 100);
            in.nextLine();
            System.out.println("Enter the event type\n"
            		+ "0.- wedding\n"
            		+ "1.- baptism\n"
            		+ "2.- birthday\n"
            		+ "3.- corporate\n"
            		+ "4.-other");
            
            eventType = in.nextInt();
            in.nextLine();
            System.out.println("Enter the contact Phone Number for event 1");
            phoneNum1=in.nextLine();
            eventArray[i] = new event(NEvent, numberOfGuest);
            eventArray[i].setPhoneNumber(phoneNum1);
            eventArray[i].setEventType(eventType);
            eventArray[i].display(numberOfGuest);
        }
        in.close();
        
   
    }
    
    
    public static void compare(event evento1, event evento2){
         
        if(evento1.getGuest()==evento2.getGuest()){
            System.out.println("The events are same "+ evento1.getEventNumber()+ " and "+evento2.getEventNumber()+" and the number of guests are "+evento1.getGuest());
        }else if(evento1.getGuest()>evento2.getGuest()){
            System.out.println("The Larger event is"+ evento1.getEventNumber()+  " and the number of guests are "+ evento1.getGuest());
        }else {
            System.out.println("The Larger event is "+ evento2.getEventNumber()+ " and the number of guests are "+ evento2.getGuest());
        }
    }

    
    
}
