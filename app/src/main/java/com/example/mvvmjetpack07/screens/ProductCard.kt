package com.example.mvvmjetpack07.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mvvmjetpack07.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProductCard(
    modifier: Modifier,
    onClickProduct: () -> Unit = {},
) {

    Card(
        modifier = Modifier,
        onClick = onClickProduct
    ) {
        Column(
            modifier = modifier.padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "Image",
                modifier
                    .clip(CircleShape)
                    .size(40.dp)
                    .border(1.dp, Color.Magenta, CircleShape)
            )
            Text(
                text = stringResource(id = R.string.product_name_placeholder),
                maxLines = 1,
                fontSize = 14.sp,
                overflow = TextOverflow.Ellipsis,
                fontWeight = FontWeight.Bold,
            )
            Text(
                text = stringResource(id = R.string.product_description_placeholder),
                maxLines = 1,
                fontSize = 8.sp,
                overflow = TextOverflow.Ellipsis,
                fontWeight = FontWeight.Medium
            )
        }
    }


}


@Preview(showBackground = true)
@Composable
fun ProductCardPreview() {
    // JetpackComposeTheme {
    ProductCard(modifier = Modifier)
    //}
}