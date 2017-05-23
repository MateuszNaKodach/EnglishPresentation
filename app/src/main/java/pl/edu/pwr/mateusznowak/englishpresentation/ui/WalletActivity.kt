package pl.edu.pwr.mateusznowak.englishpresentation.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_wallet.*

import pl.edu.pwr.mateusznowak.englishpresentation.R
import pl.edu.pwr.mateusznowak.englishpresentation.logic.SimpleWallet
import pl.edu.pwr.mateusznowak.englishpresentation.logic.Wallet

class WalletActivity : AppCompatActivity() {

    private val wallet: Wallet = SimpleWallet()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wallet)

        bt_putMoney.setOnClickListener { wallet.putMoney(getInputMoneyValue()); updateMoneyAmountView() }
        bt_takeMoney.setOnClickListener {
            if(!wallet.insolvent()){
                wallet.takeMoney(getInputMoneyValue())
            }else{
                Toast.makeText(this,"You are a bankrupt! ", Toast.LENGTH_SHORT).show()
            }

            updateMoneyAmountView()
        }

    }


    fun getInputMoneyValue():Double = et_amount.text!!.toString().toDouble()

    fun updateMoneyAmountView(){tv_moneyAmount.text = wallet.getMoneyAmount().toString()}
}
