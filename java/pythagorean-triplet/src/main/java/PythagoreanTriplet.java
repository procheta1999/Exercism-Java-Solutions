import java.security.cert.CertPathBuilder;
import java.util.*;
class PythagoreanTriplet
{
    public int a;
    public int b;
    public int c;
    public PythagoreanTriplet(int a,int b,int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    int calculateSum() {
        return a + b + c;
    }
    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }
    @Override
    public boolean equals(Object obj) {
        PythagoreanTriplet other = (PythagoreanTriplet) obj;
        return a == other.a && b == other.b && c == other.c;
    }
    long calculateProduct() {
        return a * b * c;
    }
    boolean isPythagorean() {
        return a * a + b * b == c * c;
    }
    public static PythagoreanTripletList makeTripletsList() {
        return new PythagoreanTripletList();
    }
}
class PythagoreanTripletList
{
    public static Integer sum;
    public static int factorProduct;
    public PythagoreanTripletList withFactorsLessThanOrEqualTo(int i) {
        this.factorProduct=i;
        return this;
    }

    public PythagoreanTripletList thatSumTo(int i) {
        this.sum=i;
        return this;
    }
    public static List<PythagoreanTriplet> build() {
      List<PythagoreanTriplet> tripletList=new ArrayList<PythagoreanTriplet>();
      for(int i=1;i<factorProduct;i++)
      {
          for(int j=i+1;j<factorProduct;j++)
          {
              int k = (int) Math.round(Math.sqrt(i * i + j * j));
              if (k > factorProduct) {
                  break;
              }
              PythagoreanTriplet pt = new PythagoreanTriplet(i, j, k);
              if (pt.isPythagorean() && (sum == null || pt.calculateSum() == sum)) {
                  tripletList.add(pt);
              }
          }
      }
      return tripletList;
    }


}
