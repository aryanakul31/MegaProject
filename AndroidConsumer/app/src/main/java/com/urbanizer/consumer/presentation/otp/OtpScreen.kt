import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun OtpScreen(){
    Column(modifier = Modifier.fillMaxSize()){
        Text("OTP Screen")
    }
}

@Preview(showBackground = true)
@Composable
private fun OtpScreenPreview() {
    OtpScreen()
}