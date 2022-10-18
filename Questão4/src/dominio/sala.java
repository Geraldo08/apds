package dominio;

public class sala {

private portaSala portaEntrada;
private float  metragemQuadrada;
private porta portaAuxiliar;


public portaSala getPortaEntrada() {
	return portaEntrada;
}
public void setPortaEntrada(portaSala portaEntrada) {
	this.portaEntrada = portaEntrada;
}
public float getMetragemQuadrada() {
	return metragemQuadrada;
}
public void setMetragemQuadrada(float metragemQuadrada) {
	this.metragemQuadrada = metragemQuadrada;
}
public porta getPortaAuxiliar() {
	return portaAuxiliar;
}
public void setPortaAuxiliar(porta portaAuxiliar) {
	this.portaAuxiliar = portaAuxiliar;
}


}
