import static com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.*
import internal.GlobalVariable


String txtName = 'Nhi'
String txtNameFurigana = 'ニックネームフリガナ'
String txtMessage = 'hello'
String homeUrl = GlobalVariable.HOME_URL



openBrowser('')
CustomKeywords.'auth.LoginKeywords.login'()

String projectId1 = '2366'
CustomKeywords.'cart.AddCardKeywords.addCart'(projectId1)
CustomKeywords.'cart.AddCardKeywords.inputOrderInfo'(
	txtName,
	txtNameFurigana,
	txtMessage
)
CustomKeywords.'payment.PaymentKeywords.paymentByRakuten'()
waitForPageLoad(5)
navigateToUrl(homeUrl)

String projectId2 = '2366'
CustomKeywords.'cart.AddCardKeywords.addCart'(projectId2)
CustomKeywords.'cart.AddCardKeywords.inputOrderInfo'(
	txtName,
	txtNameFurigana,
	txtMessage
)
CustomKeywords.'payment.PaymentKeywords.paymentByBankTranfer'()
navigateToUrl(homeUrl)

String projectId3 = '2366'
CustomKeywords.'cart.AddCardKeywords.addCart'(projectId3)
CustomKeywords.'cart.AddCardKeywords.inputOrderInfo'(
	txtName,
	txtNameFurigana,
	txtMessage
)
CustomKeywords.'payment.PaymentKeywords.paymentByDocomo'()

