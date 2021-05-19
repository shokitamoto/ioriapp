package ioriapp.aaa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import androidx.databinding.DataBindingUtil
import ioriapp.aaa.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(
            this,
            R.layout.activity_main
        )

        var textAiueo = binding.moji
        var change = binding.btnChange

        change.setOnClickListener(
            textAiueo.text = "かきくけこ"
        )
    }


}
