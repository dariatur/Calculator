package entity;

public class Calculator {
    public final static Calculator INSTANCE = new Calculator();

    private Calculator(){};

    public <T extends Number> double sum(T... args){
        double result = 0.0;
        for(int i = 0; i < args.length; i++){
            result += args[i].doubleValue();
        }
        return result;
    }

    public <T extends Number> double deduct(T... args){
        double result = args[0].doubleValue();
        for(int i = 1; i < args.length; i++){
            result -= args[i].doubleValue();
        }
        return result;
    }

    public <T extends Number> double multiply(T... args){
        double result = args[0].doubleValue();
        for(int i = 1; i < args.length; i++){
            result *= args[i].doubleValue();
        }
        return result;
    }

    public <T extends Number> double divide(T... args){
        double result = args[0].doubleValue();
        for(int i = 1; i < args.length; i++){
            result /= args[i].doubleValue();
        }
        return result;
    }
}
