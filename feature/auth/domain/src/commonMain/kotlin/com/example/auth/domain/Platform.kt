package com.example.auth.domain

import com.example.feature.auth.domain.BuildKonfig

expect fun platform(): String

val x = BuildKonfig.API_KEY