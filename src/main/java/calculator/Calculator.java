package calculator;



public class Calculator implements Calculable{
    private final Complex complex;

    public Calculator(Complex complex) {
        this.complex = complex;
    }

    @Override
    public void add(Complex number) {
        int newReal = complex.getReal() + number.getReal();
        int newImage = complex.getImage() + number.getImage();
        complex.setReal(newReal);
        complex.setImage(newImage);
    }

    @Override
    public void mul(Complex number) {
        int newReal = complex.getReal() * number.getReal() - complex.getImage() * number.getImage();
        int newImage = complex.getReal() * number.getImage() + complex.getImage() * number.getReal();
        complex.setReal(newReal);
        complex.setImage(newImage);
    }

    @Override
    public void sub(Complex number) {
        int newReal = complex.getReal() - number.getReal();
        int newImage = complex.getImage() - number.getImage();
        complex.setReal(newReal);
        complex.setImage(newImage);
    }

    @Override
    public void div(Complex number) {
        int newReal = (complex.getReal() * number.getReal() + complex.getImage() * number.getImage())
                /(number.getReal() * number.getReal()) + number.getImage() * number.getImage();
        int newImage = complex.getImage() * number.getReal() - complex.getReal() * number.getImage()
                /(number.getReal() * number.getReal()) + number.getImage() * number.getImage();
        complex.setReal(newReal);
        complex.setImage(newImage);
    }

    @Override
    public Complex res() {
        return complex;
    }
}
