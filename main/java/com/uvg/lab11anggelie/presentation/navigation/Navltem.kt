package com.uvg.lab11anggelie.presentation.navigation


import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Groups
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.Groups
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material.icons.outlined.Person
import androidx.compose.ui.graphics.vector.ImageVector
import com.uvg.lab11anggelie.presentation.mainFlow.character.CharacterNavGraph
import com.uvg.lab11anggelie.presentation.mainFlow.character.list.CharacterListDestination
import com.uvg.lab11anggelie.presentation.mainFlow.location.LocationsNavGraph
import com.uvg.lab11anggelie.presentation.mainFlow.location.list.LocationListDestination
import com.uvg.lab11anggelie.presentation.mainFlow.profile.ProfileDestination

data class NavItem(
    val title: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val destination: Any,
)

val navigationItems = listOf(
    NavItem(
        title = "Characters",
        selectedIcon = Icons.Filled.Groups,
        unselectedIcon = Icons.Outlined.Groups,
        destination = CharacterNavGraph
    ),
    NavItem(
        title = "Locations",
        selectedIcon = Icons.Filled.LocationOn,
        unselectedIcon = Icons.Outlined.LocationOn,
        destination = LocationsNavGraph
    ),
    NavItem(
        title = "Profile",
        selectedIcon = Icons.Filled.Person,
        unselectedIcon = Icons.Outlined.Person,
        destination = ProfileDestination
    )
)

val topLevelDestinations = listOf(
    CharacterListDestination::class,
    LocationListDestination::class,
    ProfileDestination::class
)