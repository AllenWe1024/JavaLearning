//自定义异常：
class NotTriangleException extends Exception {
    static final long serialVersionUID = 13465653435L;

    public NotTriangleException() {
    }

    public NotTriangleException(String message) {
        super(message);
    }
}


class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) throws NotTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new NotTriangleException("三角形的边长必须是正数");
        }
        if (a + b <= c || b + c <= a || a + c <= b) {
            throw new NotTriangleException(a + "," + b + "," + c + "不能构造三角形，三角形任意两边之后必须大于第三边");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) throws NotTriangleException {
        if (a <= 0) {
            throw new NotTriangleException("三角形的边长必须是正数");
        }
        if (a + b <= c || b + c <= a || a + c <= b) {
            throw new NotTriangleException(a + "," + b + "," + c + "不能构造三角形，三角形任意两边之后必须大于第三边");
        }
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) throws NotTriangleException {
        if (b <= 0) {
            throw new NotTriangleException("三角形的边长必须是正数");
        }
        if (a + b <= c || b + c <= a || a + c <= b) {
            throw new NotTriangleException(a + "," + b + "," + c + "不能构造三角形，三角形任意两边之后必须大于第三边");
        }
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) throws NotTriangleException {
        if (c <= 0) {
            throw new NotTriangleException("三角形的边长必须是正数");
        }
        if (a + b <= c || b + c <= a || a + c <= b) {
            throw new NotTriangleException(a + "," + b + "," + c + "不能构造三角形，三角形任意两边之后必须大于第三边");
        }
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}

public class TestTriangle {
    public static void main(String[] args) {
        Triangle t = null;
        try {
            t = new Triangle(2, 2, 3);
            System.out.println("三角形创建成功：");
            System.out.println(t);
        } catch (NotTriangleException e) {
            System.err.println("三角形创建失败");
            e.printStackTrace();
        }

        try {
            if (t != null) {
                t.setA(3);
            }
            System.out.println("三角形边长修改成功");
        } catch (NotTriangleException e) {
            System.out.println("三角形边长修改失败");
            e.printStackTrace();
        }
    }
}
