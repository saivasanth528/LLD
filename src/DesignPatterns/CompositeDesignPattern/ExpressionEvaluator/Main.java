package DesignPatterns.CompositeDesignPattern.ExpressionEvaluator;

public class Main {
    public static void main(String args[]) {
         // 3*(8+9)
        ArithmeticExpression three = new Number(3);

        ArithmeticExpression eight = new Number(8);
        ArithmeticExpression nine = new Number(9);
        ArithmeticExpression addExpression = new Expression(eight, nine, Operator.ADD);
        ArithmeticExpression parentExpression = new Expression(three, addExpression, Operator.MUL);

        parentExpression.evaluate();

    }
}
