package Basic_Autoamtion;

public class CSS {

	public void CSS_Rules() {
		String searchCss = "input#search_query_top"; // using id
		String searchCss2 = "input.search_query"; // using class
		String searchCss3 = "input[name='search_query']"; //Using attribute
		String searchCss4 = "input[placeholder='Search'][name='search_query']"; // using multiple attibutes
		
		String submitCss = "button.btn[name='submit_search']"; // using class and attribute
		String contLinkCss = "a[title='Contact Us']";
		
		String srchInputCss = "input[name^=search]"; // using prefix or starts with
		String srchInputCss2 = "input[name$=uery]"; // using suffix or ends with
		String srchInputCss3 = "input[name*=_que]"; // using substring
		
		String btnCss1 = "div > form > button"; // using parent and child
		String btnCss2 = "form button[name='submit_search']"; // using ancestor 
		String srchInputCss4 =  "form > input+input+input+input"; //using sibling traversing
		String srchInputCss5 = "form > input:nth-child(4)"; // using nth-element 
		}	
	}