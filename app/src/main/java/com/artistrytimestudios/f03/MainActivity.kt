package com.artistrytimestudios.f03

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import com.artistrytimestudios.f03.ui.theme.F03CastleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            F03CastleTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen() {
    Column(modifier = Modifier.padding(16.dp)) {
        Button(onClick = { openWebPage("https://tinyurl.com/4p9rcmww") }) {
            Text("Installation Guide")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = { openWebPage("https://play.google.com/store/apps/dev?id=4887226526184134400") }) {
            Text("Install Now")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = { openWebPage("https://play.google.com/store/apps/details?id=com.watchfacestudio.militaryf01") }) {
            Text("Rate App")
        }
    }
}

fun openWebPage(s: String) {

}

private fun ComponentActivity.openWebPage(url: String) {
    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
    startActivity(intent)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    F03CastleTheme {
        MainScreen()
    }
}
