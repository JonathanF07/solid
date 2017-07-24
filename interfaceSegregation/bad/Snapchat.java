package interfaceSegregation.bad;

public class Snapchat implements Messenger {

    @Override
    public void videoCall() {
        throw new UnsupportedOperationException();

    }

    @Override
    public void audioCall() {
        throw new UnsupportedOperationException();

    }

    @Override
    public void instantMessage() {
        action();

    }

    @Override
    public void attachDocuments() {
        throw new UnsupportedOperationException();

    }

    @Override
    public void attachPhotos() {
        throw new UnsupportedOperationException();

    }

    @Override
    public void attachVideos() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void quickAndGoneVideo() {
        action();

    }

    public void action() {

    }

}
