import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Image implements Element, Picture{
    String url;
    String ImageContent;

    public Image(String title) {
        url = title;
        try{
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void print(){
        System.out.println("Image with name: " + url + " ");
    }

    @Override
    public void add(Element element) {

    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public Element get(int index) {
        return null;
    }

    @Override
    public String url() {
        return null;
    }

    @Override
    public Dimension dim() {
        return null;
    }

    @Override
    public String content() {
        return  ImageContent;
    }
}
