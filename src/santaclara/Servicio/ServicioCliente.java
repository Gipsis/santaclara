package santaclara.Servicio;


import java.io.IOException;
import java.util.List;
import santaclara.dao.impl.ClienteDAO;
import santaclara.dao.impl.RutaDAO;
import santaclara.modelo.Ruta;
import santaclara.modelo.Cliente;

public class ServicioCliente {
	
	private ClienteDAO clienteDAO = new ClienteDAO();  
	private RutaDAO rutaDAO = new  RutaDAO();
	
	public List<Ruta>  getRutas() throws NumberFormatException, IOException
	{	
		return rutaDAO.getRutas();
	}
	
	public List<Cliente> getClientes() throws IOException
	{
		return clienteDAO.getClientes();
	}
	
	public void guardar(Cliente cliente) throws IOException {
		// TODO Auto-generated method stub
		// if el es nuevo que no este otro con el mismo nombre
		clienteDAO.guardar(cliente);	
	}
	public Cliente buscar(int id) throws IOException{
		
		return clienteDAO.getCliente(id);
	}
	public void eliminar (String id)throws IOException{
		clienteDAO.eliminar(clienteDAO.getCliente(new Integer(id)));
	}
	public void modificar (Cliente cliente) throws IOException{
		clienteDAO.guardar(cliente);
	}
}