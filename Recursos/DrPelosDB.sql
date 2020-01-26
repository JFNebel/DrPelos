show databases;
use diseñosoftware;


Create table usuario(
cedula int PRIMARY KEY,
    nombre varchar(50),
    usu varchar(50),
    contraseña varchar(50)

);
CREATE TABLE Cliente(
	cedula varchar(20) PRIMARY KEY,
    nombre varchar(50),
    correo varchar(50),
    celular varchar(15),
    telefono varchar(15),
    direccion varchar(250)
);
CREATE TABLE JefeBodega(
	cedula int PRIMARY KEY,
    nombre varchar(50),
    correo varchar(50),
    telefono int,
    contrasena varchar(50)
);

CREATE TABLE Producto(
	nombre varchar(50) PRIMARY KEY,
    descripcion varchar(50),
    precioUnitario int,
    cantidadInventario int,
    categoria varchar(50)
);




CREATE TABLE Servicio(
	idServicio int PRIMARY KEY,
    descripcion varchar(250),
    precioUnitario int
);

CREATE TABLE TipoPago(
	idPago int PRIMARY KEY,
    descripcion varchar(250)
);

CREATE TABLE Administrador(
	cedula int PRIMARY KEY,
    nombre varchar(50),
    correo varchar(50),
    telefono int,
    contrasena varchar(50)
);

CREATE TABLE DirectivoEmpresa(
	cedula int PRiMARY KEY,
    nombre varchar(50),
    telefono int,
    correo varchar(50),
    contrasena varchar(50)
);

CREATE TABLE PedidoCentral(
	idPedido int PRIMARY KEY,
    fechaEmision date,
    jefebodega int,
	foreign key(jefebodega) references JefeBodega(cedula)
);
#    foreign key(idPedido) references DetallePedido(idPedido)
CREATE TABLE DetallePedido(
	idDetalle int PRIMARY KEY,
    idProducto int,
    idPedido int,
    cantidad int,
    descripcion varchar(50),
    foreign key(idProducto) References Producto(idProducto)
);

CREATE TABLE Sucursal(
	idSurcusal int PRIMARY KEY,
    nombre varchar(50),
    telefono int,
    direccion varchar(250),
    jefeBodega int,
    foreign key(jefeBodega) References JefeBodega(cedula),
	esMatrizCentral boolean,
    administrador int,
    foreign key(administrador) References Administrador(cedula)
);

CREATE TABLE PersonalCaja(
	cedula int PRIMARY KEY,
	nombre varchar(50),
    correo varchar(50),
    telefono int,
    contrasena varchar(20),
	sucursal int,
    foreign key(sucursal) References Sucursal(idSurcusal) 
    );

CREATE TABLE Factura(
	idFactura int PRIMARY KEY,
    fechaEmision date,
    sucursal int,
    cliente int,
    foreign key(cliente) References Cliente(cedula),
	usuarioEmisor int,
    foreign key(usuarioEmisor) References PersonalCaja(cedula),
	tipoPago int,
    foreign key(tipoPago) References TipoPago(idPago),
    iva int,
    totalPagar int
);

CREATE TABLE DetalleVenta(
	idDetalle int PRIMARY KEY,
    cantidad int,
    descripcion varchar(250),
    idProducto int,
    foreign key(idProducto) References Producto(idProducto), 
	idServicio int,
    foreign key (idServicio) References Servicio(idServicio),
	venta int,
    foreign key(venta) References Factura(idFactura)
);








