package software.ulpgc.imageviwer.swing;

import software.ulpgc.imageviwer.Image;
import software.ulpgc.imageviwer.ImagePresenter;
import software.ulpgc.imageviwer.mocks.MockImageLoader;

public class Main {
    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
        ImagePresenter presenter = new ImagePresenter(frame.getImageDisplay());
        presenter.show(image());
        frame.setVisible(true);
    }

    private static Image image() {
        return new MockImageLoader().load();
    }
}
