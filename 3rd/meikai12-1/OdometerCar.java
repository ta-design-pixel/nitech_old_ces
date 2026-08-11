// 派生クラスOdometerCarを書く
public class OdometerCar extends Car{
    double odometer;

    public OdometerCar(String name, int width, int height, int length, double fuel,Day purchaseDay,double odometer) {
        super(name,width,height,length,fuel,purchaseDay);
        this.odometer = odometer;
    }

    public boolean move(double dx, double dy) {
        if (super.move(dx, dy)) {
            odometer += Math.sqrt(dx * dx + dy * dy);
            return true;
        }
        return false;
    }

    public double getOdometer(){
        return odometer;
    }
}