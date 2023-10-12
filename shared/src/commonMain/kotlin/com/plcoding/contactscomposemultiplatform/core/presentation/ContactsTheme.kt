package com.plcoding.contactscomposemultiplatform.core.presentation

import androidx.compose.runtime.Composable

// Todo Expect is a key only for KMM products, its like an abstract function that is specified in each platform
@Composable
expect fun ContactsTheme(
    darkTheme: Boolean,
    dynamicColor: Boolean,
    content: @Composable () -> Unit
)