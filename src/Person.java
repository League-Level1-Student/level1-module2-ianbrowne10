
public class Person {
private String name;
private String superPower;

Person(String name){
	this.name = name;
}

public String toString() { 
return "My name is "+this.name+" and my power is "+this.superPower+"!";
}


public void setName(String name) {
	this.name = name;
	
}
public void setsuperPower(String superPower) {
	this.superPower = superPower;
}

public String getName () {
	return this.name;
}

public String getsuperPower() {
	return this.superPower;
}

}
