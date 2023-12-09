

public abstract class Binary extends ArithmeticExp {
    protected ArithmeticExp left, right;

    public Binary(ArithmeticExp left, ArithmeticExp right) {
        this.left = left;
        this.right = right;
    }
}