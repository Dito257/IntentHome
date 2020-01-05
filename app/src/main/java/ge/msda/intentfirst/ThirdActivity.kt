package ge.msda.intentfirst

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val name = intent.extras?.getString("NAME", "")
        val email = intent.extras?.getString("EMAIL", "")
        val age = intent.extras?.getString("AGE", "")
        val gender = intent.extras?.getString("GENDER", "").toString()

        showName.text = name
        showEmail.text = email
        showAge.text = age
        showGender.text = gender

    }
}
