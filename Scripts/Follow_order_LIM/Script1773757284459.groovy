import static com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.*
import internal.GlobalVariable


String txtName = 'Nhi'
String txtNameFurigana = 'ニックネームフリガナ'
String txtMessage = 'hello'
String homeUrl = GlobalVariable.HOME_URL
def paymentMethods = [
	1: { CustomKeywords.'payment.PaymentKeywords.paymentByRakuten'() },
	2: { CustomKeywords.'payment.PaymentKeywords.paymentByBankTranfer'() },
	3: { CustomKeywords.'payment.PaymentKeywords.paymentByDocomo'() }
]

def processPayments(String projectId, List<Integer> methods, Map<Integer, Closure> paymentMethods) {
	methods.each { method ->

		if (!paymentMethods.containsKey(method)) {
			throw new Exception("Invalid payment method: ${method}")
		}

		CustomKeywords.'cart.AddCardKeywords.addCart'(projectId)

		CustomKeywords.'cart.AddCardKeywords.inputOrderInfo'(
			txtName,
			txtNameFurigana,
			txtMessage
		)

		paymentMethods[method].call()

		waitForPageLoad(5)
		navigateToUrl(homeUrl)
	}
}



openBrowser('')
CustomKeywords.'auth.LoginKeywords.login'()
processPayments('2366', [1, 2, 3], paymentMethods)


