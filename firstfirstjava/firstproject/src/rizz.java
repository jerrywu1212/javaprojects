import java.util.Random;
import java.util.Scanner;

public class rizz{
    
    //uses copenhagen "database" to run a dating simulator 

  
    String copenhagenMember;
    String Sunny;
    double levelOfRizz = 10;
    double beingABottom;

    public rizz(String copenhagenMember){
        
        this.copenhagenMember = copenhagenMember;
        

    }


    public double negativeRizz(double losing){
        
        return this.levelOfRizz -= losing;

    }

    public double positiveRizz(double winning){

        return this.levelOfRizz += winning;

    }

    public double bottomBehavior(double beingABottom){

        return this.levelOfRizz -= beingABottom;

    }

    public void displayProfile(){

        System.out.println(this.copenhagenMember);

    }

    public void ableToWin(){

        //success rate 
        if(this.levelOfRizz > 10){
        Random decimal = new Random();
        double successRate = decimal.nextDouble();
        //winning rate
          
            if(successRate > 0.3){
                System.out.println(this.copenhagenMember + " has won");
            } else {
                System.out.println(this.copenhagenMember + " has lost");
            }

        } else {
            Random decimal = new Random();
            double successRate = decimal.nextDouble();
            if(successRate > 0.7){
                System.out.println(this.copenhagenMember + " has won");
            } else {
                System.out.println(this.copenhagenMember + " has lost");
            }
        }

    }



    public static void main(String[] args){

        rizz akshayMember = new rizz("Akshay");
        rizz rohitMember = new rizz("Rohit");
        rizz sohamMember = new rizz("Soham");
        rizz jerryMember = new rizz("Jerry");
        
        akshayMember.negativeRizz(3);
        akshayMember.bottomBehavior(1);
        
        rohitMember.negativeRizz(3);

        sohamMember.negativeRizz(1);

        jerryMember.negativeRizz(8);
        jerryMember.positiveRizz(0.5);


        while (true){Scanner input = new Scanner(System.in);

    
        System.out.println("Name: ");
        String member = input.nextLine();

        while (!member.equalsIgnoreCase(akshayMember.copenhagenMember) && !member.equalsIgnoreCase(rohitMember.copenhagenMember)
        && !member.equalsIgnoreCase(sohamMember.copenhagenMember) && !member.equalsIgnoreCase(jerryMember.copenhagenMember)){

            System.out.println("Enter a valid name");
            member = input.nextLine();
        }

        
        if (member.equalsIgnoreCase(akshayMember.copenhagenMember) || member.equalsIgnoreCase(rohitMember.copenhagenMember) 
        || member.equalsIgnoreCase(sohamMember.copenhagenMember) || member.equalsIgnoreCase(jerryMember.copenhagenMember)){

            System.out.println("Should " + member + " ask out a girl?");

            

            }

            String yesOrNo = input.nextLine();

             while (!yesOrNo.equalsIgnoreCase("Yes") && !yesOrNo.equalsIgnoreCase("No")){

                System.out.println("Enter 'Yes' or 'No'");
                yesOrNo = input.nextLine();
            }

           
        if(yesOrNo.equalsIgnoreCase("Yes")){
            
            if (member.equalsIgnoreCase(akshayMember.copenhagenMember)){
                akshayMember.ableToWin();
            } else if (member.equalsIgnoreCase(rohitMember.copenhagenMember)){
                rohitMember.ableToWin();
            } else if (member.equalsIgnoreCase(sohamMember.copenhagenMember)){
                sohamMember.ableToWin();
            } else if (member.equalsIgnoreCase(jerryMember.copenhagenMember)){
                jerryMember.ableToWin();
            }
            

        } else if (yesOrNo.equalsIgnoreCase("No")){

             if (member.equalsIgnoreCase(akshayMember.copenhagenMember)){
                System.out.println(member + " is a coward.");
            } else if (member.equalsIgnoreCase(rohitMember.copenhagenMember)){
                rohitMember.ableToWin();
                System.out.println(member + " asked them out anyways");
            } else if (member.equalsIgnoreCase(sohamMember.copenhagenMember)){
                System.out.println(member + " is a coward");
            } else if (member.equalsIgnoreCase(jerryMember.copenhagenMember)){
                System.out.println(member + " asked them out anyways");
                jerryMember.ableToWin();
            } 

        }

        } }

        

        


        

        
        

        
        



    }




