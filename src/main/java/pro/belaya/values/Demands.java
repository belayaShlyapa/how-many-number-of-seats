package pro.belaya.values;

import pro.belaya.utils.Utils;

public class Demands {

    private final float economyClassSeats;
    private final float businessClassSeats;
    private final float firstClassSeats;

    private final float total;

    public Demands(final float economyClassSeats, final float businessClassSeats, final float firstClassSeats) {
        this.economyClassSeats = economyClassSeats;
        this.businessClassSeats = businessClassSeats;
        this.firstClassSeats = firstClassSeats;

        total = economyClassSeats + businessClassSeats + firstClassSeats;
    }

    public float getEconomyClassSeatsRate() {
        return Utils.round(((economyClassSeats * 100.0f) / total) / 10.0f, 2);
    }

    public float getBusinessClassSeatsRate() {
        return Utils.round(((businessClassSeats * 100.0f) / total) / 10.0f, 2);
    }

    public float getFirstClassSeatsRate() {
        return Utils.round(((firstClassSeats * 100.0f) / total) / 10.0f, 2);
    }
}
