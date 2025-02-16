import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        RewardValue test1 = new RewardValue(100.0);
        assertEquals(28571, test1.convertToMiles(100.0));
    }

    @Test
    void convert_from_miles_to_cash() {
        RewardValue test2 = new RewardValue(100);
        assertEquals((100*0.0035), test2.convertToCash(100));
    }
}
