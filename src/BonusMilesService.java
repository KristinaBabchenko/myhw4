public class BonusMilesService {
    public int calculate(int price) {
        int each = 20;
        int miles;
        miles = price / each;

        return miles;
    }
}
