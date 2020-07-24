package pro.belaya;

import pro.belaya.utils.Utils;
import pro.belaya.values.Airplane;
import pro.belaya.values.Demands;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Demands demands = inputDemands();
        Airplane airplane = inputMaxAirplaneSeats();

        float t;
        float a = 0.0f;
        float b = 0.0f;
        float c = 0.0f;

        final float unitEconomyClassSeat = Utils.round(demands.getEconomyClassSeatsRate() * airplane.getEconomyClassSeatSpace(), 2);
        final float unitBusinessClassSeat = Utils.round(demands.getBusinessClassSeatsRate() * airplane.getBusinessClassSeatSpace(), 2);
        final float unitFirstClassSeat = Utils.round(demands.getFirstClassSeatsRate() * airplane.getFirstClassSeatSpace(), 2);


        for (t = 0.0f; t <= airplane.getMaxNbOfEconomyClassSeats(); a++, b++, c++) {
            t = Utils.round(a * unitEconomyClassSeat + b * unitBusinessClassSeat + c * unitFirstClassSeat, 2);
        }
        a -= 2.0f;
        b -= 2.0f;
        c -= 2.0f;

        for (t = 0.0f; t <= airplane.getMaxNbOfEconomyClassSeats(); a++, b++) {
            t = Utils.round(a * unitEconomyClassSeat + b * unitBusinessClassSeat + c * unitFirstClassSeat, 2);
        }
        a -= 2.0f;
        b -= 2.0f;

        for (t = 0.0f; t <= airplane.getMaxNbOfEconomyClassSeats(); a++) {
            t = Utils.round(a * unitEconomyClassSeat + b * unitBusinessClassSeat + c * unitFirstClassSeat, 2);
        }
        a -= 2.0f;

        a = Utils.round((a * unitEconomyClassSeat) / airplane.getEconomyClassSeatSpace(), 2);
        b = Utils.round((b * unitBusinessClassSeat) / airplane.getBusinessClassSeatSpace(), 2);
        c = Utils.round((c * unitFirstClassSeat) / airplane.getFirstClassSeatSpace(), 2);

        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);

        // System.out.println(Utils.round(num, 2));
    }

    public static Demands inputDemands() {
        Scanner in = new Scanner(System.in);

        System.out.println("** DEMANDES **");
        System.out.println("Nombre de places ECONOMIQUES souhaitées :");
        float eco = in.nextFloat();

        System.out.println("Nombre de places AFFAIRES souhaitées :");
        float aff = in.nextFloat();

        System.out.println("Nombre de places PREMIERES souhaitées :");
        float pre = in.nextFloat();

        return new Demands(eco, aff, pre);
    }

    public static Airplane inputMaxAirplaneSeats() {
        Scanner in = new Scanner(System.in);

        System.out.println("** PLACES MAXIMUM **");
        System.out.println("Nombre maximum de places ECONOMIQUES :");
        float eco = in.nextFloat();

        System.out.println("Nombre maximum de places AFFAIRES :");
        float aff = in.nextFloat();

        System.out.println("Nombre maximum de places PREMIERES :");
        float pre = in.nextFloat();

        return new Airplane(eco, aff, pre);
    }
}