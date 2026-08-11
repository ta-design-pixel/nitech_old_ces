// mainメソッドを含むTriangleTesterクラスを書く

public class TriangleTester {

    public static void main(String[] args) {
        Triangle[] triangles = new Triangle[3];

        triangles[0] = new Triangle(1.2, 2.6, 3.8);
        triangles[1] = new Triangle(3, 7);
        triangles[2] = new Triangle(5);

        System.out.println("ゲッタの確認");
        for (int i = 0; i < 3; i++) {
            System.out.println(triangles[i].getA() + "," + triangles[i].getB() + "," + triangles[i].getC());

        }
        System.out.println("セッタの確認");
        triangles[0].setA(7.4);
        triangles[0].setB(9.3);
        triangles[0].setC(1.4);
        System.out.println(triangles[0]);

        System.out.println("判定");
        for (int i = 0; i < 3; i++) {
            if (Triangle.hantei1(triangles[i])) {
                System.out.println("二等辺三角形である。");
            } else {
                System.out.println("二等辺三角形でない。");
            }
            if (Triangle.hantei2(triangles[i])) {
                System.out.println("正三角形である。");
            } else {
                System.out.println("正三角形でない。");
            }
        }
        if (Triangle.hantei3(triangles[0], triangles[1])) {
            System.out.println("等しい");
        } else {
            System.out.println("等しくない");
        }
        if (Triangle.hantei3(triangles[1], triangles[2])) {
            System.out.println("等しい");
        } else {
            System.out.println("等しくない");
        }
        if (Triangle.hantei3(triangles[0], triangles[2])) {
            System.out.println("等しい");
        } else {
            System.out.println("等しくない");
        }
    }
}
