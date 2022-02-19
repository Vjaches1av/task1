public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        calc.println.accept(a);
        int b = calc.minus.apply(1, 1);
        calc.println.accept(b);

        /*
        Ошибка деления на ноль. Если в методе есть операция деления, то придется проверять делитель на равенство нулю.
        Чтобы избежать данной ошибки, изменим тип параметра метода apply(), принимающий изначально на входе тип объекта Integer, на вещественный.
        Т.к. в Java все (почти) есть объекты, в абстрактный метод accept() передадим Object, который реализует toString().
         */

        double c = calc.divide.apply(Integer.valueOf(a).doubleValue(), Integer.valueOf(b).doubleValue());
        calc.println.accept(c);
        int d = calc.multiply.apply(4, 8);
        calc.println.accept(d);

        int e = calc.pow.apply(4);
        calc.println.accept(e);
        int f = calc.abs.apply(4);
        calc.println.accept(f);

        boolean g = calc.isPositive.test(4);
        calc.println.accept(g);
    }
}