package ua.kpi.its.lab.data.svc.impl

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import ua.kpi.its.lab.data.entity.SoftwareProduct
import ua.kpi.its.lab.data.repo.SoftwareProductRepository
import ua.kpi.its.lab.data.svc.SoftwareProductService

@Service
class SoftwareProductServiceImpl @Autowired constructor(
    private val productRepository: SoftwareProductRepository
) : SoftwareProductService {

    override fun createProduct(product: SoftwareProduct): SoftwareProduct {
        return productRepository.save(product)
    }

    override fun retrieveProductById(id: Long): SoftwareProduct? {
        return productRepository.findById(id).orElse(null)
    }

    override fun updateProduct(product: SoftwareProduct): SoftwareProduct {
        return productRepository.save(product)
    }

    override fun deleteProductById(id: Long) {
        productRepository.deleteById(id)
    }
}
