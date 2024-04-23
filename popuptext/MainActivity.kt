package com.example.popuptext

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.popuptext.ui.theme.PopUpTextTheme

class MainActivity : ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContent()
        {
            PopUpTextTheme()
            {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                )

                {
                    PopUpText(
                        message = "UNREAD MESSAGE",
                        from = "from INDIPHILE MGABA"
                    )


                }
            }
        }
    }
}

@Composable
fun PopUpText(message: String, from: String, modifier: Modifier= Modifier)
{

    Column (
        modifier= modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        )
    {
        val image = painterResource(R.drawable.androidpopup )
        Image(
                painter = image,
                contentDescription = null
            )
        Text(
            text = stringResource(R.string.unread_message),
            fontSize = 15.sp,
            lineHeight = 16.sp,
            modifier = Modifier.padding(8.dp)

        )

        Text(
            text = from,
            fontSize = 5.sp,
            modifier = modifier.padding(6.dp),
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PopUpTextPreview()
{
    PopUpTextTheme()
    {
        PopUpText(
            message = stringResource(R.string.unread_message),
            from = stringResource(R.string.signature_text)
        )
    }
}