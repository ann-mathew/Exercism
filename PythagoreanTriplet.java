import java.util.ArrayList;
import java.util.List;

public class PythagoreanTriplet{
    private final int a;
    private final int b;
    private final int c;

    public PythagoreanTriplet(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int calculateSum(){
        return a + b + c;
    }

    public boolean isPythagorean(){
        return a * a + b * b == c * c;
    }
}


public class TripletsGenerator{
    List <PythagoreanTriplet> tripletchecker (int sum){
        List<PythagoreanTriplet> triplets = new ArrayList<>();
        for (int a = 1; a <= sum-2; a++){
            for (int b = a+1; b <= sum-1; b++){
                for (int c = b+1; c <= sum; c++){
                    PythagoreanTriplet triplet = new PythagoreanTriplet(a,b,c);
                    if(!triplet.isPythagorean())
                        continue;
                    if (triplet.calculateSum()==sum)
                        triplets.add(triplet);
                }
            }
        }
        return triplets;
    }
}

