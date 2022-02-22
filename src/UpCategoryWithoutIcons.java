import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Type;

public class UpCategoryWithoutIcons extends Category implements OnHover{
    String getType;
    String name;
    String iconDescription;

    @Override
    public void open() {
        System.out.println("Открылись категории");
    }


    public String getType() {
        return getType;
    }

    @Override
    public void click() {
        System.out.println("Открылся раздел " + name );
    }

    @Override
    public void showOnHover() {
        System.out.println("Выпал список товаров");

    }

    public String getName() {
        return name;
    }

    public String getIconDescription() {
        return iconDescription;
    }
}
