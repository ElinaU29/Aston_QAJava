public class Bowl {
    public int feedAmount=0;
    public int maxFeed;

    Bowl(int maxFeed) {
        this.maxFeed = maxFeed;
    }

    public void pourFeed(int pourAmount) {
        feedAmount += pourAmount;
        if (feedAmount > maxFeed) {
            feedAmount = maxFeed;
        }
        System.out.println("В миске " + feedAmount + " корма");
    }

    public int bowlInfo() {
        return feedAmount;
    }
}
