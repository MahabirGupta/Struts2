import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class RegisterAction extends ActionSupport implements Preparable{
	
	String firstName, lastName, gender,email,address,selectedColor;
	Integer age;
	List<String> colors;
	Boolean subscription;
//	List<String> hobbies;
	List hobbies = new ArrayList();
	

	String selectedHobbies;
	
//	List<String> selectedHobbies = new ArrayList<String>();
	


	//	Create method to initialize form
	public String initializeFormFields() {
		
		initializeColors();
		initializeHobbies();
		return "input";
		
	}
	
//	Create method to initialize colors
	public void initializeColors() {
		colors = new ArrayList<String>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		colors.add("White");
		
	}
	
//	Create method to initialize colors
	public void initializeHobbies() {
		
		hobbies = new ArrayList<String>();
		hobbies.add("Drawing");
		hobbies.add("Teaching");
		hobbies.add("Singing");
		hobbies.add("Programming");
		
	}
	
public String execute() {
		
		System.out.println("execute() method called");
		
//		Check if subscription is true
		if(subscription == true) {
			System.out.println("You are a subscriber");
		}else {
			System.out.println("You are not a subscriber");
		}
		
		initializeFormFields();
		initializeHobbies();
		return "success";
	}

public void prepare() throws Exception {
	hobbies = new ArrayList<String>();
	hobbies.add("Drawing");
	hobbies.add("Teaching");
	hobbies.add("Singing");
	hobbies.add("Programming");

}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getSelectedColor() {
	return selectedColor;
}
public void setSelectedColor(String selectedColor) {
	this.selectedColor = selectedColor;
}
public List<String> getColors() {
	return colors;
}
public void setColors(List<String> colors) {
	this.colors = colors;
}

public Boolean getSubscription() {
	return subscription;
}

public void setSubscription(Boolean subscription) {
	this.subscription = subscription;
}

public List<String> getHobbies() {
	return hobbies;
}

public void setHobbies(List<String> hobbies) {
	this.hobbies = hobbies;
}

public String getSelectedHobbies() {
	return selectedHobbies;
}

public void setSelectedHobbies(String selectedHobbies) {
	this.selectedHobbies = selectedHobbies;
}

//public List<String> getSelectedHobbies() {
//    return selectedHobbies;
//}
//
//public void setSelectedHobbies(List<String> selectedHobbies) {
//    this.selectedHobbies = selectedHobbies;
//}

//override the validate method in ActionSupport
//public void validate() {
//	if(firstName.equals("")) {
//		addFieldError("firstName","First Name is required");
//	}
//	if(lastName.equals("")) {
//		addFieldError("lastName","Last Name is required");
//	}
//	if(gender == null) {
//		addFieldError("gender","Gender is required");
//	}
//	if(age == null) {
//		addFieldError("age","Age is required");
//	}
//	else if(age <= 18) {
//		addFieldError("age","Age should be above 18");
//	}
//	if(email.equals("")) {
//		addFieldError("email","Email is required");
//	}
//}

}