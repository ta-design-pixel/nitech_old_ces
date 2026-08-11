// 右上が直角であるサブクラスRgtTopRAITriangleを書く
public class RgtTopRAITriangle extends RAITriangle{

    private int width;
    private int height;

    public RgtTopRAITriangle(int width,int height){
        this.width = width;
        this.height = height;
    }

    public String toString(){
        return "RgtTopRAITriangle(width:"+ width + ", height:" + height +")";
    }

    public void draw(){
        for(int i = 0; i < height; i++){
            for (int j = 0; j < i; j++) 
                System.out.print(" ");
            for(int k = 0;k < width - i; k++)
                System.out.print('*');
            System.out.println();
        }
    }
}