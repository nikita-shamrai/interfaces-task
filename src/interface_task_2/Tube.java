package interface_task_2;

public class Tube implements Instrument{
    private int diameter;
    @Override
    public void play() {
        System.out.println("Метод play у трубы");
        System.out.println("Диаметр трубы "+getDiameter()+ " см.\n");
    }

    public Tube(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }
}
