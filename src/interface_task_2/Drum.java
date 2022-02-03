package interface_task_2;

public class Drum implements Instrument{
    private int size;
    @Override
    public void play() {
        System.out.println("Метод play у Барабана");
        System.out.println("Барабан имеет размер "+getSize()+ " см.\n");
    }

    public Drum(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
