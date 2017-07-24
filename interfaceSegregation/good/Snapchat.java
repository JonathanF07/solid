package interfaceSegregation.good;

public class Snapchat implements DoStupidStuffAndHideMessenger, TextMessenger {

    @Override
    public void instantMessage() {
        action();
    }

    @Override
    public void attachDocuments() {
        action();
    }

    @Override
    public void attachPhotos() {
        action();
    }

    @Override
    public void quickAndGoneVideo() {
        action();
    }

    private void action() {

    }

}
