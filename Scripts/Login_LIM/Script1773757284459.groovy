import static com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.*

String email = 'nhintt@runsystem.net'
String password = 'thaonhi678'

openBrowser('')

CustomKeywords.'auth.LoginKeywords.login'(email, password)

CustomKeywords.'cart.AddcardKeywords.addCard'()


//closeBrowser()