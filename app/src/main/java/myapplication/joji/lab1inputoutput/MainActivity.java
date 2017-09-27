package myapplication.joji.lab1inputoutput;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button displayButton;
    private TextView tvMessage;
    private EditText etName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayButton = (Button) findViewById(R.id.button);
        displayButton = (Button) findViewById(R.id.button2);
        tvMessage = (TextView) findViewById(R.id.textView);
        etName = (EditText) findViewById(R.id.editText);
    }

    public void displayText (View view){
        String text = etName.getText().toString();

        tvMessage.setText("Welcome "+ text);
        Toast toast = Toast.makeText(this, "Welcome " +text+ "!", Toast.LENGTH_SHORT);
        toast.show();

    }

    public void resetText (View view){
        String text = etName.getText().toString();

        etName.getText().clear();
        Toast toast = Toast.makeText(this, "Name have been reset", Toast.LENGTH_SHORT);
        toast.show();

    }

}
