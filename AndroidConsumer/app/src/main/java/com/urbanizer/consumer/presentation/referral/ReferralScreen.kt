import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ReferralScreen(){
    Column(modifier = Modifier.fillMaxSize()){
        Text("Referral Screen")
    }
}

@Preview(showBackground = true)
@Composable
private fun ReferralScreenPreview() {
    ReferralScreen()
}