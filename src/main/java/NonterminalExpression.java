public class NonterminalExpression implements Expression {
    private Expression expression;

    public NonterminalExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public void interpret() {
        // Perform nonterminal expression interpretation logic
        // ...
        System.out.println("Nonterminal expression interpreted.");
    }
}