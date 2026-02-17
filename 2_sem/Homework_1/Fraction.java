import java.util.Objects;
public class Fraction extends Number{
    private int numerator, denominator;

    public Fraction(int numerator, int denominator){
        if (denominator == 0){
            throw new IllegalArgumentException();
        }
        if (denominator < 0){
            numerator = -numerator;
            denominator = -denominator;
        }
        this.numerator = numerator;
        this.denominator = denominator;
        reduce();
    }

    @Override
    public int intValue(){
        return numerator/denominator;
    }
    @Override
    public long longValue(){
        return (long) numerator/denominator;
    }
    @Override
    public float floatValue(){
        return (float) numerator/denominator;
    }
    @Override
    public double doubleValue(){
        double num = (double) numerator;
        double denom = (double) denominator;
        return num/denom;
    }

    public int getNumerator(){
        return numerator;
    }

    public int getDenominator(){
        return denominator;
    }

    public Fraction add(Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction subtract(Fraction other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction multiply(Fraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction divide(Fraction other) {
        if (other.numerator == 0) {
            throw new ArithmeticException();
        }
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new Fraction(newNumerator, newDenominator);
    }
    private void reduce() {
        int gcd = gcd(Math.abs(numerator), denominator);
        numerator /= gcd;
        denominator /= gcd;
    }
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public Fraction negotiata(){
        int newNum = this.numerator;
        return new Fraction(-newNum, this.denominator);
    }
    public boolean isProper(){
        if (Math.abs(numerator) < Math.abs(denominator)){
            return true;
        } else {
            return false;
        }
    }
    @Override
    public String toString(){
        return numerator + "/" + denominator;
    }

    @Override
    public boolean equals(Object other){
        if (this == other) return true;
        if (other instanceof Fraction){
            return numerator == ((Fraction) other).getNumerator() && denominator == ((Fraction) other).denominator;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(numerator, denominator);
    }
}
