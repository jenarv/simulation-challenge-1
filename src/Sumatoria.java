import java.lang.Math;

public class Sumatoria {

    public double sumW(double w[]){
        double totalW = 0;

        for(int i = 0; i< w.length; i++) totalW = totalW + w[i];

        return totalW;
    }

    public double sumW2(double w[]){
        double totalW2 = 0;

        for(int i = 0; i<w.length; i++) totalW2 = totalW2 + Math.pow(w[i], 2);

        return totalW2;
    }

    public double sumWV(double w[], double v[]){
        double totalWV = 0;

        for(int i = 0; i<w.length; i++) totalWV = totalWV + (w[i] * v[i]);

        return totalWV;
    }

    public void sumas(double x[], double y[]){
        sumW(x);
        sumW(y);
        sumW2(x);
        sumWV(x,y);
    }

}
