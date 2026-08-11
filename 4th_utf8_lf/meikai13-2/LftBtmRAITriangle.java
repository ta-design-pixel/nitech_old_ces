// 左下が直角であるサブクラスLftBtmRAITriangleを書く
public class LftBtmRAITriangle extends RAITriangle{

    private int width;
    private int height;

    public LftBtmRAITriangle(int width,int height){
        this.width = width;
        this.height = height;
    }

    public String toString(){
        return "LftBtmRAITriangle(width:"+ width + ", height:" + height +")";
    }

    public void draw(){
        for(int i = 0; i < height; i++){
            for(int j = 0;j < i; j++)
                System.out.print('*');
            System.out.println();
        }
    }
}