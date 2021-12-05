package example.bill.homework3

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var listGuestActivityButton: Button
    lateinit var internetActivityButton: Button
    private lateinit var callActivityButton: Button
    lateinit var buttonToastActivity: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listGuestActivityButton = findViewById(R.id.list_guest_button)
        listGuestActivityButton.setOnClickListener {
            val listGuestActivityIntent = Intent(this, ListGuestActivity::class.java)
            startActivity(listGuestActivityIntent)
        }

        internetActivityButton = findViewById(R.id.order_button)
        internetActivityButton.setOnClickListener {
            val openBrowserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com"))
            startActivity(openBrowserIntent)
        }

        callActivityButton = findViewById(R.id.call_button)
        callActivityButton.setOnClickListener {
            val openCallIntent = Intent(Intent.ACTION_CALL, Uri.parse("tel:020"))
            startActivity(openCallIntent)
        }

        buttonToastActivity = findViewById(R.id.floating_action_button)
        buttonToastActivity.setOnClickListener {
            val text = getString(R.string.fish_textview)
            val duration = Toast.LENGTH_SHORT

            val toast = Toast.makeText(applicationContext, text, duration)
            toast.setGravity(Gravity.BOTTOM, 0, 50)
            toast.show()
        }


    }
}