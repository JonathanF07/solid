package interfaceSegregation.bad;

public class WhatsApp implements Messenger {

    @Override
    public void videoCall() {
        action();
    }

    @Override
    public void audioCall() {
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

    @Override
    public void attachVideos() {
        action();
        
    }

    @Override
    public void quickAndGoneVideo() {
        throw new UnsupportedOperationException();
        
    }
    
    private void action() {
        
    }

}
