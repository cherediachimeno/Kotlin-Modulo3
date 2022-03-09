package es.ua.eps.primerproyectokotlin;

import androidx.appcompat.app.AppCompatActivity;

// Here I have to import classes (button, edittext and textview).

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main {

    public class MainActivity extends AppCompatActivity implements View.OnClickListener {

        // Here I'm creating some objects from classes. I have a textview,
        // an edittext and a button. So it's necessary to create objects of
        // them.

        //CLASS --  OBJECT
        TextView texto;
        EditText textoEditar;
        Button boton;
        Button botonToast;
        Button changeActivity;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            // Ok, I have some objects, but it's necessary to link
            // them to my ID's, the elements I have on my layout
            //OBJECT =  (Typology) method to find and ID (R.id.ID).
            texto = (TextView) findViewById(R.id.text); // So, right now, texto is linked to my id entitled "text".
            textoEditar = (EditText) findViewById(R.id.editar);
            boton = (Button) findViewById(R.id.boton);
            botonToast = (Button) findViewById(R.id.toast);
            changeActivity = (Button) findViewById(R.id.buttonChange);

            // It's mandatory to activate the buttons you need.

            boton.setOnClickListener(this);
            botonToast.setOnClickListener(this);
            changeActivity.setOnClickListener(this);

            // Now, we're going to do something DIFFERENT.
            // We're not going to use onclicklistener method ON the object.
            // WHY? let's see...
        }

        @Override
        public void onClick(View v) {
            // Here I'm going to use a switch. If the user clicks on a button, then the actions do.

            //switch (view + method to find ID).
        /* EXAMPLE USING SWITCH
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

            //EXAMPLE USING IF ELSE IF CONDITIONAL...

            int id = v.getId();
            int idToast = R.id.toast;

            if(id == R.id.boton) {
                String textFromUser = textoEditar.getText().toString();
                texto.setText(textFromUser);
            } else if (id == idToast) {
                Toast.makeText(getApplicationContext(), "I'm a Toast", Toast.LENGTH_SHORT).show();
            } else if (id == R.id.buttonChange) {

                // Here we're going to use an Intent (an operation to do something)
                // Its syntaxis is as follows...

                // CLASS INTENT   OBJECT'S NAME = new Intent          (CONTEXT,                    DESTINATION)
                // Intent         example      = new Intent(MainActivity.this, MainActivity2.class);

             //  INTENT COMENTADO
                Intent intentToDoSomething = new Intent(getApplicationContext(), MainActivity2.class);
                //And now it's time to run this intent...
               startActivity(intentToDoSomething);
            }


        }
    }


}
