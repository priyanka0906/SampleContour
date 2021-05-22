package com.example.samplecontour

import android.content.Context
import android.graphics.Color.RED
import android.graphics.Typeface
import android.util.AttributeSet
import android.widget.EditText
import com.squareup.contour.ContourLayout

class MainView(context:Context,attrs: AttributeSet? = null):ContourLayout(context,attrs) {

    private var name = EditText(context).apply{
        hint = "Name"
        setTextColor(RED)
        textSize = 18f
       typeface = Typeface.create("sans-serif-medium", Typeface.NORMAL)
    }
    private var email = EditText(context).apply{
        hint = "Email"

        textSize = 18f
        typeface = Typeface.create("sans-serif-medium", Typeface.NORMAL)
    }
    private var password = EditText(context).apply{
        hint = "Password"
        setTextColor(RED)
        textSize = 18f
        typeface = Typeface.create("sans-serif-medium", Typeface.NORMAL)
    }

    init{
        name.layoutBy(
            x = leftTo { parent.left()+50.xdip }.rightTo { parent.right()-10.xdip },
            y = bottomTo { parent.top()+100.ydip }
        )

        email.layoutBy(
                x = leftTo { parent.left()+50.xdip }.rightTo { parent.right()-10.xdip },
                y = bottomTo{name.bottom()+40.ydip}
        )

        password.layoutBy(
                x = leftTo { parent.left()+50.xdip }.rightTo { parent.right()-10.xdip },
                y = bottomTo{email.bottom()+40.ydip}

        )
    }
}