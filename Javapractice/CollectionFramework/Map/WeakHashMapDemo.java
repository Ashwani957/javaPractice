
import java.util.WeakHashMap;

class Image {

    private String name;

    public Image(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{"
                + " name='" + name + "'"
                + "}";
    }

}

public class WeakHashMapDemo {


    public void simulateAppliicationRunning(){
        try {
            System.out.println("Simulating application running...");
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String args[]) {

        WeakHashMap<String, Image> imageCache = new WeakHashMap<>();

        String key1=new String("image1");
        String key2=new String("image2");
        imageCache.put(key1 new Image("image1"));
        imageCache.put(key2, new Image("image2"));
        
        System.out.println(imageCache);
    }
}
