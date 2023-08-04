package br.senai.sp.jandira.navigationapp.screens.menu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.navigationapp.ui.theme.NavigationAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationAppTheme {
            }
        }
    }
}

@Composable
fun MenuScreen(navController: NavHostController) {

    Surface (
        modifier = Modifier
            .fillMaxSize(),
        color = Color(1, 69, 189, 255)
    ) {
        Column (
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround
        ){
            Text(
                text = "MENU",
                color = Color.White,
                fontWeight = FontWeight.Bold,
            )

            Button(
                onClick = { navController.navigate("perfil") },
                shape = RoundedCornerShape(15.dp),
                modifier = Modifier
                    .size(width = 128.dp, height = 40.dp),
                colors = ButtonDefaults.buttonColors(Color(255, 255, 255, 255))
            ) {
                Text(
                    text = "Perfil",
                    color = Color(51, 71, 176, 255),
                    fontWeight = FontWeight.Bold
                )
            }

            Button(
                onClick = { navController.navigate("pedidos") },
                shape = RoundedCornerShape(15.dp),
                modifier = Modifier
                    .size(width = 128.dp, height = 40.dp),
                colors = ButtonDefaults.buttonColors(Color(255, 255, 255, 255))
            ) {
                Text(
                    text = "Pedidos",
                    color = Color(51, 71, 176, 255),
                    fontWeight = FontWeight.Bold
                )
            }

            Button(
                onClick = { navController.navigate("login") },
                shape = RoundedCornerShape(15.dp),
                modifier = Modifier
                    .size(width = 128.dp, height = 40.dp),
                colors = ButtonDefaults.buttonColors(Color(255, 255, 255, 255))
            ) {
                Text(
                    text = "Sair",
                    color = Color(51, 71, 176, 255),
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}