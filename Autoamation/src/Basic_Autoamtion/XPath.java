/*package Basic_Autoamtion;

public class XPath {

public void xPathUsage() {
		
		//button[@name='submit_search']  - xpath using one attribute
		//input[@id='search_query_top'][@name='search_query'] - using 2 attributes
		//button[contains(@class,'btn')] - using contains
		//button[starts-with(@class,'btn')] - using starts-with
		//button[@class='btn' and @name='submit_search'] - using and
		//button[starts-with(@class,'btn') or (@name='submit_search')] - using or
		//button[(starts-with(@class,'btn') or (@name='submit_search') ) and (@type='submit')] - using both and & or
		//a[text()='Contact us']  - using text()
		//a[contains(text(),'Sign in')] - using both contains() and text()
		//a[normalize-space(text())='Sign in'] - using normalize-space
		//String inputXpath = "//input[not(@type='hidden') and (@name='search_query')]"; // - using not & and
		//input[not(@type='hidden') and not(@name='email')] - using not, and, & not
		//a[.='Contact us'] - using .
		//div[contains(.,'Contact us')]/a - using .
		//form[@id='searchbox']/input/following::input[@name='search_query'] - using following
		//form[@id='searchbox']/input/following::input[3]- using following
		//form[@id='searchbox']/input/following-sibling::button - using following-sibling
		
		//form/button/preceding::input[@name='search_query'] - using preceding
		//form/button/preceding-sibling::input[1] - using preceding-sibling
		//label[.='Password']/following-sibling::span/input
		//input[@id='passwd']/parent::span/preceding-sibling::label[.='Password']
		
		//input[@name='search_query']/ancestor::div[1] - using ancestor
		//form[@id='searchbox']/descendant::button - using descedant
		
		//form/child::button - using child
		//form/button - using child
		
		//input[@name='search_query']/.. - using parent
		//input[@name='search_query']/parent::form - using parent
		//*[@type='text']/self::input[not(@type='hidden')] - using self
		
		//a[normalize-space(text())='replacestring']  - dynamic xpath
		
		}
*/