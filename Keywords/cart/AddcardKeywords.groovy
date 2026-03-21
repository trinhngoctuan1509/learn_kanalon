package cart
import java.util.Arrays
import static com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.*
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


class AddcardKeywords{

	@Keyword
	def addCard() {
		println("111")
		waitForElementClickable(findTestObject('Page_Home/Card_Project'), 5)
		enhancedClick(findTestObject('Page_Home/Card_Project'))
		
		println("222")
		
		delay(10)
		WebUI.scrollToElement(findTestObject('Page_Project/Card_Product'), 5)
	
		WebUI.waitForElementClickable(findTestObject('Page_Project/Card_Product'), 10)
		WebUI.enhancedClick(findTestObject('Page_Project/Card_Product'))
		
		
		
		waitForElementClickable(findTestObject('Page_Product/Btn_Add_Cart'), 5)
		enhancedClick(findTestObject('Page_Product/Btn_Add_Cart'))
		
		waitForElementClickable(findTestObject('Page_Product/Btn_View_Cart'), 1)
		enhancedClick(findTestObject('Page_Product/Btn_View_Cart'))
		println("333")
	}
}


//
//if (waitForElementClickable(findTestObject('Page_Product/Btn_Add_Cart'), 10)) {
//	click(findTestObject('Page_Product/Btn_Add_Cart'))
//} else {
//	KeywordUtil.markFailed("Btn_Add_Cart không clickable")
//}