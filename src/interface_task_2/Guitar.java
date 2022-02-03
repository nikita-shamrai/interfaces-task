package interface_task_2;

public class Guitar implements Instrument{
private int stringsCount;

    @Override
    public void play() {
        System.out.println("Метод play у Гитары");
        System.out.println("Эта гитара имеет "+getStringsCount()+" струн.\n");
    }

    public Guitar(int stringsCount) {
        this.stringsCount = stringsCount;
    }

    public int getStringsCount() {
        return stringsCount;
    }
}
