public class ProductWithIcon extends Category{
    String iconDescription;
    String name;
    int imagePixelSize;

    public ProductWithIcon(String iconDescription, String name,int imagePixelSize) {
        this.iconDescription = iconDescription;
        this.name = name;
        this.imagePixelSize = imagePixelSize;

    }

    public String getIconDescription() {
        return iconDescription;
    }


    public String getName() {
        return name;
    }

    public int getimagePixelSize() {
        return imagePixelSize;
    }

    @Override
    public void open() {
        System.out.println("Изображение товара");
    }
}
