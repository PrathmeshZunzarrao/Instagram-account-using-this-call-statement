class Instagram
{
    String name;
    long mob;
    String username;
    String password;
    String gender;
    int age;
    String edu;
    
    Instagram()
    {
        // Default constructor
    }
    
    Instagram(String name, long mob, String username, String password)
    {
        this.name = name;
        this.mob = mob;
        this.username = username;
        this.password = password;
    }
    
    Instagram(String name, long mob, String username, String password, String gender)
    {
        this(name,mob,username,password);
        this.gender = gender;
    }
    
    Instagram(String name, long mob, String username, String password, String gender, int age)
    {
        this(name,mob,username,password,gender);
        this.age = age;
    }
    
     Instagram(String name, long mob, String username, String password, String gender, int age, String edu)
    {
        this(name,mob,username,password,gender,age);
        this.edu = edu;
    }
    
    public void showData()
    {
		System.out.println("\n========== Instagram Account Opening ==========\n");  
        System.out.println("Full Name : " + name);  
        System.out.println("Mobile Number : " + mob);    
        System.out.println("Username : " + username);    
        System.out.println("Password : " + password);    
        System.out.println("Gender(M/F) : " + gender);    
        System.out.println("Age : " + age);    
        System.out.println("Education : " + edu);  
		System.out.println("\n========== Account Opened Successfully ==========\n");  
    }
    
    
    
    public static void main(String[] args)
    {
        Instagram I1 = new Instagram("Nikhil Sharma",9843210,"NikSharma","Nik@123");
        I1.showData();

		
		Instagram I2 = new Instagram("Nikhil Sharma",9843210,"NikSharma","Nik@123","M",25);
        I2.showData();


		Instagram I3 = new Instagram("Nikhil Sharma",9843210,"NikSharma","Nik@123","M",25,"12th");
        I3.showData();

    }
}
