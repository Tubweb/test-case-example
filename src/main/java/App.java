public class App {

    public static void main(String[] args) {
        ///
    }

    public void printNumbers() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i);
            if(i<10) {
                System.out.print(",");
            }
        }
    }

    public double calculateArea(double par1, double par2, double par3) {
        double p = (par1 + par2 + par3)/2;
        return Math.sqrt(p*(p-par1)*(p-par2)*(p-par3));
    }
}
