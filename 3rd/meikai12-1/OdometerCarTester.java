// mainメソッドを含むOdometerCarTesterクラスを書く
public class OdometerCarTester {
    public static void main (String[] args){
        OdometerCar a = new OdometerCar("ビッツ",1660,1500,3640,40.4,new Day(2007,2,4),120000);
        System.out.println("総走行距離："+a.getOdometer());
    }
}