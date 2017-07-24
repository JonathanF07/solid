package interfaceSegregation.good;

public class WhatsApp implements TextMessenger, VideoMessenger, CallMessenger {

    @Override
    public void audioCall() {
        action();
    }

    @Override
    public void videoCall() {
        action();
    }

    @Override
    public void attachVideos() {
        action();
    }

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

    private void action() {

    }

}
