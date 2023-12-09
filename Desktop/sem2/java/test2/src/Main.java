
class ArithmeticOperation {
    public static void main(String[] args) {

        ArithmeticExp term = new Number(3);
        term = new Sum(term, new Product(new Number(2), new Number(5)));

        System.out.println(term.evaluate());
        System.out.println(term.toString());

        term = new Sum(new Number(12), new Number(13));
        System.out.println(term.evaluate());
        System.out.println(term.toString());

        term = new Modulo(new Number(12), new Number(13));
        System.out.println(term.evaluate());
        System.out.println(term.toString());
    }
}
