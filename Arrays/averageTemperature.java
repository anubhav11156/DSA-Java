import java.util.*;

public class averageTemperature {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int days;
        System.out.print("How many days? ");
        days = console.nextInt();
        int[] temps = new int[days];
        double sum = 0;
        for(int i=0; i<temps.length; i++){
            System.out.print("Day "+(i+1)+"'s high temp: ");
            temps[i] = console.nextInt();
            sum += temps[i];
        }

        double average = sum/days;
        System.out.println("\nAverage temperature : "+average);
        console.close();

        int above = 0;
        for(int i=0; i<temps.length; i++){
            if(temps[i]>average){
                above++;
            }
        }
        System.out.println(above + " day(s) temperature greater than average.");
    }
}
