package xpath;

public class Home_work_Xpath {
	/*
	 * 1.tag with a single attribute. source: https://www.bestbuy.com/
	 * //input[@id='site-control-content'] 
	 * //span[@class='v-p-right-xxs line-clamp']
	 * //a[@class='bottom-left-links '] 
	 * //input[@id='gh-search-input']
	 * //input[@id='search_box_gnav_input'] 
	 * //input[@class='font_24 bold contrastTextInput__GHPInput-duZPh dMfFGO TextInput__BaseInput-eWTGnq cPdvto']
	 * //span[@class='v-text-tech-yellow']
	 * 
	 * 
	 * 2. Tag with multiple attribute with 'or' logic (not used much, used when any
	 * of the attribute can be find the locator faster) 
	 * 
	 * //input[@id='search_box_gnav_input' or class='font_24 bold contrast TextInput__GHPInput-duZPh dMfFGO TextInput__BaseInput-eWTGnq cPdvto']
	 * //input[@class='search-input' or @id='gh-search-input']
	 * //input[@id='fld-e' or @class='tb-input']
	 * //input[@id='user_id_2' or @name='userId']
	 * //input[@name='cvv' or @id='cvv-1']
	 * 
	 * 3) Tag with multiple attribute with 'and' logic ****
	 * source:https://secure.verizon.com/vzauth/UI/Login 
	 * //input[@id='IDToken1'and @class= 'C']
	 * //a[@id='nav-logo-sprites' and @class='nav-logo-linknav-progressive-attribute']
	 *  //input[@class='search-input' and @id='gh-search-input']
	 * //input[@id='fld-e' and @class='tb-input']
	 * //input[@id='card_name_0' and @ name='cardName']
	 * 
	 * 4) Tag with inner text [means complete text] 
	 * //button[text()='Support']
	 * //a[text()='Devices'] 
	 * //a[text()='Samsung'] 
	 * //a[text()='Careers']
	 * //a[text()='Return policy']
	 * 
	 * 
	 * 5) Tag with inner text [not complete inner text rather partial text as well
	 * as actual text] (most commonly used) 
	 * 
	 * //a[contains(text(),'Best Buy Outlet')]
	 * //span[contains(text(),'Order Status')]
	 * //span[contains(text(),'Saved Items')]
	 * //button[contains(text(),'Support & Services')]
	 * //button[contains(text(),'Cell Phones')]
	 * 
	 * 
	 * 
	 * 6) Tag with attributes and use of contains (not commonly used)
	 * 
	 * //a[contains(@class,'hidden-xs dropdown')]
	 * //img[contains(@class,'visible-lg')] 
	 * //a[contains(@class,'C-24-Call-To-Action-pink-cta-bg cta-right')] 
	 * //a[contains(@class,'C-24-Call-To-Actionmshs-sidebar blue-cta-bg')] 
	 * //body[contains(@id,'ysch')]
	 * 
	 * 7) Normalize space -- eliminates leading and trailing spaces. (high level) –
	 * learn slowly
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 8) Starts with text
	 * 
	 * //a[starts-with(text(),'Best Buy Outlet')] //span[starts-with(text(),'Order
	 * Status')] //a[starts-with(text(),'Health & Wellness')]
	 * //a[starts-with(text(),'Credit Cards')] //a[starts-with(text(),'Gift Ideas')]
	 * 9) Starts with attribute (not commonly used, no need to practice it)
	 * 
	 * //a[starts-with(@class,'hidden-xs dropdown')] //div[starts-with(@class,'title
	 * blue-rail-bg')] //a[starts-with(@class,'C-24-Call-To-Action mshs-sidebar
	 * blue-cta-bg')] //a[starts-with(@class,'button ng-scope')]
	 * //button[starts-with(@class,'button')]
	 * 
	 */

}
