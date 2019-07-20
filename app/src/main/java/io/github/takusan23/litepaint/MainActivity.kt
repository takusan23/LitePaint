package io.github.takusan23.litepaint

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import com.google.android.material.bottomsheet.BottomSheetBehavior
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //色
    var colorInt = Color.BLACK
    //おおきさ
    var sizeInt = 10f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //ハードウェアアクセラレーション？を無効にする
        //これしないと消しゴム機能が使えない
        view.setLayerType(View.LAYER_TYPE_SOFTWARE, null);

        fab.setOnClickListener {
            val paint = PaintBottomSheetFragment()
            paint.show(supportFragmentManager, "paint")
        }

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
            R.id.pen -> {
                view.setPan(colorInt)
            }
            R.id.eraser -> {
                view.setEraser()
            }
            R.id.undo -> {
                view.undoPaint()
            }
        }
        return super.onOptionsItemSelected(item);
    }

}
