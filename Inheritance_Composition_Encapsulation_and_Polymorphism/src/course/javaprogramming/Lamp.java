package course.javaprogramming;

public class Lamp {
    private String style;
    private boolean isCordless;
    private boolean isOn;
    private double lightVolt;


    public Lamp(String style, boolean isCordless, boolean isOn) {
        this.style = style;
        this.isCordless = isCordless;
        this.isOn = isOn;
        this.lightVolt = 75;
    }

    public void turnOn(){
        if(isOn) System.out.println("switching lamp OFF");
        else
            System.out.println("switching lamp ON");
    }

    public String getStyle() {
        return style;
    }

    public boolean isCordless() {
        return isCordless;
    }

    public double getLightVolt() {
        return lightVolt;
    }
}
