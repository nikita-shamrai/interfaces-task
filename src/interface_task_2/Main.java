package interface_task_2;

public class Main {
    public static void main(String[] args) {
        Instrument[] instruments = {new Guitar(7), new Guitar(3), new Drum(12), new Tube(14), new Drum(3)};

        for (Instrument instrument:
             instruments) {
            instrument.play();
        }
    }
}
