package ca.ualberta.cs.lonelytwitter;


// Removed unused import statements for better clarity
import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

public class EditTweetActivity extends Activity {

    // Changed access to private to prevent unauthorized activity
    private EditText message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);

        message = (EditText) findViewById(R.id.editTweet);
        message.setText(getIntent().getStringExtra("Message"));

    }
}
