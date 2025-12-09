public class Operaciones {
    public double suma(double a,double b){
        return a+b;
    }

    public double resta(double a,double b){
        double resultado=0;
        if (b<0){
            resultado=a+b;
        }else{
            resultado=a-b;
        }
        return resultado;
    }

    public double multiplicacion(double a,double b){
        return a*b;
    }

    public double division(double a,double b){
        if (b==0){
            throw new ArithmeticException("No se puede dividir para 0");
        }else {
            return a/b;
        }
    }
}