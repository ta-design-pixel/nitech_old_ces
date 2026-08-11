// mainメソッドを含むShapeTesterEx131クラスを書く
import java.util.Scanner;
class ShapeTesterEx131{
    public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("図形は何個：");
		int no = stdIn.nextInt();			
        System.out.println();
		Shape[] p = new Shape[no];

		for (int i = 0; i < no; i++) {
			int type;
			do {
				System.out.print((i + 1) + "番の図形の種類（1…点／2…水平直線" +
													"／3…垂直直線／4…長方形）：");
				type = stdIn.nextInt();
                System.out.println();
			} while (type < 1 || type > 4);

			switch (type) {
			 case 1: p[i] = new Point();					
						break;

			 case 2:												
			 case 3: System.out.print("長さ：");
						int len = stdIn.nextInt();
						p[i] = (type == 2) ? new HorzLine(len) : new VertLine(len);
                        System.out.println();
						break;

			 case 4: System.out.print("幅　：");		
						int width = stdIn.nextInt();
						System.out.print("高さ：");
						int height = stdIn.nextInt();
						p[i] = new Rectangle(width, height);
						break;
			}
		}
        System.out.println();

		for (Shape s : p) {
			s.print();
			System.out.println();
		}
	}
}