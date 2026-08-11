// mainメソッドを含むShapeTesterEx132クラスを書く
class ShapeTesterEx132{

    public static void main(String[] args) {
        RAITriangle[] p = new RAITriangle[2];
        p[0] = new RgtTopRAITriangle(5,5);
        p[1] = new LftBtmRAITriangle(8,8);

		for (RAITriangle s : p) {
			s.print();
			System.out.println();
		}
	}
}