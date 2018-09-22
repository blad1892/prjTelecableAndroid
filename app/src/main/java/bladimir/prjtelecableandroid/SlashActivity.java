package bladimir.prjtelecableandroid;

import android.animation.ObjectAnimator;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.DecelerateInterpolator;
import android.widget.ProgressBar;

public class SlashActivity extends AppCompatActivity {
    private ProgressDialog progressDialog;
    private ProgressBar miprogress;
    private ObjectAnimator anim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slash);
//        progressDialog= new ProgressDialog(SlashActivity.this);
////        miprogress=(ProgressBar) findViewById(R.id.circularProgress);
//
////        progressDialog.setMessage("Cargando Datos");
////        progressDialog.show();
//        anim = ObjectAnimator.ofInt(miprogress, "progress", 0, 100);
//        mostrarProgress();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intento = new Intent(SlashActivity.this, MainActivity.class);
                startActivity(intento);
                finish();
            }
        }, 3000);


    }
//    private void mostrarProgress(){
//        //agregamos el tiempo de la animacion a mostrar
//        anim.setDuration(15000);
//        anim.setInterpolator(new DecelerateInterpolator());
//        //iniciamos el progressbar
//        anim.start();
//    }
}
