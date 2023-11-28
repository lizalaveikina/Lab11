package ucu.edu.ua.task3;

import java.util.Map;
import java.util.HashMap;

public class ProxyImage implements MyImage {

    private static Map<String, RealImage> ImageCache = new HashMap<>();

    private String file;

    public ProxyImage(String file) {
        this.file = file;
    }

    @Override
    public void display() {
        RealImage realImage = getRealImage();
        realImage.display();
    }

    private RealImage getRealImage() {
        
        RealImage realImage = ImageCache.get(file);

        if (realImage == null) {
            realImage = new RealImage(file);
            ImageCache.put(file, realImage);
        }

        return realImage;
    }

    public static void main(String[] args) {

        MyImage first = new ProxyImage("file1.jpeg");
        first.display();

        MyImage second = new ProxyImage("file2.jpeg");
        second.display();
        
    }
}

