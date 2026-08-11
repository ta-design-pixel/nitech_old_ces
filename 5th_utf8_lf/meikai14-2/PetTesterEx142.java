// mainメソッドを含むPetTesterEx142クラスを書く
public class PetTesterEx142 {
    public static void main(String[] args){
        SkinnableRobotPet a = new SkinnableRobotPet("ロボポチ");

        a.introduce();
        for(int i=0; i <6; i++){
            a.changeSkin(i);
        }
    }
} 