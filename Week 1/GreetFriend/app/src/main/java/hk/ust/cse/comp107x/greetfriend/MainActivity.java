package hk.ust.cse.comp107x.greetfriend;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button greetButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        greetButton = (Button) findViewById(R.id.greetButton);
        greetButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        TextView textMessage = (TextView) findViewById(R.id.textMessage);
        EditText editFriendName = (EditText) findViewById(R.id.editFriendName);
        String friendName = editFriendName.getText().toString();

        switch (view.getId()) {
            case R.id.greetButton:
                textMessage.setText("Good Day " + friendName + "!");
                break;
            default:
                break;
        }
    }
}
