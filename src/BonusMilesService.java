public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price); // должно получиться 500
        System.out.println(miles);
    }
}



### Class

public class BonusMilesService {

    public int calculate(int price) {
        int result;
        int i = price = 10_000;
        {
           result = price / 20;

       }
       return result;
    }


}
