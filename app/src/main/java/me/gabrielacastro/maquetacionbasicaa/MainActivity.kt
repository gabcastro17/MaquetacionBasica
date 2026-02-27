package me.gabrielacastro.maquetacionbasicaa

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.gabrielacastro.maquetacionbasicaa.ui.theme.MaquetacionBasicaaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            producto()
        }
    }
}


@Composable
@Preview(showBackground = true, showSystemUi = true)

fun producto(){
    Column(
        modifier = Modifier.padding(16.dp).fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            val painter1 = painterResource(R.drawable.corazon1)
            Image(
                painter = painter1,
                contentDescription = null,
                modifier = Modifier.width(20.dp)

            )
        }
        val painter = painterResource(R.drawable.glossdior1)
        Image(
            painter = painter,
            contentDescription = null,
            modifier = Modifier.width(250.dp).padding(16.dp)

        )
        Text(text = "Dior Addict Lip Glow Oil Tono 001 Pink",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(Alignment.Start)

        )
        Text(text = "$230.900",
            fontSize = 28.sp,
            color = Color.Green,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(Alignment.Start)

        )
        HorizontalDivider(
            color = Color.Gray,
            modifier = Modifier.padding(5.dp)
        )
        Text(text = "Experimenta el lujo y el cuidado en tus labios con Dior Addict Lip Glow Oil. Este exquisito aceite labial, con su fórmula innovadora, realza la belleza natural de tus labios mientras los hidrata y protege. Su textura ligera y no pegajosa proporciona un brillo radiante y un confort duradero, ideal para todo tipo de piel. Disfruta de un tratamiento de belleza que combina el glamour de Dior con el cuidado esencial para unos labios irresistibles.",
        )

        Row(
        ) {
                Button(
                    onClick = {},
                    modifier = Modifier.weight(1f)
                )
                {Text(text = "Editar")}
                Spacer(modifier = Modifier.width(8.dp))


                Button(
                    onClick = {},
                    modifier = Modifier.weight(1f),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Red)
                )
                {Text(text = "Eliminar")}
        }

    }
}