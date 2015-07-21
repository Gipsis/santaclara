package santaclara.vista;

import java.awt.EventQueue; 

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem; 
 

import javax.swing.JMenuBar;

import santaclara.controlador.ContPrincipal;
import santaclara.modelo.Concesionario;
import santaclara.modelo.JefeVenta;
import santaclara.modelo.Usuario;
import santaclara.modelo.Vendedor;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;


public class PrincipalUI {

	private JFrame frame;
	private JMenuBar menuBar = new JMenuBar();
	private ContPrincipal controlador;

	private 	JMenu mnCatalogo;
	private     JMenuItem mntAlmacen;
	private     JMenuItem mntCamiones;
	private     JMenuItem mntCapacidades;
	private 	JMenuItem mntClientes;
	private 	JMenuItem mntConcesionarios;
	private 	JMenuItem mntConcesionarioRutas;
	private 	JMenu mnDetalleFacturacion;
	private 	JMenu mnDomicilioComerciales;
	private 	JMenuItem mntEmpaqueProductos;
	private 	JMenu mnFacturacion;
	private 	JMenuItem mntJefeVenta;
	private 	JMenuItem mntPresentaciones;
	private 	JMenuItem mntProductos;
	private 	JMenuItem mntProductoAlmacenes;
	private 	JMenuItem mntRutas;
	private 	JMenuItem mntSabores;
	private 	JMenuItem mntSalps;
	private 	JMenuItem mntUsuarios;
	private 	JMenuItem mntVendedores;
	private 	JMenuItem mntVisitas;
	private 	JMenuItem mntZonas;
	
	private 	JMenu mnReportes;
	private 	JMenu mnConsulta;
	private 	JMenu mnSalir;
	private 	JMenuItem mntCerrar;

	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalUI window = new PrincipalUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @param controlador 
	 */
	public PrincipalUI(ContPrincipal controlador) {
		this.controlador = controlador;
		initialize();
	}
	
	
	public PrincipalUI( ) {
		initialize();
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("unused")
	private void initialize() {
		frame = new JFrame("Embotelladora Santa Clara");
		 Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        
        frame.setSize(1200,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        frame.setVisible(true);
		frame.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 10));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		menuBar.setToolTipText("Manu");
		frame.setJMenuBar(menuBar);
		JMenu mnCatalogo = new JMenu("Catalogo");
		menuBar.add(mnCatalogo);
		
		mntAlmacen = new JMenuItem("Almacenes");
		mnCatalogo.add(mntAlmacen);
		mntAlmacen.addActionListener(controlador.activarMenu());
		
		mntCamiones = new JMenuItem("Camiones");
		mnCatalogo.add(mntCamiones);
		mntCamiones.addActionListener(controlador.activarMenu());
		
		mntCapacidades = new JMenuItem("Capacidades");
		mnCatalogo.add(mntCapacidades);
		mntCapacidades.addActionListener(controlador.activarMenu());
		
		mntClientes = new JMenuItem("Clientes");
		mnCatalogo.add(mntClientes);
		mntClientes.addActionListener(controlador.activarMenu());
		
		mntConcesionarios = new JMenuItem("Concesionarios");
		mnCatalogo.add(mntConcesionarios);
		mntConcesionarios.addActionListener(controlador.activarMenu());
		
		mntConcesionarioRutas = new JMenuItem("ConcesionarioRutas");
		mnCatalogo.add(mntConcesionarioRutas);
		mntConcesionarioRutas.addActionListener(controlador.activarMenu());
		
		
		mntEmpaqueProductos = new JMenuItem("Empaque Productos");
		mnCatalogo.add(mntEmpaqueProductos);
		mntEmpaqueProductos.addActionListener(controlador.activarMenu());
	    
		mnFacturacion = new JMenu("Facturacion");
		menuBar.add(mnFacturacion);
		
		mntJefeVenta = new JMenuItem("Jefe Ventas");
		mnCatalogo.add(mntJefeVenta);
		mntJefeVenta.addActionListener(controlador.activarMenu());
		
		mntPresentaciones = new JMenuItem("Presentaciones");
		mnCatalogo.add(mntPresentaciones);
		mntPresentaciones.addActionListener(controlador.activarMenu());
		
		mntProductos = new JMenuItem("Productos");
		mnCatalogo.add(mntProductos);
		mntProductos.addActionListener(controlador.activarMenu());
		
		mntProductoAlmacenes = new JMenuItem("Producto por Almacenes");
		mnCatalogo.add(mntProductoAlmacenes);
		mntProductoAlmacenes.addActionListener(controlador.activarMenu());
		
		mntRutas = new JMenuItem("Ruta");
		mnCatalogo.add(mntRutas);
		mntRutas.addActionListener(controlador.activarMenu());
		
		mntSabores = new JMenuItem("Sabores");
		mnCatalogo.add(mntSabores);
		mntSabores.addActionListener(controlador.activarMenu());
		
		mntSalps = new JMenuItem("Salps");
		mnCatalogo.add(mntSalps);
		mntSalps.addActionListener(controlador.activarMenu());
		
		mntUsuarios = new JMenuItem("Usuarios");
		mnCatalogo.add(mntUsuarios);
		mntUsuarios.addActionListener(controlador.activarMenu());
		
		mntVendedores = new JMenuItem("Vendedores");
		mnCatalogo.add(mntVendedores);
		mntVendedores.addActionListener(controlador.activarMenu());
		
		mntVisitas = new JMenuItem("Visitas");
		mnCatalogo.add(mntVisitas);
		mntVisitas.addActionListener(controlador.activarMenu());
		
		mntZonas = new JMenuItem("Zonas");
		mnCatalogo.add(mntZonas);
		mntZonas.addActionListener(controlador.activarMenu());
		
		mntConcesionarios = new JMenuItem("Consesionarios");
		mnCatalogo.add(mntConcesionarios);
		
		mnReportes = new JMenu("Reportes");
		menuBar.add(mnReportes);
		
		mnConsulta = new JMenu("Consulta");
		menuBar.add(mnConsulta);
		
		mnSalir = new JMenu("Salir");
		mntCerrar = new JMenuItem("cerrar sesión ");
 
	 
		mnSalir.add(mntCerrar);  
		mntCerrar.addActionListener(controlador.salirSesion());
		menuBar.add(mnSalir);

		menuBar.setVisible(false);;

		frame.setVisible(true); 
	}
	
