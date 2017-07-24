package interfaceSegregation.bad;

public class Snapchat implements Messenger {

    @Override
    public void videoCall() {
        // Doesn't have this function

    }

    @Override
    public void audioCall() {
        // Doesn't have this function

    }

    @Override
    public void instantMessage() {
        action();

    }

    @Override
    public void attachDocuments() {
        // Doesn't have this function

    }

    @Override
    public void attachPhotos() {
        // Doesn't have this function

    }

    @Override
    public void attachVideos() {
        // Doesn't have this function

    }

    @Override
    public void quickAndGoneVideo() {
        action();

    }

    public void action() {

    }

}
