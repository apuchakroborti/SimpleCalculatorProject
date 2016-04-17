package apu.newsimplecalculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.InputType;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {
    private EditText value1,value2,result;
    private TextView resultText;
    private double number1,number2;
    private String str1,str2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        value1=(EditText)findViewById(R.id.editTextFirstNumber);
        value2=(EditText)findViewById(R.id.editTextSecondNumber);
        value1.setInputType(InputType.TYPE_CLASS_NUMBER|InputType.TYPE_NUMBER_FLAG_DECIMAL|InputType.TYPE_NUMBER_FLAG_SIGNED);
        value2.setInputType(InputType.TYPE_CLASS_NUMBER|InputType.TYPE_NUMBER_FLAG_DECIMAL| InputType.TYPE_NUMBER_FLAG_SIGNED);

        result=(EditText)findViewById(R.id.editTextResult);





        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_calculator, menu);
        return true;
    }

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

    public void performAdd(View v)
    {
        str1=value1.getText().toString();
        str2=value2.getText().toString();

        if(!str1.equals("") && !str2.equals(""))
{
   // number1=Integer.parseInt(value1.getText().toString());
    //number2=Integer.parseInt(value2.getText().toString());
    number1=Double.valueOf(value1.getText().toString()).doubleValue();

    number2=Double.valueOf(value2.getText().toString()).doubleValue();
    double add=number1+number2;
    str1="";
    str2="";
    String res=""+add;
    result.setText(res, TextView.BufferType.EDITABLE);

}
        else
{
    result.setText("Enter Both input", TextView.BufferType.EDITABLE);

}


    }
    public void performSubtract(View v)
    {
        str1=value1.getText().toString();
        str2=value2.getText().toString();

        if(!str1.equals("") && !str2.equals("")) {
 //           number1 = Integer.parseInt(value1.getText().toString());
   //         number2 = Integer.parseInt(value2.getText().toString());
            number1=Double.valueOf(value1.getText().toString()).doubleValue();

            number2=Double.valueOf(value2.getText().toString()).doubleValue();

            double subtract = number1 - number2;
            str1 = "";
            str2 = "";
            String res = "" + subtract;
            result.setText(res, TextView.BufferType.EDITABLE);
        }
        else
        {
            result.setText("Enter Both input", TextView.BufferType.EDITABLE);

        }

    }
}
