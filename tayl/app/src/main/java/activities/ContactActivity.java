package activities;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.chemistry.R;

import java.util.HashMap;
import java.util.Map;

public class ContactActivity extends AppCompatActivity {

    private Context context;
    private String subject;
    private String message;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        context = this;

        setContentView(R.layout.activity_contact);
    }

    public void sendMessage() {
        String url = "https://script.google.com/macros/s/AKfycbzr0kSFLxTdgKwvJw_yYkx7krZ9CicThuLOI1NXG7QyQH2gBJI/exec";

        subject = findViewById(R.id.contactsubject) != null ? ((EditText) findViewById(R.id.contactsubject)).getText().toString() : null;
        message = findViewById(R.id.contactmessage) != null ? ((EditText) findViewById(R.id.contactmessage)).getText().toString() : null;
        submit = ((Button) findViewById(R.id.contactsubmit));

        if (subject.isEmpty()) {
            Toast toast = Toast.makeText(context, "Please enter a subject", Toast.LENGTH_SHORT);
            toast.show();
            return;
        }

        if (message.isEmpty()) {
            Toast toast = Toast.makeText(context, "Please enter a message", Toast.LENGTH_SHORT);
            toast.show();
            return;
        }

        StringRequest stringRequest = new StringRequest(
                Request.Method.POST,
                url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Toast toast = Toast.makeText(context, response, Toast.LENGTH_SHORT);
                        toast.show();
                        System.out.println(response);
                        submit.setEnabled(true);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast toast = Toast.makeText(context, "Sending failed", Toast.LENGTH_SHORT);
                        toast.show();
                        error.printStackTrace();
                        submit.setEnabled(true);
                    }
                }
        ) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> params = new HashMap<>();

                System.out.println("Subject: " + subject);
                System.out.println("Message: " + message);

                params.put("subject", subject);
                params.put("message", message);

                return params;
            }

            @Override
            public Map<String, String> getHeaders() {
                Map<String, String> params = new HashMap<>();
                params.put("content-type", "application/x-www-form-urlencoded");
                return params;
            }
        };

        Volley.newRequestQueue(this).add(stringRequest);

        submit.setEnabled(false);

        finish();
    }
}
