package pl.edu.pwr.mateusznowak.englishpresentation.logic

/**
 * Created by Mateusz on 23.05.2017.
 */
class SimpleWallet : Wallet {

    var moneyBalance:Double = 0.0

    override fun putMoney(moneyValue: Double) {
       moneyBalance = moneyBalance + moneyValue
    }

    override fun takeMoney(moneyValue: Double): Double {
        if(moneyValue<=moneyBalance){
            moneyBalance = moneyBalance - moneyValue
            return moneyValue
        }

        return 0.0
    }

    override fun getMoneyAmount(): Double {
        return moneyBalance
    }

    override fun insolvent(): Boolean {
        return moneyBalance==0.0
    }
}