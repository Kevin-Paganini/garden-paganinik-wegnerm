package paganinik;




public abstract class Bee {


    private int health;
    private double x;
    private double y;

    public Bee() {
        this.health = (int) Math.random() * 50;
        this.x =  (Math.random() * 550);
        this.y = (Math.random() * 550);


    }
    public abstract void moveBee();

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }


}
