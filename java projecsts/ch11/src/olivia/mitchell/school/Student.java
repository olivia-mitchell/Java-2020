package olivia.mitchell.school;
import java.util.*;
public class Student {
	private String name;
	private String bDay;
	private String ssid;
	private String address;
	private Classes[] classes;
	private String phoneNum;
	private String healthCond;
	private String email;
	private String advisor;
	private String gender;
	private String credits;
	private int lunch;
	private int age;
	private int gradeLevel;
	private double gpa;
	
	private void pickClass() {
		String[] classList = {"Math",
				"ELA",
				"History",
				"Science",
				"ProgramingJava",
				"ProgramingPython",
				"ProgramingCsharp",
				"PE",
				"ProStart",
				"Cosmo",
				"Health",
				"Quoir",
				"internship",
				"Bussiness",
				"Accounting",
				"Marketing",
				"AutoShop",
				"WoodShop",
				"MetalShop"};
		
	
		for (int i=0; i<19; i++) {
			System.out.println(classList[i]);
		}

	}
	
	private String genSsId() {
		Random rand = new Random();
		int num1 = rand.nextInt(10);
		String pos1 = Integer.toString(num1);
		int num2 = rand.nextInt(10);
		String pos2 = Integer.toString(num2);
		int num3 = rand.nextInt(10);
		String pos3 = Integer.toString(num3);
		int num4 = rand.nextInt(10);
		String pos4 = Integer.toString(num4);
		int num5 = rand.nextInt(10);
		String pos5 = Integer.toString(num5);
		int num6 = rand.nextInt(10);
		String pos6 = Integer.toString(num6);
		int num7 = rand.nextInt(10);
		String pos7 = Integer.toString(num7);
		int num8 = rand.nextInt(10);
		String pos8 = Integer.toString(num8);
		
		String id = pos1+pos2+pos3+pos4+pos5+pos6+pos7+pos8;
		
		return id;
	}
	
	private int genLunch (String id, int grade) {
		int lunch;
		String x = id + Integer.toString(grade);
		lunch = Integer.parseInt(x);
		
		return lunch;
	}
	
	public Student() {
		setSsid(genSsId());
		Scanner input = new Scanner(System.in);
		System.out.println("enter your name: ");
		setName(input.nextLine());
		System.out.println("enter your birth day: ");
		setbDay(input.nextLine());
		System.out.println("enter your ssid: ");
		setSsid(input.nextLine());
		System.out.println("enter your adress: ");
		setAddress(input.nextLine());
		System.out.println("enter your phoneNum: ");
		setPhoneNum(input.nextLine());
		System.out.println("enter your health Conditions: ");
		setHealthCond(input.nextLine());
		System.out.println("enter your email: ");
		setbDay(input.nextLine());
		System.out.println("enter your advisor: ");
		setAdvisor(input.nextLine());
		System.out.println("enter your gender: ");
		setGender(input.nextLine());
		System.out.println("enter your credits: ");
		setCredits(input.nextLine());
		System.out.println("enter your age: ");
		setAge(input.nextLine());
		System.out.println("enter your grade level: ");
		setGradeLevel(input.nextLine());
		System.out.println("enter your gpa: ");
		setGpa(input.nextLine());
		setLunch(genLunch(this,ssid, this.gradeLevel));
		pickClass();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getbDay() {
		return bDay;
	}

	public void setbDay(String bDay) {
		this.bDay = bDay;
	}

	public String getSsid() {
		return ssid;
	}

	public void setSsid(String ssid) {
		this.ssid = ssid;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getHealthCond() {
		return healthCond;
	}

	public void setHealthCond(String health) {
		this.healthCond = health;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdvisor() {
		return advisor;
	}

	public void setAdvisor(String advisor) {
		this.advisor = advisor;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCredits() {
		return credits;
	}

	public void setCredits(String credits) {
		this.credits = credits;
	}

	public int getLunch() {
		return lunch;
	}

	public void setLunch(int lunch) {
		this.lunch = lunch;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getGradeLevel() {
		return gradeLevel;
	}

	public void setGradeLevel(int gradeLevel) {
		this.gradeLevel = gradeLevel;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public Student(String name, String bDay, String ssid, String address, String phoneNum, String health, String email,
			String advisor, String gender, String credits, int lunch, int age, int gradeLevel, double gpa) {
		super();
		this.name = name;
		this.bDay = bDay;
		this.ssid = ssid;
		this.address = address;
		this.phoneNum = phoneNum;
		this.healthCond = health;
		this.email = email;
		this.advisor = advisor;
		this.gender = gender;
		this.credits = credits;
		this.lunch = lunch;
		this.age = age;
		this.gradeLevel = gradeLevel;
		this.gpa = gpa;
	}

	public Student(int gradeLevel, double gpa) {
		super();
		this.gradeLevel = gradeLevel;
		this.gpa = gpa;
	}

	public Student(String name) {
		this.name = name;
	}

}
