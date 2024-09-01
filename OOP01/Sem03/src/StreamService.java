import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamService {

    private StreamGroup streamGroup;

    public List<Stream> sortStreamByName() {
        List<Stream> streamList = new ArrayList<>(streamGroup.getStreamList());
        streamList.sort(new StreamComparator());
        return streamList;
    }

}
