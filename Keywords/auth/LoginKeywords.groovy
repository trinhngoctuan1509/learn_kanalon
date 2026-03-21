package auth
import static com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.*
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword
import internal.GlobalVariable

class LoginKeywords {
	@Keyword
	def login() {
		String username = GlobalVariable.LOGIN_USERNAME
		String password = GlobalVariable.LOGIN_PASSWORD
		String loginUrl = GlobalVariable.LOGIN_URL

		navigateToUrl(loginUrl)

		waitForElementVisible(findTestObject('Page_Login/Txt_Email'), 5)
		setText(findTestObject('Page_Login/Txt_Email'), username)
		setText(findTestObject('Page_Login/Txt_Password'), password)

		waitForElementClickable(findTestObject('Page_Login/Btn_Login'), 5)
		enhancedClick(findTestObject('Page_Login/Btn_Login'))
	}
}