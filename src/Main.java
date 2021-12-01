public class Main {
    public static void main(String [] args){
        BmiService service = new BmiService();
        double index =  service.calculate(64.0, 1.63);
        System.out.printf("index = %.2f%n", index);
    }
}
