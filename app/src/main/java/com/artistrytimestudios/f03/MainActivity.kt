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
import androidx.compose.ui.platform.LocalUriHandler
import android.content.Intent
import android.net.Uri
import androidx.compose.ui.platform.LocalContext


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
    val context = LocalContext.current
    val uriHandler = LocalUriHandler.current
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
            Button(onClick = {
                uriHandler.openUri("https://play.google.com/store/apps/dev?id=4887226526184134400")
            }) {
                Text("Google Play Store")
            }
            Spacer(modifier = Modifier.height(8.dp))
            Button(onClick = {
                uriHandler.openUri("https://play.google.com/store/apps/dev?id=4887226526184134400")
            }) {
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
                modifier = Modifier.clickable {
                    val emailIntent = Intent(Intent.ACTION_SENDTO).apply {
                        data = Uri.parse("mailto:ArtistryTimeStudios@gmail.com") // only email apps should handle this
                        putExtra(Intent.EXTRA_EMAIL, arrayOf("ArtistryTimeStudios@gmail.com"))
                        putExtra(Intent.EXTRA_SUBJECT, "Your subject here")
                    }
                    context.startActivity(Intent.createChooser(emailIntent, "Send email..."))
                },
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(16.dp))
            Divider()
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Installation Guide",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.clickable {
                    // Replace with the actual URL of your installation guide
                    uriHandler.openUri("https://tinyurl.com/4p9rcmww")
                },
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
