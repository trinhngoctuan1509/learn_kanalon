package payment
import static com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.*
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword
import internal.GlobalVariable

class PaymentKeywords {
	@Keyword
	def paymentBySavedCreditCard() {
		waitForElementClickable(findTestObject('Page_Payment/Radio_Select_Payment_Method_By_Credit_Card'), 5)
		enhancedClick(findTestObject('Page_Payment/Radio_Select_Payment_Method_By_Credit_Card'))
		
		waitForElementClickable(findTestObject('Page_Payment/Radio_Select_Payment_Method_By_Saved_Credit_Card'), 5)
		enhancedClick(findTestObject('Page_Payment/Radio_Select_Payment_Method_By_Saved_Credit_Card'))
		
		waitForElementClickable(findTestObject('Page_Payment/Radio_Select_Saved_Credit_Card'), 5)
		enhancedClick(findTestObject('Page_Payment/Radio_Select_Saved_Credit_Card'))
		
		waitForElementClickable(findTestObject('Page_Payment/Btn_Submit'), 5)
		enhancedClick(findTestObject('Page_Payment/Btn_Submit'))
		
		waitForElementClickable(findTestObject('Page_Confirm_Order/Btn_Confirm_Order'), 5)
		enhancedClick(findTestObject('Page_Confirm_Order/Btn_Confirm_Order'))
		
		waitForElementClickable(findTestObject('Page_Payment_Third_Party/Btn_Confirm_3DS'), 5)
		enhancedClick(findTestObject('Page_Payment_Third_Party/Btn_Confirm_3DS'))
	}
	
	
	@Keyword
	def paymentByNewCreditCard() {
		waitForElementClickable(findTestObject('Page_Payment/Radio_Select_Payment_Method_By_Credit_Card'), 5)
		enhancedClick(findTestObject('Page_Payment/Radio_Select_Payment_Method_By_Credit_Card'))
		
		waitForElementClickable(findTestObject('Page_Payment/Radio_Select_Payment_Method_By_New_Credit_Card'), 5)
		enhancedClick(findTestObject('Page_Payment/Radio_Select_Payment_Method_By_New_Credit_Card'))
		
		setText(findTestObject('Page_Payment/Input_New_Card_Number'), '4100000000005000')
		sendKeys(findTestObject('Page_Payment/Input_New_Card_Expiry'), '1')
		sendKeys(findTestObject('Page_Payment/Input_New_Card_Expiry'), '2')
		sendKeys(findTestObject('Page_Payment/Input_New_Card_Expiry'), '3')
		sendKeys(findTestObject('Page_Payment/Input_New_Card_Expiry'), '0')
		setText(findTestObject('Page_Payment/Input_New_Card_Name'), 'Test')
		setText(findTestObject('Page_Payment/Input_New_Card_Code'), '8888')
		
		waitForElementClickable(findTestObject('Page_Payment/Btn_Submit'), 5)
		enhancedClick(findTestObject('Page_Payment/Btn_Submit'))
		
		waitForElementClickable(findTestObject('Page_Confirm_Order/Btn_Confirm_Order'), 5)
		enhancedClick(findTestObject('Page_Confirm_Order/Btn_Confirm_Order'))
		
		waitForElementClickable(findTestObject('Page_Payment_Third_Party/Btn_Confirm_3DS'), 5)
		enhancedClick(findTestObject('Page_Payment_Third_Party/Btn_Confirm_3DS'))
	}
	
	
	@Keyword
	def paymentByVitualBank() {
		waitForElementClickable(findTestObject('Page_Payment/Radio_Select_Payment_Method_By_Vitual_Bank'), 5)
		enhancedClick(findTestObject('Page_Payment/Radio_Select_Payment_Method_By_Vitual_Bank'))
		
		waitForElementClickable(findTestObject('Page_Payment/Btn_Submit'), 5)
		enhancedClick(findTestObject('Page_Payment/Btn_Submit'))
		
		waitForElementClickable(findTestObject('Page_Confirm_Order/Btn_Confirm_Order'), 5)
		enhancedClick(findTestObject('Page_Confirm_Order/Btn_Confirm_Order'))	
	}
	
	
	@Keyword
	def paymentByAu() {
		waitForElementClickable(findTestObject('Page_Payment/Radio_Select_Payment_Method_By_Au'), 5)
		enhancedClick(findTestObject('Page_Payment/Radio_Select_Payment_Method_By_Au'))
		
		waitForElementClickable(findTestObject('Page_Payment/Btn_Submit'), 5)
		enhancedClick(findTestObject('Page_Payment/Btn_Submit'))
			
		waitForElementClickable(findTestObject('Page_Confirm_Order/Btn_Confirm_Order'), 5)
		enhancedClick(findTestObject('Page_Confirm_Order/Btn_Confirm_Order'))
		
		waitForPageLoad(5)
		
		waitForElementClickable(findTestObject('Page_Payment_Third_Party/Btn_Confirm_Au'), 5)
		enhancedClick(findTestObject('Page_Payment_Third_Party/Btn_Confirm_Au'))
	}
	
	
	@Keyword
	def paymentBySoftBank() {
		waitForElementClickable(findTestObject('Page_Payment/Radio_Select_Payment_Method_By_SoftBank'), 5)
		enhancedClick(findTestObject('Page_Payment/Radio_Select_Payment_Method_By_SoftBank'))
		
		waitForElementClickable(findTestObject('Page_Payment/Btn_Submit'), 5)
		enhancedClick(findTestObject('Page_Payment/Btn_Submit'))
			
		waitForElementClickable(findTestObject('Page_Confirm_Order/Btn_Confirm_Order'), 5)
		enhancedClick(findTestObject('Page_Confirm_Order/Btn_Confirm_Order'))
		
		waitForPageLoad(5)
		
		waitForElementClickable(findTestObject('Page_Payment_Third_Party/Btn_Confirm_SoftBank'), 5)
		enhancedClick(findTestObject('Page_Payment_Third_Party/Btn_Confirm_SoftBank'))
	}
	
	
	@Keyword
	def paymentByDocomo() {
		waitForElementClickable(findTestObject('Page_Payment/Radio_Select_Payment_Method_By_Docomo'), 5)
		enhancedClick(findTestObject('Page_Payment/Radio_Select_Payment_Method_By_Docomo'))
		
		waitForElementClickable(findTestObject('Page_Payment/Btn_Submit'), 5)
		enhancedClick(findTestObject('Page_Payment/Btn_Submit'))
			
		waitForElementClickable(findTestObject('Page_Confirm_Order/Btn_Confirm_Order'), 5)
		enhancedClick(findTestObject('Page_Confirm_Order/Btn_Confirm_Order'))
		
		waitForPageLoad(5)
		
		waitForElementClickable(findTestObject('Page_Payment_Third_Party/Btn_Confirm_Docomo'), 5)
		enhancedClick(findTestObject('Page_Payment_Third_Party/Btn_Confirm_Docomo'))
	}
	
	
	@Keyword
	def paymentByBankTranfer() {
		waitForElementClickable(findTestObject('Page_Payment/Radio_Select_Payment_Method_By_Bank_Tranfer'), 5)
		enhancedClick(findTestObject('Page_Payment/Radio_Select_Payment_Method_By_Bank_Tranfer'))
		
		waitForElementClickable(findTestObject('Page_Payment/Btn_Submit'), 5)
		enhancedClick(findTestObject('Page_Payment/Btn_Submit'))
		
		waitForElementClickable(findTestObject('Page_Confirm_Order/Btn_Confirm_Order'), 5)
		enhancedClick(findTestObject('Page_Confirm_Order/Btn_Confirm_Order'))
	}
	
	
	@Keyword
	def paymentByRakuten () {
		waitForElementClickable(findTestObject('Page_Payment/Radio_Select_Payment_Method_By_Rakuten'), 5)
		enhancedClick(findTestObject('Page_Payment/Radio_Select_Payment_Method_By_Rakuten'))
		
		waitForElementClickable(findTestObject('Page_Payment/Btn_Submit'), 5)
		enhancedClick(findTestObject('Page_Payment/Btn_Submit'))
			
		waitForElementClickable(findTestObject('Page_Confirm_Order/Btn_Confirm_Order'), 5)
		enhancedClick(findTestObject('Page_Confirm_Order/Btn_Confirm_Order'))
		
		waitForPageLoad(5)
		
		waitForElementClickable(findTestObject('Page_Payment_Third_Party/Btn_Confirm_Rakuten'), 5)
		enhancedClick(findTestObject('Page_Payment_Third_Party/Btn_Confirm_Rakuten'))
	}
	
	@Keyword
	def paymentByCombini () {
		waitForElementClickable(findTestObject('Page_Payment/Radio_Select_Payment_Method_By_Combini'), 5)
		enhancedClick(findTestObject('Page_Payment/Radio_Select_Payment_Method_By_Combini'))
		
		waitForElementClickable(findTestObject('Page_Payment/Radio_Select_Payment_Method_By_Combini_Lawson'), 5)
		enhancedClick(findTestObject('Page_Payment/Radio_Select_Payment_Method_By_Combini_Lawson'))
		
		waitForElementClickable(findTestObject('Page_Payment/Btn_Submit'), 5)
		enhancedClick(findTestObject('Page_Payment/Btn_Submit'))
			
		waitForElementClickable(findTestObject('Page_Confirm_Order/Btn_Confirm_Order'), 5)
		enhancedClick(findTestObject('Page_Confirm_Order/Btn_Confirm_Order'))
		
	}
	
}