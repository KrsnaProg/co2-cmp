package com.example.core.designsystem.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import co2.core.designsystem.generated.resources.Res
import co2.core.designsystem.generated.resources.inter_black_italic
import co2.core.designsystem.generated.resources.inter_bold
import co2.core.designsystem.generated.resources.inter_extrabold
import co2.core.designsystem.generated.resources.inter_extrabold_italic
import co2.core.designsystem.generated.resources.inter_italic
import co2.core.designsystem.generated.resources.inter_medium
import co2.core.designsystem.generated.resources.inter_medium_italic
import co2.core.designsystem.generated.resources.inter_regular
import co2.core.designsystem.generated.resources.inter_semibold
import co2.core.designsystem.generated.resources.inter_semibold_italic
import org.jetbrains.compose.resources.Font

val Inter
    @Composable get() = FontFamily(
        Font(
            resource = Res.font.inter_black_italic,
            weight = FontWeight.Black,
            style = FontStyle.Italic,
        ),
        Font(
            resource = Res.font.inter_bold,
            weight = FontWeight.Bold
        ),
        Font(
            resource = Res.font.inter_extrabold,
            weight = FontWeight.ExtraBold
        ),
        Font(
            resource = Res.font.inter_extrabold_italic,
            weight = FontWeight.ExtraBold,
            style = FontStyle.Italic,
        ),
        Font(
            resource = Res.font.inter_italic,
            style = FontStyle.Italic
        ),
        Font(
            resource = Res.font.inter_medium,
            weight = FontWeight.Medium,
        ),
        Font(
            resource = Res.font.inter_medium_italic,
            weight = FontWeight.Medium,
            style = FontStyle.Italic,
        ),
        Font(
            resource = Res.font.inter_regular,
            weight = FontWeight.Normal,
        ),
        Font(
            resource = Res.font.inter_semibold,
            weight = FontWeight.SemiBold,
        ),
        Font(
            resource = Res.font.inter_semibold_italic,
            weight = FontWeight.SemiBold,
            style = FontStyle.Italic,
        )
    )

val Typography.labelXSmall: TextStyle
    @Composable get() = TextStyle(
        fontFamily = Inter,
        fontWeight = FontWeight.SemiBold,
        fontSize = 11.sp,
        lineHeight = 14.sp,
    )

val Typography
    @Composable get() = Typography(
        titleLarge = TextStyle(
            fontFamily = Inter,
            fontWeight = FontWeight.SemiBold,
            fontSize = 30.sp,
            lineHeight = 36.sp,
        ),
        titleMedium = TextStyle(
            fontFamily = Inter,
            fontWeight = FontWeight.SemiBold,
            fontSize = 20.sp,
            lineHeight = 28.sp,
        ),
        titleSmall = TextStyle(
            fontFamily = Inter,
            fontWeight = FontWeight.SemiBold,
            fontSize = 16.sp,
            lineHeight = 24.sp
        ),
        bodyLarge = TextStyle(
            fontFamily = Inter,
            fontWeight = FontWeight.Normal,
            fontSize = 18.sp,
            lineHeight = 26.sp
        ),
        bodyMedium = TextStyle(
            fontFamily = Inter,
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp,
            lineHeight = 24.sp
        ),
        bodySmall = TextStyle(
            fontFamily = Inter,
            fontWeight = FontWeight.Normal,
            fontSize = 14.sp,
            lineHeight = 20.sp
        ),
        labelMedium = TextStyle(
            fontFamily = Inter,
            fontWeight = FontWeight.Medium,
            fontSize = 16.sp,
            lineHeight = 24.sp
        ),
        labelSmall = TextStyle(
            fontFamily = Inter,
            fontWeight = FontWeight.SemiBold,
            fontSize = 14.sp,
            lineHeight = 20.sp
        ),
        headlineSmall = TextStyle(
            fontFamily = Inter,
            fontWeight = FontWeight.SemiBold,
            fontSize = 14.sp,
            lineHeight = 18.sp
        ),
        displaySmall = TextStyle(
            fontFamily = Inter,
            fontWeight = FontWeight.SemiBold,
            fontSize = 11.sp,
            lineHeight = 14.sp
        ),
    )