	public void dibujarMenu(Usuario usuario )
	{ 
		menuBar.setVisible(true);
		
		if(usuario.getClass().equals(JefeVenta.class))
		{
			
			
		}
		if(usuario.getClass().equals(Vendedor.class))
		{
			
			
		}
		if(usuario.getClass().equals(Concesionario.class))
		{
			
			
		}

	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
 

	public JMenuBar getMenuBar() {
		return menuBar;
	}

	public void setMenuBar(JMenuBar menuBar) {
		this.menuBar = menuBar;
	}

	public JMenuItem getMntVendedores() {
		return mntVendedores;
	}

	public void setMntVendedores(JMenuItem mntVendedores) {
		this.mntVendedores = mntVendedores;
	}

	public JMenu getMnCatalogo() {
		return mnCatalogo;
	}

	public void setMnCatalogo(JMenu mnCatalogo) {
		this.mnCatalogo = mnCatalogo;
	}

	public JMenuItem getMntEmpaqueProductos() {
		return mntEmpaqueProductos;
	}

	public void setMntEmpaqueProductos(JMenuItem mntProductos) {
		this.mntEmpaqueProductos = mntProductos;
	}

	public JMenuItem getMntClientes() {
		return mntClientes;
	}

	public void setMntClientes(JMenuItem mntClientes) {
		this.mntClientes = mntClientes;
	}

	public JMenuItem getMntConcesionario() {
		return mntConcesionarios;
	}

	public void setMntConcesionario(JMenuItem mntConcesionario) {
		this.mntConcesionarios = mntConcesionario;
	}

	public JMenu getMnFacturacion() {
		return mnFacturacion;
	}

	public void setMnFacturacion(JMenu mnFacturacion) {
		this.mnFacturacion = mnFacturacion;
	}

	public JMenu getMnReportes() {
		return mnReportes;
	}

	public void setMnReportes(JMenu mnReportes) {
		this.mnReportes = mnReportes;
	}

	public JMenu getMnConsulta() {
		return mnConsulta;
	}

	public void setMnConsulta(JMenu mnConsulta) {
		this.mnConsulta = mnConsulta;
	}

	public JMenu getMnSalir() {
		return mnSalir;
	}

	public void setMnSalir(JMenu mnSalir) {
		this.mnSalir = mnSalir;
	}

	public JMenuItem getMntCerrar() {
		return mntCerrar;
	}

	public void setMntCerrar(JMenuItem mntCerrar) {
		this.mntCerrar = mntCerrar;
	}

	public JMenuItem getMntRuta() {
		return mntRutas;
	}

	public void setMntRuta(JMenuItem mntRuta) {
		this.mntRutas = mntRuta;
	}

	public ContPrincipal getControlador() {
		return controlador;
	}

	public void setControlador(ContPrincipal controlador) {
		this.controlador = controlador;
	}

	public JMenuItem getMntRutas() {
		return mntRutas;
	}

	public void setMntRutas(JMenuItem mntRutas) {
		this.mntRutas = mntRutas;
	}

	public JMenuItem getMntPresentaciones() {
		return mntPresentaciones;
	}

	public void setMntPresentaciones(JMenuItem mntPresentaciones) {
		this.mntPresentaciones = mntPresentaciones;
	}

	public JMenuItem getMntAlmacen() {
		return mntAlmacen;
	}

	public void setMntAlmacen(JMenuItem mntAlmacen) {
		this.mntAlmacen = mntAlmacen;
	}

	public JMenuItem getMntCamiones() {
		return mntCamiones;
	}

	public void setMntCamiones(JMenuItem mntCamiones) {
		this.mntCamiones = mntCamiones;
	}

	public JMenuItem getMntCapacidades() {
		return mntCapacidades;
	}

	public void setMntCapacidades(JMenuItem mntCapacidades) {
		this.mntCapacidades = mntCapacidades;
	}

	public JMenuItem getMntConcesionarios() {
		return mntConcesionarios;
	}

	public void setMntConcesionarios(JMenuItem mntConcesionarios) {
		this.mntConcesionarios = mntConcesionarios;
	}

	public JMenuItem getMntConcesionarioRutas() {
		return mntConcesionarioRutas;
	}

	public void setMntConcesionarioRutas(JMenuItem mntConcesionarioRutas) {
		this.mntConcesionarioRutas = mntConcesionarioRutas;
	}

	public JMenu getMnDetalleFacturacion() {
		return mnDetalleFacturacion;
	}

	public void setMnDetalleFacturacion(JMenu mnDetalleFacturacion) {
		this.mnDetalleFacturacion = mnDetalleFacturacion;
	}

	public JMenu getMnDomicilioComerciales() {
		return mnDomicilioComerciales;
	}

	public void setMnDomicilioComerciales(JMenu mnDomicilioComerciales) {
		this.mnDomicilioComerciales = mnDomicilioComerciales;
	}

	public JMenuItem getMntJefeVenta() {
		return mntJefeVenta;
	}

	public void setMntJefeVenta(JMenuItem mntJefeVenta) {
		this.mntJefeVenta = mntJefeVenta;
	}

	public JMenuItem getMntProductos() {
		return mntProductos;
	}

	public void setMntProductos(JMenuItem mntProductos) {
		this.mntProductos = mntProductos;
	}

	public JMenuItem getMntProductoAlmacenes() {
		return mntProductoAlmacenes;
	}

	public void setMntProductoAlmacenes(JMenuItem mntProductoAlmacenes) {
		this.mntProductoAlmacenes = mntProductoAlmacenes;
	}

	public JMenuItem getMntSabores() {
		return mntSabores;
	}

	public void setMntSabores(JMenuItem mntSabores) {
		this.mntSabores = mntSabores;
	}

	public JMenuItem getMntSalps() {
		return mntSalps;
	}

	public void setMntSalps(JMenuItem mntSalps) {
		this.mntSalps = mntSalps;
	}

	public JMenuItem getMntUsuarios() {
		return mntUsuarios;
	}

	public void setMntUsuarios(JMenuItem mntUsuarios) {
		this.mntUsuarios = mntUsuarios;
	}

	public JMenuItem getMntVisitas() {
		return mntVisitas;
	}

	public void setMntVisitas(JMenuItem mntVisitas) {
		this.mntVisitas = mntVisitas;
	}

	public JMenuItem getMntZonas() {
		return mntZonas;
	}

	public void setMntZonas(JMenuItem mntZonas) {
		this.mntZonas = mntZonas;
	}
}
