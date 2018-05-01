public class WaterBottle {
    private int volume;

    public WaterBottle() {
        this.volume = 100;
    }

    public int getVolume(){
        return this.volume;
    }

    public void drink(){
        if (this.volume > 9)
        {
          this.volume -= 10;
        }

    }

    public void emptyBottle() {
        this.volume = 0;
    }

    public void fillBottle() {
        this.volume = 100;
    }
}
