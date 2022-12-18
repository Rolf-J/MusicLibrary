import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    
    static ArrayList<Music> scores;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //############## MAIN MENU STARTS HERE ##############
        int ans = -1;

        while(ans != 0){
            System.out.println("1.Add music\n2.Remove music\n3.Check out music\n4.Check in music\n5.Search for music\n0.Exit");
            System.out.println();
            System.out.println("Choice");
            ans =sc.nextInt();
            sc.nextLine();

            if(ans == 1){ //add 
                System.out.println("Enter title: ");
                String title = sc.nextLine();
                System.out.println("Enter compser: ");
                String composer = sc.nextLine();
                System.out.println("Enter voice parts: ");
                String voiceParts = sc.nextLine();
                System.out.println("Enter date: ");
                String date = sc.nextLine();
                Music m = new Music(title, composer, voiceParts, date);
                scores.add(m);
            }
            
            if(ans == 2){ //remove
                System.out.println("Enter title: ");
                String title = sc.nextLine();
                for(int i = 0; i<scores.size(); i++){
                    if( scores.get(i).getTitle().equals(title)){
                        scores.remove(i);
                    }
                } 
            }

            if(ans == 3){ //check out
              System.out.println("Enter title: ");
                String title = sc.nextLine();
                for(int i = 0; i<scores.size(); i++){
                    if( scores.get(i).getTitle().equals(title)){
                        System.out.println(scores.get(i));
                        scores.get(i).setCheckedOut(true);
                    }
                }
            }
        

            if(ans == 4){ //check in
               System.out.println("Enter title: ");
                String title = sc.nextLine();
                for(int i = 0; i<scores.size(); i++){
                    if( scores.get(i).getTitle().equals(title)){
                        System.out.println(scores.get(i));
                        scores.get(i).setCheckedOut(true);
                    }
                }
            }

            if(ans == 5){ //search
                System.out.println("Enter title: ");
                String title = sc.nextLine();
                boolean notFound = true;
                for(int i = 0; i<scores.size(); i++){
                    if( scores.get(i).getTitle().equals(title)){
                        System.out.println(scores.get(i));
                        notFound =false;
                    }
                } 
              
                if(notFound){
                  System.out.println("Not found");
                }
            }


          }
        }
    }


