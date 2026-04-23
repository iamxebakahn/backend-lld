package library.users;

public abstract class User {      //M:A Task 1 Step 1.1,  M:A Task 3 Step 3.1
    private String userId;        //M:A Task 1 Step 1.1
    private String name;            //M:A Task 1 Step 1.1
    private String contactInfo;     //M:A Task 1 Step 1.1
    private static int totalUsers; // M:A Task 6 Step 6.1

    public String getName()    //M:A Task 1 Step 1.2
    {
        return name;
    }
    public void setName(String name)  //M:A Task 1 Step 1.2
    {
        this.name=name;
    }

    public String getContactInfo()  //M:A Task 1 Step 1.2
    {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo)  //M:A Task 1 Step 1.2
    {
        this.contactInfo=contactInfo;
    }

    public User()   //M:A Task 2 Step 2.1
    {
        this.userId=generateUniqueId();
        totalUsers++;  //M:A Task 6 Step 6.1
    }

    public User(String name, String contactInfo)   //M:A Task 2 Step 2.1
    {
        this.name=name;
        this.contactInfo=contactInfo;
        totalUsers++;  //M:A Task 6 Step 6.1
    }

    public User(User u)   //M:A Task 2 Step 2.1
    {
        this.userId=u.userId;
        this.name=u.name;
        this.contactInfo=u.contactInfo;
        totalUsers++;  //M:A Task 6 Step 6.1
    }

    public final String generateUniqueId() //M:A Task 2 Step 2.1  ,     M:A Task 6 Step 6.2
    {
        return "User"+totalUsers;  //M:A Task 6 Step 6.2
    }

    public abstract void displayDashboard(); // M:A Task 3 Step 3.1
    public abstract boolean canBorrowBooks(); // M:A Task 3 Step 3.1

    public static int getTotalUsers() //M:A Task 6 Step 6.1
    {
        return totalUsers;
    }
}
