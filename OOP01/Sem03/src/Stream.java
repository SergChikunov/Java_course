import java.util.ArrayList;
import java.util.List;

public class Stream {

    private int groupID;  //идентификатор группы
    private String groupName;  //наименование группы

    public Stream(int groupID, String groupName) {
        this.groupID = groupID;
        this.groupName = groupName;
    }

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
