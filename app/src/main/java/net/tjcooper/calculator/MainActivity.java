package net.tjcooper.calculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private TextView helloMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
        swapButton = (Button)findViewById(R.id.BtnSwap);
        helloMsg = (TextView)findViewById(R.id.TextHello);

        View.OnClickListener myOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(helloMsg.getText() == "Hello World!")
                    helloMsg.setText("Goodbye World!");
                else
                    helloMsg.setText("Hello World!");
            }
        };

        swapButton.setOnClickListener(myOnClickListener);
*/
    }
/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
*/
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
