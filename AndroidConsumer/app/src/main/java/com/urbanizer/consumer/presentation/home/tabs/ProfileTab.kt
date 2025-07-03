import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ProfileTabScreen(){
    Column(modifier = Modifier.fillMaxSize()){
        Text("Profile Tab")
    }
}

@Preview(showBackground = true)
@Composable
private fun ProfileTabPreview() {
    ProfileTabScreen()
}