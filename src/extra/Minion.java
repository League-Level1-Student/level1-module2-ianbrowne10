package extra;

public class Minion {
private String name;
private int eyes; 
private String color; 
private String master;

public Minion(String name2, int eyes2, String color2, String master2) {
	name = name2;
	eyes = eyes2;
	color = color2;
master = master2;
}
 
public String getColor() {
	return this.color;
}

public void setColor(String color) {
	this.color = color;
}
public String getMaster() {
	return this.master;
}
public void setMaster(String master) {
	this.master = master;
}
public String getName() {
	return this.name;
}
public void setName(String name) {
this.name = name;
}
public int getEyes() {
	return this.eyes;
}
public void setEyes(int eyes) {
this.eyes = eyes;
}

}
