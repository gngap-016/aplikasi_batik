package com.zeus.batik_app.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement.End
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.FabPosition.Companion.End
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.BottomEnd
import androidx.compose.ui.Alignment.Companion.End
import androidx.compose.ui.Alignment.Companion.Start
import androidx.compose.ui.Alignment.Companion.TopStart
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.KeyboardType.Companion.Text
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextAlign.Companion.End
import androidx.compose.ui.text.style.TextAlign.Companion.Left
import androidx.compose.ui.text.style.TextAlign.Companion.Start
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.zeus.batik_app.R
import com.zeus.batik_app.ui.theme.Primary
import com.zeus.batik_app.ui.theme.Purple700
import com.zeus.batik_app.ui.theme.White
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun LoginPage(navController: NavHostController) {
    Image(
        modifier = Modifier.fillMaxWidth(),
        painter = painterResource(id = R.drawable.background_),
        contentDescription = "",
        contentScale = ContentScale.FillWidth
    )
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp, 80.dp, 20.dp, 0.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        val username = remember { mutableStateOf(TextFieldValue()) }
        val password = remember { mutableStateOf(TextFieldValue()) }

        Text(text = "Login",
            style = MaterialTheme.typography.h1
        )

        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(
            label = {
                Text(
                    text = "Email",
                    style = MaterialTheme.typography.body1
                ) },
            placeholder = {
                Text(
                    text = "email@email.com",
                    style = MaterialTheme.typography.body1
                )
            },
            value = username.value,
            onValueChange = { username.value = it },
            shape = RoundedCornerShape(20.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Primary,
                focusedLabelColor = Primary,
                cursorColor = Primary,

            )
        )

        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(
            label = {
                Text(
                    text = "Password",
                    style = MaterialTheme.typography.body1
                ) },
            placeholder = {
                Text(
                    text = "********",
                    style = MaterialTheme.typography.body1
                )
            },
            value = password.value,
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            onValueChange = { password.value = it },
            shape = RoundedCornerShape(20.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Primary,
                focusedLabelColor = Primary,
                cursorColor = Primary
            )
        )

        Spacer(modifier = Modifier.height(20.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp, 0.dp)
        ) {
            Button(
                onClick = { },
                shape = RoundedCornerShape(20.dp),
                modifier = Modifier
                    .width(150.dp)
                    .height(50.dp)
                    .align(BottomEnd),
                colors = ButtonDefaults
                    .buttonColors(backgroundColor = Primary, contentColor = White)
            ) {
                Text(text = "Login", style = MaterialTheme.typography.button)
            }
        }

        Spacer(modifier = Modifier.height(40.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp, 0.dp)
        ) {
            Text(text = "Don't have an account? ", style = MaterialTheme.typography.body1)
            ClickableText(
                text = AnnotatedString("Register"),
                onClick = { },
                style = MaterialTheme.typography.overline
            )
        }
    }
    Box(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(),
    ) {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ClickableText(
                text = AnnotatedString("Back To Main Menu"),
                onClick = { },
                style = MaterialTheme.typography.overline
            )

            Spacer(modifier = Modifier.height(20.dp))
            Image(
                modifier = Modifier
                    .fillMaxWidth(),
                painter = painterResource(id = R.drawable.background_),
                contentDescription = "",
                contentScale = ContentScale.FillWidth
            )
        }
    }
}
