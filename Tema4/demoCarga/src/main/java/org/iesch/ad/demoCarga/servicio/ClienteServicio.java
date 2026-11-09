package org.iesch.ad.demoCarga.servicio;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.iesch.ad.demoCarga.modelo.Cliente;
import org.iesch.ad.demoCarga.repositorio.ClienteRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ClienteServicio {

    private final ClienteRepositorio clienteRepositorio;

    @Transactional //si no lo ponemsos daria un lazy
    //mostrar los datos del clientes con el id
    public void mostrarDatos(long id) {
        Optional<Cliente> cliente = clienteRepositorio.findById(id);

        if (cliente.isPresent()){
            Cliente cliente1 = cliente.get();
            System.out.println(cliente1.getNombre());
            System.out.println(cliente1.getId());
            //System.out.println(cliente1.getPedidos());


            System.out.println(cliente1.getPedidos().size() + " Pedidos");
        }else {
            System.out.println("No existe en la bse de datos este id ---> " + id);
        }
    }

    @Transactional
    //mostrar todos los clientes
    public void mostrarTodos() {

        List<Cliente> clienteList = clienteRepositorio.findAll();
        System.out.println(clienteList.size());
        System.out.println("==================");
        for (Cliente cliente : clienteList){
            System.out.println("Cliente: " + cliente.getId() + " Nuemero de pedidos:" +
                    cliente.getPedidos().size());
        }

    }
}

