package com.week6;
import com.IO;
/**
 * Created by User on 10/17/2015.
 */
public class Scores {
    public static void main(String[] args){
        int judges = 0;
        while(judges <3){
            System.out.print("How many judges? ");
            judges = IO.readInt();
            if (judges<3){ //Error checks to make sure that there are 3 or more judges
                IO.reportBadInput();
            }
        }
        double highest = 0;
        double lowest = 10;
        double scoreSum = 0;
        int counter = 1;
        while(counter < (judges+1)){

            //Begin Input Error check
            double score;
            do{
                System.out.println("Enter score #" + counter + " ");
                score = IO.readDouble();
                if((score>10.0) || (score<0.0)){
                    IO.reportBadInput();
                }
                else{ //find out the highest and the lowest scores
                    if(score>highest){
                        highest = score;
                    }
                    if(score<lowest){
                        lowest = score;
                    }
                }
            }while((score>10.0) || (score<0.0));//Error checks if the score is not between 0 and 10
            //End Input error check
            scoreSum +=score;
            counter++;
        }
        scoreSum -= (highest + lowest);
        scoreSum /= ((double)judges-2);
        System.out.println("The score is " + scoreSum);
        IO.outputDoubleAnswer(scoreSum);
    }
}
