package com.plcoding.contactscomposemultiplatform.core.presentation

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.runtime.Composable
import com.plcoding.contactscomposemultiplatform.ui.theme.DarkColorScheme
import com.plcoding.contactscomposemultiplatform.ui.theme.LightColorScheme
import com.plcoding.contactscomposemultiplatform.ui.theme.Typography

// Todo Actual is a key only for KMM products, its like a concrete function that is specified in each platform
@Composable
actual fun ContactsTheme(
    darkTheme: Boolean,
    dynamicColor: Boolean,
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme,
        typography = Typography,
        content = content
    )
}