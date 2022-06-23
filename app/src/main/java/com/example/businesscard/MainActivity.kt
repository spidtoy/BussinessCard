package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Android
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column(
        modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .background(color = Color(0xFF154360)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Spacer(
            Modifier.weight(1f)
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1.5f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Box {
                    Icon(
                        imageVector = Icons.Rounded.Android,
                        contentDescription = null,
                        tint = Color(0xFF2ecc71),
                        modifier = Modifier
                            .height(90.dp)
                            .width(120.dp)
                            .padding(bottom = 0.dp)
                    )
                    Text(
                        text = "android",
                        fontSize = 24.sp,
                        color = Color(0xFFFDFEFE),
                        modifier = Modifier
                            .padding(top = 0.dp)
                            .offset(x = 20.dp, y = 64.dp)
                    )
                }
                Text(
                    text = "Jennifer Doe",
                    fontSize = 51.sp,
                    color = Color(0xFFFDFEFE),
                    modifier = Modifier
                        .padding(bottom = 0.dp)
                )
                Text(
                    text = "Android Developer Extraordinaire",
                    fontSize = 12.sp,
                    color = Color(0xFF2ecc71),
                    modifier = Modifier
                        .padding(top = 0.dp)
                )

        }
        Spacer(
            Modifier.weight(1f)
        )

        Column(
            modifier = Modifier
            .fillMaxWidth()
            .weight(1f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            Divider(
                color = Color(0xFFA6ACAF),
                modifier = Modifier
                            .fillMaxWidth()
                            .width(2.dp)
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentWidth(Alignment.Start)
                    .padding(start = 50.dp)
            ){
                    Icon(
                        imageVector = Icons.Rounded.Call,
                        contentDescription = null,
                        tint = Color(0xFF2ecc71),
                        modifier = Modifier
                                .height(40.dp)
                                .width(30.dp)
                                .padding(bottom = 0.dp)
                        )
                    Text(
                        text = "+11 (123) 444 555 666",
                        fontSize = 18.sp,
                        color = Color(0xFFFDFEFE),
                        modifier = Modifier
                                .padding(start = 30.dp, top = 4.dp)
                        )
            }
            Divider(
                color = Color(0xFFA6ACAF),
                modifier = Modifier
                    .fillMaxWidth()
                    .width(2.dp)
            )
            Row(
                modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.Start)
                .padding(start = 50.dp)
            ){
                Icon(
                    imageVector = Icons.Rounded.Share,
                    contentDescription = null,
                    tint = Color(0xFF2ecc71),
                    modifier = Modifier
                        .height(40.dp)
                        .width(30.dp)
                        .padding(bottom = 0.dp)
                )
                Text(
                    text = "@AndroidDev",
                    fontSize = 18.sp,
                    color = Color(0xFFFDFEFE),
                    modifier = Modifier
                        .padding(start = 30.dp, top = 4.dp)
                )
            }
            Divider(
                color = Color(0xFFA6ACAF),
                modifier = Modifier
                    .fillMaxWidth()
                    .width(2.dp)
            )
            Row(
                modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.Start)
                .padding(start = 50.dp)
            ){
                Icon(
                    imageVector = Icons.Rounded.Email,
                    contentDescription = null,
                    tint = Color(0xFF2ecc71),
                    modifier = Modifier
                        .height(40.dp)
                        .width(30.dp)
                        .padding(bottom = 0.dp)
                )
                Text(
                    text = "jen.doe@android.com",
                    fontSize = 18.sp,
                    color = Color(0xFFFDFEFE),
                    modifier = Modifier
                        .padding(start = 30.dp, top = 4.dp)
                )
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinessCardTheme {
        Greeting()
    }
}