abstract class ArithmeticExp {
    public abstract int evaluate();
    public abstract String toString();
}

class Number extends ArithmeticExp {
    private int value;

    public Number(int value) {
        this.value = value;
    }

    @Override
    public int evaluate() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}

abstract class Binary extends ArithmeticExp {
    protected ArithmeticExp left, right;

    public Binary(ArithmeticExp left, ArithmeticExp right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int evaluate() {
        return left.evaluate() + right.evaluate();
    }
}

class Sum extends Binary {
    public Sum(ArithmeticExp left, ArithmeticExp right) {
        super(left, right);
    }


    @Override
    public String toString() {
        return null;
    }
}

class Product extends Binary {
    public Product(ArithmeticExp left, ArithmeticExp right) {
        super(left, right);
    }

    @Override
    public int evaluate() {
        return left.evaluate() * right.evaluate();
    }

    @Override
    public String toString() {
        return null;
    }
}

class Modulo extends ArithmeticExp {
    private ArithmeticExp left, right;

    public Modulo(ArithmeticExp left, ArithmeticExp right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int evaluate() {
        return left.evaluate() % right.evaluate();
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " % " + right.toString() + ")";
    }
}

class ArithmeticOperation {
    public static void main(String[] args) {
        // Constructing the expression 3 + 2 * 5
        ArithmeticExp term = new Number(3);
        term = new Sum(term, new Product(new Number(2), new Number(5)));

        System.out.println(term.evaluate()); // Output: 13

        // Constructing the expression 12 + 13
        term = new Sum(new Number(12), new Number(13));
        System.out.println(term.evaluate()); // Output: 25

        // Constructing the expression 12 - 13
        term = new Modulo(new Number(12), new Number(13));
        System.out.println(term.evaluate()); // Output: -1
    }
}
