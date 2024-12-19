class Complex {
    float a, b;
    Complex(float a, float b){
        this.a = a;
        this.b = b;
    }

    static Complex addComplex(Complex A, Complex B){
        Complex C = new Complex(A.a + B.a, A.b + B.b);
        return C;
    }

    void printComplex(){
        if (b > 0){
            System.out.println(this.a + " + " + this.b + "i");
        } else {
            System.out.println(this.a + " " + this.b + "i");
        }
    }
}

public class AddComplexNum {
    public static void main(String[] args) {
        Complex X = new Complex(3, 4);
        Complex Y = new Complex(5, -6);
        Complex Z = Complex.addComplex(X, Y);
        Z.printComplex(); // 8.0 -2.0i
    }
}
