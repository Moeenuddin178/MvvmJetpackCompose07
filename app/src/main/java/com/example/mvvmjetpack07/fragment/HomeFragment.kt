package com.example.mvvmjetpack07.fragment

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mvvmjetpack07.screens.ProductCard
import com.example.mvvmjetpack07.ui.theme.MVVMJETPACK07Theme

@Composable
fun HomeFragment(
    modifier: Modifier,
    onClickToDetailScreen: () -> Unit = {},
) {
    Surface(
        modifier = modifier.fillMaxSize(),
    ) {
        LazyVerticalGrid(
            modifier = Modifier.padding(16.dp),
            columns = GridCells.Adaptive(minSize = 96.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(60) {

                ProductCard(
                    modifier = modifier
                        .padding(
                            top = 16.dp
                        ),
                    onClickProduct = onClickToDetailScreen)
            }
        }
    }


}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Preview(showBackground = true)
@Composable
fun HomePreview() {
    MVVMJETPACK07Theme {
        HomeFragment(modifier = Modifier)
    }
}