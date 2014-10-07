package dam.org.graficos;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.


public class Graficos extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new ejemploView(this));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.graficos, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public class ejemploView extends View{

        public ejemploView(Context context){
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas){
            Path trazo = new Path();
            trazo.addCircle(150, 150, 100, Path.Direction.CCW);
            canvas.drawColor(Color.WHITE);
            Paint pincel = new Paint();
            pincel.setColor(Color.BLUE);
            pincel.setStrokeWidth(8);
            pincel.setStyle(Paint.Style.STROKE);
            canvas.drawPath(trazo, pincel);
            pincel.setStrokeWidth(1);
            pincel.setStyle(Paint.Style.FILL);
            pincel.setTextSize(20);
            pincel.setTypeface(Typeface.SANS_SERIF);
            canvas.drawTextOnPath("Desarrollo de aplicaciones para móviles con Android",
                    trazo, 10, 40, pincel);
        }
    }

}
