package com.example.samplecontour

import android.content.Context
import android.graphics.Color
import android.graphics.Color.RED
import android.graphics.Typeface
import android.util.AttributeSet
import android.widget.Button
import android.widget.EditText
import android.widget.Toolbar
import com.squareup.contour.ContourLayout

class MainView(context:Context,attrs: AttributeSet? = null):ContourLayout(context,attrs) {
    private val toolbar =Toolbar(context).apply{
        title = "Enter yor details"

    }
    private var name = EditText(context).apply{
        hint = "Name"
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

        textSize = 18f
        typeface = Typeface.create("sans-serif-medium", Typeface.NORMAL)
    }

    private var confirmPassword = EditText(context).apply{
        hint = "Confirm Password"

        textSize = 18f
        typeface = Typeface.create("sans-serif-medium", Typeface.NORMAL)
    }
    private val submitBtn = Button(context).apply {
        text = "Submit"
      setBackgroundColor(RED)

    }
    init{

        toolbar.layoutBy(
                x = leftTo { parent.left() }.rightTo{parent.right()},
                y = bottomTo{parent.top()+60.ydip }
        )
        name.layoutBy(
            x = leftTo { parent.left()+50.xdip }.rightTo { parent.right()-10.xdip },
            y = bottomTo { toolbar.top()+100.ydip }
        )

        email.layoutBy(
                x = leftTo { parent.left()+50.xdip }.rightTo { parent.right()-10.xdip },
                y = bottomTo{name.bottom()+60.ydip}
        )

        password.layoutBy(
                x = leftTo { parent.left()+50.xdip }.rightTo { parent.right()-10.xdip },
                y = bottomTo{email.bottom()+60.ydip}

        )
        confirmPassword.layoutBy(
                x = leftTo { parent.left()+50.xdip }.rightTo { parent.right()-10.xdip },
                y = bottomTo{password.bottom()+60.ydip}

        )
        submitBtn.layoutBy(
                x = leftTo { parent.left()+10.xdip }.rightTo { parent.right()-100.xdip },
                y = bottomTo{confirmPassword.bottom()+80.ydip}
        )
    }
}