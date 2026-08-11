// 直角二等辺三角形を表すサブクラス/抽象クラスRAITriangleを書く
public abstract class RAITriangle {

	public abstract String toString();

	public abstract void draw();

	public void print() {
		System.out.println(toString());
		draw();
	}
}