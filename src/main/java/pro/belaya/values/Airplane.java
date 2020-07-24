package pro.belaya.values;

import pro.belaya.utils.Utils;

public class Airplane {

    private final float maxNbOfEconomyClassSeats;
    private final float maxNbOfBusinessClassSeats;
    private final float maxNbOfFirstClassSeats;

    public Airplane(final float maxNbOfEconomyClassSeats, final float maxNbOfBusinessClassSeats, final float maxNbOfFirstClassSeats) {
        this.maxNbOfEconomyClassSeats = maxNbOfEconomyClassSeats;
        this.maxNbOfBusinessClassSeats = maxNbOfBusinessClassSeats;
        this.maxNbOfFirstClassSeats = maxNbOfFirstClassSeats;
    }

    public float getMaxNbOfEconomyClassSeats() {
        return maxNbOfEconomyClassSeats;
    }

    public float getEconomyClassSeatSpace() {
        return Utils.round(100.0f / ((maxNbOfEconomyClassSeats * 100.0f) / maxNbOfEconomyClassSeats), 2);
    }

    public float getBusinessClassSeatSpace() {
        return Utils.round(100.0f / ((maxNbOfBusinessClassSeats * 100.0f) / maxNbOfEconomyClassSeats), 2);
    }

    public float getFirstClassSeatSpace() {
        return Utils.round(100.0f / ((maxNbOfFirstClassSeats * 100.0f) / maxNbOfEconomyClassSeats), 2);
    }
}