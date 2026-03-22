import static com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.*
String txtName = 'Nhi'
String txtNameFurigana = 'ニックネームフリガナ'
String txtMessage = 'hello'



openBrowser('')
CustomKeywords.'auth.LoginKeywords.login'()
CustomKeywords.'cart.AddcardKeywords.addCard'()
CustomKeywords.'cart.AddcardKeywords.inputCart'(
	txtName,
	txtNameFurigana,
	txtMessage
)
CustomKeywords.'payment.PaymentKeywords.payment'()