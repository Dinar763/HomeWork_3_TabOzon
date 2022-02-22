public class SearchBar implements Element{
    String request;
    String getType;



    @Override
    public String getType() {
        return getType;
    }

    @Override
    public void click() {
        System.out.println("Введите поисковый запрос");
    }

    public void enterClick(){
        click();
        System.out.println("Получите список найденного");
    }
}
