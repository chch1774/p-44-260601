package com.example.upload.global.app

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "custom.site")
data class SiteProperties(
    val domain: String,
    val frontUrl: String,
    val backUrl: String
)