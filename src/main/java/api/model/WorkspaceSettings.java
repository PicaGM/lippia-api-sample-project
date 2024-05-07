package api.model;

import java.util.ArrayList;

public class WorkspaceSettings{
    public boolean timeRoundingInReports;
    public boolean onlyAdminsSeeBillableRates;
    public boolean onlyAdminsCreateProject;
    public boolean onlyAdminsSeeDashboard;
    public boolean defaultBillableProjects;
    public Object lockTimeEntries;
    public Object lockTimeZone;
    public Round round;
    public boolean projectFavorites;
    public boolean canSeeTimeSheet;
    public boolean canSeeTracker;
    public boolean projectPickerSpecialFilter;
    public boolean forceProjects;
    public boolean forceTasks;
    public boolean forceTags;
    public boolean forceDescription;
    public boolean onlyAdminsSeeAllTimeEntries;
    public boolean onlyAdminsSeePublicProjectsEntries;
    public boolean trackTimeDownToSecond;
    public String projectGroupingLabel;
    public ArrayList<Object> adminOnlyPages;
    public Object automaticLock;
    public boolean onlyAdminsCreateTag;
    public boolean onlyAdminsCreateTask;
    public String timeTrackingMode;
    public boolean multiFactorEnabled;
    public String numberFormat;
    public String currencyFormat;
    public boolean decimalFormat;
    public boolean isProjectPublicByDefault;
}