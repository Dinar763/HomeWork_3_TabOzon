public class SelectButton implements Element{
    String type;
    String name;

    public SelectButton(String type, String name) {
        this.type = type;
        this.name = name;
    }


    @Override
    public String getType() {
        return type;
    }


    @Override
    public void click() {
        System.out.println("Открылось меню с категориями");
    }



