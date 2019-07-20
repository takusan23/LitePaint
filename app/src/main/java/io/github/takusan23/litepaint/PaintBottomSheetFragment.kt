package io.github.takusan23.litepaint

import android.graphics.Color
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.bottom_fragment_paint_layout.*


class PaintBottomSheetFragment : BottomSheetDialogFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return View.inflate(context, R.layout.bottom_fragment_paint_layout, null)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val mainActivity = activity as MainActivity
        //色
        paint_bottom_sheet_button_color_blue.setOnClickListener {
            mainActivity.colorInt = Color.BLUE
            dismiss()
        }
        paint_bottom_sheet_button_color_red.setOnClickListener {
            mainActivity.colorInt = Color.RED
            dismiss()
        }
        paint_bottom_sheet_button_color_black.setOnClickListener {
            mainActivity.colorInt = Color.BLACK
            dismiss()
        }
        //太さ
        paint_bottom_sheet_button_size_small.setOnClickListener {
            mainActivity.sizeInt = 10f
            dismiss()
        }
        paint_bottom_sheet_button_size_normal.setOnClickListener {
            mainActivity.sizeInt = 25f
            dismiss()
        }
        paint_bottom_sheet_button_size_big.setOnClickListener {
            mainActivity.sizeInt = 50f
            dismiss()
        }
    }

}