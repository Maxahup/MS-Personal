package Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Personal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String rut;
    private String apellidos;
    private Integer anno_Servicios;
    private Integer sueldo_fijo;
    private double bonificacion_annos_servicios;
    private double bonificacion_horas_extras;
    private int sueldo_bruto;
    private double cotizacion_previsional;
    private double cotizacion_salud;
    private double sueldo_liquido;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getAnno_Servicios() {
        return anno_Servicios;
    }

    public void setAnno_Servicios(Integer anno_Servicios) {
        this.anno_Servicios = anno_Servicios;
    }

    public Integer getSueldo_fijo() {
        return sueldo_fijo;
    }

    public void setSueldo_fijo(Integer sueldo_fijo) {
        this.sueldo_fijo = sueldo_fijo;
    }

    public double getBonificacion_annos_servicios() {
        return bonificacion_annos_servicios;
    }

    public void setBonificacion_annos_servicios(double bonificacion_annos_servicios) {
        this.bonificacion_annos_servicios = bonificacion_annos_servicios;
    }

    public double getBonificacion_horas_extras() {
        return bonificacion_horas_extras;
    }

    public void setBonificacion_horas_extras(double bonificacion_horas_extras) {
        this.bonificacion_horas_extras = bonificacion_horas_extras;
    }

    public int getSueldo_bruto() {
        return sueldo_bruto;
    }

    public void setSueldo_bruto(int sueldo_bruto) {
        this.sueldo_bruto = sueldo_bruto;
    }

    public double getCotizacion_previsional() {
        return cotizacion_previsional;
    }

    public void setCotizacion_previsional(double cotizacion_previsional) {
        this.cotizacion_previsional = cotizacion_previsional;
    }

    public double getCotizacion_salud() {
        return cotizacion_salud;
    }

    public void setCotizacion_salud(double cotizacion_salud) {
        this.cotizacion_salud = cotizacion_salud;
    }

    public double getSueldo_liquido() {
        return sueldo_liquido;
    }

    public void setSueldo_liquido(double sueldo_liquido) {
        this.sueldo_liquido = sueldo_liquido;
    }
}
