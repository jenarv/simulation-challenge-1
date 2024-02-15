public class Algebra extends Sumatoria{

    private double DTgen;
    private double DTb0;
    private double DTb1;

    public Algebra(){}

    public double getDTb0() {
        return DTb0;
    }

    public double getDTgen() {
        return DTgen;
    }

    public double getDTb1() {
        return DTb1;
    }

    private double calculateDTgen(double []w, double []v){
        DTgen = (w.length * sumW2(w)) - Math.pow(sumW(w),2);
        return DTgen;
    }

    private double calculateDTb0(double []w, double []v){
        DTb0 =  (sumW(v)* sumW2(w)) - (sumWV(w,v)*sumW(w));

        return DTb0;
    }

    private double calculateDTb1(double []w, double []v){
        DTb1 = (w.length * sumWV(w,v) - (sumW(w) * sumW(v)));
        return DTb1;
    }

    public void dt(double x[], double y[]){
        calculateDTgen(x,y);
        calculateDTb0(x,y);
        calculateDTb1(x,y);
    }

}
