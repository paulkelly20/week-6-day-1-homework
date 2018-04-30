public class WaterBottle {
    private int volume;

    public WaterBottle() {
        this.volume = 100;
    }

    public int getVolume(){
        return this.volume;
    }

    public int Drink(){
        if (this.volume > 9){
         return this.volume -= 10;
        } else {
           return this.volume;
        }
    }

    public int emptyBottle() {
        return this.volume = 0;
    }

    public int fillBottle() {
        return this.volume = 100;
    }
}
