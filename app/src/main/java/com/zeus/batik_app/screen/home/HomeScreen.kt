package com.zeus.batik_app.screen.home

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.zeus.batik_app.ui.theme.Primary

@Composable
fun HomeScreen() {
    val scaffoldState = rememberScaffoldState(rememberDrawerState(DrawerValue.Closed))

    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            TopAppBar(
                modifier = Modifier.fillMaxWidth(),
                backgroundColor = Primary,
                contentPadding = PaddingValues(20.dp),
            ) {
                Text(text = "Top App Bar")
            }
        },
        bottomBar = {
            BottomAppBar(
                modifier = Modifier.fillMaxWidth(),
                backgroundColor = Primary,
                contentPadding = PaddingValues(20.dp),
            ) {
                Text(text = "Bottom App Bar")
            }
        }
    ) {

    }
}