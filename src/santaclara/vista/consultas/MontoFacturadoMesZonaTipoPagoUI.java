package santaclara.vista.consultas;

import java.awt.Component;
import java.awt.SystemColor;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.JButton;
import javax.swing.JTable;

import org.jdesktop.beansbinding.AutoBinding;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.swingbinding.JComboBoxBinding;
import org.jdesktop.swingbinding.JTableBinding;
import org.jdesktop.swingbinding.SwingBindings;

import com.toedter.calendar.JDateChooser;

import santaclara.Servicio.ServicioAlmacen;
import santaclara.controlador.consultas.ContMontoFacturadoMesZonaTipoPago;
import santaclara.modelo.Almacen;
import santaclara.modelo.Factura;
import santaclara.vista.herramientas.VistaGenericaUI;

import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.util.List;

@SuppressWarnings("serial")
public class MontoFacturadoMesZonaTipoPagoUI extends VistaGenericaUI{

	private JComboBox<Almacen> 		cmbAlmacen;
	@SuppressWarnings("rawtypes")
	private JTableBinding   binFacturas;
    private JButton btnAtras;
    private JLabel lblDesde;
    private JLabel lblHasta;
    private JLabel lblAlmacen;
    private JDateChooser dateDesde;
    private JDateChooser dateHasta;
    private JButton btnActualizar;
	
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public MontoFacturadoMesZonaTipoPagoUI(ContMontoFacturadoMesZonaTipoPago contListClienteTipoZona) throws NumberFormatException, IOException {
		super();

		/**********************************************************************************************************************************************************/
		dibujarPanelOpciones();
		dibujarPanelTabla();
	
		cmbAlmacen = new JComboBox<Almacen>();
		cmbAlmacen.setBackground(SystemColor.controlHighlight);
		cmbAlmacen.setRenderer(new ListCellRenderer() {
			@Override
			public Component getListCellRendererComponent(JList list, Object value,
				int index, boolean isSelected, boolean cellHasFocus) {
				// TODO Auto-generated method stub
				Almacen almacen = (Almacen) value;
				return new JLabel(almacen.getUbicacion());
			}
		});
		btnAtras = new JButton("Atras");
		btnAtras.setForeground(Color.WHITE);
		btnAtras.setFont(new Font("Dialog", Font.BOLD, 10));
		btnAtras.setBackground(Color.DARK_GRAY);
		getPnBotones().add(btnAtras);
		
		lblDesde = new JLabel("Desde");
		lblDesde.setForeground(Color.WHITE);
		getPnBotones().add(lblDesde);
		
		dateDesde = new JDateChooser();
		getPnBotones().add(dateDesde);
		
		lblHasta = new JLabel("Hasta");
		lblHasta.setForeground(Color.WHITE);
		getPnBotones().add(lblHasta);
		
		dateHasta = new JDateChooser();
		getPnBotones().add(dateHasta);
		
		lblAlmacen = new JLabel("Almacen");
		lblAlmacen.setForeground(Color.WHITE);
		getPnBotones().add(lblAlmacen);
		
		getPnBotones().add(cmbAlmacen);
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(contListClienteTipoZona.Actualizar());
		btnActualizar.setBackground(Color.DARK_GRAY);
		btnActualizar.setForeground(Color.WHITE);
		getPnBotones().add(btnActualizar);
	}


    @SuppressWarnings({ "rawtypes", "unchecked" })
	public void activarBinding(List<Factura> Facturas) {
		// TODO Auto-generated method stub
		setTable(new JTable());
		getScrollPanel().setViewportView(getTable());
		binFacturas = SwingBindings.createJTableBinding(AutoBinding.UpdateStrategy.READ_WRITE,Facturas,getTable());
	    
	    BeanProperty idFactura  = BeanProperty.create("id");
	    BeanProperty fecha  = BeanProperty.create("fechaCadenaStr");
	    BeanProperty almacen = BeanProperty.create("almacen.ubicacion");
	    BeanProperty zonaDescripcion = BeanProperty.create("cliente.ruta.zona.descripcion");
	    BeanProperty tipoPago = BeanProperty.create("tipoPagoCreditoContado");
	    BeanProperty monto = BeanProperty.create("totalAPagar");
	    

	    binFacturas.addColumnBinding(idFactura).setColumnClass(String.class).setColumnName("Nro Factura");
	    binFacturas.addColumnBinding(fecha).setColumnClass(String.class).setColumnName("Fecha");
	    binFacturas.addColumnBinding(almacen).setColumnClass(String.class).setColumnName("Almacen");
	    binFacturas.addColumnBinding(zonaDescripcion).setColumnClass(String.class).setColumnName("Zona");
	    binFacturas.addColumnBinding(tipoPago).setColumnClass(String.class).setColumnName("Tipo Pago");
	    
	    binFacturas.addColumnBinding(monto).setColumnClass(String.class).setColumnName("Monto");
	    
	    binFacturas.bind();
	}
   
    @SuppressWarnings("rawtypes")
   	public void cargarCmbAlmacen() throws NumberFormatException, IOException{
       	List<Almacen> almacenes = new ServicioAlmacen().getAlmacenes();
       	Almacen almacen = new Almacen(0,"Todos");
       	almacenes.add(almacen);
       	JComboBoxBinding jcomboAlmacen = SwingBindings.createJComboBoxBinding(AutoBinding.UpdateStrategy.READ,almacenes,cmbAlmacen);
   	    
   	    jcomboAlmacen.bind();
       }
    
	public JComboBox<Almacen> getCmbAlmacen() {
		return cmbAlmacen;
	}


	public void setCmbAlmacen(JComboBox<Almacen> cmbAlmacen) {
		this.cmbAlmacen = cmbAlmacen;
	}


	public JDateChooser getDateDesde() {
		return dateDesde;
	}


	public void setDateDesde(JDateChooser dateDesde) {
		this.dateDesde = dateDesde;
	}


	public JDateChooser getDateHasta() {
		return dateHasta;
	}


	public void setDateHasta(JDateChooser dateHasta) {
		this.dateHasta = dateHasta;
	}

    
}


