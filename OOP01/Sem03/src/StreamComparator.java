import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {

    @Override
    public int compare(Stream o1, Stream o2) {
        int resCompare = o1.getGroupName().compareTo(o2.getGroupName());
        if (resCompare == 0) {
            if (o1.getGroupID() == o2.getGroupID()) {
                return 0;
            }
            else {
                return resCompare;
            }
        }
        else {
            return resCompare;
        }
    }
}
