package by.it.karmyzov.jd01_08;

public class Scalar extends Var {
    private final double value;

    Scalar(double value) {
        this.value = value;
    }
    Scalar (String str) {
        this.value=Double.parseDouble(str);
    }

    Scalar (Scalar scalar) {
        this.value = scalar.value;
    }
    @Override
    public String toString() {
        return Double.toString(value);
    }


    }

