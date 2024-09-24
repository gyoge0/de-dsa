package com.gyoge;

@SuppressWarnings("unused")
public class Evaluator {
    private final String[] expression;
    private final Stack operandStack;
    private final Stack operatorStack;

    public Evaluator(String[] exp) {
        this.expression = exp;
        this.operandStack = new Stack();
        this.operatorStack = new Stack();
    }

    public int evaluate() {
        for (String s : this.expression) {
            switch (s) {
                case ")" -> {
                    var operator = this.operatorStack.pop();
                    int operand1 = Integer.parseInt(this.operandStack.pop());
                    int operand2 = Integer.parseInt(this.operandStack.pop());

                    var result = switch (operator) {
                        case "*" -> operand1 * operand2;
                        case "+" -> operand1 + operand2;
                        case "-" -> operand2 - operand1;
                        case "/" -> operand2 / operand1;
                        default -> 0;
                    };

                    this.operandStack.push(Integer.toString(result));
                }
                case "(" -> {}
                case "*", "+", "-", "/" -> this.operatorStack.push(s);
                default -> this.operandStack.push(s);
            }
        }

        return Integer.parseInt(this.operandStack.pop());
    }
}
