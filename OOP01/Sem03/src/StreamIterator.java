import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<Stream> {

    private int count;
    private List<Stream> streamList;

    public StreamIterator(StreamGroup stramGroup) {  //связь с StreamGroup
        count = 0;
        this.streamList = stramGroup.getStreamList();
    }

    @Override
    public boolean hasNext() {
        return count < streamList.size();
    }

    @Override
    public Stream next() {
        if (!hasNext()) {
            return null;
        }
        count++;
        return streamList.get(count);
    }
}
