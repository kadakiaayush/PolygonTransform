/*************************************************************************
 *  Compilation:  javac PolygonTransform.java
 *  Execution:    java PolygonTransform
 *
 *  @author: Ayush Kadakia
 *
 *************************************************************************/

public class PolygonTransform {


    // Returns a new array that is an exact copy of the given array. 
    // The given array is not mutated. 
    public static double[] copy(double[] array) {

	double[] array1 = new double[array.length]; 
    for(int i =0; i<array.length; i++){
        array1[i]=array[i]; 
        System.out.println(array1[i]); 
    }
    return array1; 
    }
    
    // Scales the given polygon by the factor alpha. 
    public static void scale(double[] x, double[] y, double alpha) {

	for(int i=0; i<x.length; i++){ 
        x[i]=alpha*x[i]; 
        y[i]=alpha*y[i]; 
    }
    StdDraw.setPenColor(StdDraw.GREEN);
    StdDraw.polygon(x,y); 
    }
    
    // Translates the given polygon by (dx, dy). 
    public static void translate(double[] x, double[] y, double dx, double dy) {
    for(int i=0; i<x.length;i++){
        x[i] = x[i]+dx; 
        y[i]=y[i]+dy; 
    }
    StdDraw.setPenColor(StdDraw.GREEN); 
    StdDraw.polygon(x,y); 
    }
    
    // Rotates the given polygon theta degrees counterclockwise, about the origin. 
    public static void rotate(double[] x, double[] y, double theta) {

	for(int i =0; i<x.length; i++){
        double radians = Math.toRadians(theta);
        double a = x[i]; 
        x[i] = (x[i]*Math.cos(radians))-(y[i]*Math.sin(radians)); 
        y[i] = (y[i]*Math.cos(radians))+(a*Math.sin(radians));  
    }
    StdDraw.setPenColor(StdDraw.GREEN); 
    StdDraw.polygon(x,y); 
    }

    // Tests each of the API methods by directly calling them. 
    public static void main(String[] args) {

        StdDraw.setScale(-5.0, +5.0); 
        double[] x = { 0, 1, 1, 0 }; 
        double[] y = { 0, 0, 2, 1 }; 
        double alpha = 2.0; 
        StdDraw.setPenColor(StdDraw.RED); 
        StdDraw.polygon(x, y); 
        scale(x, y, alpha); 
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(x, y);
    }
}

