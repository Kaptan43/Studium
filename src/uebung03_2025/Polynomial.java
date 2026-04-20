package uebung03_2025;

public class Polynomial {
    private final int[] polynom;
    private final int degree;

    public Polynomial(int[] polynom){
        this.polynom = polynom;
        int tempDegree = 0;
        for(int i = polynom.length-1; i>=0; i--){
            if(polynom[i] != 0){
                tempDegree = i;
                break;
            }
        }
        this.degree = tempDegree;
    }

    public Polynomial(){
        this(new int[]{0, 1});
    }

    public static Polynomial constant(int v){
        return new Polynomial(new int[]{v});
    }

    public int getDegree(){
        return degree;
    }

    public static void main(String[] args) {
        Polynomial p = new Polynomial(new int[]{1, -2, 3, 4});
    }
}
