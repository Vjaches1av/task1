import java.util.function.*;

public class Calculator {
    public static final Supplier<Calculator> instance = Calculator::new;

    public final BinaryOperator<Integer> plus = Integer::sum;
    public final BinaryOperator<Integer> minus = (x, y) -> x - y;
    public final BinaryOperator<Integer> multiply = (x, y) -> x * y;
    public final BinaryOperator<Double> divide = (x, y) -> x / y;

    public final UnaryOperator<Integer> pow = x -> x * x;
    public final UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    public final Predicate<Integer> isPositive = x -> x > 0;

    public final Consumer<Object> println = System.out::println;
}