package cart
import static com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.*
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword
import internal.GlobalVariable


class AddCardKeywords{
	@Keyword
	def addCart(projectId) {
		def Card_Project = findTestObject('Page_Home/Card_Project', [
		    ('projectId') : projectId
		])
		waitForElementClickable(Card_Project, 5)
		enhancedClick(Card_Project)
	
		waitForElementClickable(findTestObject('Page_Project/Card_Product'), 5)
		enhancedClick(findTestObject('Page_Project/Card_Product'))
		
		waitForElementClickable(findTestObject('Page_Product/Btn_Add_Cart'), 5)
		enhancedClick(findTestObject('Page_Product/Btn_Add_Cart'))
		
		waitForElementClickable(findTestObject('Page_Product/Btn_View_Cart'), 5)
		enhancedClick(findTestObject('Page_Product/Btn_View_Cart'))
		println("333")
		
		}
	@Keyword
		def inputOrderInfo(String name, String nameFurigana, String message) {

		setText(findTestObject('Page_Cart/Input_Name'), name)
		setText(findTestObject('Page_Cart/Input_Name_Furigana'), nameFurigana)
		setText(findTestObject('Page_Cart/Input_Message'), message)
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