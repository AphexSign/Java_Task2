public class Calculator {

    //Конструкторов нет

    //Сложение с перегрузкой
    public double addition(double ad, double bd){
        double result = ad+bd;
        return result;
    }
    public long addition(long al, long bl){
        long result=al+bl;
        return result;
    }
    public int addition(int ai, int bi){
        int result=ai+bi;
        return result;
    }
    //Деление с перегрузкой
    public double division(double ad, double bd){
        double result = ad/bd;
        return result;
    }

    public long division(long al, long bl){
        long result=al/bl;
        return result;
    }
    public int division(int ai, int bi){
        int result=ai/bi;
        return result;
    }

    //Умножение с перегрузкой
    public double multiplication(double ad, double bd){
        double result = ad*bd;
        return result;
    }

    public long multiplication(long al, long bl){
        long result=al*bl;
        return result;
    }
    public int multiplication(int ai, int bi){
        int result=ai*bi;
        return result;
    }

    //Вычитание с перегрузкой
    public double subtraction(double ad, double bd){
        double result = ad-bd;
        return result;
    }

    public long subtraction(long al, long bl){
        long result=al-bl;
        return result;
    }
    public int subtraction(int ai, int bi){
        int result=ai-bi;
        return result;
    }

}
