package com.example.studikasussatu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.studikasussatu.ui.theme.StudiKasusSatuTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            StudiKasusSatuTheme {
                Article()
            }
        }
    }


    @Composable
    fun Article() {
        Column(
            modifier = Modifier.fillMaxWidth()

        ) {
            Image(painter = painterResource(id = R.drawable.filkom), contentDescription = null,
                modifier = Modifier.align(Alignment.CenterHorizontally))
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = stringResource(id = R.string.title),
                textAlign = TextAlign.Left,
                fontSize = 24.sp,
                modifier = Modifier.padding(horizontal = 15.dp)

                )
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = stringResource(id = R.string.paragraf1),
                textAlign = TextAlign.Justify,
                modifier = Modifier.padding(horizontal = 15.dp))
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = stringResource(id = R.string.paragraf2),
                textAlign = TextAlign.Justify,
                modifier = Modifier.padding(horizontal = 15.dp))
            Spacer(modifier = Modifier.height(10.dp))
        }

    }

    @Preview(showBackground = true)
    @Composable
    fun ArticlePreview() {
        StudiKasusSatuTheme {
            Article()
        }
    }
}