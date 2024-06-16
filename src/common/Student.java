package common;

public class Student extends Person {
	private String stNumber;
	private static boolean equal = false;
	
	public Student(String name, int age, String stNumber) {
		super(name, age);
		this.stNumber = stNumber;
	}
	@Override
	public String toString() {
		return super.toString() +", 학번:"+stNumber;
	}
	
	@Override
    public boolean equals(Object obj) {
		if (obj instanceof Student) {
            Student other = (Student) obj;
            if(!equal) {
            	System.out.println("오버라이딩 한 equals() 호출됨:" + this.getName());
            	equal = true;
            }
            return this.getName().equals(other.getName());
        }
		
        return false;
    }
}
