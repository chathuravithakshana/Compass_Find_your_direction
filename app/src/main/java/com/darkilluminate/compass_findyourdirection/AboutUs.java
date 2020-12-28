package com.darkilluminate.compass_findyourdirection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

import static android.text.Layout.JUSTIFICATION_MODE_INTER_WORD;

public class AboutUs extends AppCompatActivity {

    //About textview
    private TextView txtAbout;

    //Whatsapp button
    private ImageButton whatsappButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        //scrollable textview
        txtAbout = (TextView) findViewById(R.id.txt_about);
        txtAbout.setMovementMethod(new ScrollingMovementMethod());

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            txtAbout.setJustificationMode(JUSTIFICATION_MODE_INTER_WORD);
        }

        //Whatsapp button
        whatsappButton = (ImageButton) findViewById(R.id.img_whatsapp);
        whatsappButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String whatsappContain = "Hi, I want to contact you.";
                    String trimToNumbner = "+94774842989"; //10 digit number
                    Intent intent = new Intent ( Intent.ACTION_VIEW );
                    intent.setData ( Uri.parse ( "https://wa.me/" + trimToNumbner + "/?text=" + "" ) );
                    intent.setPackage("com.whatsapp");
                    startActivity ( intent );
                } catch (Exception e) {
                    e.printStackTrace ();
                }
            }
        });
    }

}