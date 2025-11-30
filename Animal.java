public class Animal {
    String name;
    int maxRun;
    int maxSwim;
    boolean bellyful = false;
    int feedAmount;
    static int animalCount;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }
    public void run(int distanceInMeters) {
        if (distanceInMeters <= maxRun) {
             System.out.println(name + " пробежал(а) " + distanceInMeters + " м");
        } else {
             System.out.println(name + " пробежал(а) " + maxRun + " м и устал");

        }
    }
    public void swim(int distanceInMeters) {
        if (distanceInMeters <= maxSwim) {
            System.out.println(name + " проплыл(а) " + distanceInMeters + " м");
       } else {
            System.out.println(name + " проплыл(а) " + maxSwim/2 + " м и вернулся(ась) обратно на сушу, чтобы отдохнуть");

       }
    }  
    
    public void isBellyful() {
        if (bellyful) {
            System.out.println(name + " сытый!");
        } else {
            System.out.println(name + " голоден(а)");
        }
    }
    
    public void feed(Bowl bowl) {
        if (!bellyful) {
            if (bowl.feedAmount > feedAmount) {
                bowl.feedAmount -= feedAmount;
                bellyful =true;
                System.out.println(name + " поел из миски, и теперь сытый(ая)!" + " В миске " + bowl.bowlInfo() + " корма");
            } else {
                System.out.println(name + " не смог(ла) поесть из миски. Он(а) все еще голоден(а)!");
            }
        } else {
                System.out.println(name + " не голоден(а)!");

        }
    }

    static void showCount() {
        System.out.println("Животных: " + animalCount);
    }
}




