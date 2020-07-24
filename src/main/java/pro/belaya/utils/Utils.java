package pro.belaya.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Utils {
    public static float round(float value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.floatValue();
    }
}
