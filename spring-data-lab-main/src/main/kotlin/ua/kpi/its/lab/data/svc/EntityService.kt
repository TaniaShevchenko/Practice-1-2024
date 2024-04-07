package ua.kpi.its.lab.data.svc

import ua.kpi.its.lab.data.entity.SoftwareProduct

interface SoftwareProductService {
    fun createProduct(product: SoftwareProduct): SoftwareProduct
    fun retrieveProductById(id: Long): SoftwareProduct?
    fun updateProduct(product: SoftwareProduct): SoftwareProduct
    fun deleteProductById(id: Long)
}
