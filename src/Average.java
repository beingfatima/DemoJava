
public class Average {

	public static void main(String[] args) {
		//a change only in stage
		double[] numArray = { 45.3, 67.5, -45.6, 20.34, 33.0};
        double sum = 0.0;

        for (double num: numArray) {
           sum += num;
        }

        double average = sum / numArray.length;
        System.out.format("%.2f", average);
        System.out.println("\nhello world");
        System.out.println("helloooooooooooooo");
       

	}

}
