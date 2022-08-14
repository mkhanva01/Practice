package Basic_Autoamtion;

import org.testng.reporters.jq.Model;

public class Java_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//~Java Execution
		//Javac is command that read source files that contain module, package and type declarations written in the JAVA programming language and compiled them into class files that run on the JVM (JAVA virtual machine)
		
		
		//JAVA Access Modifier-Public: Accessible from anywhere in the package and classes.
							//Protected: Accessible from the classes under same package and subclass
							//Default: Accessible by the classes of the same package
							//Private: Accessible only within same class
		
		
		//What is A class? A class is a collection of methods and data.
		//What is a Public class? Public means that the class can be accessed by any other class in any package.
		
		
		//**Public static void main(String[] args){}
		//main: Main is a method of the class, While running Java program we've to define main method
		//void: Void returns nothing. We want the method to go forward and no return is expected.
		//Static: Is the type of the method, means we're not expecting any difference inside the method. It is defined as a member of the class rather than a member of an instance of the class.
		//Public: Public means the method is accessible by any class in any package.
		
		
		//When we're invoking the class, What I'm saying is "Java Runtime, run the program defined by the public static void main method of Java_Class"
		
		
		
		//Java Data Types
		//**Primitive data type**//
		
		//byte- Integer-- Integer is a whole number that is not fraction. Example 10 -- 	Range -128 and 127 -- 	Size of 8 Bits
		//short-Integer-- Integer is a whole number that is not fraction. Example 10000--	 Range -32768 to 32767-- Size of 16 Bits
		//int- Integer- Integer is a whole number that is not fraction. Example --2,147,483,647 Range -2M to -2,147,483,646-- Size of 32 Bits
		//long- Integer- Integer is a whole number that is not fraction.. Ex:--9223372'036'854 Range  -9'223'372'036'854'775'808 to 9'223'372'036'854'775'807 -- Size of 64 Bits = 8 byte
		//float- fractional-Fractional consists of two numbers. (With decimal). Means a numerator and a denominator= Example 10.254756 -- Size of 32 Bits = 4 byte
		//double- fractional-Fractional consists of two numbers. (With decimal). Means a numerator and a denominator= Example 10.2547568985658214-- Size of 64 Bits = 8 byte
		//char- Char is used to store different type of data Example= A,b,c/ 1,2,3/ ?,!,# 	Size of 16 Bits
		//Boolean- denotes two type True/False  Size of 1 Bit
		
		
		//String- Sequence of character- Example "Myn ame 123 wha  t??" 	
		
		
		
		
		
		/*
		 What is a locator?
		 Locator is a type of command which helps to locate any web element from any web application.
		 Locators are used to automate web applications by finding elements and performing actions.
		 Type of Locators: ID, Name, Class, LinkText, PartialLinkText, Tagname, XPath, CSS
		 
		 
		 
		 ~~What is XPath: Xpath is XML Path which itself is a locator
		 ~~What is XML: Extensible Markup Language (type of file format)
		 **Types of XPath: Absolute Xpath
		 *				   Relative Xpath
		 *Absolute Xpath: Absolute XPath is the direct way to find an element. **Starts with /
		 *Relative XPath: Relative XPath locates element from anywhere in the middle of the DOM (Document Object Model) **Starts with //
		 
		 
		 
		 
		 
		 ~Preceding: Any element that's coming before the other											(Bottom to Top)
		 ~Descendant: Ancestor of any element. Any element that has been descended from its ancestor. (Top to Bottom)
		 
		 
		 
		 For Css Selector
		 Prefix (Starts-with) -- ^
		 Substring (* middle value)
		 Suffix ($= Ends-with)
		*/
		
		
		
		//ImplicitlyWait: It waits for the specified amount of time before throwing any exception.
		//ExplicitWait:	  It waits for the specified amount of time ALSO waits till the condition is met before throwing any exception.
	
	
	
		/*TestNG: It is an automation framework. NG stands for Next Generation.
		 
 		What can TestNG do? 
 		Using TestNG helps to enhance the testing process and makes it more efficient.
 		~It allows users to get a proper report after testing, That way the user gets to know how many test cases passed/ failed/ skipped. Based on that, the user can fix and run those failed/ skipped test cases.
		~Annotations can be used in TestNG which are also very definitive. Annotations like
		@Test, @BeforeTest, @AfterTest, @BeforeMethod, @AfterMethod
		
		@BeforeTest:It executes the code block before any other code blocks
		@Test: This works as test methods, and will be executed After @BeforeTest.
		@AfterTest: This works as the concluding method and only executes after every other method is being executed.
		 
		~TestNG allows users to create multiple methods (Multiple TestCases)
		
		
		~We can parameterize the methods like Priority, DependsOnMethods, Group, InvocationCount, ThreadPoolSize, enabled
		
		~Priority: Prioritize methods. 
		~InvocationCount: Invokes methods a number of times. (Performance testing)
		~ThreadPoolSize: Opens up new Threads/Window concurrently (Has to be used with invocationCount)
		~dependsOnMethods: Depends on specified method
		~groups: Grouping method. Ex: Smoke, Regression
		~enabled: True/ False to run or Skip a method.
		
		~We can Create a Test Suite using TestNG, Which means we can create a suit of test cases which holds multiple testcases and can be running at once.
		
		 */
		 
		
		//Looping understanding
			/*@Test
			public void dowhileloop() {
				int j=1;
						do{
					System.out.println("Automation_Class");
					j++;
						} while (j<=5);
			}*/
			
			
		/*
		 Assert: Hard Assert. If assertion fails in any method it'll halt the execution and will not proceed any further and log the issue.
		 Verify: Soft Assert. It'll run the execution until the last test is executed, even if the conditions are not met.
		  
	  
	  
	  
	*/
		
		
		
		/*What is 'Keys'?
		 ~In order to press enter, control, tab, arrow keys, Fn keys we use Keys 'Enum' which is provided by Selenium Webdriver.
		
		 What is 'Enum'?
		 ~Enum in Java is a data type which contains a fixed set of values. According to JAVA naming conventions we should have all the constants in uppercase letters.
		 Keys: BACK_SPACE, DOWN, ALT
		 Season: SUMMER, WINTER, SPRING
		 Fields: NORTH, SOUTH, EAST, EAST
		 Days: SATURDAY, THURSDAY
		 
		 
		 What is 'break'?
		 ~Break is a statement which terminates the loop immediately and the control moves to the next statement.
		
		 What is the fail() method?
		 ~fail() is a method to primarily call it to test a negative flow where the code being tested should raise an exception.
		
		*/
		
		//~~~~~~~
		/*What is Actions Class?
		 Actions class is an ability provided by selenium for handling Keyboard and Mouse events. Primarily mimicking Keyboard and Mouse actions.
		 
		 *What is an Action Class?
		 *Action is an interface which allows a single user interaction action to be executed.
		 
		 ~SeriesofActions: This is a set/container to hold all the actions to be performed together.
		 
		 **build(): is a method to create a chain of actions in the actions class.
		 **perform(): is a method to execute a chain of actions which are built using the actions build() method.
		 
		 
		 What is Keys.chrod()?
		 This is a method to press multiple keys simultaneously/at the same time.
		 
		 
		 
		 switchTo.frame(frameNo)- This method allows the user to switch to a frame using frame no.
		 */
		
		
		
		
		
		
		/*
		  
		  What is POM (Page Object Model)
		  A: POM is a design pattern to create an object repository for web pages. For each web page in the application requires its own corresponding class POM.
		  
		  Advantage of POM:
		  It allows us to keep all the webelements in one place.
		  ~Reusability. It saves either calling the object or maintaining it.
		  ~It makes it easier to understand the objects, WebElements are written in plain English.
		  
		  
		  **What is Constructor in JAVA?
		  A: Java constructors or constructors in java is a term used to construct something in our script. This is a special method that is to initialize objects.
		  THe constructor is called when an object of a class is created. Everytime an object is created using the new() keyword, at least one constructor is called.
		  
		  
		  **What is Instantiate?
		  A: Instantiate in Java means to call a constructor of a class which creates an instance or object of the type of that class.
		  Instantiation allocates initial memory for the object and also returns a reference.
		  
		  
		  Simple meaning of instantiate is creating an object from class.
		  Instantiate== create an instance== create an object of a class
		  ClassName obj = new Classname();
		  
		  
		  
		 ~What is 'this' Keyword?
		  A: This keyword can be used to invoke the current class constructor. It is used to reuse the constructor. In other words, it is used for constructor chaining.
		  Every object can access a reference to itself with the keyword this. (Sometimes called the 'this reference')
		  
		  
		  ~What is Object?
		  A: An instance of a class. In one class we can create many instances. 
		  
		  
		 ~What is Encapsulation?
		  
		  Encapsulation in Java is a JAVA mechanism of OOP concept (Object Oriented Programming) of wrapping the data (variables) and code acting on the data (methods) together as a single unit.
		  In Encapsulation the variables of a class will be hidden from other classes and can only be accessed through the methods of their current class. Therefore, it's also known as Data Hiding.
		  
		  ~What is Inheritance?
		 
		 Inheritance is a JAVA mechanism of OOP concept (Object Oriented Programming) which allows/helps us to
		 create a new class from an existing class. Inheriting the class acquires all the properties of the parent object.
		 
		 * */
			
			
			
		//What is By Method?
		//A: By is a method to locate elements using their locator.
	
	
	
	
		/*
		 Git and GitHub/Gitlab
		 
		 ~What is Git?
		 : Git is a version control system that tracks any source code history/change. Which is being installed in 
		 local machine. Later on to make for collaboration we use repositories like Github.
		 
		 ~What is GitHub?
		 :Git is a Platform for code hosting for version control and collaboration between communities.
		 It also works as a source code repository.
		 
		 ~What is Source Code?
		 : In simple words, Source code is any collection of codes.
		 
		 ~What is Version Control?
		 :It's a system which records all the changes/updates made to a file or a set of files.
		 
		 if there's 1 source code and it's pushed to GitHub, all the team members working on the same file but they 
		 have their own version control, so if anyone on the team makes any changes that'll be visible on his version
		 control. So, all the member will know the status also will be able to work on the latest version of the file
		 
	 
		 1. To install Git in local machine
		 
		 Link: https://git-scm.com/downloads
		 in to terminal/cmd run this command:  git --version
		 
		 2. Google github and open up an account
		 	Create a new repository
		 
		 3. How to install Git on Eclipse?
		 On Eclipse Help> Install New Software> Egit - https://download.eclipse.org/egit/github/updates> hit on
		 
		 4. Clone a project using eclipse
		 	Click on the search icon on the top right corner> Type Git Repositories> Clone a Git Repository
		 	Paste this Path: https://github.com/mkhanva01/Practice.git> Next> Finish
		 	
		 	Way1~File> Import> Git > Existing Git in Local> Select Project> Finish
		 	Way2~From Git Repositories tab> Right click on the Project> Hit import Projects> Finish
		 
		 
		 
		 ***Git commands***
		 	
		 	git clone: It creates a copy of an existing Git repository
		 	git add: It moves to unstaged file/files from working directory to the staging area
		 	git commit: It takes the staged files project history
		 	git commit --amend: it helps to amend the commit
		 	git push: it pushes the file to the remote repository
		 	
		 	git pull: It pulls the whole repository
		 	git fetch: It fetches the changes only
		 	git merge: merges the file from one directory to another
		 	git rebase: it rebases the repository if there's any merge conflict for any files.
		 	
		 
		 
		 Try and Catch in Java
		 
		 Try: Try statement helps to define a code block to be executed in order to throw an error while being executed.
		 Catch: Catch statement allows to define a code block to be executed, it'll catch the error.
		 **Try and Catch always comes in pairs**
		 */
		
		
		
		
		/*What is Page Factory?
		:Page Factory gives an optimized way to implement Page Object Model. Means the memory utilization is very good and also implementation is
		done in an object-oriented manner.
		
		
		Page Factory is used to implement the POM or Instantiate Page Objects itself. Instead of having to use "FindElements"
		we use "@FindBy" and recall the elements from the POM. It is a class that is provided by Selenium. 
		@FindBy can accept tagName, className, CSS, XPath, id, name, PartialLinkText
		
		@FindBy()	-- Locate Element
		@FindBys()	-- This works as AND operator, to meet multiple criteria 
		@FindAll()	-- This works as OR operator, If any of the criteria is met
		
		While using PageFactory we've to call 'PageFactory support class' and initialize Driver with this keyword using 'initElements'
		*/
		
		/*
		What is Maven?
		:Maven is a project management build tool which is used for Java project mostly.
		Some of the main feature of using Maven is it allows user to gather dependencies so they can be run remotely.
		~Dependencies are available in a separate class libraries doesn't need integrating.
		~Dependencies gets updated every time when Maven goal is selected as Install.
		~Maven create Test Suite of Test Suite.
		
		
		
		How to Install Maven?
		~Go to the Link and download the Binary zip file and unzip it.
		Link: https://maven.apache.org/download.cgi
		
		~Start>Type Environment> Open Edit Environment Variables> From System Variable Click 'New'
		Variable Name: M2_HOME
		Variable Value: Location of Maven
		
		From System Variable Double Click on 'Path' and Click 'New' and add this:
		%M2_Home%\bin
		
		
		~Open cmd and type:
		 mvn --version
		 
		~Now On Eclipse click on 'Help from top bar'>Install New Software> and paste the link: 
		https://download.eclipse.org/technology/m2e/releases/latest/
		>Next>Finish
		
		~How to Create Maven Project in Eclipse:
		
		File>New>Project>Maven>Maven Project> Create a simple project>GroupID and ArtifactID> Finish> Right click 
		Project> Properties> Workspace default JRE and hit OK.
		
		What is Maven Clean Install?
		: It adds all the artifacts (dependencies) specified in pom.xml to the local repository (from remote sources)
		
		What is Extend?
		: Extends is a keyword that bring another class into the current class.
		~Sign_Up is the sub class (child) of Super Class (Parent) which is Test_Base
		~What is the purpose of "extends" keyword? 
		:This is called the "Inheritance method" in JAVA OOP which allows users to create a new class from an existing
		class.
				**We can re use our code on different test models
				***We can re use method and attributes from one class to another.
		
		
		
		
		~Maven-surefire-plugin is used to configure and execute tests. Here we're configuring testng.xml file.
		~Maven-compiler-plugin is used to help compiling the code and using the particular JAVA verrsion for compilation.
		
		
		
		
		
		
		 */
		
		
		
		
		
		
			}
			
		
		}
