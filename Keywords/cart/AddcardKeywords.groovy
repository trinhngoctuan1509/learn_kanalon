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
	@Keyword
	    def inputCart(String txtName, String txtNameFurigana, String txtMessage) {

        setText(findTestObject('Page_Cart/Txt_Name'), txtName)
        setText(findTestObject('Page_Cart/Txt_Name_Furigana'), txtNameFurigana)
        setText(findTestObject('Page_Cart/Txt_Message'), txtMessage)
        click(findTestObject('Page_Cart/Btn_Save'))
		waitForElementClickable(findTestObject('Page_Cart/Btn_Address'), 5)
		enhancedClick(findTestObject('Page_Cart/Btn_Address'))
		
		waitForElementClickable(findTestObject('Page_Shipment/Radio_Shipping_Fee'), 5)
		enhancedClick(findTestObject('Page_Shipment/Radio_Shipping_Fee'))
		
		println("444")
		
		waitForElementClickable(findTestObject('Page_Shipment/Btn_DeliveryNext'), 5)
		enhancedClick(findTestObject('Page_Shipment/Btn_DeliveryNext'))
		
		}
}