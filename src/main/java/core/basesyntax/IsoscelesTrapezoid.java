package core.basesyntax;

class IsoscelesTrapezoid implements Figure {
    private final String color;
    private final double base1;
    private final double base2;
    private final double height;

    public IsoscelesTrapezoid(String color, double base1, double base2, double height) {
        this.color = color;
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (base1 + base2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + getArea() + " sq. units, base1: " + base1 + " units, base2: "
                + base2 + " units, height: " + height + " units, color: " + color);
    }
}
