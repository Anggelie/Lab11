package com.uvg.lab11anggelie.presentation.mainFlow.profile


import android.annotation.SuppressLint
import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ProfileRoute(
    onLogOutClick: () -> Unit
) {
    ProfileScreen(
        onLogOutClick = onLogOutClick,
        modifier = Modifier.fillMaxSize()
    )
}

@Composable
fun ProfileScreen(
    onLogOutClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .padding(64.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Box(modifier = background()) {
            Icon(
                contentDescription = "Person"
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text1()
            Text1()
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text1()
            Text1()
        }
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedButton(onClick = onLogOutClick) {
            Text1("Cerrar sesión", "1201613")
        }
    }
}

private fun background(): Modifier {

    return TODO("Provide the return value")
}

@SuppressLint("ModifierFactoryUnreferencedReceiver")
private fun Modifier.background(): Modifier {
    TODO("Not yet implemented")
}

fun Icon(contentDescription: String) {
    TODO("Not yet implemented")
}

@Composable
fun OutlinedButton(onClick: () -> Unit, content: @Composable () -> Unit) {
    TODO("Not yet implemented")
}

fun Text1() {
    TODO("Not yet implemented")
}

class MaterialTheme {
    companion object {
        val colorScheme: Any
            get() {
                TODO()
            }
    }

}

@Composable
fun Text1(s: String, text: String) {

}

@Preview
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun PreviewProfileScreen() {
    Theme()
}

fun Theme() {
    TODO("Not yet implemented")
}

@Composable
fun Surface(content: @Composable () -> Unit) {
    TODO("Not yet implemented")
}
