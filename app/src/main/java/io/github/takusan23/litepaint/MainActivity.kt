package io.github.takusan23.litepaint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //ハードウェアアクセラレーション？を無効にする
        //これしないと消しゴム機能が使えない
        view.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        getMenuInflater().inflate(R.menu.paint_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.delete_canvas -> {
                view.clear()
            }
            R.id.black_pen -> {
                view.setBlackPen()
            }
            R.id.eraser -> {
                view.setEraser()
            }
        }
        return super.onOptionsItemSelected(item);
    }

}
