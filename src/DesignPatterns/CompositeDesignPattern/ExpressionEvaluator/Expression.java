package DesignPatterns.CompositeDesignPattern.ExpressionEvaluator;

public class Expression implements ArithmeticExpression{

    ArithmeticExpression leftExpression;
    ArithmeticExpression rightExpression;
    Operator operator;

    public Expression(ArithmeticExpression leftOperand, ArithmeticExpression rightOperand, Operator operator) {
        this.leftExpression = leftOperand;
        this.rightExpression = rightOperand;
        this.operator = operator;
    }



    @Override
    public int evaluate() {
        int value = 0;
        switch (operator) {
            case ADD:
                value = leftExpression.evaluate() + rightExpression.evaluate();
                break;
            case SUB:
                value = leftExpression.evaluate() - rightExpression.evaluate();
                break;
            case MUL:
                value = leftExpression.evaluate() * rightExpression.evaluate();
                break;
            case DIV:
                value = leftExpression.evaluate() / rightExpression.evaluate();
                break;
        }
        System.out.println("Expression value is : " + value);
        return value;
    }
}
