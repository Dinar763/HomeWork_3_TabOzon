import java.awt.*;

public class Slider implements Element{
    private String type;

    public Slider(String type) {
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void click() {
        System.out.println("Изображение перелистнуто вручную");

    }

    public void showAutomatically(){
        System.out.println("Изображение перелистывается автоматически");
    }
}
