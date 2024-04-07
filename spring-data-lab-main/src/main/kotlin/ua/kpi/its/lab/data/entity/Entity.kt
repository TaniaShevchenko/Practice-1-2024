package ua.kpi.its.lab.data.entity

import java.util.*

data class SoftwareProduct(
    val name: String,
    val developer: String,
    val version: String,
    val releaseDate: Date,
    val distributionSize: Long,
    val bitDepth: Int,
    val crossPlatform: Boolean,
    val modules: List<SoftwareModule>
) : Comparable<SoftwareProduct> {

    override fun compareTo(other: SoftwareProduct): Int {
        return this.name.compareTo(other.name)
    }
}

data class SoftwareModule(
    val description: String,
    val author: String,
    val language: String,
    val lastEditDate: Date,
    val size: Long,
    val linesOfCode: Int,
    val crossPlatform: Boolean
)
