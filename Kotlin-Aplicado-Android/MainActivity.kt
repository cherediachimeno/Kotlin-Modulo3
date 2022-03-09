package es.ua.eps.primerproyectokotlin

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity(), View.OnClickListener  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton: Button = findViewById<View>(R.id.boton) as Button
        val botonToast: Button = findViewById<View>(R.id.toast) as Button
        val changeActivity: Button = findViewById<View>(R.id.buttonChange) as Button
        val llamar: Button = findViewById<View>(R.id.llamar) as Button
        val mensaje: Button = findViewById<View>(R.id.sms) as Button

        // It's mandatory to activate the buttons you need.
        boton.setOnClickListener(this)
        botonToast.setOnClickListener(this)
        changeActivity.setOnClickListener(this)
        llamar.setOnClickListener(this)
        mensaje.setOnClickListener(this)
    }

    override fun onClick(v: View) {

        when (v.id){
            R.id.boton -> {
                val texto: TextView = findViewById<View>(R.id.text) as TextView
                val textoEditar: EditText = findViewById<View>(R.id.editar) as EditText
                var textFromUser:String = textoEditar.text.toString()
               texto.setText(textFromUser)
            }
            R.id.toast -> {
                Toast.makeText(this, "I'm a Toast from Kotlin", Toast.LENGTH_LONG).show()
            }
            R.id.buttonChange -> {
                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
            }
            R.id.llamar -> {
                val dialIntent = Intent(Intent.ACTION_DIAL)
                dialIntent.data = Uri.parse("tel:" + "615916011")
                startActivity(dialIntent)
            }
            R.id.sms -> {
                val msg = Uri.parse("smsto:+34615916610")
                val firstSMS = Intent(Intent.ACTION_SEND, msg)
                firstSMS.putExtra("subject", "SOS")
                firstSMS.putExtra("sms_body", "Help please")
                startActivity(firstSMS)

            }
        }

        /*

        switch (v.getId()){
            case R.id.boton:
            //Actions to execute if the user clicks on the button called "boton".
            String textFromUser = textoEditar.getText().toString();
            texto.setText(textFromUser);
            break;
            case R.id.toast:
            //Actions to execute if the user clicks on my button called "toast
            Toast.makeText(MainActivity.this, "I'm a TOAST", Toast.LENGTH_LONG).show();
            break;
        }*/



    }
}