package com.example.jaycompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.jaycompose.ui.theme.JayComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JayComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicCompound(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun BasicCompound(modifier: Modifier = Modifier) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = "LOGIN",
            fontSize = 80.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            modifier = Modifier.padding(top = 30.dp)
        )

        Image(painter = painterResource(
            id = R.drawable.logo),
            contentDescription = "",
        )

        Text(
            text ="Nama",
            fontSize = 20.sp,
            modifier = Modifier.padding(top = 10.dp)
        )

        Text(
            text = "Giant Prakoso Amukti Wibowo",
            fontSize = 22.sp,
            color = Color.Red,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.padding(top = 5.dp)
        )

        Text(
            text = "20220140105",
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,
            modifier = Modifier.padding(top = 10.dp)
        )

        Image(painter = painterResource(
            id = R.drawable.krs),
            contentDescription = "",

            )

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JayComposeTheme {
        BasicCompound()
    }
}