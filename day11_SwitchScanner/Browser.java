package day11_SwitchScanner;

public class Browser {
    public static void main(String[] args) {

        String browserName= "firefox";
        String result="";
        boolean validBrowse= browserName=="chrome"|| browserName=="firefox"|| browserName=="opera"
                ||browserName== "safari"||browserName=="edge";

        if(validBrowse){
            System.out.println(browserName + " Browser is selected");
        }else if(!validBrowse){
            System.out.println("Invalid Browser Name");
        }else{
            System.out.println(result);
        }

    }
}

/*
 Create a class called Browser. Write a program that can display the name of selected browser
	        1. declare a String variable named browserName
	        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge
	        3. if the browser name does not match with the valid browsers' names,
	        out put should be: Invalid Browser Name

	        Ex:
	        	String browser = "chrome";

	    	Output:
	    		Chrome Browser is selected

			Note: MUST use nested if
 */