public class SimpLinReg {
    private double beta0, beta1;

    public SimpLinReg(){
        beta0 = 0;
        beta1 = 0;
    }

    //calcular B0
    public double calculateIntersect(double DTgen, double DTb0){
        beta0 = DTb0 / DTgen;
        return beta0;
    }

    //calcular B1
    public double calculateSlope(double DTgen, double DTb1){
        beta1 = DTb1 / DTgen;
        return beta1;
    }

    public void printRegEquation(){
        System.out.println("Regression Equation: "  + beta1 + "x + " + beta0);
        System.out.println("\n");
    }

    public double predict(double x){
        return ((x*beta1) + beta0);
    }
}
