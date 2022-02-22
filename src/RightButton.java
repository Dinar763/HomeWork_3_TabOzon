public class RightButton implements Element{
    private String type;

    public RightButton(String type) {
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
        System.out.println("Изображение перелистнуто вправо");
    }
}
