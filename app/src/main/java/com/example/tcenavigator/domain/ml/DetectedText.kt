package com.example.tcenavigator.domain.ml

import com.example.tcenavigator.data.model.DetectedObjectResult
import com.google.ar.core.Frame

data class DetectedText(
    val detectedObjectResult: DetectedObjectResult,
    val frame: Frame
)
