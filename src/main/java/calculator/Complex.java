package calculator;

public class Complex {
    private int real;
    private  int image;

    public Complex(int real, int image) {
        this.real = real;
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public int getReal() {
        return real;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setReal(int real) {
        this.real = real;
    }

    @Override
    public String toString() {
        return String.format("%d+%di", real, image);
    }
}
