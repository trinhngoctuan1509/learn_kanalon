package auth

import static com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.*
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword

class LoginKeywords {

	@Keyword
	def login(String email, String password) {
		String loginUrl = 'https://limista.com/login'

		navigateToUrl(loginUrl)

		waitForElementVisible(findTestObject('Page_Login/Txt_Email'), 1)

		setText(findTestObject('Page_Login/Txt_Email'), email)
		setText(findTestObject('Page_Login/Txt_Password'), password)

		waitForElementClickable(findTestObject('Page_Login/Btn_Login'), 1)

		enhancedClick(findTestObject('Page_Login/Btn_Login'))

		waitForPageLoad(10)
	}
}