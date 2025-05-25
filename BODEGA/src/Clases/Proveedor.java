package Clases;

public class Proveedor {
	private int idproveedor, ruc;
	private String nombreProveedor;
	public Proveedor(int idproveedor, int ruc, String nombreProveedor) {
		this.idproveedor = idproveedor;
		this.ruc = ruc;
		this.nombreProveedor = nombreProveedor;
	}
	public int getIdproveedor() {
		return idproveedor;
	}
	public void setIdproveedor(int idproveedor) {
		this.idproveedor = idproveedor;
	}
	public int getRuc() {
		return ruc;
	}
	public void setRuc(int ruc) {
		this.ruc = ruc;
	}
	public String getNombreProveedor() {
		return nombreProveedor;
	}
	public void setNombreProveedor(String nombreProveedor) {
		this.nombreProveedor = nombreProveedor;
	}
}
