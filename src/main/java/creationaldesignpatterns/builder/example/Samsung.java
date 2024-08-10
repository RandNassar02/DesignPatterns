package creationaldesignpatterns.builder.example;

public class Samsung extends Company{

    @Override
    public int price() {
        return 20;
    }

    @Override
    public String pack() {
        return "Samsung CD";
    }
}
