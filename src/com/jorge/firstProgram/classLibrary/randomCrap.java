package com.jorge.firstProgram.classLibrary;
import java.io.File;
import java.util.Scanner;

public class randomCrap {

    public void bobux(){
        File file = new File("siren.wav");
        Scanner input0 = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        int bobux;
        System.out.print("How many bobux do you have?: ");
        bobux = input0.nextInt();
        if (bobux >= 25){
            bobux--;
            bobux--;
            bobux--;
            bobux--;
            bobux--;
            bobux--;
            bobux--;
            bobux--;
            bobux--;
            bobux--;
            bobux--;
            bobux--;
            bobux--;
            bobux--;
            bobux--;
            bobux--;
            bobux--;
            bobux--;
            bobux--;
            bobux--;
            bobux--;
            bobux--;
            bobux--;
            bobux--;
        }
        else if (bobux <= 24){
            System.out.print("Please enter a value of 25 or greater: ");
            bobux = input0.nextInt();
            bobux--;
            bobux--;
            bobux--;
            bobux--;
            bobux--;
            bobux--;
            bobux--;
            bobux--;
            bobux--;
            bobux--;
            bobux--;
            bobux--;
            bobux--;
            bobux--;
            bobux--;
            bobux--;
            bobux--;
            bobux--;
            bobux--;
            bobux--;
            bobux--;
            bobux--;
            bobux--;
            bobux--;
        }
        System.out.print("Someone stole your bobux what are you gonna do now (punch, kill, report) you only have " + bobux + " bobux left: ");
        String PKR;
        PKR = input.nextLine();
        if(PKR.equals("punch")){
            System.out.println("you punched a guy you got 3 bobux back.");
            bobux++;
            bobux++;
            bobux++;
            System.out.println("you have " + bobux + " bobux left.");
        }
        else if (PKR.equals("Punch")){
            System.out.println("you punched a guy you got 3 bobux back.");
            bobux++;
            bobux++;
            bobux++;
            System.out.println("you have " + bobux + " bobux left.");
        }
        else if (PKR.equals("kill")){
            System.out.print("You killed the man, but you were spotted by a nearby policeman. You can either run away or kill the policeman.");
            Scanner s01 = new Scanner(System.in);
            String RK0 = s01.nextLine();
            if (RK0.equals("run")){
                System.out.println("You were unable to escape the policeman");
                System.out.print("You can either attempt to struggle or admit defeat: ");
                Scanner s02 = new Scanner(System.in);
                String SA0 = s02.nextLine();
                if (SA0.equals("struggle")){
                    System.out.println("In your desperate attempt to escape the policeman, he ends up shooting you.");
                }
                else if (SA0.equals("Struggle")){
                    System.out.println("In your desperate attempt to escape the policeman, he ends up shooting you.");
                }
                else if (SA0.equals("admit defeat")){
                    System.out.println("You go to jail for 20 years, unable to get your bobux back.");
                }
                else if (SA0.equals("Admit defeat")){
                    System.out.println("You go to jail for 20 years, unable to get your bobux back.");
                }
            }
            else if (RK0.equals("Run")){
                System.out.println("You were unable to escape the policeman");
                System.out.print("You can either attempt to struggle or admit defeat: ");
                Scanner s03 = new Scanner(System.in);
                String SA1 = s03.nextLine();
                if (SA1.equals("struggle")){
                    System.out.println("In your desperate attempt to escape the policeman, he ends up shooting you.");
                }
                else if (SA1.equals("Struggle")){
                    System.out.println("In your desperate attempt to escape the policeman, he ends up shooting you.");
                }
                else if (SA1.equals("admit defeat")){
                    System.out.println("You go to jail for 20 years, unable to get your bobux back.");
                }
                else if (SA1.equals("Admit defeat")) {
                    System.out.println("You go to jail for 20 years, unable to get your bobux back.");
                }
            }
            else if (RK0.equals("kill the policeman")){
                System.out.println("In your desperate attempt to not get arrested you kill the cop and get your bobux back");
            }
            else if (RK0.equals("Kill the policeman")){
                System.out.println("In your desperate attempt to not get arrested you kill the cop and get your bobux back");
            }
        }
        else if (PKR.equals("Kill")){
            System.out.println("You killed the man, but you were caught by a nearby policeman.");
            System.out.println("You were unable to get you bobux back because you were caught.");
        }
        else if (PKR.equals("report")){
            System.out.println("You reported the thief to a nearby policeman.");
            System.out.println("the police managed to get your bobux back.");
            bobux++;
            bobux++;
            bobux++;
            bobux++;
            bobux++;
            bobux++;
            bobux++;
            bobux++;
            bobux++;
            bobux++;
            bobux++;
            bobux++;
            bobux++;
            bobux++;
            bobux++;
            bobux++;
            bobux++;
            bobux++;
            bobux++;
            bobux++;
            bobux++;
            bobux++;
            bobux++;
            bobux++;
            System.out.println("you now have " + bobux + " bobux");
        }
        else if (PKR.equals("Report")){
            System.out.println("You reported the thief to a nearby policeman.");
            System.out.println("the police managed to get your bobux back.");
            bobux++;
            bobux++;
            bobux++;
            bobux++;
            bobux++;
            bobux++;
            bobux++;
            bobux++;
            bobux++;
            bobux++;
            bobux++;
            bobux++;
            bobux++;
            bobux++;
            bobux++;
            bobux++;
            bobux++;
            bobux++;
            bobux++;
            bobux++;
            bobux++;
            bobux++;
            bobux++;
            bobux++;
            System.out.println("you now have " + bobux + " bobux");
        }
    }
}
