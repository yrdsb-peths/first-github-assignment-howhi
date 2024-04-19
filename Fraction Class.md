public class Fraction
{    
    private int numerator;
    private int denominator;
    
    public Fraction(int numer, int denom)
    {
        numerator = numer;
        denominator = denom;
    }
    
    public int getNumerator() 
    {
        return numerator;
    }
    
    public int getDenominator() 
    {
        return denominator;
    }
    
    public void setNumerator(int x) 
    {
        numerator = x;
    }
    
    
    public void setDenominator(int x) 
    {
        denominator = x;
    }
    
    public void add(Fraction other) 
    {
        numerator = (numerator * other.getDenominator()) + (other.getNumerator() * denominator);
        denominator = denominator * other.getDenominator();
    }
    
    public void subtract(Fraction other) 
    {
        numerator = (numerator * other.getDenominator()) - (other.getNumerator() * denominator);
        denominator = denominator * other.getDenominator();
    }
    
    public void multiply(Fraction other) 
    {
        numerator = numerator * other.getNumerator();
        denominator = denominator * other.getDenominator();
    }
    
    public String toString() 
    {
        return numerator + " / " + denominator;
    }
    
    
}
