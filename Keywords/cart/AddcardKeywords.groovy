package cart
import static com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.*
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword
import internal.GlobalVariable


class AddcardKeywords{
	@Keyword
	def addCard() {
		waitForElementClickable(findTestObject('Page_Home/Card_Project'), 5)
		enhancedClick(findTestObject('Page_Home/Card_Project'))
	
		waitForElementClickable(findTestObject('Page_Project/Card_Product'), 5)
		enhancedClick(findTestObject('Page_Project/Card_Product'))
		
		waitForElementClickable(findTestObject('Page_Product/Btn_Add_Cart'), 5)
		enhancedClick(findTestObject('Page_Product/Btn_Add_Cart'))
		
		waitForElementClickable(findTestObject('Page_Product/Btn_View_Cart'), 5)
		enhancedClick(findTestObject('Page_Product/Btn_View_Cart'))
		println("333")
	}
}