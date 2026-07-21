package dev.spoonzy4kn.antenna

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Explore
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AntennaTheme {
                AntennaApp()
            }
        }
    }
}

private enum class AntennaDestination(
    val route: String,
    val label: String,
    val title: String,
    val icon: ImageVector,
) {
    Home("home", "Home", "Home", Icons.Outlined.Home),
    Search("search", "Search", "Search", Icons.Outlined.Search),
    Explore("explore", "Explore", "Explore", Icons.Outlined.Explore),
    MySubs("my-subs", "My Subs", "My Subs", Icons.Outlined.Star),
    Settings("settings", "Settings", "Settings", Icons.Outlined.Settings),
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun AntennaApp() {
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route
    val currentDestination = AntennaDestination.entries.firstOrNull { it.route == currentRoute }
        ?: AntennaDestination.Home

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = currentDestination.title,
                        fontWeight = FontWeight.SemiBold,
                    )
                },
            )
        },
        bottomBar = {
            NavigationBar {
                AntennaDestination.entries.forEach { destination ->
                    NavigationBarItem(
                        selected = currentDestination == destination,
                        onClick = {
                            navController.navigate(destination.route) {
                                popUpTo(navController.graph.findStartDestination().id) {
                                    saveState = true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        },
                        icon = {
                            Icon(
                                imageVector = destination.icon,
                                contentDescription = destination.label,
                            )
                        },
                        label = { Text(destination.label) },
                    )
                }
            }
        },
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = AntennaDestination.Home.route,
            modifier = Modifier.padding(innerPadding),
        ) {
            composable(AntennaDestination.Home.route) {
                PlaceholderScreen(
                    title = "Home",
                    body = "Your favourite communities will appear here once local favourites are implemented.",
                )
            }
            composable(AntennaDestination.Search.route) {
                PlaceholderScreen(
                    title = "Search",
                    body = "Search will support community and post discovery where the selected access method allows it.",
                )
            }
            composable(AntennaDestination.Explore.route) {
                PlaceholderScreen(
                    title = "Explore",
                    body = "Explore will surface browseable content without pretending unsupported features are available.",
                )
            }
            composable(AntennaDestination.MySubs.route) {
                PlaceholderScreen(
                    title = "My Subs",
                    body = "Local favourites will be managed here without requiring an account.",
                )
            }
            composable(AntennaDestination.Settings.route) {
                PlaceholderScreen(
                    title = "Settings",
                    body = "Appearance, content, privacy, account, FAQ, and about sections will be added here.",
                )
            }
        }
    }
}

@Composable
private fun PlaceholderScreen(
    title: String,
    body: String,
    contentPadding: PaddingValues = PaddingValues(24.dp),
) {
    Surface(
        color = MaterialTheme.colorScheme.background,
        modifier = Modifier.fillMaxSize(),
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(12.dp),
            modifier = Modifier
                .fillMaxSize()
                .padding(contentPadding),
        ) {
            Text(
                text = title,
                style = MaterialTheme.typography.headlineMedium,
                color = MaterialTheme.colorScheme.onBackground,
            )
            Text(
                text = body,
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
            )
        }
    }
}

@Composable
private fun AntennaTheme(
    darkTheme: Boolean = false,
    content: @Composable () -> Unit,
) {
    val lightColors = lightColorScheme(
        primary = Color(0xFF28675F),
        secondary = Color(0xFF7B5B18),
        tertiary = Color(0xFF78536A),
        background = Color(0xFFFFFBF5),
        surface = Color(0xFFFFFBF5),
        surfaceVariant = Color(0xFFE3E2D7),
    )
    val darkColors = darkColorScheme(
        primary = Color(0xFF8FD5CA),
        secondary = Color(0xFFE5C16A),
        tertiary = Color(0xFFE5B8D2),
        background = Color(0xFF121412),
        surface = Color(0xFF121412),
        surfaceVariant = Color(0xFF45483F),
    )

    MaterialTheme(
        colorScheme = if (darkTheme) darkColors else lightColors,
        content = content,
    )
}

@Preview(showBackground = true)
@Composable
private fun AntennaAppPreview() {
    AntennaTheme {
        PlaceholderScreen(
            title = "Antenna",
            body = "Android skeleton preview",
        )
    }
}
