create database n3;
use n3;
create table planilla(
	ID  int (20) auto_increment primary key,
    CodigoNombre varchar (20),
	CodigoPuesto varchar (20),
    CodigoSueldo float  (20),
    extra float (20) ,
    CodigoComisiones float (20),
    bonificaciones  float (20),
    CodigoOtros float (20),
    iggs float (20) ,
    isr float (20) ,
     CodigoAnticipos float (20),
    CodigoDescuento float (20),
    CodigoOtros2 float (20),
     total float (20) ,
total2  float (20) ,
liquido float (20)
    )ENGINE=InnoDB;
    
 
create   table concepto (
IDconcepto int (20) auto_increment primary key,
  Codigoconcepto float (20),
  Codigonombre varchar (20),
  Codigostatus varchar (20),
  Codigonaturaleza float (20),
    tablaconcepto  varchar (20),
	CodigoPuesto varchar (20),
    extra float (20) ,
    CodigoComisiones float (20),
    bonificaciones  float (20),
   iggs float (20) ,
    isr float (20) ,
	CodigoAnticipos float (20),
    CodigoDescuento float (20),
    CodigoOtros2 float (20)
  
);
create   table concepto1 (
IDconcepto int (20) auto_increment primary key,

  Codigonombre varchar (20),
  Codigostatus varchar (20),
  Codigonaturaleza float (20),
	CodigoPuesto varchar (20)
);





no se pune
