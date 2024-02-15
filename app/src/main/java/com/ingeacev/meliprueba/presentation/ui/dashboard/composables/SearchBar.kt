package com.ingeacev.meliprueba.presentation.ui.dashboard.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ingeacev.meliprueba.R
import com.ingeacev.meliprueba.presentation.ui.theme.font_size_20

@Composable
fun SearchBar() {

    Row (
        modifier = Modifier.background(Color.Yellow)
    ){

        Icon(
            modifier = Modifier
                .size(24.dp)
                .align(Alignment.CenterVertically),
            imageVector = ImageVector.vectorResource(R.drawable.ic_search),
            contentDescription = " ",
            tint = Color(0XFFA6B5FF)
        )

        Spacer(modifier = Modifier.width(8.dp))


        Text(
            modifier = Modifier.align(Alignment.CenterVertically),
            text = "Buscar productos",
            color = Color.Black,
            fontSize = font_size_20,
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.bodyMedium
        )

    }
}

@Preview
@Composable
fun SearchBarPreview(){
    SearchBar()
}