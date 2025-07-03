import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.urbanizer.consumer.navigation.Routes
import com.urbanizer.consumer.presentation.home.tabs.HomeTabScreen

@Composable
fun BottomNavGraph(navController: NavHostController, modifier: Modifier) {
    NavHost(navController, startDestination = Routes.HomeTabs.HOME,modifier.fillMaxSize()) {
        composable(Routes.HomeTabs.HOME) { HomeTabScreen() }
        composable(Routes.HomeTabs.ORDERS) { OrdersTabScreen() }
        composable(Routes.HomeTabs.PROFILE) { ProfileTabScreen() }
    }
}