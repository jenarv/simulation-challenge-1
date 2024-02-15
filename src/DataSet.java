public class DataSet {

    private double x[];
    private double y[];

    public DataSet(){
        //x = new double[]{1, 2, 3, 4, 5, 6, 7, 8};
        // y = new double[]{4, 8, 12, 16, 20, 24, 28, 32};
        x = new double[]{23, 26, 30, 34, 43, 48, 52, 57, 58};
        y = new double[]{651, 762, 856, 1063, 1190, 1298, 1421, 1440, 1518};
    }

    public double [] getX(){
        return this.x;
    }
    public double [] getY(){
        return this.y;
    }


}
