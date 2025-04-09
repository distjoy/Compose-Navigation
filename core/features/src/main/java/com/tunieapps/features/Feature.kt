package com.tunieapps.features

import kotlinx.serialization.Serializable


@Serializable
sealed class Feature {
    @Serializable
    data object Splash : Feature()

    @Serializable
    data object Home : Feature()

    @Serializable
    data object Profile : Feature()

    @Serializable
    data object Help : Feature()

    @Serializable
    data object MultiScreen : Feature()
}