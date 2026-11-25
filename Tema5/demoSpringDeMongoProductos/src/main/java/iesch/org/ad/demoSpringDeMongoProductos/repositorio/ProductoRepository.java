package iesch.org.ad.demoSpringDeMongoProductos.repositorio;

import iesch.org.ad.demoSpringDeMongoProductos.modelo.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends MongoRepository<Producto, String> {



}
