package com.example.a30days30soccerplayers

import android.content.res.Resources.Theme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a30days30soccerplayers.data.Player
import com.example.a30days30soccerplayers.data.players
import com.example.a30days30soccerplayers.ui.theme.AppTheme

/**
 * Main activity for the soccer players app.
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PlayerList()
                }
            }
        }
    }
}

/**
 * Composable function that displays a list of soccer players.
 *
 * @param modifier The modifier for this composable.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PlayerList(modifier: Modifier = Modifier) {
    LazyColumn (
        verticalArrangement = Arrangement.Center
    ){
        item {
            CenterAlignedTopAppBar(
                title = {
                    Text(text = "Soccer Players", style = MaterialTheme.typography.displayLarge)
                }
            )

            players.forEach { player ->
                PlayerListItem(player = player)
            }
        }

    }
}

/**
 * Composable function that displays a player's information within a card.
 *
 * @param player The player's information to display.
 * @param modifier The modifier for this composable.
 */
@Composable
fun PlayerListItem(player: Player, modifier: Modifier = Modifier) {
    var expanded by remember { mutableStateOf(false) }

    Card(
        modifier = modifier
            .fillMaxWidth()
            .clickable { expanded = !expanded }
            .height(if (expanded) 300.dp else 200.dp)
            .padding(16.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 2.dp
        ),
        shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp, bottomStart = 8.dp, bottomEnd = 8.dp)
    ) {
        // Use a Column to arrange the content within the Card
        Column(modifier = Modifier.fillMaxSize()) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .sizeIn(minHeight = 72.dp)
            ) {
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .animateContentSize(
                            animationSpec = spring(
                                dampingRatio = Spring.DampingRatioNoBouncy,
                                stiffness = Spring.StiffnessMedium
                            )
                        )
                ) {
                    Text(
                        text = stringResource(id = player.name),
                        style = MaterialTheme.typography.displaySmall,
                    )
                }
                Spacer(modifier = Modifier.padding(16.dp))
                Box(
                    modifier = Modifier
                        .width(200.dp)
                        .height(100.dp)
                ) {
                    Image(
                        painter = painterResource(id = player.imageResourceId),
                        contentDescription = null,
                        alignment = Alignment.TopCenter,
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier.clip(RoundedCornerShape(5.dp))
                    )
                }
            }

            if (expanded) {
                // Use a nested Column for the expanded content
                Column(modifier = Modifier.fillMaxSize() .align(Alignment.CenterHorizontally)) {
                    Text(
                        text = "Team: " + stringResource(id = player.team),
                        style = MaterialTheme.typography.bodyLarge,
                        modifier = Modifier.padding(bottom = 7.dp),
                    )
                    Text(
                        text = "Date of Birth: " + stringResource(id = player.dob),
                        style = MaterialTheme.typography.bodyLarge,
                        modifier = Modifier.padding(bottom = 7.dp),
                    )
                    Text(
                        text = "Fun Fact: " + stringResource(id = player.funFact),
                        style = MaterialTheme.typography.bodyLarge,
                        modifier = Modifier.padding(bottom = 7.dp),
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppTheme {
        PlayerList()
    }
}