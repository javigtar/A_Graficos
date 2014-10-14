package dam.org.graficos;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Main extends Activity {

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
            Paint cara = new Paint();
            cara.setColor(Color.YELLOW);
            canvas.drawColor(Color.WHITE);
            canvas.drawCircle(200, 200, 100, cara);

            Paint ojos = new Paint();
            ojos.setColor(Color.BLACK);
            canvas.drawOval(new RectF(140,200,180,140), ojos);
            canvas.drawOval(new RectF(220,200,260,140), ojos);

            Paint boca = new Paint();
            boca.setColor(Color.GRAY);
            canvas.drawArc(new RectF(140,180,260,290),-180,-180,true,boca);
            //canvas.drawOval(new RectF(140,270,260,220), boca);

            Paint gorra = new Paint();
            gorra.setColor(Color.MAGENTA);
            canvas.drawArc (new RectF(120, 60, 280, 200), 180, 180, true, gorra);
            Path visera = new Path();
            visera.moveTo(120,280);
            visera.cubicTo(120,300,120,290,120,280);


            Paint pincelNombre = new Paint();
            pincelNombre.setColor(Color.BLACK);
            canvas.drawText("JAVIER GARCIA TARIN",0,500,pincelNombre);
        }
    }

}
