class Solution {
    public double[] internalAngles(int[] sides) {

        int[] vals = sides;

        double a = vals[0];
        double b = vals[1];
        double c = vals[2];

        if (!((a + b) > c && (b + c) > a && (c + a) > b)) {
            return new double[]{};
        }

        double A = angle(b, c, a);
        double B = angle(a, c, b);
        double C = angle(a, b, c);

        double[] arr = {A, B, C};

        java.util.Arrays.sort(arr);

        return arr;
    }

    private double angle(double x, double y, double opposite) {
        double cos = (x*x + y*y - opposite*opposite) / (2*x*y);
        cos = Math.max(-1.0, Math.min(1.0, cos));
        return Math.toDegrees(Math.acos(cos));
    }
}
