package com.example.core.designsystem.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

val LocalExtendedColors = staticCompositionLocalOf { lightExtendedColors }

val ColorScheme.extended: ExtendedColors
    @ReadOnlyComposable
    @Composable
    get() = LocalExtendedColors.current

@Immutable
data class ExtendedColors(
    val primaryGreen: Color,
    val primaryBackground: Color,
    val primaryText: Color,
    val secondaryText: Color,
    val errorText: Color,
    val primaryButton: Color,
    val primaryGray: Color,
    val primaryLightBlue: Color,
    val friendIconColor: Color,
    val removeIconColor: Color
)

val lightExtendedColors = ExtendedColors(
    primaryGreen = Color(0xFF008080),
    primaryBackground = Color(0xFFFFFFFF),
    primaryText = Color(0xFF171A1F),
    secondaryText = Color(0XFF565D6D),
    errorText = Color(0xFFDB143C),
    primaryButton = Color(0xFF008080),
    primaryGray = Color(0xFFDEE1E6),
    primaryLightBlue = Color(0xFFE0FFFF),
    friendIconColor = Color(0xFF008080),
    removeIconColor = Color(0xFFDB143C)
)

val lightColorScheme = lightColorScheme(
    primary = Co2Hari0000,
    onPrimary = Co2Hari0010,
    secondary = Co2Hari0000,
    onSecondary = Co2Hari0011,
    error = Co2Hari0100,
    onError = Co2Hari0010,
    background = Co2Hari0001,
    onBackground = Co2Hari0010,
)
