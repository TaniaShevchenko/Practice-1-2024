package ua.kpi.its.lab.data

import org.springframework.context.annotation.AnnotationConfigApplicationContext
import ua.kpi.its.lab.data.config.Config
import ua.kpi.its.lab.data.svc.SoftwareProductService
import ua.kpi.its.lab.data.entity.SoftwareProduct
import java.util.*

fun main() {
    val context = AnnotationConfigApplicationContext(Config::class.java)
    val productService = context.getBean(SoftwareProductService::class.java)

    // Creating a sample product
    val product = SoftwareProduct(
        name = "Example Product",
        developer = "Example Developer",
        version = "1.0",
        releaseDate = Date(),
        distributionSize = 1024L,
        bitDepth = 64,
        crossPlatform = true,
        modules = emptyList()
    )

    // CRUD operations
    productService.createProduct(product)
    val retrievedProduct = productService.retrieveProductById(1)
    println("Retrieved Product: $retrievedProduct")
    retrievedProduct?.let {
        productService.deleteProductById(it.id)
    }
}
