package api.model;

import java.util.ArrayList;

public class EditTimer {
    public String id;
    public Object description;
    public Object tagIds;
    public String userId;
    public boolean billable;
    public Object taskId;
    public Object projectId;
    public TimeInterval timeInterval;
    public String workspaceId;
    public boolean isLocked;
    public ArrayList<Object> customFieldValues;
    public String type;
    public Object kioskId;
}
