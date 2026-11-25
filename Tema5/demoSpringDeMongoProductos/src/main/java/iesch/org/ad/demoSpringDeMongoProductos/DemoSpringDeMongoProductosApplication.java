package iesch.org.ad.demoSpringDeMongoProductos;

import iesch.org.ad.demoSpringDeMongoProductos.modelo.Producto;
import iesch.org.ad.demoSpringDeMongoProductos.repositorio.ProductoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RequiredArgsConstructor
@SpringBootApplication
public class DemoSpringDeMongoProductosApplication implements CommandLineRunner {

	private final ProductoRepository productoRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringDeMongoProductosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		/*Producto producto = Producto.builder()
				.sku("BY12552CA")
				.nombre("Coche de juguete")
				.categoria("Juguetes")
				.precio(15.59)
				.stock(12)
				.build();*/

		//productoRepository.save(producto);

		//Update
		Producto producto = productoRepository.findById("6b0727749bc4bcdd783ca5b7").get();
		System.out.println();

	}
}
