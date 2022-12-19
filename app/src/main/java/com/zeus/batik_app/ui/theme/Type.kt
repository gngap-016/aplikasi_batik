package com.zeus.batik_app.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.sp
import com.zeus.batik_app.R
import java.sql.Ref

val Fonts = FontFamily(
    Font(R.font.poppins_regular, weight = FontWeight.Normal),
    Font(R.font.poppins_italic, weight = FontWeight.Normal, style = FontStyle.Italic),
    Font(R.font.poppins_extra_light, weight = FontWeight.Light),
    Font(R.font.poppins_extra_light_italic, weight = FontWeight.Light, style = FontStyle.Italic),
    Font(R.font.poppins_medium, weight = FontWeight.Medium),
    Font(R.font.poppins_medium_italic, weight = FontWeight.Medium, style = FontStyle.Italic),
    Font(R.font.poppins_semi_bold, weight = FontWeight.SemiBold),
    Font(R.font.poppins_semi_bold_italic, weight = FontWeight.SemiBold, style = FontStyle.Italic),
    Font(R.font.poppins_bold, weight = FontWeight.Bold),
    Font(R.font.poppins_bold_italic, weight = FontWeight.Bold, style = FontStyle.Italic)
)

// Set of Material typography styles to start with
val Typography = Typography(
    defaultFontFamily = Fonts,
    body1 = TextStyle(
        fontFamily = Fonts,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),
    button = TextStyle(
        fontFamily = Fonts,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp
    ),
    h1 = TextStyle(
        fontFamily = Fonts,
        fontWeight = FontWeight.Bold,
        fontSize = 28.sp
    ),
    h2 = TextStyle(
        fontFamily = Fonts,
        fontWeight = FontWeight.SemiBold,
        fontSize = 20.sp
    ),
    overline = TextStyle(
        fontFamily = Fonts,
        fontWeight = FontWeight.Bold,
        textDecoration = TextDecoration.Underline,
        fontSize = 14.sp
    )
    /* Other default text styles to override
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)