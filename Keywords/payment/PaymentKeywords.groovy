package payment
import static com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.*
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword
import internal.GlobalVariable

class PaymentKeywords {
	@Keyword
	def payment() {

		waitForElementClickable(findTestObject('Page_Payment/Radio_Payment_Method_Card'), 5)
		enhancedClick(findTestObject('Page_Payment/Radio_Payment_Method_Card'))
		
		waitForElementClickable(findTestObject('Page_Payment/Radio_Select_Card'), 5)
		enhancedClick(findTestObject('Page_Payment/Radio_Select_Card'))
		
		waitForElementClickable(findTestObject('Page_Payment/Btn_Submit'), 5)
		enhancedClick(findTestObject('Page_Payment/Btn_Submit'))
		
		waitForElementClickable(findTestObject('Page_Payment/Btn_Confirm_Order'), 5)
		enhancedClick(findTestObject('Page_Payment/Btn_Confirm_Order'))
		
		waitForElementClickable(findTestObject('Page_Payment/Btn_Confirm3DS'), 5)
		enhancedClick(findTestObject('Page_Payment/Btn_Confirm3DS'))
		
	}
}