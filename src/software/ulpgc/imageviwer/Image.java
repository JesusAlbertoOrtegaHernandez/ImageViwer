package software.ulpgc.imageviwer;

public interface Image {
    String id();
    Image next();
    Image prev();

}
