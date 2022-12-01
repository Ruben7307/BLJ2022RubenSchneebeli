
public class Fish {
    private String name;
    private String waterType;

    private int positionx;
    private int positiony;



    public void createFish(String name,String waterType, int positionx, int positiony) {
        this.name = name;
        this.waterType = waterType;
        this.positionx = positionx;
        this.positiony = positiony;
    }
    public Fish(String name,String waterType, int positionx, int positiony){
        this.name = name;
        this.waterType = waterType;
        this.positionx = positionx;
        this.positiony = positiony;
    }


    public void printfish(){
        System.out.println("_________________________________");
        System.out.println("name:"+name);
        System.out.println("Type:"+waterType);
        System.out.println("position x:"+positionx);
        System.out.println("position y:"+positiony);
        System.out.println("_________________________________");
    }



    public void setPositionx(int positionx) {
        this.positionx = positionx;
    }


    public void setPositiony(int positiony) {
        this.positiony = positiony;
    }

    public int getPositionx() {
        return positionx;
    }

    public int getPositiony() {
        return positiony;
    }

}
