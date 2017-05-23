package pl.edu.pwr.mateusznowak.englishpresentation.logic

/**
 * Created by Mateusz on 23.05.2017.
 */
interface Wallet {
    fun putMoney(moneyValue: Double)
    fun getMoney(moneyValue: Double):Double
    fun getMoneyAmount():Double
    fun insolvent():Boolean
}