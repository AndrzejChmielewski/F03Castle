package com.artistrytimestudios.f03

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.artistrytimestudios.f03.ui.theme.F03CastleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            F03CastleTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "This watch face companion app was created for you to easily find and download watch faces for your watch device. Wear OS API 28+",
                style = MaterialTheme.typography.bodyLarge,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { /* TODO: Handle click here */ }) {
                Text("Google Play Store")
            }
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedButton(onClick = { /* TODO: Handle click here */ }) {
                Text("Rate App")
            }
            Spacer(modifier = Modifier.height(24.dp))
            Text(
                text = "NOTE: If you bought the app by mistake, need assistance, or have any questions",
                style = MaterialTheme.typography.bodySmall,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Please contact us at: ArtistryTimeStudios@gmail.com",
                style = MaterialTheme.typography.bodySmall,
                modifier = Modifier.clickable { /* TODO: Add email intent */ },
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(16.dp))
            Divider()
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Installation Guide",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.clickable { /* TODO: Handle click here */ },
                textAlign = TextAlign.Center
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    F03CastleTheme {
        MainScreen()
    }
}
