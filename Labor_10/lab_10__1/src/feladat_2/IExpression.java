package feladat_2;

public interface IExpression {

    static double evaluate(String expression) throws ExpressionException {

        Stack muvelet = new Stack(7);
        String[] items = expression.split(" ");
        for (String i : items) {
            Double result = 0.0;
            if (isOperator(i.trim())) {
                try {
                    Double utolso = (Double) muvelet.pop();
                    Double utolsoelotti = (Double) muvelet.pop();

                    switch (i.trim()) {
                        case "+" -> result =  utolsoelotti + utolso;
                        case "-" -> result = utolsoelotti - utolso;
                        case "*" -> result =  utolsoelotti * utolso;
                        case "/" -> result =  utolsoelotti / utolso;
                    }
                    muvelet.push(result);
                } catch (StackException stackException) {
                    throw new ExpressionException("WRONG POSTFIX EXCEPTION");
                }
            } else {
                try {
                    Double val = Double.parseDouble(i.trim());
                    muvelet.push(val);
                } catch (NumberFormatException numberFormatException) {
                    throw new ExpressionException("WRONG OPERAND");
                } catch (StackException stackException) {
                    throw new ExpressionException("WRONG POSTFIX EXCEPTION");
                }
            }
        }

        try {
            return (double) muvelet.pop();
        } catch (StackException stackException) {
            throw new ExpressionException("WRONG POSTFIX EXCEPTION");
        }
    }

    static boolean isOperator(String op) {
        // return op.equals("+") || op.equals("-") || op.equals("/") || op.equals("*");
        return "+-/*".contains(op);
    }

}
